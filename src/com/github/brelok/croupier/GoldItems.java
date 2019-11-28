package com.github.brelok.croupier;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GoldItems {

    public static ItemStack goldItem() {

        List<ItemStack> goldItemStacks = new ArrayList<>();
        goldItemStacks.add(new ItemStack(Material.LEVER));
        goldItemStacks.add(new ItemStack(Material.MELON_BLOCK));
        goldItemStacks.add(new ItemStack(Material.PISTON_BASE));
        goldItemStacks.add(new ItemStack(Material.REDSTONE_ORE));
        goldItemStacks.add(new ItemStack(Material.WRITTEN_BOOK));
        goldItemStacks.add(new ItemStack(Material.FEATHER));
        goldItemStacks.add(new ItemStack(Material.GOLDEN_CARROT));
        goldItemStacks.add(new ItemStack(Material.GRASS));
        goldItemStacks.add(new ItemStack(Material.DIAMOND_HOE));

        Random random = new Random();
        return goldItemStacks.get(random.nextInt(9) + 1);
    }
}
