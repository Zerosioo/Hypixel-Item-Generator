package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GOBLIN_EGG_BLUE extends SItem  {

    @Override
    public String getName() {
        return "§3Blue Goblin Egg";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oWhat came first","§7§othe goblin or","§7§othe egg?")); 
    }

    @Override
    public String getId() {
        return "GOBLIN_EGG_BLUE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.MONSTER_EGG;
    }

    @Override
    public byte getDurability() {
        return 94;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

}
