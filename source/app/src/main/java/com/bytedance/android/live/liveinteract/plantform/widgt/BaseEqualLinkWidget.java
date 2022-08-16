package com.bytedance.android.live.liveinteract.plantform.widgt;

import android.view.SurfaceView;
import android.view.TextureView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.exception.ApiException;
import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.android.live.linkpk.AbstractC4254a;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.BaseLinkWidget;
import com.bytedance.android.live.liveinteract.newpk.AbstractC4584c;
import com.bytedance.android.live.liveinteract.newpk.AbstractC4585d;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4763ad;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4769b;
import com.bytedance.android.live.liveinteract.plantform.p385a.r$c;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.event.C5984am;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q;
import com.bytedance.android.livesdk.chatroom.model.C6089a;
import com.bytedance.android.livesdk.chatroom.model.interact.C6173m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p1594ss.avframework.livestreamv2.core.ILayerControl;
import java.nio.ByteBuffer;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C2IN;
import p003X.C79065HEt;
import p003X.C79199HJx;
import p003X.C79313HOh;
import p003X.C88440Kt0;
import p003X.HGZ;
import p003X.HH8;
import p003X.HQ9;
import p003X.HQG;
import p003X.HQH;

/* loaded from: classes3.dex */
public abstract class BaseEqualLinkWidget<T extends r$c> extends BaseLinkWidget implements AbstractC4584c, AbstractC4585d, AbstractC4769b, AbstractC4569445g {
    public static ChangeQuickRedirect LJIIZILJ;
    public HGZ LIZIZ;
    public C79065HEt LIZJ;
    public Room LJIJ;
    public HQ9 LJIJI;
    public C79199HJx LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public AbstractC4254a LJJ;

    static {
        Covode.recordClassIndex(29567);
    }

    public void LIZ(String str, long j) {
    }

    public void LIZ(String str, SurfaceView surfaceView, int i, int i2) {
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZ(String str, TextureView textureView, int i, int i2) {
    }

    public void LIZ(String str, ILayerControl.ILayer iLayer, int i, int i2) {
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZ(String str, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{str, bool}, this, LJIIZILJ, false, 16).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZ(String str, ByteBuffer byteBuffer) {
    }

    public void LIZ(String[] strArr, boolean[] zArr, int[] iArr) {
    }

    public void LIZIZ(String str, SurfaceView surfaceView, int i, int i2) {
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZIZ(String str, TextureView textureView, int i, int i2) {
    }

    public void LIZIZ(String str, ILayerControl.ILayer iLayer, int i, int i2) {
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZIZ(String str, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{str, bool}, this, LJIIZILJ, false, 17).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    public abstract void LIZJ(String str);

    /* renamed from: LJ */
    public abstract HQG mo15702LJ();

    public abstract AbstractC6070q LJFF();

    /* renamed from: Z_ */
    public void mo15698Z_() {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4769b
    /* renamed from: a_ */
    public final void mo15701a_(Throwable th) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4769b
    public final void aa_() {
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    /* renamed from: g_ */
    public final void mo15697g_(String str) {
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJIIZILJ, false, 19).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4769b
    public final void LIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LJIIZILJ, false, 13).isSupported) {
            return;
        }
        LIZJ("onJoinFailed");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4769b
    public final void LIZ(Throwable th, String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{th, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LJIIZILJ, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (LIZIZ() == 7 && z) {
            ApiException apiException = (ApiException) (!(th instanceof ApiServerException) ? null : th);
            if (apiException != null && apiException.mErrorCode == 4004266) {
                C88440Kt0.LIZ(((ApiServerException) th).mPrompt);
                C79313HOh.f6779LJ.LIZ((Exception) th, false, str);
                return;
            }
        }
        LIZ((C5176i<C6173m>) null, z);
    }

    public void LJII() {
        if (PatchProxy.proxy(new Object[0], this, LJIIZILJ, false, 9).isSupported) {
            return;
        }
        LIZJ("rtcEndSuccess");
    }

    public final Room LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIZILJ, false, 1);
        if (proxy.isSupported) {
            return (Room) proxy.result;
        }
        Room room = this.LJIJ;
        if (room == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return room;
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        HQ9 hq9;
        if (PatchProxy.proxy(new Object[0], this, LJIIZILJ, false, 5).isSupported) {
            return;
        }
        super.onDestroy();
        C79199HJx c79199HJx = this.LJIJJ;
        if (c79199HJx != null) {
            c79199HJx.LIZIZ(this);
        }
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.removeObserver(this.LIZJ);
        }
        if (this.LJIJJLI && (hq9 = this.LJIJI) != null) {
            hq9.LIZIZ(this);
            hq9.LIZ();
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LJIIZILJ, false, 4).isSupported) {
            return;
        }
        super.onResume();
        if (this.LJIJJLI) {
            C79199HJx c79199HJx = this.LJIJJ;
            if (c79199HJx != null && c79199HJx.LJIIIIZZ && !PatchProxy.proxy(new Object[0], c79199HJx, C79199HJx.LIZ, false, 18).isSupported && c79199HJx.LJIIIIZZ) {
                c79199HJx.LIZIZ(true);
                HH8.LIZ(c79199HJx.LJIILL, true, "onResume");
            }
            HQG mo15702LJ = mo15702LJ();
            if (mo15702LJ != null) {
                mo15702LJ.LJII();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        C79199HJx c79199HJx;
        if (PatchProxy.proxy(new Object[0], this, LJIIZILJ, false, 3).isSupported) {
            return;
        }
        super.onCreate();
        Object obj = this.dataCenter.get("data_room", (String) new Room());
        Intrinsics.checkNotNullExpressionValue(obj, "");
        this.LJIJ = (Room) obj;
        Object obj2 = this.dataCenter.get("data_is_anchor", (String) Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(obj2, "");
        this.LJIJJLI = ((Boolean) obj2).booleanValue();
        if (this.LJIJJLI) {
            DataCenter dataCenter = this.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter, "");
            this.LJIJI = new HQ9(dataCenter, LIZIZ());
            AbstractC4763ad LIZ = AbstractC4763ad.LIZ.LIZ();
            if (LIZ != null) {
                c79199HJx = LIZ.LIZ();
            } else {
                c79199HJx = null;
            }
            this.LJIJJ = c79199HJx;
            HQ9 hq9 = this.LJIJI;
            if (hq9 != null) {
                hq9.LIZ(this);
            }
            this.LIZJ = new C79065HEt(this.LJIJJ);
            DataCenter dataCenter2 = this.dataCenter;
            if (dataCenter2 != null) {
                dataCenter2.observeForever("data_interact_anchor_param_change", this.LIZJ);
            }
        }
        HQG mo15702LJ = mo15702LJ();
        if (mo15702LJ != null) {
            mo15702LJ.LIZIZ();
        }
    }

    public BaseEqualLinkWidget(AbstractC4254a abstractC4254a) {
        C106862S5w.LIZ(abstractC4254a);
        this.LJJ = abstractC4254a;
    }

    public void LIZ(C5176i<C6089a> c5176i) {
        if (PatchProxy.proxy(new Object[]{c5176i}, this, LJIIZILJ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(c5176i);
        this.dataCenter.put("cmd_interact_state_change", new C5984am(7));
        C79199HJx c79199HJx = this.LJIJJ;
        if (c79199HJx != null) {
            c79199HJx.LIZ(this);
        }
        C79199HJx c79199HJx2 = this.LJIJJ;
        if (c79199HJx2 != null) {
            AbstractC6070q LJFF = LJFF();
            if (!PatchProxy.proxy(new Object[]{c79199HJx2, LJFF, this, (byte) 0, (byte) 0, 12, null}, null, C79199HJx.LIZ, true, 5).isSupported) {
                c79199HJx2.LIZ(LJFF, this, true, true);
            }
        }
    }

    public final void LIZIZ(String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LJIIZILJ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJIL = true;
        HQ9 hq9 = this.LJIJI;
        if (hq9 != null) {
            hq9.LIZ(this.LJJ.mo15779LJ(), str, z);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZ(long j, long j2) {
        HGZ hgz;
        if (!PatchProxy.proxy(new Object[]{new Long(j), new Long(j2)}, this, LJIIZILJ, false, 8).isSupported && (hgz = this.LIZIZ) != null) {
            hgz.LIZ(j, j2);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZIZ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LJIIZILJ, false, 11).isSupported) {
            return;
        }
        String str = "error" + j;
        if (!PatchProxy.proxy(new Object[]{str}, null, HQH.LIZ, true, 1).isSupported) {
            HashMap hashMap = new HashMap();
            hashMap.put("event_name", str);
            hashMap.put("link_mic_id", LinkCrossRoomDataHolder.LJII().LJIILL);
            hashMap.put("channel_id", Long.valueOf(LinkCrossRoomDataHolder.LJII().LIZLLL));
            C2IN.LIZIZ().LIZ("ttlive_anchor", hashMap);
        }
        LIZ(this, "rtc_error", false, 2, null);
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LJIIZILJ, false, 10).isSupported) {
            return;
        }
        LIZ(this, "rtc_start_error", false, 2, null);
    }

    public void LIZ(C5176i<C6173m> c5176i, boolean z) {
        if (!PatchProxy.proxy(new Object[]{c5176i, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LJIIZILJ, false, 14).isSupported && this.LJIJJLI) {
            C79199HJx c79199HJx = this.LJIJJ;
            if (c79199HJx != null && c79199HJx.LJIIIIZZ) {
                C79199HJx c79199HJx2 = this.LJIJJ;
                if (c79199HJx2 != null) {
                    c79199HJx2.LJIIIIZZ();
                }
                LJII();
                return;
            }
            LJII();
        }
    }

    public static /* synthetic */ void LIZ(BaseEqualLinkWidget baseEqualLinkWidget, String str, boolean z, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{baseEqualLinkWidget, str, (byte) 0, 2, null}, null, LJIIZILJ, true, 7).isSupported) {
            return;
        }
        baseEqualLinkWidget.LIZIZ(str, false);
    }
}
