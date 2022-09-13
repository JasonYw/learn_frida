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

extern "C" char *base64_encode(char *str, long str_len, long *outlen)
{
    long len;
    char *res;
    int i, j;
    const char *base64_table = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    if (str_len % 3 == 0)
        len = str_len / 3 * 4;
    else
        len = (str_len / 3 + 1) * 4;

    res = (char *)malloc(sizeof(char) * (len + 1));
    res[len] = '\0';
    *outlen = len;
    for (i = 0, j = 0; i < len - 2; j += 3, i += 4)
    {
        res[i] = base64_table[str[j] >> 2];
        res[i + 1] = base64_table[(str[j] & 0x3) << 4 | (str[j + 1] >> 4)];
        res[i + 2] = base64_table[(str[j + 1] & 0xf) << 2 | (str[j + 2] >> 6)];
        res[i + 3] = base64_table[str[j + 2] & 0x3f];
    }

    switch (str_len % 3)
    {
    case 1:
        res[i - 2] = '=';
        res[i - 1] = '=';
        break;
    case 2:
        res[i - 1] = '=';
        break;
    }

    return res;
}

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
        sprintf(dexfilepath, "/data/data/%s/mydemo", szProcName);
        mkdir(dexfilepath, 0777);

        memset(dexfilepath, 0, 1000);
        sprintf(dexfilepath, "/data/data/%s/mydemo/%d_dexfile_execute.dex", szProcName, size_int_);

        if (access(dexfilepath, F_OK) != -1)
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
            }
            else
            {
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

extern "C" void saveArtMethod(ArtMethod *artMethod) REQUIRES_SHARED(Locks::mutator_lock_)
{
    char *dexfilepath = (char *)malloc(sizeof(char) * 1000);
    if (dexfilepath == nullptr)
    {
        LOG(ERROR) << "artMethod::saveArtMethod,methodname:" << artMethod->PrettyMethod().c_str() << "malloc 1000 byte failed";
        return;
    }
    int result = 0;
    int fcmdline = -1;
    char szCmdline[64] = {0};
    char szProcName[256] = {0};
    int procid = getpid();
    sprintf(szCmdline, "/proc/%d/cmdline", procid);
    fcmdline = open(szCmdline, O_RDONLY | O_CREAT, 0644);
    if (fcmdline > 0)
    {
        result = read(fcmdline, szProcName, 256);
        if (result < 0)
        {
            LOG(ERROR) << "artMethod::saveArtMethod,open cmdline file error";
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
        sprintf(dexfilepath, "/data/data/%s/mydemo", szProcName);
        mkdir(dexfilepath, 0777);

        memset(dexfilepath, 0, 1000);
        sprintf(dexfilepath, "/data/data/%s/mydemo/%d_dexfile_artMethod.dex", szProcName, size_int_);

        if (access(dexfilepath, F_OK) != -1)
        {
            LOG(ERROR) << "artMethod::saveArtMethod,dexfilefp exists";
        }
        else
        {
            int fp = open(dexfilepath, O_CREAT | O_APPEND | O_RDWR, 0666);
            if (fp > 0)
            {
                result = write(fp, (void *)begin_, size_);
                if (result < 0)
                {
                    LOG(ERROR) << "artMethod::saveArtMethod,write dexfilepath error";
                }
                fsync(fp);
                close(fp);
                memset(dexfilepath, 0, 1000);
                sprintf(dexfilepath, "/data/data/%s/mydemo/%d_classlist_artMethod.txt", szProcName, size_int_);
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
                            LOG(ERROR) << "artMethod::saveArtMethod,write classlistfile file error";
                        }
                        const char *temp = "\n";
                        result = write(classlistfile, (void *)temp, 1);
                        if (result < 0)
                        {
                            LOG(ERROR) << "artMethod::saveArtMethod,write classlistfile file error";
                        }
                    }
                    fsync(classlistfile);
                    close(classlistfile);
                }
            }
            else
            {
                LOG(ERROR) << "artMethod::saveArtMethod,open dexfilepath error";
            }
        }
        const dex::CodeItem *code_item = artMethod->GetCodeItem(); // dex_code_item_offset_
        if (code_item != nullptr)
        {
            memset(dexfilepath, 0, 1000);
            sprintf(dexfilepath, "/data/data/%s/mydemo/%d_ins_%d.bin", szProcName, size_int_, (int)gettidv1());
            int fp2 = open(dexfilepath, O_CREAT | O_APPEND | O_RDWR, 0666);
            if (fp2 > 0)
            {
                lseek(fp2, 0, SEEK_END);
                uint32_t method_idx = artMethod->GetDexMethodIndex();
                int offset = (int)artMethod->GetDexMethodIndex();
                int code_item_len = dex_file->GetCodeItemSize(*code_item);
                memset(dexfilepath, 0, 1000);
                sprintf(dexfilepath, "{name:%s,method_idx:%d,offset:%d,code_item_len:%d,ins:", artMethod->PrettyMethod().c_str(), method_idx, offset, code_item_len);
                int contentlength = 0;
                while (dexfilepath[contentlength] != 0)
                    contentlength++;
                result = write(fp2, (void *)dexfilepath, contentlength);
                if (result < 0)
                {
                    LOG(ERROR) << "artMethod::saveArtMethod,write ins file error";
                }
                long outlen = 0;
                char *base64result = base64_encode((char *)code_item, (long)code_item_len, &outlen);
                result = write(fp2, base64result, outlen);
                if (result < 0)
                {
                    LOG(ERROR) << "artMethod::saveArtMethod,write ins file error";
                }
                result = write(fp2, "};", 2);
                if (result < 0)
                {
                    LOG(ERROR) << "artMethod::saveArtMethod,write ins file error";
                }
                fsync(fp2);
                close(fp2);
                if (base64result != nullptr)
                {
                    free(base64result);
                    base64result = nullptr;
                }
            }
        }
    }
    if (dexfilepath != nullptr)
    {
        free(dexfilepath);
        dexfilepath = nullptr;
    }
}

extern "C" void mydemoFunctionInvoke(ArtMethod *artmethod) REQUIRES_SHARED(Locks::mutator_lock_)
{
    JValue *result = nullptr;
    Thread *self = nullptr;
    uint32_t temp = 6;
    uint32_t *args = &temp;
    uint32_t args_size = 6;
    artmethod->Invoke(self, args, args_size, result, "mydemo");
}



