package com.caswillor.caswillormod.init;

import java.util.function.Supplier;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum CasWillorItemTier implements IItemTier
{
	// int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial
			BOSSITE(2, 420, 6.0F, 1.0F, 16, () -> {
				return Ingredient.fromItems(ItemInit.bossite_ingot.get());
			}),
			HOBBITIUM(2, 1250, 7.0F, 2.0F, 35, () -> {
				return Ingredient.fromItems(ItemInit.hobbitium_ingot.get());
			}),
			TUNGSTEN(2, 2500, 6.0F, 2.5F, 24, () -> {
				return Ingredient.fromItems(ItemInit.tungsten_ingot.get());
			});
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private final LazyValue<Ingredient> repairMaterial;

	private CasWillorItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial)
	{
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairMaterial = new LazyValue<>(repairMaterial);
	}


	@Override
	public int getMaxUses() {
		// TODO Auto-generated method stub
		return this.maxUses;
	}

	@Override
	public float getEfficiency() {
		// TODO Auto-generated method stub
		return this.efficiency;
	}

	@Override
	public float getAttackDamage() {
		// TODO Auto-generated method stub
		return this.attackDamage;
	}

	@Override
	public int getHarvestLevel() {
		// TODO Auto-generated method stub
		return this.harvestLevel;
	}

	@Override
	public int getEnchantability() {
		// TODO Auto-generated method stub
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		// TODO Auto-generated method stub
		return this.repairMaterial.getValue();
	}
}
