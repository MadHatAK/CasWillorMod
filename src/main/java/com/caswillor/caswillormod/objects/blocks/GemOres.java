package com.caswillor.caswillormod.objects.blocks;

import java.util.Random;

import com.caswillor.caswillormod.init.BlockInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorldReader;

public class GemOres extends OreBlock
{
	public GemOres(Block.Properties properties)
	{
		super(properties);
	}
	
	@Override
	protected int getExperience(Random random)
	{
		if (this == BlockInit.shale_ore.get())
		{
			return MathHelper.nextInt(random, 0, 2);
		}
		if (this == BlockInit.lavastone_ore.get())
		{
			return MathHelper.nextInt(random, 0, 2);
		}
		else
		{
			return 0;
		}
	}
	
	@Override
	public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch)
	{
		return silktouch == 0 ? this.getExperience(RANDOM) : 0;
	}
}
