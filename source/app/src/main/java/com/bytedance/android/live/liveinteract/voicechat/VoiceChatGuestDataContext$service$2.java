package com.bytedance.android.live.liveinteract.voicechat;

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
public final class VoiceChatGuestDataContext$service$2 extends Lambda implements Function1<IQY<AbstractC5015e>, Unit> {
    public static final VoiceChatGuestDataContext$service$2 INSTANCE = new VoiceChatGuestDataContext$service$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(30814);
    }

    public VoiceChatGuestDataContext$service$2() {
        super(1);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.VoiceChatGuestDataContext$service$2$1 */
    /* loaded from: classes3.dex */
    public static final class C49881 extends Lambda implements Function1<AbstractC412992Wf<AbstractC5015e>, Unit> {
        public static final C49881 INSTANCE = new C49881();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(30815);
        }

        public C49881() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AbstractC412992Wf<AbstractC5015e> abstractC412992Wf) {
            if (!PatchProxy.proxy(new Object[]{abstractC412992Wf}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(abstractC412992Wf);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(IQY<AbstractC5015e> iqy) {
        IQY<AbstractC5015e> iqy2 = iqy;
        if (!PatchProxy.proxy(new Object[]{iqy2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(iqy2);
            iqy2.LIZ(C49881.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
