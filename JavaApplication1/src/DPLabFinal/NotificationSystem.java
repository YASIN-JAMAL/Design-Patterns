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
import java.util.ArrayList;
import java.util.List;

public class NotificationSystem implements Subject {
    private List<MessageObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(MessageObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(MessageObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (MessageObserver observer : observers) {
            observer.update(message);
        }
    }

    public void sendNotification(String message) {
        // Send notification and notify observers
        System.out.println("Sending notification: " + message);
        notifyObservers(message);
    }
}