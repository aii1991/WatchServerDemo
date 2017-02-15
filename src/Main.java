import config.Config;
import service.WatchDirService;

/**
 * Created by jason on 2017/2/15.
 */
public class Main {
    public static void main(String[] args) {
        WatchDirService watchDirServer = new WatchDirService(Config.DIR_PATH);
        watchDirServer.start();
    }
}
