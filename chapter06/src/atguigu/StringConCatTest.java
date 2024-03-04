package atguigu;

public class StringConCatTest {
    //n个字符串进行拼接，没有传入则传空

    public static void main(String[] args) {
        StringConCatTest test = new StringConCatTest();
        String info = test.concat("-", "hello", "world", "!");
        System.out.println(info);
        System.out.println(test.concat("/"));

    }

    public String concat(String operator, String... strs) {
        String result = "";
        for (int i = 0; i < strs.length; i++) {
            if (i == 0) {
                result += strs[i];
            } else {
                result += (operator + strs[i]);
            }
        }

        return result;


    }
}
