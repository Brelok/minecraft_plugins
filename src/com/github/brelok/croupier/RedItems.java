package com.github.brelok.croupier;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RedItems {

    public static List<ItemStack> redList() {
        List<ItemStack> redItemStacks = new ArrayList<>();
        redItemStacks.add(new ItemStack(Material.KNOWLEDGE_BOOK));
        redItemStacks.add(new ItemStack(Material.FIRE));
        redItemStacks.add(new ItemStack(Material.FERMENTED_SPIDER_EYE));
        redItemStacks.add(new ItemStack(Material.LAVA_BUCKET));
        redItemStacks.add(new ItemStack(Material.JUKEBOX));
        redItemStacks.add(new ItemStack(Material.LINGERING_POTION));
        redItemStacks.add(new ItemStack(Material.LEATHER_CHESTPLATE));
        redItemStacks.add(new ItemStack(Material.PURPLE_SHULKER_BOX));
        redItemStacks.add(new ItemStack(Material.REDSTONE));

        return redItemStacks;
    }

    public static ItemStack redItem() {


        Random random = new Random();
        return redList().get(random.nextInt(9) + 1);
    }
}
