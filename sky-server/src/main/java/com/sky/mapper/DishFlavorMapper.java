package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper

public interface DishFlavorMapper {
    /**
     * 批量插入菜品口味数据
     * @param dishFlavorList
     */
    void insertBatch(List<DishFlavor> dishFlavorList);

    /**
     * 根据菜品的ID来删除与之相关联的口味数据
     * @param dishId
     */
    @Delete("delete from dish_flavor where dish_id = #{dishId}")
    void deleteByDishId(Long dishId);

    /**
     * 根据菜品的ID来批量删除与之相关联的口味数据
     * @param dishIds
     */
    void deleteByDishIds(List<Long> dishIds);
}
