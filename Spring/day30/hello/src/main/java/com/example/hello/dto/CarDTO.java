package com.example.hello.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true, includeFieldNames = true)
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
public class CarDTO {

    private String name;
    private int age;

    /*@JsonProperty("car_name")
    private String carName;
    @JsonProperty("car_number")
    private String carNumber;*/
}
