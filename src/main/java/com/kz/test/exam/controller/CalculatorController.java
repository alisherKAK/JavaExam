package com.kz.test.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {

    @GetMapping("/web/calculator")
    public String Hello(@RequestParam(name = "a") double a, @RequestParam(name="b") double b,
                        @RequestParam(name="action") String action, Model model){
        double res = 0;
        switch(action){
            case "multiplication":
                res = a * b;
                break;
            case "addition":
                res =  a + b;
                break;
            case "subtraction":
                res =  a - b;
                break;
            case "division":
                res =  a / b;
                break;
        }

        model.addAttribute("res", res);
        return "calculate";
    }
}
