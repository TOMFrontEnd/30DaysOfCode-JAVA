import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
public class SimplestDynamicProxyDemo {
    public static void main(String[] args) {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println(method);
            if (method.getName().equals("morning")) {
                
                System.out.println("Good moring," +args[0]);
            }
                return null;
            }
        
        };  

        Hello hello = (Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(),
     new Class[] {Hello.class},handler);
        hello.morning("BOB");
    }
}

interface Hello {
    void morning(String name);
}