package com.caswillor.caswillormod.init;

import com.caswillor.caswillormod.CasWillorMod;
import com.caswillor.caswillormod.objects.blocks.BlackSpruceDoorBlock;
import com.caswillor.caswillormod.objects.blocks.CasWillorSaplingBlock;
import com.caswillor.caswillormod.objects.blocks.CottonCropBlock;
import com.caswillor.caswillormod.objects.blocks.GemOres;
import com.caswillor.caswillormod.objects.blocks.IronwoodDoorBlock;
import com.caswillor.caswillormod.world.feature.BlackSpruceTree;
import com.caswillor.caswillormod.world.feature.IronwoodTree;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.GrassBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.LogBlock;
import net.minecraft.block.SandBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit
{
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, CasWillorMod.MOD_ID);
	
	//Blocks
	public static final RegistryObject<Block> peat_soil = BLOCKS.register("peat_soil", () -> new GrassBlock(Block.Properties.from(Blocks.GRASS_BLOCK)));
	public static final RegistryObject<Block> peat_dirt = BLOCKS.register("peat_dirt", () -> new Block(Block.Properties.from(Blocks.DIRT)));
	public static final RegistryObject<Block> permafrost_block = BLOCKS.register("permafrost_block", () -> 
			new Block(Block.Properties.create(Material.ICE).hardnessAndResistance(25.0F, 15.0F).harvestLevel(3).sound(SoundType.GLASS)));
	
	//Nether Blocks
	public static final RegistryObject<Block> black_sand = BLOCKS.register("black_sand", () -> new SandBlock(4210752, Block.Properties.from(Blocks.SAND)));
	public static final RegistryObject<Block> lavastone_ore = BLOCKS.register("lavastone_ore", () -> new GemOres(Block.Properties.create(Material.ROCK)
			.hardnessAndResistance(5.0F, 10.0F).sound(SoundType.STONE).lightValue(3)));
	
	//Crops
	public static final RegistryObject<Block> cotton_crop = BLOCKS.register("cotton_crop", () -> new CottonCropBlock(Block.Properties.create(Material.PLANTS)
			.hardnessAndResistance(0.0F).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	
	//Flowers
	public static final RegistryObject<Block> forget_menot = BLOCKS.register("forget_menot", () -> 
			new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0F)
					.sound(SoundType.PLANT)));
	
	//Logs
	public static final RegistryObject<Block> ironwood_log = BLOCKS.register("ironwood_log", () -> 
		new LogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_LOG)));
	public static final RegistryObject<Block> stripped_ironwood_log = BLOCKS.register("stripped_ironwood_log", () -> 
		new LogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.STRIPPED_OAK_LOG)));
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
	
	//Doors
	public static final RegistryObject<Block> ironwood_door = BLOCKS.register("ironwood_door", () -> new IronwoodDoorBlock(Block.Properties.from(Blocks.SPRUCE_DOOR)));
	public static final RegistryObject<Block> blackspruce_door = BLOCKS.register("blackspruce_door", () -> new BlackSpruceDoorBlock(Block.Properties.from(Blocks.SPRUCE_DOOR)));
	
	//Stairs
	public static final RegistryObject<Block> ironwood_stairs = BLOCKS.register("ironwood_stairs", () -> new StairsBlock(() -> 
			BlockInit.ironwood_plank.get().getDefaultState(), Block.Properties.create(Material.WOOD)));
	public static final RegistryObject<Block> blackspruce_stairs = BLOCKS.register("blackspruce_stairs", () -> new StairsBlock(() -> 
			BlockInit.blackspruce_plank.get().getDefaultState(), Block.Properties.create(Material.WOOD)));
	
	//Fences
	public static final RegistryObject<Block> ironwood_fence = BLOCKS.register("ironwood_fence", ()-> 
		new FenceBlock(Block.Properties.from(BlockInit.ironwood_plank.get())));
	public static final RegistryObject<Block> blackspruce_fence = BLOCKS.register("blackspruce_fence", ()-> 
		new FenceBlock(Block.Properties.from(BlockInit.blackspruce_plank.get())));
	
	//Ores
	public static final RegistryObject<Block> bossite_ore = BLOCKS.register("bossite_ore", () -> new Block(Block.Properties.create(Material.ROCK)
			.hardnessAndResistance(3.0F, 10.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> hobbitium_ore = BLOCKS.register("hobbitium_ore", () -> new Block(Block.Properties.create(Material.ROCK)
			.hardnessAndResistance(3.0F, 10.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> mithril_ore = BLOCKS.register("mithril_ore", () -> new Block(Block.Properties.create(Material.ROCK)
			.hardnessAndResistance(5.0F, 15.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> shale_ore = BLOCKS.register("shale_ore", () -> new GemOres(Block.Properties.create(Material.ROCK)
			.hardnessAndResistance(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> wolfram_ore = BLOCKS.register("wolfram_ore", () -> new Block(Block.Properties.create(Material.ROCK)
			.hardnessAndResistance(3.0F, 5.0F).sound(SoundType.STONE)));
	
	
	
}
