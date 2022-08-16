package com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.plantform.model.C4816k;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.videotalk.quickinteract.AbstractC4936a;
import com.bytedance.android.live.liveinteract.videotalk.quickinteract.C4939e;
import com.bytedance.android.live.liveinteract.videotalk.quickinteract.interactView.TeamFightQuickInteractView;
import com.bytedance.android.livesdk.chatroom.model.interact.C6156ao;
import com.bytedance.android.livesdk.chatroom.model.interact.C6166j;
import com.bytedance.android.livesdk.config.C6840aw;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.audio.VoiceLiveTheme;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC80868HuA;
import p003X.AbstractC80883HuP;
import p003X.AbstractC81012HwU;
import p003X.AbstractC81059HxF;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C78616Gyw;
import p003X.C80302Hl2;
import p003X.C80674Hr2;
import p003X.C80677Hr5;
import p003X.C80678Hr6;
import p003X.C80679Hr7;
import p003X.C80684HrC;
import p003X.C80697HrP;
import p003X.C80701HrT;
import p003X.C80706HrY;
import p003X.C80713Hrf;
import p003X.C80717Hrj;
import p003X.C80732Hry;
import p003X.C80748HsE;
import p003X.C80788Hss;
import p003X.C80827HtV;
import p003X.C80910Huq;
import p003X.LK1;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.d */
/* loaded from: classes3.dex */
public final class C4372d implements AbstractC4373j {
    public static ChangeQuickRedirect LIZ;
    public List<AbstractC4373j> LIZIZ;
    public ViewGroup LIZJ;
    public final ViewGroup LIZLLL;

    /* renamed from: LJ */
    public final int f26290LJ;
    public final int LJFF;

    static {
        Covode.recordClassIndex(26319);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.AbstractC4373j
    public final void LIZ(List<LinkPlayerInfo> list, int i) {
        if (PatchProxy.proxy(new Object[]{list, Integer.valueOf(i)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        for (AbstractC4373j abstractC4373j : this.LIZIZ) {
            if (abstractC4373j != null) {
                abstractC4373j.LIZ(list, i);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.AbstractC4373j
    public final void LIZ(List<LinkPlayerInfo> list, int i, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{list, Integer.valueOf(i), bundle}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(list, bundle);
        for (AbstractC4373j abstractC4373j : this.LIZIZ) {
            if (abstractC4373j != null) {
                abstractC4373j.LIZ(list, i, bundle);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.AbstractC4373j
    public final void LIZ(VoiceLiveTheme voiceLiveTheme) {
        if (PatchProxy.proxy(new Object[]{voiceLiveTheme}, this, LIZ, false, 8).isSupported) {
            return;
        }
        for (AbstractC4373j abstractC4373j : this.LIZIZ) {
            if (abstractC4373j != null) {
                abstractC4373j.LIZ(voiceLiveTheme);
            }
        }
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 17).isSupported) {
            return;
        }
        for (AbstractC4373j abstractC4373j : this.LIZIZ) {
            if (abstractC4373j instanceof C80788Hss) {
                ((C80788Hss) abstractC4373j).LIZJ = z;
            }
        }
    }

    public final void LIZ(String str, long j, C4816k c4816k) {
        if (PatchProxy.proxy(new Object[]{str, new Long(j), c4816k}, this, LIZ, false, 25).isSupported) {
            return;
        }
        for (AbstractC4373j abstractC4373j : this.LIZIZ) {
            if (abstractC4373j instanceof AbstractC80883HuP) {
                ((AbstractC80883HuP) abstractC4373j).LIZ(str, j, c4816k);
            } else if (abstractC4373j instanceof C80684HrC) {
                ((C80684HrC) abstractC4373j).LIZ(str, j, c4816k);
            }
        }
    }

    public final void LIZ(Map<String, Long> map) {
        AbstractC81012HwU abstractC81012HwU;
        if (PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 31).isSupported) {
            return;
        }
        C106862S5w.LIZ(map);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 48);
        if (!proxy.isSupported) {
            for (AbstractC4373j abstractC4373j : this.LIZIZ) {
                if (abstractC4373j instanceof AbstractC81012HwU) {
                    abstractC81012HwU = (AbstractC81012HwU) abstractC4373j;
                }
            }
            return;
        }
        abstractC81012HwU = (AbstractC81012HwU) proxy.result;
        if (abstractC81012HwU == null) {
            return;
        }
        abstractC81012HwU.LIZ(map);
    }

    public final void LIZ(List<? extends C6156ao> list) {
        Object obj;
        User LIZ2;
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 32).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        C80684HrC LJIILL = LJIILL();
        if (LJIILL == null || PatchProxy.proxy(new Object[]{list}, LJIILL, C80684HrC.LIZLLL, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C6156ao c6156ao = (C6156ao) obj;
                LinkPlayerInfo linkPlayerInfo = LJIILL.LJI;
                if (linkPlayerInfo != null && (LIZ2 = linkPlayerInfo.LIZ()) != null && LIZ2.getId() == c6156ao.LIZIZ) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C6156ao c6156ao2 = (C6156ao) obj;
        if (c6156ao2 == null) {
            return;
        }
        LJIILL.LJFF = c6156ao2;
        C6156ao c6156ao3 = LJIILL.LJFF;
        Intrinsics.checkNotNull(c6156ao3);
        LJIILL.LIZ(c6156ao3);
        LJIILL.LJII();
    }

    public final void LIZ(C6166j.C6167a c6167a) {
        if (PatchProxy.proxy(new Object[]{c6167a}, this, LIZ, false, 49).isSupported) {
            return;
        }
        for (AbstractC4373j abstractC4373j : this.LIZIZ) {
            if (abstractC4373j instanceof C80674Hr2) {
                ((C80674Hr2) abstractC4373j).LIZ(c6167a, "adjust_window", true);
            } else if (abstractC4373j instanceof C80701HrT) {
                C80701HrT c80701HrT = (C80701HrT) abstractC4373j;
                if (!PatchProxy.proxy(new Object[0], c80701HrT, C80701HrT.LIZ, false, 13).isSupported) {
                    c80701HrT.LIZ(true);
                    c80701HrT.LIZ();
                }
            }
        }
    }

    public final void LIZ(C6166j c6166j, boolean z) {
        if (PatchProxy.proxy(new Object[]{c6166j, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 51).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6166j);
        for (AbstractC4373j abstractC4373j : this.LIZIZ) {
            if (abstractC4373j instanceof C80674Hr2) {
                ((C80674Hr2) abstractC4373j).LIZ(z);
            }
        }
    }

    public final void LIZIZ() {
        AbstractC80868HuA LIZLLL;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported && (LIZLLL = LIZLLL()) != null) {
            LIZLLL.LIZIZ();
        }
    }

    /* renamed from: LJ */
    public final void m15747LJ() {
        AbstractC80883HuP LJIIL;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 28).isSupported && (LJIIL = LJIIL()) != null) {
            LJIIL.LJIIJJI();
        }
    }

    private C80748HsE LJIILJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 43);
        if (proxy.isSupported) {
            return (C80748HsE) proxy.result;
        }
        for (AbstractC4373j abstractC4373j : this.LIZIZ) {
            if (abstractC4373j instanceof C80748HsE) {
                return (C80748HsE) abstractC4373j;
            }
        }
        return null;
    }

    private C80684HrC LJIILL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 44);
        if (proxy.isSupported) {
            return (C80684HrC) proxy.result;
        }
        for (AbstractC4373j abstractC4373j : this.LIZIZ) {
            if (abstractC4373j instanceof C80684HrC) {
                return (C80684HrC) abstractC4373j;
            }
        }
        return null;
    }

    private C80674Hr2 LJIILLIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 47);
        if (proxy.isSupported) {
            return (C80674Hr2) proxy.result;
        }
        for (AbstractC4373j abstractC4373j : this.LIZIZ) {
            if (abstractC4373j instanceof C80674Hr2) {
                return (C80674Hr2) abstractC4373j;
            }
        }
        return null;
    }

    public final void LIZ() {
        AbstractC80868HuA LIZLLL;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported && (LIZLLL = LIZLLL()) != null) {
            LIZLLL.LIZ();
        }
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            return;
        }
        for (AbstractC4373j abstractC4373j : this.LIZIZ) {
            if (abstractC4373j instanceof C80717Hrj) {
                ((C80717Hrj) abstractC4373j).LIZJ();
            } else if (abstractC4373j instanceof C80677Hr5) {
                ((C80677Hr5) abstractC4373j).LJIJJ();
            }
        }
    }

    public final AbstractC80868HuA LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 23);
        if (proxy.isSupported) {
            return (AbstractC80868HuA) proxy.result;
        }
        for (AbstractC4373j abstractC4373j : this.LIZIZ) {
            if (abstractC4373j instanceof AbstractC80868HuA) {
                return (AbstractC80868HuA) abstractC4373j;
            }
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.AbstractC4373j
    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        for (AbstractC4373j abstractC4373j : this.LIZIZ) {
            if (abstractC4373j != null) {
                abstractC4373j.LJFF();
            }
        }
    }

    public final void LJII() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 29).isSupported) {
            return;
        }
        for (AbstractC4373j abstractC4373j : this.LIZIZ) {
            if (abstractC4373j instanceof AbstractC80883HuP) {
                ((AbstractC80883HuP) abstractC4373j).mo23676LJ();
            } else if (abstractC4373j instanceof C80674Hr2) {
                ((C80674Hr2) abstractC4373j).LIZIZ();
            }
        }
    }

    public final PointF LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 30);
        if (proxy.isSupported) {
            return (PointF) proxy.result;
        }
        AbstractC80883HuP LJIIL = LJIIL();
        if (LJIIL != null) {
            return LJIIL.LJIIIZ();
        }
        return null;
    }

    public final PointF LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 34);
        if (proxy.isSupported) {
            return (PointF) proxy.result;
        }
        C80674Hr2 LJIILLIIL = LJIILLIIL();
        if (LJIILLIIL != null) {
            return LJIILLIIL.LJIIIZ();
        }
        return null;
    }

    public final AbstractC80883HuP LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 42);
        if (proxy.isSupported) {
            return (AbstractC80883HuP) proxy.result;
        }
        for (AbstractC4373j abstractC4373j : this.LIZIZ) {
            if (abstractC4373j instanceof AbstractC80883HuP) {
                return (AbstractC80883HuP) abstractC4373j;
            }
        }
        return null;
    }

    public final void LJIIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 36).isSupported) {
            return;
        }
        for (AbstractC4373j abstractC4373j : this.LIZIZ) {
            if (abstractC4373j instanceof C80697HrP) {
                ((C80697HrP) abstractC4373j).LJIJJ();
            } else if (abstractC4373j instanceof AbstractC81059HxF) {
                ((AbstractC81059HxF) abstractC4373j).mo23674LJ();
            } else if (abstractC4373j instanceof C80732Hry) {
                ((C80732Hry) abstractC4373j).LJIILIIL();
            }
        }
    }

    public final void LJIIJJI() {
        TeamFightQuickInteractView teamFightQuickInteractView;
        TeamFightQuickInteractView teamFightQuickInteractView2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 37).isSupported) {
            return;
        }
        AbstractC80883HuP LJIIL = LJIIL();
        if (LJIIL != null) {
            LJIIL.LJIIL();
        }
        C80674Hr2 LJIILLIIL = LJIILLIIL();
        if (LJIILLIIL != null) {
            LJIILLIIL.LJIIJ();
        }
        C80684HrC LJIILL = LJIILL();
        if (LJIILL != null && !PatchProxy.proxy(new Object[0], LJIILL, C80684HrC.LIZLLL, false, 16).isSupported && (teamFightQuickInteractView = LJIILL.f7340LJ) != null && teamFightQuickInteractView.getVisibility() == 0 && (teamFightQuickInteractView2 = LJIILL.f7340LJ) != null) {
            teamFightQuickInteractView2.LIZ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.AbstractC4373j
    public final View LJI() {
        View LJI;
        MethodCollector.m14708i(1761);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            View view = (View) proxy.result;
            MethodCollector.m14707o(1761);
            return view;
        }
        View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(this.LIZLLL.getContext()), 2131699526, this.LIZLLL, false);
        if (LIZ2 != null) {
            this.LIZJ = (ViewGroup) LIZ2;
            ViewGroup viewGroup = this.LIZJ;
            Intrinsics.checkNotNull(viewGroup);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            int i = -1;
            if (layoutParams != null) {
                int i2 = this.f26290LJ;
                if (i2 == 0) {
                    i2 = -1;
                }
                layoutParams.width = i2;
                int i3 = this.LJFF;
                if (i3 != 0) {
                    i = i3;
                }
                layoutParams.height = i;
            }
            for (AbstractC4373j abstractC4373j : this.LIZIZ) {
                if (abstractC4373j != null && (LJI = abstractC4373j.LJI()) != null) {
                    ViewGroup viewGroup2 = this.LIZJ;
                    Intrinsics.checkNotNull(viewGroup2);
                    viewGroup2.addView(LJI);
                }
            }
            ViewGroup viewGroup3 = this.LIZJ;
            Intrinsics.checkNotNull(viewGroup3);
            viewGroup3.setClipChildren(false);
            this.LIZLLL.setClipChildren(false);
            ViewGroup viewGroup4 = this.LIZJ;
            Intrinsics.checkNotNull(viewGroup4);
            MethodCollector.m14707o(1761);
            return viewGroup4;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.m14707o(1761);
        throw nullPointerException;
    }

    public final void LJIILIIL() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 54).isSupported) {
            return;
        }
        for (AbstractC4373j abstractC4373j : this.LIZIZ) {
            if (abstractC4373j instanceof C80674Hr2) {
                C80674Hr2 c80674Hr2 = (C80674Hr2) abstractC4373j;
                if (!PatchProxy.proxy(new Object[0], c80674Hr2, C80674Hr2.LJFF, false, 28).isSupported && C80302Hl2.LIZ()) {
                    C6166j.C6167a c6167a = c80674Hr2.LJII;
                    if (c6167a != null && c6167a.LJIIJJI) {
                        str = C6840aw.m15457LJ();
                    } else {
                        C6166j.C6167a c6167a2 = c80674Hr2.LJII;
                        if (c6167a2 == null || !c6167a2.LJIILJJIL) {
                            str = "";
                        } else {
                            str = C6840aw.LJFF();
                        }
                    }
                    if (!c80674Hr2.LJIIL() || c80674Hr2.LJIIIIZZ()) {
                        if (str != null && str.length() != 0) {
                            AbstractDraweeController mo27965build = Fresco.newDraweeControllerBuilder().mo27963setUri(str).setAutoPlayAnimations(true).setControllerListener(new C80827HtV(c80674Hr2)).mo27965build();
                            Intrinsics.checkNotNullExpressionValue(mo27965build, "");
                            HSImageView hSImageView = c80674Hr2.LJIIJ;
                            if (hSImageView == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                            }
                            hSImageView.setController(mo27965build);
                            HSImageView hSImageView2 = c80674Hr2.LJIIJ;
                            if (hSImageView2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                            }
                            hSImageView2.setVisibility(0);
                        }
                    }
                }
            }
        }
    }

    public final C4372d LIZ(AbstractC4373j abstractC4373j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC4373j}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C4372d) proxy.result;
        }
        this.LIZIZ.add(abstractC4373j);
        return this;
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.AbstractC4373j
    public final void LIZIZ(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(context);
        for (AbstractC4373j abstractC4373j : this.LIZIZ) {
            if (abstractC4373j != null) {
                abstractC4373j.LIZIZ(context);
            }
        }
    }

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 27).isSupported) {
            return;
        }
        for (AbstractC4373j abstractC4373j : this.LIZIZ) {
            if (abstractC4373j instanceof AbstractC80883HuP) {
                ((AbstractC80883HuP) abstractC4373j).LIZIZ(i);
            } else if (abstractC4373j instanceof C80674Hr2) {
                ((C80674Hr2) abstractC4373j).LIZ(i);
            }
        }
    }

    public final Integer LIZIZ(C4939e c4939e) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4939e}, this, LIZ, false, 39);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        C106862S5w.LIZ(c4939e);
        int i = c4939e.LJII;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return -1;
                }
                C80684HrC LJIILL = LJIILL();
                if (LJIILL != null) {
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c4939e}, LJIILL, C80684HrC.LIZLLL, false, 18);
                    if (proxy2.isSupported) {
                        return (Integer) proxy2.result;
                    }
                    C106862S5w.LIZ(c4939e);
                    TeamFightQuickInteractView teamFightQuickInteractView = LJIILL.f7340LJ;
                    if (teamFightQuickInteractView != null) {
                        return Integer.valueOf(teamFightQuickInteractView.getState());
                    }
                }
                return null;
            }
            C80674Hr2 LJIILLIIL = LJIILLIIL();
            if (LJIILLIIL == null) {
                return null;
            }
            return Integer.valueOf(LJIILLIIL.LIZIZ(c4939e));
        }
        AbstractC80883HuP LJIIL = LJIIL();
        if (LJIIL == null) {
            return null;
        }
        return LJIIL.LIZIZ(c4939e);
    }

    public final void LIZJ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 21).isSupported) {
            return;
        }
        for (AbstractC4373j abstractC4373j : this.LIZIZ) {
            if (abstractC4373j instanceof C80679Hr7) {
                ((C80679Hr7) abstractC4373j).LJIIJJI = z;
            } else if (abstractC4373j instanceof C80713Hrf) {
                ((C80713Hrf) abstractC4373j).LJIJ = z;
            } else if (abstractC4373j instanceof C80706HrY) {
                ((C80706HrY) abstractC4373j).f7354LJ = z;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(boolean z) {
        C80748HsE LJIILJJIL;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 41).isSupported && (LJIILJJIL = LJIILJJIL()) != null && !PatchProxy.proxy(new Object[]{Byte.valueOf((byte) z)}, LJIILJJIL, C80748HsE.LIZ, false, 7).isSupported && z != 0) {
            LJIILJJIL.LIZ();
        }
    }

    public final void LIZ(C78616Gyw c78616Gyw) {
        C80706HrY c80706HrY;
        if (PatchProxy.proxy(new Object[]{c78616Gyw}, this, LIZ, false, 40).isSupported) {
            return;
        }
        C106862S5w.LIZ(c78616Gyw);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 45);
        if (proxy.isSupported) {
            c80706HrY = (C80706HrY) proxy.result;
        } else {
            for (AbstractC4373j abstractC4373j : this.LIZIZ) {
                if (abstractC4373j instanceof C80706HrY) {
                    c80706HrY = (C80706HrY) abstractC4373j;
                }
            }
            return;
        }
        if (c80706HrY != null && !PatchProxy.proxy(new Object[]{c78616Gyw}, c80706HrY, C80706HrY.LIZLLL, false, 15).isSupported) {
            C106862S5w.LIZ(c78616Gyw);
            ALogger.m15801d("SelfDisciplineMicSeatLayer", "onReceiveLikeMessage holder= " + c80706HrY.hashCode() + " up=" + c80706HrY.LJFF.LJIIJJI);
            if (!PatchProxy.proxy(new Object[0], c80706HrY, C80706HrY.LIZLLL, false, 20).isSupported && !c80706HrY.LIZIZ()) {
                HSImageView hSImageView = c80706HrY.LJI;
                if (hSImageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                LK1.LIZJ(hSImageView);
                PipelineDraweeControllerBuilder newDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
                SettingKey<String> settingKey = LiveConfigSettingKeys.LIVE_SELF_DISCIPLINE_LIKE_EFFECT_URL;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                AbstractDraweeController mo27965build = newDraweeControllerBuilder.mo27963setUri(settingKey.getValue()).setAutoPlayAnimations(true).setControllerListener(new C80910Huq(c80706HrY)).mo27965build();
                Intrinsics.checkNotNullExpressionValue(mo27965build, "");
                HSImageView hSImageView2 = c80706HrY.LJI;
                if (hSImageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                hSImageView2.setController(mo27965build);
            }
        }
    }

    public final void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 56).isSupported) {
            return;
        }
        for (AbstractC4373j abstractC4373j : this.LIZIZ) {
            if (abstractC4373j instanceof C80674Hr2) {
                ((C80674Hr2) abstractC4373j).LJIIJJI();
            } else if (abstractC4373j instanceof C80701HrT) {
                C80701HrT c80701HrT = (C80701HrT) abstractC4373j;
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, c80701HrT, C80701HrT.LIZ, false, 15).isSupported) {
                    c80701HrT.LIZ(false);
                    c80701HrT.LIZ(i);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.AbstractC4373j
    public final void LIZ(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(context);
        for (AbstractC4373j abstractC4373j : this.LIZIZ) {
            if (abstractC4373j != null) {
                abstractC4373j.LIZ(context);
            }
        }
    }

    public final void LIZIZ(LifecycleOwner lifecycleOwner) {
        AbstractC80868HuA LIZLLL;
        if (!PatchProxy.proxy(new Object[]{lifecycleOwner}, this, LIZ, false, 11).isSupported && (LIZLLL = LIZLLL()) != null) {
            LIZLLL.LIZIZ(lifecycleOwner);
        }
    }

    public final void LIZ(LifecycleOwner lifecycleOwner) {
        AbstractC80868HuA LIZLLL;
        if (!PatchProxy.proxy(new Object[]{lifecycleOwner}, this, LIZ, false, 10).isSupported && (LIZLLL = LIZLLL()) != null) {
            LIZLLL.LIZ(lifecycleOwner);
        }
    }

    public final void LIZIZ(List<? extends C6156ao> list) {
        Object obj;
        TeamFightQuickInteractView teamFightQuickInteractView;
        AbstractC4936a LIZ2;
        C6156ao c6156ao;
        User LIZ3;
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 33).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        C80684HrC LJIILL = LJIILL();
        if (LJIILL != null && !PatchProxy.proxy(new Object[]{list}, LJIILL, C80684HrC.LIZLLL, false, 13).isSupported) {
            C106862S5w.LIZ(list);
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    C6156ao c6156ao2 = (C6156ao) obj;
                    LinkPlayerInfo linkPlayerInfo = LJIILL.LJI;
                    if (linkPlayerInfo != null && (LIZ3 = linkPlayerInfo.LIZ()) != null && LIZ3.getId() == c6156ao2.LIZIZ) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C6156ao c6156ao3 = (C6156ao) obj;
            if (c6156ao3 != null) {
                LJIILL.LJFF = c6156ao3;
                if ((LJIILL.LJFF == null || ((c6156ao = LJIILL.LJFF) != null && c6156ao.LIZJ == 0)) && (teamFightQuickInteractView = LJIILL.f7340LJ) != null) {
                    teamFightQuickInteractView.LIZIZ();
                }
                if (AbstractC4936a.LIZ.LIZ(LJIILL.LJI)) {
                    if (AbstractC4936a.LIZ.LIZ() != null && (LIZ2 = AbstractC4936a.LIZ.LIZ()) != null) {
                        LIZ2.LIZ(C4939e.LJIIIZ.LIZ(LJIILL.LJFF), true);
                        return;
                    }
                    return;
                }
                TeamFightQuickInteractView teamFightQuickInteractView2 = LJIILL.f7340LJ;
                if (teamFightQuickInteractView2 == null) {
                    return;
                }
                teamFightQuickInteractView2.LIZIZ(LJIILL.LJFF);
            }
        }
    }

    public final void LIZ(C4939e c4939e) {
        C80684HrC LJIILL;
        if (PatchProxy.proxy(new Object[]{c4939e}, this, LIZ, false, 38).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4939e);
        int i = c4939e.LJII;
        if (i != 0) {
            if (i != 1) {
                if (i == 2 && (LJIILL = LJIILL()) != null && !PatchProxy.proxy(new Object[]{c4939e}, LJIILL, C80684HrC.LIZLLL, false, 17).isSupported) {
                    C106862S5w.LIZ(c4939e);
                    TeamFightQuickInteractView teamFightQuickInteractView = LJIILL.f7340LJ;
                    if (teamFightQuickInteractView != null) {
                        teamFightQuickInteractView.LIZ(c4939e);
                        return;
                    }
                    return;
                }
                return;
            }
            C80674Hr2 LJIILLIIL = LJIILLIIL();
            if (LJIILLIIL != null) {
                LJIILLIIL.LIZ(c4939e);
                return;
            }
            return;
        }
        AbstractC80883HuP LJIIL = LJIIL();
        if (LJIIL != null) {
            LJIIL.LIZ(c4939e);
        }
    }

    public final void LIZIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 18).isSupported) {
            return;
        }
        for (AbstractC4373j abstractC4373j : this.LIZIZ) {
            if (abstractC4373j instanceof C80678Hr6) {
                ((C80678Hr6) abstractC4373j).LIZJ = z;
            }
        }
    }

    public C4372d(ViewGroup viewGroup, int i, int i2) {
        C106862S5w.LIZ(viewGroup);
        this.LIZLLL = viewGroup;
        this.f26290LJ = i;
        this.LJFF = i2;
        this.LIZIZ = new ArrayList();
    }

    public /* synthetic */ C4372d(ViewGroup viewGroup, int i, int i2, int i3) {
        this(viewGroup, i, 0);
    }
}
