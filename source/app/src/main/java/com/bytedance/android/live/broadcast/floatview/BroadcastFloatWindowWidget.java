package com.bytedance.android.live.broadcast.floatview;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.AbstractC2866al;
import com.bytedance.android.live.broadcast.floatview.BroadcastFloatWindowManager;
import com.bytedance.android.live.broadcast.floatview.datacontext.BroadcastFloatContext;
import com.bytedance.android.live.core.tetris.widgets.LiveWidget;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.IHostContext;
import com.bytedance.android.livehostapi.foundation.depend.AbstractC5826c;
import com.bytedance.android.livesdk.C8030j;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6071r;
import com.bytedance.android.livesdk.message.model.AbstractC9021r;
import com.bytedance.android.livesdk.message.model.C8801cu;
import com.bytedance.android.livesdk.message.model.C8854es;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.sdk.bridge.p1355js.delegate.JsBridgeDelegate;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p1594ss.android.ugc.aweme.lego.experiment.LegoCommitOptExperiment;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2WC;
import p003X.C76997GXf;
import p003X.C77347GeT;
import p003X.C88856Kzi;
import p003X.C88868Kzu;
import p003X.IQX;
import p003X.L03;
import p003X.L05;
import p003X.L0D;
import p003X.L0N;
import p003X.LK5;
import p003X.M0Q;
import p003X.QB4;

/* loaded from: classes5.dex */
public final class BroadcastFloatWindowWidget extends LiveWidget implements Observer<KVData>, AbstractC2866al, AbstractC6071r, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public BroadcastFloatMessageView LIZIZ;
    public final Room LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public final Lazy f25831LJ = C77347GeT.LIZ(BroadcastFloatWindowWidget$floatContextRef$2.INSTANCE);
    public final Lazy LJFF = C77347GeT.LIZ(new BroadcastFloatWindowWidget$inflater$2(this));
    public final Lazy LJI = C77347GeT.LIZ(new BroadcastFloatWindowWidget$floatView$2(this));
    public final Lazy LJII = C77347GeT.LIZ(new BroadcastFloatWindowWidget$floatClickTipView$2(this));
    public final Lazy LJIIIIZZ = C77347GeT.LIZ(new BroadcastFloatWindowWidget$audioFloatMicView$2(this));
    public final Lazy LJIIIZ = C77347GeT.LIZ(new BroadcastFloatWindowWidget$headView$2(this));
    public final Lazy LJIIJ = C77347GeT.LIZ(new BroadcastFloatWindowWidget$appMonitorListener$2(this));
    public final Lazy LJIIJJI = C77347GeT.LIZ(new BroadcastFloatWindowWidget$anchorMicController$2(this));
    public final Lazy LJIIL = C77347GeT.LIZ(new BroadcastFloatWindowWidget$guestMicController$2(this));
    public final Lazy LJIILIIL = C77347GeT.LIZ(new BroadcastFloatWindowWidget$silenceMicController$2(this));
    public final Lazy LJIILJJIL = C77347GeT.LIZ(new BroadcastFloatWindowWidget$messageListener$2(this));
    public IMessageManager LJIILL;
    public Disposable LJIILLIIL;
    public long LJIIZILJ;

    static {
        Covode.recordClassIndex(15855);
    }

    private final SimpleDraweeView LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (SimpleDraweeView) (proxy.isSupported ? proxy.result : this.LJIIIIZZ.mo27335getValue());
    }

    private final ImageView LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return (ImageView) (proxy.isSupported ? proxy.result : this.LJIIIZ.mo27335getValue());
    }

    private final AbstractC5826c.C5827a LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return (AbstractC5826c.C5827a) (proxy.isSupported ? proxy.result : this.LJIIJ.mo27335getValue());
    }

    private final DraweeController LJIIJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return (DraweeController) (proxy.isSupported ? proxy.result : this.LJIIJJI.mo27335getValue());
    }

    private final DraweeController LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        return (DraweeController) (proxy.isSupported ? proxy.result : this.LJIIL.mo27335getValue());
    }

    private final DraweeController LJIILIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        return (DraweeController) (proxy.isSupported ? proxy.result : this.LJIILIIL.mo27335getValue());
    }

    private final OnMessageListener LJIILJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        return (OnMessageListener) (proxy.isSupported ? proxy.result : this.LJIILJJIL.mo27335getValue());
    }

    public final Pair<BroadcastFloatContext, Disposable> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (Pair) (proxy.isSupported ? proxy.result : this.f25831LJ.mo27335getValue());
    }

    /* renamed from: LJ */
    public final LayoutInflater m15902LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (LayoutInflater) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    public final ConstraintLayout LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (ConstraintLayout) (proxy.isSupported ? proxy.result : this.LJI.mo27335getValue());
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 29).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.AbstractC2866al
    public final Widget LIZIZ() {
        return this;
    }

    @Override // com.bytedance.android.live.broadcast.AbstractC2866al
    public final AbstractC6071r LIZJ() {
        return this;
    }

    public final void LJII() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported || !BroadcastFloatWindowManager.LJIIJ.LIZ().LIZIZ()) {
            return;
        }
        BroadcastFloatWindowManager.LJIIJ.LIZ().m15903LJ();
        IMessageManager iMessageManager = this.LJIILL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(LJIILJJIL());
        }
        this.dataCenter.removeObserver(this);
    }

    @Override // com.bytedance.android.live.broadcast.AbstractC2866al
    public final void LIZ() {
        C2WC<BroadcastFloatContext.FloatStatus> LJIIIIZZ;
        Disposable disposable;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        BroadcastFloatWindowManager LIZ2 = BroadcastFloatWindowManager.LJIIJ.LIZ();
        if (!PatchProxy.proxy(new Object[0], LIZ2, BroadcastFloatWindowManager.LIZ, false, 9).isSupported) {
            Disposable disposable2 = LIZ2.LJI;
            if (disposable2 != null && !disposable2.isDisposed() && (disposable = LIZ2.LJI) != null) {
                disposable.dispose();
            }
            BroadcastFloatContext LIZ3 = C88868Kzu.LIZ();
            if (LIZ3 != null && (LJIIIIZZ = LIZ3.LJIIIIZZ()) != null) {
                LJIIIIZZ.LIZ(BroadcastFloatContext.FloatStatus.DESTROY);
            }
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        BroadcastFloatContext LIZ2;
        C2WC<BroadcastFloatContext.FloatStatus> LJIIIIZZ;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        super.onCreate();
        IQX.LIZ(LIZLLL().getFirst(), "BroadcastFloatContext");
        QB4.LIZ(LIZLLL().getFirst().LJIIIIZZ().LIZIZ(), new BroadcastFloatWindowWidget$onCreate$1(this));
        C8030j.LIZLLL.LIZ().LIZ(LJIIJ());
        if (!PatchProxy.proxy(new Object[0], BroadcastFloatWindowManager.LJIIJ.LIZ(), BroadcastFloatWindowManager.LIZ, false, 8).isSupported && (LIZ2 = C88868Kzu.LIZ()) != null && (LJIIIIZZ = LIZ2.LJIIIIZZ()) != null) {
            LJIIIIZZ.LIZ(BroadcastFloatContext.FloatStatus.INIT);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        if (!LIZLLL().getSecond().isDisposed()) {
            LIZLLL().getSecond().dispose();
        }
        LJII();
        BroadcastFloatWindowManager LIZ2 = BroadcastFloatWindowManager.LJIIJ.LIZ();
        if (!PatchProxy.proxy(new Object[0], LIZ2, BroadcastFloatWindowManager.LIZ, false, 7).isSupported) {
            for (BroadcastFloatWindowManager.Companion.BroadcastAudioFloatViewConfig broadcastAudioFloatViewConfig : BroadcastFloatWindowManager.Companion.BroadcastAudioFloatViewConfig.valuesCustom()) {
                C88856Kzi LIZIZ = LIZ2.LIZIZ(broadcastAudioFloatViewConfig);
                if (LIZIZ != null) {
                    LIZIZ.LIZLLL();
                }
            }
        }
        C8030j.LIZLLL.LIZ().LIZIZ(LJIIJ());
        super.onDestroy();
    }

    public final void LJI() {
        Object mo27335getValue;
        Notification notification;
        NotificationManagerCompat notificationManagerCompat;
        C2WC<BroadcastFloatContext.FloatStatus> LJIIIIZZ;
        BroadcastFloatMessageView broadcastFloatMessageView;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported || !BroadcastFloatWindowManager.LJIIJ.LIZ().LIZ(this.LIZJ) || BroadcastFloatWindowManager.LJIIJ.LIZ().LIZIZ()) {
            return;
        }
        if (this.LIZIZ == null) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 26);
            if (proxy.isSupported) {
                broadcastFloatMessageView = (BroadcastFloatMessageView) proxy.result;
            } else {
                View LIZ2 = C116971W2r.LIZ(m15902LJ(), 2131699748, (ViewGroup) null, false);
                if (!(LIZ2 instanceof BroadcastFloatMessageView)) {
                    LIZ2 = null;
                }
                broadcastFloatMessageView = (BroadcastFloatMessageView) LIZ2;
                if (broadcastFloatMessageView != null) {
                    broadcastFloatMessageView.setAdapter(new L0D());
                }
            }
            this.LIZIZ = broadcastFloatMessageView;
        }
        ConstraintLayout LJFF = LJFF();
        BroadcastFloatMessageView broadcastFloatMessageView2 = this.LIZIZ;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy2.isSupported) {
            mo27335getValue = proxy2.result;
        } else {
            mo27335getValue = this.LJII.mo27335getValue();
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) mo27335getValue;
        if (LJFF != null && broadcastFloatMessageView2 != null && constraintLayout != null) {
            LIZIZ(this.LIZJ.getOwner(), true);
            BroadcastFloatWindowManager LIZ3 = BroadcastFloatWindowManager.LJIIJ.LIZ();
            if (!PatchProxy.proxy(new Object[]{LJFF, broadcastFloatMessageView2, constraintLayout}, LIZ3, BroadcastFloatWindowManager.LIZ, false, 4).isSupported) {
                C106862S5w.LIZ(LJFF, broadcastFloatMessageView2, constraintLayout);
                BroadcastFloatContext LIZ4 = C88868Kzu.LIZ();
                if (LIZ4 != null && (LJIIIIZZ = LIZ4.LJIIIIZZ()) != null) {
                    LJIIIIZZ.LIZ(BroadcastFloatContext.FloatStatus.SHOWING);
                }
                LIZ3.f25828LJ = constraintLayout;
                LIZ3.LJFF = broadcastFloatMessageView2;
                constraintLayout.getLayoutParams();
                LIZ3.LIZ(BroadcastFloatWindowManager.Companion.BroadcastAudioFloatViewConfig.TAG_BROADCAST_FLOAT_VIEW, LJFF);
                if (LIZ3.LIZIZ == null) {
                    LIZ3.LIZIZ = NotificationManagerCompat.from(LJFF.getContext());
                }
                Context context = LJFF.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{context}, LIZ3, BroadcastFloatWindowManager.LIZ, false, 20);
                if (proxy3.isSupported) {
                    notification = (Notification) proxy3.result;
                } else if (LIZ3.LIZLLL != null) {
                    notification = LIZ3.LIZLLL;
                } else {
                    if (LIZ3.LIZJ == null) {
                        Object systemService = context.getSystemService("notification");
                        if (systemService != null) {
                            LIZ3.LIZJ = (NotificationManager) systemService;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
                        }
                    }
                    NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "BroadcastFloatWindow.notification");
                    builder.setSmallIcon(((IHostContext) ServiceManager.getService(IHostContext.class)).appIcon());
                    builder.setContentTitle(LK5.LIZ(2131582314));
                    builder.setPriority(0);
                    builder.setOngoing(true);
                    builder.setWhen(System.currentTimeMillis());
                    builder.setOnlyAlertOnce(true);
                    builder.setAutoCancel(true);
                    builder.setOngoing(true);
                    builder.setContentIntent(LIZ3.LIZIZ(context));
                    if (Build.VERSION.SDK_INT >= 26) {
                        NotificationChannel notificationChannel = new NotificationChannel("BroadcastFloatWindow.notification", LK5.LIZ(2131582313), 3);
                        NotificationManager notificationManager = LIZ3.LIZJ;
                        if (notificationManager != null) {
                            notificationManager.createNotificationChannel(notificationChannel);
                        }
                    }
                    LIZ3.LIZLLL = builder.build();
                    notification = LIZ3.LIZLLL;
                }
                if (notification != null && (notificationManagerCompat = LIZ3.LIZIZ) != null) {
                    notificationManagerCompat.notify(2131181110, notification);
                }
            }
            if (this.LJIILL == null) {
                this.LJIILL = (IMessageManager) this.dataCenter.get("data_message_manager", (String) null);
            }
            this.dataCenter.observeForever("data_normal_gift_end_event", this);
            IMessageManager iMessageManager = this.LJIILL;
            if (iMessageManager != null) {
                iMessageManager.addMessageListener(MessageType.CHAT.LIZ(), LJIILJJIL());
                iMessageManager.addMessageListener(MessageType.MEMBER.LIZ(), LJIILJJIL());
                iMessageManager.addMessageListener(MessageType.REMIND.LIZ(), LJIILJJIL());
                iMessageManager.addMessageListener(MessageType.CONTROL.LIZ(), LJIILJJIL());
                iMessageManager.addMessageListener(MessageType.GIFT.LIZ(), LJIILJJIL());
                iMessageManager.addMessageListener(MessageType.FREE_CELL_GIFT_MESSAGE.LIZ(), LJIILJJIL());
                iMessageManager.addMessageListener(MessageType.DOODLE_GIFT.LIZ(), LJIILJJIL());
                iMessageManager.addMessageListener(MessageType.SCREEN.LIZ(), LJIILJJIL());
            }
        }
    }

    public final void LIZ(L05<AbstractC9021r> l05) {
        BroadcastFloatMessageView broadcastFloatMessageView;
        if (!PatchProxy.proxy(new Object[]{l05}, this, LIZ, false, 28).isSupported && (broadcastFloatMessageView = this.LIZIZ) != null) {
            broadcastFloatMessageView.LIZ(l05);
        }
    }

    public final DraweeController LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 23);
        if (proxy.isSupported) {
            return (DraweeController) proxy.result;
        }
        AbstractDraweeController mo27965build = Fresco.newDraweeControllerBuilder().mo27963setUri(str).setAutoPlayAnimations(true).mo27965build();
        Intrinsics.checkNotNullExpressionValue(mo27965build, "");
        return mo27965build;
    }

    public BroadcastFloatWindowWidget(Room room) {
        C106862S5w.LIZ(room);
        this.LIZJ = room;
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZ, false, 27).isSupported && C88868Kzu.LIZIZ() == BroadcastFloatContext.FloatStatus.SHOWING && kVData2 != null && !TextUtils.isEmpty(kVData2.getKey()) && Intrinsics.areEqual(kVData2.getKey(), "data_normal_gift_end_event")) {
            L0N l0n = (L0N) kVData2.getData();
            if (isViewValid() && l0n != null && !l0n.LJIIJJI) {
                User user = l0n.LIZ;
                String str = l0n.LIZIZ;
                long j = l0n.LIZJ;
                if (str != null && user != null) {
                    C8801cu c8801cu = new C8801cu();
                    c8801cu.LIZ = user;
                    c8801cu.LIZJ = str;
                    c8801cu.LIZIZ = j;
                    Object obj = this.dataCenter.get("data_room_id");
                    Intrinsics.checkNotNull(obj);
                    c8801cu.LJIIIIZZ = ((Number) obj).longValue();
                    c8801cu.baseMessage = l0n.LJIIJ;
                    LIZ(new C3015i(l0n, c8801cu));
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC6071r
    public final void LIZ(List<LinkPlayerInfo> list) {
        if (!PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 20).isSupported && C88868Kzu.LIZIZ() == BroadcastFloatContext.FloatStatus.SHOWING && list != null && list.size() > 0 && this.LIZIZ != null && list != null) {
            C3016j c3016j = new C3016j(new C8854es());
            c3016j.LIZIZ = list.size();
            LIZ(c3016j);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC6071r
    public final void LIZ(long j, boolean z) {
        if (!PatchProxy.proxy(new Object[]{new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 18).isSupported && j == ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ()) {
            this.LIZLLL = z;
        }
    }

    public final void LIZIZ(User user, boolean z) {
        Disposable disposable;
        DraweeController LJIIL;
        ImageModel imageModel;
        if (PatchProxy.proxy(new Object[]{user, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 21).isSupported || System.currentTimeMillis() - this.LJIIZILJ < JsBridgeDelegate.GET_URL_OUT_TIME) {
            return;
        }
        if (!z) {
            this.LJIIZILJ = System.currentTimeMillis();
        }
        ImageView LJIIIZ = LJIIIZ();
        if (LJIIIZ != null) {
            if (user != null) {
                imageModel = user.getAvatarThumb();
            } else {
                imageModel = null;
            }
            M0Q.LIZIZ(LJIIIZ, imageModel);
        }
        SimpleDraweeView LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null) {
            if (z) {
                if (this.LIZLLL) {
                    LJIIL = LJIILIIL();
                } else {
                    LJIIL = LJIIJJI();
                }
            } else {
                LJIIL = LJIIL();
            }
            if (!Intrinsics.areEqual(LJIIIIZZ.getController(), LJIIL)) {
                LJIIIIZZ.setController(LJIIL);
            }
        }
        Disposable disposable2 = this.LJIILLIIL;
        if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.LJIILLIIL) != null) {
            disposable.dispose();
        }
        if (z) {
            return;
        }
        this.LJIILLIIL = Observable.timer(LegoCommitOptExperiment.BOOT_FINISH_DELAY_TIME, TimeUnit.MILLISECONDS).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new L03(this), C76997GXf.LIZIZ);
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC6071r
    public final void LIZ(User user, boolean z) {
        Long l;
        if (!PatchProxy.proxy(new Object[]{user, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 19).isSupported && C88868Kzu.LIZIZ() == BroadcastFloatContext.FloatStatus.SHOWING && z) {
            Long l2 = null;
            if (user != null) {
                l = Long.valueOf(user.getId());
            } else {
                l = null;
            }
            User owner = this.LIZJ.getOwner();
            if (owner != null) {
                l2 = Long.valueOf(owner.getId());
            }
            LIZIZ(user, Intrinsics.areEqual(l, l2));
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC6071r
    public final void LIZ(String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 17).isSupported || C88868Kzu.LIZIZ() != BroadcastFloatContext.FloatStatus.SHOWING) {
            return;
        }
        LIZIZ(this.LIZJ.getOwner(), true);
    }
}
