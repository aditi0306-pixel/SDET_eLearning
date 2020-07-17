package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.wrapper;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class elearning_teacher {
	static WebDriver driver;
	
	@Given("^I open the browser and enter the URL \"([^\"]*)\"$")
	public void i_open_the_browser_and_enter_the_URL(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		 System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
    	 driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get(url);
	    
	}

	@Then("^I enter the username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_the_username_and_password(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(username);	 
	driver.findElement(By.cssSelector("input[placeholder='Pass']")).sendKeys(password);	 
	
	    
	}

	@And("^I click on Login button$")
	public void i_click_on_Login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	    
	}

	@Given("^I click on  'Create a course' link after login$")
	public void i_click_on_Create_a_course_link_after_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.linkText("Create a course")).click();
	  
	}

	@Then("^I enter valid credentials in Course name textbox \"([^\"]*)\"$")
	public void i_enter_valid_credentials_in_Course_name_textbox(String coursename) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input[id='title']")).sendKeys(coursename);
	   
	}

	@Then("^I click on Advance Settings Button$")
	public void i_click_on_Advance_Settings_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("button[id='advanced_params']")).click();
	   
	}

	@Then("^I select valid credentials from Category list box$")
	public void i_select_valid_credentials_from_Category_list_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		WebElement category = driver.findElement(By.cssSelector("select[id='add_course_category_code']"));
		Select sel = new Select(category);
		sel.selectByVisibleText("Projects (PR001)");
		
	
	}

	@Then("^I enter valid credentials in Course code text box \"([^\"]*)\"$")
	public void i_enter_valid_credentials_in_Course_code_text_box(String coursecode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.cssSelector("input[id='add_course_wanted_code']")).sendKeys(coursecode);
	  
	}

	@Then("^I select valid credentials from Language list box$")
	public void i_select_valid_credentials_from_Language_list_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement language = driver.findElement(By.cssSelector("select[id='add_course_course_language']"));
		Select sel = new Select(language);
		sel.selectByVisibleText("English");
	  
	}

	@Then("^I click on Create this course button$")
	public void i_click_on_Create_this_course_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("button[id='add_course_submit']")).click();
	   
	}

	@Given("^I click on Add an introduction icon$")
	public void i_click_on_Add_an_introduction_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("a[title='Add an introduction text']")).click();
	   
	}

	@Then("^I give valid credentials in the textbox \"([^\"]*)\"$")
	public void i_give_valid_credentials_in_the_textbox(String text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(10000);
		WebElement iframe = driver.findElement(By.xpath("//div[@class='cke_contents cke_reset']//following::iframe"));
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
		
		driver.findElement(By.cssSelector("body[class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).click();
		driver.findElement(By.cssSelector("body[class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys(text);
		
		driver.switchTo().defaultContent();
		
	    
	}

	@And("^I click on Save button$")
	public void i_click_on_Save_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	   
	}

	@When("^I click on Course Description icon$")
	public void i_click_on_Course_Description_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.cssSelector("img[title='Course description']")).click();
	  
	}

	@And("^I click on Description icon$")
	public void i_click_on_Description_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.cssSelector("img[title='Description']")).click();
	 
	}

	@Then("^I enter valid credentials in Title textbox \"([^\"]*)\"$")
	public void i_enter_valid_credentials_in_Title_textbox(String title) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.cssSelector("input[id='course_description_title']")).sendKeys(title);
	    
	}

	@And("^I enter valid credentials in Content textbox \"([^\"]*)\"$")
	public void i_enter_valid_credentials_in_Content_textbox(String text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(10000);
		WebElement iframe = driver.findElement(By.xpath("//div[@class='cke_contents cke_reset']//following::iframe"));
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
		
		driver.findElement(By.cssSelector("body[class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).click();
		driver.findElement(By.cssSelector("body[class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys(text);
		
		driver.switchTo().defaultContent();
	   
	}

	@And("^I click on save button$")
	public void i_click_on_save_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.cssSelector("button[id='course_description_submit']")).click();
	}

	@When("^I click on Objectives icon$")
	public void i_click_on_Objectives_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.cssSelector("img[title='Objectives']")).click();
	  
	}

	@Then("^I click on Topics icon$")
	public void i_click_on_Topics_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.cssSelector("img[title='Topics']")).click();
	}
		
		
		@Given("^I open the browser and enter the URL$")
		public void i_open_the_browser_and_enter_the_URL() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			 System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
	    	 driver = new ChromeDriver();
	    	 driver.manage().window().maximize();
	    	 driver.get(wrapper.getDataFromExcel(1,0));
		    
		}

		@Then("^I enter the username and password$")
		public void i_enter_the_username_and_password() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			
			driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(wrapper.getDataFromExcel(1,1));	 
			driver.findElement(By.cssSelector("input[placeholder='Pass']")).sendKeys(wrapper.getDataFromExcel(1,2));	
		    
		}

		@Then("^I enter valid credentials in Course name textbox$")
		public void i_enter_valid_credentials_in_Course_name_textbox() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.cssSelector("input[id='title']")).sendKeys(wrapper.getDataFromExcel(1,3));
		   
		}

		@Then("^I enter valid credentials in Course code text box$")
		public void i_enter_valid_credentials_in_Course_code_text_box() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.cssSelector("input[id='add_course_wanted_code']")).sendKeys(wrapper.getDataFromExcel(1,4));
		    
		}

		@Then("^I give valid credentials in the textbox$")
		public void i_give_valid_credentials_in_the_textbox() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			
			Thread.sleep(10000);
			WebElement iframe = driver.findElement(By.xpath("//div[@class='cke_contents cke_reset']//following::iframe"));
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
			
			driver.findElement(By.cssSelector("body[class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).click();
			driver.findElement(By.cssSelector("body[class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys(wrapper.getDataFromExcel(1,5));
			
			driver.switchTo().defaultContent();
		   
		}

		@Then("^I enter valid credentials in Title textbox$")
		public void i_enter_valid_credentials_in_Title_textbox() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.cssSelector("input[id='course_description_title']")).sendKeys(wrapper.getDataFromExcel(1,6));
		  
		}

		@Then("^I enter valid credentials in Content textbox$")
		public void i_enter_valid_credentials_in_Content_textbox() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			
			Thread.sleep(10000);
			WebElement iframe = driver.findElement(By.xpath("//div[@class='cke_contents cke_reset']//following::iframe"));
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
			
			driver.findElement(By.cssSelector("body[class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).click();
			driver.findElement(By.cssSelector("body[class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys(wrapper.getDataFromExcel(1,7));
			
			driver.switchTo().defaultContent();
		
		}



	



}
