package org.example.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @RequestMapping({"/owners", "owners/index", "owners.html"})
    String listOwners() {
        return  "owners/index";
    }
}
