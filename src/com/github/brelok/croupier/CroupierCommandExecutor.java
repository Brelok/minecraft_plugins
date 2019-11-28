package com.github.brelok.croupier;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.time.LocalDate;
import java.util.Random;

import static com.github.brelok.croupier.BlueItems.blueItem;
import static com.github.brelok.croupier.GoldItems.goldItem;
import static com.github.brelok.croupier.PinkItems.pinkItem;
import static com.github.brelok.croupier.RedItems.redItem;
import static com.github.brelok.croupier.VioletItems.violetItem;

public class CroupierCommandExecutor implements CommandExecutor {

    private static int gold = 2;
    private static int red = 6;
    private static int pink = 12;
    private static int violet = 30;
    private static int blue = 50;


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] strings) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("randomGift")) {
                    if (randomColorOfGift() == 2) {
                        player.getInventory().addItem(goldItem());
                        sender.sendMessage("Brawo! Otrzymałeś " + goldItem().toString());
                    } else if (randomColorOfGift() == 6) {
                        player.getInventory().addItem(redItem());
                        sender.sendMessage("Brawo! Otrzymałeś " + redItem().toString());
                    } else if (randomColorOfGift() == 12) {
                        player.getInventory().addItem(pinkItem());
                        sender.sendMessage("Brawo! Otrzymałeś " + pinkItem().toString());
                    } else if (randomColorOfGift() == 30) {
                        player.getInventory().addItem(violetItem());
                        sender.sendMessage("Brawo! Otrzymałeś " + violetItem().toString());
                    } else {
                        player.getInventory().addItem(blueItem());
                        sender.sendMessage("Brawo! Otrzymałeś " + blueItem().toString());
                    }

            }

        } else {
            sender.sendMessage("Command only for players");

        }
        return true;
    }

    public int randomColorOfGift() {
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
