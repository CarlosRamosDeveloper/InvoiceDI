package org.carlosramosdev.curso.springboot.di.app.invoicedi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@Component
@RequestScope
@JsonIgnoreProperties({"targetSource","advisors"})
public class Invoice {
    @Autowired
    private Client client;
    @Value("${invoice.description.sports}")
    private String description;
    @Autowired
    @Qualifier("ItemsInvoiceSport")
    private List<Item> items;

    public Invoice() {
    }

    @PostConstruct
    public void init(){
        System.out.println("Creando el componente de la factura");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroyendo el componente o bean invoice");
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

    public double getFinalPrice(){
        double total = 0;

        for (Item item:items) {
            total += item.getTotal();
        }

        return total;
    }
}
