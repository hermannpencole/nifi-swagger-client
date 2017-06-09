package com.github.hermannpencole.nifi.swagger;

/**
 * Created by SFRJ2737 on 2017-06-09.
 */
public class ErrorResponse {
    private String status;
    private String statusText;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }
}
