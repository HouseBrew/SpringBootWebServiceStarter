package com.housebrew.springtemplate.bases;

import com.google.gson.annotations.SerializedName;

public class BaseResponseModel {

    @SerializedName("error_body")
    private ErrorBody errorBody;

    public BaseResponseModel() {
        this.errorBody = new ErrorBody();
    }

    public BaseResponseModel(ErrorBody errorBody) {
        this.errorBody = errorBody;
    }

    public ErrorBody getErrorBody() {
        return errorBody;
    }

    public static class ErrorBody {
        @SerializedName("user_message")
        private String userMessage;
        @SerializedName("internal_message")
        private String internalMessage;
        @SerializedName("error_code")
        private int errorCode;
        @SerializedName("request_id")
        private String requestId;

        public ErrorBody() {
            this.userMessage = "";
            this.internalMessage = "";
            this.errorCode = 0;
            this.requestId = "";
        }

        public ErrorBody(String userMessage, String internalMessage, int errorCode, String requestId) {
            this.userMessage = userMessage;
            this.internalMessage = internalMessage;
            this.errorCode = errorCode;
            this.requestId = requestId;
        }

        public String getUserMessage() {
            return userMessage;
        }

        public String getInternalMessage() {
            return internalMessage;
        }

        public int getErrorCode() {
            return errorCode;
        }

        public String getRequestId() {
            return requestId;
        }
    }
}
