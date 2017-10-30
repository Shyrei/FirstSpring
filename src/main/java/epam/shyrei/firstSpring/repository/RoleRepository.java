package epam.shyrei.firstSpring.repository;

import epam.shyrei.firstSpring.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Project FirstSpring
 * Created by Uladzimir_Shyrei on 10/30/2017.
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
}
