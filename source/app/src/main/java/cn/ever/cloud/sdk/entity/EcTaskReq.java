package cn.ever.cloud.sdk.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.random.Random;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class EcTaskReq {
    public final String downloadSavePath;
    public final String taskKey;
    public final List<String> uniformIds;
    public final Boolean useMobile;

    static {
        Covode.recordClassIndex(3403);
    }

    public final String getDownloadSavePath() {
        return this.downloadSavePath;
    }

    public final String getTaskKey() {
        return this.taskKey;
    }

    public final List<String> getUniformIds() {
        return this.uniformIds;
    }

    public final Boolean getUseMobile() {
        return this.useMobile;
    }

    /* loaded from: classes23.dex */
    public static final class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String downloadSavePath;
        public Boolean useMobile;
        public List<String> assetIds = CollectionsKt__CollectionsKt.emptyList();
        public String taskKey = String.valueOf(Random.Default.nextLong());

        static {
            Covode.recordClassIndex(3404);
        }

        public final EcTaskReq build() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
            if (proxy.isSupported) {
                return (EcTaskReq) proxy.result;
            }
            return new EcTaskReq(this.taskKey, this.assetIds, this.useMobile, this.downloadSavePath, null);
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

        public final Builder downloadSavePath(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            C106862S5w.LIZ(str);
            this.downloadSavePath = str;
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

        public final Builder useMobile(boolean z) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 4);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            this.useMobile = Boolean.valueOf(z);
            return this;
        }
    }

    public EcTaskReq(String str, List<String> list, Boolean bool, String str2) {
        this.taskKey = str;
        this.uniformIds = list;
        this.useMobile = bool;
        this.downloadSavePath = str2;
    }

    public /* synthetic */ EcTaskReq(String str, List list, Boolean bool, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, bool, str2);
    }

    public /* synthetic */ EcTaskReq(String str, List list, Boolean bool, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? null : str2);
    }
}
