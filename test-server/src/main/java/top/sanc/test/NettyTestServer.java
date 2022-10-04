package top.sanc.test;

import top.sanc.rpc.annotation.ServiceScan;
import top.sanc.rpc.serializer.CommonSerializer;
import top.sanc.rpc.transport.RpcServer;
import top.sanc.rpc.transport.netty.server.NettyServer;

/**
 * 测试用Netty服务提供者（服务端）
 *
 * @author sanc
 */
@ServiceScan
public class NettyTestServer {

    public static void main(String[] args) {
        RpcServer server = new NettyServer("127.0.0.1", 9999, CommonSerializer.PROTOBUF_SERIALIZER);
        server.start();
    }

}
