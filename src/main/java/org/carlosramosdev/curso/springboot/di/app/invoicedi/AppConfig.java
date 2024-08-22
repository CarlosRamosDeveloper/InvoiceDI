package org.carlosramosdev.curso.springboot.di.app.invoicedi;

import org.carlosramosdev.curso.springboot.di.app.invoicedi.models.Item;
import org.carlosramosdev.curso.springboot.di.app.invoicedi.models.Product;
import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySources({
        @PropertySource("classpath:data.properties")
})
public class AppConfig {
    @Bean("ItemsInvoiceSport")
    List<Item> itemsInvoiceGeneral(){
        return Arrays.asList(
                new Item(new Product("Mancuernas", 20), 20),
                new Item(new Product("Discos 2kg", 10), 100),
                new Item(new Product("Discos 20kg", 100), 20),
                new Item(new Product("Banda elástica de 10kg de resistencia", 30), 4)
        );
    }

    @Bean("ItemsInvoiceOffice")
    List<Item> itemsInvoiceOffice(){
        return Arrays.asList(
                new Item(new Product("Paquete 2'5kg folios 160gr", 15), 50),
                new Item(new Product("Paquete 10 lápices", 4), 30),
                new Item(new Product("Paquete 5 gomas", 10), 20),
                new Item(new Product("Bloque Post-its diferentes colores", 12.5), 10)
        );
    }
}
