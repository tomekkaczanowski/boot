package pl.kaczanowscy.tomek.boot;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import pl.kaczanowscy.tomek.boot.rest.Document;

import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.core.IsEqual.equalTo;

@SpringApplicationConfiguration(classes = Boot.class)
@WebIntegrationTest
public class E2ETest extends AbstractJUnit4SpringContextTests {

    @Autowired
    DocumentRepository documentRepository;

    @Test
    public void shouldFindSomething() {
        documentRepository.store(new Document("title"));
//        String json = get("/search").asString();
        get("/search").then().body("documents[0].title", equalTo("title"));
    }
}
