package com.CryptoTracker.CryptoController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Arrays;
import java.util.List;

@Controller
public class CryptoController {
    @GetMapping("/")
    public String show(){
        return "index";
    }
    @PostMapping("/track")
public String track(@RequestParam String coins, Model model){
        List<String> coinList= Arrays.asList(coins.split(","));

        return "result";
}
}
