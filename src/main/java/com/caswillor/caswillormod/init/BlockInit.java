package com.caswillor.caswillormod.init;

import com.caswillor.caswillormod.CasWillorMod;
import com.caswillor.caswillormod.objects.blocks.CasWillorSaplingBlock;
import com.caswillor.caswillormod.objects.blocks.CottonCropBlock;
import com.caswillor.caswillormod.objects.blocks.GemOres;
import com.caswillor.caswillormod.world.feature.BlackSpruceTree;
import com.caswillor.caswillormod.world.feature.IronwoodTree;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GrassBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.LogBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit
{
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, CasWillorMod.MOD_ID);
	
	//Blocks
	public static final RegistryObject<Block> peat_soil = BLOCKS.register("peat_soil", () -> new GrassBlock(Block.Properties.create(Material.ORGANIC)
			.tickRandomly().hardnessAndResistance(0.5F).sound(SoundType.GROUND)));
	
	//Crops
	public static final RegistryObject<Block> cotton_crop = BLOCKS.register("cotton_crop", () -> new CottonCropBlock(Block.Properties.create(Material.PLANTS)
			.hardnessAndResistance(0.0F).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	
	//Logs
	public static final RegistryObject<Block> ironwood_log = BLOCKS.register("ironwood_log", () -> 
		new LogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_LOG)));
	public static final RegistryObject<Block> blackspruce_log = BLOCKS.register("blackspruce_log", () -> 
		new LogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.SPRUCE_LOG)));
	
	//Leaves
	public static final RegistryObject<Block> ironwood_leaves = BLOCKS.register("ironwood_leaves", () -> 
		new LeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES)));
	public static final RegistryObject<Block> blackspruce_leaves = BLOCKS.register("blackspruce_leaves", () -> 
		new LeavesBlock(Block.Properties.from(Blocks.SPRUCE_LEAVES)));
	
	//Saplings
	public static final RegistryObject<Block> ironwood_sapling = BLOCKS.register("ironwood_sapling", () ->
		new CasWillorSaplingBlock(() -> new IronwoodTree(), Block.Properties.from(Blocks.OAK_SAPLING)));
	public static final RegistryObject<Block> blackspruce_sapling = BLOCKS.register("blackspruce_sapling", () ->
		new CasWillorSaplingBlock(() -> new BlackSpruceTree(), Block.Properties.from(Blocks.SPRUCE_SAPLING)));
	
	//Planks
	public static final RegistryObject<Block> ironwood_plank = BLOCKS.register("ironwood_plank", () -> new Block(Block.Properties.from(Blocks.OAK_PLANKS)));
	public static final RegistryObject<Block> blackspruce_plank = BLOCKS.register("blackspruce_plank", () -> new Block(Block.Properties.from(Blocks.SPRUCE_PLANKS)));
	
	//Ores
	public static final RegistryObject<Block> bossite_ore = BLOCKS.register("bossite_ore", () -> new Block(Block.Properties.create(Material.ROCK)
			.hardnessAndResistance(3.0F, 10.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> hobbitium_ore = BLOCKS.register("hobbitium_ore", () -> new Block(Block.Properties.create(Material.ROCK)
			.hardnessAndResistance(3.0F, 10.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> shale_ore = BLOCKS.register("shale_ore", () -> new GemOres(Block.Properties.create(Material.ROCK)
			.hardnessAndResistance(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> wolfram_ore = BLOCKS.register("wolfram_ore", () -> new Block(Block.Properties.create(Material.ROCK)
			.hardnessAndResistance(3.0F, 5.0F).sound(SoundType.STONE)));
	
}
