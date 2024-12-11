package kr.kro.wonmyee.blocks;

import kr.kro.wonmyee.Japdahan;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMetalOre extends Block {
    public BlockMetalOre(String unlocalizedName, int harvestLevel, float hardness) {
        super(Material.rock);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Japdahan.blocks);
        this.setHarvestLevel("pickaxe", harvestLevel);
        this.setHardness(hardness);
    }
}
