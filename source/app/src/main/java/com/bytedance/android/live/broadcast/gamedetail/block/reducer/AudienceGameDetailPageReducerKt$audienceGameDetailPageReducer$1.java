package com.bytedance.android.live.broadcast.gamedetail.block.reducer;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C89098L8q;
import p003X.C89099L8r;

/* loaded from: classes5.dex */
public final class AudienceGameDetailPageReducerKt$audienceGameDetailPageReducer$1 extends Lambda implements Function2<C3070b, AbstractC3071c, C3070b> {
    public static final AudienceGameDetailPageReducerKt$audienceGameDetailPageReducer$1 INSTANCE = new AudienceGameDetailPageReducerKt$audienceGameDetailPageReducer$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16275);
    }

    public AudienceGameDetailPageReducerKt$audienceGameDetailPageReducer$1() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, com.bytedance.android.live.broadcast.gamedetail.block.reducer.b] */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ C3070b invoke(C3070b c3070b, AbstractC3071c abstractC3071c) {
        C3070b c3070b2 = c3070b;
        AbstractC3071c abstractC3071c2 = abstractC3071c;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3070b2, abstractC3071c2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3070b2, abstractC3071c2);
        if (abstractC3071c2 instanceof C89099L8r) {
            C89099L8r c89099L8r = (C89099L8r) abstractC3071c2;
            if (Intrinsics.areEqual(c89099L8r.LIZ, "tab_comment")) {
                return C3070b.LIZ(c3070b2, c89099L8r.LIZ, 0, 0, 0, 2, false, 46, null);
            }
            if (c3070b2.LIZJ == 2) {
                return C3070b.LIZ(c3070b2, c89099L8r.LIZ, 0, 0, 0, 1, false, 46, null);
            }
            return C3070b.LIZ(c3070b2, c89099L8r.LIZ, 0, 0, 0, 3, false, 46, null);
        } else if (abstractC3071c2 instanceof C89098L8q) {
            if (c3070b2.f25853LJ == 2 && (!Intrinsics.areEqual(c3070b2.LIZIZ, "tab_comment"))) {
                C89098L8q c89098L8q = (C89098L8q) abstractC3071c2;
                if (c89098L8q.LIZ == 5 || c89098L8q.LIZ == 3) {
                    return C3070b.LIZ(c3070b2, null, 0, c89098L8q.LIZ, 0, 0, false, 27, null);
                }
            }
            return C3070b.LIZ(c3070b2, null, 0, ((C89098L8q) abstractC3071c2).LIZ, 0, 0, true, 27, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
