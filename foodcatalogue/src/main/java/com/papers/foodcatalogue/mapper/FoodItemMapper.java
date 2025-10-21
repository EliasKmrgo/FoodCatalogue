package com.papers.foodcatalogue.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.papers.foodcatalogue.dto.FoodItemDTO;
import com.papers.foodcatalogue.entity.FoodItem;

@Mapper

public interface FoodItemMapper {
    FoodItemMapper INSTANCE = Mappers.getMapper(FoodItemMapper.class);

    FoodItem mapFoodItemDTOToFoodItem(FoodItemDTO foodItemDTO);

    FoodItemDTO mapFoodItemToFoodItemDTO(FoodItem foodItem);
}
