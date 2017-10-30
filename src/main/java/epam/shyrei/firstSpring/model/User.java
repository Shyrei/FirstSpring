package epam.shyrei.firstSpring.model;

import org.springframework.stereotype.Component;

/**
 * Project FirstSpring
 * Created by Uladzimir_Shyrei on 10/30/2017.
 */
@Component
public class User {
    private String name;
    private String password;

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
