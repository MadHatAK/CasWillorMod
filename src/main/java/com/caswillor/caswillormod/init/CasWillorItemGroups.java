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
            return new ItemStack(ItemInit.tungsten_ingot.get());
        }
    };
    public static final CasWillorItemGroups tabBlocks = new CasWillorItemGroups(ItemGroup.GROUPS.length, "tabBlocks")
    {
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon()
        {
            return new ItemStack(BlockInit.wolfram_ore.get());
        }
    };
    public static final CasWillorItemGroups tabTools = new CasWillorItemGroups(ItemGroup.GROUPS.length, "tabTools")
    {
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon()
        {
            return new ItemStack(ToolInit.hobbitium_pulaski.get());
        }
    };
    
    public static final CasWillorItemGroups tabCombat = new CasWillorItemGroups(ItemGroup.GROUPS.length, "tabCombat")
    {
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon()
        {
            return new ItemStack(WeaponInit.mithril_sword.get());
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