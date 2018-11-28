package com.ntomlin.subgql.models;

public class Error {
    private String message;
    private String resolution;

    public String getMessage() {
        return message;
    }

    public Error setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getResolution() {
        return resolution;
    }

    public Error setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }

    public Error() {}
}
