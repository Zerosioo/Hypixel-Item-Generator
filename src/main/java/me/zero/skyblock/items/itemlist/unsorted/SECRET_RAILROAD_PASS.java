package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SECRET_RAILROAD_PASS extends SItem  {

    @Override
    public String getName() {
        return "Secret Railroad Pass";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8Quest Item","§8","§8§7Show this pass","§7to the §bTicket","§bMaster§7.")); 
    }

    @Override
    public String getId() {
        return "SECRET_RAILROAD_PASS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.PAPER;
    }

    @Override
    public Tier getTier() {
        return Tier.SPECIAL;
    }

    @Override
    public boolean isUnStackable() {
        return true;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

}
