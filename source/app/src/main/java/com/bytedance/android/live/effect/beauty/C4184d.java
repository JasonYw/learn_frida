package com.bytedance.android.live.effect.beauty;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.android.live.core.p317e.C4070a;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.effect.C4204i;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.base.AdjustPercentBar;
import com.bytedance.android.live.effect.base.setting.LiveEffectSettingKeys;
import com.bytedance.android.live.effect.p329a.a$a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.scalpel.scenemanager.core.AbstractC13971f;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.KE1;
import p003X.KF4;
import p003X.KF5;
import p003X.KF6;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.effect.beauty.d */
/* loaded from: classes5.dex */
public final class C4184d extends C4070a implements AbstractC13971f {
    public static ChangeQuickRedirect LIZ;
    public static final KF6 LJFF = new KF6((byte) 0);
    public a$a LIZJ;
    public final KE1 LIZLLL;
    public HashMap LJII;
    public LiveEffectContextFactory.Type LIZIZ = LiveEffectContextFactory.Type.DEFAULT;
    public final Lazy LJI = LazyKt__LazyJVMKt.lazy(new PreViewFilterFragment$fragment$2(this));

    /* renamed from: LJ */
    public a$a f26216LJ = new KF4(this);

    static {
        Covode.recordClassIndex(24379);
    }

    private final C4204i LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C4204i) (proxy.isSupported ? proxy.result : this.LJI.mo27335getValue());
    }

    private View LIZIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{2131174951}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJII == null) {
            this.LJII = new HashMap();
        }
        View view = (View) this.LJII.get(2131174951);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(2131174951);
        this.LJII.put(2131174951, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public final String getSceneFullName() {
        return "com/bytedance/android/live/effect/beauty/PreViewFilterFragment";
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public final String getSceneSimpleName() {
        return "PreViewFilterFragment";
    }

    public C4184d() {
        KE1 LJFF2 = C4173o.LJIIJ.LIZ(this.LIZIZ).LJIIIIZZ().LJFF();
        Intrinsics.checkNotNullExpressionValue(LJFF2, "");
        this.LIZLLL = LJFF2;
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        HashMap hashMap;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onDestroyView();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported && (hashMap = this.LJII) != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onHiddenChanged(z);
        LIZ().onHiddenChanged(z);
        LIZ(0);
    }

    public final void LIZ(int i) {
        boolean isFilterConfig;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 2).isSupported || LIZIZ(2131174951) == null) {
            return;
        }
        SettingKey<Boolean> settingKey = LiveEffectSettingKeys.LIVE_ANCHOR_FILTER_SLIDER_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            KE1 ke1 = this.LIZLLL;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], ke1, KE1.LIZ, false, 12);
            if (proxy.isSupported) {
                isFilterConfig = ((Boolean) proxy.result).booleanValue();
            } else {
                isFilterConfig = ke1.LIZIZ.get(ke1.LIZLLL()).isFilterConfig();
            }
            if (isFilterConfig) {
                AdjustPercentBar adjustPercentBar = (AdjustPercentBar) LIZIZ(2131174951);
                Intrinsics.checkNotNullExpressionValue(adjustPercentBar, "");
                adjustPercentBar.setPercent(this.LIZLLL.LJII());
                KE1 ke12 = this.LIZLLL;
                ke12.LIZ(i, ke12.LJII(), false);
                ((AdjustPercentBar) LIZIZ(2131174951)).LIZ(100, 0, this.LIZLLL.LJI(), true);
                AdjustPercentBar adjustPercentBar2 = (AdjustPercentBar) LIZIZ(2131174951);
                Intrinsics.checkNotNullExpressionValue(adjustPercentBar2, "");
                adjustPercentBar2.setVisibility(0);
                return;
            }
            AdjustPercentBar adjustPercentBar3 = (AdjustPercentBar) LIZIZ(2131174951);
            Intrinsics.checkNotNullExpressionValue(adjustPercentBar3, "");
            adjustPercentBar3.setVisibility(4);
            return;
        }
        AdjustPercentBar adjustPercentBar4 = (AdjustPercentBar) LIZIZ(2131174951);
        Intrinsics.checkNotNullExpressionValue(adjustPercentBar4, "");
        adjustPercentBar4.setVisibility(4);
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        super.onViewCreated(view, bundle);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            SettingKey<Boolean> settingKey = LiveEffectSettingKeys.LIVE_ANCHOR_FILTER_SLIDER_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                KE1.LIZ(false);
                ((AdjustPercentBar) LIZIZ(2131174951)).LIZ(LK5.LIZIZ(2131628521), LK5.LIZIZ(2131628520), LK5.LIZIZ(2131628519));
                ((AdjustPercentBar) LIZIZ(2131174951)).setDefaultCircleConfig(2131626090);
                ((AdjustPercentBar) LIZIZ(2131174951)).setOnLevelChangeListener(new KF5(this));
            }
            FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
            beginTransaction.add(2131174936, LIZ());
            beginTransaction.commitNowAllowingStateLoss();
            LIZ(this.LIZLLL.LIZLLL());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(layoutInflater);
        SettingKey<Boolean> settingKey = LiveEffectSettingKeys.LIVE_ENABLE_VCD_EFFECT;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            i = 2131699078;
        } else {
            i = 2131699077;
        }
        return C116971W2r.LIZ(layoutInflater, i, viewGroup, false);
    }
}
