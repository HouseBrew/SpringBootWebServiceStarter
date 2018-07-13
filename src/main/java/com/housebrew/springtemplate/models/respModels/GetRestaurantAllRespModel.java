package com.housebrew.springtemplate.models.respModels;

import com.housebrew.springtemplate.bases.BaseResponseModel;
import com.housebrew.springtemplate.models.dbModels.Restaurant;

import java.util.List;

public class GetRestaurantAllRespModel extends BaseResponseModel {
    private List<Restaurant> data;

    public GetRestaurantAllRespModel(List<Restaurant> data, BaseResponseModel.ErrorBody errorBody) {
        super(errorBody);
        this.data = data;
    }

    public List<Restaurant> getData() {
        return data;
    }
}