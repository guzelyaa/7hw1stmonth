package com.guzelya;

public class Magic extends Hero{
    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Magic применил суперсбособность " + superAbilityType);
    }
}
