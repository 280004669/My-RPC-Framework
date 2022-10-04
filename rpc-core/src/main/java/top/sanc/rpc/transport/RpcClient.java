package top.sanc.rpc.transport;

import top.sanc.rpc.entity.RpcRequest;
import top.sanc.rpc.serializer.CommonSerializer;

/**
 * 客户端类通用接口
 *
 * @author sanc
 */
public interface RpcClient {

    int DEFAULT_SERIALIZER = CommonSerializer.KRYO_SERIALIZER;

    Object sendRequest(RpcRequest rpcRequest);

}
