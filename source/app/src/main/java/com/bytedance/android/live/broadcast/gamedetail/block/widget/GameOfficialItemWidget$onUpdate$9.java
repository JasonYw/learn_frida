package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty1;

/* loaded from: classes5.dex */
public final /* synthetic */ class GameOfficialItemWidget$onUpdate$9 extends PropertyReference1Impl {
    public static final KProperty1 INSTANCE = new GameOfficialItemWidget$onUpdate$9();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16408);
    }

    public GameOfficialItemWidget$onUpdate$9() {
        super(C3092r.class, "hasCert", "getHasCert()Z", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return Boolean.valueOf(((C3092r) obj).f25873LJ);
    }
}
