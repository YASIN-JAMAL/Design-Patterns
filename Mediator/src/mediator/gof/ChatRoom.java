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
import java.util.Date;
import java.util.List;

public class ChatRoom {
   public static void sendMessage(User user, String message) {
      System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
   }

   public static void sendMessage(User user, String message, Colleague target) {
      System.out.println(new Date().toString() + " [" + user.getName() + "] to [" + target.getName() + "] : " + message);
   }

   public static void sendMessage(User user, String message, List<Colleague> targets) {
      System.out.print(new Date().toString() + " [" + user.getName() + "] to [");
      for (int i = 0; i < targets.size(); i++) {
         System.out.print(targets.get(i).getName());
         if (i < targets.size() - 1) {
            System.out.print(", ");
         }
      }
      System.out.println("] : " + message);
   }

    static void showMessage(User aThis, String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

