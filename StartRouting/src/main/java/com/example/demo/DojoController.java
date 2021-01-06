package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DojoController {
	@RequestMapping("/{str}")
    public String index(@PathVariable("str") String str){
    	return "The " + str +" is awesome!";
    }
	@RequestMapping("/{burbank}")
    public String burbank(@PathVariable("burbank") String burbank){
		if (burbank.equals("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California";
		} else {
			return burbank + " is not located in Southern California";
		}
    }
	@RequestMapping("/{location}")
    public String dojoLocation(@PathVariable("location") String location){
		if (location.equals("san-jose")) {
			return "SJ dojo is the headquarters'";
		} else {
			return location+" dojo is not the headquarters'";
		}
    }
}
