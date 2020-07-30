package Pages;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoesPage {

	WebDriver driver;

	public void abrirSite(String site) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();

	}

	public void pesquisaProduto(String texto) throws InterruptedException {
		Thread.sleep(3000);
		WebElement pesquisa = driver.findElement(By.xpath("//*[@id=\"search-input\"]"));
		pesquisa.sendKeys(texto);
		pesquisa.submit();
	}

	public void escolherProduto() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/main/section/section[2]/div[2]/div[1]/div[2]")).click();
	}

	public void adicionarCarrinho(String tamanho) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(
				By.cssSelector("#buy-box > section.product-size-selector > div > ul > li:nth-child(" + tamanho + ")"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.id("buy-button-now")).click();
		Thread.sleep(3000);
	}

	public void clickLancamento() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"header-content\"]/div[2]/div/section/nav/ul/li[1]/a")).click();
		Thread.sleep(3000);
	}

	public void validandoLancamento() throws InterruptedException {
		Thread.sleep(3000);
		String lanca = driver.findElement(By.xpath("//*[@id=\"content\"]/section/section[2]/div[1]/div/div/ul/li/a"))
				.getText();
		assertEquals("Lançamentos", lanca);
		Thread.sleep(3000);
	}

	public void excluindoProduto() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/i")).click();
		Thread.sleep(3000);
	}

	public void carrinhoVazio() throws InterruptedException {
		Thread.sleep(3000);
		String carrinho = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/h1")).getText();
		assertEquals("Carrinho", carrinho);
		Thread.sleep(3000);
	}

	public void clickSapatos() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"header-content\"]/div[2]/div/section/nav/ul/li[2]")).click();
		Thread.sleep(3000);
	}

	public void validandoSapatos() throws InterruptedException {
		Thread.sleep(3000);
		String sapatos = driver.findElement(By.xpath("//*[@id=\"content\"]/section/section[2]/h1")).getText();
		assertEquals(" Feminino - Calçados", sapatos);
		Thread.sleep(3000);
	}

	public void clickBolsas() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"header-content\"]/div[2]/div/section/nav/ul/li[3]")).click();
		Thread.sleep(3000);
	}

	public void validandoBolsas() throws InterruptedException {
		Thread.sleep(3000);
		String bolsas = driver.findElement(By.xpath("//*[@id=\"content\"]/section/section[2]/h1")).getText();
		assertEquals("Bolsas Feminino", bolsas);
	}

}
