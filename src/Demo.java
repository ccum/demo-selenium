import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		facebook1();
		//salesforce();

	}

	private static void salesforce() {
		System.setProperty("webdriver.chrome.driver", "/home/cesarcueva/Documents/web-drivers/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("hello");
		//driver.findElement(By.className("button r4 wide primary")).click(); ---> error
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
	}

	private static void facebook1() {
		System.setProperty("webdriver.chrome.driver", "/home/cesarcueva/Documents/web-drivers/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		//driver.findElement(By.id("email")).sendKeys("mi email");
		driver.findElement(By.cssSelector("#email")).sendKeys("mi email");
		//driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("123456");
		//driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
	}

	private static void demo01() {
		//configuramos la ubicación del driver de chrome
		System.setProperty("webdriver.chrome.driver", "/home/cesarcueva/Documents/web-drivers/chromedriver_linux64/chromedriver");
		//webdriver.gecko.driver --> para firefox
		//webdriver.ie.driver --> para IE
		
		//Create drive object to chrome browser
		WebDriver driver = new ChromeDriver();
		//Hacemos un get a google
		driver.get("http://google.com");
		//Imprimimos el titulo de la pagina
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		driver.get("http://yahoo.com");
		driver.navigate().back(); //navegar a la pagina anterior
		driver.close();//cierre el browser actuial
		//driver.quit();//cierra tosas los brouwser abiertos
	}

}
