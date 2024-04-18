package net.thefox580.smpu.item.custom;

import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.thefox580.smpu.sound.ModSounds;

public class Suspicious_White_Powder extends Item {
    public Suspicious_White_Powder(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext){
        double x = pContext.getPlayer().getX();
        double y = pContext.getPlayer().getY();
        double z = pContext.getPlayer().getZ();
        pContext.getLevel().playSeededSound(null, x, y, z, ModSounds.SUSPICIOUS_WHITE_POWDER_SNIFF.get(), SoundSource.BLOCKS, 1f, 1f, 0L);
        return InteractionResult.SUCCESS;
    }

}
