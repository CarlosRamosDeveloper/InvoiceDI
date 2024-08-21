package org.carlosramosdev.curso.springboot.di.app.invoicedi.models;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class Invoice {
    private Client client;
    @Value("${invoice.description}")
    private String description;
    private List<Item> items;

    public Invoice() {
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
