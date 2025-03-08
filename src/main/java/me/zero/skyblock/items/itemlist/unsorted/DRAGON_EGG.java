package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DRAGON_EGG extends SItem  {

    @Override
    public String getName() {
        return "Dragon Egg";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DRAGON_EGG"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DRAGON_EGG;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

}
