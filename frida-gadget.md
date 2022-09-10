# frida持久化

## 自定义目录设计

- /data/system/xsettings/mydemo/persisit/pkgName/persist_on 此文件存在表示开启持久化
- /data/system/xsettings/mydemo/jscfg/pkgName/config.js hook代码

## 配置开机就创建自定义目录

- AOSP/system/core/rootdir/init.rc 文件中添加以下数据 626行

```Shell
    #//add start
    #/data/system/xsettings/mydemo/persisit/pkgName/persist_on
    mkdir /data/system/xsettings 0775 system system
    mkdir /data/system/xsettings/mydemo 0775 system system
    mkdir /data/system/xsettings/mydemo/persisit 0775 system system
    mkdir /data/system/xsettings/mydemo/jscfg 0775 system system
    #//add end
```

## 创建文件类型selinux标签：mydemo_file

- 在如下文件中添加数据 405行

```Shell
    /system/sepolicy/public/file.te
    /system/sepolicy/prebuilts/api/29.0/public/file.te
```

- 在以上文件中添加如下数据，两个文件添加的内容需要一致，两个文件内容一摸一样

```Shell
    #//add start
    # /data/system/xsettings/mydemo/persisit
    #定义一个类型 mydemo_file 为类型名字
    type mydemo_file,file_type,data_file_type,core_data_file_type,mlstrustedobject;
    #//add end
```

- 注意文件不要以注释结尾，每行结束加分号

## 为自定义目录关联文件类型标签：mydemo_file

- 在如下文件中添加数据 122行

```Shell
    /system/sepolicy/private/file_contexts
    /system/sepolicy/prebuilts/api/29.0/private/file_contexts
```

- 在以上文件中添加如下数据，两个文件添加的内容需要一致

```Shell
    #//add start
    #/data/system/xsettings/mydemo/persisit
    #表示改目录下所有文件类型 都是mydemo_file
    /data/system/xsettings(/.*)?   u:object_r:mydemo_file:s0
    #//add end
```

## 配置system app访问mydemo_file标签文件的权限

- 在如下文件中添加数据

```Shell
    /system/sepolicy/private/system_app.te
    /system/sepolicy/prebuilts/api/29.0/private/system_app.te
```

- 在以上文件中添加如下数据，两个文件添加的内容需要一致 末尾

```Shell
    #//add start
    #//add end
    #add for accessing mydemo_file
    #为了自己写的app能访问这种类型的文件，目前只是system 权限的app
    allow system_app mydemo_file:dir { getattr setattr open read write remove_name create add_name search rmdir };
    allow system_app mydemo_file:file { getattr setattr open read write create unlink };
```

## 配置第三方app访问mydemo_file标签文件的权限

- 在如下文件中添加数据

```Shell
    /system/sepolicy/private/untrusted_app.te
    /system/sepolicy/private/untrusted_app_25.te
    /system/sepolicy/private/untrusted_app_27.te
    /system/sepolicy/private/untrusted_app_all.te

    /system/sepolicy/prebuilts/api/29.0/private/untrusted_app.te
    /system/sepolicy/prebuilts/api/29.0/private/untrusted_app_25.te
    /system/sepolicy/prebuilts/api/29.0/private/untrusted_app_27.te
    /system/sepolicy/prebuilts/api/29.0/private/untrusted_app_all.te
```

- 在以上文件中添加如下数据，两个文件添加的内容需要一致 末尾

```Shell
    #//add start
    #//add end
    #add for accessing mydemo_file
    #注意 在untrusted_app_25.te 就变成 allow untrusted_app_25 mydemo_file:dir { getattr open read write search rmdir }; 
    #注意 在untrusted_app_25.te 就变成 allow untrusted_app_25 mydemo_file:file { getattr open read write };
    #注意 在untrusted_app_27.te 就变成 allow untrusted_app_27 mydemo_file:dir { getattr open read write search rmdir };
    #注意 在untrusted_app_27.te 就变成 allow untrusted_app_27 mydemo_file:file { getattr open read write };
    #注意 在untrusted_app_all.te 就变成 allow untrusted_app_all mydemo_file:dir { getattr open read write search rmdir };
    #注意 在untrusted_app_all.te 就变成 allow untrusted_app_all mydemo_file:file { getattr open read write };
    allow untrusted_app mydemo_file:dir { getattr open read write search rmdir };
    allow untrusted_app mydemo_file:file { getattr open read write };
```

## 修改以下文件防止报错：mydemo_file 未定义

```Shell
    /system/sepolicy/prebuilts/api/29.0/private/compat/26.0/26.0.ignore.cil
    /system/sepolicy/prebuilts/api/29.0/private/compat/27.0/27.0.ignore.cil
    /system/sepolicy/prebuilts/api/29.0/private/compat/28.0/28.0.ignore.cil

    /system/sepolicy/private/compat/26.0/26.0.ignore.cil |48
    /system/sepolicy/private/compat/27.0/27.0.ignore.cil |44
    /system/sepolicy/private/compat/28.0/28.0.ignore.cil |53
```

- 在以上数据加入 mydemo_file

## frida-gadget 集成到系统

- frida-gadget:<https://github.com/frida/frida/releases> android arm64 版本 以及 android arm 版本

- 将frida-gadget放到源码目录中，比如如下文件夹中

```Shell
    /frameworks/base/cmds/libmydemo
```

- 修改源码以下文件，将frida-gadget拷贝到编译以后的系统中

```Shell
    build/make/target/product/handheld_system.mk
```

- 添加以下数据，自动拷贝文件 87行

```Shell
    #//add start
    PRODUCT_COPY_FILES += \
        frameworks/base/cmds/libmydemo/frida-gadget-15.2.2-android-arm.so:$(TARGET_COPY_OUT_SYSTEM)/lib/libmydemo.so \
        frameworks/base/cmds/libmydemo/frida-gadget-15.2.2-android-arm64.so:$(TARGET_COPY_OUT_SYSTEM)/lib64/libmydemo.so
    #//add end
```

## 修改系统源码 自动加载 frida-gadget so文件

- 在以下文件中，添加代码

```Shell
    frameworks/base/core/java/android/app/ActivityThread.java
    # private void handleBindApplication 这个 方法中 加载so 是整个app最早的加载时机 
```

```Java
    //引入
    import java.io.FileInputStream;
    import org.json.JSONObject;

    //6121行
    private static boolean isDebug = true;
    private static void LOGD(String msg){
        if(isDebug) {
            Log.d(TAG,msg);
        }
    }
    public static final String LIB32_MYDEMO = "/system/lib/libmydemo.so";
    public static final String LIB64_MYDEMO = "/system/lib64/libmydemo.so";
    public static final String SETTINGS_DIR = "/data/system/xsettings/mydemo/persisit";
    public static final String CONFIG_JS_DIR = "/data/system/xsettings/mydemo/jscfg";
    //用来保存文件的工具函数
    public static boolean saveFile(String filePath,String textMsg){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            fileOutputStream.write(textMsg.getBytes("utf-8"));
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //用来复制文件
    public static boolean copyFile(File srcFile,File dstFile){
        try{
            FileInputStream fileInputStream = new FileInputStream(srcFile);
            FileOutputStream fileOutputStream = new FileOutputStream(dstFile);
            byte[] data = new byte[16 * 1024];
            int len = -1;
            while((len = fileInputStream.read(data)) != -1 ){
                fileOutputStream.write(data,0,len);
                fileOutputStream.flush();
            }
            fileInputStream.close();
            fileOutputStream.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //判断app是否打开自动注入脚本功能 
    ///data/system/xsettings/mydemo/persisit/pkgName/persist_on 判断此文件是否存在
    public static boolean isEnablePersist(String pkgName, String methodType){
        File enableFile = new File(SETTINGS_DIR,pkgName + "/" + methodType);
        return enableFile.exists();
    }
    //获取js代码
    public static String getAppJSPath(String pkgName){
        File file = new File(CONFIG_JS_DIR,pkgName + "/config.js");
        return file.getAbsolutePath();
    }
    //核心函数
    //拷贝so 拷贝注入js 生成gadget文件 最后加载
    public static boolean doMydemoPersisit(Context context, String so32Path, String so64Path, String srcJSPath){
        //首先判断so是32位还是64位
        File srcSoFile = new File(so32Path);
        //如果是64位的进程就用64位的so
        if(Process.is64Bit()) {srcSoFile = new File(so64Path);}
        //判断文件是否存在
        if(!srcSoFile.exists()) {
            LOGD("srcSoFile not exists");
            return false;
        }
        //把系统so拷贝到app私有目录中
        //首先构造路径，拼接路径
        File dstSoFile = new File(context.getFilesDir(),"libmydemo.so");
        //源路径和目标路径不一致 就需要拷贝
        if(srcSoFile.length() != dstSoFile.length()){
            boolean isCopyFileOk =  copyFile(srcSoFile,dstSoFile);
            if(!isCopyFileOk){
                LOGD("copySoFile fail: "+ srcSoFile + " -> " + dstSoFile);
                return false;
            }
        }
        //把js拷贝到app私有目录中
        File srcJSFile = new File(srcJSPath);
        if(!srcJSFile.exists()){
            LOGD("srcJSFile not exists");
            return false;
        }
        File dstJSFile = new File(context.getFilesDir(),"config.js");
        boolean isCopyJSOk = copyFile(srcJSFile,dstJSFile);
        if(!isCopyJSOk){
            LOGD("copyJSFile fail: " + srcJSFile + " -> " + dstJSFile);
            return false;
        }
        //运行fridagadget 的配置文件
        String configFilePath = context.getFilesDir() + File.separator + "libmydemo.config.so";
        //这里构造的是 fridagadget 监听目录的方式 
        try {
            JSONObject jsonObject = new JSONObject();
            JSONObject childObj = new JSONObject();
            childObj.put("type","script");
            childObj.put("path",dstJSFile.toString());
            jsonObject.put("interaction",childObj);
            boolean isSaveOk = saveFile(configFilePath,jsonObject.toString());
            if(!isSaveOk){
                LOGD("saveFile fail: "+ configFilePath);
                return false;
            }
            System.load(dstSoFile.toString());
            return true;
        }catch (Exception e) {
            LOGD("happen error: "+ e.toString());
        }
        return false;
    }
    //add end


    //6532行 handleBindApplication 中 第二个Application app上面;
    //add start
    //获取当前运行app的包名
    String curPkgName = data.appInfo.packageName;
    int curUid = Process.myUid();
    //uid大于10000 非系统
    if(curUid > 10000){
        LOGD("curPkgName: "+ curPkgName + " curUid: "+ curUid);
        //是否启动持久化，判断是否存在文件
        Boolean isPersist = isEnablePersist(curPkgName,"persist_mydemo");
        LOGD("isPersist: "+ isPersist);
        if(isPersist){
            //获取hookjs路径
            String JSPath = getAppJSPath(curPkgName);
            LOGD("JSPath: "+ JSPath);
            if(JSPath != null){
                boolean isOk = doMydemoPersisit(appContext,LIB32_MYDEMO,LIB64_MYDEMO,JSPath);
                LOGD("doMydemoPersist: "+ isOk);
            }else{
                LOGD("JSPath is null");
            }
        }
    }
    //add end

```

## system权限app的开发

- system权限app的开发

    1. 在manifest中加入android:sharedUserId="android.uid.system"
    2. 将编译出来的app放入 /packages/apps/mydemopersist/
    3. 编写Android.mk 并且同时放入/packages/apps/mydemopersist/ 与apk放一起

    ```Shell
        # ///ADD START
        # ///ADD END
        # 设置当前工作路径
        LOCAL_PATH:= $(call my-dir)
        # 清除变量值
        include $(CLEAR_VARS)
        # 生成的模块名称
        LOCAL_MODULE := ControlAPP
        # 生成的模块类型
        LOCAL_MODULE_CLASS := APPS
        # 生成的模块后缀名,此处为apk
        LOCAL_MODULE_SUFFIX := $(COMMON_ANDROID_PACKAGE_SUFFIX)
        # 设置模块tag，tags取值可以为:user debug eng tests optional
        # optional表示全平台编译
        LOCAL_MODULE_TAGS := optional
        # LOCAL_PRIVILEGED_MODULE := true
        LOCAL_BUILT_MODULE_STEM := package.apk
        LOCAL_DEX_PREOPT := false
        # 设置源文件
        LOCAL_SRC_FILES := $(LOCAL_MODULE).apk
        LOCAL_CERTIFICATE := platform
        # 设置签名，此处表示保持apk原有签名
        # LOCAL_CERTIFICATE := PRESIGNED
        # 此处表示预编译方式
        include $(BUILD_PREBUILT)
    ```

    4. 单独编译指定模块 mmm /packages/apps/mydemopersist/
    5. 编译后的模块在 /out/target/product/sailfish/system/app/ControlAPP
    6. 使用make snod 将编译出来的文件打包成镜像，刷入system.img即可

- 如果要在编译整个系统时，一起编译这个模块，需要将模块的ControlAPP加入源码编译链中

    1. 在manifest中加入android:sharedUserId="android.uid.system"
    2. 将编译出来的app放入 /packages/apps/mydemopersist/
    3. 编写Android.mk 并且同时放入/packages/apps/mydemopersist/ 与apk放一起
    4. 增加内置模块，如果为app，把模块名字加入到/build/make/target/product/handheld_product.mk中的PRODUCT_PACKAGES 变量后面
    5. 增加的内置模块，如果为可执行程序，加入到如下文件夹中/build/make/target/product/base_system.mk
