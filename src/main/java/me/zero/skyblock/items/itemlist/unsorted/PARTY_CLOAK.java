package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PARTY_CLOAK extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Party Cloak";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PARTY_CLOAK"; 
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
        return Tier.UNCOMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxNDI0MTEyOTE3NCwKICAicHJvZmlsZUlkIiA6ICJiOThjNGFkOGM2MjY0NGYxOWUzYzhhZTE0ZThhMDI1OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ5cnRlZGR5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzI2OWViODljMjYwMGE0OGIwOGMzMzBkNWEwNjUyNGE5OWY1MGNiNDhkMDg0MTQ0MThiMzJhY2I3YWJhYzIwZDkiCiAgICB9CiAgfQp9";
    }

}
