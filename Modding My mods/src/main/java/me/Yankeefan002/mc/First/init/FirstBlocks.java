package me.Yankeefan002.mc.First.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class FirstBlocks {
	
	public static Block Monkey_Block;
	
	public static void init() 
	{
		Monkey_Block = new Block(Material.cloth).setUnlocalizedName("Monkey_Block");
	}

	public static void register() 
	{
		
	}

}
