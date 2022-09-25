package net.jakatak.jsodmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab JSODMOD_TAB = new CreativeModeTab("jsodmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.IRON_DUST.get());
        }
    };
}
