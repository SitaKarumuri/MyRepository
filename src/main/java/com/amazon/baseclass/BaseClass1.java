package com.amazon.baseclass;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass1 {
	public static WebDriver driver;

	public static WebDriver getBrowser(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));
				driver = new ChromeDriver();

			} else if (browsername.equalsIgnoreCase("gecko")) {
				System.setProperty("webdriver.gecko.driver", ".//geckodriver.exe");
				// driver = new FirefoxDriver();

			} else {
				System.out.println("Invalid BrowserName");

			}

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return driver;

	}

	public static void waitforElementVisibility(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOf(element));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void getUrl(String Url) {
		try {
			driver.get(Url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void inputValuestoElement(WebElement element, String value) {//
		waitforElementVisibility(element);
		try {
			element.sendKeys(value);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickonElement(WebElement element) {
		waitforElementVisibility(element);
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void selectDropDown(WebElement element, String value, String option) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);

		} else if (option.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(value);
		} else if (option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		}

	}

	public static void moveToElement(WebElement element) {
		waitforElementVisibility(element);
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).perform();
			WebElement e = driver.findElement(By.xpath("Locator Value"));
			Actions actionseries = new Actions(driver);
			Action action = (Action) actionseries.moveToElement(e);
			action.perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void switchToFrameUsing(String option, int index) {
		try {
			if (option.equalsIgnoreCase("id")) {
				driver.switchTo().frame(index);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void switchToFrameUsingName(String option, String name) {
		try {
			if (option.equalsIgnoreCase("Framename")) {
				driver.switchTo().frame(name);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void getScreenshot(String filename) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File srcfile = ts.getScreenshotAs(OutputType.FILE);
			File desfile = new File(System.getProperty("user.dir" + "\\Screenshot\\" + filename + ".png"));
			FileUtils.copyFile(srcfile, desfile);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
