package kr.kro.wonmyee.blocks;

import kr.kro.wonmyee.Japdahan;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockModPlanks extends Block {

    public BlockModPlanks(String unlocalizedName) {
        super(Material.wood);
        this.setCreativeTab(Japdahan.blocks);
        this.setUnlocalizedName(unlocalizedName);
        this.setHardness(2.0F);
        this.setResistance(3.0F);
        this.setStepSound(soundTypeWood);
    }
}
