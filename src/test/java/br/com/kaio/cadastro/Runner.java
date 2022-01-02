package br.com.kaio.cadastro;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty",
				features = "src/test/java",
				monochrome = true,
				publish = true,
				tags = "@CadastroComSucesso")

public class Runner {

}

