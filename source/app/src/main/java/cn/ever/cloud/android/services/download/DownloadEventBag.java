package cn.ever.cloud.android.services.download;

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
import p002O.C0002O;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class DownloadEventBag extends EventBag {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String completePath;

    static {
        Covode.recordClassIndex(3002);
    }

    /* loaded from: classes23.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3003);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DownloadEventBag cancel(TaskItem taskItem) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem}, this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return (DownloadEventBag) proxy.result;
            }
            C106862S5w.LIZ(taskItem);
            return new DownloadEventBag(taskItem.getId(), taskItem.getItemKey(), taskItem.getGroupId(), taskItem.getGroupKey(), taskItem.getKind(), taskItem.getProviderKey(), TaskState.Deleted, null, null);
        }

        public final DownloadEventBag complete(TaskItem taskItem, String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem, str}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (DownloadEventBag) proxy.result;
            }
            C106862S5w.LIZ(taskItem, str);
            return new DownloadEventBag(taskItem.getId(), taskItem.getItemKey(), taskItem.getGroupId(), taskItem.getGroupKey(), taskItem.getKind(), taskItem.getProviderKey(), TaskState.Succeeded, null, str);
        }

        public final DownloadEventBag error(TaskItem taskItem, EpError epError) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem, epError}, this, changeQuickRedirect, false, 4);
            if (proxy.isSupported) {
                return (DownloadEventBag) proxy.result;
            }
            C106862S5w.LIZ(taskItem, epError);
            return new DownloadEventBag(taskItem.getId(), taskItem.getItemKey(), taskItem.getGroupId(), taskItem.getGroupKey(), taskItem.getKind(), taskItem.getProviderKey(), TaskState.Failed, epError, null);
        }

        public final DownloadEventBag progress(TaskItem taskItem, ItemProgress itemProgress) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem, itemProgress}, this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return (DownloadEventBag) proxy.result;
            }
            C106862S5w.LIZ(taskItem, itemProgress);
            DownloadEventBag downloadEventBag = new DownloadEventBag(taskItem.getId(), taskItem.getItemKey(), taskItem.getGroupId(), taskItem.getGroupKey(), taskItem.getKind(), taskItem.getProviderKey(), TaskState.Running, null, null);
            downloadEventBag.setItemProgress(itemProgress);
            return downloadEventBag;
        }
    }

    public final String getCompletePath() {
        return this.completePath;
    }

    @Override // cn.ever.cloud.android.services.task.entity.EventBag
    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return C0002O.m25083C("DownloadEventBag(", super.toString(), ", complete=", this.completePath, Character.valueOf(LoggerUtil.S_RIGHT_TAG));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadEventBag(long j, String str, Long l, String str2, int i, ProviderKey providerKey, TaskState taskState, EpError epError, String str3) {
        super(j, str, l, str2, i, providerKey, taskState, epError);
        C106862S5w.LIZ(str, providerKey, taskState);
        this.completePath = str3;
    }
}
