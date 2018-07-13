package com.housebrew.springtemplate.models.respModels;

import com.housebrew.springtemplate.bases.BaseResponseModel;

public class HealthCheckRespModel extends BaseResponseModel {

    private HealthCheckResponseData data;

    public HealthCheckRespModel(HealthCheckResponseData data, BaseResponseModel.ErrorBody errorBody) {
        super(errorBody);
        this.data = data;
    }

    public HealthCheckResponseData getData() {
        return data;
    }

    public static class HealthCheckResponseData {
        String status;

        private HealthCheckResponseData(String status) {
            this.status = status;
        }

        public static HealthCheckResponseData getAliveStatus() {
            return new HealthCheckResponseData(HealthStatus.ALIVE.name());
        }

        public static HealthCheckResponseData getDeadStatus() {
            return new HealthCheckResponseData(HealthStatus.DEAD.name());
        }

        enum HealthStatus {
            ALIVE, DEAD
        }
    }
}
