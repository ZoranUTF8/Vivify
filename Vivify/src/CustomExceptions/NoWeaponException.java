/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomExceptions;

/**
 *
 * @author zoranhome
 */
public class NoWeaponException extends Exception{

    public NoWeaponException() {
        super("NO WEAPON IN YOUR BACKPACK");
    }
    
    
}
