package com.example.sean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigurationExample {
    @Bean(name="ak47")
    @Primary
    public Weapon superAK47() {
        AK47 ak47 = new AK47();
        return ak47;
    }

    @Bean(name="ak47_b")
    public Weapon superAK47_Black() {
        AK47_Black ak47_black = new AK47_Black();
        return ak47_black;
    }
}

