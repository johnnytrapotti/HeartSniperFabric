package com.johnnytrapotti.heartsnipermod;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SniperLogger {
    private static final String LOG_FILE = "sniper_log.txt";
    private static boolean enabled = true;

    public static void setEnabled(boolean value) {
        enabled = value;
    }

    public static void logPurchase(String itemName, int price) {
        if (!enabled) return;
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            writer.write(String.format("[%s] Kupiono: %s za %d$\n", timestamp, itemName, price));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}