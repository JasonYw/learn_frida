package com.bytedance.android.live.profit;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC412992Wf;
import p003X.C106862S5w;
import p003X.IQY;

/* loaded from: classes5.dex */
public final class PrivilegeContext$service$2 extends Lambda implements Function1<IQY<C5278h>, Unit> {
    public static final PrivilegeContext$service$2 INSTANCE = new PrivilegeContext$service$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(33215);
    }

    public PrivilegeContext$service$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(IQY<C5278h> iqy) {
        IQY<C5278h> iqy2 = iqy;
        if (!PatchProxy.proxy(new Object[]{iqy2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(iqy2);
            iqy2.LIZ(C52461.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.bytedance.android.live.profit.PrivilegeContext$service$2$1 */
    /* loaded from: classes5.dex */
    public static final class C52461 extends Lambda implements Function1<AbstractC412992Wf<C5278h>, Unit> {
        public static final C52461 INSTANCE = new C52461();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(33216);
        }

        public C52461() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AbstractC412992Wf<C5278h> abstractC412992Wf) {
            AbstractC412992Wf<C5278h> abstractC412992Wf2 = abstractC412992Wf;
            if (!PatchProxy.proxy(new Object[]{abstractC412992Wf2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(abstractC412992Wf2);
                C5278h LIZIZ = abstractC412992Wf2.LIZIZ();
                if (LIZIZ != null) {
                    LIZIZ.dispose();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
