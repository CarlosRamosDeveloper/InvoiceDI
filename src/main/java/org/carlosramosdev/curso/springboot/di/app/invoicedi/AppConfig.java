package org.carlosramosdev.curso.springboot.di.app.invoicedi;

import org.carlosramosdev.curso.springboot.di.app.invoicedi.models.Item;
import org.carlosramosdev.curso.springboot.di.app.invoicedi.models.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySources({
        @PropertySource("classpath:data.properties")
})
public class AppConfig {
    @Bean("ItemsInvoiceCreation")
    List<Item> itemsInvoice(){
        return Arrays.asList(
                new Item(new Product("Teclado", 5), 3),
                new Item(new Product("Mando", 10), 10),
                new Item(new Product("Tijeras", 20), 1),
                new Item(new Product("Zapatillas", 3.5), 20)
        );
    }
}
