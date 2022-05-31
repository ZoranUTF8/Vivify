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
public class Spider extends Animal{

    
    //    allow only one object creation
    static Spider spider = new Spider();

    private Spider() {
    };
    
    public static Spider getDragonObject() {
        return spider;
    }
    
    private String[] spiderAttackOptions = {"Udara","Ujeda"};
    
    

    @Override
    public int Attack() {
// TO DO
return 0;
    };
    
    
    
    
}
