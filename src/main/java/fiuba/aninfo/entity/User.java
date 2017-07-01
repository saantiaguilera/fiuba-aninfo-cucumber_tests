package fiuba.aninfo.entity;

import java.lang.String;

public abstract class User {

    private long id;
    private String name;
    private String contactNumber;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public abstract boolean addCardAssignee(Card which, User who);
    public abstract boolean setCardClassification(Card which, Card.Classification how);

    @Override
    public boolean equals(final Object obj) {
        if (!(obj instanceof User)) {
            return false;
        }

        return ((User) obj).getId() == getId();
    }
    
    @Override
    public int hashCode() {
        return 0; // TODO 
    }

}

