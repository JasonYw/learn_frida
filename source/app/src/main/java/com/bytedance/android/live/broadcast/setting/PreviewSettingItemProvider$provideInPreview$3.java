package com.bytedance.android.live.broadcast.setting;

import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C2WD;
import p003X.C421822me;

/* loaded from: classes12.dex */
public final class PreviewSettingItemProvider$provideInPreview$3 extends Lambda implements Function0<Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C421822me this$0;

    static {
        Covode.recordClassIndex(17876);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewSettingItemProvider$provideInPreview$3(C421822me c421822me) {
        super(0);
        this.this$0 = c421822me;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Boolean mo30099invoke() {
        C2WD<Boolean> LJJJLIIL;
        Boolean LIZ;
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            z = ((Boolean) proxy.result).booleanValue();
        } else {
            C3199v c3199v = this.this$0.LIZJ;
            if (c3199v != null && (LJJJLIIL = c3199v.LJJJLIIL()) != null && (LIZ = LJJJLIIL.LIZ()) != null) {
                z = LIZ.booleanValue();
            }
        }
        return Boolean.valueOf(z);
    }
}
