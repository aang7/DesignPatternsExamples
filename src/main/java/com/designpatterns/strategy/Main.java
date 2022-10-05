package com.designpatterns.strategy;

import com.designpatterns.strategy.Characters.King;
import com.designpatterns.strategy.Characters.Queen;
import com.designpatterns.strategy.Weapons.AxeBehavior;
import com.designpatterns.strategy.abstracts.Character;

public class Main {
    public static void main(String[] args) {
        Character king = new King();
        Character queen = new Queen();
        queen.fight();
        king.fight();
        king.setWeapon(new AxeBehavior());
        king.fight();
    }
}
