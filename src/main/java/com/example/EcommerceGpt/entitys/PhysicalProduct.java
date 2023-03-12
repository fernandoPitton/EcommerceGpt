package com.example.EcommerceGpt.entitys;

import com.example.EcommerceGpt.abstractClass.ProductAbstract;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "PhysicalProduct")
public class PhysicalProduct extends ProductAbstract {
    @Column(name="Peso")
    private Double peso;


    public PhysicalProduct() {
        super();
    }

    public PhysicalProduct(String nombre, String descripcion, double precio, int cantidad,Double weight) {
        super(nombre, descripcion, precio, cantidad);
        this.weight=weight;
    }


}
