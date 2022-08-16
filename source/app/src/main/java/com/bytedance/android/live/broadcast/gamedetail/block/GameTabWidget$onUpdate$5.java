package com.bytedance.android.live.broadcast.gamedetail.block;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty1;

/* loaded from: classes5.dex */
public final /* synthetic */ class GameTabWidget$onUpdate$5 extends PropertyReference1Impl {
    public static final KProperty1 INSTANCE = new GameTabWidget$onUpdate$5();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16173);
    }

    public GameTabWidget$onUpdate$5() {
        super(C3053d.class, "tabStyle", "getTabStyle()I", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return Integer.valueOf(((C3053d) obj).LIZLLL);
    }
}
