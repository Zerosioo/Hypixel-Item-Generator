package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CHILLED_PRISTINE_POTATO extends SItem  {

    @Override
    public String getName() {
        return "Chilled Pristine Potato";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CHILLED_PRISTINE_POTATO"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BAKED_POTATO;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

}
