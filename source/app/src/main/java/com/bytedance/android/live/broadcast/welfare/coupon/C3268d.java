package com.bytedance.android.live.broadcast.welfare.coupon;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.scalpel.scenemanager.core.AbstractC13971f;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.LD4;
import p003X.LDA;
import p003X.LDD;

/* renamed from: com.bytedance.android.live.broadcast.welfare.coupon.d */
/* loaded from: classes5.dex */
public final class C3268d extends Fragment implements AbstractC13971f {
    public static ChangeQuickRedirect LIZ;
    public static final LDA LIZJ = new LDA((byte) 0);
    public String LIZIZ;
    public View LIZLLL;

    /* renamed from: LJ */
    public LD4 f25962LJ;
    public HashMap LJFF;

    static {
        Covode.recordClassIndex(18217);
    }

    @Override // com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public final String getSceneFullName() {
        return "com/bytedance/android/live/broadcast/welfare/coupon/ReceivedCouponFragment";
    }

    @Override // com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public final String getSceneSimpleName() {
        return "ReceivedCouponFragment";
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        HashMap hashMap;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onDestroyView();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported && (hashMap = this.LJFF) != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onDestroy();
        LD4 ld4 = this.f25962LJ;
        if (ld4 != null && !PatchProxy.proxy(new Object[0], ld4, LD4.LIZ, false, 6).isSupported) {
            ld4.LJFF.dispose();
            LDD ldd = ld4.LIZIZ;
            if (ldd == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (!PatchProxy.proxy(new Object[0], ldd, LDD.LIZ, false, 9).isSupported) {
                ldd.LIZIZ.dispose();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MethodCollector.m14708i(1360);
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 2).isSupported) {
            MethodCollector.m14707o(1360);
            return;
        }
        C106862S5w.LIZ(view);
        super.onViewCreated(view, bundle);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            View view2 = this.LIZLLL;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            ViewGroup viewGroup = (ViewGroup) view2.findViewById(2131175880);
            View view3 = this.LIZLLL;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            Context context = view3.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            this.f25962LJ = new LD4(context, "coupon_storage", this.LIZIZ, null, 8);
            LD4 ld4 = this.f25962LJ;
            if (ld4 != null) {
                ld4.LIZ();
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            if (viewGroup != null) {
                viewGroup.addView(this.f25962LJ, layoutParams);
                MethodCollector.m14707o(1360);
                return;
            }
        }
        MethodCollector.m14707o(1360);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(layoutInflater);
        View LIZ2 = C116971W2r.LIZ(layoutInflater, 2131699292, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        this.LIZLLL = LIZ2;
        View view = this.LIZLLL;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return view;
    }
}
