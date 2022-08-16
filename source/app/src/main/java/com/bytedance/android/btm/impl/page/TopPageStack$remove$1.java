package com.bytedance.android.btm.impl.page;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C142369dz9;

/* loaded from: classes18.dex */
public final class TopPageStack$remove$1 extends Lambda implements Function1<C142369dz9<Object>, Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Object $page;

    static {
        Covode.recordClassIndex(11436);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopPageStack$remove$1(Object obj) {
        super(1);
        this.$page = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(C142369dz9<Object> c142369dz9) {
        C142369dz9<Object> c142369dz92 = c142369dz9;
        boolean z = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c142369dz92}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            z = ((Boolean) proxy.result).booleanValue();
        } else {
            C106862S5w.LIZ(c142369dz92);
            if (!Intrinsics.areEqual(c142369dz92.get(), this.$page) && c142369dz92.get() != null) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
