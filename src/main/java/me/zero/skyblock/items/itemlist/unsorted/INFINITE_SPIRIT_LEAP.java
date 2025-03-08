package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class INFINITE_SPIRIT_LEAP extends SItem implements SkullItem, Sellable {

    @Override
    public String getName() {
        return "Infinileap";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "INFINITE_SPIRIT_LEAP"; 
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
        return Tier.EPIC;
    }

    @Override
    public boolean isUnStackable() {
        return true;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1MjE0NjYxMjc0MiwKICAicHJvZmlsZUlkIiA6ICI5ZWU3NTUxOGQyZWE0Y2Q4OGJiNGI1YTZkNmVhNTFjYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJNaWNyb3MxMTgyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzM3N2Q0YTIwNmQ3NzU3ZjQ3OWYzMzJlYzFhMmJiYmVlNTdjZWY5NzU2OGRkODhkZjgxZjQ4NjRhZWU3ZDNkOTgiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
