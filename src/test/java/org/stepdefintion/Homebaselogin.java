package org.stepdefintion;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.BaseandPojo.Baseclass;
import org.BaseandPojo.PojoHomebase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Homebaselogin extends Baseclass{
	PojoHomebase p;
	
	@Given("to launch the browser")
	public void to_launch_the_browser() {
	    p=new PojoHomebase();
	    launchBrowser("Chrome");
	    
	}

	@When("to launch url of homebase")
	public void to_launch_url_of_homebase() {
		p=new PojoHomebase();
	    launchUrl("https://www.homebase.co.uk/");
	    
	}

	@When("to click sign in option")
	public void to_click_sign_in_option() {
		p=new PojoHomebase();
		clickBtn(p.getLoginoption());
		
		
	}

	@When("to give invalid user {string}id")
	public void to_give_invalid_user_id(String em) {
	   p=new PojoHomebase();
	   passTxt(p.getEmailbox(), em);
	}

	@When("to give invalid {string}password")
	public void to_give_invalid_password(String pa) {
		p=new PojoHomebase();
		passTxt(p.getPasswrdbox(), pa);
	}

	@When("to click the sign in button")
	public void to_click_the_sign_in_button() {
		p=new PojoHomebase();
		clickBtn(p.getSubmit());
	}
// to check menu options and add one product to cart	
	
	@Given("to launch the url")
	public void to_launch_the_url() {
	   p=new PojoHomebase();
	   launchUrl("https://www.homebase.co.uk/");
	}

	@When("to move to particular menu")
	public void to_move_to_particular_menu() throws InterruptedException {
	    p=new PojoHomebase();
	    
	    
	    Thread.sleep(12000);
	    mouseOver(p.getMenuopt());
	    Thread.sleep(12000);
	    mouseOver(p.getLighting());
	    
	    
	}

	@When("to click one option in that menu")
	public void to_click_one_option_in_that_menu() throws InterruptedException {
	   p=new PojoHomebase();
	   Thread.sleep(2000);
	   clickJavascriptBtn(p.getLamp());
	   
	}

	@When("to click one product in that list")
	public void to_click_one_product_in_that_list() {
	   p=new PojoHomebase();
	   clickBtn(p.getProduct());
	}

	@When("to add it cart")
	public void to_add_it_cart() {
	   p=new PojoHomebase();
	   clickBtn(p.getCart());
	   clickJavascriptBtn(p.getViewbasket());
	}
	
	// search option checking
	
	@Given("to launch the browser for searching")
	public void to_launch_the_browser_for_searching() {
	    p=new PojoHomebase();
	    launchBrowser("Chrome");
	}
	@When("to give pass input in serach box")
	public void to_give_pass_input_in_serach_box(io.cucumber.datatable.DataTable d) throws InterruptedException {
	  p=new PojoHomebase();
	  Thread.sleep(5000);
	  List<String> l1 = d.asList();
	  passTxt(p.getInputsearch(), l1.get(1));
	}

	@When("to click search button")
	public void to_click_search_button() {
		p=new PojoHomebase();
		clickJavascriptBtn(p.getClickserbut());
	   
	}
	
	//to check signup page
	@Given("to click account button")
	public void to_click_account_button() {
	   p=new PojoHomebase();
	   mouseOver(p.getAccbtn());
	}

	@When("to click register button")
	public void to_click_register_button() {
	    p=new PojoHomebase();
	    clickBtn(p.getRegisterbutton());
	    
	}

	@When("to fill sign up data")
	public void to_fill_sign_up_data() {
	    p=new PojoHomebase();
	    passTxt(p.getFullname(), "jai tharan");
	    passTxt(p.getEmailtext(), "2454656er@hotmail.com");
	    passTxt(p.getConfirmtext(),"2454656er@hotmail.com" );
	    clickJavascriptBtn(p.getRadio());
	}

	@When("to click sumbit button")
	public void to_click_sumbit_button() {
	   p=new PojoHomebase();
	   clickBtn(p.getFinish());
	}


	// to check youtube option
	
	@Given("to launch browser for checking the youtube option")
	public void to_launch_browser_for_checking_the_youtube_option() {
	   p=new PojoHomebase();
	   launchBrowser("Chrome");
	   launchUrl("https://www.homebase.co.uk/");
	}

	@Given("to click youtube option")
	public void to_click_youtube_option() throws InterruptedException {
	   p=new PojoHomebase();
	   Thread.sleep(5000);
	   clickJavascriptBtn(p.getYoutubebut());
	}

	@Given("to came back from you tube to main website by window handling")
	public void to_came_back_from_you_tube_to_main_website_by_window_handling() {
	   String parwin = driver.getWindowHandle();
	   Set<String> allwin = driver.getWindowHandles();
	   for (String itr : allwin) {
		   
		   if(itr !=parwin) {
			   driver.switchTo().window(parwin);
		   }
		
	}
	}

	@Given("to click insta button in website")
	public void to_click_insta_button_in_website() throws InterruptedException {
	   p=new PojoHomebase();
	   Thread.sleep(2000);
	   clickJavascriptBtn(p.getInstabuttton());
	}


	// add or sub product
	
	@Given("to launch the browser for checking addition and subtraction")
	public void to_launch_the_browser_for_checking_addition_and_subtraction() {
	   launchBrowser("Chrome");
	}

	@Given("to launch url for checking add and subtract")
	public void to_launch_url_for_checking_add_and_subtract() {
	    launchUrl("https://www.homebase.co.uk/");
	}

	@When("to click a particular product and go to buy page")
	public void to_click_a_particular_product_and_go_to_buy_page() throws InterruptedException {
		 p=new PojoHomebase();
		    
		    
		    Thread.sleep(12000);
		    mouseOver(p.getMenuopt());
		    Thread.sleep(12000);
		    mouseOver(p.getLighting());
		    Thread.sleep(2000);
			   clickJavascriptBtn(p.getLamp());
			   clickBtn(p.getProduct());
	}

	@When("to click the add or sub buton in buy page")
	public void to_click_the_add_or_sub_buton_in_buy_page() {
		p=new PojoHomebase();
		
		clickJavascriptBtn(p.getPlusbutton());
	}

// to check filter option
	
	@Given("launch the browser for checking filter")
	public void launch_the_browser_for_checking_filter() {
	  launchBrowser("Chrome");
	}

	@Given("launch the url for filter checking")
	public void launch_the_url_for_filter_checking() {
	   launchUrl("https://www.homebase.co.uk/");
	}

	@When("click furniture option and dining table option")
	public void click_furniture_option_and_dining_table_option() throws InterruptedException {
	  p=new PojoHomebase();
	  Thread.sleep(10000);
	  clickJavascriptBtn(p.getFurniture());
	  
	 
	  
	}

	@When("click colour filter option")
	public void click_colour_filter_option() throws InterruptedException {
	   p=new PojoHomebase();
	   Thread.sleep(4000);
	   clickJavascriptBtn(p.getDiningtable());
	   Thread.sleep(4000);
	   clickJavascriptBtn(p.getFilter());
	}

	@When("clcik remove filter option")
	public void clcik_remove_filter_option() {
	   p=new PojoHomebase();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   clickJavascriptBtn(p.getClearfilter());
	}

	@Then("close the url after checking")
	public void close_the_url_after_checking() {
	    driver.close();
	}



}
