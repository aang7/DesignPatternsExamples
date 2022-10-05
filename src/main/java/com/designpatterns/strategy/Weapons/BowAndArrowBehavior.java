package com.designpatterns.strategy.Weapons;

import com.designpatterns.strategy.abstracts.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("using bow and arrow.");
    }
}
