package me.Yankeefan002.mc.First.init;

import me.Yankeefan002.First.Refrence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FirstIteams {

	public static Item first_item;
	
	
	public static void init() {
		first_item = new Item().setUnlocalizedName("first_item"); 
			}
	public static void register()
	{
		GameRegistry.registerItem(first_item, first_item.getUnlocalizedName().substring(5)); 
	}

	public static void registerRenders()
	{
		registerRender(first_item);
	}

	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Refrence.MOD_ID + ";" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}

