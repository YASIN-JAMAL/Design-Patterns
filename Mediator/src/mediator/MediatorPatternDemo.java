/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author fa20-bse-172
 */
public class MediatorPatternDemo {
   public static void main(String[] args) {
      User robert = new User(" Ahmad");
      User john = new User("Khan");

      robert.sendMessage("Hi! Khan!");
      john.sendMessage("Hello! Ahmad!");
   }
}