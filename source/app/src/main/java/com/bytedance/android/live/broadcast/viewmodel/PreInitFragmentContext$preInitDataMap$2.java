package com.bytedance.android.live.broadcast.viewmodel;

import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.preview.C3180k;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C2WD;

/* loaded from: classes12.dex */
public final class PreInitFragmentContext$preInitDataMap$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3257c this$0;

    static {
        Covode.recordClassIndex(18118);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreInitFragmentContext$preInitDataMap$2(C3257c c3257c) {
        super(0);
        this.this$0 = c3257c;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        C3180k c3180k;
        C2WD<RoomCreateInfo> LIZIZ;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (c3180k = this.this$0.LJI) != null && (LIZIZ = c3180k.LIZIZ()) != null) {
            LIZIZ.LIZ(this.this$0.m15876LJ().LIZ());
        }
        return Unit.INSTANCE;
    }
}
