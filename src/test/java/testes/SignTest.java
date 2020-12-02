package testes;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignTest {
    @Test
    public void testeFazerLoginNoTaskit(){
    System.setProperty("webdriver.chrome.driver", "webdriver\\chromedriver.exe");

        //Instanciando drive
        WebDriver navegador = new ChromeDriver();

        //Adicionando tempo que o navegador irá esperar o elemento aparecer
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Abrindo navegador
        navegador.get("http://www.juliodelima.com.br/taskit");

        //Buncando elemento e clicando
        navegador.findElement(By.linkText("Sign in")).click();

        //Logando na pagina
        navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys("gideone1");
        navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys("12345");
        navegador.findElement(By.linkText("SIGN IN")).click();

        //Testando se a mensagem inicial da pagina está correta
        String saudacao = navegador.findElement(By.className("me")).getText();
        Assert.assertEquals("Hi, Gideone", saudacao);

        //Fechando navegador após teste terminar
        navegador.quit();
    }
}
