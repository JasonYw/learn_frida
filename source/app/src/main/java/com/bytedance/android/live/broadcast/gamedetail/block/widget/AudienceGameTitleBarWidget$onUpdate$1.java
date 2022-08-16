package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty1;

/* loaded from: classes5.dex */
public final /* synthetic */ class AudienceGameTitleBarWidget$onUpdate$1 extends PropertyReference1Impl {
    public static final KProperty1 INSTANCE = new AudienceGameTitleBarWidget$onUpdate$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16347);
    }

    public AudienceGameTitleBarWidget$onUpdate$1() {
        super(C3086g.class, "style", "getStyle()I", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return Integer.valueOf(((C3086g) obj).LIZIZ);
    }
}
