package com.yash.orderPricingApp.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UpdateItemDTO {
    public String itemDescription;
    public String category;
    public String type;
    public String status;
    public String unitOfMeasure;

}
