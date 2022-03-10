package com.careerdevs.StockInfoAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/Stock")
public class StockController {

    @Autowired
    private Environment env;

    private String alphaAdvantageEndpoint = "https://www.alphavantage.co/query?function=OVERVIEW&symbol=IBM&apikey=";

    /*
    @description:
    * Method: get
    * Path: / info
    * Host: localhost :4000
    * URL: // http://localhost:4000/Stock/info
     */

    @GetMapping("info")
    public Object infoHandler (RestTemplate restTemplate){
        String apikey = env.getProperty("APLHAADVANTAGE_API_KEY");
        return restTemplate.getForObject(alphaAdvantageEndpoint +apikey,Object.class);
    }
}
