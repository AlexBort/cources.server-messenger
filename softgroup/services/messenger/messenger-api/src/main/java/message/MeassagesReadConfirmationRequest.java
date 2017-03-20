package message;

/**
 * Created by User on 09.03.2017.
 */
public class MeassagesReadConfirmationRequest {

    private String conversationId;             // :<uuid>
    private String messagesIds;                   // [<uuid>,....]



    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public String getMessagesIds() {
        return messagesIds;
    }

    public void setMessagesIds(String messagesIds) {
        this.messagesIds = messagesIds;
    }


}
