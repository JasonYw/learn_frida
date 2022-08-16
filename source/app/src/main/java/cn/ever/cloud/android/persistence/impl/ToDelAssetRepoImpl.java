package cn.ever.cloud.android.persistence.impl;

import cn.ever.cloud.android.entity.ToDelAsset;
import cn.ever.cloud.android.p039a.AbstractC0682d;
import cn.ever.cloud.android.persistence.SdkDatabase;
import cn.ever.cloud.android.persistence.table.DbToDelAsset;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import p003X.AbstractC529026vA;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class ToDelAssetRepoImpl implements AbstractC0682d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: db */
    public final SdkDatabase f21052db;

    static {
        Covode.recordClassIndex(2930);
    }

    public final SdkDatabase getDb() {
        return this.f21052db;
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0682d
    public final List<ToDelAsset> batchGet() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        List<DbToDelAsset> list = this.f21052db.todoAssetDao().get();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (DbToDelAsset dbToDelAsset : list) {
            arrayList.add(ToDelAssetRepoImplKt.m20562to(dbToDelAsset));
        }
        return arrayList;
    }

    public ToDelAssetRepoImpl(SdkDatabase sdkDatabase) {
        C106862S5w.LIZ(sdkDatabase);
        this.f21052db = sdkDatabase;
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0682d
    public final void insert(ToDelAsset toDelAsset) {
        if (PatchProxy.proxy(new Object[]{toDelAsset}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(toDelAsset);
        this.f21052db.todoAssetDao().insert(ToDelAssetRepoImplKt.toDb(toDelAsset));
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0682d
    public final void delete(List<ToDelAsset> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        AbstractC529026vA abstractC529026vA = this.f21052db.todoAssetDao();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (ToDelAsset toDelAsset : list) {
            arrayList.add(ToDelAssetRepoImplKt.toDb(toDelAsset));
        }
        Object[] array = arrayList.toArray(new DbToDelAsset[0]);
        if (array != null) {
            abstractC529026vA.delete((DbToDelAsset[]) array);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
