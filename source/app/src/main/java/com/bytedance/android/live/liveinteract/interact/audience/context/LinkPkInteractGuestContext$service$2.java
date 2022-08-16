package com.bytedance.android.live.liveinteract.interact.audience.context;

import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4778p;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC412992Wf;
import p003X.C106862S5w;
import p003X.IQY;

/* loaded from: classes3.dex */
public final class LinkPkInteractGuestContext$service$2 extends Lambda implements Function1<IQY<AbstractC4778p>, Unit> {
    public static final LinkPkInteractGuestContext$service$2 INSTANCE = new LinkPkInteractGuestContext$service$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(27100);
    }

    public LinkPkInteractGuestContext$service$2() {
        super(1);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.interact.audience.context.LinkPkInteractGuestContext$service$2$1 */
    /* loaded from: classes3.dex */
    public static final class C44241 extends Lambda implements Function1<AbstractC412992Wf<AbstractC4778p>, Unit> {
        public static final C44241 INSTANCE = new C44241();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(27101);
        }

        public C44241() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AbstractC412992Wf<AbstractC4778p> abstractC412992Wf) {
            if (!PatchProxy.proxy(new Object[]{abstractC412992Wf}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(abstractC412992Wf);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(IQY<AbstractC4778p> iqy) {
        IQY<AbstractC4778p> iqy2 = iqy;
        if (!PatchProxy.proxy(new Object[]{iqy2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(iqy2);
            iqy2.LIZ(C44241.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
