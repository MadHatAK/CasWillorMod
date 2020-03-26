package com.caswillor.caswillormod.init;

import java.util.function.Supplier;

import com.caswillor.caswillormod.CasWillorMod;
import com.caswillor.caswillormod.objects.items.HobbitiumPulaski;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = CasWillorMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(CasWillorMod.MOD_ID)
public class ItemInit
{
	//Ingots
	public static final Item hobbitium_ingot = null;
	public static final Item tungsten_ingot = null;
	
	//Tools
	public static final Item hobbitium_pulaski = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		//Ingots
		event.getRegistry().register(new Item(new Item.Properties().group(CasWillorItemGroups.tabMaterials)).setRegistryName("hobbitium_ingot"));
		event.getRegistry().register(new Item(new Item.Properties().group(CasWillorItemGroups.tabMaterials)).setRegistryName("tungsten_ingot"));
		
		//Tools
		event.getRegistry().register(new HobbitiumPulaski(CasWillorItemTier.HOBBITIUM, 5.0F, 1.0F, (new Item.Properties().group(CasWillorItemGroups.tabTools)))
				.setRegistryName("hobbitium_pulaski"));
	}
	
	public enum CasWillorItemTier implements IItemTier
	{
		// int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial
		HOBBITIUM(2, 1250, 7.0F, 2.0F, 35, () -> {
			return Ingredient.fromItems(ItemInit.hobbitium_ingot);
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
		public int getMaxUses()
		{
			return this.maxUses;
		}

		@Override
		public float getEfficiency()
		{
			return this.efficiency;
		}

		@Override
		public float getAttackDamage()
		{
			return this.attackDamage;
		}

		@Override
		public int getHarvestLevel()
		{
			return this.harvestLevel;
		}

		@Override
		public int getEnchantability()
		{
			return this.enchantability;
		}

		@Override
		public Ingredient getRepairMaterial()
		{
			return this.repairMaterial.getValue();
		}
	}
}
