package com.caswillor.caswillormod.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CasWillorItemGroups extends ItemGroup
{
    public static final CasWillorItemGroups tabMaterials = new CasWillorItemGroups(ItemGroup.GROUPS.length, "tabMaterials")
    {
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon()
        {
            return new ItemStack(ItemInit.tungsten_ingot);
        }
    };
    public static final CasWillorItemGroups tabBlocks = new CasWillorItemGroups(ItemGroup.GROUPS.length, "tabBlocks")
    {
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon()
        {
            return new ItemStack(BlockInit.wolfram_ore);
        }
    };
    public static final CasWillorItemGroups tabTools = new CasWillorItemGroups(ItemGroup.GROUPS.length, "tabTools")
    {
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon()
        {
            return new ItemStack(ItemInit.hobbitium_pulaski);
        }
    };
    
    private ItemStack item;
    
    private CasWillorItemGroups(int index, String label)
    {
        super(index, label);
    }
    
    @Override
    public ItemStack createIcon() 
    {
        return item;
    }
}