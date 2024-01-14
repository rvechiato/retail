package com.retail.productsapi.repositories;

import com.retail.productsapi.domain.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductsRepository extends JpaRepository<ProductEntity, UUID> {
}
