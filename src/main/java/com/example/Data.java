package com.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.text.MessageFormat;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Data {
    private Long id;
    private String email;
    private String avatar;
    private  String first_name;
    private  String last_name;

    public Data() {
    }

    public Long getId() {
        return this.id;
    }
    public String getEmail() {
        return this.email;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    private String getName(String first_name, String last_name) {
        return first_name + " " + last_name;
    }

    @Override
    public String toString() {
        final String string;
        string = MessageFormat.format("Data'{'id={0}, details=''{1}'', avatar=''{2}'', name=''{3}'''}'", id, email, avatar, getName(first_name, last_name));
        return string;
    }
}
