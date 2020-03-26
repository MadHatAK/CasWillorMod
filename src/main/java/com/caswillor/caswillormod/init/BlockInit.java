package com.caswillor.caswillormod.init;

import com.caswillor.caswillormod.CasWillorMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(CasWillorMod.MOD_ID)
@Mod.EventBusSubscriber(modid = CasWillorMod.MOD_ID, bus = Bus.MOD)
public class BlockInit
{
	public static final Block wolfram_ore = null;
	public static final Block hobbitium_ore = null;
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event)
	{
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 10.0F)
				.sound(SoundType.STONE)).setRegistryName("hobbitium_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 5.0F)
				.sound(SoundType.STONE)).setRegistryName("wolfram_ore"));
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new BlockItem(hobbitium_ore, new Item.Properties().group(CasWillorItemGroups.tabBlocks)).setRegistryName("hobbitium_ore"));
		event.getRegistry().register(new BlockItem(wolfram_ore, new Item.Properties().group(CasWillorItemGroups.tabBlocks)).setRegistryName("wolfram_ore"));
	}
}
