/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonlab;

/**
 *
 * @author fa20-bse-172
 */
public class Demo {

	public static void main(String[] args) {
		Configuration config = Configuration.getInstance();
		System.out.println(config.getValue("mode"));
		System.out.println(config.getValue("font-size"));
		System.out.println(config.getValue("font-type"));

	}

}