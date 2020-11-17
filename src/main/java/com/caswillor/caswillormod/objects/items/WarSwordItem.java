package com.caswillor.caswillormod.objects.items;

import com.caswillor.caswillormod.init.WeaponInit;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.world.World;

public class WarSwordItem extends SwordItem
{

	public WarSwordItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	@Override
	public void onCreated(ItemStack stack, World worldIn, PlayerEntity playerIn)
	{
		if (stack != null && stack.getItem().equals(WeaponInit.mithril_sword.get()))
		{
			stack.addEnchantment(Enchantments.SHARPNESS, 2);
			stack.addEnchantment(Enchantments.UNBREAKING, 1);
		}
		if (stack != null && stack.getItem().equals(WeaponInit.lavastone_sword.get()))
		{
			stack.addEnchantment(Enchantments.FIRE_ASPECT, 2);
		}
		else { return; }
	}
	
}
