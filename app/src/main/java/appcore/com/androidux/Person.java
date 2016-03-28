package appcore.com.androidux;

/**
 * Created by jeremyw on 28/03/2016.
 */
public class Person {

    private String name;
    private String email;

    public Person(String n, String e)
    {
        name = n;
        email = e;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
