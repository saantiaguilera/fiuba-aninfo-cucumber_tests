package fiuba.aninfo.ticket;

import fiuba.aninfo.entity.User;
import fiuba.aninfo.entity.Card;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import org.junit.Assert;

public class IssueTicketMarkingTest {
  private Card card = null;

  @Given("^a card as internal")
  public void givenACardCreatedAsInternal() throws Exception {
    card = new Card();
    card.setClassification(Card.Classification.INTERNAL);
    Assert.assertEquals(card.getClassification(), Card.Classification.INTERNAL);
  }

  @When("^a user wants to tag it as \"(.*?)\"")
  public void whenAUserWantsToTagItAsExternal(String classification) throws Exception {
    card.setClassification(Card.Classification.valueOf(classification));
  }

  @Then("^it should be left marked as \"(.*?)\"")
  public void thenItShouldBetaggedAsExternal(String classification) throws Exception {
    Assert.assertEquals(card.getClassification().toString(), classification);
  }
}
