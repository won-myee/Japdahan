package kr.kro.wonmyee.proxy;

import kr.kro.wonmyee.init.ModBlocks;
import kr.kro.wonmyee.init.ModItems;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenders() {
        ModItems.registerRenders();
        ModBlocks.registerRenders();
    }

}
