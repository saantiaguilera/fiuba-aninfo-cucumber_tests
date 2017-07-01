package fiuba.aninfo.entity;

public class UserExternal extends User {

	public boolean setCardClassification(Card which, Card.Classification how) {
		return false; // You cant.
	}

	public boolean addCardAssignee(Card which, User who) {
		return false; // You cant.
	}

}