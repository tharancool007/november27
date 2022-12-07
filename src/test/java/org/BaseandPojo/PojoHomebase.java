package org.BaseandPojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoHomebase extends Baseclass {

	public PojoHomebase() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	

	
	@FindAll({
		@FindBy(xpath="(//span[@class='responsiveAccountHeader_openAccountPanelText'])[1]"),

		@FindBy(xpath="(//span[text()='Account'])[1]")
		
	})private WebElement loginoption;
	
	@FindAll({
		
		@FindBy(xpath="//input[@type='email']"),
		@FindBy(xpath="//input[@id='email-address-input-element-id-6ac2b7a1-bf7b-43aa-984f-30d3d10db248']")
	})private WebElement emailbox;
	
@FindAll({
		
		@FindBy(xpath="//input[@label='Password']"),
		@FindBy(xpath="//input[@id='password-input-element-id-dda148db-c9a9-464c-a9e0-0d0dc25476cd']")
	})private WebElement passwrdbox;

@FindAll({
	
	@FindBy(xpath="//button[@type='submit']")
	
})private WebElement submit;

public WebElement getLoginoption() {
	return loginoption;
}

public WebElement getEmailbox() {
	return emailbox;
}

public WebElement getPasswrdbox() {
	return passwrdbox;
}

public WebElement getSubmit() {
	return submit;
}

@FindAll({
	@FindBy(xpath="(//a[@class='responsiveFlyoutMenu_levelOneLink responsiveFlyoutMenu_levelOneLink-hasChildren'])[8]"),
	@FindBy(xpath="(//a[@data-sliderno='1'])[8]"),
	@FindBy(xpath="//a[@data-cs-override-id='LightingElectricalHeating']")
})private WebElement menuopt;
	
@FindAll({
	@FindBy(xpath="(//a[@class='responsiveFlyoutMenu_levelTwoLink responsiveFlyoutMenu_levelTwo_lighting-electrical-lighting responsiveFlyoutMenu_levelTwoLink_num responsiveFlyoutMenu_levelTwoLink_num-01  responsiveFlyoutMenu_levelTwoLink-hasChildren '])[2]"),
	@FindBy(xpath="//a[@data-cs-override-id='LightingElectricalHeating-Lighting']")
	
})private WebElement lighting;

@FindAll({
	@FindBy(xpath="(//span[@class='responsiveFlyoutMenu_levelThreeLinkText'])[472]")
	
	
})private WebElement lamp;

@FindAll({
	@FindBy(xpath="(//h3[@class='productBlock_productName'])[8]")
	
	
})private WebElement product;
@FindAll({
	@FindBy(xpath="//button[@class='productAddToBasket productAddToBasket-buyNow js-e2e-add-basket']")
	
	
})private WebElement cart;

@FindAll({
	@FindBy(xpath="//a[@class='athenaAddedToBasketModal_viewBasketButton js-e2e-quickView-basket']")
	
	
})private WebElement viewbasket;

public WebElement getViewbasket() {
	return viewbasket;
}

public WebElement getMenuopt() {
	return menuopt;
}

public WebElement getLighting() {
	return lighting;
}

public WebElement getLamp() {
	return lamp;
}

public WebElement getProduct() {
	return product;
}

public WebElement getCart() {
	return cart;
}


//to check search function

@FindAll({
	@FindBy(xpath="(//input[@type='text'])[1]")
	
	
})private WebElement inputsearch;

@FindAll({
	@FindBy(xpath="//button[@type='submit'][1]")
	
	
})private WebElement clickserbut;

public WebElement getInputsearch() {
	return inputsearch;
}

public WebElement getClickserbut() {
	return clickserbut;
}

// to click sign up

@FindAll({
	@FindBy(xpath="(//span[@class='responsiveAccountHeader_openAccountPanelText'])[1]")

	
})private WebElement accbtn;

@FindAll({
	@FindBy(xpath="//a[@class='responsiveAccountHeader_accountRegister'][1]")

	
})private WebElement registerbutton;

@FindAll({
	@FindBy(xpath="(//input[@type='text'])[1]")

	
})private WebElement fullname;

@FindAll({
	@FindBy(xpath="//input[@type='email'][1]")

	
})private WebElement emailtext ;

@FindAll({
	@FindBy(xpath="(//input[@type='email'])[2]")

	
})private WebElement confirmtext ;


@FindAll({
	@FindBy(xpath="(//div[@class='sc-ESujJ kelSOj'])[2]")

	
})private WebElement radio ;

@FindAll({
	@FindBy(xpath="//button[@type='submit']")

	
})private WebElement finish ;

public WebElement getAccbtn() {
	return accbtn;
}

public WebElement getRegisterbutton() {
	return registerbutton;
}

public WebElement getFullname() {
	return fullname;
}

public WebElement getEmailtext() {
	return emailtext;
}

public WebElement getConfirmtext() {
	return confirmtext;
}

public WebElement getRadio() {
	return radio;
}

public WebElement getFinish() {
	return finish;
}

// to check youtube

@FindAll({
	@FindBy(xpath="//a[@title='YouTube']")

	
})private WebElement youtubebut;

@FindAll({
	@FindBy(xpath="(//a[@target='_blank'])[3]")

	
})private WebElement instabuttton;

public WebElement getYoutubebut() {
	return youtubebut;
}

public WebElement getInstabuttton() {
	return instabuttton;
}
//to check add button is working or not
@FindAll({
	@FindBy(xpath="//button[@class='productQuantityInput_increase']")

	
})private WebElement plusbutton;

public WebElement getPlusbutton() {
	return plusbutton;
}
// to check filter button


@FindAll({
	@FindBy(xpath="//a[@data-cs-override-id='Furniture']")

	
})private WebElement furniture;

@FindAll({
	@FindBy(xpath="//h3[text()='Tables & Desks']"),
    
	
})private WebElement diningtable;

@FindAll({
	@FindBy(xpath="(//input[@type='checkbox'])[18]")

	
})private WebElement filter;

@FindAll({
	@FindBy(xpath="//span[@class='responsiveFacets_selectionClear']")

	
})private WebElement clearfilter;

public WebElement getFurniture() {
	return furniture;
}

public WebElement getDiningtable() {
	return diningtable;
}

public WebElement getFilter() {
	return filter;
}

public WebElement getClearfilter() {
	return clearfilter;
}

}
