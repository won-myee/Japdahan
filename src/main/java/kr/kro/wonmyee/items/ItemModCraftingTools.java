package kr.kro.wonmyee.items;

import kr.kro.wonmyee.Japdahan;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemModCraftingTools extends Item {

    public ItemModCraftingTools(String unlocalizedName, int maxDamage) {
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Japdahan.items);
        this.setMaxStackSize(1);
        this.setMaxDamage(maxDamage);
    }

    @Override
    public boolean hasContainerItem(ItemStack itemStack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        ItemStack stack = itemStack.copy();

        stack.setItemDamage(stack.getItemDamage() + 1);
        stack.stackSize = 1;

        return stack;
    }

    /*@Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        // Assuming you want to damage it when used in crafting:
        itemStack.attemptDamageItem(1, itemRand);
        return itemStack; // then just return it
    }*/

}
