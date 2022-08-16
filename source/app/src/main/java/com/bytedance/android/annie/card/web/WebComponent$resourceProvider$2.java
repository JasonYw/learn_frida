package com.bytedance.android.annie.card.web;

import com.bytedance.android.annie.card.web.resource.C2604b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C99718PPc;
import p003X.PPK;

/* loaded from: classes7.dex */
public final class WebComponent$resourceProvider$2 extends Lambda implements Function0<C2604b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C99718PPc this$0;

    static {
        Covode.recordClassIndex(10689);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebComponent$resourceProvider$2(C99718PPc c99718PPc) {
        super(0);
        this.this$0 = c99718PPc;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, com.bytedance.android.annie.card.web.resource.b] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2604b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C2604b c2604b = new C2604b(this.this$0.LJFF(), this.this$0.LJI());
        PPK ppk = new PPK(this);
        if (!PatchProxy.proxy(new Object[]{ppk}, c2604b, C2604b.LIZ, false, 9).isSupported) {
            C106862S5w.LIZ(ppk);
            c2604b.LIZLLL = ppk;
        }
        return c2604b;
    }
}
