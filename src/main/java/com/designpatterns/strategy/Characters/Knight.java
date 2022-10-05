package com.designpatterns.strategy.Characters;

import com.designpatterns.strategy.abstracts.Character;
import com.designpatterns.strategy.Weapons.KnifeBehavior;

public class Knight extends Character {
    public Knight() {
        setWeapon(new KnifeBehavior());
    }
}
