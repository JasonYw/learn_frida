package com.bytedance.android.live.broadcast.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.utility.SharedPrefHelper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.LK5;

/* loaded from: classes12.dex */
public final class PreviewTaskWidget$spHelper$2 extends Lambda implements Function0<SharedPrefHelper> {
    public static final PreviewTaskWidget$spHelper$2 INSTANCE = new PreviewTaskWidget$spHelper$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(18723);
    }

    public PreviewTaskWidget$spHelper$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.ies.utility.SharedPrefHelper] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ SharedPrefHelper mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return SharedPrefHelper.LIZ(LK5.LJIIJ(), "anchor_tasks");
    }
}
