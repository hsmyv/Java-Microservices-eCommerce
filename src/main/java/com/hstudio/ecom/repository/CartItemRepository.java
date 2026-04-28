package com.hstudio.ecom.repository;

import com.hstudio.ecom.model.CartItem;
import com.hstudio.ecom.model.Product;
import com.hstudio.ecom.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {

    CartItem findByUserAndProduct(User user, Product product);

    void deleteByUserAndProduct(User user, Product product);
}
