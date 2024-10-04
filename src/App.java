/*
* File: App.java
* Author: Varga Lilla
* Copyright: 2024, Varga Lilla
* Group: Szoft II-1-N
* Date: 2024-10-04
* Github: https://github.com/Lilla624/
* Licenc: GNU GPL
*/

public class App {
    public static void main(String[] args) throws Exception {
        Network network = new Network();
        network.connectToNetwork("OtthonWIFI");
        network.disconnectFromNetwork();
    }
}
