package com.lazynessmind.horsemodifier.registry;

import com.lazynessmind.horsemodifier.Const;
import com.lazynessmind.horsemodifier.configs.HMConfig;
import com.lazynessmind.horsemodifier.items.HMItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.VersionChecker;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents {

    @SubscribeEvent
    public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(HMItems.ITEMS.toArray(new Item[0]));
    }

    /*@SubscribeEvent
    public static void onWorldLoaded(PlayerEvent.PlayerLoggedInEvent event) {
        System.out.println("updating");
        if (HMConfig.UPDATE_MSG.get()) {
            if (event.getPlayer() instanceof ServerPlayerEntity) {
                ServerPlayerEntity player = (ServerPlayerEntity) event.getPlayer();
                VersionChecker.CheckResult result = VersionChecker.getResult(ModList.get().getModContainerById(Const.MOD_ID).get().getModInfo());
                if (result.status == VersionChecker.Status.OUTDATED) {
                    player.sendMessage(new StringTextComponent(TextFormatting.BOLD + "[Horse Modifiers]" + TextFormatting.RED + " Current version is outdated! " + TextFormatting.WHITE + "Check the mod page to update. :)"));
                }
            }
        }
    }*/
}