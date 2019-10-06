package stepdefinations;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.DiscoveryUtill;
import utility.driverInitialise;

public class AppiumScenario {
	Actions action = null;
	DiscoveryUtill utill ;
	HashMap<String, String> s;
public WebDriver driver;
	
	public AppiumScenario() {
		this.driver = driverInitialise.getDriver();
		utill = new DiscoveryUtill(driver);
	}
	
	
	@Given("^https://go\\.discovery\\.com/$")
	public void https_go_discovery_com() throws Throwable {
		driver.get("https://go.discovery.com/");
		utill.waitForPageLoad();
	}

	@When("^title of Home page is Discovery - Official Site$")
	public void title_of_Home_page_is_Discovery_Official_Site() throws Throwable {
	   String pageTitle=driver.getTitle();
	   System.out.println("title is"+pageTitle);
	   Assert.assertEquals(pageTitle, "Discovery - Official Site","Page title mismatch");
	}

	@Then("^scroll home page to RECOMMENDED FOR YOU categories$")
	public void scroll_home_page_to_RECOMMENDED_FOR_YOU_categories() throws Throwable {
	   utill.scrollToElement("//div[.='Recommended']", "xpath");
	}

	@Then("^check number of videos more than two$")
	public void check_number_of_videos_more_than_two() throws Throwable {
		List<WebElement> noOfVideos= driver.findElements
	    		(By.xpath("//div[.='Recommended']/../following-sibling::div/div/div/div/div/section[@class='tile showTileSquare__main transition-in']"));
			int count = noOfVideos.size();
	    Assert.assertTrue(count>2,"no of videos is less than 2");
	    
	}

	/*@Then("^get titles and description for two videos$")
	public void get_titles_and_description_for_two_videos() throws Throwable {
		utill.setGetTitleDescriptionHomePage(utill.getHomePageTitleDescription());
	 System.out.println("++++++++++++++++++"+utill.getGetTitleDescriptionHomePage());
	}*/

	@Then("^get titles and description for two videos and add videos to favorites$")
	public void add_videos_to_favorites() throws Throwable {
		 /*for(int i=1;i<2;i++) {
		    	
		    	List<WebElement> noOfVideos= driver.findElements
			    		(By.xpath("//div[.='Recommended']/../following-sibling::div/div/div/div/div/section[@class='tile showTileSquare__main transition-in']"));
		    	System.out.println("-------"+utill.getNoOfVideos().size());
		    	System.out.println("-------"+utill.getNoOfVideos().get(0));
		    	//Thread.sleep(2000);
				//action.moveToElement(driver.findElement(By.xpath("(//div[.='Recommended']/../following-sibling::div/div/div/div/div/section[@class='tile showTileSquare__main transition-in'])["+i+"]"))).build().perform();
		    	//action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/section[8]/div[1]/div[1]/div[1]/div[1]/div["+ i + "]/section[1]/div[3]/a[1]/div[1]/div[2]/div[1]/span[1]/i[1]"))).build().perform();
		    	Thread.sleep(3000);
		    	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/section[8]/div[1]/div[1]/div[1]/div[1]/div["+ 
		    			i+"]/section[1]/div[3]/a[1]/div[1]/div[2]/div[1]/span[1]/i[1]")).click();
				Thread.sleep(3000);

		    }*/
		s=utill.getHomePageTitleDescription();
		System.out.println("home.........."+s);
	}

	@Then("^navigate to My videos page$")
	public void navigate_to_My_videos_page() throws Throwable {
	    driver.get("https://go.discovery.com/my-videos");
	    utill.waitForPageLoad();
	    String pageTitle=driver.getTitle();
		Assert.assertEquals(pageTitle, "My Videos | Discovery");
		
	}

	@Then("^validate title and description of both videos$")
	public void validate_title_and_description_of_both_videos() throws Throwable {
		utill.scrollToElement("//h2[contains(text(),'Favorite Shows')]", "xpath");
		HashMap<String, String> s1=utill.getFavoriteShowsTitleDescription();
		System.out.println("fav........"+s1);
		Assert.assertEquals(s, s1);
	}
	
}
