package fiuba.aninfo.project_manager;

import fiuba.aninfo.entity.User;
import fiuba.aninfo.entity.UserInternal;
import fiuba.aninfo.entity.Ticket;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import org.junit.Assert;

public class IssueAssignTest {

    private User user;
    private Ticket Ticket;

    @Given("^a user whose name is \"(.*?)\"$")
    public void givenAUserWith(String name) throws Exception {
        user = new UserInternal();
        user.setName(name);

        Assert.assertEquals(name, user.getName());
    }

    @When("^a created ticket with title \"(.*?)\" its assigned to him$")
    public void whenHeGetsAsignedATicketOf(String title) {
		  Ticket = user.newTicket();
        Ticket.setTitle(title);
        Ticket.addAssignee(user);

        Assert.assertEquals(title, Ticket.getTitle());
    }

    @Then("^\"(.*?)\" becomes an assignee of the ticket$")
    public void thenTheUserIsAnAssigneeOfTheTicket(String userName) {
        Assert.assertNotNull(Ticket);
        Assert.assertEquals(userName, user.getName());
        Assert.assertTrue(Ticket.isAssignee(user));
    }
}
