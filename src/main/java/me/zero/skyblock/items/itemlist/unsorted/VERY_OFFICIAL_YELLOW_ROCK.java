package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VERY_OFFICIAL_YELLOW_ROCK extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "§eVery Official Yellow Rock of Love!";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oA majestic,","§7§oone-of-a-kind","§7§omineral that","§7§oglistens in the","§7§omorning sun.")); 
    }

    @Override
    public String getId() {
        return "VERY_OFFICIAL_YELLOW_ROCK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_NUGGET;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

}
