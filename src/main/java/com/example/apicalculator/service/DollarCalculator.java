package com.example.apicalculator.service;

import org.springframework.stereotype.Service;

@Service
public class DollarCalculator implements ICalculator {
    private int market = 1;
    private MarketServer marketServer;

    public DollarCalculator(MarketServer marketServer) {
        this.marketServer = marketServer;
    }
    public void init() {
        this.market = marketServer.price();
    }

    @Override
    public int sum(int x, int y) {
        x *= market;
        y *= market;
        return x + y;
    }

    @Override
    public int minus(int x, int y) {
        x *= market;
        y *= market;
        return x - y;
    }

    @Override
    public int multiply(int x, int y) {
        x *= market;
        y *= market;
        return x * y;
    }

    @Override
    public int division(int x, int y) {
        x *= market;
        y *= market;
        return x / y;
    }
}
