package org.example;

import dev.robocode.tankroyale.botapi.Bot;
import dev.robocode.tankroyale.botapi.BotInfo;
import dev.robocode.tankroyale.botapi.Color;
import dev.robocode.tankroyale.botapi.events.ScannedBotEvent;

public class Cloudelie10 extends Bot{
    Double md = Double.MAX_VALUE;
    boolean fa = true;

    public Cloudelie10() {
        super(BotInfo.builder()
                .setVersion("1.0")
                .setName(System.getProperty("Cloudelie10"))
                .build());
    }

    @Override
    public void run() {
        setBodyColor(Color.NAVY);
        setBulletColor(Color.YELLOW);
        setGunColor(Color.WHITE);
        setRadarColor(Color.NAVY);
        while (isRunning()) {
            turnRadarRight(360);
        }
    }

    @Override
    public void onScannedBot(ScannedBotEvent e) {
        gun
    }

    public static void main(String[] args) {
        new Cloudelie10().start();
    }
}

