package com.bytedance.android.live.liveinteract.plantform.widgt;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.linkpk.AbstractC4254a;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.BaseLinkWidget;
import com.bytedance.android.live.liveinteract.api.chatroom.model.LinkApplyType;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.plantform.C4785b;
import com.bytedance.android.live.liveinteract.plantform.api.LinkAudienceApi;
import com.bytedance.android.live.liveinteract.plantform.core.AbstractC4803o;
import com.bytedance.android.live.liveinteract.plantform.core.AbstractC4804q;
import com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r;
import com.bytedance.android.live.liveinteract.plantform.core.v$a;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4761ab;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4770d;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i;
import com.bytedance.android.live.liveinteract.plantform.p385a.r$c;
import com.bytedance.android.live.liveinteract.plantform.permission.model.C4825a;
import com.bytedance.android.live.liveinteract.plantform.permission.model.C4826b;
import com.bytedance.android.live.liveinteract.plantform.permission.model.OperateType;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.event.C5984am;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6069p;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q;
import com.bytedance.android.livesdk.chatroom.model.C6094ae;
import com.bytedance.android.livesdk.chatroom.model.C6095af;
import com.bytedance.android.livesdk.chatroom.model.C6119b;
import com.bytedance.android.livesdk.chatroom.model.interact.C6160b;
import com.bytedance.android.livesdk.config.C6860br;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.model.C8854es;
import com.bytedance.android.livesdk.message.model.C8874fl;
import com.bytedance.android.livesdk.message.model.LinkMicGuideMessage;
import com.bytedance.android.livesdk.message.model.ReplyType;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9549v;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.live.datacontext.C13491f;
import com.p1594ss.avframework.livestreamv2.core.ILayerControl;
import com.p1594ss.avframework.livestreamv2.core.LiveCore;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.AbstractC78050Gpo;
import p003X.AbstractC78986HBs;
import p003X.AbstractC79253HLz;
import p003X.AbstractC80546Hoy;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C409882Kg;
import p003X.C422242nK;
import p003X.C77874Gmy;
import p003X.C78996HCc;
import p003X.C79007HCn;
import p003X.C79046HEa;
import p003X.C79053HEh;
import p003X.C79107HGj;
import p003X.C79109HGl;
import p003X.C79169HIt;
import p003X.C79241HLn;
import p003X.C79242HLo;
import p003X.C80517HoV;
import p003X.C81980ISw;
import p003X.C88306Kqq;
import p003X.HB7;
import p003X.HER;
import p003X.HGW;
import p003X.HH8;
import p003X.HHA;
import p003X.HK9;
import p003X.HNG;
import p003X.IQV;
import p003X.IQX;

/* loaded from: classes3.dex */
public abstract class BasePkInteractGuestWidget<T extends r$c> extends BaseLinkWidget implements AbstractC4761ab, AbstractC4803o, AbstractC4804q, AbstractC4805r, AbstractC4569445g {
    public static ChangeQuickRedirect LJIIL;
    public AbstractC4254a LIZLLL;
    public Room LJIILIIL;
    public C78996HCc LJIILJJIL;
    public AbstractC6070q LJIILL;
    public HHA LJIILLIIL;
    public boolean LJIIZILJ;
    public long LJIJJ;
    public long LJIJJLI;
    public C81980ISw LJJ;
    public String LJIJ = "";
    public String LJIJI = "leave_normally";
    public String LJIL = "";
    public CompositeDisposable LIZIZ = new CompositeDisposable();
    public final Lazy LIZJ = LazyKt__LazyJVMKt.lazy(new BasePkInteractGuestWidget$surfaceViewByLazy$2(this));

    static {
        Covode.recordClassIndex(29580);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(long j, long j2) {
    }

    public void LIZ(C6119b c6119b, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{c6119b, Integer.valueOf(i), Integer.valueOf(i2)}, this, LJIIL, false, 17).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6119b);
    }

    public void LIZ(LinkMicGuideMessage linkMicGuideMessage) {
        if (PatchProxy.proxy(new Object[]{linkMicGuideMessage}, this, LJIIL, false, 20).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkMicGuideMessage);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, int i, int i2) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{str, bool}, this, LJIIL, false, 46).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    public void LIZ(String str, Throwable th) {
        if (PatchProxy.proxy(new Object[]{str, th}, this, LJIIL, false, 19).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    public abstract AbstractC6070q LIZIZ(String str);

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZIZ(String str, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{str, bool}, this, LJIIL, false, 45).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    public void LIZJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LJIIL, false, 18).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    public void LIZJ(Throwable th) {
    }

    public abstract AbstractC78986HBs<T> LIZLLL();

    public void LIZLLL(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LJIIL, false, 41).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
    }

    public void LIZLLL(Throwable th) {
    }

    @Override // p003X.AbstractC78977HBj
    /* renamed from: LJ */
    public final void mo15695LJ(Throwable th) {
    }

    public void LJIJ() {
    }

    @Override // p003X.AbstractC78977HBj
    public final void aj_() {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: d_ */
    public final void mo15658d_(String str) {
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJIIL, false, 50).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4761ab
    public final HHA LJIILIIL() {
        return this.LJIILLIIL;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4761ab
    public final AbstractC6070q LJIILJJIL() {
        return this.LJIILL;
    }

    public AbstractC4254a LJIILLIIL() {
        return this.LIZLLL;
    }

    public void LIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LJIIL, false, 26).isSupported) {
            return;
        }
        if (!(th instanceof ApiServerException)) {
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_TURN_ON_OPT_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                this.LJIJI = "join_channel_fail";
                LIZLLL("join_channel_fail");
            }
        }
        C79107HGj.LIZ("join channel failed", th != null ? th.getMessage() : null);
        HNG.LIZ("join_fail", th);
    }

    public void LIZ(String str, long j) {
        if (PatchProxy.proxy(new Object[]{str, new Long(j)}, this, LJIIL, false, 31).isSupported) {
            return;
        }
        LIZLLL().LIZ(str);
    }

    public void LIZ(String str, SurfaceView surfaceView, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, surfaceView, Integer.valueOf(i), Integer.valueOf(i2)}, this, LJIIL, false, 33).isSupported) {
            return;
        }
        long j = C79046HEa.LIZ().f6716LJ;
        if (TextUtils.equals(str, LJIILLIIL().LIZ()) && j > 0) {
            C79046HEa.LIZ().f6716LJ = 0L;
        }
        if (!TextUtils.equals(str, LJIILLIIL().LIZ()) || this.LJIJJ <= 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LJIJJ;
        HH8.LIZIZ(LIZIZ(), currentTimeMillis);
        C79109HGl.LIZ(LIZIZ(), currentTimeMillis, this.LJIL, str);
        this.LJIJJ = 0L;
        this.LJIL = "";
    }

    public void LIZ(String str, TextureView textureView, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, textureView, Integer.valueOf(i), Integer.valueOf(i2)}, this, LJIIL, false, 34).isSupported) {
            return;
        }
        long j = C79046HEa.LIZ().f6716LJ;
        if (TextUtils.equals(str, LJIILLIIL().LIZ()) && j > 0) {
            C79046HEa.LIZ().f6716LJ = 0L;
        }
        if (!TextUtils.equals(str, LJIILLIIL().LIZ()) || this.LJIJJ <= 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LJIJJ;
        HH8.LIZIZ(LIZIZ(), currentTimeMillis);
        C79109HGl.LIZ(LIZIZ(), currentTimeMillis, this.LJIL, str);
        this.LJIJJ = 0L;
        this.LJIL = "";
    }

    public void LIZ(String str, ILayerControl.ILayer iLayer, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, iLayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, LJIIL, false, 35).isSupported) {
            return;
        }
        long j = C79046HEa.LIZ().f6716LJ;
        if (TextUtils.equals(str, LJIILLIIL().LIZ()) && j > 0) {
            C79046HEa.LIZ().f6716LJ = 0L;
        }
        if (!TextUtils.equals(str, LJIILLIIL().LIZ()) || this.LJIJJ <= 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LJIJJ;
        HH8.LIZIZ(LIZIZ(), currentTimeMillis);
        C79109HGl.LIZ(LIZIZ(), currentTimeMillis, this.LJIL, str);
        this.LJIJJ = 0L;
        this.LJIL = "";
    }

    public void LIZ(String[] strArr, boolean[] zArr, int[] iArr) {
        String str;
        LinkPlayerInfo LIZ;
        if (PatchProxy.proxy(new Object[]{strArr, zArr, iArr}, this, LJIIL, false, 37).isSupported || strArr == null || zArr == null) {
            return;
        }
        int length = strArr.length;
        AbstractC4254a LJIILLIIL = LJIILLIIL();
        if (LJIILLIIL == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder");
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = (LinkCrossRoomDataHolder) LJIILLIIL;
        if (linkCrossRoomDataHolder == null || (str = linkCrossRoomDataHolder.LJIILLIIL) == null) {
            str = "0";
        }
        for (int i = 0; i < length; i++) {
            if (TextUtils.equals(strArr[i], str) && zArr[i]) {
                AbstractC78986HBs<T> LIZLLL = LIZLLL();
                if (!(LIZLLL instanceof C79241HLn)) {
                    LIZLLL = null;
                }
                C79241HLn c79241HLn = (C79241HLn) LIZLLL;
                if (c79241HLn == null || (LIZ = c79241HLn.LIZ(0L, str)) == null || LIZ.LJIIL != 0) {
                    return;
                }
                AbstractC6070q abstractC6070q = this.LJIILL;
                if (!(abstractC6070q instanceof AbstractC6069p)) {
                    abstractC6070q = null;
                }
                AbstractC6069p abstractC6069p = (AbstractC6069p) abstractC6070q;
                if (abstractC6069p == null) {
                    return;
                }
                abstractC6069p.mo15548A_();
                return;
            }
        }
    }

    public void LIZ(C6160b c6160b, int i) {
        if (PatchProxy.proxy(new Object[]{c6160b, Integer.valueOf(i)}, this, LJIIL, false, 42).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6160b);
        if (i != ReplyType.Agree.ordinal()) {
            return;
        }
        this.LJIJJLI = System.currentTimeMillis();
        C78996HCc c78996HCc = this.LJIILJJIL;
        if (c78996HCc == null) {
            return;
        }
        c78996HCc.LIZ();
    }

    public final Room LJIIZILJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIL, false, 1);
        if (proxy.isSupported) {
            return (Room) proxy.result;
        }
        Room room = this.LJIILIIL;
        if (room == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return room;
    }

    /* renamed from: W_ */
    public void mo15659W_() {
        if (PatchProxy.proxy(new Object[0], this, LJIIL, false, 32).isSupported) {
            return;
        }
        C78996HCc c78996HCc = this.LJIILJJIL;
        if (c78996HCc != null) {
            c78996HCc.LIZ(this.LJIJI);
        }
        this.LJIILL = null;
    }

    private boolean LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIL, false, 8);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC4774i LIZ = AbstractC78050Gpo.LIZ();
        if (LIZ == null || !C79169HIt.LIZIZ(LIZ.LJJIFFI(), 2)) {
            return false;
        }
        C79046HEa LIZ2 = C79046HEa.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        if (!LIZ2.LIZJ()) {
            return false;
        }
        return true;
    }

    public void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LJIIL, false, 29).isSupported) {
            return;
        }
        if (this.dataCenter != null) {
            this.dataCenter.put("cmd_interact_state_change", new C5984am(4));
        }
        C79046HEa.LIZ().LIZ((Integer) 0);
    }

    /* renamed from: V_ */
    public void mo15660V_() {
        if (PatchProxy.proxy(new Object[0], this, LJIIL, false, 30).isSupported) {
            return;
        }
        C77874Gmy.LIZ(false);
        LinkCrossRoomDataHolder.LJII().LJJIFFI = System.currentTimeMillis();
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("cmd_interact_state_change", new C5984am(3));
        }
        C79046HEa.LIZ().LIZ((Integer) 2);
        C78996HCc c78996HCc = this.LJIILJJIL;
        if (c78996HCc != null) {
            String str = this.LJIJ;
            if (!PatchProxy.proxy(new Object[]{str}, c78996HCc, C78996HCc.LIZ, false, 15).isSupported) {
                C106862S5w.LIZ(str);
                long currentTimeMillis = System.currentTimeMillis();
                c78996HCc.LIZJ.add(((LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class)).notifyJoinRtc(c78996HCc.LIZLLL.getId(), str).compose(C100839PnV.LIZJ()).subscribe(new HER(str, currentTimeMillis), new C79053HEh<>(currentTimeMillis, str)));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
        if (1 == r0.intValue()) goto L25;
     */
    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDestroy() {
        /*
            r7 = this;
            r6 = 0
            java.lang.Object[] r2 = new java.lang.Object[r6]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget.LJIIL
            r0 = 7
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r7, r1, r6, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto Lf
            return
        Lf:
            X.HBs r0 = r7.LIZLLL()
            r0.LIZIZ()
            boolean r0 = r7.LIZJ()
            if (r0 != 0) goto L28
            X.HHA r0 = r7.LJIILLIIL
            if (r0 == 0) goto L23
            r0.LIZLLL()
        L23:
            io.reactivex.disposables.CompositeDisposable r0 = r7.LIZIZ
            r0.dispose()
        L28:
            X.HCc r4 = r7.LJIILJJIL
            if (r4 == 0) goto Lba
            boolean r5 = r7.LIZJ()
            r3 = 1
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r5)
            r2[r6] = r0
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = p003X.C78996HCc.LIZ
            r0 = 4
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r4, r1, r6, r0)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto Lba
            com.ss.ugc.live.sdk.message.interfaces.IMessageManager r0 = r4.LIZIZ
            if (r0 == 0) goto L4b
            r0.removeMessageListener(r4)
        L4b:
            io.reactivex.disposables.CompositeDisposable r0 = r4.LIZJ
            boolean r0 = r0.isDisposed()
            if (r0 != 0) goto L58
            io.reactivex.disposables.CompositeDisposable r0 = r4.LIZJ
            r0.dispose()
        L58:
            r2 = 2
            X.HEa r0 = p003X.C79046HEa.LIZ()
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            T r0 = r0.LJJIIZI
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L6e
            int r0 = r0.intValue()
            if (r2 == r0) goto L81
        L6e:
            X.HEa r0 = p003X.C79046HEa.LIZ()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            T r0 = r0.LJJIIZI
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lb5
            int r0 = r0.intValue()
            if (r3 != r0) goto Lb5
        L81:
            if (r5 != 0) goto Lb5
            X.Kqq r1 = p003X.C88306Kqq.LIZ()
            java.lang.Class<com.bytedance.android.live.liveinteract.plantform.api.LinkApi> r0 = com.bytedance.android.live.liveinteract.plantform.api.LinkApi.class
            java.lang.Object r3 = r1.LIZ(r0)
            com.bytedance.android.live.liveinteract.plantform.api.LinkApi r3 = (com.bytedance.android.live.liveinteract.plantform.api.LinkApi) r3
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r4.LIZLLL
            long r1 = r0.getId()
            java.lang.String r0 = "live_end"
            io.reactivex.Single r1 = r3.leave(r1, r0)
            X.Wac r0 = p003X.C100839PnV.LIZJ()
            io.reactivex.Single r2 = r1.compose(r0)
            io.reactivex.functions.Consumer r1 = io.reactivex.internal.functions.Functions.LIZIZ()
            X.2nW r0 = new X.2nW
            r0.<init>()
            io.reactivex.disposables.Disposable r1 = r2.subscribe(r1, r0)
            io.reactivex.disposables.CompositeDisposable r0 = r4.LIZJ
            r0.add(r1)
        Lb5:
            java.util.ArrayList<com.bytedance.android.live.liveinteract.plantform.core.o> r0 = r4.f6665LJ
            r0.clear()
        Lba:
            super.onDestroy()
            X.ISw r0 = r7.LJJ
            if (r0 == 0) goto Lc4
            r0.LIZJ()
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget.onDestroy():void");
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        HHA hha;
        if (PatchProxy.proxy(new Object[0], this, LJIIL, false, 6).isSupported) {
            return;
        }
        super.onCreate();
        Object obj = this.dataCenter.get("data_room", (String) new Room());
        Intrinsics.checkNotNullExpressionValue(obj, "");
        this.LJIILIIL = (Room) obj;
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        this.LJIILJJIL = new C78996HCc(dataCenter, LJIILLIIL());
        AbstractC4770d LIZ = AbstractC4770d.LIZ.LIZ();
        AbstractC6070q abstractC6070q = null;
        if (LIZ != null) {
            hha = LIZ.LJIJI();
        } else {
            hha = null;
        }
        this.LJIILLIIL = hha;
        HHA hha2 = this.LJIILLIIL;
        if (hha2 != null && hha2.LJI) {
            AbstractC4770d LIZ2 = AbstractC4770d.LIZ.LIZ();
            if (LIZ2 != null) {
                abstractC6070q = LIZ2.LJIJJ();
            }
            this.LJIILL = abstractC6070q;
            HHA hha3 = this.LJIILLIIL;
            if (hha3 != null) {
                hha3.LIZ(LJIILLIIL());
            }
            HHA hha4 = this.LJIILLIIL;
            if (hha4 != null) {
                hha4.LIZ(this);
            }
        } else {
            Room room = this.LJIILIIL;
            if (room == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            this.LJIILLIIL = new HHA(room, LJIILLIIL(), this, false);
        }
        C79046HEa.LIZ().LIZ((Integer) 0);
        LIZLLL().LIZ();
        C78996HCc c78996HCc = this.LJIILJJIL;
        if (c78996HCc != null && !PatchProxy.proxy(new Object[0], c78996HCc, C78996HCc.LIZ, false, 1).isSupported) {
            IMessageManager iMessageManager = c78996HCc.LIZIZ;
            if (iMessageManager != null) {
                iMessageManager.addMessageListener(MessageType.LINK_MIC.LIZ(), c78996HCc);
            }
            IMessageManager iMessageManager2 = c78996HCc.LIZIZ;
            if (iMessageManager2 != null) {
                iMessageManager2.addMessageListener(MessageType.LINK_MIC_GUIDE_MESSAGE.LIZ(), c78996HCc);
            }
            IMessageManager iMessageManager3 = c78996HCc.LIZIZ;
            if (iMessageManager3 != null) {
                iMessageManager3.addMessageListener(MessageType.LINKER.LIZ(), c78996HCc);
            }
            IMessageManager iMessageManager4 = c78996HCc.LIZIZ;
            if (iMessageManager4 != null) {
                iMessageManager4.addMessageListener(MessageType.LINK_SETTING_NOTIFY_MESSAGE.LIZ(), c78996HCc);
            }
            IMessageManager iMessageManager5 = c78996HCc.LIZIZ;
            if (iMessageManager5 != null) {
                iMessageManager5.addMessageListener(MessageType.CONTROL.LIZ(), c78996HCc);
            }
        }
        C78996HCc c78996HCc2 = this.LJIILJJIL;
        if (c78996HCc2 != null && !PatchProxy.proxy(new Object[]{this}, c78996HCc2, C78996HCc.LIZ, false, 2).isSupported) {
            C106862S5w.LIZ(this);
            c78996HCc2.f6665LJ.add(this);
        }
        C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, this.dataCenter, 0L, 2, null);
        if (LIZ3 != null) {
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "");
            this.LJJ = new C81980ISw(context, LIZ3, this.LJIILLIIL, this);
        }
        Pair LIZ4 = IQV.LIZ((Function0) BasePkInteractGuestWidget$onCreate$pair$1.INSTANCE);
        ((C4785b) LIZ4.getFirst()).LIZ().LIZIZ(this);
        IQX.LIZ((C13491f) LIZ4.getFirst(), "pk_guest_rtc_linker_service");
        this.LIZIZ.add((Disposable) LIZ4.getSecond());
    }

    /* renamed from: LJ */
    public void mo15696LJ(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LJIIL, false, 21).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        this.LJIJI = "kick_out";
        LIZLLL("kick_out");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: f_ */
    public final void mo15657f_(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LJIIL, false, 44).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        C79107HGj.LIZ("onUserJoined");
    }

    public BasePkInteractGuestWidget(AbstractC4254a abstractC4254a) {
        C106862S5w.LIZ(abstractC4254a);
        this.LIZLLL = abstractC4254a;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4803o
    public final void LIZLLL(C8874fl c8874fl) {
        if (PatchProxy.proxy(new Object[]{c8874fl}, this, LJIIL, false, 49).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8874fl);
        if (!PatchProxy.proxy(new Object[]{this, c8874fl}, null, HGW.LIZ, true, 1).isSupported) {
            C106862S5w.LIZ(c8874fl);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: e_ */
    public final void mo15661e_(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LJIIL, false, 36).isSupported) {
            return;
        }
        C81980ISw c81980ISw = this.LJJ;
        if (c81980ISw != null) {
            c81980ISw.LIZIZ();
        }
        if (TextUtils.equals(str, LJIILLIIL().LIZ()) && this.LJIJJLI > 0) {
            System.currentTimeMillis();
            this.LJIJJLI = 0L;
        }
    }

    public void LIZIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LJIIL, false, 28).isSupported) {
            return;
        }
        LJIIIIZZ();
    }

    public void LIZLLL(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LJIIL, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        HHA hha = this.LJIILLIIL;
        if (hha != null && hha.LJI) {
            this.LJIJI = str;
            HHA hha2 = this.LJIILLIIL;
            if (hha2 != null) {
                hha2.LIZ();
            }
            C81980ISw c81980ISw = this.LJJ;
            if (c81980ISw != null) {
                c81980ISw.LIZJ();
            }
        } else {
            C78996HCc c78996HCc = this.LJIILJJIL;
            if (c78996HCc != null) {
                c78996HCc.LIZ(str);
            }
        }
        AbstractC6070q abstractC6070q = this.LJIILL;
        if (!(abstractC6070q instanceof AbstractC6069p)) {
            abstractC6070q = null;
        }
        AbstractC6069p abstractC6069p = (AbstractC6069p) abstractC6070q;
        if (abstractC6069p != null) {
            abstractC6069p.LJFF();
        }
    }

    public void LIZJ(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LJIIL, false, 23).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        this.LJIJJ = c8854es.baseMessage.LIZIZ;
        this.LJIJJLI = c8854es.baseMessage.LIZIZ;
        this.LJIL = "apply";
        C78996HCc c78996HCc = this.LJIILJJIL;
        if (c78996HCc != null) {
            c78996HCc.LIZ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4803o
    public final void LIZJ(C8874fl c8874fl) {
        if (PatchProxy.proxy(new Object[]{c8874fl}, this, LJIIL, false, 22).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8874fl);
        HNG.LIZ("server_sys_kickout", new HashMap(), LJIILLIIL());
        this.LJIJI = "sys_kick_out";
        LIZLLL("sys_kick_out");
    }

    public void LIZ(C5176i<C6094ae> c5176i) {
        String str;
        String str2;
        AbstractC6070q abstractC6070q;
        LiveCore liveCore;
        Object mo27335getValue;
        String str3;
        AbstractC6070q abstractC6070q2;
        if (PatchProxy.proxy(new Object[]{c5176i}, this, LJIIL, false, 24).isSupported) {
            return;
        }
        C106862S5w.LIZ(c5176i);
        C81980ISw c81980ISw = this.LJJ;
        if (c81980ISw != null) {
            c81980ISw.LIZ();
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_SAFE_CREATE_LIVE_CORE_CLIENT;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            C6094ae c6094ae = c5176i.LIZJ;
            if (c6094ae != null) {
                str3 = c6094ae.f26866LJ;
            } else {
                str3 = null;
            }
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str3}, this, LJIIL, false, 25);
            if (proxy.isSupported) {
                abstractC6070q2 = (AbstractC6070q) proxy.result;
            } else {
                if (this.LJIILL == null) {
                    this.LJIILL = LIZIZ(str3);
                }
                abstractC6070q2 = this.LJIILL;
            }
            this.LJIILL = abstractC6070q2;
        } else {
            C6094ae c6094ae2 = c5176i.LIZJ;
            if (c6094ae2 != null) {
                str = c6094ae2.f26866LJ;
            } else {
                str = null;
            }
            this.LJIILL = LIZIZ(str);
        }
        if (C79242HLo.LJIIIZ() && (abstractC6070q = this.LJIILL) != null && (liveCore = abstractC6070q.getLiveCore()) != null) {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LJIIL, false, 5);
            if (proxy2.isSupported) {
                mo27335getValue = proxy2.result;
            } else {
                mo27335getValue = this.LIZJ.mo27335getValue();
            }
            liveCore.setDisplay((SurfaceView) mo27335getValue);
        }
        C422242nK.LIZ(this.context, LJIILLIIL().LJFF());
        HHA hha = this.LJIILLIIL;
        if (hha != null) {
            hha.LIZ(this.LJIILL, this, true, true);
        }
        C6094ae c6094ae3 = c5176i.LIZJ;
        if (c6094ae3 == null || (str2 = c6094ae3.LIZJ) == null) {
            str2 = "";
        }
        this.LJIJ = str2;
        C6094ae c6094ae4 = c5176i.LIZJ;
        if (c6094ae4 != null && c6094ae4.LJI != null) {
            SettingKey<C6860br> settingKey2 = LiveSettingKeys.LIST_USER_VERSION_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            if (settingKey2.getValue().LJI) {
                AbstractC78986HBs<T> LIZLLL = LIZLLL();
                if (!(LIZLLL instanceof C79241HLn)) {
                    LIZLLL = null;
                }
                C79241HLn c79241HLn = (C79241HLn) LIZLLL;
                if (c79241HLn != null) {
                    C6094ae c6094ae5 = c5176i.LIZJ;
                    Intrinsics.checkNotNullExpressionValue(c6094ae5, "");
                    C6094ae c6094ae6 = c6094ae5;
                    if (!PatchProxy.proxy(new Object[]{c6094ae6}, c79241HLn, C79241HLn.LIZ, false, 20).isSupported) {
                        C106862S5w.LIZ(c6094ae6);
                        C9549v LIZ = C79242HLo.LIZ(c6094ae6);
                        List<AnchorLinkUser> list = c6094ae6.LJI;
                        if (list != null && !list.isEmpty()) {
                            c79241HLn.LIZ(LIZ, list);
                            if (c79241HLn.LIZIZ(list, c6094ae6.LJFF, "joinChannel")) {
                                c79241HLn.LJIIIZ = new v$a(System.currentTimeMillis(), "joinChannel", "", null, 8);
                                ALogger.m15795w(c79241HLn.LIZIZ, "refreshList from=joinChannel version=" + c6094ae6.LJFF + " onOnlineListChanged callback");
                                for (AbstractC79253HLz<LinkPlayerInfo> abstractC79253HLz : c79241HLn.LJIIIIZZ) {
                                    abstractC79253HLz.LIZ(c79241HLn.LIZJ);
                                }
                                C79007HCn.LJII().LJIILJJIL = c79241HLn.LJIIJJI();
                                return;
                            }
                            ALogger.m15800e(c79241HLn.LIZIZ, "list not updated, from=joinChannel version=" + c6094ae6.LJFF + " current=" + c79241HLn.LJIIJ);
                            return;
                        }
                        ALogger.m15800e(c79241HLn.LIZIZ, "onSelfJoinChannel user list is empty! " + LIZ);
                    }
                }
            }
        }
    }

    public void LIZ(C6095af c6095af) {
        if (PatchProxy.proxy(new Object[]{c6095af}, this, LJIIL, false, 27).isSupported) {
            return;
        }
        LJIIIIZZ();
    }

    public void LIZ(int i, HK9 hk9) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), hk9}, this, LJIIL, false, 15).isSupported) {
            return;
        }
        hk9.LIZ();
    }

    public void LIZ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LJIIL, false, 38).isSupported) {
            return;
        }
        C77874Gmy.LIZ(false);
        C78996HCc c78996HCc = this.LJIILJJIL;
        if (c78996HCc != null) {
            c78996HCc.LIZ("leave_on_rtc_error");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZIZ(long j, Exception exc) {
        C78996HCc c78996HCc;
        if (!PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LJIIL, false, 39).isSupported && (c78996HCc = this.LJIILJJIL) != null) {
            c78996HCc.LIZ("leave_on_rtc_error");
        }
    }

    public void LIZJ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LJIIL, false, 40).isSupported) {
            return;
        }
        HHA hha = this.LJIILLIIL;
        if (hha != null) {
            hha.LIZ();
        }
        C81980ISw c81980ISw = this.LJJ;
        if (c81980ISw != null) {
            c81980ISw.LIZJ();
        }
    }

    public final void LIZ(OperateType operateType, int i, AbstractC80546Hoy<C4826b> abstractC80546Hoy) {
        if (PatchProxy.proxy(new Object[]{operateType, Integer.valueOf(i), abstractC80546Hoy}, this, LJIIL, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(operateType, abstractC80546Hoy);
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        Room room = this.LJIILIIL;
        if (room == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C80517HoV.LIZ().LIZ(new C4825a(context, 1, operateType, i, room, 0L, null, null, 224), abstractC80546Hoy);
    }

    private void LIZ(int i, int i2, int i3, LinkApplyType linkApplyType, String str, Integer num, Integer num2, Integer num3) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), linkApplyType, str, num, num2, num3}, this, LJIIL, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkApplyType, str);
        LIZ(OperateType.APPLY, i, new HB7(this, i, i2, i3, linkApplyType, str, num, num2));
    }

    public static /* synthetic */ void LIZ(BasePkInteractGuestWidget basePkInteractGuestWidget, int i, int i2, int i3, LinkApplyType linkApplyType, String str, Integer num, Integer num2, Integer num3, int i4, Object obj) {
        if (PatchProxy.proxy(new Object[]{basePkInteractGuestWidget, Integer.valueOf(i), -1, Integer.valueOf(i3), linkApplyType, str, null, null, null, 224, null}, null, LJIIL, true, 13).isSupported) {
            return;
        }
        basePkInteractGuestWidget.LIZ(i, -1, i3, linkApplyType, str, null, null, null);
    }
}
