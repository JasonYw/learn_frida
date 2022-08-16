package com.bytedance.android.live.playtogether.widget;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.monitor.LiveTracingMonitor;
import com.bytedance.android.live.playtogether.AbstractC5189b;
import com.bytedance.android.live.playtogether.AbstractC5191c;
import com.bytedance.android.live.playtogether.AbstractC5233d;
import com.bytedance.android.live.playtogether.p408b.C5190a;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.widget.RoomRecyclableWidget;
import com.bytedance.android.livesdk.user.C9284h;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC413392Xt;
import p003X.AbstractC413402Xu;
import p003X.AbstractC426192th;
import p003X.AbstractC4569445g;
import p003X.AbstractC81278I1w;
import p003X.C100839PnV;
import p003X.C2WC;
import p003X.C3VF;
import p003X.C77007GXp;
import p003X.C87010KQi;
import p003X.C89641LTn;
import p003X.C89649LTv;
import p003X.C89650LTw;
import p003X.C89651LTx;
import p003X.C89652LTy;
import p003X.C89653LTz;
import p003X.GZN;
import p003X.LTR;
import p003X.LU1;
import p003X.LU2;
import p003X.LU3;

/* loaded from: classes5.dex */
public final class PlayTogetherWidget extends RoomRecyclableWidget implements AbstractC4569445g, OnMessageListener {
    public static ChangeQuickRedirect LIZ;
    public AbstractC5189b LIZIZ;
    public AbstractC5191c LIZJ;
    public AbstractC5233d LIZLLL;

    /* renamed from: LJ */
    public final long f26553LJ;
    public final LU3 LJFF;

    static {
        Covode.recordClassIndex(33203);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onDestroy();
        AbstractC5189b abstractC5189b = this.LIZIZ;
        if (abstractC5189b != null) {
            abstractC5189b.LIZ();
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        ALogger.m15797i("Together#PlayTogetherWidget", "release listener");
        this.LIZLLL = null;
    }

    public PlayTogetherWidget() {
        LU3 c89651LTx;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, C89651LTx.LIZ, true, 2);
        if (proxy.isSupported) {
            c89651LTx = (LU3) proxy.result;
        } else {
            LU1 lu1 = new LU1((byte) 0);
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], lu1, LU1.LIZ, false, 1);
            if (proxy2.isSupported) {
                c89651LTx = (LU3) proxy2.result;
            } else {
                if (lu1.LIZIZ == null) {
                    lu1.LIZIZ = new LU2();
                }
                if (lu1.LIZJ == null) {
                    lu1.LIZJ = new LTR();
                }
                c89651LTx = new C89651LTx(lu1, (byte) 0);
            }
        }
        this.LJFF = c89651LTx;
        this.f26553LJ = System.currentTimeMillis();
        this.LJFF.LIZ(this);
    }

    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (PatchProxy.proxy(new Object[]{iMessage}, this, LIZ, false, 8).isSupported) {
            return;
        }
        AbstractC5191c abstractC5191c = this.LIZJ;
        if (abstractC5191c != null) {
            abstractC5191c.onMessage(iMessage);
        }
        AbstractC5189b abstractC5189b = this.LIZIZ;
        if (abstractC5189b != null) {
            abstractC5189b.onMessage(iMessage);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        AbstractC426192th<Object> LLLII;
        Observable<Object> LIZIZ;
        AbstractC426192th<Long> LLLI;
        Observable<Long> LIZIZ2;
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C5923dp roomContext = getRoomContext();
        if (roomContext != null && (LLLI = roomContext.LLLI()) != null && (LIZIZ2 = LLLI.LIZIZ()) != null) {
            LIZIZ2.subscribe(new C89652LTy(this));
        }
        C5923dp roomContext2 = getRoomContext();
        if (roomContext2 != null && (LLLII = roomContext2.LLLII()) != null && (LIZIZ = LLLII.LIZIZ()) != null) {
            LIZIZ.subscribe(new C89641LTn(this));
        }
        ((AbstractC81278I1w) C87010KQi.LIZ().LIZ(C5190a.class).m151as(autoDispose())).LIZ(new C89649LTv(this));
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        AbstractC413392Xt<IMessageManager> LJIILLIIL;
        IMessageManager LIZIZ;
        AbstractC413392Xt<IMessageManager> LJIILLIIL2;
        IMessageManager LIZIZ2;
        AbstractC413392Xt<IMessageManager> LJIILLIIL3;
        IMessageManager LIZIZ3;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        C5923dp roomContext;
        C2WC<Room> LIZ2;
        Room LIZ3;
        AbstractC5189b abstractC5189b;
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C5923dp roomContext2 = getRoomContext();
        if (roomContext2 != null && (LJIILJJIL = roomContext2.LJIILJJIL()) != null && LJIILJJIL.LIZIZ().booleanValue() && (roomContext = getRoomContext()) != null && (LIZ2 = roomContext.LIZ()) != null && (LIZ3 = LIZ2.LIZ()) != null && LIZ3.isScreenshot && (abstractC5189b = this.LIZIZ) != null) {
            abstractC5189b.LIZ(this);
        }
        C5923dp roomContext3 = getRoomContext();
        if (roomContext3 != null && (LJIILLIIL3 = roomContext3.LJIILLIIL()) != null && (LIZIZ3 = LJIILLIIL3.LIZIZ()) != null) {
            LIZIZ3.addMessageListener(MessageType.PLAY_TOGETHER_AUDIENCE_CHANGED_MESSAGE.LIZ(), this);
        }
        C5923dp roomContext4 = getRoomContext();
        if (roomContext4 != null && (LJIILLIIL2 = roomContext4.LJIILLIIL()) != null && (LIZIZ2 = LJIILLIIL2.LIZIZ()) != null) {
            LIZIZ2.addMessageListener(MessageType.PLAY_TOGETHER_INVITED_JOIN_MESSAGE.LIZ(), this);
        }
        C5923dp roomContext5 = getRoomContext();
        if (roomContext5 != null && (LJIILLIIL = roomContext5.LJIILLIIL()) != null && (LIZIZ = LJIILLIIL.LIZIZ()) != null) {
            LIZIZ.addMessageListener(MessageType.PLAY_TOGETHER_SERVICE_STATUS_CHANGED_MESSAGE.LIZ(), this);
        }
    }

    public final void LIZ(Long l) {
        long j;
        Observable<AbstractC5233d> LIZ2;
        Observable<R> compose;
        AbstractC81278I1w abstractC81278I1w;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        if (PatchProxy.proxy(new Object[]{l}, this, LIZ, false, 1).isSupported) {
            return;
        }
        if (!((IUserService) ServiceManager.getService(IUserService.class)).user().LIZLLL()) {
            ALogger.m15797i("Together#PlayTogetherWidget", "openPlayTogetherPanel not login");
            ((AbstractC81278I1w) ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ(this.context, C9284h.LIZ().LIZ()).observeOn(AndroidSchedulers.mainThread()).m151as(autoDispose())).LIZ(new C89653LTz(this, l), C77007GXp.LIZIZ);
        } else if (this.dataCenter == null) {
            ALogger.m15800e("Together#PlayTogetherWidget", "dataCenter is Null");
        } else {
            C5923dp roomContext = getRoomContext();
            Boolean bool = null;
            if (roomContext != null && (LJIILJJIL = roomContext.LJIILJJIL()) != null) {
                bool = LJIILJJIL.LIZIZ();
            }
            Boolean bool2 = (Boolean) this.dataCenter.get("data_is_portrait", (String) Boolean.TRUE);
            ALogger.m15797i("Together#PlayTogetherWidget", "openPlayTogetherPanel isAnchor: " + bool + " ,play_id: " + l + ", isVertical: " + bool2);
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                AbstractC5189b abstractC5189b = this.LIZIZ;
                if (abstractC5189b != null) {
                    Context context = this.context;
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    LIZ2 = abstractC5189b.LIZ(context);
                } else {
                    return;
                }
            } else {
                AbstractC5191c abstractC5191c = this.LIZJ;
                if (abstractC5191c == null) {
                    return;
                }
                Context context2 = this.context;
                Intrinsics.checkNotNullExpressionValue(context2, "");
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                Intrinsics.checkNotNullExpressionValue(bool2, "");
                boolean booleanValue = bool2.booleanValue();
                DataCenter dataCenter = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter, "");
                LIZ2 = abstractC5191c.LIZ(context2, j, booleanValue, dataCenter);
            }
            if (LIZ2 != null && (compose = LIZ2.compose(C100839PnV.LIZJ())) != 0 && (abstractC81278I1w = (AbstractC81278I1w) compose.m151as(autoDispose())) != null) {
                abstractC81278I1w.LIZ(new C89650LTw(this), GZN.LIZIZ);
            }
        }
    }

    public final void LIZ(String str, Map<String, String> map) {
        String str2;
        String str3;
        C3VF user;
        C2WC<Room> LIZ2;
        Room LIZ3;
        C2WC<User> LIZIZ;
        User LIZ4;
        if (PatchProxy.proxy(new Object[]{str, map}, this, LIZ, false, 5).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject(map);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C5923dp roomContext = getRoomContext();
        Long l = null;
        if (roomContext != null && (LIZIZ = roomContext.LIZIZ()) != null && (LIZ4 = LIZIZ.LIZ()) != null) {
            str2 = LIZ4.getIdStr();
        } else {
            str2 = null;
        }
        jSONObject3.put("anchor_id", String.valueOf(str2));
        C5923dp roomContext2 = getRoomContext();
        if (roomContext2 != null && (LIZ2 = roomContext2.LIZ()) != null && (LIZ3 = LIZ2.LIZ()) != null) {
            str3 = LIZ3.getIdStr();
        } else {
            str3 = null;
        }
        jSONObject3.put("room_id", String.valueOf(str3));
        IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
        if (iUserService != null && (user = iUserService.user()) != null) {
            l = Long.valueOf(user.LIZIZ());
        }
        jSONObject3.put("user_id", String.valueOf(l));
        LiveTracingMonitor.LIZ(str, LiveTracingMonitor.EventModule.GAME_PLAY_TOGETHER, LiveTracingMonitor.EventType.BUSSINESS_API_CALL, jSONObject, jSONObject2, jSONObject3);
    }
}
