package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

@SpringBootTest
public class StepDefinitions {

    private String today;
    private String isTodayFriday;
    private boolean iceCreamInBowl;

    private final IsItFriday isItFriday;

    public StepDefinitions(IsItFriday isItFriday) {
        this.isItFriday = isItFriday;
    }

    @Given("today is Thursday")
    public void todayIsThursday() {
        today = "Thursday";
    }

    @Given("today is Friday")
    public void todayIsFriday() {
        today = "Friday";
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        isTodayFriday = isItFriday.isItFriday(today);
        iceCreamInBowl = isTodayFriday.equals("TGIF");
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, isTodayFriday);
    }
    

    @Given("I have a bowl for ice cream")
    public void i_have_a_bowl_for_ice_cream() {
        iceCreamInBowl = false;
    }


    @Then("I should {}have ice cream in my bowl")
    public void i_should_have_ice_cream_in_my_bowl(String string) {
        assertEquals(iceCreamInBowl, "".equals(string));
    }

    @Given("today is {string}")
    public void today_is(String today) {
        this.today = today;
    }
}

