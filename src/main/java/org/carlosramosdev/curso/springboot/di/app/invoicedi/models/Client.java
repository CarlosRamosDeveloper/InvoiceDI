package org.carlosramosdev.curso.springboot.di.app.invoicedi.models;

import org.springframework.beans.factory.annotation.Value;

public class Client {
    @Value("${client.name")
    private String name;
    @Value("${client.lastname}")
    private String lastname;

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
