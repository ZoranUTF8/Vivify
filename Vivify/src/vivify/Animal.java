/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivify;

import java.util.Random;

/**
 *
 * @author zoranhome
 */
public abstract class Animal {

    public abstract int Attack();

    public int getAttackOption() {

        Random random = new Random();
        
         return random.nextInt(2);   
    }

}
