package fun.cactus.PluginMinecraft;


import net.minecraft.server.pluginSystem.JavaPlugin;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PluginMinecraft extends JavaPlugin {
    private static final Logger LOGGER = LogManager.getLogger();
    public void onLoad() {
        LOGGER.info("Загрузка плагина");
    }

    public void onEnable() {
        LOGGER.info("Запуск плагина");
    }

    public void onDisable() {
        LOGGER.info("Отключение плагина");
    }
}