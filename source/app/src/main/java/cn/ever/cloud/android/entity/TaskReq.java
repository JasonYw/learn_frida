package cn.ever.cloud.android.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class TaskReq {
    public final List<String> assetIds;
    public String downloadFolder;
    public final String taskKey;
    public final Boolean useMobile;

    static {
        Covode.recordClassIndex(2872);
    }

    public final List<String> getAssetIds() {
        return this.assetIds;
    }

    public final String getDownloadFolder() {
        return this.downloadFolder;
    }

    public final String getTaskKey() {
        return this.taskKey;
    }

    public final Boolean getUseMobile() {
        return this.useMobile;
    }

    /* loaded from: classes23.dex */
    public static final class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public List<String> assetIds = CollectionsKt__CollectionsKt.emptyList();
        public String downloadFolder;
        public String taskKey;
        public Boolean useMobile;

        static {
            Covode.recordClassIndex(2873);
        }

        public final TaskReq build() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return (TaskReq) proxy.result;
            }
            String str = this.taskKey;
            Intrinsics.checkNotNull(str);
            return new TaskReq(str, this.assetIds, this.useMobile, this.downloadFolder, null);
        }

        public final Builder downloadFolder(String str) {
            this.downloadFolder = str;
            return this;
        }

        public final Builder useMobile(Boolean bool) {
            this.useMobile = bool;
            return this;
        }

        public final Builder assets(List<String> list) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            C106862S5w.LIZ(list);
            this.assetIds = list;
            return this;
        }

        public final Builder taskKey(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            C106862S5w.LIZ(str);
            this.taskKey = str;
            return this;
        }
    }

    public final void setDownloadFolder(String str) {
        this.downloadFolder = str;
    }

    public TaskReq(String str, List<String> list, Boolean bool, String str2) {
        this.taskKey = str;
        this.assetIds = list;
        this.useMobile = bool;
        this.downloadFolder = str2;
    }

    public /* synthetic */ TaskReq(String str, List list, Boolean bool, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, bool, str2);
    }

    public /* synthetic */ TaskReq(String str, List list, Boolean bool, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? null : str2);
    }
}
