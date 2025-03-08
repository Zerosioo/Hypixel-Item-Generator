package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ASPECT_OF_THE_JERRY_SIGNATURE extends SItem implements ItemStatistics, Museum {

    @Override
    public String getName() {
        return "Aspect of the Jerry, Signature Edition";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ASPECT_OF_THE_JERRY_SIGNATURE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.WOOD_SWORD;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

}
