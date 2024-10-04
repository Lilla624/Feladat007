/*
* File: Network.java
* Author: Varga Lilla
* Copyright: 2024, Varga Lilla
* Group: Szoft II-1-N
* Date: 2024-10-04
* Github: https://github.com/Lilla624/
* Licenc: GNU GPL
*/

public class Network implements Connectable {
    private String connectedNetwork;

    @Override
    public void connectToNetwork(String networkName) {
        connectedNetwork = networkName;
        System.out.println("Csatlakozva az " + networkName + " hálózathoz" );
    }

    @Override
    public void disconnectFromNetwork() {
        if (connectedNetwork != null) {
            System.out.println("A kapcsolat megszakadt az " + connectedNetwork + " hálózattal");
            connectedNetwork = null;
        } else {
            System.out.println("Nem vagy csatlakozva egyetlen hálózathoz sem.");
        }
    }
}

