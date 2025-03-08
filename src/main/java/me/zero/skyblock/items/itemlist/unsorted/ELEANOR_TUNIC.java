package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ELEANOR_TUNIC extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Eleanor's Tunic";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oA beautifully","§8§otailored tunic,","§8§ofeaturing","§8§ointricate","§8§ostitching and a","§8§osoft, radiant","§8§ofinish.")); 
    }

    @Override
    public String getId() {
        return "ELEANOR_TUNIC"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_CHESTPLATE;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(255,215,0);
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

}
