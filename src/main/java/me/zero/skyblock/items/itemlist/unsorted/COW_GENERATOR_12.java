package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class COW_GENERATOR_12 extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Cow Minion XII";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "COW_GENERATOR_12"; 
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
        return Tier.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTQzMTQ3MjM5MywKICAicHJvZmlsZUlkIiA6ICJmNzM0MmExODMxZDA0ZDA5ODc4Y2ViOTVmOTUxYTllMSIsCiAgInByb2ZpbGVOYW1lIiA6ICJOb3RNMWtzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2MyOGU3ZjgyNDJkMzEyNzY1NGQxNWVhZGNlZWQzZmQwZDIzN2E5OWU0YzI2NzFhMDk0ZTFkNjAxZmIxZDllMWEiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
