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
public class WeaponNotAllowedException extends Exception{

    public WeaponNotAllowedException() {
        super("You cannot use that weapon");
    }
    
    
    
    
}
