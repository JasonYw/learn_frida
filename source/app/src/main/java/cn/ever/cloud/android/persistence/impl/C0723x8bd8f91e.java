package cn.ever.cloud.android.persistence.impl;

import cn.ever.cloud.android.persistence.table.DbAlbumAssetRelation;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* renamed from: cn.ever.cloud.android.persistence.impl.AssetRepositoryImpl$upsertAlbumAssetRelation$allAlbumAssetRelation$2 */
/* loaded from: classes23.dex */
public final class C0723x8bd8f91e extends Lambda implements Function1<List<? extends Long>, List<? extends DbAlbumAssetRelation>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AssetRepositoryImpl this$0;

    static {
        Covode.recordClassIndex(2924);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0723x8bd8f91e(AssetRepositoryImpl assetRepositoryImpl) {
        super(1);
        this.this$0 = assetRepositoryImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ List<? extends DbAlbumAssetRelation> invoke(List<? extends Long> list) {
        return invoke2((List<Long>) list);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final List<DbAlbumAssetRelation> invoke2(List<Long> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        C106862S5w.LIZ(list);
        return this.this$0.f21050db.assetDao().getAlbumAssetRelationsByLinkIds(list);
    }
}
