package com.example.sean;

import org.springframework.stereotype.Component;

@Component
public class AK47 implements Weapon {

    @Override
    public void fire() {
        System.out.println("🔫 탕! x 10");
    }

    @Override
    public void reload() {
        System.out.println("🔥 10발 장전 완료!");
    }

}
