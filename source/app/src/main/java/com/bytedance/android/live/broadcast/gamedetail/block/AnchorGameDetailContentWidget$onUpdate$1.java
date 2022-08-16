package com.bytedance.android.live.broadcast.gamedetail.block;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty1;

/* loaded from: classes5.dex */
public final /* synthetic */ class AnchorGameDetailContentWidget$onUpdate$1 extends PropertyReference1Impl {
    public static final KProperty1 INSTANCE = new AnchorGameDetailContentWidget$onUpdate$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16154);
    }

    public AnchorGameDetailContentWidget$onUpdate$1() {
        super(C3050a.class, "hasOfficialInfo", "getHasOfficialInfo()Z", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return Boolean.valueOf(((C3050a) obj).LIZJ);
    }
}
