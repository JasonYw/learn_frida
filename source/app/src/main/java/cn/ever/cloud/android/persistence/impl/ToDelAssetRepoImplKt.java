package cn.ever.cloud.android.persistence.impl;

import cn.ever.cloud.android.entity.ToDelAsset;
import cn.ever.cloud.android.persistence.table.DbToDelAsset;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class ToDelAssetRepoImplKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(2931);
    }

    /* renamed from: to */
    public static final ToDelAsset m20562to(DbToDelAsset dbToDelAsset) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dbToDelAsset}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (ToDelAsset) proxy.result;
        }
        C106862S5w.LIZ(dbToDelAsset);
        return new ToDelAsset(dbToDelAsset.getAssetId(), dbToDelAsset.getPath(), dbToDelAsset.getUri());
    }

    public static final DbToDelAsset toDb(ToDelAsset toDelAsset) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{toDelAsset}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (DbToDelAsset) proxy.result;
        }
        C106862S5w.LIZ(toDelAsset);
        return new DbToDelAsset(toDelAsset.getAssetId(), toDelAsset.getPath(), toDelAsset.getUri());
    }
}
