package message;

import com.softgroup.common.protocol.RequestData;
import com.softgroup.common.protocol.ResponseData;

/**
 * Created by User on 09.03.2017.
 */
public class ConversationDetailsResponse implements ResponseData {

    private String conversationDetails;

    public String getConversationDetails() {
        return conversationDetails;
    }

    public void setConversationDetails(String conversationDetails) {
        this.conversationDetails = conversationDetails;
    }



}
