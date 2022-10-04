package top.sanc.test;

import top.sanc.rpc.annotation.Service;
import top.sanc.rpc.api.ByeService;

/**
 * @author sanc
 */
@Service
public class ByeServiceImpl implements ByeService {

    @Override
    public String bye(String name) {
        return "bye, " + name;
    }
}
