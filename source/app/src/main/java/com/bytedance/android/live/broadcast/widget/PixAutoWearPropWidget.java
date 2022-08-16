package com.bytedance.android.live.broadcast.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.jsbridge.event.C3968v;
import com.bytedance.android.live.browser.jsbridge.event.C3969w;
import com.bytedance.android.live.browser.jsbridge.event.C3970x;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.message.model.AbstractC9021r;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.effectmanager.effect.model.Effect;
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Lazy;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC4569445g;
import p003X.AbstractC81278I1w;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C148062fT6;
import p003X.C2WC;
import p003X.C3UK;
import p003X.C409882Kg;
import p003X.C77347GeT;
import p003X.C86676KDm;
import p003X.C87010KQi;
import p003X.C88440Kt0;
import p003X.DialogC437313Rt;
import p003X.KAY;
import p003X.KBA;
import p003X.KBB;
import p003X.KBC;
import p003X.KBD;
import p003X.KBE;

/* loaded from: classes5.dex */
public final class PixAutoWearPropWidget extends LiveRecyclableWidget implements AbstractC4569445g, OnMessageListener {
    public static ChangeQuickRedirect LIZ;
    public Effect LIZIZ;
    public Sticker LIZJ;
    public C5923dp LIZLLL;

    /* renamed from: LJ */
    public DialogC437313Rt f25976LJ;
    public final Lazy LJFF = C77347GeT.LIZ(PixAutoWearPropWidget$compositeDisposable$2.INSTANCE);
    public IMessageManager LJI;

    static {
        Covode.recordClassIndex(18369);
    }

    private CompositeDisposable LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (CompositeDisposable) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 23).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    /* renamed from: LJ */
    private final void m15874LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        LIZ(C3968v.class, new KBA(this));
    }

    private final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        LIZ(C3970x.class, new KAY(this));
    }

    public final void LIZ() {
        DialogC437313Rt dialogC437313Rt;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported && (dialogC437313Rt = this.f25976LJ) != null) {
            C116971W2r.LIZ(dialogC437313Rt);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        LIZLLL().dispose();
    }

    public final void LIZIZ() {
        C2WC<Boolean> LJZL;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        LIZ();
        C5923dp c5923dp = this.LIZLLL;
        if (c5923dp == null || (LJZL = c5923dp.LJZL()) == null || !LJZL.LIZ().booleanValue()) {
            C88440Kt0.LIZ("由于网络原因盲盒形象生成失败，可通过PK功能入口再次发起随机连线");
            LIZ("onAddPropTimeOut");
        }
    }

    public final void LIZJ() {
        C5923dp c5923dp;
        C2WC<Room> LIZ2;
        Room LIZ3;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported && (c5923dp = this.LIZLLL) != null && (LIZ2 = c5923dp.LIZ()) != null && (LIZ3 = LIZ2.LIZ()) != null) {
            LIZ3.getRoomId();
        }
    }

    private final boolean LIZ(Sticker sticker) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{sticker}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        String sdkExtra = sticker.getSdkExtra();
        if (sdkExtra == null) {
            return false;
        }
        try {
            JSONObject optJSONObject = new JSONObject(sdkExtra).optJSONObject("settings");
            if (optJSONObject == null) {
                return false;
            }
            return optJSONObject.optBoolean("isCloudEffect");
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        C5923dp c5923dp;
        C2WC<Integer> LLF;
        if (PatchProxy.proxy(new Object[]{iMessage}, this, LIZ, false, 22).isSupported || !(iMessage instanceof AbstractC9021r)) {
            return;
        }
        AbstractC9021r abstractC9021r = (AbstractC9021r) iMessage;
        if (abstractC9021r.getMessageType() == MessageType.PIX_ACTIVITY_MESSAGE && !PatchProxy.proxy(new Object[]{abstractC9021r}, this, LIZ, false, 21).isSupported && (abstractC9021r instanceof C3UK) && (c5923dp = this.LIZLLL) != null && (LLF = c5923dp.LLF()) != null) {
            LLF.LIZ(Integer.valueOf(((C3UK) abstractC9021r).LIZ));
        }
    }

    private boolean LIZ(Disposable disposable) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{disposable}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(disposable);
        return LIZLLL().add(disposable);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C2WC<Boolean> LLD;
        Observable<Boolean> LIZIZ;
        Disposable subscribe;
        C2WC<Boolean> LJZL;
        Observable<Boolean> LIZIZ2;
        Disposable subscribe2;
        C5923dp c5923dp;
        C2WC<Room> LIZ2;
        Room LIZ3;
        C5923dp c5923dp2;
        C2WC<Boolean> LJZI;
        C2WC<Boolean> LJZI2;
        Observable<Boolean> LIZIZ3;
        Disposable subscribe3;
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 3).isSupported) {
            return;
        }
        this.LIZLLL = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        C5923dp c5923dp3 = this.LIZLLL;
        if (c5923dp3 != null && (LJZI2 = c5923dp3.LJZI()) != null && (LIZIZ3 = LJZI2.LIZIZ()) != null && (subscribe3 = LIZIZ3.subscribe(new KBE(this))) != null) {
            LIZ(subscribe3);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported && (c5923dp = this.LIZLLL) != null && (LIZ2 = c5923dp.LIZ()) != null && (LIZ3 = LIZ2.LIZ()) != null && LIZ3.propsActivityType == 1 && (c5923dp2 = this.LIZLLL) != null && (LJZI = c5923dp2.LJZI()) != null) {
            LJZI.LIZ(Boolean.TRUE);
        }
        C5923dp c5923dp4 = this.LIZLLL;
        if (c5923dp4 != null && (LJZL = c5923dp4.LJZL()) != null && (LIZIZ2 = LJZL.LIZIZ()) != null && (subscribe2 = LIZIZ2.subscribe(new KBC(this))) != null) {
            LIZ(subscribe2);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            LIZ(C3969w.class, new KBB(this));
        }
        this.LJI = (IMessageManager) this.dataCenter.get("data_message_manager", (String) null);
        IMessageManager iMessageManager = this.LJI;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(MessageType.PIX_ACTIVITY_MESSAGE.LIZ(), this);
        }
        C5923dp c5923dp5 = this.LIZLLL;
        if (c5923dp5 != null && (LLD = c5923dp5.LLD()) != null && (LIZIZ = LLD.LIZIZ()) != null && (subscribe = LIZIZ.subscribe(new KBD(this))) != null) {
            LIZ(subscribe);
        }
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 19).isSupported) {
            return;
        }
        ALogger.m15800e("PixAutoWearPropWidget", str);
    }

    private final <T> void LIZ(Class<T> cls, Consumer<T> consumer) {
        if (PatchProxy.proxy(new Object[]{cls, consumer}, this, LIZ, false, 18).isSupported) {
            return;
        }
        ((AbstractC81278I1w) C87010KQi.LIZ().LIZ((Class) cls).observeOn(AndroidSchedulers.mainThread()).m151as(C148062fT6.LIZ(this))).LIZ(consumer);
    }

    public final void LIZ(String str, Sticker sticker) {
        C2WC<Boolean> LJZL;
        C2WC<Boolean> m15555LL;
        if (PatchProxy.proxy(new Object[]{str, sticker}, this, LIZ, false, 12).isSupported) {
            return;
        }
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZJ(C86676KDm.LIZLLL);
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZJ(C86676KDm.f8375LJ);
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZ(str, sticker);
        boolean LIZ2 = LIZ(sticker);
        if (LIZ2) {
            C5923dp c5923dp = this.LIZLLL;
            if (c5923dp != null && (m15555LL = c5923dp.m15555LL()) != null) {
                m15555LL.LIZ(Boolean.TRUE);
            }
        } else {
            C5923dp c5923dp2 = this.LIZLLL;
            if (c5923dp2 != null && (LJZL = c5923dp2.LJZL()) != null) {
                LJZL.LIZ(Boolean.TRUE);
            }
        }
        LIZ("addCurrentSticker: isCloudEffect = " + LIZ2);
        LJFF();
        m15874LJ();
    }
}
