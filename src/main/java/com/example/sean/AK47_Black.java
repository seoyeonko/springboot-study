package com.example.sean;

import org.springframework.stereotype.Component;

@Component
public class AK47_Black implements Weapon {

    @Override
    public void fire() {
        System.out.println("🔫🔫 탕! x 20");
    }

    @Override
    public void reload() {
        System.out.println("🔥🔥 20발 장전 완료!");
    }

}
