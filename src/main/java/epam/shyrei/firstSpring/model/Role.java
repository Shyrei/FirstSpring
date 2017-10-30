package epam.shyrei.firstSpring.model;

import java.util.Set;

/**
 * Project FirstSpring
 * Created by Uladzimir_Shyrei on 10/30/2017.
 */
public class Role {
    private String name;
    private Long id;
    private Set<User> users;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
