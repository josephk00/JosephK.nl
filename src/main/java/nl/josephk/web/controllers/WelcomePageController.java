package nl.josephk.web.controllers;

import nl.josephk.web.model.FrontPageModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ame21103 on 4-5-2016.
 */
@Controller

public class WelcomePageController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView initiateWelcomPage(){
       return new ModelAndView("initiateWelcomeMessage","command",new FrontPageModel());

    }

    @RequestMapping(value = "/addWelcomeMessage", method = RequestMethod.POST)
    public String showWelcomePage(@ModelAttribute("SpringWeb") FrontPageModel frontPageModel, ModelMap model) {
        model.addAttribute("welcomeMessage", frontPageModel.getWelcomeMessage());
        return "showWelcomeMessage";
    }

}
