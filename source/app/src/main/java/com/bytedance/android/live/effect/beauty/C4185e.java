package com.bytedance.android.live.effect.beauty;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.android.live.core.p317e.C4070a;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.base.C4181a;
import com.bytedance.android.live.effect.beauty.makeups.C4188c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.scalpel.scenemanager.core.AbstractC13971f;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.KFG;

/* renamed from: com.bytedance.android.live.effect.beauty.e */
/* loaded from: classes5.dex */
public final class C4185e extends C4070a implements AbstractC13971f {
    public static ChangeQuickRedirect LIZ;

    /* renamed from: LJ */
    public static final KFG f26217LJ = new KFG((byte) 0);
    public C4181a LIZLLL;
    public HashMap LJI;
    public LiveEffectContextFactory.Type LIZIZ = LiveEffectContextFactory.Type.DEFAULT;
    public String LIZJ = "";
    public final Lazy LJFF = LazyKt__LazyJVMKt.lazy(new PreViewMakeupsBeautyFragment$fragment$2(this));

    static {
        Covode.recordClassIndex(24383);
    }

    private final C4188c LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C4188c) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public final String getSceneFullName() {
        return "com/bytedance/android/live/effect/beauty/PreViewMakeupsBeautyFragment";
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public final String getSceneSimpleName() {
        return "PreViewMakeupsBeautyFragment";
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        HashMap hashMap;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        super.onDestroyView();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported && (hashMap = this.LJI) != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onHiddenChanged(z);
        LIZ().onHiddenChanged(z);
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        super.onViewCreated(view, bundle);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
            beginTransaction.add(2131167876, LIZ());
            beginTransaction.commitNowAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(layoutInflater);
        return C116971W2r.LIZ(layoutInflater, 2131699073, viewGroup, false);
    }
}
