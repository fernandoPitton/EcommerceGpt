package com.example.EcommerceGpt.abstractClass;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class ProductAbstract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "ProductID")
    private Long productoId;
    @Column (name= "Nombre")
    private String nombre;
    @Column (name="Descripcion")
    private String descripcion;
    @Column(name="Precio")
    private double precio;
    @Column(name="Cantidad")
    private int cantidad;

    public ProductAbstract() {
    }

    public ProductAbstract(String nombre, String descripcion, double precio, int cantidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
