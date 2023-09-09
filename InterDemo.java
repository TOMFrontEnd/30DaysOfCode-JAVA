public interface Inter {

    void show(); //抽象方法   

    default void method() { //默认方法
        System.out.println("默认方法被实现了");    }

    static void test(){ //静态方法
        System.out.println("静态方法被实现了");    }
}

//定义接口的一个实现类

public class Interlmpl implements Inter {
    @Override    
    public void show() {
        System.out.println("show方法");    }
}

//定义测试类

public class InterDemo {
  public static void main(String[] args) {
    Inter i = new Interlmpl();        
    i.show();        //抽象方法强制被重写
    i.method();      //默认方法不强制被重写，但可以被重写，重写时去掉default关键字        
    Inter.test();   //静态方法只能通过接口名调用,不能通过实现类名或者对象名调用
  }
}