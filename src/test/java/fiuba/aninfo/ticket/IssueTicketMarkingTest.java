package fiuba.aninfo.ticket;

import fiuba.aninfo.entity.User;
import fiuba.aninfo.entity.UserInternal;
import fiuba.aninfo.entity.Ticket;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import org.junit.Assert;

public class IssueTicketMarkingTest {
  private Ticket ticket = null;

  @Given("^a Ticket as internal")
  public void givenATicketCreatedAsInternal() throws Exception {
	 User someone = new UserInternal();
	 ticket = someone.newTicket();
    Assert.assertEquals(ticket.getClassification(), Ticket.Classification.INTERNAL);
  }

  @When("^a user wants to tag it as \"(.*?)\"")
  public void whenAUserWantsToTagItAsExternal(String classification) throws Exception {
	 User who = new UserInternal();
	 who.setTicketClassification(ticket, Ticket.Classification.valueOf(classification));
  }

  @Then("^it should be left marked as \"(.*?)\"")
  public void thenItShouldBetaggedAsExternal(String classification) throws Exception {
    Assert.assertEquals(ticket.getClassification().toString(), classification);
  }
}
