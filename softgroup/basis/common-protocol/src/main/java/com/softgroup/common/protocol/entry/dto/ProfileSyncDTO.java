package com.softgroup.common.protocol.entry.dto;

/**
 * Created by user on 26.02.2017.
 */
public class ProfileSyncDTO {
    //ключ
    private	String	id;
    //дата изменения
    private	Long lastModified;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getLastModified() {
        return lastModified;
    }

    public void setLastModified(Long lastModified) {
        this.lastModified = lastModified;
    }
}
