package nl.josephk.web.controllers;

import nl.josephk.web.model.FrontPageModel;

import org.springframework.stereotype.Controller;

/**
 * Created by ame21103 on 4-5-2016.
 */
@Controller
public class WelcomPageController {

    private final FrontPageModel frontPageModel;

    public WelcomPageController(FrontPageModel frontPageModel) {
        this.frontPageModel = frontPageModel;
    }



}
