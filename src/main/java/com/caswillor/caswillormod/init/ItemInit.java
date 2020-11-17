package com.caswillor.caswillormod.init;

import com.caswillor.caswillormod.CasWillorMod;
import com.caswillor.caswillormod.objects.items.FuelItems;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit
{
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, CasWillorMod.MOD_ID);
	
	//Armor
	public static final RegistryObject<ArmorItem> mithril_helm = ITEMS.register("mithril_helm", () -> 
		new ArmorItem(CasWillorArmorMaterial.MITHRIL, EquipmentSlotType.HEAD, new Item.Properties().group(CasWillorItemGroups.tabCombat)));
	public static final RegistryObject<Item> mithril_chestplate = ITEMS.register("mithril_chestplate", () -> 
		new ArmorItem(CasWillorArmorMaterial.MITHRIL, EquipmentSlotType.CHEST, new Item.Properties().group(CasWillorItemGroups.tabCombat)));
	public static final RegistryObject<Item> mithril_leggings = ITEMS.register("mithril_leggings", () -> 
		new ArmorItem(CasWillorArmorMaterial.MITHRIL, EquipmentSlotType.LEGS, new Item.Properties().group(CasWillorItemGroups.tabCombat)));
	public static final RegistryObject<Item> mithril_boots = ITEMS.register("mithril_boots", () -> 
		new ArmorItem(CasWillorArmorMaterial.MITHRIL, EquipmentSlotType.FEET, new Item.Properties().group(CasWillorItemGroups.tabCombat)));
	
	public static final RegistryObject<ArmorItem> tungsten_helm = ITEMS.register("tungsten_helm", () -> 
		new ArmorItem(CasWillorArmorMaterial.TUNGSTEN, EquipmentSlotType.HEAD, new Item.Properties().group(CasWillorItemGroups.tabCombat)));
	public static final RegistryObject<Item> tungsten_chestplate = ITEMS.register("tungsten_chestplate", () -> 
		new ArmorItem(CasWillorArmorMaterial.TUNGSTEN, EquipmentSlotType.CHEST, new Item.Properties().group(CasWillorItemGroups.tabCombat)));
	public static final RegistryObject<Item> tungsten_leggings = ITEMS.register("tungsten_leggings", () -> 
		new ArmorItem(CasWillorArmorMaterial.TUNGSTEN, EquipmentSlotType.LEGS, new Item.Properties().group(CasWillorItemGroups.tabCombat)));
	public static final RegistryObject<Item> tungsten_boots = ITEMS.register("tungsten_boots", () -> 
		new ArmorItem(CasWillorArmorMaterial.TUNGSTEN, EquipmentSlotType.FEET, new Item.Properties().group(CasWillorItemGroups.tabCombat)));
	
	//Crops
	public static final RegistryObject<Item> cotton_seed = null;
	
	//Gems
	public static final RegistryObject<Item> dark_magma = ITEMS.register("dark_magma", () -> new Item(new Item.Properties()
			.group(CasWillorItemGroups.tabMaterials)));
	public static final RegistryObject<Item> lava_stone = ITEMS.register("lava_stone", () -> new Item(new Item.Properties()
			.group(CasWillorItemGroups.tabMaterials)));
	public static final RegistryObject<Item> shale_gem = ITEMS.register("shale_gem", () -> new FuelItems(new Item.Properties()
			.group(CasWillorItemGroups.tabMaterials)));
	
	
	//Ingots
	public static final RegistryObject<Item> bossite_ingot = ITEMS.register("bossite_ingot", () -> new Item(new Item.Properties()
			.group(CasWillorItemGroups.tabMaterials)));
	public static final RegistryObject<Item> hobbitium_ingot = ITEMS.register("hobbitium_ingot", () -> new Item(new Item.Properties()
			.group(CasWillorItemGroups.tabMaterials)));
	public static final RegistryObject<Item> mithril_ingot = ITEMS.register("mithril_ingot", () -> new Item(new Item.Properties()
			.group(CasWillorItemGroups.tabMaterials)));
	public static final RegistryObject<Item> tungsten_ingot = ITEMS.register("tungsten_ingot", () -> new Item(new Item.Properties()
			.group(CasWillorItemGroups.tabMaterials)));
	
	//Items
	
	public static final RegistryObject<Item> infinity_diamond = ITEMS.register("infinity_diamond", () -> new Item(new Item.Properties()
			.group(CasWillorItemGroups.tabMaterials)));
	public static final RegistryObject<Item> ironwood_stick = ITEMS.register("ironwood_stick", () -> new Item(new Item.Properties()
			.group(CasWillorItemGroups.tabMaterials)));
	public static final RegistryObject<Item> tungsten_haft = ITEMS.register("tungsten_haft", () -> new Item(new Item.Properties()
			.group(CasWillorItemGroups.tabMaterials)));
	public static final RegistryObject<Item> tungsten_rod = ITEMS.register("tungsten_rod", () -> new Item(new Item.Properties()
			.group(CasWillorItemGroups.tabMaterials)));
	

}
