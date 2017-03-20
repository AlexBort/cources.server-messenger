package com.softgroup.authorization.api.message;

import com.softgroup.common.protocol.ResponseData;

/**
 * Created by User on 06.03.2017.
 */
public class SmsConfirmResponse implements ResponseData {


    private String deviceToken;   // токен устройства для прохождения логина

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }
}
