package epam.shyrei.firstSpring.service;

import epam.shyrei.firstSpring.model.Bike;

import java.util.List;

/**
 * Project FirstSpring
 * Created on 30.10.2017.
 * author Shyrei Uladzimir
 */

public interface BikeService {
    void save(Bike bike);

    List<Bike> findAll();
}
