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
public class RiceWithSalad extends RiceWithDrinks {

   public RiceWithSalad(Shape decoratedShape) {
      super(decoratedShape);		
   }

   public void draw() {
      decoratedShape.draw();	       
       Shape decoratedShape = null;
      setRedBorder(decoratedShape);
   }

   private void setRedBorder(Shape decoratedShape){
      System.out.println("Rice with: Salad");
   }
}
