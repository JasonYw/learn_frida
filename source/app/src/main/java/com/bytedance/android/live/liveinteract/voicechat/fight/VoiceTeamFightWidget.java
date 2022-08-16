package com.bytedance.android.live.liveinteract.voicechat.fight;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.liveinteract.api.data.C4284f;
import com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c;
import com.bytedance.android.live.liveinteract.voicechat.fight.b$a;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkInitResult;
import com.bytedance.android.livesdk.chatroom.p517u.AbstractC6303g;
import com.bytedance.android.livesdk.chatroom.p517u.C6306l;
import com.bytedance.android.livesdkapi.depend.model.live.LinkerDetail;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.KVData;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC103391QnZ;
import p003X.AbstractC413392Xt;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C78612Gys;
import p003X.C78643GzN;
import p003X.C79242HLo;
import p003X.C87308Kak;

/* loaded from: classes3.dex */
public final class VoiceTeamFightWidget extends LinkMicTeamFightWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public int LJIILLIIL = 21;

    static {
        Covode.recordClassIndex(31310);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.fight.LinkMicTeamFightWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 11).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.fight.LinkMicTeamFightWidget
    public final boolean LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C4284f.LJIIIIZZ.LIZLLL().LIZLLL;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.fight.LinkMicTeamFightWidget
    public final boolean LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f6987aO;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Boolean LIZ2 = c87308Kak.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        return LIZ2.booleanValue();
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.fight.LinkMicTeamFightWidget
    public final boolean LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (C79242HLo.LJIIJ() != 5) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.fight.LinkMicTeamFightWidget
    public final boolean LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (C79242HLo.LJIIJ() == 5 || LJIILL().LIZIZ()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.fight.LinkMicTeamFightWidget
    public final boolean LJIIJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC5003c LIZ2 = AbstractC5003c.LIZ.LIZ();
        if (LIZ2 == null) {
            return false;
        }
        return LIZ2.LJIIJ();
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.fight.LinkMicTeamFightWidget
    public final void LJI() {
        AbstractC413392Xt<AbstractC6303g> LJJLL;
        AbstractC6303g LIZIZ;
        Observable<C6306l> LIZIZ2;
        Disposable subscribe;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJJLL = LJJJI.LJJLL()) != null && (LIZIZ = LJJLL.LIZIZ()) != null && (LIZIZ2 = LIZIZ.LIZIZ()) != null && (subscribe = LIZIZ2.subscribe(new C78643GzN(new VoiceTeamFightWidget$initSceneSwitchListener$1(this)))) != null) {
            LIZ(subscribe);
        }
        this.dataCenter.observe("data_room_audio_chat_ui_layout", this);
        Object obj = this.dataCenter.get("data_room_audio_chat_ui_layout", (String) 21);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        this.LJIILLIIL = ((Number) obj).intValue();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        String str;
        Integer num;
        int intValue;
        int i;
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZ, false, 5).isSupported) {
            if (kVData2 != null) {
                str = kVData2.getKey();
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str, "data_room_audio_chat_ui_layout") && (num = (Integer) kVData2.getData()) != null && (intValue = num.intValue()) != (i = this.LJIILLIIL)) {
                this.LJIILLIIL = intValue;
                if (LJIILL().LIZIZ()) {
                    LIZJ("voiceChatPlayMode " + i + " -> " + intValue);
                    this.LJIILJJIL.LIZ(new b$a.C5061e(LJIILL().LIZ, C78612Gys.LIZ(4, null, 2, null)));
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.fight.LinkMicTeamFightWidget
    public final void LIZ(AbstractC103391QnZ<? extends b$c, ? extends b$a, ? extends b$b> abstractC103391QnZ) {
        List arrayList;
        List arrayList2;
        List arrayList3;
        List arrayList4;
        if (PatchProxy.proxy(new Object[]{abstractC103391QnZ}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC103391QnZ);
        super.LIZ(abstractC103391QnZ);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            if (LJIILL().LIZIZ()) {
                if (LJIIL()) {
                    LinkInitResult linkInitResult = LJIILIIL().linkInitResult;
                    if (linkInitResult == null || (arrayList4 = linkInitResult.LJIIL) == null) {
                        arrayList4 = new ArrayList();
                    }
                    if (!arrayList4.contains(7)) {
                        arrayList4.add(7);
                    }
                } else {
                    LinkerDetail linkerDetail = LJIILIIL().linkerDetail;
                    if (linkerDetail == null || (arrayList3 = linkerDetail.LIZIZ) == null) {
                        arrayList3 = new ArrayList();
                    }
                    if (!arrayList3.contains(7L)) {
                        arrayList3.add(7L);
                    }
                }
            } else if (LJIIL()) {
                LinkInitResult linkInitResult2 = LJIILIIL().linkInitResult;
                if (linkInitResult2 == null || (arrayList2 = linkInitResult2.LJIIL) == null) {
                    arrayList2 = new ArrayList();
                }
                if (arrayList2.contains(7)) {
                    arrayList2.remove((Object) 7);
                }
            } else {
                LinkerDetail linkerDetail2 = LJIILIIL().linkerDetail;
                if (linkerDetail2 == null || (arrayList = linkerDetail2.LIZIZ) == null) {
                    arrayList = new ArrayList();
                }
                if (arrayList.contains(7L)) {
                    arrayList.remove((Object) 7L);
                }
            }
            StringBuilder sb = new StringBuilder("updateVoiceRoomPlayMode ");
            Object obj = null;
            if (LJIIL()) {
                LinkInitResult linkInitResult3 = LJIILIIL().linkInitResult;
                if (linkInitResult3 != null) {
                    obj = linkInitResult3.LJIIL;
                }
            } else {
                LinkerDetail linkerDetail3 = LJIILIIL().linkerDetail;
                if (linkerDetail3 != null) {
                    obj = linkerDetail3.LIZIZ;
                }
            }
            sb.append(obj);
            ALogger.m15800e("TeamFightWidget", sb.toString());
        }
    }
}
