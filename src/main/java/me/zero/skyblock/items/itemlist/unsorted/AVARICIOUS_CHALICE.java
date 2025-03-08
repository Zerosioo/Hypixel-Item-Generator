package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AVARICIOUS_CHALICE extends SItem implements SkullItem, Sellable {

    @Override
    public String getName() {
        return "Avaricious Chalice";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7Said to make any","§7drink inside it","§7taste like","§7§6gold§7.")); 
    }

    @Override
    public String getId() {
        return "AVARICIOUS_CHALICE"; 
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
    public int getPrice() {
        return 0;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA1MjUwMTAwNSwKICAicHJvZmlsZUlkIiA6ICJlOTUyODY0OGZhYzU0ZDdlOGI0ZGU1NDhiMzU3MDY5OCIsCiAgInByb2ZpbGVOYW1lIiA6ICIwNjAwMDEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzE1Y2E5Njk1NGRiMzE5ZmVmNTk3NjU0ZTU4NjZlMDg5MWU2N2VlYWJkOTdkMjg5MTBmMTVkNjA5NGUyNDZiNyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
