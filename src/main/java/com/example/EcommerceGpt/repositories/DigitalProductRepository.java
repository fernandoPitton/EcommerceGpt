package com.example.EcommerceGpt.repositories;

import com.example.EcommerceGpt.entitys.DigitalProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DigitalProductRepository extends JpaRepository<DigitalProduct,Long> {
}
