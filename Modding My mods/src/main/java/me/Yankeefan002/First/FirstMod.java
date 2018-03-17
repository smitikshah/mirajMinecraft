package me.Yankeefan002.First;

import me.Yankeefan002.mc.First.init.FirstIteams;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Refrence.MOD_ID, name = Refrence.MOD_NAME, version = Refrence.VERSION)
public class FirstMod {
	
	
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		FirstIteams.init();
		FirstIteams.register();
	}
	@EventHandler
	public void Init(FMLInitializationEvent event) 
	{
		
	}
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) 
	{
		
	}
}
