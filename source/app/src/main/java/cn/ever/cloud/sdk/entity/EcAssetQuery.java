package cn.ever.cloud.sdk.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class EcAssetQuery {
    public final long albumId;
    public final EcPageParams pageParams;

    static {
        Covode.recordClassIndex(3392);
    }

    public final long getAlbumId() {
        return this.albumId;
    }

    public final EcPageParams getPageParams() {
        return this.pageParams;
    }

    /* loaded from: classes23.dex */
    public static final class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long albumId;
        public final EcPageParams ecPageParams;

        static {
            Covode.recordClassIndex(3393);
        }

        public final EcAssetQuery build() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return (EcAssetQuery) proxy.result;
            }
            EcPageParams ecPageParams = this.ecPageParams;
            Long l = this.albumId;
            Intrinsics.checkNotNull(l);
            return new EcAssetQuery(ecPageParams, l.longValue());
        }

        public Builder(EcPageParams ecPageParams) {
            C106862S5w.LIZ(ecPageParams);
            this.ecPageParams = ecPageParams;
        }

        public final Builder albumId(long j) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            this.albumId = Long.valueOf(j);
            return this;
        }
    }

    public EcAssetQuery(EcPageParams ecPageParams, long j) {
        C106862S5w.LIZ(ecPageParams);
        this.pageParams = ecPageParams;
        this.albumId = j;
    }
}
