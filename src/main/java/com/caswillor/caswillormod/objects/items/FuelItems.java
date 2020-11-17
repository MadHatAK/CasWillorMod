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
	
	@Override
	public int getBurnTime(ItemStack fuelIn)
	{
		if (fuelIn != null && fuelIn.getItem().equals(ItemInit.shale_gem.get()))
		{
			return 12800;
		}
		
		else { return 0; }
	}
}
