package com.moin.ecom.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String name;
    public String description;
    public String brand;
    public BigDecimal price;
    public String category;
    public boolean productInStock;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
    public Date releaseDate;
    public int stockQuantity;
    public String imageName;
    public String imageType;
    @Lob
    public byte[] imageData;

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    public byte[] getImageData() {
        return imageData;
    }
}
