package com.bytedance.android.live.liveinteract.voicechat.p395wm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.C4369e;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.C4377t;
import com.bytedance.android.live.liveinteract.plantform.core.C4806x;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.voicechat.VoiceChatSceneBaseWidget;
import com.bytedance.android.livesdk.chatroom.p517u.C6306l;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.audio.VoiceLiveTheme;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413392Xt;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C78393GvL;
import p003X.C79189HJn;
import p003X.C80576HpS;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.wm.VoiceChatSceneWidget */
/* loaded from: classes3.dex */
public final class VoiceChatSceneWidget extends VoiceChatSceneBaseWidget implements AbstractC5141b, AbstractC4569445g {
    public static ChangeQuickRedirect LIZJ;
    public C80576HpS LIZLLL;

    /* renamed from: LJ */
    public List<LinkPlayerInfo> f26506LJ = new ArrayList();
    public final AbstractC5143z LJFF;
    public final C4377t LJI;
    public final C4369e LJII;

    static {
        Covode.recordClassIndex(31879);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131700441;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.VoiceChatSceneBaseWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZJ, false, 29).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LIZ() {
        C80576HpS c80576HpS;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 12).isSupported && (c80576HpS = this.LIZLLL) != null) {
            c80576HpS.LIZLLL();
        }
    }

    public final void LIZJ() {
        C80576HpS c80576HpS;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 21).isSupported && (c80576HpS = this.LIZLLL) != null) {
            c80576HpS.LJII();
        }
    }

    /* renamed from: LJ */
    public final void m15636LJ() {
        C80576HpS c80576HpS;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 26).isSupported && (c80576HpS = this.LIZLLL) != null) {
            c80576HpS.LJIIIIZZ();
        }
    }

    public final int LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 18);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C80576HpS c80576HpS = this.LIZLLL;
        if (c80576HpS == null) {
            return 0;
        }
        return c80576HpS.LJI();
    }

    public final boolean LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 22);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C80576HpS c80576HpS = this.LIZLLL;
        if (c80576HpS == null) {
            return false;
        }
        return c80576HpS.LJIIIZ();
    }

    public final void LIZIZ(int i) {
        C80576HpS c80576HpS;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZJ, false, 20).isSupported && (c80576HpS = this.LIZLLL) != null) {
            c80576HpS.LJFF(i);
        }
    }

    public final void LIZ(int i) {
        C80576HpS c80576HpS;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZJ, false, 1).isSupported && (c80576HpS = this.LIZLLL) != null) {
            c80576HpS.m23714LJ(i);
        }
    }

    public final C78393GvL LIZJ(boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZJ, false, 23);
        if (proxy.isSupported) {
            return (C78393GvL) proxy.result;
        }
        C80576HpS c80576HpS = this.LIZLLL;
        if (c80576HpS != null) {
            return c80576HpS.m23713LJ(z);
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.view.AbstractC5137a
    public final void LIZ(User user) {
        if (PatchProxy.proxy(new Object[]{user}, this, LIZJ, false, 25).isSupported) {
            return;
        }
        C106862S5w.LIZ(user);
        C80576HpS c80576HpS = this.LIZLLL;
        if (c80576HpS != null) {
            c80576HpS.LIZ(user);
        }
    }

    public final void LIZIZ(boolean z) {
        C80576HpS c80576HpS;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZJ, false, 17).isSupported && (c80576HpS = this.LIZLLL) != null) {
            c80576HpS.LIZLLL(z);
        }
    }

    public final void LIZ(VoiceLiveTheme voiceLiveTheme) {
        if (PatchProxy.proxy(new Object[]{voiceLiveTheme}, this, LIZJ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(voiceLiveTheme);
        C80576HpS c80576HpS = this.LIZLLL;
        if (c80576HpS != null) {
            c80576HpS.LIZ(voiceLiveTheme);
        }
    }

    public final void LIZ(Map<String, Integer> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, LIZJ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(map);
        C80576HpS c80576HpS = this.LIZLLL;
        if (c80576HpS != null) {
            c80576HpS.LIZ(map);
        }
    }

    public final void LIZ(boolean z) {
        C80576HpS c80576HpS;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZJ, false, 16).isSupported && (c80576HpS = this.LIZLLL) != null) {
            c80576HpS.LIZJ(z);
        }
    }

    public final void LIZ(C6306l c6306l, WidgetManager widgetManager) {
        AbstractC413392Xt<C4806x> LIZIZ;
        C4806x LIZIZ2;
        LinkPlayerInfo linkPlayerInfo;
        AbstractC413392Xt<C4806x> LIZIZ3;
        C4806x LIZIZ4;
        long j;
        boolean z = false;
        boolean z2 = true;
        if (PatchProxy.proxy(new Object[]{c6306l, widgetManager}, this, LIZJ, false, 28).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6306l, widgetManager);
        this.LIZIZ = c6306l.f26940LJ;
        if (this.LIZIZ != 5) {
            widgetManager.unload(this);
        } else {
            LIZ(widgetManager, 2131197172, this);
            C79189HJn LIZ = C79189HJn.LIZJ.LIZ();
            if (LIZ != null && (LIZIZ = LIZ.LIZIZ()) != null && (LIZIZ2 = LIZIZ.LIZIZ()) != null) {
                if (this.LIZLLL == null) {
                    Context context = this.context;
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    DataCenter dataCenter = this.dataCenter;
                    Intrinsics.checkNotNullExpressionValue(dataCenter, "");
                    View view = this.contentView;
                    if (view != null) {
                        this.LIZLLL = new C80576HpS(context, dataCenter, this, (ViewGroup) view, this.LJFF, LIZIZ2, this.LJI, this.LJII);
                        C80576HpS c80576HpS = this.LIZLLL;
                        if (c80576HpS != null) {
                            c80576HpS.LIZ(this.f26506LJ);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                }
                C79189HJn LIZ2 = C79189HJn.LIZJ.LIZ();
                if (LIZ2 != null && (LIZIZ3 = LIZ2.LIZIZ()) != null && (LIZIZ4 = LIZIZ3.LIZIZ()) != null) {
                    Room room = (Room) this.dataCenter.get("data_room");
                    if (room != null) {
                        j = room.ownerUserId;
                    } else {
                        j = 0;
                    }
                    linkPlayerInfo = LIZIZ4.LIZ(j, "");
                    if (linkPlayerInfo != null && linkPlayerInfo.LJIIL == 0) {
                        z2 = false;
                    }
                } else {
                    linkPlayerInfo = null;
                }
                C80576HpS c80576HpS2 = this.LIZLLL;
                if (c80576HpS2 != null) {
                    c80576HpS2.LIZ(z2);
                }
                C80576HpS c80576HpS3 = this.LIZLLL;
                if (c80576HpS3 != null) {
                    if (linkPlayerInfo != null) {
                        z = linkPlayerInfo.LJJJ;
                    }
                    c80576HpS3.LIZIZ(z);
                }
            }
        }
        C80576HpS c80576HpS4 = this.LIZLLL;
        if (c80576HpS4 != null) {
            c80576HpS4.LIZLLL(this.LIZIZ);
        }
    }

    public VoiceChatSceneWidget(AbstractC5143z abstractC5143z, C4377t c4377t, C4369e c4369e) {
        C106862S5w.LIZ(abstractC5143z, c4377t, c4369e);
        this.LJFF = abstractC5143z;
        this.LJI = c4377t;
        this.LJII = c4369e;
    }
}
