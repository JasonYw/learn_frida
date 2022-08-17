// 1.需要的基础知识
// 安卓底层 linux 内核 需要有些Linux命令行
// smail代码 反编译后是smail代码
// java 核心代码
// JNI 通过jni，java才可以调用c
// c/c++ so文件 反编译难度较大
// arm汇编（后期很重要）
// android 提供的api

// 2.apk的基本结构
// apk 其实是zip的压缩包
// assets 资源目录 是没有编译过的 可以直接拿来用的 以及可以有任意深度的子目录
// lib 本地代码 一般是so文件
// libs 第三方jar包
// META-INF apk的签名 每个apk都有，正常的android系统会验证，保证文件的完整性以及不会被篡改
// res 资源 编译之后的 不能直接用 里面是xml，图标 布局 apktool进行反编译
// AndroidManifest 清单文件 需要反编译 包含 系统权限 包名 是否支持调试
// resources.arsc 编译之后的 资源索引表
// dex文件 反编译之后 smail  代码 再把smail代码转换成java代码，有多个dex是因为文件大小限制，我们反编译完应该是只有一个samil文件


// 3.apk打包流程

// 4.apk安装
// 1.拷贝akp文件放入/data/app/包名
// 2.用资源管理器解析apk中的资源文件
// 3.解析AndroidManifest.xml 并会在/data/data 创建一些数据
// 4.对我们dex文件进行优化 保存在/data/dalvik-cache
// 5.解析AndroidManifest.xml四大组件信息注册发送广播


// 3.jvm Dvm Art虚拟机
// jvm 运行.class文件
// 5.0之前dalvik虚拟机只会执行.dex文件，dx工具会把.class文件打包成.dex文件
// 5.0之后art虚拟机，在安装时直接将.dex文件转化成可执行文件.oat文件，并且art支持多dex所以不存在合包的问题，所以art虚拟机会很大提升app冷启动速度
// xposed hook的是java代码所以xposed不支持5.0以上的系统

// 4.逆向工具
// androidkiller
// jadx


// arm分析和动态调试不一致时，可能是so里面的有多个cpu版本
// 签名机制 会和源码去校验是否你的apk文件有动过，所以改了源码后才放回apk在安装是无法安装好的
// 可以使用信誉破解器，这样不需要重新签名也可以安装
// 重签：把apk重新签名


// xposed依然是老大，xposed是java代码写hook
// frida有可能无法注入 so层可以防止其注入
// frida推荐真机 8.1 Pixel


package lession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
//package frida-douyin 表示hello.java为一个包frida-douyin中一个类，想用 import frida-douyin.hello
//如果没有public 声明的类，别的包无权调用，只能在当前包中用，public修饰的类成员就都能访问，能访问类才有可能访问类成员，private修饰的类成员，只能自己的类去调用，protected 只能同一个包的类或子类去调用，default只能在同一个包中用
import javax.print.DocFlavor.STRING;

/*
 * 包的概念
 * 项目目录frida-douyin，用package 声明
 */

class Test {
    /*
     * java只支持单继承，不支持多继承，但支持实现多个接口，python中无接口概念
     * 
     * class Son implements Base，Foo{} 实现多个接口
     * super() 调用父类的构造方法
     * 接口和继承都比较极端
     * 抽象类可以定义普通方法，供子类继承，也可以定义为抽象方法，约束子类必须实现，类似接口和继承的结合体，定义抽象类 用abstract修饰，定义抽象方法也要用abstract修饰
     */

    public static String name_ ="beijing"; //静态变量属于类


        
    public void  Test(){
        /*
         * 当类名与方法名相同时，则方法为构造方法，在类实例化时自动调用
         * this 相当于self
         */
        System.out.println("构造方法");
    }


    public void Test(String name){
        /*
         * 重载，相当函数名 接收不同的参数，重载对于类方法 均支持重载，不管是不是构造方法
         */
        System.out.println("构造方法");

    }

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


    public void f6(){
        /*
         * java的数组不等于python的数组
         * java的数组是静态的，长度固定，特定类型的元素
         */
        int[] numarry = new int[3]; //声明一个长度为3的数组
        numarry[0] = 1;

        String[] name = new String[]{"11","22"};
        System.out.println(Arrays.toString(name));

        String[] names = {"11","22"}; //声明一个数组
    }

    public void f7(Object v1) {
        /*
         * Object ,python和java，所有类都默认继承了Object
         * 数组声明好了里面只能放声明好的类型，由于所有类都继承了Object,Object可以代指他的子类,泛型
         */
        String name ="object";
        Object name_ = "object"; //底层依然存储的是字符串
        Object[] namelist = {"11",11,true}; //object 数组既可以放字符串也可以放整形
        System.out.println(v1);
        System.out.println(v1.getClass());


        /*
         * list,set,map
         */
        //LIST 系列
        /*
         * LIST是一个接口
         * 接口下面有两个常见的类型(目的是可以动态存放数据)
         * arraylist =》 底层存储为连续的内存地址，内部自动扩容，在开辟一块区域，为了保证连续性，在将原来区域的数据迁移到新的区域
         * linkedlist =》 底层基于链表实现的 链表 头：上一个数据的数据地址 尾：下一个数据的数据地址 中间：自己的数据
         * 底层原理不一样，但是用起来差不多
         * 
         */

        ArrayList v2_1 = new ArrayList<>(); //创建一个arraylist，里面的元素可以放任何的类型，可以在<>里指定类型
        v2_1.add("11");
        v2_1.add(22);
        Object value = v2_1.get(1);
        String value_ = (String)v2_1.get(1); //强制转换
        /*
         * 
         */



        LinkedList v2_2 = new LinkedList<>();
        v2_2.add("1");
        /*
         * 接口用来约束实现他的类，约束它里面的成员，必须含有什么
         * 伪代码：
         * 接口中的方法，不需要写具体实现，只用于约束
         * interface List{
         *  public void add(Object data);
         * }
         * class ArrayList implements List { //ArrayList 实现了接口list，此时他的方法中必须要有一个add方法
         *  public void add(Object data){
         *      return data
         *    }
         * }
         * 利用泛指
         * List v1 = new ArrayList();
         */

        //迭代器
        Iterator<Object> it = v2_1.iterator(); //获取迭代器
        while(it.hasNext()){ //hasNext 判断是否有下一个值
            String item = (String) it.next();
            System.out.print(item);
        }

        //SET 系列
        /*
         * SET 也是一个接口，下面也有两种实现
         * HashSet 去重 无序
         * TreeSet 去重 内部默认排序 不同数据类型无法比较，根据unicode码根据先后顺序排序
         * 涉及到集合 就有交集并集差集
         * & | -
         * retainAll,addAll,removeAll
         */

        HashSet s1 = new HashSet<String>(){
            //创建对象的同时，向对象里面放入元素
            {
                add("1");
                add("2");
            }
        };
        s1.add("3");




            
        //Map 系列
        /*
        * MAP 也是一个接口，下面也有两种实现
        * HashMap 无序
        * TreeMap 默认根据key排序（常用）自带排序规则 这个在逆向时需要小心排序,循环的时候 会根据排序后的键进行排序
        * python 没有现成的包对字典进行排序
        */

        TreeMap h1 = new TreeMap<String,Object>();
        h1.put("name","neo");
        h1.put("age",11);    
        System.out.println(h1);

        // Map h2 = new TreeMap<>();//treemap 一定是有序的
        // Set<Map.Entry<String,Object>> s3 = h1.entrySet(); //  h1.entrySet() h1的实体 得到的是一个集合 有点类似于python中的tuple
        //{{'name','neo'}，{'age',11}}
        // Iterator it2 = s3.iterator(); // 集合是可以迭代的
        // while(it2.hasNext()){
        //     Map.Entry<string,object> entry = (Map.Entry<string,object>) it2.next(); //强制转换获取实体 Map.Entry<string,object> entry  = (Map.Entry<string,object>) {'name','neo'}
        //     String k = (String)entry.getKey();
        //     String v = (String)entry.getValue();
        // }
        /*也可以直接不写
            Set s2 = s3.entrySet();
            Iterator = s2.iterator();
            while(s2.hashNext()){
                Map.Entry entry = (Map.Entry) it2.next();
                string k = (string) entery.getkey()
                ...
            }

         * 
         */



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
        t_obj.f7(1);
    }

}

/*
 * 逆向过程中找到了接口，接下来需要去找哪些类实现了那个方法
 * 也可以找到new的时候
 */




 /*
  * 常见的加密
  隐藏字节
  字符串 使用字节数组表示,java字节数有负数，用python转换要小心
  字节列表 -》 python的字节数组
  bs = bytearray()
  for item in byte_list:
    if item <0:
        item = item + 256
    bs.append(item)
  得到bs后将其编码bs.decode("utf-8") 获得字符串
  注意事项：有时候不是utf-8，所以要看java中new byte的时候给的编码
  一般用于加密的盐或key
  */

  /*
   * uuid
   * java.util.UUID
   * UUID.randomUUID().toString()
   * import uuid
   * uuid = str(uuid.uuid4())
   * uuid 一般长 xxxxxxx-xxxx-xxxx-xxxx-xxxxxx
   * 第一种每次请求都生成uuid，抓包特点每次都不一样 --》直接伪造
   * 第二种app刚启动的时候，有些app就会向后端请求拿到一个uuid，这个uuid相当于手机凭证，app会把他写入本地文件
   * 点击功能发送请求，发送请求+找到uuid -》 发送过去
   * 现象：抓包uuid固定的
   *    app清除数据 卸载安装 再次抓包 uuid可能会改变
   * 
   * 思路：直接用固定的
   *       动态生成
   *        按照app过程进行模拟，模拟请求，获取uuid，再去发送请求携带
   * 
   *  
   */

   /*
    * 随机值
      biginterger v4 = new bigintrger(80,new securerandom()) //随机生成80位，10个字节
      string res = v4.tostring(16) //让字节以16进制展示
      import random 
      data = random.randbytes(10) #pyton3.9以上
      data = []
      for i in range(10):
        data.append(random.randint(0,255)) #python3.9以下
      elelist = []
      for item in data:
        #10进制转换16进制
        elelist.append(hex(item)[2:].rjust(2,"0")) #python hex时会有0x前缀 所以切片，并且不满2位补0，"02%x"%(item,) 也可以转换16进制并且没有0x，并且可以自动补0，不满2位补0
     "".join(elelist)
    小补充：16进制
    java：会强制补齐2位
    v1 ="6"
    v1.rjust(2,"0") #不满2位补0
    */

    /*
     * 时间戳
     * string v1 = string.valueof(system.currenttimemills()/1000); 秒级
     * string v2 = string.valueof(system.currenttimemillis());  毫秒级
     * python time.time
     * 注意事项
     *  时间戳放在reques请求中，请求头，要进行字符串
     * 作用是什么
     *  有意义的时间，点击时间，日志请求时有用
     *  播放运行操作时间
     *  加密规则，构造动态字符串
     *  在app中 手机号+当前的时间戳 = 》 md5加密，并且构造url时会把md5 和时间戳都带过去，之后会一起对比
     *  
     */


     /*
      * md5
        加盐
        先实例化md5
        import hashlib
        m= hashlib.md5("xxxx".encode("utf-8"))
        m.update("yan".encode(""utf-8)) #"yan"就是盐
        res = m.hexdigest()
        md5加密长度：一般32位 所以要敏感一点，有时候会变大小写，找盐，明文最重要 32位左右都要注意，密文在次操作，可以提前hook MessageDigest.getInstance
      */

      /*
       * sha256加密,java中256和md5加密差不多，都用了MessageDigest类
       */

       /*
        * AES加密 对称加密，可以反解
        基于key iv给 明文加密
        拿到了key iv 解密
        情况A：请求体为密文（抓包现象乱码）
        情况B：sign，AES加密+base64编码
        python pip install pycryptdome
        base64 java.util.Base64
        */

       /*
        * gzip压缩 GZIPOutputStream标志
        压缩：
        ByteArrayOutputStream v0_1 = new ByteArrayOutputStream();
        GZIPOutputStream v1 = new new GZIPOutputStream((v0_1));
        v1.write(data.getBytes());
        v1.close()
        byte[] arg6 = v0_1.toByteArray()
        system.out.println(Arrays.toString(arg6));

        python import gzip
        s_in =str.encode('utf-8')
        s_out = gzip.compress(s_in)
        #解压
        res= gzip.decompress(s_out)
        res.decode('utf-8')

        */
        

        /*拿不准的时候使用hook验证那个函数 也可以验证传入的参数和返回值
        个推id 一般安卓app开发，第三方平台根据mac imei生成个推id
        AES DES 3DES DESede 对称加密
        对称加密特点
            1.能加密也能解密
            2.加密和解密依赖：key iv 一般key 和 iv是固定不变的
        分析 3DES(DESede) 加密 

        ida 反编译so 
            
    overloads 重载 
    return this.fangfa.apply(this,argumensts)

    hook 构造方法
    类.$init.implementation = function(){
        this.$init()
    }
    类.$init.overload.implementation = function(){
        this.$init()
    }
    对象实例化
    var a  = java.use("OBJECT")
    a.$new("参数") //实例化


    修改类的字段
    修改类的静态字段
    var a = java.use("OBJECT")
    a.类的静态变量名.value = '更改静态变量的值,其实就多了一个value'

    修改类的非静态类的变量名
    //注意非静态变量名 不能与函数名相同
    java.choose("类名",{
        onMatch: function(obj){
            obj.类的非静态变量名.value = '更非改静态变量的值,其实就多了一个value'
            obj._类的非静态变量名与函数名相同.value = '类的非静态变量名与函数名相同需在前面加下滑线'
        },
        onComplete: function(){},
    });


    内部类
    内部类：类包着类
    class a{public class b {}}
    var obj = java.use("a$b")

    匿名类
    class a {
        new obj() {
            public void get() {}
        }
    }
    var obj = java.use("a$1")
    obj.get.implementation


    枚举所有类

    动态加载dex(加壳)
    hook出来发现了加载了类，但是jadx里没有，说明动态加载了
    java层可以动态加载dex，dexclassloader，也可以在so层动态加载
    dex也可以加密，java层加载后，如果dex有加密 需要解密之后再用
    hook脚本：无法按照正常hook那样去写
    如果 dongtaiclass  动态加载的话
    异步：
        java.enumerateClassLoaders({
            onMatch:function(loader){
                try:
                    if(loader.findclass("dongtaiclass")){
                        Java.classFactory.loader = loader 
                        var dynamic = Java.use("dongtaiclass")
                        console.log(dynamic)
                        dynamic.func.implementation ...
                    }
                catch:
                    pass
            }
            onComplete:function(){}
        })


    特殊类型的遍历与修改
    主动调用
    静态
        function hooktest11(){
            Java.perform(function(){
                var b = Java.use("java.lang.String")
                var a = Java.use("dongtai.lei")
                b.$new("xiaojianbang") #获取的是 java中的字符串对象 实例化
                var res = a.encrypt(b.getBytes())  因为java string有getBytes方法
                return res
            })
        }

    非静态方法主动调用 // 需要实例化对象 1
    var obj = java.use("a.b").$new("ry",3000000); 
    obj.getinfo()

    //2 //不需要实例化了，因为是 在onmatch里 所以已经有示例了 obj就是示例 会调用内存中全部这个类的对象，所以实例存在多个 可能调用多次
    java.choose("a.b",{
        onMatch:function(obj){
            var str = obj.getinfo()
        },
        onComplete:function(){
        },
    });

    //打印堆栈 谁调用了谁的关系
    console.log(java.use("android.util.Log").getStackTraceString(Java.use("Java.lang.exception").$new()))



    //加载dex
    java.openClassFile("接收安卓端dex的路径").load();
    java.use(dex的package.类)
    sdx build-tools 中 有个 dx.bat 可以打包jar包 
    .... 

*/




