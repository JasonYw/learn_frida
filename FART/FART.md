# 脱壳笔记汇总

## 理论知识介绍

- 抽取加固对函数体进行加密
- 整体加固对于整体dex进行加密
- 分析加固app的时候不一定需要脱壳
- 脱壳的本质 app运行中 把解密后的dex保存下来
- 加固特征 反编译后看类的数量 类的方法特征 类名特征 so特征 libjiagu.so qihoo
- 查壳工具

## 整体加固

- 落地加固：解密后的dex必须出现在手机存储中
- 内存加载：解密后的dex在内存中动态加载(目前基本都是动态加载)

## 分类

- dex加固：整体加固 抽取加固 vmp dex2c 多种混合加固  vmp加固之后抽取加固之后整体加固
- so加固：对so结果进行处理 so数据加密 自定义linker 解决sodump so修复

## dex2c

- 基于编译原理 通过语法分析 词法分析 将java代码翻译成c代码 彻底还原难度极大 需要把c还原成java  无法脱壳
- 会有大量的jni api调用

## vmp

- 也会把java函数native化，会把java指令放在so中执行
- vmp通常会共用一个解释器 因此被vmp保护的函数会注册在一个地址上
- vmp 的关键是定位解释器 找到映射关系

## 解决方案 整体加固

- 脱壳工具fdex2 通过class类的getDex方法得到DexFile 再通过DexFile的getBytes方法得到dex文件
- 脱壳工具blackdex 通过mCookie来脱壳
- 脱壳工具FRIDA-DEXDump 从内存搜索dex文件 保存下来
- 脱壳系统FART youok 在dex加载解析过程中 得到DexFile内存地址和大小 将解密状态的dex保存下来 还可以通过artMethod来得到DexFile

## 抽取加固

- 运行方法后回填，运行之后将解密后的代码填回去 运行后不在将已经回填的代码抽取 延时dump
- 运行方法后回填，运行之后将解密后的代码填回去 运行后将回填的代码抽空 fart youpk主动调用 函数运行中保存函数体的代码
- 抽取函数中加入goto 被抽取函数解密运行时 进行 dump

## 类加载器的时机

- 使用Class.forName 加载 显示加载
- 使用loadClass 加载 显示加载
- 访问类的静态变量 为静态变量赋值 调用类的静态方法 隐式加载
- 创建类的实例 某个类的子类 父类也会被加载 隐式加载

## 类加载器

- BootClassLoader 单例模式 用来记载系统类
- BaseDexClassLoader 是PathClassLoader DexClassLoader InMemoryDexClassLoader的父类 类加载的主要逻辑都是在BaseDexClassLoader完成的
- PathClassLoader 是默认使用的类加载器 用于加载app自身的dex
- DexClassLoader 用于实现插件化 热修复 dex加固等
- InMemoryDexClassLoader 安卓8.0以后引入 用于内存加载dex

## 双亲委派

- 如果一个类加载器收到了类加载请求 会先把这个请求委托给父类的加载器去执行
- 如果父类加载器还存在其父类加载器 则进一步向上委托 依次类推 最终到达顶层的启动类加载器
- 如果父类加载器可以完成类加载任务 就成功返回 倘若父类加载器无法完成此加载任务 子加载器才会尝试自己去加载
- 以上流程可以避免重复加载 已经加载的class可以直接读取
- 更急安全 无法自定义类来替代系统类 可以防止核心api库被修改

## APP运行

- 普通app运行流畅
- BootClassLoader 加载系统核心库
- PathClassLoader 加载app自身dex 之后存储在 mClassLoader中
- 加固app运行流程
- BootClassLoader加载系统核心库
- PathClassLoader加载壳的dex  目前mclassloader记录的是 壳的pathclassloader
- 使用壳的dex/so 加载原先的app自身的dex
- 加固ClassLoader会对ClassLoader进行修正 如果不修正 系统从pathclassloader开始找 就直接去找bootclassloader就找不到了 所以也要修正
- 修正方式 插入classloader bootclassloader dexclassloader pathclassloader mclassloader
- 修正方式 替换classloader bootclassloader pathclassloader dexclassloader mclassloader
- PathClassLoader加载dex以后,会记录在LoaderApk的mClassLoader属性中，默认使用这个ClassLoader去寻找类,因此加固app需要修正ClassLoader

## ART下的脱壳点

- https:www.cs.android.com/
- dex的加载流程 通过mcookie 脱壳 通过openCommen函数脱壳 通过DexFile构造函数脱壳 youpk 通过ClassLinker来得到DexFile 缺点现在很多加固 都不走这些系统函数了
- dex2oat的编译流程 通过修改dex2oat脱壳
- 类的加载和初始化流程脱壳点 DexHunter在defineClass进行类解析 针对抽取壳的 LoadMethod、LinkCode
- 函数执行中脱壳点 FART Execute整体脱壳 ArtMethod::invoke函数中的dump CodeItem youpk 直接到了解释执行的函数中进行dump CodeItem

## InMemoryDexClassLoader 源码分析

- mCookie脱壳原理 ConvertJavaArrayToDexFiles ConvertDexFilesToJavaArray
- ArtDexFileLoader::Open、ArtDexFileLoader::openCommen DexFile
- 整体脱壳本质 就是找到DexFile对象

## DexClassLoader源码分析

- https:developer.android.com/about/versions/10/behavior-changes-10?hl=zh-cn#system-only-oat
- https:blog.csdn.net/YZcoder/article/details/120648821
- OpenAndReadMagic 早期脱壳点
- dex2oat android10不再从应用进程调用dex2oat
- https:www.jianshu.com/p/7af31cc5130e

## youpk

- https:github.com/youlor/unpacker 开源代码
- fdex2的脱壳 android8.0以下能用 从classObj - getDex() - getBytes
- 只要能获取到DexFile的地方都可以进行尝试脱壳，也可以是间接得到DexFile的地方，比如ArtMethod->getDexFile()

## FART

- https:github.com/hanbinglengyue/FART

## 被动调用

- app正常运行时过程中所发生的函数调用
- 只对dex中部分的类完成加载，只对dex中的部分函数完成调用
- 被动调用也可以用来完成函数粒度的修复
- 待app将dex中的类正常加载并完成相关函数的调用后，再进行dex的dump

## 被动调用的缺点

- 调用函数不全
- 有些壳当函数代码执行完毕后，又进行抽取

## 主动调用

- 构造虚拟调用，对dex中所有类函数完成调用
- 能够覆盖dex中所有的函数，可以在函数执行时dump函数的体数据
- 主动调用链构造的越深，效果越好

## 抽取加固的本质

- 提取出dex文件中的字节码，并在运行时还原

## 常见的抽取加固形式

- 原有函数体数据空间置0，保留原有空间
- 对dex文件进行重构，不保留原有空间，在还原数据时，修改CodeItemOffest
- 将原有函数体替换为解密代码，运行时解密执行

## 常见的抽取加固脱壳机

- DexHunter
- Fupk3
- FART
- youpk

## FART主动调用源码分析

- 遍历ClassLoader
- 从ClassLoader 中取出DexFile，调用getClassNameList的方法得到所有类名
- 遍历类中的所有函数  
- 完成对函数的主动调用，但不能影响app的正常运行
- 函数执行过程中dump函数体数据 DexCode/CodeItem
- CodeItem起始地址的获取:artMethod->GetCodeItem()
- CodeItem长度的计算：dex_file->GetCodeItemSize(const CodeItem& code)

## 在系统中主动调用函数的方法

- 无法使用HOOK框架的主动调用
- Java层可以利用反射
- jni层可以参阅CallVoidMethod:artMethod->invoke(...)

## dex文件格式

- 自己计算CodeItem长度
- CodeItem长度要求是4的倍数
- len = len - len % 4 + 4
- https://bbs.pediy.com/thread-268760.htm

## dex重构

- youpk 修复dex https://github.com/youlor/unpacker 已经有工具可以
- 将dexfixer-main 打包成jar包

## Fart存在的问题

- 调用链的深度不够 有些壳将原有的函数体替换为解密代码，运行时才解密执行
- 有些壳设置一些垃圾类，当该类被初始化时自动退出
- 有些壳设置一些垃圾类，实时检测这些类是否加载
- 动态加载的dex文件，如果没有修正ClassLoader，不会出现在双亲委派关系中，也不会被Fart遍历到

## 改进方案

- 学习youpk的调用深度
- 不进行类的初始化，或者不主动调用该类
- 设置配置文件，类似白名单，对指定类进行主动调用，或者避开指定类的调用 利用frida主动调用FART的函数，对指定类进行脱壳 frida hook loadClassAndInvoke
- 使用frida与fart配合脱壳时 要注释掉 ActivityThread.java  handleBindApplication 方法中开启线程的过程 就是要关闭部分脱壳功能

```JavaScript
    Java.perform(function () {
        Java.choose("dalvik.system.DexClassLoader", {
            onMatch: function (instanse) {
                console.log(instanse);
                var activityThread = Java.use("android.app.ActivityThread");
                activityThread.xiaojianbangWithClassloader(instanse);
            }, onComplete: function () {
        
            }
        });
    });

```

- 利用frida枚举所有ClassLoader，再主动调用FART的函数进行脱壳 Exexute脱壳点对于动态加载的dex也可以脱壳，除非这个dex没有类的初始化函数

```JavaScript

    Java.perform(function () {
        var activityThread = Java.use("android.app.ActivityThread");
        var classloader = activityThread.getClassloader();
        console.log("classloader: ", classloader);
        var dexFile = Java.use("dalvik.system.DexFile");
        var params = [Java.use("java.lang.Object").class];
        var saveMethodCodeItem = dexFile.class.getDeclaredMethod("saveMethodCodeItem", params);
        console.log("saveMethodCodeItem: ", saveMethodCodeItem);
        saveMethodCodeItem.setAccessible(true);
        activityThread.loadClassAndInvoke(classloader, "com.xiaojianbang.encrypt.DES", saveMethodCodeItem);
    });
```
