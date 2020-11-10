import com.github.cukedoctor.CukedoctorMain;
import com.github.cukedoctor.util.FileUtil;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        plugin = {"json:target/cucumber.json", "pretty"})
public class CucumberIntegrationVintageTest {

    @AfterClass
    public static void generateDocumentation() {
        CukedoctorMain main = new CukedoctorMain();
        main.execute(new String[]{
                "-o", "\"target/cucumber\"",
                "-p", "\"target/cucumber.json\"",
                "-t", "Living Documentation",
                "-f", "all",
                "-toc", "left",
                "-numbered",
                "-sourceHighlighter", "coderay"
        });

        File generatedFile = FileUtil.loadFile("target/document-one.html");
        assertThat(Files.exists(Paths.get("target/cucumber.html"))).isTrue();
        assertThat(Files.exists(Paths.get("target/cucumber.pdf"))).isTrue();
    }
}