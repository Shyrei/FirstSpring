package epam.shyrei.firstSpring.repository;

import epam.shyrei.firstSpring.model.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Project FirstSpring
 * Created by Uladzimir_Shyrei on 10/30/2017.
 */
public interface BikeRepository extends JpaRepository<Bike, Long> {

}
