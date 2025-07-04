package stepDefinition;

import static org.testng.Assert.*;

import io.cucumber.java.en.*;
import pageFactory.HomepageMealSectionPage;

public class HomepageMealSectionSteps {

	private final HomepageMealSectionPage mealSectionPage = new HomepageMealSectionPage();

    @When("the user clicks the {string} meal tab")
    public void the_user_clicks_the_meal_tab(String tab) {
    	mealSectionPage.selectMealTab(tab);  
    }

    @Then("the details card for {string} is visible")
    public void the_details_card_for_tab_is_visible(String tab) {

        boolean visible = mealSectionPage.mealDetailsVisible(tab);
        if (!visible) System.out.println("No visible details for tab: " + tab);

        assertTrue(visible, "Details card not visible for tab: " + tab);
    }
}
