package com.johnnytrapotti.heartsnipermod;

import net.fabricmc.api.ModInitializer;

public class HeartSniperMod implements ModInitializer {
    @Override
    public void onInitialize() {
        System.out.println("HeartSniperMod aktywowany!");
        // Tutaj będzie ładowanie configa, rejestracja klawisza i główna logika snajpera
        // Przykładowa metoda do parsowania ceny z lore:
        // int cena = parsePriceFromLore("Koszt: $581 (5811)");
    }

    // Przykładowa funkcja parsująca cenę z lore
    public static int parsePriceFromLore(String loreLine) {
        try {
            String prefix = "Koszt: $";
            if (loreLine.startsWith(prefix)) {
                String[] parts = loreLine.substring(prefix.length()).split(" ");
                String priceStr = parts[0].replaceAll("[^\\d]", "");
                return Integer.parseInt(priceStr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}