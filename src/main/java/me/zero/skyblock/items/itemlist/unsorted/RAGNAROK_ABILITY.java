package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RAGNAROK_ABILITY extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Ragnarok";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RAGNAROK_ABILITY"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BEDROCK;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
