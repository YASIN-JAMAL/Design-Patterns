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
public interface Subject {
    void addObserver(MessageObserver observer);
    void removeObserver(MessageObserver observer);
    void notifyObservers(String message);
}
