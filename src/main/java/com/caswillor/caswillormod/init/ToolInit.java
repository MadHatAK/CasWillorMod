package com.caswillor.caswillormod.init;

import com.caswillor.caswillormod.CasWillorMod;
import com.caswillor.caswillormod.objects.items.HobbitiumPickaxe;
import com.caswillor.caswillormod.objects.items.HobbitiumPulaski;

import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ToolInit
{	
	public static final DeferredRegister<Item> TOOLS = new DeferredRegister<>(ForgeRegistries.ITEMS, CasWillorMod.MOD_ID);

	//BOSSITE
	public static final RegistryObject<Item> bossite_axe = TOOLS.register("bossite_axe", () -> 
		new AxeItem(CasWillorItemTier.BOSSITE, 5.0F, -3.0F, (new Item.Properties().group(CasWillorItemGroups.tabTools))));
	public static final RegistryObject<Item> bossite_hoe = TOOLS.register("bossite_hoe", () -> 
		new HoeItem(CasWillorItemTier.BOSSITE, -1.0F, (new Item.Properties().group(CasWillorItemGroups.tabTools))));
	public static final RegistryObject<Item> bossite_pickaxe = TOOLS.register("bossite_pickaxe", () -> 
		new PickaxeItem(CasWillorItemTier.BOSSITE, 1, -2.8F, (new Item.Properties().group(CasWillorItemGroups.tabTools))));
	public static final RegistryObject<Item> bossite_shovel = TOOLS.register("bossite_shovel", () -> 
		new ShovelItem(CasWillorItemTier.BOSSITE, 1.0F, -3.0F, (new Item.Properties().group(CasWillorItemGroups.tabTools))));
			
	//HOBBITIUM
	public static final RegistryObject<Item> hobbitium_pulaski = TOOLS.register("hobbitium_pulaski", () ->
		new HobbitiumPulaski(CasWillorItemTier.HOBBITIUM, 5.0F, -3.1F, (new Item.Properties().group(CasWillorItemGroups.tabTools))));
	public static final RegistryObject<Item> hobbiutm_pickaxe = TOOLS.register("hobbitium_pickaxe", () ->
		new HobbitiumPickaxe(CasWillorItemTier.HOBBITIUM, 1, -2.8F, (new Item.Properties().group(CasWillorItemGroups.tabTools))));
	
	//TUNGSTEN
	public static final RegistryObject<Item> tungstin_axe = TOOLS.register("tungsten_axe", () ->
		new AxeItem(CasWillorItemTier.TUNGSTEN, 5.0F, -3.0F, (new Item.Properties().group(CasWillorItemGroups.tabTools))));
	public static final RegistryObject<Item> tungsten_pickaxe = TOOLS.register("tungsten_pickaxe", () -> 
		new PickaxeItem(CasWillorItemTier.TUNGSTEN, 1, -2.8F, (new Item.Properties().group(CasWillorItemGroups.tabTools))));
	public static final RegistryObject<Item> tungsten_shovel = TOOLS.register("tungsten_shovel", () ->
		new ShovelItem(CasWillorItemTier.TUNGSTEN, 1.0F, -3.0F, (new Item.Properties().group(CasWillorItemGroups.tabTools))));
}