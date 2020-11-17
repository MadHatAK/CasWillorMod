package com.caswillor.caswillormod.objects.items;

import com.caswillor.caswillormod.init.WeaponInit;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class CasWillorBowItem extends BowItem
{

	public CasWillorBowItem(Properties builder)
	{
		super(builder);
	}
	
	@Override
	public void onCreated(ItemStack stack, World worldIn, PlayerEntity playerIn)
	{
		if (stack != null && stack.getItem().equals(WeaponInit.valkyrie_bow.get()))
		{
			stack.addEnchantment(Enchantments.INFINITY, 1);
			stack.addEnchantment(Enchantments.FLAME, 1);
			stack.addEnchantment(Enchantments.UNBREAKING, 1);
		}
	}
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return repair.getItem() == Items.BOW || repair.getItem() == WeaponInit.valkyrie_bow.get();
	}

}
