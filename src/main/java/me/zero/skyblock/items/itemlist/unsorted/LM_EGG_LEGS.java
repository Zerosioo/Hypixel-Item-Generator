package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LM_EGG_LEGS extends SItem  {

    @Override
    public String getName() {
        return "Living Metal Pantspawn";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LM_EGG_LEGS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.MONSTER_EGG;
    }

    @Override
    public byte getDurability() {
        return 54;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

}
