package top.sanc.rpc.loadbalancer;

import com.alibaba.nacos.api.naming.pojo.Instance;

import java.util.List;

/**
 * @author sanc
 */
public interface LoadBalancer {

    Instance select(List<Instance> instances);

}
