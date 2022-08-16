package cn.ever.cloud.android.api;

import cn.ever.cloud.android.entity.Task;
import cn.ever.cloud.android.entity.TaskItem;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes23.dex */
public interface UploadApi {
    static {
        Covode.recordClassIndex(2753);
    }

    Object cancel(String str, Continuation<? super Unit> continuation);

    Flow<TaskItem> getItemState();

    Flow<TaskItem> getItemState(String str, String str2);

    Flow<Task> getTaskState(String str);

    Object pause(String str, Continuation<? super Unit> continuation);

    Object pauseAll(Integer num, Continuation<? super Unit> continuation);

    Object resume(String str, Continuation<? super Unit> continuation);

    Object resumeAll(Integer num, Continuation<? super Unit> continuation);

    Object retry(String str, List<String> list, Continuation<? super Unit> continuation);

    /* loaded from: classes23.dex */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(2754);
        }

        public static /* synthetic */ Object pauseAll$default(UploadApi uploadApi, Integer num, Continuation continuation, int i, Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uploadApi, num, continuation, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 3);
            if (proxy.isSupported) {
                return proxy.result;
            }
            if (obj == null) {
                if ((i & 1) != 0) {
                    num = null;
                }
                return uploadApi.pauseAll(num, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pauseAll");
        }

        public static /* synthetic */ Object resumeAll$default(UploadApi uploadApi, Integer num, Continuation continuation, int i, Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uploadApi, num, continuation, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return proxy.result;
            }
            if (obj == null) {
                if ((i & 1) != 0) {
                    num = null;
                }
                return uploadApi.resumeAll(num, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeAll");
        }

        public static /* synthetic */ Object retry$default(UploadApi uploadApi, String str, List list, Continuation continuation, int i, Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uploadApi, str, list, continuation, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            if (obj == null) {
                if ((i & 2) != 0) {
                    list = null;
                }
                return uploadApi.retry(str, list, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retry");
        }
    }
}
