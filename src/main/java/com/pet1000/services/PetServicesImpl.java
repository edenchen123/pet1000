package com.pet1000.services;

public class PetServicesImpl implements PetServices {

    public String getAllAvaServices(String userName) throws Exception {
           return "{'name':"+userName+"}";
    }


}
