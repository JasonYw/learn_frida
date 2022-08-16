package com.bytedance.android.live.broadcast.gamedetail.anchor;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.AbstractC88931L2f;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C81918IQm;
import p003X.C88928L2c;
import p003X.L29;
import p003X.L2Q;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.anchor.l */
/* loaded from: classes5.dex */
public final class C3039l extends AbstractC88931L2f {
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ;
    public View LIZJ;
    public final Lazy LIZLLL = LIZIZ(L2Q.class);

    /* renamed from: LJ */
    public HashMap f25845LJ;

    static {
        Covode.recordClassIndex(16091);
    }

    private final L2Q LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (L2Q) (proxy.isSupported ? proxy.result : this.LIZLLL.mo27335getValue());
    }

    @Override // p003X.AbstractC88931L2f
    public final void LIZJ() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported && (hashMap = this.f25845LJ) != null) {
            hashMap.clear();
        }
    }

    @Override // p003X.AbstractC88931L2f, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onDestroyView();
        LIZJ();
    }

    @Override // p003X.AbstractC88931L2f, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        super.onViewCreated(view, bundle);
        getDialog().setCanceledOnTouchOutside(false);
        String str = null;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            Dialog dialog = getDialog();
            Intrinsics.checkNotNullExpressionValue(dialog, "");
            Window window = dialog.getWindow();
            if (window != null) {
                View decorView = window.getDecorView();
                if (decorView != null) {
                    decorView.setPadding(0, 0, 0, 0);
                }
                WindowManager.LayoutParams attributes = window.getAttributes();
                if (attributes != null) {
                    attributes.width = MathKt__MathJVMKt.roundToInt(C81918IQm.LIZ(getContext(), 280.0f));
                    attributes.height = MathKt__MathJVMKt.roundToInt(C81918IQm.LIZ(getContext(), 152.0f));
                }
                if (window != null) {
                    window.setAttributes(attributes);
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            View view2 = this.LIZJ;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            TextView textView = (TextView) view2.findViewById(2131165370);
            String str2 = this.LIZIZ;
            if (str2 != null && str2.length() > 0) {
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setText(this.LIZIZ);
            } else {
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setText(LK5.LIZ(2131581914));
            }
            View view3 = this.LIZJ;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            view3.findViewById(2131168671).setOnClickListener(new L29(this));
        }
        if (!PatchProxy.proxy(new Object[]{"livesdk_game_promote_anchor_promote_intercepted_show"}, this, LIZ, false, 4).isSupported) {
            String LIZLLL = C88928L2c.LIZIZ.LIZLLL();
            Pair[] pairArr = new Pair[7];
            pairArr[0] = TuplesKt.m137to("anchor_id", C88928L2c.LIZIZ.LIZ());
            pairArr[1] = TuplesKt.m137to("live_type", LIZLLL);
            C3243u c3243u = LIZ().LIZ().LIZ().LIZIZ;
            if (c3243u != null) {
                str = c3243u.LIZLLL;
            }
            pairArr[2] = TuplesKt.m137to("game_name", str);
            pairArr[3] = TuplesKt.m137to("enter_from", "promote_detail");
            pairArr[4] = TuplesKt.m137to("game_id", LIZ().f8725LJ);
            pairArr[5] = TuplesKt.m137to("prorate_min", LIZ().LIZ().LIZ().LIZLLL);
            pairArr[6] = TuplesKt.m137to("prorate_max", LIZ().LIZ().LIZ().LIZJ);
            Map<String, String> mutableMapOf = MapsKt__MapsKt.mutableMapOf(pairArr);
            if (C88928L2c.LIZIZ.m23439LJ()) {
                mutableMapOf.put("room_id", C88928L2c.LIZIZ.LIZIZ());
            }
            String str3 = LIZ().LIZ().LIZ().LJI;
            if (str3 != null) {
                if (!(!StringsKt__StringsJVMKt.isBlank(str3))) {
                    str3 = "null";
                }
                mutableMapOf.put("ad_words", str3);
            }
            C88928L2c.LIZIZ.LIZ("livesdk_game_promote_anchor_promote_intercepted_show", mutableMapOf, new Object[0]);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(layoutInflater);
        View LIZ2 = C116971W2r.LIZ(layoutInflater, 2131698307, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        this.LIZJ = LIZ2;
        return LIZ2;
    }
}