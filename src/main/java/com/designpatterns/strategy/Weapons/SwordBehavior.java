package com.designpatterns.strategy.Weapons;

import com.designpatterns.strategy.abstracts.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("using sword.");
    }
}
