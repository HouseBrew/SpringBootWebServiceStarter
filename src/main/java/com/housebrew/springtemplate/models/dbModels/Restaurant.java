package com.housebrew.springtemplate.models.dbModels;

import com.google.gson.annotations.SerializedName;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "restaurant")
public class Restaurant {
    @Id
    @Column(name = "restaurant_id")
    @SerializedName("restaurant_id")
    private String restaurantId;

    private String name;

    @Column(name = "active")
    @SerializedName("active")
    private int isActive;

    private String category;

    @Column(name = "created_on")
    @SerializedName("created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;

    @Column(name = "updated_on")
    @SerializedName("updated_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;

    public String getRestaurantId() {
        return restaurantId;
    }

    public String getName() {
        return name;
    }

    public int getIsActive() {
        return isActive;
    }

    public String getCategory() {
        return category;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
