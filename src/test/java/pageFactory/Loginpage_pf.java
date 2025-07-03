package pageFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

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
//	WebDriver driver= DriverManager.getDriver();
	ConfigReader configFileReader=DriverManager.configReader();
	
	public Loginpage_pf(WebDriver driver){
	//	this.driver = driver;
	//	driver = this.driver;
		this.driver = DriverManager.getDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver , this);
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
//	@FindBy(xpath ="//button[text()='Sign in']")
	@FindBy(xpath ="//button[@type='submit']")
	WebElement SigninBtn;
//	@FindBy(xpath ="//p[@class='text-sm text-gray-500']")
	@FindBy(xpath ="//*[@class='text-sm text-gray-500']")
	WebElement enableEmail;
//	@FindBy(xpath ="//button[text()='Forgot password?']")
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
/*	@FindBy(id = "password")
	WebElement passwordField; */
//	@FindBy(xpath="/html/body/div/div[1]/div/div[2]/form/div[5]/button")
//	@FindBy(xpath="//*[@role='checkbox']")
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
//	@FindBy(xpath = "//*[text()='Upload & Process']")
	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[3]/button[2]")
	WebElement uploadNProcessbtn;
	@FindBy(xpath= "//*[@id=\"root\"]/div[1]/div/div[2]/div[3]/div[1]/span[2]")
    WebElement progressBar;
//	@FindBy(xpath = "/html/body/div/div[1]/div/button")
	@FindBy(css = "button.bg-gradient-to-r.from-violet-600.to-purple-600")
	WebElement continueOnboardbtn;
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/form/div/div[1]/input")
//	@FindBy(xpath = "//input[@placeholder='Enter your age']")
	WebElement age;
//	@FindBy(xpath = "//input[@placeholder='Enter height in cm (1-300)']")
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/form/div/div[3]/input")
	WebElement height;
//	@FindBy(xpath = "//input[@placeholder='Enter weight in kg (1-500)']")
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/form/div/div[4]/input")
	WebElement weight;
//	@FindBy(xpath = "//select[@name='gender']")
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/form/div/div[2]/select")
	WebElement genderfield;
//	@FindBy(xpath = "//button[@type='submit']")
//	WebElement continueBtn;
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
//	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/form/div[1]/div[1]/span")
	@FindBy(xpath = "//span[text()='All-inclusive diet 🍴🍖🍎']")
	WebElement Alldiet;
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div")
	WebElement step4;
//	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/form/div[1]/div[5]")
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
//	@FindBy(xpath = "//*[text()='So, Which sugar rebellion are we dealing with?']")
	@FindBy(xpath = "//h1[@class='text-3xl font-italic bg-gradient-to-r from-violet-700 to-fuchsia-700 bg-clip-text text-transparent']")
	WebElement title_withoutbloodreport;
	
	@FindBy(xpath = "//p[@class='text-sm text-gray-600 text-right']")
	WebElement progressbar_withoutblood;
/*	@FindBy(xpath = "//*[@class='space-y-2']/button[1]")
	WebElement type2; */
	@FindBy(xpath = "//*[@class='inline-flex items-center gap-2 whitespace-nowrap rounded-md text-sm font-medium ring-offset-background focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 [&_svg]:pointer-events-none [&_svg]:size-4 [&_svg]:shrink-0 border border-input hover:text-accent-foreground h-10 w-full justify-between px-6 py-4 text-left transition-all duration-200 bg-white/70 hover:bg-white/90 backdrop-blur-sm']")
	WebElement type2;
	@FindBy(xpath = "//*[@class='space-y-2']/button[2]")
	WebElement idk;
	
	
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
	/*	enteremail.sendKeys(email); */
	//	enteremail.sendKeys("team4selenium@gmail.com");
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
	//	enterPwd.sendKeys("phase2selenium");
	}
/*	public String getPasswordPlaceholder() {
	    return passwordField.getAttribute("placeholder");
	} */
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
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOf(progressBar));	        
	        return progressBar.getText(); 
	    }
	 public void clickcontinueOnboard(){
		 continueOnboardbtn.click();
		}
	 public void seecontinueOnboard(){
		 continueOnboardbtn.isDisplayed();
		}
	 public void displayage() {
		 age.isDisplayed();
		}
	 public void displayheight() {
		 height.isDisplayed();
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
/*	 public String displaystep1title_withoutblood() {
		return title_withoutbloodreport.getText();
		} */
	 public boolean displaystep1title_withoutblood() {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    try {
		        wait.until(ExpectedConditions.visibilityOf(title_withoutbloodreport));
		         return title_withoutbloodreport.isDisplayed();
		    } catch (TimeoutException e) {
		        return false;
		    }
		}
	 public void displayprogress_withoutblood() {
		 progressbar_withoutblood.isDisplayed();
		}
/*	 public void switchToOnboardingFrame() {
	        // Replace "frameNameOrId" with actual name, id, or index
	        driver.switchTo().frame("frameNameOrId");
	    } */
	 public void clicktype2() {
		// type2.click();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		    wait.until(ExpectedConditions.elementToBeClickable(type2)).click();
		}
/*	 public void switchBackToMainContent() {
	        driver.switchTo().defaultContent();
	    } */
} 

