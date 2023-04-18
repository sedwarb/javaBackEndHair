package com.hairdressing.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Workers {
    @Id
    private Long id;
    private String fullname;

    public Workers() {
    }

    public Workers(Long id, String fullname) {
        this.id = id;
        this.fullname = fullname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
