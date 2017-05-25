package fiuba.aninfo.entity;

import java.lang.String;

public class User {

    private long id;
    private String name;
    private String area;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getArea() {
        return area;
    }

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

