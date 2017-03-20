package com.softgroup.common.protocol.entry.dto;

import com.softgroup.common.protocol.entry.Message;

import java.util.ArrayList;

/**
 * Created by user on 26.02.2017.
 */
public class ConversationFullDTO {

    //id конверсейшна
    private String id;
    //Сообщения
    private ArrayList<Message> messages;
    //Количество непрочитанных
    private Long totalUnread;
    //Существует ли конверсейшн
    private Boolean	exists;
    //Имя
    private String name;
    //Ссылка на логотип чата
    private String logoImageUri;
    //тип (0-индивидуальный, 1-групповой)
    private Integer	type;
    //индекс последнего сообщения
    private Long lastMessageIndex;
    //список ИД пользователей
    private ArrayList<String> membersIds;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

    public Long getTotalUnread() {
        return totalUnread;
    }

    public void setTotalUnread(Long totalUnread) {
        this.totalUnread = totalUnread;
    }

    public Boolean getExists() {
        return exists;
    }

    public void setExists(Boolean exists) {
        this.exists = exists;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoImageUri() {
        return logoImageUri;
    }

    public void setLogoImageUri(String logoImageUri) {
        this.logoImageUri = logoImageUri;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getLastMessageIndex() {
        return lastMessageIndex;
    }

    public void setLastMessageIndex(Long lastMessageIndex) {
        this.lastMessageIndex = lastMessageIndex;
    }

    public ArrayList<String> getMembersIds() {
        return membersIds;
    }

    public void setMembersIds(ArrayList<String> membersIds) {
        this.membersIds = membersIds;
    }




}
