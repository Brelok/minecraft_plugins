package com.github.brelok.croupier;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VioletItems {

    public static List<ItemStack> violetList() {
        List<ItemStack> violetItemStacks = new ArrayList<>();
        violetItemStacks.add(new ItemStack(Material.DIAMOND_AXE));
        violetItemStacks.add(new ItemStack(Material.DAYLIGHT_DETECTOR));
        violetItemStacks.add(new ItemStack(Material.GOLD_BOOTS));
        violetItemStacks.add(new ItemStack(Material.GRAY_GLAZED_TERRACOTTA));
        violetItemStacks.add(new ItemStack(Material.GOLD_LEGGINGS));
        violetItemStacks.add(new ItemStack(Material.GOLD_ORE));
        violetItemStacks.add(new ItemStack(Material.NOTE_BLOCK));
        violetItemStacks.add(new ItemStack(Material.MAGMA));
        violetItemStacks.add(new ItemStack(Material.OBSIDIAN));

        return violetItemStacks;
    }

    public static ItemStack violetItem() {

        Random random = new Random();
        return violetList().get(random.nextInt(9) + 1);
    }
}
