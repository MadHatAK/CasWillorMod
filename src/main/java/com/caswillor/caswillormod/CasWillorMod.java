package com.caswillor.caswillormod;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.caswillor.caswillormod.init.BlockInit;
import com.caswillor.caswillormod.init.CasWillorItemGroups;
import com.caswillor.caswillormod.init.ItemInit;
import com.caswillor.caswillormod.init.ToolInit;
import com.caswillor.caswillormod.world.gen.CasWillorOreGen;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("caswillormod")
@Mod.EventBusSubscriber(modid = CasWillorMod.MOD_ID, bus = Bus.MOD)
public class CasWillorMod
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "caswillormod";
    public static CasWillorMod instance;

    public CasWillorMod()
    {
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        // Register the setup method for modloading
        modEventBus.addListener(this::setup);
        // Register the doClientStuff method for modloading
        modEventBus.addListener(this::doClientStuff);
        
        ItemInit.ITEMS.register(modEventBus);
        ToolInit.TOOLS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        
        instance = this;
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event)
    {
    	final IForgeRegistry<Item> registry = event.getRegistry();
    	
    	BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
    		final Item.Properties properties = new Item.Properties().group(CasWillorItemGroups.tabBlocks);
    		final BlockItem blockItem = new BlockItem(block, properties);
    		blockItem.setRegistryName(block.getRegistryName());
    		registry.register(blockItem);
    	});
    	
    	LOGGER.debug("Registered BlockItems!");
    }
    
    
    private void setup(final FMLCommonSetupEvent event)
    {
    	
    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {
    	RenderTypeLookup.setRenderLayer(BlockInit.cotton_crop.get(), RenderType.getCutout());
    	RenderTypeLookup.setRenderLayer(BlockInit.ironwood_sapling.get(), RenderType.getCutout());
    	RenderTypeLookup.setRenderLayer(BlockInit.blackspruce_sapling.get(), RenderType.getCutout());
    	RenderTypeLookup.setRenderLayer(BlockInit.ironwood_door.get(), RenderType.getCutout());
    }

    
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event)
    {
    	
    }
    
    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event)
    {
    	CasWillorOreGen.generateOre();
    	
    }

    
}
