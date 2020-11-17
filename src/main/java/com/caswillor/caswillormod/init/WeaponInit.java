package com.caswillor.caswillormod.init;

import com.caswillor.caswillormod.CasWillorMod;
import com.caswillor.caswillormod.objects.items.CasWillorBowItem;
import com.caswillor.caswillormod.objects.items.CasWillorAxeItem;
import com.caswillor.caswillormod.objects.items.WarSwordItem;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class WeaponInit
{
	public static final DeferredRegister<Item> WEAPONS = new DeferredRegister<>(ForgeRegistries.ITEMS, CasWillorMod.MOD_ID);
	
	//Axes
	public static final RegistryObject<Item> mithril_waraxe = WEAPONS.register("mithril_waraxe", () ->
		new CasWillorAxeItem(CasWillorItemTier.MITHRIL, 5.0F, -3.0F, (new Item.Properties().group(CasWillorItemGroups.tabCombat))));
	
	//Bows
	public static final RegistryObject<Item> valkyrie_bow = WEAPONS.register("valkyrie_bow", () -> 
	new CasWillorBowItem(new Item.Properties().maxDamage(500).group(CasWillorItemGroups.tabCombat)));
	
	//Swords
	public static final RegistryObject<Item> mithril_sword = WEAPONS.register("mithril_sword", () ->
		new WarSwordItem(CasWillorItemTier.MITHRIL, 5, -2.4F, (new Item.Properties().group(CasWillorItemGroups.tabCombat))));
	public static final RegistryObject<Item> lavastone_sword = WEAPONS.register("lavastone_sword", () -> 
		new WarSwordItem(CasWillorItemTier.LAVASTONE, 5, -2.4F, (new Item.Properties().group(CasWillorItemGroups.tabCombat))));
}
