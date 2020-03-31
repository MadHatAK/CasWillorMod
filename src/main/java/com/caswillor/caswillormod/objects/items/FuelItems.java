package com.caswillor.caswillormod.objects.items;

import com.caswillor.caswillormod.init.ItemInit;
import net.minecraft.item.Item;

public class FuelItems extends Item
{
	public FuelItems(Item.Properties properties)
	{
		super(properties);
	}
	
	public int getBurnTime(Item item)
	{
		if(item == ItemInit.shale_gem.get())
		{
			return 12800;
		}
		else { return 0; }
	}
}
