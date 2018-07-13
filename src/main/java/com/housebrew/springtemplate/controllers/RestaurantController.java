package com.housebrew.springtemplate.controllers;

import com.housebrew.springtemplate.bases.BaseResponseModel;
import com.housebrew.springtemplate.models.dbModels.Restaurant;
import com.housebrew.springtemplate.models.reqModels.RestaurantNameChangeReqModel;
import com.housebrew.springtemplate.models.respModels.GetRestaurantAllRespModel;
import com.housebrew.springtemplate.models.respModels.GetRestaurantRespModel;
import com.housebrew.springtemplate.repos.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path = "/restaurant")
public class RestaurantController {
    @Autowired
    private RestaurantRepository restaurantRepository;

    @GetMapping(path = "/all")
    @ResponseBody
    public ResponseEntity<GetRestaurantAllRespModel> getAllRestaurant() {
        List<Restaurant> restaurants = restaurantRepository.findAll();
        GetRestaurantAllRespModel respModel = new GetRestaurantAllRespModel(restaurants, new BaseResponseModel.ErrorBody());
        return new ResponseEntity<>(respModel, HttpStatus.OK);
    }

    @GetMapping(path = "/{restaurantId}")
    @ResponseBody
    public ResponseEntity<BaseResponseModel> getRestaurantById(@PathVariable String restaurantId) {
        Optional<Restaurant> queryResult = restaurantRepository.findByRestaurantId(restaurantId);
        if (!queryResult.isPresent()) {
            return new ResponseEntity<>(new BaseResponseModel(), HttpStatus.NOT_FOUND);
        }

        GetRestaurantRespModel respModel = new GetRestaurantRespModel(queryResult.get(), new BaseResponseModel.ErrorBody());
        return new ResponseEntity<>(respModel, HttpStatus.OK);
    }

    @PostMapping(path = "/{restaurantId}/name")
    @ResponseBody
    public ResponseEntity<BaseResponseModel> changeRestaurantName(@PathVariable String restaurantId, @RequestBody RestaurantNameChangeReqModel reqModel) {
        // Request param not valid
        if (reqModel.getName() == null || reqModel.getName().isEmpty()) {
            return new ResponseEntity<>(new BaseResponseModel(), HttpStatus.BAD_REQUEST);
        }

        restaurantRepository.updateRestaurantName(restaurantId, reqModel.getName());
        return new ResponseEntity<>(new BaseResponseModel(), HttpStatus.OK);
    }
}
