package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import service.UserService;
import service.service_spring_data.UserServiceRepo;

/**
 * Created by Vladyslava_Hubenko on 8/15/2018.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    UserService service;

    @RequestMapping(value = "users", method = RequestMethod.GET)
    public ModelAndView usersList(){
        ModelAndView mav = new ModelAndView("list_of_users");
        mav.addObject("userList", service.findAll());
        return mav;
    }

    @RequestMapping(value = "users/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteUser(@PathVariable int id){
        service.delete(id);

        ModelAndView mav = new ModelAndView("list_of_users");
        mav.addObject("userList", service.findAll());
        return mav;
    }

    @RequestMapping(value = "users/about/{id}", method = RequestMethod.GET)
    public ModelAndView aboutUser(@PathVariable int id){
        ModelAndView mav = new ModelAndView("about");
        mav.addObject("user", service.findById(id));
        return mav;
    }





}
