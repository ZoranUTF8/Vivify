/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivify;

import CustomExceptions.BackpackFullException;

/**
 *
 * @author zoranhome
 */
public class Swordsman extends Character {

    //    allow only one object creation
    static Swordsman swordsman = new Swordsman();

    private Swordsman() {
        super(100, "Swordsman");
    }

    ;
    
    public static Swordsman getSwordsmanObject() {
        return swordsman;
    }

    @Override
    public void addWeaponToBackPack(String weapon) throws BackpackFullException {

        if (this.backpack.size() > 1) {
            throw new BackpackFullException();
        } else {

            this.backpack.add(weapon);
            System.out.println("You added " + weapon + " to your backpack.");

        }

    }

    @Override
    public int Attack() {

        int attackOption = this.getAttackOption();

        String attackWith = this.backpack.get(attackOption);

        if (attackWith.equals("Mač")) {
            System.out.println("Swordsman is attacking with: " + this.backpack.get(attackOption) + " dealing 10 damage");
            return 10;
        } else if (attackWith.equals("Koplje")) {
            System.out.println("Swordsman is attacking with: " + this.backpack.get(attackOption) + " dealing 15 damage");
            return 15;
        }
        return 0;

    }
}
