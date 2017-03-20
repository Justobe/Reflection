import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.*;
/**
 * Created by YanMing on 2017/3/20.
 */
public class Reflection {

    public static void test(BorrowService borrowService){
        borrowService.borrowBook();
        borrowService.borrowOthers("ReadingRoom");
    }

    public  static  void main(String [] args){
        bsImpl library = new bsImpl();
        test(library);
        BorrowService dynamicLibrary = (BorrowService)Proxy.newProxyInstance(
                BorrowService.class.getClassLoader(),
                new Class[] {BorrowService.class},
                new DynamicBorrowProxyHandler(library));
        test(dynamicLibrary);
    }
}
