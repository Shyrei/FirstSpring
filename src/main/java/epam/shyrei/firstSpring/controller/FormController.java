package epam.shyrei.firstSpring.controller;

import epam.shyrei.firstSpring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Project FirstSpring
 * Created by Uladzimir_Shyrei on 10/30/2017.
 */

@Controller
public class FormController {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping (value = "/", method = RequestMethod.GET)
    public ModelAndView main(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userJSP", new User());
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping (value = "/check-user")
    public ModelAndView checkUser(@ModelAttribute("userJSP") User user){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("second");
        modelAndView.addObject("userJSP", user);
        return modelAndView;
    }
}
