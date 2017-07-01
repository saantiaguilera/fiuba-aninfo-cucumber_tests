package fiuba.aninfo.entity;

public class UserInternal extends User {

	private String area;

	public void setArea(String area) {
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public boolean setCardClassification(Card which, Card.Classification how) {
		which.setClassification(how);
		return true;
	}

	public boolean addCardAssignee(Card which, User who) {
		which.addAssignee(who);
		return true;
	}

}
