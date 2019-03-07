package objectRepository.AgreementCapture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.driverManager.DriverFactory;
import common.seleniumExceptionHandling.SeleniumMethods;
import objectRepository.common.ApexCommon;
import objectRepository.common.PagesTitle;

public class CreateEditTrafficSplitLevels_P430 {
	private SeleniumMethods com;
	private ApexCommon comm;
	public static String title = PagesTitle.CreateEditTrafficSplitLevels_P430.title;

	public CreateEditTrafficSplitLevels_P430() {
		PageFactory.initElements(DriverFactory.getDriver(), this);
		com = new SeleniumMethods();
		comm = new ApexCommon();
	}

	private List<String> colNames = new ArrayList<>(Arrays.asList());

	@FindBy(xpath = "//button[.='Cancel']")
	public WebElement button_Cancel;
	
	
	public void verify_UI() {

	}

	

}
