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
public abstract class RiceWithDrinks implements Shape {
   protected Shape decoratedShape;

   public RiceWithDrinks(Shape decoratedShape){
      this.decoratedShape = decoratedShape;
   }

   @Override
   public void draw(){
      decoratedShape.draw();
   }	
}
