package com.caswillor.caswillormod.init;

import java.util.function.Supplier;

import com.caswillor.caswillormod.CasWillorMod;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum CasWillorArmorMaterial implements IArmorMaterial
{
	MITHRIL(CasWillorMod.MOD_ID + ":mithril", 29, new int[]{2, 5, 7, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.5F, () -> {
		return Ingredient.fromItems(ItemInit.mithril_ingot.get());
	}),
	
	TUNGSTEN(CasWillorMod.MOD_ID + ":tungsten", 29, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F, () -> {
		return Ingredient.fromItems(ItemInit.tungsten_ingot.get());
	});

	private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
	   private final String name;
	   private final int maxDamageFactor;
	   private final int[] damageReductionAmountArray;
	   private final int enchantability;
	   private final SoundEvent soundEvent;
	   private final float toughness;
	   private final LazyValue<Ingredient> repairMaterial;
	
	private CasWillorArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountsIn, int enchantabilityIn, SoundEvent equipSoundIn, 
			float toughnessIn, Supplier<Ingredient> repairMaterialSupplier) 
	{
		this.name = nameIn;
		this.maxDamageFactor = maxDamageFactorIn;
	    this.damageReductionAmountArray = damageReductionAmountsIn;
	    this.enchantability = enchantabilityIn;
	    this.soundEvent = equipSoundIn;
	    this.toughness = toughnessIn;
	    this.repairMaterial = new LazyValue<>(repairMaterialSupplier);
	}

	@Override
	public int getDurability(EquipmentSlotType slotIn) 
	{
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) 
	{
		return this.damageReductionAmountArray[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() 
	{
		return this.enchantability;
	}

	@Override
	public SoundEvent getSoundEvent() 
	{
		return this.soundEvent;
	}

	@Override
	public Ingredient getRepairMaterial() 
	{
		return this.repairMaterial.getValue();
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public String getName() 
	{
		return this.name;
	}

	@Override
	public float getToughness() 
	{
		return this.toughness;
	}
}
