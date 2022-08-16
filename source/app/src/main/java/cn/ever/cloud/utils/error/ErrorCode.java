package cn.ever.cloud.utils.error;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes23.dex */
public enum ErrorCode {
    CLIENT_NETWORK(300, "网络异常"),
    CLIENT_NETWORK_CLIENT(301, "网络异常"),
    CLIENT_OTHER(10000, "内部错误"),
    CLIENT_DOWNLOAD_INTERNAL(10100, "下载出错"),
    CLIENT_DOWNLOAD_TASK_DUPLICATED(10101, "下载重复任务"),
    CLIENT_DOWNLOAD_RECOVERABLE(10102, "下载出错，请重试"),
    CLIENT_DOWNLOAD_PATH_IS_DIRECTORY(10103, "路径已存在并且是一个文件夹"),
    CLIENT_DOWNLOAD_SWAP_TEMP_FILE(10104, "临时文件重命名错误"),
    CLIENT_DOWNLOAD_CHUNK_TO_LARGE(10105, "分块文件太大"),
    CLIENT_DOWNLOAD_CHUNK_INCOMPLETE(10106, "分块不完整"),
    CLIENT_DOWNLOAD_CHUNK_DECRYPT(10107, "分块文件解密错误"),
    CLIENT_DOWNLOAD_SIZE_INCONSISTENCY(10108, "下载文件大小不一致"),
    CLIENT_DOWNLOAD_MD5_INCONSISTENCY(10107, "下载文件效验出错"),
    CLIENT_UPLOAD_INTERNAL(10200, "上传出错"),
    CLIENT_UPLOAD_TASKS_EMPTY(10201, "上传任务为空"),
    CLIENT_UPLOAD_GROUP_NOT_EXISTS(10202, "上传任务不存在"),
    CLIENT_UPLOAD_FILE_NOT_EXISTS(10203, "文件不存在"),
    CLIENT_ASSET_INTERNAL(10300, "资源出错"),
    CLIENT_ASSET_NOT_FOUND(10301, "资源不存在"),
    CLIENT_AUTH_EMPTY_TOKEN(10401, "Token为空"),
    CLIENT_AUTH_UID_MISMATCH(10402, "Uid不一致"),
    CLIENT_AUTH_EP_UID_MISMATCH(10403, "EpUid不一致"),
    SERVER_INVALID_PARAM(20001, "非法参数"),
    SERVER_PRIVILEGE(20014, "无权限操作"),
    SERVER_API_NOT_FOUND(20018, "所访问的API不存在"),
    SERVER_FEATURE_NOT_AVAILABLE(20031, "功能暂不可用"),
    SERVER_CONCURRENCY_TRANSACTION(20032, "并发冲突"),
    SERVER_NO_AUTH(20104, "未登录"),
    SERVER_QUOTA(20113, "空间不足"),
    SERVER_AUTH_TOKEN_INCONSISTENT(20127, "用户信息认证失败"),
    SERVER_MEDIA_ALREADY_UPLOADED(20202, "该文件已经上传"),
    SERVER_MEDIA_CHUNK_INCOMPLETE(20204, "数据块不完整"),
    SERVER_MEDIA_NOT_EXIST(20206, "媒体资源不存在或已被删除"),
    SERVER_MEDIA_INVALID_CONTENT(20209, "非法的文件内容"),
    SERVER_MEDIA_FILE_TOO_LARGE(20211, "上传文件太大了"),
    SERVER_MEDIA_DATA_NOT_COMPLETE(20213, "上传数据不完整"),
    SERVER_MD5_INCONSISTENT(20223, "文件校验失败"),
    SERVER_MEDIA_NOT_COMPLETE(20225, "数据块不完整"),
    SERVER_TAG_NOT_EXIST(21101, "找不到对应的相册"),
    SERVER_INVALID_TAG_NAME(21102, "相册名称过长"),
    SERVER_FLOW_CONTROL(30002, "服务太火爆了，请稍后重试"),
    SERVER_INTERNAL(30005, "内部错误"),
    SERVER_SERVER_BUS(30006, "服务器忙，请稍后再试");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int code;
    public final String message;
    public static final Companion Companion = new Companion(null);
    public static final Lazy orderedCode$delegate = LazyKt__LazyJVMKt.lazy(ErrorCode$Companion$orderedCode$2.INSTANCE);

    public static ErrorCode valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (ErrorCode) (proxy.isSupported ? proxy.result : Enum.valueOf(ErrorCode.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ErrorCode[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (ErrorCode[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    /* loaded from: classes23.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3454);
        }

        private final List<ErrorCode> getOrderedCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            return (List) (proxy.isSupported ? proxy.result : ErrorCode.orderedCode$delegate.mo27335getValue());
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ErrorCode findByCode(int i) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return (ErrorCode) proxy.result;
            }
            int binarySearch$default = CollectionsKt__CollectionsKt.binarySearch$default(getOrderedCode(), 0, 0, new ErrorCode$Companion$findByCode$index$1(i), 3, (Object) null);
            if (binarySearch$default < 0) {
                return null;
            }
            return getOrderedCode().get(binarySearch$default);
        }
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    static {
        Covode.recordClassIndex(3453);
    }

    ErrorCode(int i, String str) {
        this.code = i;
        this.message = str;
    }
}
