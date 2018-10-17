package com.qf;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, KeeperException, InterruptedException {
        //连接zookeeper
        ZooKeeper zooKeeper=new ZooKeeper("192.168.144.130:2181",1000,null);

        //创建节点
//        String znode = zooKeeper.create("/dylonz", "abd".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
//        System.out.println("创建节点"+znode);
        //获取节点数据
        byte[] data = zooKeeper.getData("/dylonz", null, null);
        System.out.println("数据为"+new String(data));

        zooKeeper.setData("/dylonz", "aaa".getBytes(), -1)
        System.out.println("数据为"+new String(data));


//        Stat stat = zooKeeper.exists("/dylonz", null);
//        if(stat!=null){
//
//        }

    }
}
