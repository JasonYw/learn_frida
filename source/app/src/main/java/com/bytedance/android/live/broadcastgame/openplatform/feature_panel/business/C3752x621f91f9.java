package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.broadcastgame.api.model.C3380j;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.broadcastgame.api.model.InteractID;
import com.bytedance.android.live.broadcastgame.api.p286d.AbstractC3354n;
import com.bytedance.android.live.broadcastgame.api.p286d.C3355o;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C87793KiZ;
import p003X.C87795Kib;
import p003X.C88440Kt0;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.PreviewOpenFeatureBehaviorProviderKt$PREVIEW_TOOLBAR_BEHAVIOR_FACTORY$1 */
/* loaded from: classes5.dex */
public final class C3752x621f91f9 extends Lambda implements Function2<C3380j, C3765k, AbstractC3354n> {
    public static final C3752x621f91f9 INSTANCE = new C3752x621f91f9();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21325);
    }

    public C3752x621f91f9() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, com.bytedance.android.live.broadcastgame.api.d.n] */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ AbstractC3354n invoke(C3380j c3380j, C3765k c3765k) {
        final C3380j c3380j2 = c3380j;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3380j2, c3765k}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3380j2);
        if (c3380j2.LIZLLL == InteractID.OpenMicroApp.value) {
            return new AbstractC3354n() { // from class: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.PreviewOpenFeatureBehaviorProviderKt$PREVIEW_TOOLBAR_BEHAVIOR_FACTORY$1.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(21326);
                }

                @Override // com.bytedance.android.live.broadcastgame.api.p286d.AbstractC3354n
                public final void LIZ(View view, C3355o c3355o) {
                    String str;
                    boolean z;
                    if (PatchProxy.proxy(new Object[]{view, c3355o}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    C106862S5w.LIZ(view, c3355o);
                    C87793KiZ c87793KiZ = C87793KiZ.LIZIZ;
                    C3383p LJFF = c3355o.LJFF.LJFF();
                    if (LJFF == null || (str = LJFF.LJLIIIL) == null) {
                        str = "";
                    }
                    String str2 = c3355o.LJFF.f26023LJ;
                    InteractID LIZ2 = InteractID.Companion.LIZ(c3355o.LJIJ);
                    long j = c3355o.LJIIZILJ;
                    if (c3355o.LIZLLL == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c87793KiZ.LIZ(false, str, str2, LIZ2, j, z);
                    C87795Kib c87795Kib = C87795Kib.LIZIZ;
                    Context context = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    c87795Kib.LIZ(context, c3355o.LJFF.LJI());
                }
            };
        }
        return new AbstractC3354n() { // from class: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.PreviewOpenFeatureBehaviorProviderKt$PREVIEW_TOOLBAR_BEHAVIOR_FACTORY$1.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(21327);
            }

            @Override // com.bytedance.android.live.broadcastgame.api.p286d.AbstractC3354n
            public final void LIZ(View view, C3355o c3355o) {
                if (PatchProxy.proxy(new Object[]{view, c3355o}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                C106862S5w.LIZ(view, c3355o);
                C88440Kt0.LIZ("当前Behavior 未注册，interactType = " + C3380j.this.LIZLLL);
            }
        };
    }
}
