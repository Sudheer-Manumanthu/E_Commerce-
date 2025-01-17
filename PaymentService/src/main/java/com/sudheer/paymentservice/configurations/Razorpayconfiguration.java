package com.sudheer.paymentservice.configurations;


import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Razorpayconfiguration {

    @Value("${razorpay.key}")
    private String keyId;

    @Value("${razorpay.secret}")
    private String keySecret;

    @Bean
    public RazorpayClient getRazorpayClient() throws RazorpayException {
        return new RazorpayClient(keyId, keySecret);
    }
}