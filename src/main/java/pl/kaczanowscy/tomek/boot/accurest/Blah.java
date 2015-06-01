package pl.kaczanowscy.tomek.boot.accurest;

import io.codearte.accurest.TestGenerator;
import io.codearte.accurest.config.AccurestConfigProperties;

import java.io.File;

public class Blah {

    public static void main(String[] args) {
        AccurestConfigProperties props = new AccurestConfigProperties();
//        props.setGeneratedTestSourcesDir(new File("target/generated_tests"));
//        props.setStubsOutputDir(new File("target/stubs"));
        props.setContractsDslDir(new File("src/test/resources/stubs/"));
        props.setBasePackageForTests("pl.kaczanowscy.tomek.boot");
        props.setStubsOutputDir(new File("src/test/resources/stubsoutput"));
        props.setGeneratedTestSourcesDir(new File("src/test/resources/testgenerated"));
        TestGenerator generator = new TestGenerator(props);
        int result = generator.generate();
        System.out.println(result);
    }
}
