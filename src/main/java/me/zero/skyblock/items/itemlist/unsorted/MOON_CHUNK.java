package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MOON_CHUNK extends SItem  {

    @Override
    public String getName() {
        return "§fChunk of the Moon";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oWhere love is","§7§orife, the","§7§opreconceived","§7§olaws of physics","§7§omean nothing.")); 
    }

    @Override
    public String getId() {
        return "MOON_CHUNK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ENDER_STONE;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

}
