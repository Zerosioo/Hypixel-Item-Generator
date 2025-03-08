package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PARTY_BELT extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Party Belt";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PARTY_BELT"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxNDI0MTE1MzYwNSwKICAicHJvZmlsZUlkIiA6ICJhNzQ0NWIzOTdkMWY0ZjBiOTNkYTMwNGZjY2M2OTM1MiIsCiAgInByb2ZpbGVOYW1lIiA6ICJFc2tyYVRlVCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jNjMxMjc0YjRiZDg0ZmFlZjY0ZGMwMWVjM2Y1OGU3YmZiOWU4ZWYxZGEwOTk4MjI1ZTk3YmUzMjQ0YzljZGRhIgogICAgfQogIH0KfQ==";
    }

}
