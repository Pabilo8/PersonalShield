package com.renno231.personalshield;

import com.renno231.personalshield.proxy.CommonProxy;
import com.renno231.personalshield.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;


@Mod(modid = Reference.MOD_ID,name = Reference.NAME, version = Reference.VERSION)
public class PersonalShield {

    public static Logger logger;

    @Instance
    public static PersonalShield instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
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
