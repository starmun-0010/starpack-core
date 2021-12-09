package xyz.starmun.starpackcore;

import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import team.creative.ambientsounds.AmbientEnviroment;

@Mod(StarpackCore.MOD_ID)
public class StarpackCore {
    public static final String MOD_ID = "starpackcore";
    public static final String MOD_NAME = "Starpack Core";
    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);
    public StarpackCore(){
        if(ModList.get().isLoaded("ambientsounds")){
            StarpackCore.LOGGER.info("Assuring Load:" + AmbientEnviroment.BiomeArea.class.getCanonicalName());
        }
    }
}
