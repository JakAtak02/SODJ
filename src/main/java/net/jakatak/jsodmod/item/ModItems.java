package net.jakatak.jsodmod.item;

import net.jakatak.jsodmod.Jsodmod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Jsodmod.MOD_ID);

    public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JSODMOD_TAB))
            );
    public static final RegistryObject<Item> GOLD_DUST = ITEMS.register("gold_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JSODMOD_TAB))
    );
    public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JSODMOD_TAB))
    );


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
