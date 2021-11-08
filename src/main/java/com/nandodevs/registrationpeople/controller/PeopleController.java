package com.nandodevs.registrationpeople.controller;

import com.nandodevs.registrationpeople.repository.PeopleRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class PeopleController {

    @RestController
    @RequestMapping("api/v1/registration")
    public class GetPeople{

        private PeopleRepository repository;

        void PeopleController(PeopleRepository peopleRepository){
            this.repository = peopleRepository;
        }


    }
}
