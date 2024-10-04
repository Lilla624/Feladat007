/*
* File: Connectable.java
* Author: Varga Lilla
* Copyright: 2024, Varga Lilla
* Group: Szoft II-1-N
* Date: 2024-10-04
* Github: https://github.com/Lilla624/
* Licenc: GNU GPL
*/

import java.sql.SQLException;

public interface Connectable {
    void connectToNetwork(String networkName) throws SQLException;
    void disconnectFromNetwork();
}
