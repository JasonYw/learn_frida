package com.bytedance.android.live.effect.sticker.p330a;

import android.text.TextUtils;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.api.l$c;
import com.bytedance.android.live.effect.api.l$d;
import com.bytedance.android.live.effect.sticker.p330a.C4209g;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.effectmanager.EffectManager;
import com.p1594ss.android.ugc.effectmanager.effect.listener.AbstractC29862f;
import com.p1594ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.p1594ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p1594ss.android.ugc.effectmanager.effect.model.Effect;
import com.p1594ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p1594ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import p003X.JQG;
import p003X.KEH;
import p003X.KEI;
import p003X.KEJ;
import p003X.KEL;
import p003X.KEM;
import p003X.KEO;
import p003X.KEQ;
import p003X.KET;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.effect.sticker.a.g */
/* loaded from: classes5.dex */
public final class C4209g extends KEQ {
    public static ChangeQuickRedirect LIZLLL;

    /* renamed from: LJ */
    public final LiveEffectContextFactory.Type f26232LJ;
    public Boolean LJIIIZ = Boolean.FALSE;
    public final List<l$d> LJFF = new ArrayList();
    public final Map<String, EffectChannelResponse> LJI = new HashMap();
    public final Map<String, EffectCategoryResponse> LJII = new HashMap();
    public final Map<String, l$c> LJIIIIZZ = new HashMap();

    static {
        Covode.recordClassIndex(24616);
    }

    @Override // p003X.KEN
    public final boolean LIZ(String str, Sticker sticker) {
        Effect effect;
        EffectCategoryResponse effectCategoryResponse;
        List<Effect> totalEffects;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, sticker}, this, LIZLLL, false, 8);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && sticker != null && (effect = sticker.getEffect()) != null && (effectCategoryResponse = this.LJII.get(str)) != null && (totalEffects = effectCategoryResponse.getTotalEffects()) != null) {
            return totalEffects.contains(effect);
        }
        return false;
    }

    public final void LIZ(List<String> list, IFetchEffectListListener iFetchEffectListListener) {
        if (PatchProxy.proxy(new Object[]{list, iFetchEffectListListener}, this, LIZLLL, false, 18).isSupported) {
            return;
        }
        this.LIZIZ.fetchEffectList(list, false, null, iFetchEffectListListener);
    }

    public final void LIZ(AtomicBoolean atomicBoolean, String str, AbstractC29862f abstractC29862f, boolean z) {
        if (PatchProxy.proxy(new Object[]{atomicBoolean, str, abstractC29862f, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZLLL, false, 20).isSupported) {
            return;
        }
        atomicBoolean.set(z);
        if (z) {
            this.LIZIZ.fetchEffectList(str, false, abstractC29862f);
            return;
        }
        atomicBoolean.set(false);
        this.LIZIZ.fetchEffectListFromCache(str, new KEM(this, abstractC29862f, atomicBoolean, str));
    }

    private EffectCategoryResponse LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZLLL, false, 11);
        if (proxy.isSupported) {
            return (EffectCategoryResponse) proxy.result;
        }
        EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse();
        effectCategoryResponse.setId("1");
        effectCategoryResponse.setName(LK5.LIZ(2131583055));
        effectCategoryResponse.setKey("");
        return effectCategoryResponse;
    }

    @Override // p003X.KEQ
    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZLLL, false, 21).isSupported) {
            return;
        }
        super.LIZ();
        this.LJIIIIZZ.clear();
        this.LJFF.clear();
        this.LJI.clear();
        this.LJII.clear();
    }

    @Override // p003X.KEQ
    public final void LIZJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZLLL, false, 4).isSupported || TextUtils.isEmpty(str)) {
            return;
        }
        this.LJIIIIZZ.remove(str);
    }

    public final void LJFF(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZLLL, false, 14).isSupported) {
            return;
        }
        LIZ(str, (l$d) null);
    }

    public C4209g(LiveEffectContextFactory.Type type) {
        super(type);
        this.f26232LJ = type;
    }

    @Override // p003X.KEN
    public final EffectCategoryResponse LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZLLL, false, 12);
        if (proxy.isSupported) {
            return (EffectCategoryResponse) proxy.result;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.LJII.get(str);
    }

    public final void LIZLLL(String str) {
        EffectManager effectManager;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZLLL, false, 9).isSupported || (effectManager = this.LIZIZ) == null) {
            return;
        }
        m15783LJ(str);
        effectManager.fetchFavoriteList(str, new KEJ(this, str));
    }

    /* renamed from: LJ */
    public final void m15783LJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZLLL, false, 10).isSupported || this.LJII.containsKey(str)) {
            return;
        }
        this.LJII.put(str, LIZIZ());
    }

    @Override // p003X.KEN
    public final void LIZ(String str, l$d l_d) {
        if (PatchProxy.proxy(new Object[]{str, l_d}, this, LIZLLL, false, 15).isSupported) {
            return;
        }
        LIZ(str, l_d, true);
    }

    @Override // p003X.KEQ
    public final void LIZ(String str, l$c l_c) {
        if (PatchProxy.proxy(new Object[]{str, l_c}, this, LIZLLL, false, 3).isSupported || TextUtils.isEmpty(str)) {
            return;
        }
        this.LJIIIIZZ.put(str, l_c);
    }

    public final void LIZ(String str, IFetchEffectListener iFetchEffectListener) {
        if (PatchProxy.proxy(new Object[]{str, iFetchEffectListener}, this, LIZLLL, false, 17).isSupported) {
            return;
        }
        JQG jqg = new JQG(this, iFetchEffectListener);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        LIZ(arrayList, jqg);
    }

    public final boolean LIZIZ(String str, Sticker sticker, boolean z) {
        Effect effect;
        EffectCategoryResponse effectCategoryResponse;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, sticker, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZLLL, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (TextUtils.isEmpty(str) || sticker == null || (effect = sticker.getEffect()) == null || (effectCategoryResponse = this.LJII.get(str)) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList(effectCategoryResponse.getTotalEffects());
        if (z) {
            arrayList.add(0, effect);
        } else {
            arrayList.remove(effect);
        }
        effectCategoryResponse.setTotalEffects(arrayList);
        this.LJII.put(str, effectCategoryResponse);
        return true;
    }

    public final void LIZ(String str, l$d l_d, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, l_d, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZLLL, false, 16).isSupported) {
            return;
        }
        if (this.LJI.containsKey(str)) {
            for (l$d l_d2 : this.LJFF) {
                if (l_d2 != null) {
                    l_d2.LIZ(this.LJI.get(str));
                    if (l_d2 instanceof KEO) {
                        ((KEO) l_d2).LIZ(this.LJI.get(str), false);
                    }
                }
            }
            if (z) {
                C4173o.LIZ(this.f26232LJ).LJII().LIZ(this.LJI.get(str).getPanel(), this.LJI.get(str).getAllCategoryEffects(), new Function1(this) { // from class: X.KB9
                    public static ChangeQuickRedirect LIZ;
                    public final C4209g LIZIZ;

                    static {
                        Covode.recordClassIndex(24623);
                    }

                    {
                        this.LIZIZ = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1);
                        if (proxy.isSupported) {
                            return proxy.result;
                        }
                        C4209g c4209g = this.LIZIZ;
                        Effect effect = (Effect) obj;
                        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{effect}, c4209g, C4209g.LIZLLL, false, 22);
                        return proxy2.isSupported ? proxy2.result : Boolean.valueOf(c4209g.LIZ(effect));
                    }
                });
            }
            if (l_d != null) {
                l_d.LIZ(this.LJI.get(str));
                if (l_d instanceof KEO) {
                    ((KEO) l_d).LIZ(this.LJI.get(str), false);
                }
            }
        } else if (this.LIZIZ != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            KET LIZIZ = LIZIZ(str);
            KEI kei = new KEI(this, atomicBoolean, str, LIZIZ, z, l_d);
            LIZIZ.LIZJ();
            if (NetworkUtils.isNetworkAvailable(LK5.LJIIJ())) {
                this.LIZIZ.checkedEffectListUpdate(str, new KEL(this, atomicBoolean, str, kei));
            } else {
                LIZ(atomicBoolean, str, kei, false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003X.KEN
    public final void LIZ(String str, Sticker sticker, boolean z) {
        if (!PatchProxy.proxy(new Object[]{str, sticker, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZLLL, false, 5).isSupported && !this.LJIIIZ.booleanValue() && LIZIZ(str, sticker, z)) {
            String effectId = sticker.getEffect().getEffectId();
            if (!PatchProxy.proxy(new Object[]{str, sticker, effectId, Byte.valueOf((byte) z)}, this, LIZLLL, false, 7).isSupported) {
                this.LJIIIZ = Boolean.TRUE;
                this.LIZIZ.modifyFavoriteList(str, effectId, Boolean.valueOf(z), new KEH(this, str, z, sticker));
            }
        }
    }
}
