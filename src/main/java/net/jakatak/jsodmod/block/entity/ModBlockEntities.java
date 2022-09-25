package net.jakatak.jsodmod.block.entity;

import net.jakatak.jsodmod.Jsodmod;
import net.jakatak.jsodmod.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Jsodmod.MOD_ID);

    public static final RegistryObject<BlockEntityType<OreGrinderBlockEntity>> ORE_GRINDER =
            BLOCK_ENTITIES.register("ore_grinder", () ->
                    BlockEntityType.Builder.of(OreGrinderBlockEntity::new,
                            ModBlocks.ORE_GRINDER.get()).build(null));

    public  static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
