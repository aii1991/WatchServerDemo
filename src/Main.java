import config.Config;
import task.WatchDirServer;

/**
 * Created by jason on 2017/2/15.
 */
public class Main {
    public static void main(String[] args) {
        WatchDirServer watchDirServer = new WatchDirServer(Config.DIR_PATH);
        watchDirServer.start();
    }
}
