package handler;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import message.ConversationDetailsRequest;
import message.ConversationDetailsResponse;
import router.MessengerRequestHandler;

/**
 * Created by User on 15.03.2017.
 */
public class ConversationDetailsHandler extends AbstractRequestHandler<ConversationDetailsRequest, ConversationDetailsResponse>
        implements MessengerRequestHandler {


    @Override
    public String getName() {
        return "get_conversation_details";
    }



    @Override
    public Response<ConversationDetailsResponse> handle(Request request) {
        Response <ConversationDetailsResponse> response = new Response<ConversationDetailsResponse>();
        response.setData(new ConversationDetailsResponse());
        response.setHeader(request.getHeader());
        System.out.println("ConversationDetailsHandle");
        return response;
    }
}
