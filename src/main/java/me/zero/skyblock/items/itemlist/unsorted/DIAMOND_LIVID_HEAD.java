package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DIAMOND_LIVID_HEAD extends SItem implements ItemStatistics,SkullItem, Museum {

    @Override
    public String getName() {
        return "Diamond Livid Head";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DIAMOND_LIVID_HEAD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SKULL_ITEM;
    }

    @Override
    public byte getDurability() {
        return 3;
    }

    @Override
    public Tier getTier() {
        return Tier.SPECIAL;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public int getHealth() {
        return 160;
    }

    @Override
    public int getDefense() {
        return 60;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MjYwNzEwMCwKICAicHJvZmlsZUlkIiA6ICIzMjNiYjlkYzkwZWU0Nzk5YjUxYzE3NjRmZDRhNjI3OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJOcGllIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzkyNjhlMzY1MDVmMTMxMjM4NGViMzZlZDQ3N2Y0YzIwNTM1NzZjNjAwNThmZDI2YmVkZTI0ZDkwY2I0Y2Y3YmYiCiAgICB9CiAgfQp9";
    }

}
