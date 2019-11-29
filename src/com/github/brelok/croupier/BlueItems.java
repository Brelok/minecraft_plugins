package com.github.brelok.croupier;

import javafx.scene.paint.RadialGradient;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BlueItems {

    public static List<ItemStack> listBlue() {
        List<ItemStack> blueItemStacks = new ArrayList<>();
        blueItemStacks.add(new ItemStack(Material.APPLE));
        blueItemStacks.add(new ItemStack(Material.BED));
        blueItemStacks.add(new ItemStack(Material.CACTUS));
        blueItemStacks.add(new ItemStack(Material.BOAT_ACACIA));
        blueItemStacks.add(new ItemStack(Material.BIRCH_FENCE));
        blueItemStacks.add(new ItemStack(Material.COCOA));
        blueItemStacks.add(new ItemStack(Material.COAL_BLOCK));
        blueItemStacks.add(new ItemStack(Material.DARK_OAK_FENCE_GATE));
        blueItemStacks.add(new ItemStack(Material.COOKED_CHICKEN));

        return blueItemStacks;
    }

    public static ItemStack blueItem() {

        Random random = new Random();
        return listBlue().get(random.nextInt(9) + 1);
    }
}
