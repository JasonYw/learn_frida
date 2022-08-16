package cn.ever.cloud.android.persistence.impl;

import cn.ever.cloud.android.entity.AlbumAssetRelation;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* renamed from: cn.ever.cloud.android.persistence.impl.AssetRepositoryImpl$upsertAlbumAssetRelation$allAlbumAssetRelation$1 */
/* loaded from: classes23.dex */
public final class C0722x8bd8f91d extends Lambda implements Function1<AlbumAssetRelation, Long> {
    public static final C0722x8bd8f91d INSTANCE = new C0722x8bd8f91d();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(2923);
    }

    public C0722x8bd8f91d() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Long invoke(AlbumAssetRelation albumAssetRelation) {
        return Long.valueOf(invoke2(albumAssetRelation));
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final long invoke2(AlbumAssetRelation albumAssetRelation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{albumAssetRelation}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        C106862S5w.LIZ(albumAssetRelation);
        return albumAssetRelation.getLinkId();
    }
}
