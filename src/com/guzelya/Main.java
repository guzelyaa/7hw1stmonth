package com.guzelya;

public class Main {

    public static void main(String[] args) {
	Magic magic = new Magic();
	Medic medic = new Medic();
	Warrior warrior = new Warrior();

	Hero[] heroes = {magic, medic, warrior};

	for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] instanceof Magic){
                magic.applySuperAbility("Spell");
            }
            if (heroes[i] instanceof Medic){
                medic.applySuperAbility("Healing");
            }
            if (heroes[i] instanceof Warrior){
                warrior.applySuperAbility("Critical Damage");
            }
	}

    }
}
