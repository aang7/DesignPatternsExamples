package com.designpatterns.strategy.Characters;

import com.designpatterns.strategy.abstracts.Character;
import com.designpatterns.strategy.Weapons.SwordBehavior;

public class King extends Character {

    public King() {
        setWeapon(new SwordBehavior());
    }
}
