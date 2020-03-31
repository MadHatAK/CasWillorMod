package com.caswillor.caswillormod.world.feature;

import java.util.Random;

import com.caswillor.caswillormod.init.BlockInit;

import net.minecraft.block.trees.SpruceTree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.SpruceFoliagePlacer;
import net.minecraftforge.common.IPlantable;

public class BlackSpruceTree extends SpruceTree
{
	public static final TreeFeatureConfig BLACKSPRUCE_TREE_CONFIG = (new TreeFeatureConfig.Builder(
			new SimpleBlockStateProvider(BlockInit.blackspruce_log.get().getDefaultState()), 
			new SimpleBlockStateProvider(BlockInit.blackspruce_leaves.get().getDefaultState()), 
			new SpruceFoliagePlacer(2, 1))).baseHeight(8).heightRandA(4).trunkHeight(1).trunkHeightRandom(1).trunkTopOffsetRandom(2).ignoreVines()
				.setSapling((IPlantable)BlockInit.blackspruce_sapling.get()).build();
	
	@Override
	protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean booleanIn)
	{
		return Feature.NORMAL_TREE.withConfiguration(BLACKSPRUCE_TREE_CONFIG);
	}
}
