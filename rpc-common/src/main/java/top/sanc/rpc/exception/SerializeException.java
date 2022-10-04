package top.sanc.rpc.exception;

/**
 * 序列化异常
 *
 * @author sanc
 */
public class SerializeException extends RuntimeException {
    public SerializeException(String msg) {
        super(msg);
    }
}
