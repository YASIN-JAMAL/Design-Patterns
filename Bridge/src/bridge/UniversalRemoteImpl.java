/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author fa20-bse-172
 */
public class UniversalRemoteImpl extends BasicRemote implements UniversalRemote {

    public UniversalRemoteImpl(Device device) {
        super(device);
    }

    @Override
    public void maxVolume() {
        System.out.println("Remote: setting max volume");
        device.setVolume(100);
    }
}