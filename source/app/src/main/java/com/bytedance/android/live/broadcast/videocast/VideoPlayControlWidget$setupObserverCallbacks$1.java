package com.bytedance.android.live.broadcast.videocast;

import android.app.Dialog;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.live.broadcast.videocast.VideoPlayControlWidget;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.livesdk.chatroom.C5929dx;
import com.bytedance.android.livesdk.widget.DialogC9362aa;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C439993ar;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class VideoPlayControlWidget$setupObserverCallbacks$1 extends Lambda implements Function1<List<? extends C5929dx.C5930b>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ VideoPlayControlWidget this$0;

    static {
        Covode.recordClassIndex(18069);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPlayControlWidget$setupObserverCallbacks$1(VideoPlayControlWidget videoPlayControlWidget) {
        super(1);
        this.this$0 = videoPlayControlWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(List<? extends C5929dx.C5930b> list) {
        C2WC<Integer> LIZIZ;
        C2WD<C5929dx.C5930b> LIZJ;
        C5929dx.C5930b LIZIZ2;
        List<? extends C5929dx.C5930b> list2 = list;
        if (!PatchProxy.proxy(new Object[]{list2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(list2);
            if (!list2.isEmpty()) {
                C5929dx LIZJ2 = this.this$0.LIZJ();
                if (LIZJ2 != null && (LIZJ = LIZJ2.LIZJ()) != null && LIZJ.LIZ() != null) {
                    if (this.this$0.LIZJ == VideoPlayControlWidget.ViewState.PLAY_FINISHED && (LIZIZ2 = C5929dx.LIZLLL.LIZIZ()) != null) {
                        this.this$0.LIZ(LIZIZ2);
                    }
                } else {
                    C3251d LIZ = this.this$0.LIZ();
                    Context context = this.this$0.context;
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    if (!PatchProxy.proxy(new Object[]{context}, LIZ, C3251d.LIZ, false, 1).isSupported) {
                        C106862S5w.LIZ(context);
                        FragmentActivity LIZIZ3 = C439993ar.LIZIZ(context);
                        Dialog dialog = LIZ.LIZIZ;
                        if ((dialog == null || !dialog.isShowing()) && LIZIZ3 != null) {
                            DialogC9362aa dialogC9362aa = new DialogC9362aa(LIZIZ3);
                            dialogC9362aa.LIZIZ = LK5.LIZ(2131572219);
                            C116971W2r.LIZJ(dialogC9362aa);
                            LIZ.LIZIZ = dialogC9362aa;
                        } else {
                            ALogger.m15801d("VideoPlay", "show loading failed, " + LIZIZ3);
                        }
                    }
                    C5929dx LIZJ3 = this.this$0.LIZJ();
                    if (LIZJ3 != null && (LIZIZ = LIZJ3.LIZIZ()) != null) {
                        LIZIZ.LIZ(0);
                    }
                    this.this$0.LIZ((C5929dx.C5930b) CollectionsKt___CollectionsKt.first((List<? extends Object>) list2));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
