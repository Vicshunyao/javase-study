package atguigu;

public class phoneTest {

    public static void main(String[] args) {
        //创建对象
        phone p1=new phone();

        //调用属性和方法
        p1.name="sadd";
        p1.price=6999;
        System.out.println("name:"+p1.name+", price:"+p1.price);
        p1.call();
        p1.sendMessage("nihao");

    }
}
