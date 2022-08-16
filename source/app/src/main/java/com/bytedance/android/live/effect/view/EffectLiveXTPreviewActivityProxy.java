package com.bytedance.android.live.effect.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.effect.api.AbstractC4169j;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.api.n$a;
import com.bytedance.android.live.effect.base.C4181a;
import com.bytedance.android.live.effect.base.setting.LiveEffectSettingKeys;
import com.bytedance.android.live.effect.m$b;
import com.bytedance.android.live.effect.n$c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.AbstractC86611KAz;
import p003X.AbstractC86668KDe;
import p003X.C86610KAy;
import p003X.C86676KDm;
import p003X.C86699KEj;
import p003X.KAT;

/* loaded from: classes5.dex */
public final class EffectLiveXTPreviewActivityProxy extends LiveEffectActivityProxy implements m$b, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public AbstractC86611KAz LIZIZ;
    public boolean LIZJ;
    public final Lazy LIZLLL;

    static {
        Covode.recordClassIndex(24840);
    }

    private final m$b LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (m$b) (proxy.isSupported ? proxy.result : this.LIZLLL.mo27335getValue());
    }

    @Override // com.bytedance.android.live.effect.view.LiveEffectActivityProxy, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 12).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.effect.view.LiveEffectActivityProxy
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onDestroy();
        if (!this.LIZJ) {
            C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJIIIIZZ();
            C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZLLL();
        } else {
            this.LIZJ = false;
        }
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJI().LIZIZ(LIZ());
    }

    @Override // com.bytedance.android.live.effect.view.LiveEffectActivityProxy
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onCreate();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            ALogger.m15801d("EffectLiveXTPreviewActivityProxy", "COMPOSER INIT : initializing config");
            C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ().LJI().LIZ(1, 0);
            AbstractC4169j LJII = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII();
            n$a n_a = new n$a();
            n_a.LIZ(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{C86676KDm.LIZJ, C86676KDm.LJI, "beauty", C86676KDm.LJIIIZ}));
            n_a.LIZIZ(CollectionsKt__CollectionsJVMKt.listOf("effect_gift"));
            AbstractC86611KAz abstractC86611KAz = this.LIZIZ;
            if (abstractC86611KAz == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            n_a.LIZ(new C86610KAy(abstractC86611KAz, LiveEffectContextFactory.Type.DEFAULT));
            KAT LIZ2 = n_a.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            LJII.LIZ(LIZ2);
        }
        SettingKey<Boolean> settingKey = LiveEffectSettingKeys.LIVE_ENABLE_SMALL_ITEM_BEAUTY;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            C86699KEj.LIZ(C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LIZIZ(), (n$c) null, (String) null, new C4181a(0L, 0, 3), 3, (Object) null);
        }
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJI().LIZ(LIZ());
    }

    @Override // com.bytedance.android.live.effect.m$b
    public final void LIZIZ(boolean z) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 6).isSupported && z && AbstractC86668KDe.LIZIZ.LIZ(LiveEffectContextFactory.Type.DEFAULT).intValue() > 0) {
            AbstractC86611KAz abstractC86611KAz = this.LIZIZ;
            if (abstractC86611KAz == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            Integer LIZ2 = AbstractC86668KDe.LIZIZ.LIZ(LiveEffectContextFactory.Type.DEFAULT);
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            abstractC86611KAz.LIZ(LIZ2.intValue());
        }
    }
}
