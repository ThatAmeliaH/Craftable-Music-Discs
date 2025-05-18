package com.thatameliah.craftablemusicdiscs.item;

import com.thatameliah.craftablemusicdiscs.CraftableMusicDiscs;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CraftableMusicDiscs.MOD_ID);

    public static final DeferredItem<Item> BLANK_RECORD = ITEMS.register("blank_record", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventbus) { ITEMS.register(eventbus); }
}
