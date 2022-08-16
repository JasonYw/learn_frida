package com.bytedance.android.live.p238ai.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C101471Pxh;

/* renamed from: com.bytedance.android.live.ai.impl.AiService$startStreamStrategy$1 */
/* loaded from: classes8.dex */
public final class AiService$startStreamStrategy$1 extends Lambda implements Function0<Unit> {
    public static final AiService$startStreamStrategy$1 INSTANCE = new AiService$startStreamStrategy$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(13840);
    }

    public AiService$startStreamStrategy$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C101471Pxh.LIZJ.LIZ();
        }
        return Unit.INSTANCE;
    }
}
