package br.com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "br.com..steps",
        tags = "@Mobile_App_RecuperacaoSenha_004",
        plugin = {
                "pretty",
                "html:reports/evd/cucumber.html",
                "json:target/cucumber.json",
                "junit:reports/evd/cucumber.xml"
        }
)
public class RunnerTest {
        public static String plataforma = "ios";
        public static String tag = "Mobile_App_RecuperacaoSenha_004";
}