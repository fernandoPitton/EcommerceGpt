package com.example.EcommerceGpt.repositories;

import com.example.EcommerceGpt.entitys.PhysicalProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhysicalProductRepository extends JpaRepository<PhysicalProduct,Long> {
}
