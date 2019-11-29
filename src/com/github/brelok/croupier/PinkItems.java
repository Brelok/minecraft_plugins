package com.github.brelok.croupier;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PinkItems {

    public static List<ItemStack> pinkList() {
        List<ItemStack> pinkItemStacks = new ArrayList<>();
        pinkItemStacks.add(new ItemStack(Material.IRON_DOOR));
        pinkItemStacks.add(new ItemStack(Material.GRASS_PATH));
        pinkItemStacks.add(new ItemStack(Material.INK_SACK));
        pinkItemStacks.add(new ItemStack(Material.JUNGLE_FENCE));
        pinkItemStacks.add(new ItemStack(Material.LEAVES));
        pinkItemStacks.add(new ItemStack(Material.SADDLE));
        pinkItemStacks.add(new ItemStack(Material.RABBIT));
        pinkItemStacks.add(new ItemStack(Material.RAW_BEEF));
        pinkItemStacks.add(new ItemStack(Material.EYE_OF_ENDER));

        return pinkItemStacks;
    }

    public static ItemStack pinkItem() {


        Random random = new Random();
        return pinkList().get(random.nextInt(9) + 1);
    }
}
