package nl.josephk.web.model;

/**
 * Created by ame21103 on 20-5-2016.
 */
public class User {

    long id;
    String name;
    String password;

    User(){}

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
