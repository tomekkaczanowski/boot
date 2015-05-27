package pl.kaczanowscy.tomek.boot;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import pl.kaczanowscy.tomek.boot.web.HelloWorldController;

@SpringApplicationConfiguration(classes = Boot.class)
@WebIntegrationTest
public class E2ETest extends AbstractJUnit4SpringContextTests {

    @Autowired
    HelloWorldController helloWorldController;

    @Test
    public void shouldFindSomething() {
        populateDatabase();
        callRESTSearchAPI();
        verifyResults();
        System.out.println(helloWorldController.home());
    }

    private void verifyResults() {
        // TODO
    }

    private void callRESTSearchAPI() {
        // TODO
    }

    private void populateDatabase() {
        // TODO
    }
}
