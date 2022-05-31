/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivify;

import CustomExceptions.BackpackFullException;
import CustomExceptions.WeaponNotAllowedException;

/**
 *
 * @author zoranhome
 */
public class Wizard extends Character {

//    allow only one object creation
    static Wizard wizzard = new Wizard();
    

    private Wizard() {
        super(150,"Wizzard");
    }

    ;
    
    public static Wizard getWizardObject() {
        return wizzard;
    }
    
    
    private boolean magic = false;

    @Override
    public void addWeaponToBackPack(String weapon) throws BackpackFullException,WeaponNotAllowedException {

        if (this.backpack.size() > 1) {
            throw new BackpackFullException();
        } else {

            if (weapon.equalsIgnoreCase("Mač") || weapon.toLowerCase().equalsIgnoreCase("Koplje")) {
                throw new WeaponNotAllowedException();
                
            } else {
                this.backpack.add(weapon);
                System.out.println("You added " + weapon + " to your backpack.");

            }

        }

    };

    public void hasMagic() {
        if(this.magic){
            System.out.println("You have learned magic");
        }else{
            System.out.println("You didnt learn the magic skill");
        }
    }

    public void learnMagic() {
        this.magic = true;
    }

    @Override
    public void Attack() {
        
//       TO DO

    }
    
    

}
