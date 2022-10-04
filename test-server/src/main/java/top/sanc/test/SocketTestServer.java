package top.sanc.test;

import top.sanc.rpc.annotation.ServiceScan;
import top.sanc.rpc.serializer.CommonSerializer;
import top.sanc.rpc.transport.RpcServer;
import top.sanc.rpc.transport.socket.server.SocketServer;

/**
 * 测试用服务提供方（服务端）
 *
 * @author sanc
 */
@ServiceScan
public class SocketTestServer {

    public static void main(String[] args) {
        RpcServer server = new SocketServer("127.0.0.1", 9998, CommonSerializer.HESSIAN_SERIALIZER);
        server.start();
    }

}
