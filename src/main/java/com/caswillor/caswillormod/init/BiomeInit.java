package com.caswillor.caswillormod.init;

import com.caswillor.caswillormod.CasWillorMod;
import com.caswillor.caswillormod.world.biomes.TundraBiome;

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
	
	public static final RegistryObject<Biome> TUNDRA_BIOME = BIOMES.register("tundra_biome", () -> 
		new TundraBiome(new Biome.Builder().precipitation(RainType.SNOW).scale(0.05F).temperature(0.2F).waterColor(3128528).waterFogColor(10870751)
				.surfaceBuilder(SurfaceBuilder.DEFAULT, 
						new SurfaceBuilderConfig(Blocks.GRASS_BLOCK.getDefaultState(), 
								BlockInit.peat_dirt.get().getDefaultState(), 
								BlockInit.permafrost_block.get().getDefaultState()))
				.category(Category.EXTREME_HILLS)
				.downfall(0.3F)
				.depth(0.125F)
				.parent(null)));
	
	public static void registerBiomes()
	{
		registerBiome(TUNDRA_BIOME.get(), Type.PLAINS, Type.SPARSE, Type.OVERWORLD, Type.RIVER);
	}
	
	
	private static void registerBiome(Biome biome, Type... types)
	{
		BiomeManager.addBiome(BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 10));
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addSpawnBiome(biome);
	}
	
	
}
