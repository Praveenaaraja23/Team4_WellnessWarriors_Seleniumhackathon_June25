package pageFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import utilities.ConfigReader;
import utilities.DriverManager;

public class DiabetesRiskAnalyzer_pf {
	
	WebDriver driver= DriverManager.getDriver();
	ConfigReader configFileReader=DriverManager.configReader();
	
	public DiabetesRiskAnalyzer_pf() {
		PageFactory.initElements(driver , this);

	}
	

	@FindBy(xpath="//h2[contains(text(), 'Diabetes Risk Analyzer')]") WebElement checkyourrisktxt;
	@FindBy(xpath = "//p[contains(text(), 'Answer a few questions to assess your risk of developing diabetes')]") WebElement answerQuestion;
	@FindBy(xpath = "//button[contains(text(),'Cancel')]")  WebElement cancelBtn;
	@FindBy(xpath = "//button[contains(text(),'Calculate Risk')]")WebElement calcRiskBtn;
	@FindBy(id = "risk_age")WebElement agetextbox;
	@FindBy(id = "risk_weight")WebElement weighttextbox;
	
	@FindBy(xpath = "(//span[normalize-space()='Family history of diabetes'])[1]") WebElement familyHistoryInput;

	@FindBy(id =  "risk_activity") WebElement selecacteveldropdown;
	@FindBy(id = "risk_bloodPressure") WebElement selectbpstatusdropdown;
	@FindBy(id=   "risk_diet")WebElement selectdietQualitydrpdwn;
	
	@FindBy(xpath = "option[value='active']")WebElement PAactive;
	@FindBy(xpath = "option[value='moderate']']")WebElement PAmoderate;
	@FindBy(xpath = "option[value='sedentary']")WebElement sedentaryPA;
	@FindBy(xpath = "option[value='normal']")WebElement normalBP;
	@FindBy(xpath = "option[value='elevated']")WebElement elevatedBP;
	@FindBy(xpath = "option[value='high']")WebElement highBP;
	@FindBy(xpath = "option[value='excellent']")WebElement excellentDQ;
	@FindBy(xpath = "//option[@value='average']")WebElement averageDQ;
	@FindBy(xpath = "option[value='poor']")WebElement poorDQ;
	@FindBy(xpath="//h2[contains(text(), 'Your Diabetes Risk Assessment')]") WebElement diabetesrisckpopup;
	
	
	public String isRiskAnalyzerVisible() {
        return checkyourrisktxt.getText();
    }
	
	
	public String getanswertext() {
		return answerQuestion.getText();
	}
	
	
	
	//public boolean iscancelBtn() {
      //  return cancelBtn.isDisplayed();
    //}
	
	
	public boolean isCancelBtn() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    try {
	        WebElement cancelButton = wait.until(ExpectedConditions.visibilityOf(cancelBtn));
	        return cancelButton.isDisplayed();
	    } catch (Exception e) {
	        return false;
	    }
	}
	
	 public void clickcancelBtn() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(cancelBtn)).click();
	    }
	
	
	 public boolean isCalcRiskBtn() {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    try {
		        WebElement calcButton = wait.until(ExpectedConditions.visibilityOf(calcRiskBtn));
		        return calcButton.isDisplayed();
		    } catch (Exception e) {
		        return false;
		    }
		}
	
	 public boolean isCalculateRiskButtonDisabled() {
	        String disabled = calcRiskBtn.getAttribute("disabled");
	        return disabled != null && (disabled.equals("true") || disabled.equals("disabled"));
	    }
	 
	//click calculate risk
	 public void clickcalcRiskBtn() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable( calcRiskBtn)).click();
	    }
	 
	 public boolean isAgeInputWithStepper() {
	        return agetextbox.getAttribute("type").equals("number");
	    }

	    public boolean isWeightInputWithStepper() {
	        return weighttextbox.getAttribute("type").equals("number");
	    }

	    public boolean isfamilyHistoryInputDisplayed() {
	        return familyHistoryInput.isDisplayed();
	    }
	    public String getAgePlaceholder() {
	        return agetextbox.getAttribute("placeholder")
	        		 .replaceAll("[^\\x00-\\x7F]", "-") // Replace all non-ASCII characters with hyphen
	                 .trim();
	    }

	    public String getWeightPlaceholder() {
	        return weighttextbox.getAttribute("placeholder");
	    }
	    public String getphysicalDropdownVisible() {
	        return selecacteveldropdown.getTagName();
	    }
	    
	    public String getbpstatusDropdownVisible() {
	        return selectbpstatusdropdown.getTagName();
	    }
	    
	    public String getdietqualityDropdownVisible() {
	        return selectdietQualitydrpdwn.getTagName();
	    }
	    
	    //enterage
	    public void enterAgeInput(int age) {
			agetextbox.clear();
			agetextbox.sendKeys(String.valueOf(age));
		}
		//enter weight
		public void enterWeightInput(int weight) {
			weighttextbox.clear();
			weighttextbox.sendKeys(String.valueOf(weight));
		}
		
		//select checkbox 
		public void selectFamilyHistoryCheckbox() {
		    if (!familyHistoryInput.isSelected()) {
		    	familyHistoryInput.click();
		    }
		}
		
		public boolean isCalculateRiskButtonEnabled() {
		    return calcRiskBtn.isEnabled();
		}
		//selecting options from any drop down
		public void selectDropdownByName(String dropdownName, String visibleText) {
		    WebElement dropdownElement;

		    if (dropdownName.equalsIgnoreCase("Physical Activity")) {
		        dropdownElement = selecacteveldropdown;
		    } else if (dropdownName.equalsIgnoreCase("Blood Pressure")) {
		        dropdownElement = selectbpstatusdropdown;
		    } else if (dropdownName.equalsIgnoreCase("Diet Quality")) {
		        dropdownElement = selectdietQualitydrpdwn;
		    } else {
		        throw new IllegalArgumentException("Invalid dropdown name: " + dropdownName);
		    }

		    Select select = new Select(dropdownElement);
		    select.selectByVisibleText(visibleText);
		}

		
		
	     //to select default activitylevel
	    public String getDropdownDefaultText(String dropdownName) {
	    	 WebElement dropdownElement = null;

	    	    if (dropdownName.equalsIgnoreCase("Select activity level")) {
	    	        dropdownElement = selecacteveldropdown;
	    	    } else if (dropdownName.equalsIgnoreCase("Select blood pressure status")) {
	    	        dropdownElement = selectbpstatusdropdown;
	    	    } else if (dropdownName.equalsIgnoreCase("Select diet quality")) {
	    	        dropdownElement = selectdietQualitydrpdwn;
	    	    } else {
	    	        throw new IllegalArgumentException("Invalid dropdown name: " + dropdownName);
	    	    }

	    	   
	    	    return new Select(dropdownElement).getFirstSelectedOption().getText().trim();
	    }
	    
	    //To select all options from dropdown menu skiping 1st one
	    public String getDropdownOptionsText(String dropdownName) {
	        WebElement dropdownElement = null;

	        if (dropdownName.equalsIgnoreCase("Physical Activity Level")) {
	            dropdownElement = selecacteveldropdown;
	        } else if (dropdownName.equalsIgnoreCase("Blood Pressure")) {
	            dropdownElement = selectbpstatusdropdown;
	        } else if (dropdownName.equalsIgnoreCase("Diet Quality")) {
	            dropdownElement = selectdietQualitydrpdwn;
	        } else {
	            throw new IllegalArgumentException("Invalid dropdown name: " + dropdownName);
	        }

	        Select dropdown = new Select(dropdownElement);
	        List<WebElement> options = dropdown.getOptions();

	        // Skiping the first option
	        List<String> optionTexts = new ArrayList<>();
	        for (int i = 1; i < options.size(); i++) {  
	            optionTexts.add(options.get(i).getText().trim());
	        }

	        return String.join(", ", optionTexts);
	    }
	    
	  
	    
	    public String riskassesmenttext() {
			return diabetesrisckpopup.getText();
		}
}
