/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author student
 */
public class Potato implements Food {

    public String taste() {
       return "Taste potato.";
    }

    public void eat() {
        System.out.println("Eat potato");
    }
    
    
}
