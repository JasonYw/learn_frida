package cn.ever.cloud.android.services.task.entity;

import cn.ever.cloud.utils.error.EpError;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public abstract class EventBag {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final EpError error;
    public final Long groupId;
    public final String groupKey;
    public final long itemId;
    public final String itemKey;
    public ItemProgress itemProgress;
    public final ProviderKey providerKey;
    public final TaskState state;
    public final int taskKind;

    static {
        Covode.recordClassIndex(3087);
    }

    public final EpError getError() {
        return this.error;
    }

    public final Long getGroupId() {
        return this.groupId;
    }

    public final String getGroupKey() {
        return this.groupKey;
    }

    public final long getItemId() {
        return this.itemId;
    }

    public final String getItemKey() {
        return this.itemKey;
    }

    public final ItemProgress getItemProgress() {
        return this.itemProgress;
    }

    public final ProviderKey getProviderKey() {
        return this.providerKey;
    }

    public final TaskState getState() {
        return this.state;
    }

    public final int getTaskKind() {
        return this.taskKind;
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "itemId=" + this.itemId + ", itemKey='" + this.itemKey + "', groupKey=" + this.groupKey + ", taskKind=" + this.taskKind + ", state=" + this.state;
    }

    public final void setItemProgress(ItemProgress itemProgress) {
        this.itemProgress = itemProgress;
    }

    public EventBag(long j, String str, Long l, String str2, int i, ProviderKey providerKey, TaskState taskState, EpError epError) {
        C106862S5w.LIZ(str, providerKey, taskState);
        this.itemId = j;
        this.itemKey = str;
        this.groupId = l;
        this.groupKey = str2;
        this.taskKind = i;
        this.providerKey = providerKey;
        this.state = taskState;
        this.error = epError;
    }
}
