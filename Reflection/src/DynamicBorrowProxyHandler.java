import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by YanMing on 2017/3/20.
 */
public class DynamicBorrowProxyHandler implements InvocationHandler {
    private Object proxied;
    public DynamicBorrowProxyHandler(Object proxied){
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("=====Before=====");
        System.out.println("proxy: " + proxy.getClass());
        System.out.println("method: " + method);
        System.out.println("args: " + args);
        Object result = method.invoke(proxied,args);
        System.out.println("=====End======");
        return  result;
    }

}