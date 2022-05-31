/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivify;

import java.util.ArrayList;
import CustomExceptions.BackpackFullException;
import CustomExceptions.WeaponNotAllowedException;
import CustomExceptions.NoWeaponException;
import java.util.Random;

/**
 *
 * @author zoranhome
 */
public abstract class Character {

    private int health;
    private String type;

    public abstract int Attack();

    ArrayList<String> backpack = new ArrayList<>();

    public int activeWeapon;

    public Character(int health, String type) {
        this.health = health;
        this.type = type;
    }

    public void setActiveWeapon(int slotNumber) throws NoWeaponException {

        try {
            if (this.backpack.isEmpty()) {
                throw new NoWeaponException();
            } else {
                System.out.println("Your active weapon is " + this.backpack.get(slotNumber));
                this.activeWeapon = slotNumber;
            }
        } catch (java.lang.IndexOutOfBoundsException e) {
            System.out.println("NO SUCH WEAPON. CHECK YOUR INPUT");
        }

    }

    public void dropWeapon(int slotNumber) throws NoWeaponException {

        try {
            if (this.backpack.isEmpty()) {
                throw new NoWeaponException();
            } else {
                backpack.remove(slotNumber);

                System.out.println("Your backpack contains now: " + this.backpack + " \n Your new active weapon is: " + this.backpack);
            }
        } catch (java.lang.IndexOutOfBoundsException e) {
            System.out.println("NO SUCH WEAPON. CHECK YOUR INPUT");
        }
    }

    public abstract void addWeaponToBackPack(String weapon) throws BackpackFullException, WeaponNotAllowedException;

    public int getAttackOption() {

        Random random = new Random();

        return random.nextInt(1);
    }

    public void fight(Animal monster) {

        Random random = new Random();

        int option = random.nextInt(101);

        if (option > 50) {
            monster.Attack();
        } else {
            this.Attack();
        }

    }

//    Getters & Setters
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ArrayList<String> getBackpack() {
        return backpack;
    }

    public void setBackpack(ArrayList<String> backpack) {
        this.backpack = backpack;
    }

    public String getType() {
        return type;
    }

}
