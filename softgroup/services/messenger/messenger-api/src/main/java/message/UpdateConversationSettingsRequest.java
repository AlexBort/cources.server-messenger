package message;

/**
 * Created by User on 09.03.2017.
 */
public class UpdateConversationSettingsRequest {

    private String conversationSettings;

    public String getConversationSettings() {
        return conversationSettings;
    }

    public void setConversationSettings(String conversationSettings) {
        this.conversationSettings = conversationSettings;
    }

    /*"{

command: update_conversation_settings,
data: {<conversationSettings>}
}"*/

}
