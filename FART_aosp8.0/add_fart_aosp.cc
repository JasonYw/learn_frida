//整体加固的脱壳

// interpreter.cc /AOSP/art/runtime/interpreter/interpreter.cc
extern "C" void saveDexFileByExecute(ArtMethod *artMethod);

// interpreter.cc /AOSP/art/runtime/interpreter/interpreter.cc
if (strstr(shadow_frame.GetMethod()->PrettyMethod().c_str(), "<clinit>"))
{
    saveDexFileByExecute(shadow_frame.GetMethod());
}

// art_method.cc /AOSP/art/runtime/art_method.cc

#include <sys/syscall.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include "runtime.h"
#include <android/log.h>
#include <assert.h>
#include <errno.h>
#include <fcntl.h>
#include <pthread.h>
#include <stdarg.h>
#include <stddef.h>
#include <stdlib.h>
#include <string.h>
#include <sys/mman.h>
#include <sys/socket.h>
#include <sys/types.h>
#include <sys/uio.h>
#include <sys/un.h>
#include <time.h>
#include <unistd.h>

#define gettidv1() syscall(__NR_gettid)
#define LOG_TAG "ActivityThread"
#define ALOGI(...) __android_log_print(ANDROID_LOG_INFO, LOG_TAG, __VA_ARGS__)



extern "C" void saveDexFileByExecute(ArtMethod *artMethod) REQUIRES_SHARED(Locks::mutator_lock_)
{
    //申请内存
    char *dexfilepath = (char *)malloc(sizeof(char) * 1000);
    //判断是否为空
    if (dexfilepath == nullptr)
    {
        LOG(ERROR) << "ArtMethod::saveDexFileByExecute,methodname:" << artMethod->PrettyMethod().c_str() << "malloc 1000 byte failed";
        return;
    }
    int result = 0;
    int fcmdline = -1;
    char szCmdline[64] = {0};
    char szProcName[256] = {0};
    int procid = getpid();
    sprintf(szCmdline, "/proc/%d/cmdline", procid);
    //以只读的方式打开cmdline
    fcmdline = open(szCmdline, O_RDONLY | O_CREAT, 0644);
    if (fcmdline > 0)
    {
        result = read(fcmdline, szProcName, 256);
        if (result < 0)
        {
            LOG(ERROR) << "ArtMethod::saveDexFileByExecute,open cmdline file error";
        }
        close(fcmdline);
    }
    if (szProcName[0])
    {
        const DexFile *dex_file = artMethod->GetDexFile();
        const uint8_t *begin_ = dex_file->Begin(); // Start of data.
        size_t size_ = dex_file->Size();           // Length of data.
        int size_int_ = (int)size_;
        memset(dexfilepath, 0, 1000);
        sprintf(dexfilepath, "/data/data/%s/mydemo",szProcName);
        mkdir(dexfilepath, 0777);

    
        memset(dexfilepath, 0, 1000);
        sprintf(dexfilepath, "/data/data/%s/mydemo/%d_dexfile_execute.dex", szProcName, size_int_);

        if (access(dexfilepath, F_OK) !=-1 )
        {
            LOG(ERROR) << "ArtMethod::saveDexFileByExecute,dexfilefp exists";
        }
        else
        {
            int fp = open(dexfilepath, O_CREAT | O_APPEND | O_RDWR, 0666);
            if (fp > 0)
            {
                result = write(fp, (void *)begin_, size_);
                if (result < 0)
                {
                    LOG(ERROR) << "ArtMethod::saveDexFileByExecute,write dexfilepath error";
                }
                fsync(fp);
                close(fp);
                memset(dexfilepath, 0, 1000);
                sprintf(dexfilepath, "/data/data/%s/mydemo/%d_classlist_execute.txt", szProcName, size_int_);
                int classlistfile = open(dexfilepath, O_CREAT | O_APPEND | O_RDWR, 0666);
                if (classlistfile > 0)
                {
                    for (size_t ii = 0; ii < dex_file->NumClassDefs(); ++ii)
                    {
                        const dex::ClassDef &class_def = dex_file->GetClassDef(ii);
                        const char *descriptor = dex_file->GetClassDescriptor(class_def);
                        result = write(classlistfile, (void *)descriptor, strlen(descriptor));
                        if (result < 0)
                        {
                            LOG(ERROR) << "ArtMethod::saveDexFileByExecute,write classlistfile file error";
                        }
                        const char *temp = "\n";
                        result = write(classlistfile, (void *)temp, 1);
                        if (result < 0)
                        {
                            LOG(ERROR) << "ArtMethod::saveDexFileByExecute,write classlistfile file error";
                        }
                    }
                    fsync(classlistfile);
                    close(classlistfile);
                }
            } else {
                LOG(ERROR) << "ArtMethod::saveDexFileByExecute,open dexfilepath error";
            }
        }
    }

    if (dexfilepath != nullptr)
    {
        free(dexfilepath);
        dexfilepath = nullptr;
    }
}


//抽取加固的脱壳
