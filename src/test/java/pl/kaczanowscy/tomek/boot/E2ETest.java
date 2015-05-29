package pl.kaczanowscy.tomek.boot;

import com.github.fge.jsonschema.SchemaVersion;
import com.github.fge.jsonschema.cfg.ValidationConfiguration;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.jayway.restassured.module.jsv.JsonSchemaValidator;
import com.jayway.restassured.module.jsv.JsonSchemaValidatorSettings;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.web.bind.annotation.RequestParam;
import pl.kaczanowscy.tomek.boot.rest.Document;

import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

@SpringApplicationConfiguration(classes = Boot.class)
@WebIntegrationTest
public class E2ETest extends AbstractJUnit4SpringContextTests {

    @Autowired
    DocumentRepository documentRepository;

    @Test
    public void shouldFindSomething() {
        documentRepository.store(new Document("title"));
        get("/search/title").then().body("documents[0].title", equalTo("title"));
    }

    @Test
    public void schema() {
        System.out.println(get("/search/title").body().print());
        JsonSchemaFactory jsonSchemaFactory = JsonSchemaFactory.newBuilder().setValidationConfiguration(ValidationConfiguration.newBuilder().setDefaultVersion(SchemaVersion.DRAFTV4).freeze()).freeze();
        JsonSchemaValidatorSettings settings = JsonSchemaValidatorSettings.settings().checkedValidation(false);

        get("/search/title").then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("json/search-schema.json").using(settings));
    }
}
