package com.example.demo.service;

import com.example.demo.pojo.SovData;

import java.util.ArrayList;
import java.util.List;

public class test {
    public void test1(){
        List<SovData> list =new ArrayList<SovData>();

    }
    double Mean(double[] data) {
        double mean = 0;
        mean = Sum(data) / data.length;
        return mean;
    }
    double Sum(double[] data) {
        double sum = 0;
        for (int i = 0; i < data.length; i++)
            sum = sum + data[i];
        return sum;
    }
}
