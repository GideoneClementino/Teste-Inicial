package testes;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignTest {
    @Test
    public void testeFazerLoginNoTaskit(){
    System.setProperty("webdriver.chrome.driver", "webdriver\\chromedriver.exe");

        //Instanciando drive
        WebDriver navegador = new ChromeDriver();

        //Abrindo navegador
        navegador.get("http://www.juliodelima.com.br/taskit");

        //Buncando elemento e clicando
        navegador.findElement(By.linkText("Sign in")).click();

        navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys("gideone1");
        navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys("12345");

        navegador.findElement(By.linkText("SIGN IN")).click();
    }
}
