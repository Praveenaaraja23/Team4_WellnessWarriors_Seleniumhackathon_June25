package pageFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ConfigReader;
import utilities.DriverManager;

public class Loginpage_pf {
	WebDriver driver;
	private WebDriverWait wait;
	ConfigReader configFileReader=DriverManager.configReader();
	
	public Loginpage_pf(WebDriver driver){
		this.driver = DriverManager.getDriver();
		PageFactory.initElements(driver , this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@FindBy(xpath = "//*[@id='root']/div[1]/header/div/div[2]/button")
	WebElement loginbtn;
	@FindBy(xpath ="//h1[text()='Welcome back']")
	WebElement welcomeback;
	@FindBy(xpath ="//p[text()='Sign in to your account or create a new one']")
	WebElement signinOrNew;
	@FindBy(xpath ="//button[@class='absolute right-4 top-4 text-gray-400 hover:text-gray-600 transition-colors']//*[name()='svg']")
	WebElement closebtn;
	@FindBy(xpath ="//input[@id=':r0:-form-item']")
	WebElement inputfield;
	@FindBy(xpath ="//input[@placeholder='Enter email']")
	WebElement enteremail;
	@FindBy(xpath ="//*[@id=\"root\"]/div[1]/div/div[2]/form/button")
	WebElement continueWEmailBtn;
	@FindBy(xpath ="//p[text()='Please enter a valid email address']")
	WebElement errorMsg;
	@FindBy(xpath ="//button[@type='submit']")
	WebElement continueBtn;
	@FindBy(xpath ="//span[text()='OR']")
	WebElement or;
	@FindBy(xpath ="//input[@name='password']")
	WebElement password;
	@FindBy(xpath ="//button[@type='submit']")
	WebElement SigninBtn;
	@FindBy(xpath ="//*[@class='text-sm text-gray-500']")
	WebElement enableEmail;
	@FindBy(xpath ="//*[@id=\"root\"]/div[1]/div/div[2]/form/div[2]/button")
	WebElement forgotPwdBtn;
	@FindBy(xpath ="//input[@placeholder='Enter your password']")
	WebElement enterPwd;
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/header/div/div/div[2]/button")
	WebElement logoutbtn;
	@FindBy(id=":r7:-form-item")
	WebElement fullnameInput;
	@FindBy(id=":r8:-form-item")
	WebElement usernameInput;
	@FindBy(name="password")
	WebElement passwordInput;
	@FindBy(xpath = "//p[text()='By continuing you agree to our T&Cs and Privacy Policy']") 
	WebElement termsandConBtn;
	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/form/button")
	WebElement createActBtn;
	@FindBy(xpath = "//p[text()='Password must be at least 8 characters']")
	WebElement error4invaliddata;
	@FindBy(xpath = "//*[text()='Upload Blood Report']")
	WebElement uploadbloodreprtBtn;
	@FindBy(xpath = "//*[text()='Step Through Onboarding']")
	WebElement stepOnboardBtn;
	@FindBy(xpath = "//input[@type='file']")
	WebElement fileinput;
	@FindBy(xpath = "//p[text()='Drag & drop or click to upload']")
	WebElement dragNdrop ;
	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement cancelbtn;
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/button")
	WebElement uploadNProcessbtn;
	@FindBy(xpath = "//span[text()='Glucose Levels']")
	WebElement glucose;
	@FindBy(xpath = "//span[text()='HbA1c']")
	WebElement HbA1c;
	@FindBy(xpath = "//*[text()='Complete Blood Count']")
	WebElement bloodcount;
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div[1]/div[3]/ul")
	WebElement MC;
	@FindBy(xpath = "//*[text()='Abnormal Values']")
	WebElement abnormalvalue;
	@FindBy(xpath = "//*[text()='Recommendations']")
	WebElement recommendation;
	@FindBy(xpath="//*[text()='Your data is processed securely and kept private.']")
    WebElement progressBar;
	@FindBy(xpath = "//button[normalize-space()='Continue to Onboarding']")
	WebElement continueOnboardbtn;
	@FindBy(xpath = "//button[@type='submit' and text()='Continue']")
	WebElement continuebtn;
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/form/div/div[1]/input")
	WebElement age;
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/form/div/div[3]/input")
	WebElement height;
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/form/div/div[4]/input")
	WebElement weight;
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/form/div/div[2]/select")
	WebElement genderfield;
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/form/h2")
	WebElement step1Title;
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/form/div[1]/div[1]")
	WebElement easy;
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/form/div[1]/div[2]")
	WebElement medium;
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/form/div[1]/div[3]")
	WebElement hard;
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/form/div[2]/button")
	WebElement back;
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div")
	WebElement step3;
	@FindBy(xpath = "//span[text()='All-inclusive diet 🍴🍖🍎']")
	WebElement Alldiet;
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div")
	WebElement step4;
	@FindBy(xpath = "//span[text()='Asian 🍜']")
	WebElement Asian;
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div")
	WebElement step5;
	@FindBy(xpath = "//span[text()='Gluten 🥖🍞']")
	WebElement Gluten;
	@FindBy(xpath = "//span[text()='Nuts']")
	WebElement Nuts;
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitbtn;	
	@FindBy(xpath = "//p[@class='text-sm text-gray-600 text-right']")
	WebElement progressbar_withoutblood;
	@FindBy(xpath = "//button[.//span[normalize-space()='Type 2']")
	WebElement type2;
	@FindBy(xpath = "//button[.//span[normalize-space()=\"I don't know\"]]")
	WebElement idk;
	@FindBy(xpath = "//*[text()='So, Which sugar rebellion are we dealing with?']")
	WebElement title;
		
	public void clickloginbt() {
		loginbtn.click();
	}
	public void welcomebackpage() {
		welcomeback.isDisplayed();
	}
	public void signinOrNewDisplay() {
		signinOrNew.isDisplayed();
	}
	public void closebtnDisplay() {
		closebtn.isDisplayed();
	}
	public void inputfieldDisplay() {
		inputfield.isDisplayed();
	} 
	public Boolean emptyemail() {
		return enteremail.isDisplayed();
	}
	public void continueBtnDisplay() {
		continueWEmailBtn.isDisplayed();
	}
	public Boolean continueBtnEnable() {
		return continueWEmailBtn.isEnabled();
	}
	public void clickcontinueWEmailBtn() {
	   continueWEmailBtn.click();
	}
	public void errorMsgDisplay() {
		errorMsg.isDisplayed();
	}
	public void OrDisplay() {
		or.isDisplayed();
	}
	public void enteremail(String email) {
		inputfield.clear();
		inputfield.sendKeys(email);
	}
	public void clickcontinueBtn() {
		continueBtn.click();
	}
	public void passwordpage() {
		password.isDisplayed();
	}
	public void signinbtndisplay() {
		SigninBtn.isDisplayed();
	}
	public void EnableValidEmail() {
		 enableEmail.isDisplayed();
	}
	public void displayForgotPwd() {
		forgotPwdBtn.isDisplayed();
	}
	public void EnterUrPwd() {
		enterPwd.isDisplayed();
	}
	public void EnterPwd(String pwd) {
		enterPwd.clear();
		enterPwd.sendKeys(pwd);
	}
	public void clicksigninbtn() {
		SigninBtn.click();
	}
	public void clicklogoubt() {
		logoutbtn.click();
	}
	public void completeProfile(String fullname,String username,String password) {
		fullnameInput.sendKeys(fullname);
		usernameInput.sendKeys(username);
		passwordInput.sendKeys(password);
	}
	public void clicktermsbtn() {
		termsandConBtn.click();
	}
	public void displaytermsbtn() {
		termsandConBtn.isDisplayed();
	}
	public void clickCAbtn(){
		createActBtn.click();
	}
	public  Boolean disableCAbtn(){
		return !createActBtn.isEnabled();
	}
	public  Boolean enableCAbtn(){
		return createActBtn.isEnabled();
	}
	public  void seeinvaliddataerror(){
		error4invaliddata.isDisplayed();
	}
	public void seeuploadefile() {
		uploadbloodreprtBtn.isDisplayed();
	}	
	public void uploadefile() {
		String pathfile = System.getProperty("user.dir") + "\\BloodReport\\samplereport.pdf";
		fileinput.sendKeys(pathfile);	
	}
	public void dranNdropDisplay() {
		dragNdrop.isDisplayed();
	}
	public void clickuploadbloodreprtBtn() {
		uploadbloodreprtBtn.click();
	}
	public void clickStepOnboard(){
		stepOnboardBtn.click();
	}
	public void displayStepOnboard(){
		stepOnboardBtn.isDisplayed();
	}
	public void clickcancel(){
		cancelbtn.click();
	}
	public void clickuploadNprocess(){
		uploadNProcessbtn.click();
	}
	 public String getUploadProgressPercentage() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        wait.until(ExpectedConditions.visibilityOf(progressBar));	        
	        return progressBar.getText(); 
	    }
	 public void clickcontinueOnboard() throws Exception{
		 Thread.sleep(1000);
			    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			    wait.until(ExpectedConditions.visibilityOf(continueOnboardbtn));

			    JavascriptExecutor js = (JavascriptExecutor) driver;
			    js.executeScript("arguments[0].click();", continueOnboardbtn);
			
		} 
	 public void seecontinueOnboard(){
		 continueOnboardbtn.isDisplayed();
		}
	 public void displayage() {
		 age.isDisplayed();
		}
	 public void enterinvalidheight() {
		 height.clear();
		 height.sendKeys("1");
		}
	 public void entervalidheight() {
		 height.clear();
		 height.sendKeys("5");
		}
	 public void displayheight() {
		 height.isDisplayed();
		}
	 public void enterinvalidweight() {
		 weight.clear();
		 height.sendKeys("100");
		}
	 public void entervalidweight() {
		 height.clear();
		 height.sendKeys("155");
		}
	 public void displayweight() {
		 weight.isDisplayed();
		}
	 public void displaygender() {
		 genderfield.isDisplayed();
		}
	 public List<String> getGenderOptions() {
	        Select select = new Select(genderfield);
	        List<String> options = new ArrayList<>();
	        for (WebElement option : select.getOptions()) {
	            options.add(option.getText().trim());
	        }
	        return options;
	    }
	 public void displayStep1Title() {
		 step1Title.isDisplayed();
		}
	 public void clickintensitylevel() {
			medium.click();
		}
	 public void displaybackbtn() {
		 back.isDisplayed();
		}
	 public void displayeasy() {
		 easy.isDisplayed();
		}
	 public void displaymedium() {
		 medium.isDisplayed();
		}
	 public void displayhard() {
		 hard.isDisplayed();
		}
	 public void clicksubmitbtn() {
		 submitbtn.click();
		}
	 public void displayprogress_withoutblood() {
		 progressbar_withoutblood.isDisplayed();
		}
	 public void clicktype2() {
		 type2.click();
		}
	 public boolean displayglucoselevel() {
		return glucose.isDisplayed();
		}
	 public boolean displayHbA1c() {
		 return HbA1c.isDisplayed();
		}
	 public boolean displaybloodcount() {
		return bloodcount.isDisplayed();
		}
	 public boolean displayMC() {
		return MC.isDisplayed();
		}
	 public boolean displayabnormalvalue() {
		return abnormalvalue.isDisplayed();
		}
	 public boolean displayrecommendation() {
		return recommendation.isDisplayed();
		} 
	 public String gettitle() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        wait.until(ExpectedConditions.visibilityOf(title));	        
	        return title.getText(); 
	    }
	 
} 

