package teste;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAutomacao {

	// instanciando a classe WebDriver
		static WebDriver driver;

		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
			// aqui diremos onde esta o executavel
			System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");

			driver = new ChromeDriver();

			driver.get("www.automationpractice.com");

		}

		@Test
		public void test() {
			fail("Not yet implemented");
		}

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
			// fecha apenas a aba que usou
			//driver.close();

			//fecha o browser com todas as abas
			//driver.quit();
			
		}
}
