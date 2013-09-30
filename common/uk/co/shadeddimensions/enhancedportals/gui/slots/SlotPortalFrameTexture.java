package uk.co.shadeddimensions.enhancedportals.gui.slots;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import uk.co.shadeddimensions.enhancedportals.portal.StackHelper;

public class SlotPortalFrameTexture extends SlotPhantom
{
    public SlotPortalFrameTexture(IInventory iinventory, int slotIndex, int posX, int posY)
    {
        super(iinventory, slotIndex, posX, posY);
    }

    @Override
    public boolean isItemValid(ItemStack stack)
    {
        return StackHelper.isItemStackValidForPortalFrameTexture(stack) || stack == null;
    }
}