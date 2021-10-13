package basicjava;

import java.io.IOException;
import java.util.List;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

public class ZookeeperTest {
    public static void main(String[] args) throws IOException, KeeperException, InterruptedException {
        String zkConnecting = "";
        ZooKeeperWatcher zooKeeperWatcher = new ZooKeeperWatcher();
        ZooKeeper client = new ZooKeeper(zkConnecting, 10000, zooKeeperWatcher);
        List<String> children = client.getChildren("/", true);
        for (String node : children) {
            System.out.println(node);
        }
    }

    public static class ZooKeeperWatcher implements Watcher {

        @Override
        public void process(WatchedEvent watchedEvent) {

        }
    }
}
