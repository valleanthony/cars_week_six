package com.example.cars_week_six;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    @Autowired
    CategoryRepo categoryRepo;

    @Autowired
    CarsRepo carsRepo;


}
