package com.housebrew.springtemplate.models.respModels;

import com.housebrew.springtemplate.bases.BaseResponseModel;
import com.housebrew.springtemplate.models.dbModels.Restaurant;

public class GetRestaurantRespModel extends BaseResponseModel {
    private Restaurant data;

    public GetRestaurantRespModel(Restaurant data, ErrorBody errorBody) {
        super(errorBody);
        this.data = data;
    }

    public Restaurant getData() {
        return data;
    }
}