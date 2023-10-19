/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator.gof;

/**
 *
 * @author fa20-bse-172
 */
public class University {
   private String name;

   public University(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void sendMessageToUniversity(String message) {
      ChatRoom.sendMessage(this, message);
   }
}
