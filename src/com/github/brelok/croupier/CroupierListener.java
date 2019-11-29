package com.github.brelok.croupier;

import net.citizensnpcs.api.event.NPCRightClickEvent;
import net.citizensnpcs.api.npc.NPC;
import net.citizensnpcs.npc.*;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerMoveEvent;


import java.sql.NClob;
import java.util.Random;

import static com.github.brelok.croupier.BlueItems.blueItem;
import static com.github.brelok.croupier.BlueItems.listBlue;
import static com.github.brelok.croupier.GoldItems.goldItem;
import static com.github.brelok.croupier.MyInventory.addItemToInventory;
import static com.github.brelok.croupier.PinkItems.pinkItem;
import static com.github.brelok.croupier.RedItems.redItem;
import static com.github.brelok.croupier.VioletItems.violetItem;


public class CroupierListener implements Listener {

    private static int gold = 2;
    private static int red = 6;
    private static int pink = 12;
    private static int violet = 30;
    private static int blue = 50;


    public CroupierListener(Croupier plugin) {
    }

    @EventHandler
    public void clickOnCroupier(NPCRightClickEvent event) {

        NPC npc = event.getNPC();
        if (npc.getName().equalsIgnoreCase("croupier")) {
            Player player = event.getClicker();
            player.sendMessage("test");
            if (randomColorOfGift() == 2) {
                player.getInventory().addItem(goldItem());
                player.sendMessage("Brawo! Otrzymałeś " + goldItem().toString() + " z prezentu złotego");
            } else if (randomColorOfGift() == 6) {
                player.getInventory().addItem(redItem());
                player.sendMessage("Brawo! Otrzymałeś " + redItem().toString() + " z prezentu czerwonego");
            } else if (randomColorOfGift() == 12) {
                player.getInventory().addItem(pinkItem());
                player.sendMessage("Brawo! Otrzymałeś " + pinkItem().toString() + " z prezentu różowego");
            } else if (randomColorOfGift() == 30) {
                player.getInventory().addItem(violetItem());
                player.sendMessage("Brawo! Otrzymałeś " + violetItem().toString() + " z prezentu fioletowego");
            } else {
                player.openInventory(addItemToInventory(listBlue()));
                player.getInventory().addItem(blueItem());
                player.sendMessage("Brawo! Otrzymałeś " + blueItem().toString() + " z prezentu niebieskiego");

            }
        }

    }

    private static int randomColorOfGift() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; //bounds from 1 to 100

        int drawnColorGift = 0;

        if (randomNumber == 1 || randomNumber == 2) {
            drawnColorGift = gold;
        } else if (randomNumber >= 3 && randomNumber <= 8) {
            drawnColorGift = red;
        } else if (randomNumber >= 9 && randomNumber <= 20) {
            drawnColorGift = pink;
        } else if (randomNumber >= 21 && randomNumber <= 50) {
            drawnColorGift = violet;
        } else {
            drawnColorGift = blue;
        }
        return drawnColorGift;
    }
}
