package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ABIPHONE_XIV_ENORMOUS extends SItem implements SkullItem, Sellable {

    @Override
    public String getName() {
        return "Abiphone XIV Enormous";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ABIPHONE_XIV_ENORMOUS"; 
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
        return 180;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MjQwNTAzODIzNCwKICAicHJvZmlsZUlkIiA6ICIzY2MxMTY3MWU0MTM0ODM0YjhjMmZjMTY1OGE4OWU3OCIsCiAgInByb2ZpbGVOYW1lIiA6ICJSb3NzaTU2IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2FjYWIwOTY1YzIwZjFkZTAzZTc5OTgxM2FlOWNiNWUwOTQyZWJmNmVkZmU5OWEwMzAyNTQ3NzU1Y2JhNzg5NzEiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
