package com.Marumasa.AutoHiMod.init;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientPlayerNetworkEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Events {
    @SubscribeEvent
    public void JoinWorld(ClientPlayerNetworkEvent.LoggedInEvent event) {
        Minecraft.getInstance().player.chat("hi");
    }
}
