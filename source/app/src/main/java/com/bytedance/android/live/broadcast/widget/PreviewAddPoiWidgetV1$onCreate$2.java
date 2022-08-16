package com.bytedance.android.live.broadcast.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.p249d.C2815b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sdk.bridge.p1355js.delegate.JsBridgeDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p002O.C0002O;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C144451eWj;
import p003X.C3J9;
import p003X.C87308Kak;
import p003X.LK5;

/* loaded from: classes12.dex */
public final class PreviewAddPoiWidgetV1$onCreate$2 extends Lambda implements Function1<C2815b, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewAddPoiWidgetV1 this$0;

    static {
        Covode.recordClassIndex(18407);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewAddPoiWidgetV1$onCreate$2(PreviewAddPoiWidgetV1 previewAddPoiWidgetV1) {
        super(1);
        this.this$0 = previewAddPoiWidgetV1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C2815b c2815b) {
        C2815b c2815b2 = c2815b;
        if (!PatchProxy.proxy(new Object[]{c2815b2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c2815b2);
            if (c2815b2.LIZIZ && c2815b2.LIZJ.length() > 0) {
                View view = this.this$0.contentView;
                Intrinsics.checkNotNullExpressionValue(view, "");
                TextView textView = (TextView) view.findViewById(2131185910);
                if (textView != null) {
                    new StringBuilder();
                    textView.setText(C0002O.m25086C(this.this$0.LIZLLL(), c2815b2.LIZJ));
                }
                C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.LJJLIIIJILLIZJL;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                if (!c87308Kak.LIZ().booleanValue()) {
                    PreviewAddPoiWidgetV1 previewAddPoiWidgetV1 = this.this$0;
                    final Context context = previewAddPoiWidgetV1.context;
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    previewAddPoiWidgetV1.LIZJ = new Dialog(context) { // from class: X.1yT
                        static {
                            Covode.recordClassIndex(18100);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(context, 2131494992);
                            C106862S5w.LIZ(context);
                            MethodCollector.m14708i(1353);
                            setContentView(LayoutInflater.from(getContext()).inflate(2131698424, (ViewGroup) null));
                            MethodCollector.m14707o(1353);
                        }
                    };
                    Dialog dialog = this.this$0.LIZJ;
                    if (dialog != null) {
                        C116971W2r.LIZIZ(dialog);
                    }
                    C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.LJJLIIIJILLIZJL;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                    c87308Kak2.LIZ(Boolean.TRUE);
                    C3J9.LIZ().postDelayed(new Runnable() { // from class: com.bytedance.android.live.broadcast.widget.PreviewAddPoiWidgetV1$onCreate$2.1
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(18408);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Dialog dialog2;
                            Dialog dialog3;
                            if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            Context context2 = PreviewAddPoiWidgetV1$onCreate$2.this.this$0.context;
                            if (!(context2 instanceof Activity)) {
                                context2 = null;
                            }
                            Activity activity = (Activity) context2;
                            if (activity != null && !activity.isFinishing() && (dialog2 = PreviewAddPoiWidgetV1$onCreate$2.this.this$0.LIZJ) != null && dialog2.isShowing() && (dialog3 = PreviewAddPoiWidgetV1$onCreate$2.this.this$0.LIZJ) != null) {
                                C116971W2r.LIZ(dialog3);
                            }
                        }
                    }, JsBridgeDelegate.GET_URL_OUT_TIME);
                }
            } else {
                if (C144451eWj.LIZ(this.this$0.context, "android.permission.ACCESS_FINE_LOCATION")) {
                    C87308Kak<Integer> c87308Kak3 = AbstractC80293Hkt.LJJLIIIJ;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak3, "");
                    Integer LIZ = c87308Kak3.LIZ();
                    if (LIZ != null && LIZ.intValue() == 1) {
                        new StringBuilder();
                        String m25086C = C0002O.m25086C(this.this$0.LIZLLL(), LK5.LIZ(2131583164));
                        View view2 = this.this$0.contentView;
                        Intrinsics.checkNotNullExpressionValue(view2, "");
                        TextView textView2 = (TextView) view2.findViewById(2131185910);
                        if (textView2 != null) {
                            textView2.setText(m25086C);
                        }
                    }
                }
                View view3 = this.this$0.contentView;
                Intrinsics.checkNotNullExpressionValue(view3, "");
                TextView textView3 = (TextView) view3.findViewById(2131185910);
                if (textView3 != null) {
                    textView3.setText(this.this$0.LIZJ());
                }
            }
        }
        return Unit.INSTANCE;
    }
}
