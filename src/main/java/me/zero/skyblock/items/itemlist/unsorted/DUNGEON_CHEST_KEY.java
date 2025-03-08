package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DUNGEON_CHEST_KEY extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Dungeon Chest Key";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DUNGEON_CHEST_KEY"; 
    }

    @Override
    public Material getMaterial() {
        return Material.TRIPWIRE_HOOK;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
