package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.DriverManager;


public class PremiumUserExercise_PF {
	
	WebDriver driver= DriverManager.getDriver();
	ConfigReader configFileReader=DriverManager.configReader();
	
	 public PremiumUserExercise_PF() {
	    	
			PageFactory.initElements(driver,this);
	}
	
	public void premiumUserlogin() {

		
		driver.findElement(By.name("email")).sendKeys("team4selenium@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.name("password")).sendKeys("phase2selenium");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
	
	//Exercise home Page
	    @FindBy(xpath="//span[text()='SweetBalance ']") public WebElement Sweetbalancehomwtxt;
		@FindBy(xpath = "//span[contains(text(), 'Exercise')]")public WebElement ExerciseBtn;
		@FindBy(xpath = "//h2[@class='text-xl font-bold text-violet-600']") public WebElement TodaysExerciseplanTxt;
		@FindBy(xpath = "//button[contains(text(), 'View Full Schedule')]") public WebElement viewFullScheduleBtn;
		@FindBy(xpath = "//button[text()='Warm Up']") public WebElement warmUpBtn;
		@FindBy(xpath = "//button[text()='Main Workout']")public WebElement mainWorkoutBtn;
		@FindBy(xpath = "//button[text()='Cool Down']") public WebElement coolDownBtn;
		@FindBy(xpath = "//h3[@class='font-semibold']") public WebElement workoutname;
		@FindBy(xpath = "//p[@class='text-gray-600 mb-2']") public WebElement workoutDescription;
		@FindBy(xpath = "//span[contains(text(),'Duration')]") public WebElement workoutDuration;
		@FindBy(xpath = "//span[contains(text(),'Calories')]")  public WebElement Calories;
		@FindBy(xpath = "//span[contains(text(),'Intensity')]") public WebElement Intensity;
		@FindBy(xpath = "//span[text()='Mark as Completed']") public WebElement markAsCompleted;
		@FindBy(xpath = "//div[contains(text(), 'Success!')]") public WebElement successDialog;
		@FindBy(xpath = "//div[contains(text(), 'Main Workout completed')]") public WebElement completed;
		@FindBy(xpath = "//button[text()='Undo']")
		public WebElement undoOption;
		
		
		
		//Today's Exercise Schedule page   
		@FindBy(xpath = "//h1[@class='text-3xl font-bold text-white']") public  WebElement TodaysExerciseScheduleTxt;
		@FindBy(xpath = "//button[text()='Back to Home']") public WebElement BacktoHomeBtn;
		@FindBy(xpath = "//h2[text()='Warm Up']") public WebElement warmUp;
		@FindBy(xpath = "//h3[text()='Dynamic Stretching & Light Cardio']") public WebElement warmUpExercisename;
		@FindBy(xpath = "//h2[text()='Main Workout']") public WebElement mainWorkout;
		@FindBy(xpath = "//div[@id=\"root\"]/div[1]/div/div[2]/div[3]/div/h3") public WebElement mainExerciseName;
		@FindBy(xpath = "//h2[text()='Main Workout']/..//p") public WebElement mainDescription;
		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/span[1]")public WebElement mainDuration;
		@FindBy(xpath = "//span[normalize-space()='Calories: 200']") public WebElement mainCalories;
		@FindBy(xpath = "//span[normalize-space()='Intensity: Medium']") public WebElement mainIntensity;
		@FindBy(xpath="//h2[contains(text(), 'Cool Down')]") public WebElement CoolDowntxt;
		@FindBy(xpath = "//h3[contains(text(), 'Static Stretching')]") public WebElement coolDownExerciseName;
		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/p[1]") public WebElement coolDownDescription;
		@FindBy(xpath = "//div[@id=\"root\"]/div[1]/div/div[2]/div[4]/div/div/span[1]") public WebElement coolDownDuration;
		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/span[2]") public WebElement coolDownCalories;
		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/span[3]") public WebElement coolDownIntensityLevel;
		@FindBy(xpath = "//span[contains(text(),'Total Duration')]")  public WebElement totalDuration;
		@FindBy(xpath = "//span[contains(text(),'Total Calories')]") public WebElement totalCalories;


		public String getSweetBalancehomeText() {
	        return Sweetbalancehomwtxt.getText();
	    }
		
		
		public void clickExerciseBtn() {
			ExerciseBtn.click();
	    }

	    public void clickViewFullScheduleBtn() {
	        viewFullScheduleBtn.click();
	    }
	    
	    public boolean isViewFullScheduleBtnDisplayed() {
	        return viewFullScheduleBtn.isDisplayed();
	    }
	    
	    public boolean isTodaysExerciseplanTxt() {
	        return viewFullScheduleBtn.isDisplayed();
	    }
	 // Check if Warm Up button is displayed
	    public boolean isWarmUpBtnDisplayed() {
	        return warmUpBtn.isDisplayed();
	    }

	    // Check if Main Workout button is displayed
	    public boolean isMainWorkoutBtnDisplayed() {
	        return mainWorkoutBtn.isDisplayed();
	    }

	    // Check if Cool Down button is displayed
	    public boolean isCoolDownBtnDisplayed() {
	        return coolDownBtn.isDisplayed();
	    }

	    // Click Warm Up tab
	    public void clickWarmUpTab() {
	        warmUpBtn.click();
	    }

	    // Click Main Workout tab
	    public void clickMainWorkoutTab() {
	        mainWorkoutBtn.click();
	    }

	    // Click Cool Down tab
	    public void clickCoolDownTab() {
	        coolDownBtn.click();
	    }

	    // Validate Exercise Name is displayed
	    public boolean isExerciseNameDisplayed() {
	        return workoutname.isDisplayed();
	    }

	    // Validate Exercise Description is displayed
	    public boolean isExerciseDescriptionDisplayed() {
	        return workoutDescription.isDisplayed();
	    }

	    // Validate Exercise Duration is displayed
	    public boolean isExerciseDurationDisplayed() {
	        return workoutDuration.isDisplayed();
	    }

	    // Validate Calories are displayedsMarkAsCompletedDisplayed
	    public boolean isCaloriesDisplayed() {
	        return Calories.isDisplayed();
	    }

	    // Validate Intensity Level is displayed
	    public boolean isIntensityDisplayed() {
	        return Intensity.isDisplayed();
	    }

	    // Validate Mark As Completed button is displayed
	    public boolean isMarkAsCompletedDisplayed(){
	        return markAsCompleted.isDisplayed();
	        
	    }

	    // Click Mark As Completed button
	    public void clickMarkAsCompleted() throws InterruptedException {
	        markAsCompleted.click();
Thread.sleep(2000);
	    }

	    // Validate Success Dialog is displayed
	    public boolean isSuccessDialogDisplayed() {
	        return successDialog.isDisplayed();
	    }

	    // Validate Completed status is displayed
	    public boolean isCompletedDisplayed() {
	        return completed.isDisplayed();
	    }

	    // Validate Undo button is displayed
	    public boolean isUndoDisplayed() {
	        return undoOption.isDisplayed();
	    }

	    // Click Undo button
	    public void clickUndo() {
	        undoOption.click();
	    }

	    // Validate Today's Exercise Schedule title is displayed
	    public boolean isTodaysExerciseScheduleDisplayed() {
	        return TodaysExerciseScheduleTxt.isDisplayed();
	    }

	    // Validate Back to Home button is displayed
	    public boolean isBackToHomeDisplayed() {
	        return BacktoHomeBtn.isDisplayed();
	    }

	    // Validate Warm Up section is displayed
	    public boolean isWarmUpSectionDisplayed() {
	        return warmUp.isDisplayed();
	    }

	    // Validate Warm Up Exercise Name is displayed
	    public boolean isWarmUpExerciseNameDisplayed() {
	        return warmUpExercisename.isDisplayed();
	    }

	    // Validate Main Workout section is displayed
	    public boolean isMainWorkoutSectionDisplayed() {
	        return mainWorkout.isDisplayed();
	    }

	    // Validate Main Workout Exercise Name is displayed
	    public boolean isMainExerciseNameDisplayed() {
	        return mainExerciseName.isDisplayed();
	    }

	    // Validate Cool Down section is displayed
	    public boolean isCoolDownSectionDisplayed() {
	        return CoolDowntxt.isDisplayed();
	    }

	    // Validate Cool Down Exercise Name is displayed
	    public boolean isCoolDownExerciseNameDisplayed() {
	        return coolDownExerciseName.isDisplayed();
	    }

	    // Validate Total Duration is displayed
	    public boolean isTotalDurationDisplayed() {
	        return totalDuration.isDisplayed();
	    }

	    // Validate Total Calories is displayed
	    public boolean isTotalCaloriesDisplayed() {
	        return totalCalories.isDisplayed();
	    }

	    // Get Exercise Intensity Text
	    public String getExerciseIntensityText() {
	        return Intensity.getText();
	    }

	    // Get Total Duration Text
	    public String getTotalDurationText() {
	        return totalDuration.getText();
	    }

	    // Get Total Calories Text
	    public String getTotalCaloriesText() {
	        return totalCalories.getText();
	    
}

	    public int extractNumericValue(WebElement element) {
	        String text = element.getText(); // Example: "Calories: 200"
	        return Integer.parseInt(text.replaceAll("[^0-9]", ""));
	    }
	    
	    
}