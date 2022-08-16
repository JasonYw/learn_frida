package cn.ever.cloud.android.services.upload;

import cn.ever.cloud.android.services.task.entity.PauseReason;
import cn.ever.cloud.android.services.task.entity.TaskState;
import cn.ever.cloud.utils.error.EpError;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class UploadTaskItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final Long cloudId;
    public final EpError error;
    public final long groupId;
    public final String groupKey;

    /* renamed from: id */
    public final long f21062id;
    public final UploadMedia media;
    public final PauseReason pauseReason;
    public final TaskState status;

    static {
        Covode.recordClassIndex(3153);
    }

    public static /* synthetic */ UploadTaskItem copy$default(UploadTaskItem uploadTaskItem, long j, UploadMedia uploadMedia, long j2, String str, TaskState taskState, Long l, EpError epError, PauseReason pauseReason, int i, Object obj) {
        long j3 = j;
        UploadMedia uploadMedia2 = uploadMedia;
        long j4 = j2;
        String str2 = str;
        TaskState taskState2 = taskState;
        Long l2 = l;
        EpError epError2 = epError;
        PauseReason pauseReason2 = pauseReason;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uploadTaskItem, new Long(j3), uploadMedia2, new Long(j4), str2, taskState2, l2, epError2, pauseReason2, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (UploadTaskItem) proxy.result;
        }
        if ((i & 1) != 0) {
            j3 = uploadTaskItem.f21062id;
        }
        if ((i & 2) != 0) {
            uploadMedia2 = uploadTaskItem.media;
        }
        if ((i & 4) != 0) {
            j4 = uploadTaskItem.groupId;
        }
        if ((i & 8) != 0) {
            str2 = uploadTaskItem.groupKey;
        }
        if ((i & 16) != 0) {
            taskState2 = uploadTaskItem.status;
        }
        if ((i & 32) != 0) {
            l2 = uploadTaskItem.cloudId;
        }
        if ((i & 64) != 0) {
            epError2 = uploadTaskItem.error;
        }
        if ((i & 128) != 0) {
            pauseReason2 = uploadTaskItem.pauseReason;
        }
        return uploadTaskItem.copy(j3, uploadMedia2, j4, str2, taskState2, l2, epError2, pauseReason2);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.f21062id), this.media, Long.valueOf(this.groupId), this.groupKey, this.status, this.cloudId, this.error, this.pauseReason};
    }

    public final long component1() {
        return this.f21062id;
    }

    public final UploadMedia component2() {
        return this.media;
    }

    public final long component3() {
        return this.groupId;
    }

    public final String component4() {
        return this.groupKey;
    }

    public final TaskState component5() {
        return this.status;
    }

    public final Long component6() {
        return this.cloudId;
    }

    public final EpError component7() {
        return this.error;
    }

    public final PauseReason component8() {
        return this.pauseReason;
    }

    public final UploadTaskItem copy(long j, UploadMedia uploadMedia, long j2, String str, TaskState taskState, Long l, EpError epError, PauseReason pauseReason) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), uploadMedia, new Long(j2), str, taskState, l, epError, pauseReason}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (UploadTaskItem) proxy.result;
        }
        C106862S5w.LIZ(uploadMedia, str, taskState);
        return new UploadTaskItem(j, uploadMedia, j2, str, taskState, l, epError, pauseReason);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof UploadTaskItem) {
            return C106862S5w.LIZ(((UploadTaskItem) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("UploadTaskItem:%s,%s,%s,%s,%s,%s,%s,%s", getObjects());
    }

    public final Long getCloudId() {
        return this.cloudId;
    }

    public final EpError getError() {
        return this.error;
    }

    public final long getGroupId() {
        return this.groupId;
    }

    public final String getGroupKey() {
        return this.groupKey;
    }

    public final long getId() {
        return this.f21062id;
    }

    public final UploadMedia getMedia() {
        return this.media;
    }

    public final PauseReason getPauseReason() {
        return this.pauseReason;
    }

    public final TaskState getStatus() {
        return this.status;
    }

    public UploadTaskItem(long j, UploadMedia uploadMedia, long j2, String str, TaskState taskState, Long l, EpError epError, PauseReason pauseReason) {
        C106862S5w.LIZ(uploadMedia, str, taskState);
        this.f21062id = j;
        this.media = uploadMedia;
        this.groupId = j2;
        this.groupKey = str;
        this.status = taskState;
        this.cloudId = l;
        this.error = epError;
        this.pauseReason = pauseReason;
    }
}
