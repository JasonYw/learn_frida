package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12636a;
import com.bytedance.ies.sve_core.AbstractC12641j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C89020L5q;
import p003X.C89103L8v;
import p003X.C89104L8w;

/* loaded from: classes5.dex */
public final class AudienceBottomBarWidget$onMount$2 extends Lambda implements Function1<AbstractC12641j, AbstractC12636a> {
    public static final AudienceBottomBarWidget$onMount$2 INSTANCE = new AudienceBottomBarWidget$onMount$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16317);
    }

    public AudienceBottomBarWidget$onMount$2() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, com.bytedance.ies.sve_core.a] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ AbstractC12636a invoke(AbstractC12641j abstractC12641j) {
        AbstractC12641j abstractC12641j2 = abstractC12641j;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC12641j2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(abstractC12641j2);
        if (abstractC12641j2 instanceof C89020L5q) {
            if (((C89020L5q) abstractC12641j2).LIZIZ) {
                return C89104L8w.LIZ;
            }
            return C89103L8v.LIZ;
        }
        return abstractC12641j2;
    }
}
