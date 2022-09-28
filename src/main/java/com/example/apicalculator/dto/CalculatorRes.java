package com.example.apicalculator.dto;

import lombok.Data;

@Data
public class CalculatorRes {
    private int result;
    private Result body;

    public static class Result {
        int responseResult;
    }
}
