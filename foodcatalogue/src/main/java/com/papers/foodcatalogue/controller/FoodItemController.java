package com.papers.foodcatalogue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.papers.foodcatalogue.dto.FoodItemDTO;
import com.papers.foodcatalogue.service.FoodItemService;

@RestController
@RequestMapping("/restaurant")
public class FoodItemController {
    @Autowired
    FoodItemService foodItemService;
    
    @GetMapping("/fetchAllRestaurants")
    public ResponseEntity<List<FoodItemDTO>> fetchAllRestaurants() {
        List<FoodItemDTO> allRestaurants = foodItemService.findAllfoodItems();
        return new ResponseEntity<>(allRestaurants, HttpStatus.OK);
    }
    
    @PostMapping("/addRestaurant")
    public ResponseEntity<FoodItemDTO> saveRestaurant(@RequestBody FoodItemDTO foodItemDTO) {
        FoodItemDTO restaurantAdded = foodItemService.addfoodItemInDB(foodItemDTO);
        return new ResponseEntity<>(restaurantAdded, HttpStatus.CREATED);
    }

    @GetMapping("/fetchById/{id}")
    public ResponseEntity<FoodItemDTO> findRestaurantById(@PathVariable Long id) {
        return foodItemService.fetchfoodItemById(id);
    }

}

