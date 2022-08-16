package com.bytedance.android.live.liveinteract.interact.audience.fragment.p361v2;

import android.view.View;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC78050Gpo;
import p003X.C106862S5w;
import p003X.C78301Gtr;

/* renamed from: com.bytedance.android.live.liveinteract.interact.audience.fragment.v2.InteractAudienceOpenFragment$onCreateView$1 */
/* loaded from: classes3.dex */
public final class InteractAudienceOpenFragment$onCreateView$1 extends Lambda implements Function1<View, Unit> {
    public static final InteractAudienceOpenFragment$onCreateView$1 INSTANCE = new InteractAudienceOpenFragment$onCreateView$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(27300);
    }

    public InteractAudienceOpenFragment$onCreateView$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            AbstractC4774i LIZ = AbstractC78050Gpo.LIZ();
            if (LIZ != null) {
                LIZ.LIZIZ("right_away");
            }
            C78301Gtr.LIZIZ.LIZ("livesdk_guest_connection_open_click");
        }
        return Unit.INSTANCE;
    }
}
