package com.caswillor.caswillormod.world.gen;

import com.caswillor.caswillormod.init.BiomeInit;
import com.caswillor.caswillormod.init.BlockInit;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class CasWillorOreGen
{
	public static void generateOre()
	{
		for (Biome biome : ForgeRegistries.BIOMES)
		{
			ConfiguredPlacement<CountRangeConfig> bossiteConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(16, 20, 0, 75));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.bossite_ore.get().getDefaultState(), 10))
					.withPlacement(bossiteConfig));
			
			ConfiguredPlacement<CountRangeConfig> hobbitiumConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(16, 10, 0, 14));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.hobbitium_ore.get().getDefaultState(), 10))
					.withPlacement(hobbitiumConfig));
			
			ConfiguredPlacement<CountRangeConfig> wolframConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(5, 17, 0, 63));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.wolfram_ore.get().getDefaultState(), 10))
					.withPlacement(wolframConfig));
			
			if (biome == Biomes.DESERT)
			{
				ConfiguredPlacement<CountRangeConfig> shaleConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(50, 14, 0, 57));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.shale_ore.get().getDefaultState(), 10))
						.withPlacement(shaleConfig));
			}
			
			if (biome == BiomeInit.TUNDRA_BIOME.get())
			{
				ConfiguredPlacement<CountRangeConfig> shaleConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(50, 14, 0, 57));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.shale_ore.get().getDefaultState(), 10))
						.withPlacement(shaleConfig));
			}
		}
	}
}
