package com.softgroup.authorization.impl.router;


import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.router.api.AbstractCommandRouterHandler;
import com.softgroup.common.router.api.CommandTypeRouter;


/**
 * Created by User on 24.02.2017.
 */
public class AuthorizationRouter extends AbstractCommandRouterHandler

        <AuthorizationRequestHandler> implements CommandTypeRouter {

    @Override
    public String getName() {
        return "authorization";
    }

}