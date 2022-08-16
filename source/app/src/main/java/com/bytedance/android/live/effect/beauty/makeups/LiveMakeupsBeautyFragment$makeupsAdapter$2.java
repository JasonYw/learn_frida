package com.bytedance.android.live.effect.beauty.makeups;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.KFD;

/* loaded from: classes5.dex */
public final class LiveMakeupsBeautyFragment$makeupsAdapter$2 extends Lambda implements Function0<C4186b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C4188c this$0;

    static {
        Covode.recordClassIndex(24386);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveMakeupsBeautyFragment$makeupsAdapter$2(C4188c c4188c) {
        super(0);
        this.this$0 = c4188c;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.android.live.effect.beauty.makeups.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.bytedance.android.live.effect.beauty.makeups.b, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4186b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C4188c c4188c = this.this$0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c4188c, C4188c.LIZ, false, 9);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        C4186b c4186b = new C4186b(2131699079, c4188c.LIZLLL);
        KFD kfd = new KFD(c4188c);
        if (!PatchProxy.proxy(new Object[]{kfd}, c4186b, C4186b.LIZ, false, 6).isSupported) {
            C106862S5w.LIZ(kfd);
            c4186b.LIZLLL = kfd;
        }
        return c4186b;
    }
}
