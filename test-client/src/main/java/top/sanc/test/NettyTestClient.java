package top.sanc.test;

import top.sanc.rpc.api.ByeService;
import top.sanc.rpc.api.HelloObject;
import top.sanc.rpc.api.HelloService;
import top.sanc.rpc.serializer.CommonSerializer;
import top.sanc.rpc.transport.RpcClient;
import top.sanc.rpc.transport.RpcClientProxy;
import top.sanc.rpc.transport.netty.client.NettyClient;

/**
 * 测试用Netty消费者
 *
 * @author sanc
 */
public class NettyTestClient {

    public static void main(String[] args) {
        RpcClient client = new NettyClient(CommonSerializer.PROTOBUF_SERIALIZER);
        RpcClientProxy rpcClientProxy = new RpcClientProxy(client);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
        ByeService byeService = rpcClientProxy.getProxy(ByeService.class);
        System.out.println(byeService.bye("Netty"));
    }

}
