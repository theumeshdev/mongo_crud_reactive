package com.uk.reactive.dto;

import com.uk.reactive.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private String id;
    private String typeName;
    private String size;
    private List<Product> productList;
}
