package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SCARLETON_PORTAL extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Portal to Scarleton";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SCARLETON_PORTAL"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0MzA0NjAyODMxNywKICAicHJvZmlsZUlkIiA6ICI0MzE4YzBjMzY2ZGU0Y2NlOTIwMzlhZTJiODQ5NWNmYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJCbGFja1RoZUN1IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2I1NjBiNmVlMmFmYWI3OGQ1NjdmMGYxZDE1MTA0ZTFmYmJhNTczNGRmNzNkZWM0OWU3ZjNlZDhiOWNlZjYwNmQiCiAgICB9CiAgfQp9";
    }

}
