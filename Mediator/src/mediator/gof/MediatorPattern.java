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

 
public class MediatorPattern {
   public static void main(String[] args) {
      User robert = new User("Robert");
      User john = new User("John");
      University comsatsUniversity = new University("COMSATS University");
      University nust = new University("NUST");
      Teacher teacherAli = new Teacher("Teacher Sir Ali");
      User mAli = new User("M Ali");
      User ahmad = new User("Ahmad");
      User ali = new User("Ali");

      robert.sendMessage("Hi! John!");
      john.sendMessage("Hello! Robert!");

      mAli.sendMessage("Hi, this is M Ali.", comsatsUniversity);
      mAli.sendMessage("Hi, this is M Ali.", nust);
      mAli.sendMessage("Hi, this is M Ali.", teacherAli);
      mAli.sendMessage("Hi, this is M Ali.", ahmad, ali);
   }
}
