package top.sanc.rpc.transport;

import top.sanc.rpc.serializer.CommonSerializer;

/**
 * 服务器类通用接口
 *
 * @author sanc
 */
public interface RpcServer {

    int DEFAULT_SERIALIZER = CommonSerializer.KRYO_SERIALIZER;

    void start();

    <T> void publishService(T service, String serviceName);

}
