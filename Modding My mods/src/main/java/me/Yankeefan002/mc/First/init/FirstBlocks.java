package me.Yankeefan002.mc.First.init;

import me.Yankeefan002.First.Refrence;
import me.Yankeefan002.First.blocks.BlockTest;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FirstBlocks {
	
	public static Block Monkey_Block;
	
	public static void init() 
	{
		Monkey_Block = new BlockTest(Material.cloth).setUnlocalizedName("Monkey_Block");
	}

	
	public static void register() 
	{
		GameRegistry.registerBlock(Monkey_Block, Monkey_Block.getUnlocalizedName().substring(5));
	}

	public static void registerRenders() 
	{
		
	}
	public static void registerRender(Block block) 
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Refrence.MOD_ID+ ";" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
