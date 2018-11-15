package com.analysis.zk;

import org.I0Itec.zkclient.IZkStateListener;
import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;
import org.apache.zookeeper.Watcher.Event.KeeperState;

public class CreateSession {
	
	public static ZkClient connectZK() {
		//zk集群的地址  
        String ZKServers = "47.98.188.53:3210";
      
        ZkClient zkClient = new ZkClient(ZKServers,10000,10000,new SerializableSerializer());  
        zkClient.subscribeStateChanges(new IZkStateListener() {
            public void handleStateChanged(KeeperState keeperState) throws Exception {
                System.out.println( "handleStateChanged,stat:" + keeperState);
            }

            public void handleNewSession() throws Exception {
                System.out.println("handleNewSession()");
            }
        });
        System.out.println("conneted ok!");
        return zkClient;
	}
}
