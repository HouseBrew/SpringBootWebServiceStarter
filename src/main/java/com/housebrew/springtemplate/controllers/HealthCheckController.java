package com.housebrew.springtemplate.controllers;

import com.housebrew.springtemplate.bases.BaseResponseModel;
import com.housebrew.springtemplate.models.respModels.HealthCheckRespModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/health")
public class HealthCheckController {

    @GetMapping("")
    @ResponseBody
    public ResponseEntity<HealthCheckRespModel> checkHealth() {
        HealthCheckRespModel respModel = new HealthCheckRespModel(HealthCheckRespModel.HealthCheckResponseData.getAliveStatus(), new BaseResponseModel.ErrorBody());
        return new ResponseEntity<>(respModel, HttpStatus.OK);
    }
}
