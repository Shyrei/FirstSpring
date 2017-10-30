package epam.shyrei.firstSpring.service;

import epam.shyrei.firstSpring.model.Bike;
import epam.shyrei.firstSpring.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Project FirstSpring
 * Created on 30.10.2017.
 * author Shyrei Uladzimir
 */

@Service
public class BikeServiceImpl implements BikeService {

    @Autowired
    private BikeRepository userRepository;

    @Override
    public void save(Bike bike) {
        bike.setBikeModel(bike.getBikeModel());
        bike.setBikeType(bike.getBikeType());
        userRepository.save(bike);
    }

    @Override
    public List<Bike> findAll(){
        return userRepository.findAll();
    }
}
