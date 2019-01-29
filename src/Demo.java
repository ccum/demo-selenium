import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//facebook1();
		//salesforce();
		xpath();

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
	private static void salesforce() {
		System.setProperty("webdriver.chrome.driver", "/home/cesarcueva/Documents/web-drivers/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("hello");
		//driver.findElement(By.className("button r4 wide primary")).click(); ---> error
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		//$("div#error.loginError");  --> validacion
		// //tagName[@attribure='value'] --> xpath syntax //*[@id='Login'] 
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
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
		//$x("//*[@id='Login']") VALIDATE XPATH
		
	}
	private static void xpath() {
		System.setProperty("webdriver.chrome.driver", "/home/cesarcueva/Documents/web-drivers/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		// //tagName[@attribure='value'] --> xpath syntax //*[@id='Login'] 
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("HOLLLL");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hhhh");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
	}
	private static void cssSelector() {
		System.setProperty("webdriver.chrome.driver", "/home/cesarcueva/Documents/web-drivers/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		// //tagName[attribure='value'] --> css syntax
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("EEEEE");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("peee");
		driver.findElement(By.cssSelector("value='Log In'")).click();
		

	}
	private static void tagnameAndCSS() {
		System.setProperty("webdriver.chrome.driver", "/home/cesarcueva/Documents/web-drivers/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		// tagName#id - css
		// tagName.classname - css
		driver.findElement(By.cssSelector("input#username")).sendKeys("sassdas");
		// tagName[contains(@attribute,'value')] -- para regular expression
		//input[contains(@name,'username')]
		//tagName[attribute*='value'] -- para regular expression en CSS
		
	}

}
