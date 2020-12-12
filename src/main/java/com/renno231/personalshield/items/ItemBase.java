package com.renno231.personalshield.items;

import com.renno231.personalshield.init.ModItems;
import com.renno231.personalshield.main;
import com.renno231.personalshield.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        main.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
