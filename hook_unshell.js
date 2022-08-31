// # 理论知识介绍
// - 抽取加固对函数体进行加密
// - 整体加固对于整体dex进行加密
// - 分析加固app的时候不一定需要脱壳
// - 脱壳的本质 app运行中 把解密后的dex保存下来
// - 加固特征 反编译后看类的数量 类的方法特征 类名特征 so特征 libjiagu.so qihoo
// - 查壳工具

// # 整体加固
// - 落地加固：解密后的dex必须出现在手机存储中
// - 内存加载：解密后的dex在内存中动态加载(目前基本都是动态加载)


// # 分类
// - dex加固：整体加固 抽取加固 vmp dex2c 多种混合加固  vmp加固之后抽取加固之后整体加固
// - so加固：对so结果进行处理 so数据加密 自定义linker 解决sodump so修复

// # dex2c
// - 基于编译原理 通过语法分析 词法分析 将java代码翻译成c代码 彻底还原难度极大 需要把c还原成java  无法脱壳
// - 会有大量的jni api调用

// # vmp
// - 也会把java函数native化，会把java指令放在so中执行
// - vmp通常会共用一个解释器 因此被vmp保护的函数会注册在一个地址上
// - vmp 的关键是定位解释器 找到映射关系



// # 解决方案 整体加固
// - 脱壳工具fdex2 通过class类的getDex方法得到DexFile 再通过DexFile的getBytes方法得到dex文件
// - 脱壳工具blackdex 通过mCookie来脱壳
// - 脱壳工具FRIDA-DEXDump 从内存搜索dex文件 保存下来
// - 脱壳系统FART youok 在dex加载解析过程中 得到DexFile内存地址和大小 将解密状态的dex保存下来 还可以通过artMethod来得到DexFile

// # 抽取加固
// - 运行方法后回填，运行之后将解密后的代码填回去 运行后不在将已经回填的代码抽取 延时dump
// - 运行方法后回填，运行之后将解密后的代码填回去 运行后将回填的代码抽空 fart youpk主动调用 函数运行中保存函数体的代码
// - 抽取函数中加入goto 被抽取函数解密运行时 进行 dump

// # 类加载器的时机
// - 使用Class.forName 加载 显示加载
// - 使用loadClass 加载 显示加载
// - 访问类的静态变量 为静态变量赋值 调用类的静态方法 隐式加载
// - 创建类的实例 某个类的子类 父类也会被加载 隐式加载

// # 类加载器
// - BootClassLoader 单例模式 用来记载系统类
// - BaseDexClassLoader 是PathClassLoader DexClassLoader InMemoryDexClassLoader的父类 类加载的主要逻辑都是在BaseDexClassLoader完成的
// - PathClassLoader 是默认使用的类加载器 用于加载app自身的dex
// - DexClassLoader 用于实现插件化 热修复 dex加固等
// - InMemoryDexClassLoader 安卓8.0以后引入 用于内存加载dex

// # 双亲委派
// - 如果一个类加载器收到了类加载请求 会先把这个请求委托给父类的加载器去执行
// - 如果父类加载器还存在其父类加载器 则进一步向上委托 依次类推 最终到达顶层的启动类加载器
// - 如果父类加载器可以完成类加载任务 就成功返回 倘若父类加载器无法完成此加载任务 子加载器才会尝试自己去加载
// - 以上流程可以避免重复加载 已经加载的class可以直接读取
// - 更急安全 无法自定义类来替代系统类 可以防止核心api库被修改


// # hook无法找到类
//原因 类名不对 类路径不对 classloader不对 
//枚举classloader 去找类 如果还没有说明类没有用到就没有加载
function change_classloader(){
    Java.perform(function(){
        //由于使用默认的Dexclassloader加载类的 所以找不到 利用pathclassloader去找加载类 所以找不到
        //pathclassloader:找不到去bootclassloader去找 找不到 去 pathclassloader去找
        //com.xiaojiangbang.app.Dynamic 这个类在dexclass loader 所以classloader没有就找不到了
        // var Dynamic = Java.use('com.xiaojiangbang.app.Dynamic')
        // console.log(Dynamic)
        //枚举已经加载的类,一般这种就可以找到目标类，会把所有classloader的类都找到
        // console.log(Java.enumerateLoadedClassesSync())
        //枚举classloader
        Java.enumerateClassLoaders({
            onMatch:function(loader){
                try{
                    //切换frida的classloader
                    Java.classFactory.loader = loader
                    var Dynamic = Java.use('com.xiaojianbang.app.Dynamic')
                    console.log("Dynamic",Dynamic,"Loader",loader)
                    //找到后在进行hook
                    Dynamic.sayHello.implementation = function(){
                        console.log('hooked yes')
                        return "xiaojianbang"
                    }

                }catch (e){
                    console.log("wrong loader",loader)
                }
            },
            onComplete:function(){}
        })


    })
}

// 普通app运行流畅
// BootClassLoader 加载系统核心库
// PathClassLoader 加载app自身dex 之后存储在 mClassLoader中

// 加固app运行流程
// BootClassLoader加载系统核心库
// PathClassLoader加载壳的dex  目前mclassloader记录的是 壳的pathclassloader
// 使用壳的dex/so 加载原先的app自身的dex 
//加固ClassLoader会对ClassLoader进行修正 如果不修正 系统从pathclassloader开始找 就直接去找bootclassloader就找不到了 所以也要修正
// 修正方式 插入classloader bootclassloader dexclassloader pathclassloader mclassloader
// 修正方式 替换classloader bootclassloader pathclassloader dexclassloader mclassloader

// PathClassLoader加载dex以后,会记录在LoaderApk的mClassLoader属性中，默认使用这个ClassLoader去寻找类,因此加固app需要修正ClassLoader


//ART下的脱壳点 
// https://www.cs.android.com/
//dex的加载流程 通过mcookie 脱壳 通过openCommen函数脱壳 通过DexFile构造函数脱壳 youpk 通过ClassLinker来得到DexFile 缺点现在很多加固 都不走这些系统函数了 
//dex2oat的编译流程 通过修改dex2oat脱壳
//类的加载和初始化流程脱壳点 DexHunter在defineClass进行类解析 针对抽取壳的
//函数执行中脱壳点 FART Execute整体脱壳 ArtMethod::invoke函数中的dump CodeItem youpk 直接到了解释执行的函数中进行dump CodeItem

