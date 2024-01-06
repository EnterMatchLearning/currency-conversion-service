package com.example.currencyconversionservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("currency-conversion")
public class CurrencyConversionConfiguration {

    private String currencyExchangeUrl;

    public String getCurrencyExchangeUrl() {
        return currencyExchangeUrl;
    }

    public void setCurrencyExchangeUrl(String currencyExchangeUrl) {
        this.currencyExchangeUrl = currencyExchangeUrl;
    }
}
