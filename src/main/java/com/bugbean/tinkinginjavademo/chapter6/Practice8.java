package com.bugbean.tinkinginjavademo.chapter6;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-02-26 18:00
 */

public class Practice8 {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            Connection connection = ConnectionManager.getConnection();
            System.out.println(connection);
        }
    }
}

class ConnectionManager {
    private static Connection[] connections;
    private static int connCount = 10;

    static {
        connections = new Connection[connCount];
        for (int i = 0; i < connCount; i++) {
            connections[i] = Connection.getInstance();
        }
    }

    public static Connection getConnection() {
        if (connCount == 0) {
            return null;
        }
        Connection connection = connections[--connCount];
        connections[connCount] = null;
        return connection;
    }
}

class Connection {
    private Connection() {
        System.out.println("Connection()");
    }

    public static Connection getInstance() {
        return new Connection();
    }
}