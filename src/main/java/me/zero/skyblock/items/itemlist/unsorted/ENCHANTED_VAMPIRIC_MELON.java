package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_VAMPIRIC_MELON extends SItem  {

    @Override
    public String getName() {
        return "Enchanted Vampiric Melon";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("%%light_purple%%Motes","Worth more §7than","§7the sum of its","§7parts, because","§7it's glowing!")); 
    }

    @Override
    public String getId() {
        return "ENCHANTED_VAMPIRIC_MELON"; 
    }

    @Override
    public Material getMaterial() {
        return Material.MELON_BLOCK;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

}
