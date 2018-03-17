package me.Yankeefan002.mc.First.proxy;

import me.Yankeefan002.mc.First.init.FirstIteams;

public class ClientProxy extends CommonProxy{ 
	@Override
	public void registerRenders() {
		FirstIteams.registerRenders();
	
		
	}
}