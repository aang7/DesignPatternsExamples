package com.designpatterns.strategy.Characters;

import com.designpatterns.strategy.abstracts.Character;
import com.designpatterns.strategy.Weapons.BowAndArrowBehavior;

public class Queen extends Character {
    public Queen() {
        setWeapon(new BowAndArrowBehavior());
    }
}
