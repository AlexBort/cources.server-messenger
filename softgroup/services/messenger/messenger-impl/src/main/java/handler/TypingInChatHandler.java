package handler;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import message.TypingInChatRequest;
import message.TypingInChatResponse;
import router.MessengerRequestHandler;

/**
 * Created by User on 15.03.2017.
 */
public class TypingInChatHandler extends AbstractRequestHandler<TypingInChatRequest, TypingInChatResponse>
        implements MessengerRequestHandler {


    @Override
    public String getName() {
        return "is_typing_in_chat";
    }

    @Override
    public Response<TypingInChatResponse> handle(Request request) {
        Response <TypingInChatResponse> response = new Response<TypingInChatResponse>();
        response.setHeader(request.getHeader());
        response.setData(new TypingInChatResponse());
        System.out.println("TypingInChatHandle");
        return response;
    }
}
