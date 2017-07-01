package fiuba.aninfo.project_manager;

import fiuba.aninfo.entity.User;
import fiuba.aninfo.entity.Card;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import org.junit.Assert;

public class IssueAssignTest {

    private User user;
    private Card card;

    @Given("^a user whose name is \"(.*?)\"$")
    public void givenAUserWith(String name) throws Exception {
        user = new UserExternal();
        user.setName(name);

        Assert.assertEquals(name, user.getName());
    }

    @When("^a created ticket with title \"(.*?)\" its assigned to him$")
    public void whenHeGetsAsignedATicketOf(String title) {
        card = new Card();
        card.setTitle(title);
        card.addAssignee(user);

        Assert.assertEquals(title, card.getTitle());
    }

    @Then("^\"(.*?)\" becomes an assignee of the ticket$")
    public void thenTheUserIsAnAssigneeOfTheTicket(String userName) {
        Assert.assertNotNull(card);
        Assert.assertEquals(userName, user.getName());
        Assert.assertTrue(card.isAssignee(user));
    }
}
