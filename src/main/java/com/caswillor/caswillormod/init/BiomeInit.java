package com.caswillor.caswillormod.init;

import com.caswillor.caswillormod.CasWillorMod;
import com.caswillor.caswillormod.world.biomes.SubArcticTundraBiome;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.Biome.RainType;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeInit
{
	public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, CasWillorMod.MOD_ID);
	
	public static final RegistryObject<Biome> SUBARCTIC_TUNDRA = BIOMES.register("subarctic_tundra", () -> 
		new SubArcticTundraBiome(new Biome.Builder().precipitation(RainType.SNOW).scale(0.05F).temperature(0.2F).waterColor(3128528).waterFogColor(10870751)
				.surfaceBuilder(SurfaceBuilder.DEFAULT, 
						new SurfaceBuilderConfig(Blocks.GRASS_BLOCK.getDefaultState(), 
								BlockInit.peat_dirt.get().getDefaultState(), 
								BlockInit.permafrost_block.get().getDefaultState()))
				.category(Category.EXTREME_HILLS)
				.downfall(0.3F)
				.depth(0.125F)
				.parent(null)));
	/*
	public static final RegistryObject<Biome> NETHER_DESERT = BIOMES.register ("nether_desert", () -> 
		new NetherDesert(new Biome.Builder().precipitation(RainType.NONE).scale(0.05F).temperature(2.0F).waterColor(4159204).waterFogColor(329011)
				.surfaceBuilder(SurfaceBuilder.NETHER, 
						new SurfaceBuilderConfig(BlockInit.black_sand.get().getDefaultState(), 
								Blocks.NETHERRACK.getDefaultState(), 
								Blocks.NETHERRACK.getDefaultState()))
				.category(Category.NETHER)
				.downfall(0.0F)
				.depth(0.1F)
				.parent(null)));
	*/
	public static void registerBiomes()
	{
		registerBiome(SUBARCTIC_TUNDRA.get(), Type.PLAINS, Type.SPARSE, Type.OVERWORLD, Type.RIVER);
		//registerBiome(NETHER_DESERT.get(), Type.NETHER);
		
	}
	
	private static void registerBiome(Biome biome, Type... types)
	{
		if(biome == SUBARCTIC_TUNDRA.get())
		{
			BiomeManager.addBiome(BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 10));
			BiomeManager.addSpawnBiome(SUBARCTIC_TUNDRA.get());
		}
		/*if(biome == NETHER_DESERT.get())
		{
			BiomeManager.addBiome(BiomeType.DESERT, new BiomeManager.BiomeEntry(biome, 10));
			BiomeDictionary.addTypes(NETHER_DESERT.get(), Type.HOT);
		}
		*/
		
		BiomeDictionary.addTypes(biome, types);
		
		
	}
	
	
}
