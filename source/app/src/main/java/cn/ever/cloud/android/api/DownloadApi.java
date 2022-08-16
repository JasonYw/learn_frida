package cn.ever.cloud.android.api;

import cn.ever.cloud.android.entity.Task;
import cn.ever.cloud.android.entity.TaskItem;
import cn.ever.cloud.android.entity.TaskReq;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes23.dex */
public interface DownloadApi {
    static {
        Covode.recordClassIndex(2751);
    }

    Object cancel(String str, Continuation<? super Unit> continuation);

    Object download(TaskReq taskReq, Continuation<? super Pair<String, ? extends List<String>>> continuation);

    Flow<TaskItem> getItemState(String str, String str2);

    Flow<Task> getTaskState(String str);

    Object pauseAll(Integer num, Continuation<? super Unit> continuation);

    Object resumeAll(Integer num, Continuation<? super Unit> continuation);

    /* loaded from: classes23.dex */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(2752);
        }

        public static /* synthetic */ Object pauseAll$default(DownloadApi downloadApi, Integer num, Continuation continuation, int i, Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{downloadApi, num, continuation, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return proxy.result;
            }
            if (obj == null) {
                if ((i & 1) != 0) {
                    num = null;
                }
                return downloadApi.pauseAll(num, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pauseAll");
        }

        public static /* synthetic */ Object resumeAll$default(DownloadApi downloadApi, Integer num, Continuation continuation, int i, Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{downloadApi, num, continuation, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            if (obj == null) {
                if ((i & 1) != 0) {
                    num = null;
                }
                return downloadApi.resumeAll(num, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeAll");
        }
    }
}
