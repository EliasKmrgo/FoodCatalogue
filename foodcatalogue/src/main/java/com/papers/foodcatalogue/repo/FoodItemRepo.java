package com.papers.foodcatalogue.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.papers.foodcatalogue.entity.FoodItem;


@Repository
public interface FoodItemRepo extends JpaRepository<FoodItem, Long>{
    
}

