import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configuramos la ubicación del driver de chrome
		System.setProperty("webdriver.chrome.driver", "/Users/cesarcueva/Documents/projects/personal/cursoSelenium/chromedriver");
		//webdriver.gecko.driver --> para firefox
		//webdriver.ie.driver --> para IE
		
		//Create drive object to chrome browser
		WebDriver driver = new ChromeDriver();
		//Hacemos un get a google
		driver.get("http://google.com");
		//Imprimimos el titulo de la pagina
		System.out.println(driver.getTitle());
		
	}

}
