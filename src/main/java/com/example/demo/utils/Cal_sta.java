package com.example.demo.utils;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Cal_sta {

    double Sum(double[] data) {
        double sum = 0;
        for (int i = 0; i < data.length; i++){
            sum = sum + data[i];
        }
        return sum;
    }

    double Mean(double[] data) {
        double mean = 0;
        mean = Sum(data) / data.length;
        return mean;
    }

    // population variance 总体方差
    double POP_Variance(double[] data) {
        double variance = 0;
        for (int i = 0; i < data.length; i++) {
            variance = variance + (Math.pow((data[i] - Mean(data)), 2));
        }
        variance = variance / data.length;
        return variance;
    }

    // population standard deviation 总体标准差
    double POP_STD_dev(double[] data) {
        double std_dev;
        std_dev = Math.sqrt(POP_Variance(data));
        return std_dev;
    }

    //sample variance 样本方差
    double Sample_Variance(double[] data) {
        double variance = 0;
        for (int i = 0; i < data.length; i++) {
            variance = variance + (Math.pow((data[i] - Mean(data)), 2));
        }
        variance = variance / (data.length-1);
        return variance;
    }

    // sample standard deviation 样本标准差
    double Sample_STD_dev(double[] data) {
        double std_dev;
        std_dev = Math.sqrt(Sample_Variance(data));
        return std_dev;
    }


    double Sample_POW_dev(Map<Double, List<Double>> data){
        double pow_dev = 0;
        Iterator<Double> keys = data.keySet().iterator();
        Double dataChildResult = null;
        while (keys.hasNext()){
            double key= keys.next();
            List<Double> dataChild = data.get(key);
            dataChild.forEach(dataChildMean ->
                    dataChildResult = Math.pow(key-dataChildMean,2));
        }
        return pow_dev;
    }
}