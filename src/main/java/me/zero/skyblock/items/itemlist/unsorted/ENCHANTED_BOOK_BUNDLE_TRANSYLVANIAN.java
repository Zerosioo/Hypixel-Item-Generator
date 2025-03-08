package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_BOOK_BUNDLE_TRANSYLVANIAN extends SItem implements SkullItem, Sellable {

    @Override
    public String getName() {
        return "Enchanted Book Bundle";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENCHANTED_BOOK_BUNDLE_TRANSYLVANIAN"; 
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
    public boolean isUnStackable() {
        return true;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyNzM2MDU0MDg0OCwKICAicHJvZmlsZUlkIiA6ICIwYWFjMWRlZjUwZmI0N2RjODNmOGU2Njk3MTg1ODRkZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ0aGVhcGlpc2JhZCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xOWM3NjkwODMxNjNlOWFlYmQ4ZWQ1ZDY2YmViY2I5ZGYyMWNhYmFlNjNiYWFhYTBkM2FiZTE0MjBhNGFiNThmIgogICAgfQogIH0KfQ==";
    }

}
