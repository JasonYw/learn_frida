import java.util.Arrays;
import java.util.Scanner;

class Test {
    public void f1() {
        // void 表示无返回值
        System.out.println("no static");
    }

    public static void f2() {
        String[] namelist ={"aa","bb","cc","aa"}; // 定义字符串数组
        for(int i =0;i<namelist.length;i++){
            String ele = namelist[i];
            System.out.println(ele);
        }
        System.out.println("static");
    }

    public String f3(){
        /*
         * '' 表示字符
         * “” 表述字符串
         */ 
        Scanner input = new Scanner(System.in); //需要引入java类库，处理用户输入，等同于python的input()
        String text = input.nextLine();
        char a = 'a';
        String v1 = "string";
        String v2 = new String("同样也是创建字符串");
        String v3 = new String(new byte[]{10,20,30,40,50}); //通过字节数组创建字符串
        String v4 = new String(new char[]{'z','f','c'}); //通过字符数组创建字符串
        System.out.println(text);
        //字符串拼接
        StringBuilder sb = new StringBuilder(); //线程安全
        sb.append("aaa");
        sb.append("bbbb");
        return("string"+sb.toString()); 

    }

    public int f4(int a1,int a2) {
        int q = 9; //类型 变量名 = 赋值
        final String b = "不可改变"; //final 定义常量 后期无法被修改，不允许 b = "修改"； 这样也无法修改
        System.out.println(a1+a2);
        return(a1+a2+q);
    }

    public int f5() {
        /*
         * java中的字节 有符号 从 -128-127
         * python 无符号 0-255
         * 但是底层都是二进制，底层是一样的
         * 所以以后java获得的字节数组，python要进行转换，java里面可以小于0的加256
         */


        //整数类型，范围不同
        byte a = 32;
        short b = 1000;
        int c = 1010101010;
        long d = 111111111;
        //逆向可能遇到,v1和v2是一回事，v2可能是二进制转换成十进制，如果3位一子节刚好，utf-8 中文一般是3位。
        String v1 = "无佩奇";
        int[] v2 = {230,173,166,230,233,178,233,189,144};
        //转换，以下等同于encode，与decode
        byte[] v3 = {10,105,97,110};
        String v3_str = new String(v3); // 字节数组转换为字符串
        byte[] v4 = v1.getBytes(); //字符串转字节数组,默认转换为utf-8
        System.out.println(Arrays.toString(v4)); // 数组转字符串
        System.out.println("_______"+v3_str);
        
        return(1);
    }




}


public class hello {

    // 一个文件只能有一个public类
    // 文件如果有多个类，文件名与public类名一致
    // 文件有多个类，无public，则文件名可以是任意类名
    // 类名大写
    // void 表示无返回值
    // 单行注释
    // /*多行注释 */
    /**
     * 对类的注释
     * @param args
     */


    public static void main(String[] args) {
        //成员函数，成员修饰符
        System.out.println("hello");
        Test t_obj = new Test();
        t_obj.f1();
        Test.f2();
        System.out.print(t_obj.f3());
        t_obj.f4(1, 2);
        t_obj.f5();
    }

}

