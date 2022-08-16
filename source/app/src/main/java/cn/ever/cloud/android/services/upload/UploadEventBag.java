package cn.ever.cloud.android.services.upload;

import cn.ever.cloud.android.services.task.entity.EventBag;
import cn.ever.cloud.android.services.task.entity.ItemProgress;
import cn.ever.cloud.android.services.task.entity.ProviderKey;
import cn.ever.cloud.android.services.task.entity.TaskItem;
import cn.ever.cloud.android.services.task.entity.TaskState;
import cn.ever.cloud.utils.error.EpError;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class UploadEventBag extends EventBag {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3129);
    }

    /* loaded from: classes23.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3130);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UploadEventBag cancel(TaskItem taskItem) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem}, this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return (UploadEventBag) proxy.result;
            }
            C106862S5w.LIZ(taskItem);
            return new UploadEventBag(taskItem.getId(), taskItem.getItemKey(), taskItem.getGroupId(), taskItem.getGroupKey(), taskItem.getKind(), taskItem.getProviderKey(), TaskState.Deleted, null);
        }

        public final UploadEventBag complete(TaskItem taskItem) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (UploadEventBag) proxy.result;
            }
            C106862S5w.LIZ(taskItem);
            return new UploadEventBag(taskItem.getId(), taskItem.getItemKey(), taskItem.getGroupId(), taskItem.getGroupKey(), taskItem.getKind(), taskItem.getProviderKey(), TaskState.Succeeded, null);
        }

        public final UploadEventBag error(TaskItem taskItem, EpError epError) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem, epError}, this, changeQuickRedirect, false, 4);
            if (proxy.isSupported) {
                return (UploadEventBag) proxy.result;
            }
            C106862S5w.LIZ(taskItem, epError);
            return new UploadEventBag(taskItem.getId(), taskItem.getItemKey(), taskItem.getGroupId(), taskItem.getGroupKey(), taskItem.getKind(), taskItem.getProviderKey(), TaskState.Failed, epError);
        }

        public final UploadEventBag progress(TaskItem taskItem, ItemProgress itemProgress) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem, itemProgress}, this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return (UploadEventBag) proxy.result;
            }
            C106862S5w.LIZ(taskItem, itemProgress);
            UploadEventBag uploadEventBag = new UploadEventBag(taskItem.getId(), taskItem.getItemKey(), taskItem.getGroupId(), taskItem.getGroupKey(), taskItem.getKind(), taskItem.getProviderKey(), TaskState.Running, null);
            uploadEventBag.setItemProgress(itemProgress);
            return uploadEventBag;
        }
    }

    @Override // cn.ever.cloud.android.services.task.entity.EventBag
    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "UploadEventBag(" + super.toString() + LoggerUtil.S_RIGHT_TAG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadEventBag(long j, String str, Long l, String str2, int i, ProviderKey providerKey, TaskState taskState, EpError epError) {
        super(j, str, l, str2, i, providerKey, taskState, epError);
        C106862S5w.LIZ(str, providerKey, taskState);
    }
}
