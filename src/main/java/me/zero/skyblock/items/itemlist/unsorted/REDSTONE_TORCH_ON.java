package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REDSTONE_TORCH_ON extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Redstone Torch";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REDSTONE_TORCH_ON"; 
    }

    @Override
    public Material getMaterial() {
        return Material.REDSTONE_TORCH_ON;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
