package com.bytedance.android.live.broadcast.gamedetailv2;

import com.bytedance.android.live.broadcast.gamedetail.block.widget.C3093v;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty1;

/* loaded from: classes5.dex */
public final /* synthetic */ class GameDetailLoadingWidget$onUpdate$1 extends PropertyReference1Impl {
    public static final KProperty1 INSTANCE = new GameDetailLoadingWidget$onUpdate$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16586);
    }

    public GameDetailLoadingWidget$onUpdate$1() {
        super(C3093v.class, "show", "getShow()Z", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return Boolean.valueOf(((C3093v) obj).LIZIZ);
    }
}