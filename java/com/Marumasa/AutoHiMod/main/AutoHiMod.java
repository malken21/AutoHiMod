package com.Marumasa.AutoHiMod.main;

import com.Marumasa.AutoHiMod.init.Events;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;


@Mod("autohimod")
public class AutoHiMod {

    public static final String MOD_ID = "autohimod";

    public AutoHiMod(){
        MinecraftForge.EVENT_BUS.register((new Events()));
    }
}
