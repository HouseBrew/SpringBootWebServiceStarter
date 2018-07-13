package com.housebrew.springtemplate.repos;

import com.housebrew.springtemplate.models.dbModels.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    @Query(value = "SELECT * FROM restaurant WHERE restaurant_id = :restaurantId LIMIT 1", nativeQuery = true)
    Optional<Restaurant> findByRestaurantId(@Param("restaurantId") String restaurantId);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "UPDATE restaurant SET name = :name WHERE restaurant_id = :restaurantId", nativeQuery = true)
    void updateRestaurantName(@Param("restaurantId") String restaurantId, @Param("name") String name);
}