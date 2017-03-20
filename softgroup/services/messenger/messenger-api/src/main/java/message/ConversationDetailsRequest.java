package message;

import com.softgroup.common.protocol.RequestData;

/**
 * Created by User on 09.03.2017.
 */
public class ConversationDetailsRequest implements RequestData{

    private String conversationId; //:<uuid>

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }


}
