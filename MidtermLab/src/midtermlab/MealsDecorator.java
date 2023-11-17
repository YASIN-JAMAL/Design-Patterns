/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermlab;

/**
 *
 * @author fa20-bse-172
 */
public class MealsDecorator {
   public static void main(String[] args) {

      Shape type = new Beryani();

      Shape Salad = (Shape) new RiceWithSalad(new Beryani());

      Shape colddrinks = (Shape) new RiceWithSalad(new Rice());
      System.out.println("Beryani with Cold Drinks");
      type.draw();

      System.out.println("\nBeryani with Salad");
      colddrinks.draw();

      System.out.println("\nRice with Salad");
      colddrinks.draw();
   }
}
