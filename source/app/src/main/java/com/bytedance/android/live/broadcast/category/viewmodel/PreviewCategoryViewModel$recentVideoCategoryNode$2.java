package com.bytedance.android.live.broadcast.category.viewmodel;

import com.bytedance.android.live.broadcast.api.model.CategoryNode;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p002O.C0002O;
import p003X.AbstractC80293Hkt;
import p003X.C87308Kak;
import p003X.IOM;
import p003X.KM9;

/* loaded from: classes3.dex */
public final class PreviewCategoryViewModel$recentVideoCategoryNode$2 extends Lambda implements Function0<NextLiveData<List<? extends CategoryNode>>> {
    public static final PreviewCategoryViewModel$recentVideoCategoryNode$2 INSTANCE = new PreviewCategoryViewModel$recentVideoCategoryNode$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(15166);
    }

    public PreviewCategoryViewModel$recentVideoCategoryNode$2() {
        super(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: LIZ */
    public NextLiveData<List<CategoryNode>> mo30099invoke() {
        List<CategoryNode> arrayList;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (NextLiveData) proxy.result;
        }
        NextLiveData<List<CategoryNode>> nextLiveData = new NextLiveData<>();
        C87308Kak<String> c87308Kak = AbstractC80293Hkt.LJJIFFI;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        String LIZ = c87308Kak.LIZ();
        try {
            arrayList = (List) KM9.LIZ().fromJson(LIZ, new IOM().getType());
        } catch (Exception unused) {
            ALogger.m15800e("category", C0002O.m25086C("category parse error:", LIZ));
            arrayList = new ArrayList<>();
        }
        nextLiveData.setValue(arrayList);
        return nextLiveData;
    }
}
