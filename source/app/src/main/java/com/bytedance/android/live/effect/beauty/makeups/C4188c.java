package com.bytedance.android.live.effect.beauty.makeups;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.p317e.C4070a;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.base.AdjustPercentBar;
import com.bytedance.android.live.effect.base.C4181a;
import com.bytedance.android.live.effect.base.setting.LiveEffectSettingKeys;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.common.utility.Lists;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.scalpel.scenemanager.core.AbstractC13971f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C3CX;
import p003X.C441623dU;
import p003X.KFA;
import p003X.KFB;
import p003X.KFC;
import p003X.KFE;
import p003X.KFN;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.effect.beauty.makeups.c */
/* loaded from: classes5.dex */
public final class C4188c extends C4070a implements AbstractC13971f {
    public static ChangeQuickRedirect LIZ;
    public static final KFN LJFF = new KFN((byte) 0);
    public Sticker LIZIZ;
    public C4181a LIZJ;
    public HashMap LJIIIZ;
    public final Lazy LJI = LazyKt__LazyJVMKt.lazy(new LiveMakeupsBeautyFragment$makeupsAdapter$2(this));
    public final Lazy LJII = LazyKt__LazyJVMKt.lazy(new LiveMakeupsBeautyFragment$inflater$2(this));
    public final Map<String, C4189b> LJIIIIZZ = new HashMap();
    public LiveEffectContextFactory.Type LIZLLL = LiveEffectContextFactory.Type.DEFAULT;

    /* renamed from: LJ */
    public final a$b f26219LJ = new KFC(this);

    static {
        Covode.recordClassIndex(24400);
    }

    private final LayoutInflater LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (LayoutInflater) (proxy.isSupported ? proxy.result : this.LJII.mo27335getValue());
    }

    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 12);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIIIZ == null) {
            this.LJIIIZ = new HashMap();
        }
        View view = (View) this.LJIIIZ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.LJIIIZ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C4186b LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C4186b) (proxy.isSupported ? proxy.result : this.LJI.mo27335getValue());
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public final String getSceneFullName() {
        return "com/bytedance/android/live/effect/beauty/makeups/LiveMakeupsBeautyFragment";
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public final String getSceneSimpleName() {
        return "LiveMakeupsBeautyFragment";
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        HashMap hashMap;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        super.onDestroyView();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported && (hashMap = this.LJIIIZ) != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        C4186b LIZ2 = LIZ();
        if (!PatchProxy.proxy(new Object[0], LIZ2, C4186b.LIZ, false, 8).isSupported) {
            C4173o.LJIIJ.LIZ(LIZ2.LJFF).LJIIIIZZ().mo15785LJ().LIZIZ(LIZ2.f26218LJ);
        }
        super.onPause();
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onResume();
        C4186b LIZ2 = LIZ();
        if (!PatchProxy.proxy(new Object[0], LIZ2, C4186b.LIZ, false, 7).isSupported) {
            C4173o.LJIIJ.LIZ(LIZ2.LJFF).LJIIIIZZ().mo15785LJ().LIZ(LIZ2.f26218LJ);
        }
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        this.LIZIZ = C4173o.LJIIJ.LIZ(this.LIZLLL).LJIIIIZZ().mo15785LJ().LIZ();
        C4173o.LJIIJ.LIZ(this.LIZLLL).LJIIIIZZ().mo15785LJ().LIZIZ(this.LIZIZ);
        LIZ().LIZ(this.LIZIZ);
        LIZJ();
    }

    public final void LIZJ() {
        List<Sticker.C9471b> list;
        List<Sticker.C9471b> composerConfigList;
        String str;
        String effectId;
        String str2;
        MethodCollector.m14708i(1650);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            MethodCollector.m14707o(1650);
            return;
        }
        LinearLayout linearLayout = (LinearLayout) LIZ(2131189162);
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        if (getContext() == null) {
            MethodCollector.m14707o(1650);
            return;
        }
        Sticker sticker = this.LIZIZ;
        if (sticker != null) {
            list = sticker.getComposerConfigList();
        } else {
            list = null;
        }
        if (Lists.isEmpty(list)) {
            MethodCollector.m14707o(1650);
            return;
        }
        Sticker sticker2 = this.LIZIZ;
        if (sticker2 != null && (composerConfigList = sticker2.getComposerConfigList()) != null) {
            for (Sticker.C9471b c9471b : composerConfigList) {
                String str3 = "";
                if (!this.LJIIIIZZ.containsKey(c9471b.LIZJ)) {
                    View LIZ2 = C116971W2r.LIZ(LIZLLL(), 2131699096, (ViewGroup) LIZ(2131189162), false);
                    Intrinsics.checkNotNullExpressionValue(LIZ2, str3);
                    Sticker sticker3 = this.LIZIZ;
                    Intrinsics.checkNotNull(sticker3);
                    C4189b c4189b = new C4189b(this, LIZ2, sticker3, c9471b);
                    Map<String, C4189b> map = this.LJIIIIZZ;
                    Sticker sticker4 = this.LIZIZ;
                    if (sticker4 != null) {
                        str2 = sticker4.getEffectId();
                    } else {
                        str2 = null;
                    }
                    map.put(Intrinsics.stringPlus(str2, c9471b.LIZJ), c4189b);
                }
                Map<String, C4189b> map2 = this.LJIIIIZZ;
                Sticker sticker5 = this.LIZIZ;
                if (sticker5 != null) {
                    str = sticker5.getEffectId();
                } else {
                    str = null;
                }
                C4189b c4189b2 = map2.get(Intrinsics.stringPlus(str, c9471b.LIZJ));
                if (c4189b2 != null) {
                    ((LinearLayout) LIZ(2131189162)).addView(c4189b2.LIZIZ);
                    KFB mo15785LJ = C4173o.LJIIJ.LIZ(this.LIZLLL).LJIIIIZZ().mo15785LJ();
                    Sticker sticker6 = this.LIZIZ;
                    if (sticker6 != null && (effectId = sticker6.getEffectId()) != null) {
                        str3 = effectId;
                    }
                    c4189b2.LIZ(mo15785LJ.LIZ(str3, c9471b));
                }
            }
            MethodCollector.m14707o(1650);
            return;
        }
        MethodCollector.m14707o(1650);
    }

    /* renamed from: com.bytedance.android.live.effect.beauty.makeups.c$b */
    /* loaded from: classes5.dex */
    public final class C4189b {
        public static ChangeQuickRedirect LIZ;
        public final View LIZIZ;
        public final Sticker LIZJ;
        public final Sticker.C9471b LIZLLL;

        /* renamed from: LJ */
        public final /* synthetic */ C4188c f26220LJ;
        public final AdjustPercentBar LJFF;
        public final TextView LJI;

        static {
            Covode.recordClassIndex(24402);
        }

        public final void LIZ(int i) {
            if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                return;
            }
            AdjustPercentBar adjustPercentBar = this.LJFF;
            Intrinsics.checkNotNullExpressionValue(adjustPercentBar, "");
            adjustPercentBar.setPercent(i);
        }

        public C4189b(C4188c c4188c, View view, Sticker sticker, Sticker.C9471b c9471b) {
            C106862S5w.LIZ(view, sticker, c9471b);
            this.f26220LJ = c4188c;
            this.LIZIZ = view;
            this.LIZJ = sticker;
            this.LIZLLL = c9471b;
            this.LJFF = (AdjustPercentBar) this.LIZIZ.findViewById(2131182616);
            this.LJI = (TextView) this.LIZIZ.findViewById(2131182618);
            if (this.LIZLLL.LJFF) {
                this.LJFF.LIZ(50, -50, 0, false);
            } else {
                this.LJFF.LIZ(100, 0, 0, true);
            }
            AdjustPercentBar adjustPercentBar = this.LJFF;
            Intrinsics.checkNotNullExpressionValue(adjustPercentBar, "");
            ((AdjustPercentBar) adjustPercentBar.findViewById(2131182616)).LIZ(LK5.LIZIZ(2131628521), LK5.LIZIZ(2131628520), LK5.LIZIZ(2131628519));
            this.LJFF.setOnLevelChangeListener(new KFA(this));
            TextView textView = this.LJI;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setText(this.LIZLLL.LIZ);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onHiddenChanged(z);
        if (!z) {
            LIZIZ();
        }
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MethodCollector.m14708i(1649);
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 4).isSupported) {
            MethodCollector.m14707o(1649);
            return;
        }
        C106862S5w.LIZ(view);
        super.onViewCreated(view, bundle);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            View inflate = LayoutInflater.from(getContext()).inflate(2131699041, (ViewGroup) null);
            inflate.setOnClickListener(new KFE(this));
            C3CX c3cx = new C3CX(getContext());
            c3cx.LIZJ(inflate);
            ((LoadingStatusView) LIZ(2131182614)).setBuilder(c3cx.LIZ(getResources().getDimensionPixelSize(2131429066)));
            ((LoadingStatusView) LIZ(2131182614)).LIZIZ();
            RecyclerView recyclerView = (RecyclerView) LIZ(2131182615);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            RecyclerView recyclerView2 = (RecyclerView) LIZ(2131182615);
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
            recyclerView2.setAdapter(LIZ());
            SettingKey<Boolean> settingKey = LiveEffectSettingKeys.LIVE_ENABLE_VCD_EFFECT;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            if (!settingKey.getValue().booleanValue()) {
                ((RecyclerView) LIZ(2131182615)).addItemDecoration(new C441623dU());
            }
            LIZJ();
        }
        C4173o.LJIIJ.LIZ(this.LIZLLL).LJIIIIZZ().mo15785LJ().LIZ(this.f26219LJ, this.LIZJ);
        LIZIZ();
        MethodCollector.m14707o(1649);
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
            i = 2131699066;
        } else {
            i = 2131699065;
        }
        return C116971W2r.LIZ(layoutInflater, i, viewGroup, false);
    }
}
