package com.example.EcommerceGpt.entitys;

import com.example.EcommerceGpt.abstractClass.ProductAbstract;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="DigitalProduct")
public class DigitalProduct extends ProductAbstract {
    public DigitalProduct() {
        super();
    }

    public DigitalProduct(String nombre, String descripcion, double precio, int cantidad) {
        super(nombre, descripcion, precio, cantidad);
    }
}
