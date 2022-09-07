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
    /data/system/xsettings(/.*)?	u:object_r:mydemo_file:s0
    #//add end
```



