package br.com.kaio.cadastroinvalido;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty",
				features = "src/test/java/features",
				monochrome = true,
				publish = true,
				tags = "@CadastroComEmailJaCadastrado"
				)
public class RunnerCadastroInvalido {

}
