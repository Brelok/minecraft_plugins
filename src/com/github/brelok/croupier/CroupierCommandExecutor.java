package com.github.brelok.croupier;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Random;

import static com.github.brelok.croupier.BlueItems.blueItem;
import static com.github.brelok.croupier.BlueItems.listBlue;
import static com.github.brelok.croupier.GoldItems.goldItem;
import static com.github.brelok.croupier.MyInventory.addItemToInventory;
import static com.github.brelok.croupier.PinkItems.pinkItem;
import static com.github.brelok.croupier.RedItems.redItem;
import static com.github.brelok.croupier.VioletItems.violetItem;

public class CroupierCommandExecutor implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] strings) {

        return false;
    }


}
