package cn.ever.cloud.android.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class TaskItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String assetId;
    public final String completePath;
    public final Integer errCode;
    public final String errMsg;
    public final int state;
    public final String taskKey;

    static {
        Covode.recordClassIndex(2868);
    }

    public static /* synthetic */ TaskItem copy$default(TaskItem taskItem, String str, String str2, int i, Integer num, String str3, String str4, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem, str, str2, Integer.valueOf(i), num, str3, str4, Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (TaskItem) proxy.result;
        }
        if ((i2 & 1) != 0) {
            str = taskItem.taskKey;
        }
        if ((i2 & 2) != 0) {
            str2 = taskItem.assetId;
        }
        if ((i2 & 4) != 0) {
            i = taskItem.state;
        }
        if ((i2 & 8) != 0) {
            num = taskItem.errCode;
        }
        if ((i2 & 16) != 0) {
            str3 = taskItem.errMsg;
        }
        if ((i2 & 32) != 0) {
            str4 = taskItem.completePath;
        }
        return taskItem.copy(str, str2, i, num, str3, str4);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.taskKey, this.assetId, Integer.valueOf(this.state), this.errCode, this.errMsg, this.completePath};
    }

    public final String component1() {
        return this.taskKey;
    }

    public final String component2() {
        return this.assetId;
    }

    public final int component3() {
        return this.state;
    }

    public final Integer component4() {
        return this.errCode;
    }

    public final String component5() {
        return this.errMsg;
    }

    public final String component6() {
        return this.completePath;
    }

    public final TaskItem copy(String str, String str2, int i, Integer num, String str3, String str4) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, Integer.valueOf(i), num, str3, str4}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (TaskItem) proxy.result;
        }
        C106862S5w.LIZ(str, str2);
        return new TaskItem(str, str2, i, num, str3, str4);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof TaskItem) {
            return C106862S5w.LIZ(((TaskItem) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("TaskItem:%s,%s,%s,%s,%s,%s", getObjects());
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final String getCompletePath() {
        return this.completePath;
    }

    public final Integer getErrCode() {
        return this.errCode;
    }

    public final String getErrMsg() {
        return this.errMsg;
    }

    public final int getState() {
        return this.state;
    }

    public final String getTaskKey() {
        return this.taskKey;
    }

    public TaskItem(String str, String str2, int i, Integer num, String str3, String str4) {
        C106862S5w.LIZ(str, str2);
        this.taskKey = str;
        this.assetId = str2;
        this.state = i;
        this.errCode = num;
        this.errMsg = str3;
        this.completePath = str4;
    }

    public /* synthetic */ TaskItem(String str, String str2, int i, Integer num, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, num, str3, (i2 & 32) != 0 ? null : str4);
    }
}
