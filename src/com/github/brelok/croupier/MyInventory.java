package com.github.brelok.croupier;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class MyInventory implements InventoryHolder {

    public static Inventory myInventory = Bukkit.createInventory(null, 9, "MyInventory");

    public static Inventory addItemToInventory(List<ItemStack> list) {

        for (int i = 0; i <= 8; i++) {
            myInventory.setItem(i, list.get(i));

        }
        return myInventory;
    }

    @Override
    public Inventory getInventory() {
        return myInventory;
    }
}
