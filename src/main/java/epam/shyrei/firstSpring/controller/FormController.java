package epam.shyrei.firstSpring.controller;

import epam.shyrei.firstSpring.model.Bike;
import epam.shyrei.firstSpring.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Project FirstSpring
 * Created by Uladzimir_Shyrei on 10/30/2017.
 */

@Controller
public class FormController {

    @Autowired
    private BikeService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userJSP", new Bike());
        modelAndView.setViewName("index");
        return modelAndView;

    }

    @RequestMapping(value = "/save-bike")
    public ModelAndView checkUser(@ModelAttribute("userJSP") Bike bike) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("second");
        userService.save(bike);
        modelAndView.addObject("userJSP", bike);
        return modelAndView;

    }

    @RequestMapping(value = "/view-bikes", method = RequestMethod.GET)
    public ModelAndView findAllBikes() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("bikes");
        List<Bike> bikesList = userService.findAll();
        modelAndView.addObject("bikesList", bikesList);
        System.out.println(bikesList);
        return modelAndView;

    }



}

