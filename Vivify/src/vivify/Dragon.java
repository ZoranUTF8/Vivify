/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivify;

/**
 *
 * @author zoranhome
 */
public class Dragon extends Animal {

    //    allow only one object creation
    static Dragon dragon = new Dragon();

    private Dragon() {
    }

    ;
    
    public static Dragon getDragonObject() {
        return dragon;
    }

    private String[] dragonAttackOptions = {"Udara", "Bljuje vatru"};

    @Override
    public int Attack() {
        int attackOption = getAttackOption();
        String attackWith = dragonAttackOptions[attackOption];

        if (attackWith.equals("Udara")) {

            System.out.println("Dragon is attacking with: " + dragonAttackOptions[attackOption] + " dealing 5 damage");
            return 5;
        } else if (attackWith.equals("Bljuje vatru")) {

            System.out.println("Dragon is attacking with: " + dragonAttackOptions[attackOption] + " dealing 20 damage");
            return 20;
        }
        return 0;
    }

}
