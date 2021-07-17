package basicjava.javase.serializable;

import java.io.Serializable;

public class Student implements Serializable {
    private long id;
    private String name;
    private String family;

    public Student(long id, String name, String family) {
        this.id = id;
        this.name = name;
        this.family = family;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
