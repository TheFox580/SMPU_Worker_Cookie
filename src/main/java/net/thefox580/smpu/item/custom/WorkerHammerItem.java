package net.thefox580.smpu.item.custom;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;

public class WorkerHammerItem extends SwordItem {
    public WorkerHammerItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public int getEnchantmentLevel(ItemStack stack, Enchantment enchantment) {
        if (!stack.isEnchanted()){
            stack.enchant(Enchantments.KNOCKBACK, 3);
        }
        return super.getEnchantmentLevel(stack, enchantment);
    }
}
