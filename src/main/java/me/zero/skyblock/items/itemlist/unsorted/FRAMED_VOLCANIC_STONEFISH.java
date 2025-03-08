package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FRAMED_VOLCANIC_STONEFISH extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Framed Volcanic Stonefish";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FRAMED_VOLCANIC_STONEFISH"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ITEM_FRAME;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public int getPrice() {
        return 0;
    }

}
