package com.example;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.text.MessageFormat;

@JsonIgnoreProperties(ignoreUnknown = true)
class Employee {

    private Data data;

    public Employee() {
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Employee'{'data={0}'}'", data);
    }
}
