package Parallel;

import com.qa.factory.DriverFactory;
import com.qa.pages.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class SearchPageSteps {

    private SearchPage search = new SearchPage(DriverFactory.getDriver());



        // Step: Navigate to ESPN Cricinfo homepage
        @Given("I am on the ESPN Cricinfo homepage")
        public void i_am_on_the_espn_cricinfo_homepage() {
            DriverFactory.getDriver().get("https://www.espncricinfo.com");
        }

        // Step: Search for a player by name
        @When("I search for {string}")
        public void i_search_for(String searchQuery) throws InterruptedException {
            // Locate the search bar and enter the search query
            search.searchEnter(searchQuery); // Click on the search button
        }

        // Step: Verify the search results
        @Then("I should see search results related to {string}")
        public void i_should_see_search_results_related_to(String searchQuery) throws InterruptedException {
            // Check that the search results contain the name of the searched player
           search.searchResults(searchQuery);
        }

        // Cleanup after each test execution (close the browser)
//        @After
//        public void cleanUp() {
//            driver.quit();
//        }
    }

