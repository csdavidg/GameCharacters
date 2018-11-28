package co.com.game.character;

import co.com.game.interfaces.WeaponBehavior;

public abstract class Character {

    WeaponBehavior weaponBehavior;

    public abstract void fight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
