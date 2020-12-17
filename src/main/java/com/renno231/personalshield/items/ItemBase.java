package com.renno231.personalshield.items;

import com.renno231.personalshield.init.ModItems;
import com.renno231.personalshield.util.IHasModel;
import com.renno231.personalshield.util.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ItemBase extends Item implements IHasModel {
    public final String name;

    public ItemBase(String name) {
        //store the item name in a variable for use later on
        this.name = name;
        //set registry name using a resource location, so ps:ancient_amulet
        setRegistryName(new ResourceLocation(Reference.MOD_ID,name));
        //in case any other mods adds an ancient amulet, better to keep translations separated by using modid.item_name
        setUnlocalizedName(Reference.MOD_ID+"."+name);
        setCreativeTab(CreativeTabs.COMBAT);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        /*
        called on each item by ClientProxy in an event
        registers a model for the item, uses the item as a parameter (this), meta and a ModelResourceLocation,
        so similar to regular ResLoc, just extended by model variant parameter
        inventory is a default variant for both items and itemblocks (which is also a kind of item)
        the final result would be ps:ancient_amulet#inventory
        */
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + name, "inventory"));
    }
}
