package com.example.apicalculator;

import com.example.apicalculator.service.DollarCalculator;
import com.example.apicalculator.service.MarketServer;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiCalculatorApplicationTests {

    @Autowired
    public DollarCalculator dollarCalculator;

    @Mock
    public MarketServer marketServer;

	@Test
	void contextLoads() {
	}

}
