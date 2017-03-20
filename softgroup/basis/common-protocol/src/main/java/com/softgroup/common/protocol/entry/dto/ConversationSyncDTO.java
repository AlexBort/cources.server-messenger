package com.softgroup.common.protocol.entry.dto;

/**
 * Created by user on 26.02.2017.
 */
public class ConversationSyncDTO {
    //id конверсейшна
    private String	id;
    //индекс последнего сообщения на клиенте
    private String lastMessageIndex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastMessageIndex() {
        return lastMessageIndex;
    }

    public void setLastMessageIndex(String lastMessageIndex) {
        this.lastMessageIndex = lastMessageIndex;
    }

}
