package com.bytedance.android.live.effect;

import android.os.Bundle;
import com.bytedance.android.live.core.p317e.C4070a;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.effect.p329a.a$a;
import com.bytedance.android.live.effect.template.C4225b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.scalpel.scenemanager.core.AbstractC13971f;
import java.util.ArrayList;
import java.util.List;
import p003X.AbstractC86668KDe;
import p003X.KFX;

/* renamed from: com.bytedance.android.live.effect.i */
/* loaded from: classes5.dex */
public final class C4204i extends C4070a implements AbstractC13971f {
    public static ChangeQuickRedirect LIZ;
    public LiveEffectContextFactory.Type LIZIZ;
    public a$a LIZJ;
    public List<FilterModel> LIZLLL;

    /* renamed from: LJ */
    public C4225b f26225LJ;
    public KFX LJFF;

    static {
        Covode.recordClassIndex(24540);
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public final String getSceneFullName() {
        return "com/bytedance/android/live/effect/LiveFilterFragment";
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public final String getSceneSimpleName() {
        return "LiveFilterFragment";
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a209";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        KFX kfx;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onHiddenChanged(z);
        if (!z && (kfx = this.LJFF) != null) {
            kfx.LIZ(AbstractC86668KDe.LIZIZ.LIZ(this.LIZIZ).intValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bd, code lost:
        if (((java.lang.Boolean) r4.result).booleanValue() == false) goto L24;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.C4204i.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public static C4204i LIZ(a$a a_a, List<FilterModel> list, C4225b c4225b, LiveEffectContextFactory.Type type) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{a_a, list, c4225b, type}, null, LIZ, true, 1);
        if (proxy.isSupported) {
            return (C4204i) proxy.result;
        }
        C4204i c4204i = new C4204i();
        c4204i.LIZJ = a_a;
        c4204i.LIZIZ = type;
        Bundle bundle = new Bundle();
        if (list == null) {
            list = new ArrayList<>();
        }
        c4204i.LIZLLL = list;
        c4204i.f26225LJ = c4225b;
        c4204i.setArguments(bundle);
        return c4204i;
    }
}
