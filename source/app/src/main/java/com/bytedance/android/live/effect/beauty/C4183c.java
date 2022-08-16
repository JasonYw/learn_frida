package com.bytedance.android.live.effect.beauty;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.android.live.core.p317e.C4070a;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.base.AdjustPercentBar;
import com.bytedance.android.live.effect.base.C4181a;
import com.bytedance.android.live.effect.base.setting.LiveEffectSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.scalpel.scenemanager.core.AbstractC13971f;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C86676KDm;
import p003X.C86713KEx;
import p003X.C86715KEz;
import p003X.KF0;
import p003X.KF7;
import p003X.KF8;

/* renamed from: com.bytedance.android.live.effect.beauty.c */
/* loaded from: classes5.dex */
public final class C4183c extends C4070a implements AbstractC13971f {
    public static ChangeQuickRedirect LIZ;
    public static final KF8 LIZLLL = new KF8((byte) 0);
    public C4181a LIZIZ;
    public LiveEffectContextFactory.Type LIZJ = LiveEffectContextFactory.Type.DEFAULT;

    /* renamed from: LJ */
    public HashMap f26215LJ;

    static {
        Covode.recordClassIndex(24376);
    }

    private View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.f26215LJ == null) {
            this.f26215LJ = new HashMap();
        }
        View view = (View) this.f26215LJ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f26215LJ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public final String getSceneFullName() {
        return "com/bytedance/android/live/effect/beauty/PreViewBeautyFragment";
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public final String getSceneSimpleName() {
        return "PreViewBeautyFragment";
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        HashMap hashMap;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onDestroyView();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported && (hashMap = this.f26215LJ) != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onHiddenChanged(z);
        if (!LJIILIIL()) {
            return;
        }
        if (C4173o.LJIIJ.LIZ(this.LIZJ).LJII().LIZ(C86676KDm.LJI) > 0) {
            View LIZ2 = LIZ(2131192411);
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            LIZ2.setVisibility(0);
            FrameLayout frameLayout = (FrameLayout) LIZ(2131167876);
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setAlpha(0.5f);
            LinearLayout linearLayout = (LinearLayout) LIZ(2131187807);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setAlpha(0.5f);
            return;
        }
        View LIZ3 = LIZ(2131192411);
        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
        LIZ3.setVisibility(8);
        FrameLayout frameLayout2 = (FrameLayout) LIZ(2131167876);
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
        frameLayout2.setAlpha(1.0f);
        LinearLayout linearLayout2 = (LinearLayout) LIZ(2131187807);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setAlpha(1.0f);
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        super.onViewCreated(view, bundle);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            C86715KEz c86715KEz = C86713KEx.LJIIJJI;
            LiveEffectContextFactory.Type type = this.LIZJ;
            View LIZ2 = LIZ(2131187807);
            AdjustPercentBar adjustPercentBar = (AdjustPercentBar) LIZ(2131190074);
            SettingKey<Boolean> settingKey = LiveEffectSettingKeys.LIVE_ENABLE_VCD_EFFECT;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                i = 2131699102;
            } else {
                i = 2131699101;
            }
            KF0 kf0 = new KF0(LIZ2, adjustPercentBar, i, 2131699099);
            kf0.LIZ = this.LIZIZ;
            C86713KEx LIZ3 = c86715KEz.LIZ(type, kf0);
            FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
            beginTransaction.add(2131167876, LIZ3);
            beginTransaction.commitNowAllowingStateLoss();
            if (C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZ(C86676KDm.LJI) > 0) {
                View LIZ4 = LIZ(2131192411);
                Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                LIZ4.setVisibility(0);
                FrameLayout frameLayout = (FrameLayout) LIZ(2131167876);
                Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                frameLayout.setAlpha(0.5f);
                LinearLayout linearLayout = (LinearLayout) LIZ(2131187807);
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                linearLayout.setAlpha(0.5f);
            } else {
                View LIZ5 = LIZ(2131192411);
                Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                LIZ5.setVisibility(8);
                FrameLayout frameLayout2 = (FrameLayout) LIZ(2131167876);
                Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
                frameLayout2.setAlpha(1.0f);
                LinearLayout linearLayout2 = (LinearLayout) LIZ(2131187807);
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                linearLayout2.setAlpha(1.0f);
            }
            LIZ(2131192411).setOnClickListener(KF7.LIZIZ);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(layoutInflater);
        SettingKey<Boolean> settingKey = LiveEffectSettingKeys.LIVE_ENABLE_VCD_EFFECT;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            i = 2131699074;
        } else {
            i = 2131699072;
        }
        return C116971W2r.LIZ(layoutInflater, i, viewGroup, false);
    }
}
