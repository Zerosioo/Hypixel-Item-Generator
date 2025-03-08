package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NIGHTMARE_NULLIFIER extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Nightmare Nullifier";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Why have nightmares","when you can drink","coffee instead?")); 
    }

    @Override
    public String getId() {
        return "NIGHTMARE_NULLIFIER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CLAY_BALL;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
