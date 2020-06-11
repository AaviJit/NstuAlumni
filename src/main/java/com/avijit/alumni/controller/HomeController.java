package com.avijit.alumni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author: Avijit Barua
 * Created On 6/11/20 at 1:45 PM
 * Project: alumni
 */
@Controller
public class HomeController {

    @GetMapping(value = {"/", "/home"})
    public String homePage() {
        return "index";
    }
}
