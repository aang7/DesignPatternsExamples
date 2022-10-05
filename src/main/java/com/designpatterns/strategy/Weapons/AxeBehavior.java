package com.designpatterns.strategy.Weapons;

import com.designpatterns.strategy.abstracts.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("using axe");
    }
}
