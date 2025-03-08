package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WARTS_STEW extends SItem  {

    @Override
    public String getName() {
        return "§cMushroom & Warts Stew";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oMade with love,","§7§oand an array of","§7§oslightly more","§7§oquestionable","§7§oingredients.")); 
    }

    @Override
    public String getId() {
        return "WARTS_STEW"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RABBIT_STEW;
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
