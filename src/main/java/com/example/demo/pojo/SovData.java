package com.example.demo.pojo;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
public class SovData {
    private String Product;
    private String Processeqp;
    private String measureeqp;
    private String lotid;
    private String Unit;
    private String Value;
    private double UnitMean;
    private double LotMean;
    private double MeasureeqpMean;
    private double ProcesseqpMean;
    private double ProductMean;

}
