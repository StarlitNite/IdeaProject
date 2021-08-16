package com.example.sovo.common;

public class apiResp {
    private int code;
    private String message;
    private Object data;

    public apiResp(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public apiResp(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public apiResp() {
        this.code = Status.SUCCESS.code;
        this.message = Status.SUCCESS.message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public enum Status{
        INTERNAL_SERVER_ERROR(500,"Unknown Internal Error"),
        BAD_REQUEST(400, "Bad Request"),
        NOT_FOUND(404, "Not Found"),
        NOT_LOGIN(50000, "Not Login"),
        NOT_SUPPORTED_OPERATION(40006, "Operation not supported"),
        NOT_VALID_PARAM(40005, "Not valid Params"),
        SUCCESS(200, "OK");



        private int code;
        private String message;

        Status(int code, String message) {
            this.code = code;
            this.message = message;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
