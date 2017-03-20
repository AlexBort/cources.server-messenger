package message;

/**
 * Created by User on 09.03.2017.
 */
public class CreateConversationRequest {


    private String type; //тип чата

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMembersIds() {
        return membersIds;
    }

    public void setMembersIds(String membersIds) {
        this.membersIds = membersIds;
    }

    private String membersIds; // uuid


}
