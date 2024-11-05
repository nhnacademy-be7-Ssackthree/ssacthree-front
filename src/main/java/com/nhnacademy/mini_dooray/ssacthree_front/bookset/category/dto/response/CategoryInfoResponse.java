package com.nhnacademy.mini_dooray.ssacthree_front.bookset.category.dto.response;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryInfoResponse {

    private Long categoryId;

    @Setter
    private String categoryName;

    private boolean categoryIsUsed;

    @Setter
    private List<CategoryInfoResponse> children = new ArrayList<>();
    
}