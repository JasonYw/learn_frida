package com.bytedance.android.btm.api.viewpager;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class BtmViewPagerUtils$setUserVisibleHint$1 extends Lambda implements Function0<Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Object $fragment;
    public final /* synthetic */ boolean $isVisibleToUser;

    static {
        Covode.recordClassIndex(11332);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BtmViewPagerUtils$setUserVisibleHint$1(Object obj, boolean z) {
        super(0);
        this.$fragment = obj;
        this.$isVisibleToUser = z;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.$fragment.getClass().getSimpleName() + " setUserVisibleHint " + this.$isVisibleToUser;
    }
}
