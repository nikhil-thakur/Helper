package demo.controller;

import demo.model.Helper;
import demo.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by nikhi_000 on 7/27/2015.
 */
@RequestMapping("/register")
public class registrationController {

    @Autowired
    RegistrationService registrationService;

    @RequestMapping(value = "/helper", method = RequestMethod.POST)
    public void registerHelper(Helper helper){
        registrationService.registerHelper(helper);
    }
}
