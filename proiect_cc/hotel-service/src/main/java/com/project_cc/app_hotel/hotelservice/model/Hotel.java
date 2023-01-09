package com.project_cc.app_hotel.hotelservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value="hotel")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Hotel {
    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;

}