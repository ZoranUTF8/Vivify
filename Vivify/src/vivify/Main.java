/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivify;

import CustomExceptions.BackpackFullException;
import CustomExceptions.NoWeaponException;
import CustomExceptions.WeaponNotAllowedException;

/**
 *
 * @author zoranhome
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws BackpackFullException, WeaponNotAllowedException,NoWeaponException {

        Wizard wizardCharacter = Wizard.getWizardObject();
        Swordsman swordsmanCharacter = Swordsman.getSwordsmanObject();

//        HEALTH CHECK TEST
//        System.out.println(wizardCharacter.getHealth());
//        System.out.println(swordsmanCharacter.getHealth());

//      FULL BACKPACK TEST  AND NOT ALLOWED WEAPONS TEST
//       wizardCharacter.addWeaponToBackPack("Luk");
//       wizardCharacter.addWeaponToBackPack("Mač");
//       wizardCharacter.addWeaponToBackPack("Koplje");
//      System.out.println(wizardCharacter.getBackpack());

//      LEARN MAGIC FOR WIZARD  DEFAULT IS FALSE
//         wizardCharacter.learnMagic();
//         wizardCharacter.hasMagic();

// SWORDSMAN BACKPACK TEST
        swordsmanCharacter.addWeaponToBackPack("Mač");
        swordsmanCharacter.addWeaponToBackPack("Koplje");
//        swordsmanCharacter.addWeaponToBackPack("Strijela");

// CHANGE WEAPON TEST
//swordsmanCharacter.setActiveWeapon(1);
//wizardCharacter.setActiveWeapon(0);

// DROP WEAPON TEST
//swordsmanCharacter.dropWeapon(0);

// ANIMALS TEST

Dragon dragon = Dragon.getDragonObject();
//
//dragon.Attack();


//Spider spider = Spider.getDragonObject();
//spider.Attack();

//FIGHT TEST

swordsmanCharacter.fight(dragon);




    }

}
