package com.caswillor.caswillormod.world.feature;

import java.util.Random;

import com.caswillor.caswillormod.init.BlockInit;
import com.google.common.collect.ImmutableList;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator;
import net.minecraftforge.common.IPlantable;

public class IronwoodTree extends Tree 
{
	public static final TreeFeatureConfig IRONWOOD_TREE_CONFIG = (new TreeFeatureConfig.Builder(
			new SimpleBlockStateProvider(BlockInit.ironwood_log.get().getDefaultState()), 
			new SimpleBlockStateProvider(BlockInit.ironwood_leaves.get().getDefaultState()), 
			new BlobFoliagePlacer(2, 0))).baseHeight(8).heightRandA(4).foliageHeight(3).ignoreVines()
			.decorators(ImmutableList.of(new BeehiveTreeDecorator(0.05F))).setSapling((IPlantable)BlockInit.ironwood_sapling.get()).build();

	@Override
	protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean booleanIn)
	{
		return Feature.NORMAL_TREE.withConfiguration(IRONWOOD_TREE_CONFIG);
	}
	
	
}
