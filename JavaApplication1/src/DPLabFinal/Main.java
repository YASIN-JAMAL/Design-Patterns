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
public class Main {
    public static void main(String[] args) {
        // Create instances
        NotificationSystem notificationSystem = new NotificationSystem();
        CaseManagementSystem caseManagementSystem = new CaseManagementSystem();

        // Add observers (subscribers)
        MessageObserver announcementObserver = message -> System.out.println("Received announcement: " + message);
        notificationSystem.addObserver(announcementObserver);

        // Create communication strategy
        CommunicationStrategy announcementStrategy = new AnnouncementStrategy();

        // Use Builder pattern to create a message
        Message message = new MessageBuilder()
                .setContent("Important announcement: Please take action.")
                .build();

        // Use the strategy to send the message
        announcementStrategy.sendMessage(message.getContent());

        // Send a notification and handle non-compliance
        notificationSystem.sendNotification("Reminder: Complete the survey");

        // Simulate non-compliance
        caseManagementSystem.handleNonCompliance("Case details: Non-compliance identified.");
    }
}