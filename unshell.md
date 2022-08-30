# 理论知识介绍
- 抽取加固对函数体进行加密
- 整体加固对于整体dex进行加密
- 分析加固app的时候不一定需要脱壳
- 脱壳的本质 app运行中 把解密后的dex保存下来
- 加固特征 反编译后看类的数量 类的方法特征 类名特征 so特征 libjiagu.so qihoo
- 查壳工具

# 整体加固
- 落地加固：解密后的dex必须出现在手机存储中
- 内存加载：解密后的dex在内存中动态加载(目前基本都是动态加载)


# 分类
- dex加固：整体加固 抽取加固 vmp dex2c 多种混合加固  vmp加固之后抽取加固之后整体加固
- so加固：对so结果进行处理 so数据加密 自定义linker 解决sodump so修复

# dex2c
- 基于编译原理 通过语法分析 词法分析 将java代码翻译成c代码 彻底还原难度极大 需要把c还原成java  无法脱壳
- 会有大量的jni api调用

# vmp
- 也会把java函数native化，会把java指令放在so中执行
- vmp通常会共用一个解释器 因此被vmp保护的函数会注册在一个地址上
- vmp 的关键是定位解释器 找到映射关系



# 解决方案 整体加固
- 脱壳工具fdex2 通过class类的getDex方法得到DexFile 再通过DexFile的getBytes方法得到dex文件
- 脱壳工具blackdex 通过mCookie来脱壳
- 脱壳工具FRIDA-DEXDump 从内存搜索dex文件 保存下来
- 脱壳系统FART youok 在dex加载解析过程中 得到DexFile内存地址和大小 将解密状态的dex保存下来 还可以通过artMethod来得到DexFile

# 抽取加固
- 运行方法后回填，运行之后将解密后的代码填回去 运行后不在将已经回填的代码抽取 延时dump
- 运行方法后回填，运行之后将解密后的代码填回去 运行后将回填的代码抽空 fart youpk主动调用 函数运行中保存函数体的代码
- 抽取函数中加入goto 被抽取函数解密运行时 进行 dump

