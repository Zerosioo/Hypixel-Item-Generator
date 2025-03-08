package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ILLUSION_GLASS extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Illusion Glass";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ILLUSION_GLASS"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2NjcxOTk2MiwKICAicHJvZmlsZUlkIiA6ICIxNmFkYTc5YjFjMDk0MjllOWEyOGQ5MjgwZDNjNjE5ZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJMYXp1bGl0ZV9adG9uZSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zMTExOTUzMGI0OTAyZjdhMTkwYjU0YjdiNGNiNzI1YTUxMTUyOWRiNDVmMjJiNzJiNjQzMWY2ODQyYzI1MTUxIgogICAgfQogIH0KfQ==";
    }

}
