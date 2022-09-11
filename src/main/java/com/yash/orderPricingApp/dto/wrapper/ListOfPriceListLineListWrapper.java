package com.yash.orderPricingApp.dto.wrapper;

import com.yash.orderPricingApp.dto.entity.PriceListLineList;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ListOfPriceListLineListWrapper {
    private int size=0;
    private List<PriceListLineList> listOfPriceListLineList;
}
