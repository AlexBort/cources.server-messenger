package com.softgroup.authorization.impl.handler;

import com.softgroup.authorization.api.message.LoginRequest;
import com.softgroup.authorization.api.message.LoginResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;

/**
 * Created by User on 25.02.2017.
 */

public class LoginHandler extends AbstractRequestHandler<LoginRequest, LoginResponse>
        implements AuthorizationRequestHandler

{

    public String getName() {
        return "login";
    }

    public Response<LoginResponse> handle(Request requestMessage) {
        Response<LoginResponse> response = new Response<LoginResponse>();
        response.setHeader(requestMessage.getHeader());
        response.setData(new LoginResponse());
        System.out.println("LoginResponseHandle");
        return response;
    }


}
