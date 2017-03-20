package com.softgroup.common.router.api;

import com.softgroup.common.protocol.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by User on 01.03.2017.
 */

@Component
public class LessonRouterForTest {

    @Autowired
    private List<Handler> handlers;

    private Map<String, Handler> handlerMap;

    @PostConstruct
    public void init(){
        handlerMap = handlers.stream()
                .collect(Collectors.toMap(Handler::getName, Function.identity()));
    }

    public Handler getHandler(String key){
        return handlerMap.get(key);
    }

    public void route(Request<?> request){
        handlerMap.get(request.getHeader().getCommand()).handle(request);
    }
}