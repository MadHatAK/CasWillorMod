package com.caswillor.caswillormod.init;

import com.caswillor.caswillormod.CasWillorMod;
import com.caswillor.caswillormod.objects.items.FuelItems;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit
{
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, CasWillorMod.MOD_ID);
	
	//Crops
	public static final RegistryObject<Item> cotton_seed = null;
	
	//Gems
	public static final RegistryObject<Item> shale_gem = ITEMS.register("shale_gem", () -> new FuelItems(new Item.Properties()
			.group(CasWillorItemGroups.tabMaterials)));
	
	//Ingots
	public static final RegistryObject<Item> bossite_ingot = ITEMS.register("bossite_ingot", () -> new Item(new Item.Properties()
			.group(CasWillorItemGroups.tabMaterials)));
	public static final RegistryObject<Item> hobbitium_ingot = ITEMS.register("hobbitium_ingot", () -> new Item(new Item.Properties()
			.group(CasWillorItemGroups.tabMaterials)));
	public static final RegistryObject<Item> tungsten_ingot = ITEMS.register("tungsten_ingot", () -> new Item(new Item.Properties()
			.group(CasWillorItemGroups.tabMaterials)));
}
