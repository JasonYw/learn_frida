package com.bytedance.android.live.broadcast.preview.p277ui.widget;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.viewmodel.C3207d;
import com.bytedance.android.livesdk.C9078n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C427822wK;
import p003X.C77351GeX;
import p003X.C77741Gkp;
import p003X.C87308Kak;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.widget.StartLiveVisibilityServiceWidget$showVisibilitySettingDialog$1 */
/* loaded from: classes3.dex */
public final class StartLiveVisibilityServiceWidget$showVisibilitySettingDialog$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ StartLiveVisibilityServiceWidget this$0;

    static {
        Covode.recordClassIndex(17446);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveVisibilityServiceWidget$showVisibilitySettingDialog$1(StartLiveVisibilityServiceWidget startLiveVisibilityServiceWidget) {
        super(0);
        this.this$0 = startLiveVisibilityServiceWidget;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        C77741Gkp c77741Gkp;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZJ().LJII();
            this.this$0.LIZJ().LJIIIIZZ();
            C77351GeX c77351GeX = C77741Gkp.LJII;
            C3199v LIZIZ = this.this$0.LIZIZ();
            C3207d LIZJ = this.this$0.LIZJ();
            boolean z = this.this$0.LIZJ;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{LIZIZ, LIZJ, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, c77351GeX, C77351GeX.LIZ, false, 1);
            if (proxy.isSupported) {
                c77741Gkp = (C77741Gkp) proxy.result;
            } else {
                C106862S5w.LIZ(LIZJ);
                c77741Gkp = new C77741Gkp();
                c77741Gkp.LIZLLL = LIZIZ;
                c77741Gkp.f6444LJ = LIZJ;
                c77741Gkp.LJFF = z;
            }
            if (this.this$0.context instanceof FragmentActivity) {
                C427822wK c427822wK = C9078n.LJJIJLIJ;
                Context context = this.this$0.context;
                if (context != null) {
                    c427822wK.LIZ((FragmentActivity) context, c77741Gkp);
                    C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f7176ds;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                    c87308Kak.LIZ(Boolean.FALSE);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
            }
        }
        return Unit.INSTANCE;
    }
}
