/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.Proxy.Lab;

/**
 *
 * @author fa20-bse-172
 */
public class RemoteImage implements Image{
    @Override
    public void display(String actualSource) {
        System.out.println("Loading image from actual source "+actualSource);
    }
}