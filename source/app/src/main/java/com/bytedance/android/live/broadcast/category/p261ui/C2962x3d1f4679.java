package com.bytedance.android.live.broadcast.category.p261ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.broadcast.category.ui.PreviewCategoryDialog$mLayoutChangeListener$1$keyboardHeightThreshold$2 */
/* loaded from: classes22.dex */
public final class C2962x3d1f4679 extends Lambda implements Function0<Integer> {
    public static final C2962x3d1f4679 INSTANCE = new C2962x3d1f4679();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(15080);
    }

    public C2962x3d1f4679() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Integer mo30099invoke() {
        int LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            LIZ = ((Integer) proxy.result).intValue();
        } else {
            LIZ = LK5.LIZ(120.0f);
        }
        return Integer.valueOf(LIZ);
    }
}
