package net.glielem.tutorialmod.util;

import net.glielem.tutorialmod.Item.ModItems;
import net.glielem.tutorialmod.TutorialMod;
import net.glielem.tutorialmod.component.ModDataComponentTypes;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;

public class ModItemProperties {
    public static void addCustomItemProperties(){
        ItemProperties.register(ModItems.CHISEL.get(), ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID, "used"),
                (itemStack, clientLevel, livingEntity, i) -> itemStack.get(
                        ModDataComponentTypes.COORDINATES.get()) != null ? 1f : 0f);
    }
}
