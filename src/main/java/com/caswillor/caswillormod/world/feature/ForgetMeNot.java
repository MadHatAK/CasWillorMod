package com.caswillor.caswillormod.world.feature;

import java.util.Random;

import com.caswillor.caswillormod.init.BlockInit;

import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;

public class ForgetMeNot
{
	public static final BlockClusterFeatureConfig FORGET_ME_NOT_CONFIG = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(BlockInit.forget_menot.get().getDefaultState()),
			new SimpleBlockPlacer()).tries(4).build());
	
	protected ConfiguredFeature<BlockClusterFeatureConfig, ?> getFlowerFeature(Random randomIn, boolean booleanIn)
	{
		return Feature.FLOWER.withConfiguration(FORGET_ME_NOT_CONFIG);
	}
}
