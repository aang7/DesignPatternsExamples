package com.designpatterns.strategy.Characters;

import com.designpatterns.strategy.abstracts.Character;
import com.designpatterns.strategy.Weapons.AxeBehavior;

public class Troll extends Character {
    public Troll() {
        setWeapon(new AxeBehavior());
    }
}
