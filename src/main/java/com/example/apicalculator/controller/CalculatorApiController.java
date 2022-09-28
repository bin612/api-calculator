package com.example.apicalculator.controller;

import com.example.apicalculator.dto.CalculatorReq;
import com.example.apicalculator.dto.CalculatorRes;
import com.example.apicalculator.service.DollarCalculator;
import com.example.apicalculator.service.ICalculator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorApiController {
    private final ICalculator iCalculator;

    public CalculatorApiController(DollarCalculator dollarCalculator) {
        this.iCalculator = dollarCalculator;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/sum")
    public int get(CalculatorReq calculatorReq) {
        int result = iCalculator.sum(calculatorReq.getX(), calculatorReq.getY());
        return result;
    }

    @PostMapping("/sum")
    public CalculatorRes post(@RequestBody CalculatorReq calculatorReq) {
        CalculatorRes res = new CalculatorRes();
        var sum = iCalculator.sum(calculatorReq.getX(), calculatorReq.getY());
        res.setResult(sum);

        var body = new CalculatorRes.Result();
        body.setResponseResult(sum);
        return res;

    }
}
