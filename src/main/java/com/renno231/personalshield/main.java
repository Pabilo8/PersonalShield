package com.renno231.personalshield;

import com.renno231.personalshield.proxy.ClientProxy;
import com.renno231.personalshield.proxy.CommonProxy;
import com.renno231.personalshield.util.reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;


@Mod(modid = reference.MOD_ID,name = reference.NAME, version = reference.VERSION)
public class main {

    public static Logger logger;

    @Instance
    public static main instance;

    @SidedProxy(clientSide = reference.CLIENT_PROXY_CLASS, serverSide = reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;
    //public static ClientProxy clientProxy = new ClientProxy();

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event){
        logger = event.getModLog();
        proxy.preInit(event);

    }

    @EventHandler
    public static void init(FMLInitializationEvent event){
        proxy.init(event);

    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}
