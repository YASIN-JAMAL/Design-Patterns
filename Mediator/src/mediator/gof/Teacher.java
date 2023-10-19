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
public class Teacher {
   private String name;

   public Teacher(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void sendMessageToTeacher(String message) {
      ChatRoom.sendMessage(this, message);
   }
}
