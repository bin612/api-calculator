package com.example.apicalculator.dto;

import lombok.Data;

@Data
public class CalculatorRes {
    private int result;
    private Result body;

    @Data
    public static class Result {
        int responseResult;
    }
}
