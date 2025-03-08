package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ROOFED_FOREST_ISLAND extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Roofed Forest Island";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ROOFED_FOREST_ISLAND"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1MTc5ODAwNTQ5ODMsInByb2ZpbGVJZCI6IjIzZDE4YjNhN2E1NjQyM2E4NDZmZGJlNGVjYjJmNzJmIiwicHJvZmlsZU5hbWUiOiJHZW1pbml4UGxheXMiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2NkZTlkNGU0YzM0M2FmZGIzZWQ2ODAzODQ1MGZjNmE2N2NkMjA4YjJlZmM5OWZiNjIyYzcxOGQyNGFhYyJ9fX0=";
    }

}
