package com.cambeeler;

import java.io.IOException;

public class Main {

    private static AppLogs logs;

    static {
        try {
            logs = new AppLogs("/Users/cam/JAVAapplogs.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        logs.printLogs("test");
    }
}
