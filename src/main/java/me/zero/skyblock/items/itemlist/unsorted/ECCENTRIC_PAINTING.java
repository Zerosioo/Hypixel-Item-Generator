package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ECCENTRIC_PAINTING extends SItem implements SkullItem, Sellable {

    @Override
    public String getName() {
        return "Eccentric Painting";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ECCENTRIC_PAINTING"; 
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
        return Tier.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0OTQxNjQwOTAxNywKICAicHJvZmlsZUlkIiA6ICIyYWQwZDlmMGUxMTM0ODM0OGVmNDQ0OWRmNTRlYTFkNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJGaXJlQjB5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzVlNDQyODBkNDJkYjA3YjAxMmViNzZkZWU3MzI0OWM4NmZjNzEyZThlYjE0ZmEyYjQ0ODQ3NzE0YmJiOTVmODMiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
