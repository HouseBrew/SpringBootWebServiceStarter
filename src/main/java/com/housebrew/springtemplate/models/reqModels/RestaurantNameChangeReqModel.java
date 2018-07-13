package com.housebrew.springtemplate.models.reqModels;

public class RestaurantNameChangeReqModel {
    private String name;

    public RestaurantNameChangeReqModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
