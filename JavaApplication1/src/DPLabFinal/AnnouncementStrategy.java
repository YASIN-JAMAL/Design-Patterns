/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DPLabFinal;

/**
 *
 * @author fa20-bse-172
 */
public class AnnouncementStrategy implements CommunicationStrategy {
    @Override
    public void sendMessage(String message) {
        // Implement announcement strategy
        System.out.println("Announcement: " + message);
    }
}