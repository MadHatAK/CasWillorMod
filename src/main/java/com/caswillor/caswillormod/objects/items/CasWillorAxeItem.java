package com.caswillor.caswillormod.objects.items;

import java.util.Map;
import java.util.Set;

import com.caswillor.caswillormod.init.BlockInit;
import com.caswillor.caswillormod.init.WeaponInit;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableMap.Builder;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.ToolItem;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CasWillorAxeItem extends ToolItem
{
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.OAK_PLANKS, Blocks.SPRUCE_PLANKS, Blocks.BIRCH_PLANKS, Blocks.JUNGLE_PLANKS, 
			Blocks.ACACIA_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.BOOKSHELF, Blocks.OAK_WOOD, Blocks.SPRUCE_WOOD, Blocks.BIRCH_WOOD, Blocks.JUNGLE_WOOD, 
			Blocks.ACACIA_WOOD, Blocks.DARK_OAK_WOOD, Blocks.OAK_LOG, Blocks.SPRUCE_LOG, Blocks.BIRCH_LOG, Blocks.JUNGLE_LOG, Blocks.ACACIA_LOG, 
			Blocks.DARK_OAK_LOG, Blocks.CHEST, Blocks.PUMPKIN, Blocks.CARVED_PUMPKIN, Blocks.JACK_O_LANTERN, Blocks.MELON, Blocks.LADDER, 
			Blocks.SCAFFOLDING, Blocks.OAK_BUTTON, Blocks.SPRUCE_BUTTON, Blocks.BIRCH_BUTTON, Blocks.JUNGLE_BUTTON, Blocks.DARK_OAK_BUTTON, 
			Blocks.ACACIA_BUTTON, Blocks.OAK_PRESSURE_PLATE, Blocks.SPRUCE_PRESSURE_PLATE, Blocks.BIRCH_PRESSURE_PLATE, Blocks.JUNGLE_PRESSURE_PLATE, 
			Blocks.DARK_OAK_PRESSURE_PLATE, Blocks.ACACIA_PRESSURE_PLATE,
			BlockInit.blackspruce_plank.get(), BlockInit.ironwood_plank.get(), BlockInit.blackspruce_log.get(), BlockInit.ironwood_log.get());
	protected static final Map<Block, Block> BLOCK_STRIPPING_MAP = (new Builder<Block, Block>()).put(Blocks.OAK_WOOD, Blocks.STRIPPED_OAK_WOOD)
			.put(Blocks.OAK_LOG, Blocks.STRIPPED_OAK_LOG).put(Blocks.DARK_OAK_WOOD, Blocks.STRIPPED_DARK_OAK_WOOD)
			.put(Blocks.DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_LOG).put(Blocks.ACACIA_WOOD, Blocks.STRIPPED_ACACIA_WOOD)
			.put(Blocks.ACACIA_LOG, Blocks.STRIPPED_ACACIA_LOG).put(Blocks.BIRCH_WOOD, Blocks.STRIPPED_BIRCH_WOOD)
			.put(Blocks.BIRCH_LOG, Blocks.STRIPPED_BIRCH_LOG).put(Blocks.JUNGLE_WOOD, Blocks.STRIPPED_JUNGLE_WOOD)
			.put(Blocks.JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_LOG).put(Blocks.SPRUCE_WOOD, Blocks.STRIPPED_SPRUCE_WOOD)
			.put(Blocks.SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_LOG)
			.put(BlockInit.ironwood_log.get(), BlockInit.stripped_ironwood_log.get()).build();

	
	public CasWillorAxeItem(IItemTier tier, float attackDamageIn, float attackSpeedIn, Item.Properties builder)
	{
		super(attackDamageIn, attackSpeedIn, tier, EFFECTIVE_ON, builder);
	}
	
	public boolean canHarvestBlock(BlockState blockIn)
	{
		Block block = blockIn.getBlock();
		return block == Blocks.SNOW || block == Blocks.SNOW_BLOCK;
	}
	
	public float getDestroySpeed(ItemStack stack, BlockState state)
	{
		Material material = state.getMaterial();
	      return material != Material.WOOD && material != Material.PLANTS && material != Material.TALL_PLANTS && material != Material.BAMBOO ? 
	    		  super.getDestroySpeed(stack, state) : this.efficiency;
	}
	
	public ActionResultType onItemUse(ItemUseContext context)
	{
		World world = context.getWorld();
	      BlockPos blockpos = context.getPos();
	      BlockState blockstate = world.getBlockState(blockpos);
	      Block block = BLOCK_STRIPPING_MAP.get(blockstate.getBlock());
	      if (block != null)
	      {
	         PlayerEntity playerentity = context.getPlayer();
	         world.playSound(playerentity, blockpos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
	         if (!world.isRemote)
	         {
	            world.setBlockState(blockpos, block.getDefaultState().with(RotatedPillarBlock.AXIS, blockstate.get(RotatedPillarBlock.AXIS)), 11);
	            if (playerentity != null)
	            {
	               context.getItem().damageItem(1, playerentity, (p_220040_1_) -> {
	                  p_220040_1_.sendBreakAnimation(context.getHand());
	               });
	            }
	         }

	         return ActionResultType.SUCCESS;
	      } else {
	         return ActionResultType.PASS;
	      }
	}
	@Override
	public void onCreated(ItemStack stack, World worldIn, PlayerEntity playerIn)
	{
		if (stack != null && stack.getItem().equals(WeaponInit.mithril_waraxe.get()))
		{
			stack.addEnchantment(Enchantments.SHARPNESS, 2);
			stack.addEnchantment(Enchantments.UNBREAKING, 1);
		}
		else { return; }
	}
}