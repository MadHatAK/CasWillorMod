package com.caswillor.caswillormod.objects.items;

import com.caswillor.caswillormod.init.ItemInit;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FuelItems extends Item
{
	public FuelItems(Item.Properties properties)
	{
		super(properties);
	}
	
	public int getBurnTime(ItemStack stack)
	{
		if(stack == new ItemStack(ItemInit.shale_gem.get()))
		{
			return 12800;
		}
		
		else { return -1; }
	}
	
}
