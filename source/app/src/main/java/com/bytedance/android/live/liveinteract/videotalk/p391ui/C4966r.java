package com.bytedance.android.live.liveinteract.videotalk.p391ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alipay.sdk.app.OpenAuthTask;
import com.alipay.sdk.p082m.p121u.C1399n;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.chatroom.p340c.C4274a;
import com.bytedance.android.live.liveinteract.bid.AbstractC4289e;
import com.bytedance.android.live.liveinteract.bid.C4287a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p345a.C4300c;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p353ui.SeatAnimationView;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p354vm.C4378a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.C4369e;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.C4377t;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.C4374l;
import com.bytedance.android.live.liveinteract.multianchor.model.LinkmicPositionItem;
import com.bytedance.android.live.liveinteract.plantform.api.LinkAnchorApi;
import com.bytedance.android.live.liveinteract.plantform.api.LinkApi;
import com.bytedance.android.live.liveinteract.plantform.core.C4806x;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah;
import com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4847b;
import com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4848n;
import com.bytedance.android.live.liveinteract.videotalk.adapter.C4843x241de2a0;
import com.bytedance.android.live.liveinteract.videotalk.adapter.C4844x18c43493;
import com.bytedance.android.live.liveinteract.videotalk.adapter.C4849s;
import com.bytedance.android.live.liveinteract.videotalk.battle.C4891b;
import com.bytedance.android.live.liveinteract.videotalk.battle.j$a;
import com.bytedance.android.live.liveinteract.videotalk.p388c.AbstractC4912d;
import com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m;
import com.bytedance.android.live.liveinteract.videotalk.quickinteract.AbstractC4936a;
import com.bytedance.android.live.liveinteract.videotalk.quickinteract.C4939e;
import com.bytedance.android.live.liveinteract.videotalk.utils.C4967h;
import com.bytedance.android.live.liveinteract.view.PositionNameTv;
import com.bytedance.android.live.liveinteract.voicechat.emoji.EPointF;
import com.bytedance.android.live.liveinteract.voicechat.emoji.c$b;
import com.bytedance.android.live.liveinteract.voicechat.match.C5074d;
import com.bytedance.android.live.liveinteract.voicechat.match.ChatMatchWidget;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.event.C5986ap;
import com.bytedance.android.livesdk.chatroom.event.C6008ch;
import com.bytedance.android.livesdk.chatroom.interact.model.C6062s;
import com.bytedance.android.livesdk.chatroom.model.interact.C6166j;
import com.bytedance.android.livesdk.config.C6840aw;
import com.bytedance.android.livesdk.config.C6924de;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.ktvapi.C8059n;
import com.bytedance.android.livesdk.ktvapi.IKtvService;
import com.bytedance.android.livesdk.message.model.BidPaidLinkmicStatus;
import com.bytedance.android.livesdk.message.model.C8851ep;
import com.bytedance.android.livesdk.message.model.C9028x;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.depend.model.live.audio.VoiceLiveTheme;
import com.bytedance.android.livesdkapi.message.C9605p;
import com.bytedance.android.livesdkapi.model.C9627at;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.imagepipeline.postprocessors.IterativeBoxBlurPostProcessor;
import com.p1594ss.avframework.livestreamv2.core.ILayerControl;
import com.p1594ss.avframework.livestreamv2.core.ILayerControlExt;
import com.p1594ss.avframework.livestreamv2.core.LiveCore;
import com.p1594ss.avframework.mixer.VideoMixer;
import com.p1594ss.avframework.utils.TEBundle;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.p3021tt.miniapp.debug.devtool.BdpDebugHttpRequest;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONArray;
import p002O.C0002O;
import p003X.AbstractC413392Xt;
import p003X.AbstractC426192th;
import p003X.AbstractC434073Fh;
import p003X.AbstractC78986HBs;
import p003X.AbstractC81278I1w;
import p003X.AbstractC81935IRd;
import p003X.AnonymousClass189;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C148062fT6;
import p003X.C149557frI;
import p003X.C149592frr;
import p003X.C2WC;
import p003X.C3801313v;
import p003X.C4313534v;
import p003X.C440683by;
import p003X.C4572346j;
import p003X.C467794eb;
import p003X.C4A3;
import p003X.C77917Gnf;
import p003X.C77919Gnh;
import p003X.C78136GrC;
import p003X.C78140GrG;
import p003X.C78336GuQ;
import p003X.C78352Gug;
import p003X.C78538Gxg;
import p003X.C78613Gyt;
import p003X.C78616Gyw;
import p003X.C78828H5q;
import p003X.C78832H5u;
import p003X.C79007HCn;
import p003X.C79046HEa;
import p003X.C79078HFg;
import p003X.C79197HJv;
import p003X.C79234HLg;
import p003X.C79242HLo;
import p003X.C79268HMo;
import p003X.C79400HRq;
import p003X.C80302Hl2;
import p003X.C80312HlC;
import p003X.C80318HlI;
import p003X.C80592Hpi;
import p003X.C80647Hqb;
import p003X.C80655Hqj;
import p003X.C80656Hqk;
import p003X.C80668Hqw;
import p003X.C80681Hr9;
import p003X.C80686HrE;
import p003X.C80726Hrs;
import p003X.C80731Hrx;
import p003X.C80736Hs2;
import p003X.C80766HsW;
import p003X.C80783Hsn;
import p003X.C80819HtN;
import p003X.C80840Hti;
import p003X.C80854Htw;
import p003X.C80863Hu5;
import p003X.C80873HuF;
import p003X.C80900Hug;
import p003X.C80945HvP;
import p003X.C80967Hvl;
import p003X.C80971Hvp;
import p003X.C80991Hw9;
import p003X.C80995HwD;
import p003X.C81052Hx8;
import p003X.C81178HzA;
import p003X.C87010KQi;
import p003X.C88306Kqq;
import p003X.DialogC77870Gmu;
import p003X.DialogC77887GnB;
import p003X.H1U;
import p003X.HKN;
import p003X.IOU;
import p003X.IQV;
import p003X.KDS;
import p003X.LK1;
import p003X.LK5;
import p003X.M0O;
import p003X.M0Q;
import p003X.QB4;
import p003X.RunnableC80813HtH;
import p003X.RunnableC80871HuD;
import p003X.RunnableC81019Hwb;
import p003X.View$OnAttachStateChangeListenerC80676Hr4;
import p003X.ViewTreeObserver$OnGlobalLayoutListenerC80856Hty;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.ui.r */
/* loaded from: classes3.dex */
public class C4966r implements LifecycleOwner, AbstractC4848n, j$a, AbstractC4936a.AbstractC4937a, AbstractC4964m, c$b, OnMessageListener {
    public static ChangeQuickRedirect LJIIJJI;
    public FrameLayout LIZ;
    public View LIZIZ;
    public HSImageView LIZJ;
    public HSImageView LIZLLL;

    /* renamed from: LJ */
    public SeatAnimationView f26459LJ;
    public DialogFragment LJI;
    public IMessageManager LJII;
    public final C149557frI LJIIIIZZ;
    public SurfaceView LJIIL;
    public FrameLayout LJIILIIL;
    public RecyclerView LJIILJJIL;
    public PositionNameTv LJIILL;
    public AbstractC4847b LJIILLIIL;
    public C4374l LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJJ;
    public C80318HlI LJIJJLI;
    public ClipImageView LJJI;
    public C4300c LJJIFFI;
    public C81178HzA LJJII;
    public C4377t LJJIII;
    public C4369e LJJIIJ;
    public boolean LJJIIJZLJL;
    public final C149592frr LJJIIZ;
    public int LJJIJ;
    public int LJJIJIIJI;
    public H1U LJJIJIL;
    public List<LinkPlayerInfo> LJJIL;
    public HashMap<String, Boolean> LJJIZ;
    public final Room LJJJ;
    public final boolean LJJJI;
    public final ConstraintLayout LJJJIL;
    public final Context LJJJJ;
    public final DataCenter LJJJJI;
    public final LifecycleOwner LJJJJIZL;
    public final AbstractC4964m.AbstractC4965a LJJJJJ;
    public final AbstractC5436a LJJJJJL;
    public final View LJJJJL;
    public boolean LJJJJLI;
    public long LJJJJZ;
    public final GestureDetector LJJJLL;
    public final int LJJLIIIJJI;
    public final Observer<VoiceLiveTheme> LJJLIIIJJIZ;
    public final boolean LJJLIIIJL;
    public final Lazy LJFF = LazyKt__LazyJVMKt.lazy(new VideoCameraRoomWindowManagerV2$mPaidLogHelper$2(this));
    public CompositeDisposable LJIJI = new CompositeDisposable();
    public final HashMap<String, Boolean> LJIIIZ = new HashMap<>();
    public final HashMap<String, Integer> LJIL = new HashMap<>();
    public final HashMap<String, Integer> LJJ = new HashMap<>();
    public HashMap<String, String> LJIIJ = new HashMap<>();
    public final ArrayList<LinkmicPositionItem> LJJIIZI = new ArrayList<>();
    public final C467794eb LJJJJLL = new C467794eb(LK1.LIZLLL(2), new ColorDrawable(LK5.LIZIZ(2131628537)));
    public final String LJJJJZI = C0002O.m25085C("https://", C4313534v.LIZIZ(), "/obj/live-android/video_achor_leave_bg.png");
    public final ViewTreeObserver.OnGlobalLayoutListener LJJIJIIJIL = new ViewTreeObserver$OnGlobalLayoutListenerC80856Hty(this);
    public final Rect LJJJLIIL = new Rect();
    public final boolean LJJIJL = LJJ();
    public final String LJJIJLIJ = "videocamera_wm";
    public final Observer<KVData> LJJJLZIJ = new C80873HuF(this);
    public final C80647Hqb LJJJZ = new C80647Hqb(this);
    public final Observer<BidPaidLinkmicStatus> LJJL = new C80726Hrs(this);
    public final Observer<C9028x> LJJLI = new C80783Hsn(this);
    public final Observer<List<LinkmicPositionItem>> LJJLIIIIJ = new C80766HsW(this);
    public final WeakReference<Observer<Integer>> LJJLIIIJ = new WeakReference<>(new C80656Hqk(this));
    public final Observer<C6062s> LJJLIIIJILLIZJL = new C80840Hti(this);

    static {
        Covode.recordClassIndex(30564);
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4848n
    public final int LIZ() {
        return 0;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4848n
    public final void LIZ(int i, LinkPlayerInfo linkPlayerInfo) {
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4848n
    public final void LIZIZ(int i, LinkPlayerInfo linkPlayerInfo) {
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.emoji.c$b
    public final boolean LIZIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LJIIJJI, false, 139);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return true;
    }

    /* renamed from: LJ */
    public int mo15678LJ(int i, int i2) {
        return i;
    }

    /* renamed from: LJ */
    public boolean mo15677LJ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LJIIJJI, false, 143);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.emoji.c$b
    public final boolean LJIIZILJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 138);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.battle.j$a
    public final void LJIJJ() {
        boolean z = PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 142).isSupported;
    }

    public boolean LJJ() {
        return true;
    }

    public int LJJIFFI() {
        return 10;
    }

    public final C4967h LJJIIJZLJL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 1);
        return (C4967h) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    public int LJJIJLIJ() {
        return 8;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.battle.j$a
    public final boolean LJFF() {
        return this.LJJIIJZLJL;
    }

    public AbstractC4912d LJII() {
        return C79078HFg.LJII;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m
    public final SurfaceView LJIIIIZZ() {
        return this.LJIIL;
    }

    public C80647Hqb LJIJJLI() {
        return this.LJJJZ;
    }

    public GestureDetector LJIL() {
        return this.LJJJLL;
    }

    public int LJJJ() {
        return this.LJJLIIIJJI;
    }

    public boolean LJJJJ() {
        return this.LJJLIIIJL;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.emoji.c$b
    public final boolean LIZ(EPointF ePointF, EPointF ePointF2, EPointF ePointF3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ePointF, ePointF2, ePointF3}, this, LJIIJJI, false, 140);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(ePointF, ePointF2, ePointF3);
        return C80592Hpi.LIZ(this, ePointF, ePointF2, ePointF3);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.emoji.c$b
    public final boolean LIZIZ(EPointF ePointF, EPointF ePointF2, EPointF ePointF3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ePointF, ePointF2, ePointF3}, this, LJIIJJI, false, 141);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(ePointF, ePointF2, ePointF3);
        return C80592Hpi.LIZIZ(this, ePointF, ePointF2, ePointF3);
    }

    public void LIZIZ(boolean z) {
        AbstractC4847b abstractC4847b;
        boolean z2 = false;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LJIIJJI, false, 6).isSupported && (abstractC4847b = this.LJIILLIIL) != null) {
            for (LinkPlayerInfo linkPlayerInfo : abstractC4847b.LIZ()) {
                if (!TextUtils.isEmpty(linkPlayerInfo.LIZLLL()) && linkPlayerInfo.LJJJJLI != z) {
                    linkPlayerInfo.LJJJJLI = z;
                    z2 = true;
                }
            }
            if (!z2) {
                return;
            }
            abstractC4847b.notifyDataSetChanged();
        }
    }

    public void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LJIIJJI, false, 7).isSupported) {
            return;
        }
        if (z) {
            View view = this.LIZIZ;
            if (view != null) {
                LK1.LIZJ(view);
            }
            User owner = this.LJJJ.getOwner();
            C4572346j LIZ = M0O.LIZ(owner != null ? owner.getAvatarMedium() : null);
            LIZ.LIZ(new IterativeBoxBlurPostProcessor(4, 20));
            LIZ.LIZ(this.LIZJ);
            return;
        }
        View view2 = this.LIZIZ;
        if (view2 == null) {
            return;
        }
        LK1.LIZ(view2);
    }

    public final void LIZ(List<? extends LinkPlayerInfo> list, int i) {
        LinkPlayerInfo linkPlayerInfo;
        if (PatchProxy.proxy(new Object[]{list, Integer.valueOf(i)}, this, LJIIJJI, false, 15).isSupported || list == null || (linkPlayerInfo = list.get(i)) == null) {
            return;
        }
        linkPlayerInfo.LJJJJIZL = LinkmicPositionItem.LinkmicPositionStatus.BIDPAID.ordinal();
    }

    public void LIZ(View view) {
        MethodCollector.m14708i(2051);
        if (PatchProxy.proxy(new Object[]{view}, this, LJIIJJI, false, 26).isSupported) {
            MethodCollector.m14707o(2051);
            return;
        }
        C106862S5w.LIZ(view);
        if (C79242HLo.LJIIIZ()) {
            FrameLayout frameLayout = this.LJIILIIL;
            if (frameLayout != null) {
                frameLayout.addView(view);
            }
            LJJJJLI();
            MethodCollector.m14707o(2051);
            return;
        }
        view.setLayoutParams(LIZIZ(view));
        FrameLayout frameLayout2 = this.LIZ;
        if (frameLayout2 != null) {
            frameLayout2.removeAllViews();
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        FrameLayout frameLayout3 = this.LIZ;
        if (frameLayout3 != null) {
            frameLayout3.addView(view);
        }
        FrameLayout frameLayout4 = this.LIZ;
        if (frameLayout4 == null) {
            MethodCollector.m14707o(2051);
            return;
        }
        frameLayout4.setVisibility(0);
        MethodCollector.m14707o(2051);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r0.LIZIZ == r6.LJJJ.ownerUserId) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void LIZ(com.bytedance.android.livesdk.message.model.OrderInfo r7) {
        /*
            r6 = this;
            r5 = 1
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r2 = 0
            r3[r2] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.videotalk.p391ui.C4966r.LJIIJJI
            r0 = 28
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r6, r1, r2, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L13
            return
        L13:
            if (r7 == 0) goto L2e
            com.bytedance.android.livesdk.message.model.InteractiveSongUserInfo r0 = r7.LIZIZ
            if (r0 == 0) goto L3a
            long r3 = r0.LIZIZ
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r6.LJJJ
            long r1 = r0.ownerUserId
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L3a
        L23:
            r1 = 0
            if (r7 != 0) goto L30
            com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.t r0 = r6.LJJIII
            if (r0 == 0) goto L2d
            r0.LIZ(r1)
        L2d:
            return
        L2e:
            r5 = 0
            goto L23
        L30:
            if (r5 == 0) goto L3a
            com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.t r0 = r6.LJJIII
            if (r0 == 0) goto L39
            r0.LIZ(r1)
        L39:
            return
        L3a:
            com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.t r0 = r6.LJJIII
            if (r0 == 0) goto L41
            r0.LIZ(r7)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.videotalk.p391ui.C4966r.LIZ(com.bytedance.android.livesdk.message.model.OrderInfo):void");
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m
    public final void LIZ(View view, MotionEvent motionEvent) {
        FrameLayout frameLayout;
        if (!PatchProxy.proxy(new Object[]{view, motionEvent}, this, LJIIJJI, false, 29).isSupported && !PatchProxy.proxy(new Object[]{view, motionEvent}, this, LJIIJJI, false, 33).isSupported && !LJJI() && view != null && motionEvent != null && (frameLayout = this.LIZ) != null) {
            if (motionEvent.getAction() == 0 && this.LJJJLIIL.isEmpty()) {
                frameLayout.getGlobalVisibleRect(this.LJJJLIIL);
            }
            if (!this.LJJJLIIL.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                return;
            }
            LJIL().onTouchEvent(motionEvent);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m
    public final void LIZ(Map<String, Long> map) {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        C80668Hqw c80668Hqw;
        LinkPlayerInfo linkPlayerInfo;
        User LIZ;
        String valueOf;
        if (PatchProxy.proxy(new Object[]{map}, this, LJIIJJI, false, 34).isSupported) {
            return;
        }
        C106862S5w.LIZ(map);
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        if (abstractC4847b == null) {
            return;
        }
        int itemCount = abstractC4847b.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            if (this.LJJIJL) {
                C4374l c4374l = this.LJIIZILJ;
                if (c4374l != null) {
                    c4374l.LIZ(map, i);
                }
            } else {
                RecyclerView recyclerView = this.LJIILJJIL;
                if (recyclerView == null || (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i)) == null) {
                    return;
                }
                if ((findViewHolderForAdapterPosition instanceof C80668Hqw) && (linkPlayerInfo = (c80668Hqw = (C80668Hqw) findViewHolderForAdapterPosition).LJIJI) != null && (LIZ = linkPlayerInfo.LIZ()) != null && (valueOf = String.valueOf(LIZ.getId())) != null) {
                    Long l = map.get(valueOf);
                    c80668Hqw.LIZ(l != null ? l.longValue() : 0L);
                }
            }
        }
    }

    public void LIZ(ConstraintLayout.LayoutParams layoutParams) {
        if (PatchProxy.proxy(new Object[]{layoutParams}, this, LJIIJJI, false, 37).isSupported) {
            return;
        }
        C106862S5w.LIZ(layoutParams);
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        AbstractC434073Fh videoTalkService = ((IInteractService) service).getVideoTalkService();
        Intrinsics.checkNotNullExpressionValue(videoTalkService, "");
        NextLiveData<ConstraintLayout.LayoutParams> nextLiveData = videoTalkService.LIZLLL().LIZ;
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(layoutParams.width, layoutParams.height);
        layoutParams2.rightMargin = layoutParams.rightMargin;
        layoutParams2.bottomMargin = layoutParams.bottomMargin;
        nextLiveData.setValue(layoutParams2);
        IService service2 = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service2, "");
        AbstractC434073Fh videoTalkService2 = ((IInteractService) service2).getVideoTalkService();
        Intrinsics.checkNotNullExpressionValue(videoTalkService2, "");
        videoTalkService2.LIZLLL().LIZIZ.setValue(Boolean.TRUE);
        IService service3 = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service3, "");
        AbstractC434073Fh videoTalkService3 = ((IInteractService) service3).getVideoTalkService();
        Intrinsics.checkNotNullExpressionValue(videoTalkService3, "");
        videoTalkService3.LIZLLL().LIZJ.setValue(Float.valueOf(0.7375f));
        IService service4 = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service4, "");
        AbstractC434073Fh videoTalkService4 = ((IInteractService) service4).getVideoTalkService();
        Intrinsics.checkNotNullExpressionValue(videoTalkService4, "");
        videoTalkService4.LIZLLL().LIZLLL.setValue(Float.valueOf(0.7815f));
    }

    public void LIZIZ(ConstraintLayout.LayoutParams layoutParams) {
        C4300c c4300c;
        if (PatchProxy.proxy(new Object[]{layoutParams}, this, LJIIJJI, false, 40).isSupported) {
            return;
        }
        C106862S5w.LIZ(layoutParams);
        if (C79242HLo.LJIIIZ()) {
            C79046HEa LIZ = C79046HEa.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            if (LIZ.LIZJ()) {
                C79007HCn LJII = C79007HCn.LJII();
                Intrinsics.checkNotNullExpressionValue(LJII, "");
                LIZJ(LJII.LIZ(), true);
            }
        }
        if (PatchProxy.proxy(new Object[]{layoutParams}, this, LJIIJJI, false, 42).isSupported || (c4300c = this.LJJIFFI) == null) {
            return;
        }
        C6008ch c6008ch = new C6008ch(0);
        if (this.LJJJI) {
            c4300c.LIZ();
            c4300c.LIZLLL();
        } else {
            c4300c.LIZLLL();
        }
        c4300c.m15774LJ();
        c6008ch.LIZIZ = (int) (LK5.LJFF(layoutParams.rightMargin + layoutParams.width) + 4.0f);
        c6008ch.LIZJ = (int) (LK5.LJFF(layoutParams.height + layoutParams.bottomMargin) - 8.0f);
        this.LJJJJI.put("cmd_video_talkroom_state_change", c6008ch);
    }

    public void LIZ(ILayerControl.ILayer iLayer, boolean z) {
        float LIZ;
        if (PatchProxy.proxy(new Object[]{iLayer, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LJIIJJI, false, 44).isSupported) {
            return;
        }
        C106862S5w.LIZ(iLayer);
        C4300c c4300c = this.LJJIFFI;
        if (c4300c == null) {
            return;
        }
        VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
        videoMixerDescription.setLeft(0.0f);
        videoMixerDescription.setTop(0.0f);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], c4300c, C4300c.LIZ, false, 4);
        if (proxy.isSupported) {
            LIZ = ((Float) proxy.result).floatValue();
        } else {
            LIZ = 1.0f - (c4300c.LJFF ? c4300c.LIZIZ : c4300c.LIZ() / LK5.LIZJ());
        }
        videoMixerDescription.setRight(LIZ);
        videoMixerDescription.setBottom(1.0f);
        videoMixerDescription.setVisibility(z);
        videoMixerDescription.setMode(2);
        videoMixerDescription.setzOrder(0);
        LIZ(iLayer, videoMixerDescription);
    }

    public final void LIZ(ILayerControl.ILayer iLayer) {
        ILayerControl layerControl;
        if (PatchProxy.proxy(new Object[]{iLayer}, this, LJIIJJI, false, 45).isSupported) {
            return;
        }
        C106862S5w.LIZ(iLayer);
        LiveCore LJJIJIL = this.LJJJJJ.LJJIJIL();
        if (LJJIJIL == null || (layerControl = LJJIJIL.getLayerControl()) == null) {
            return;
        }
        layerControl.setOriginTriggering(iLayer.name());
    }

    public void LIZ(ILayerControl.ILayer iLayer, int i, boolean z) {
        FrameLayout frameLayout;
        if (PatchProxy.proxy(new Object[]{iLayer, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LJIIJJI, false, 46).isSupported) {
            return;
        }
        C106862S5w.LIZ(iLayer);
        if (i < 0) {
            return;
        }
        RecyclerView recyclerView = this.LJIILJJIL;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(i) : null;
        if ((!(findViewHolderForAdapterPosition instanceof C80668Hqw) && !(findViewHolderForAdapterPosition instanceof C80819HtN)) || (frameLayout = this.LJIILIIL) == null) {
            return;
        }
        int width = frameLayout.getWidth();
        View view = findViewHolderForAdapterPosition.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        int width2 = width - view.getWidth();
        View view2 = findViewHolderForAdapterPosition.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        float y = view2.getY();
        View view3 = findViewHolderForAdapterPosition.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "");
        int width3 = view3.getWidth();
        View view4 = findViewHolderForAdapterPosition.itemView;
        Intrinsics.checkNotNullExpressionValue(view4, "");
        int height = view4.getHeight();
        if (this.LJJIFFI == null) {
            return;
        }
        VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
        videoMixerDescription.setLeft(width2 / frameLayout.getWidth());
        videoMixerDescription.setRight((width2 + width3) / frameLayout.getWidth());
        videoMixerDescription.setTop(y / frameLayout.getHeight());
        videoMixerDescription.setBottom((y + height) / frameLayout.getHeight());
        videoMixerDescription.setVisibility(z);
        videoMixerDescription.setMode(2);
        videoMixerDescription.setzOrder(1);
        LIZ(iLayer, videoMixerDescription);
    }

    public final void LIZ(ILayerControl.ILayer iLayer, VideoMixer.VideoMixerDescription videoMixerDescription) {
        if (PatchProxy.proxy(new Object[]{iLayer, videoMixerDescription}, this, LJIIJJI, false, 47).isSupported) {
            return;
        }
        C106862S5w.LIZ(iLayer, videoMixerDescription);
        VideoMixer.VideoMixerDescription layerDescription = iLayer.getLayerDescription();
        if (layerDescription.left == videoMixerDescription.left && layerDescription.top == videoMixerDescription.top && layerDescription.right == videoMixerDescription.right && layerDescription.bottom == videoMixerDescription.bottom && layerDescription.isVisible() == videoMixerDescription.isVisible() && layerDescription.getMode() == videoMixerDescription.getMode() && layerDescription.zOrder == videoMixerDescription.zOrder) {
            return;
        }
        iLayer.updateDescription(videoMixerDescription);
    }

    public final void LIZ(VoiceLiveTheme voiceLiveTheme, int i) {
        List<String> urls;
        AbstractC81935IRd LJJIIJ;
        VoiceLiveTheme LIZ;
        String str;
        if (PatchProxy.proxy(new Object[]{voiceLiveTheme, Integer.valueOf(i)}, this, LJIIJJI, false, 51).isSupported) {
            return;
        }
        C106862S5w.LIZ(voiceLiveTheme);
        if (i != LJJJ()) {
            return;
        }
        if (C79242HLo.LIZIZ(this.LJJJI)) {
            if (VoiceLiveTheme.LIZ(voiceLiveTheme.LJIIJJI)) {
                M0Q.LIZ((ImageView) this.LJJI, voiceLiveTheme.LJIIJJI);
            }
        } else if (VoiceLiveTheme.LIZ(voiceLiveTheme.LJI)) {
            PipelineDraweeControllerBuilder newDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
            ImageModel imageModel = voiceLiveTheme.LJI;
            AbstractDraweeController mo27965build = newDraweeControllerBuilder.mo27963setUri((imageModel == null || (urls = imageModel.getUrls()) == null) ? null : urls.get(0)).setAutoPlayAnimations(true).mo27965build();
            Intrinsics.checkNotNullExpressionValue(mo27965build, "");
            ClipImageView clipImageView = this.LJJI;
            if (clipImageView != null) {
                clipImageView.setController(mo27965build);
            }
        } else if (VoiceLiveTheme.LIZ(voiceLiveTheme.LJIIJJI)) {
            M0Q.LIZ((ImageView) this.LJJI, voiceLiveTheme.LJIIJJI);
        }
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        if (abstractC4847b != null) {
            abstractC4847b.LIZ(voiceLiveTheme);
        }
        int i2 = 0;
        do {
            if (this.LJJIJL) {
                C4374l c4374l = this.LJIIZILJ;
                if (c4374l != null) {
                    c4374l.LIZ(voiceLiveTheme, i2);
                }
            } else {
                RecyclerView recyclerView = this.LJIILJJIL;
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(i2) : null;
                if (findViewHolderForAdapterPosition instanceof C80681Hr9) {
                    ((C80681Hr9) findViewHolderForAdapterPosition).LIZ(i2);
                } else if (findViewHolderForAdapterPosition instanceof C80668Hqw) {
                    ((C80668Hqw) findViewHolderForAdapterPosition).LJIIL();
                }
            }
            i2++;
        } while (i2 <= 5);
        RecyclerView recyclerView2 = this.LJIILJJIL;
        if ((recyclerView2 == null || recyclerView2.getItemDecorationCount() != 0) && (LJJIIJ = LJJIIJ()) != null && (LIZ = LJJIIJ.LIZ(LJJJ())) != null && (str = LIZ.LJJII) != null && str.length() > 0) {
            try {
                this.LJJJJLL.LIZ(Color.parseColor(str));
                RecyclerView recyclerView3 = this.LJIILJJIL;
                if (recyclerView3 != null) {
                    recyclerView3.invalidateItemDecorations();
                }
            } catch (Exception unused) {
                ALogger.m15800e("equal_wm", "parse item decoration color failed " + str + ", theme bg type " + LJJJ());
            }
        }
        this.LJJJJZ = SystemClock.elapsedRealtime();
        C78828H5q.LIZ(voiceLiveTheme, i);
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4848n
    public final void LIZ(String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LJIIJJI, false, 57).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        LIZJ(str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LIZ(int i, boolean z) {
        AbstractC4767ah LIZ;
        AbstractC4766ag LIZ2;
        AbstractC4767ah LIZ3;
        AbstractC4847b abstractC4847b;
        List<LinkPlayerInfo> LIZ4;
        LinkPlayerInfo linkPlayerInfo;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LJIIJJI, false, 60).isSupported) {
            return;
        }
        AbstractC4289e LIZIZ = C4287a.LIZJ.LIZIZ();
        if (LIZIZ != null) {
            if (LIZIZ.LIZIZ() && (LIZ3 = AbstractC4767ah.LIZIZ.LIZ()) != null && LIZ3.LJIIIZ() && (abstractC4847b = this.LJIILLIIL) != null && (LIZ4 = abstractC4847b.LIZ()) != null && (linkPlayerInfo = LIZ4.get(i)) != null && linkPlayerInfo.LJJJJIZL == LinkmicPositionItem.LinkmicPositionStatus.BIDPAID.ordinal()) {
                LIZIZ.mo15775LJ();
                return;
            } else if (LIZIZ.LIZIZ() && (LIZ2 = AbstractC4766ag.LIZ.LIZ()) != null && LIZ2.LJIILIIL()) {
                LIZIZ.mo15775LJ();
                return;
            } else if (LIZIZ.LIZIZ() && (LIZ = AbstractC4767ah.LIZIZ.LIZ()) != null && !LIZ.LJIIIZ()) {
                LIZIZ.mo15775LJ();
                return;
            }
        }
        if (this.LJJJI) {
            AbstractC4766ag LIZ5 = AbstractC4766ag.LIZ.LIZ();
            if (LIZ5 == null) {
                return;
            }
            C78336GuQ.LIZ(LIZ5, 0, "seat", i, (String) null, 8, (Object) null);
            return;
        }
        C79046HEa LIZ6 = C79046HEa.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ6, "");
        Integer num = (Integer) LIZ6.LJJIIZI;
        if (num != null) {
            if (num.intValue() == 0) {
                AbstractC4767ah LIZ7 = AbstractC4767ah.LIZIZ.LIZ();
                if (LIZ7 == null) {
                    return;
                }
                C78352Gug.LIZ(LIZ7, i + 1, C78832H5u.LIZIZ, "video_empty_stub_click", null, null, 24, null);
            } else if (num.intValue() == 1) {
                LIZLLL(i);
            } else if (num.intValue() != 2) {
            } else {
                if (z != 0) {
                    HKN.LIZ(true, i);
                } else if (HKN.LIZ(this.LJJJI)) {
                    SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_ENABLE_USER_INVITE_PATH_ADJUST;
                    Intrinsics.checkNotNullExpressionValue(settingKey, "");
                    if (!settingKey.getValue().booleanValue()) {
                        Context context = this.LJJJJ;
                        Room room = this.LJJJ;
                        Boolean valueOf = Boolean.valueOf(LJJJJ());
                        VideoCameraRoomWindowManagerV2$onEmptyStubClick$1 videoCameraRoomWindowManagerV2$onEmptyStubClick$1 = new VideoCameraRoomWindowManagerV2$onEmptyStubClick$1(this);
                        if (PatchProxy.proxy(new Object[]{context, (byte) 1, room, Integer.valueOf(i), Byte.valueOf((byte) z), valueOf, null, videoCameraRoomWindowManagerV2$onEmptyStubClick$1, 64, null}, null, HKN.LIZ, true, 5).isSupported) {
                            return;
                        }
                        HKN.LIZ(context, true, room, i, false, valueOf, Boolean.TRUE, (Function1<? super Integer, Unit>) videoCameraRoomWindowManagerV2$onEmptyStubClick$1);
                        return;
                    }
                    HKN.LIZ(false, i);
                } else {
                    LIZJ(i + 1);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4848n
    public final void LIZ(int i, RecyclerView.ViewHolder viewHolder) {
        List<LinkPlayerInfo> LIZ;
        int size;
        List<LinkPlayerInfo> LIZ2;
        LinkPlayerInfo linkPlayerInfo;
        List<LinkPlayerInfo> LIZ3;
        LinkPlayerInfo linkPlayerInfo2;
        RecyclerView recyclerView;
        List<LinkPlayerInfo> LIZ4;
        LinkPlayerInfo linkPlayerInfo3;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), viewHolder}, this, LJIIJJI, false, 61).isSupported) {
            return;
        }
        C106862S5w.LIZ(viewHolder);
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        if (abstractC4847b == null || (LIZ = abstractC4847b.LIZ()) == null || (size = LIZ.size()) == 0 || i >= size) {
            return;
        }
        if (viewHolder instanceof C80731Hrx) {
            AbstractC4847b abstractC4847b2 = this.LJIILLIIL;
            if (abstractC4847b2 != null && (LIZ4 = abstractC4847b2.LIZ()) != null && (linkPlayerInfo3 = LIZ4.get(i)) != null) {
                linkPlayerInfo3.LJJIJLIJ = 0L;
                linkPlayerInfo3.LJJIZ = Boolean.FALSE;
            }
        } else if (viewHolder instanceof View$OnAttachStateChangeListenerC80676Hr4) {
            AbstractC4847b abstractC4847b3 = this.LJIILLIIL;
            if (abstractC4847b3 != null && (LIZ3 = abstractC4847b3.LIZ()) != null && (linkPlayerInfo2 = LIZ3.get(i)) != null) {
                linkPlayerInfo2.LJJJJIZL = LinkmicPositionItem.LinkmicPositionStatus.NORMAL.ordinal();
            }
            AbstractC4847b abstractC4847b4 = this.LJIILLIIL;
            if (abstractC4847b4 != null && (LIZ2 = abstractC4847b4.LIZ()) != null && (linkPlayerInfo = LIZ2.get(i)) != null) {
                linkPlayerInfo.LJJIJLIJ = 0L;
            }
            AbstractC4847b abstractC4847b5 = this.LJIILLIIL;
            if (abstractC4847b5 != null) {
                abstractC4847b5.LIZ(new C80971Hvp());
            }
            m15679LJ(i);
        }
        LJIJJLI().LIZ(this.LJJIL);
        RecyclerView recyclerView2 = this.LJIILJJIL;
        if (recyclerView2 != null && !recyclerView2.isComputingLayout() && (recyclerView = this.LJIILJJIL) != null && recyclerView.getScrollState() == 0) {
            AbstractC4847b abstractC4847b6 = this.LJIILLIIL;
            if (abstractC4847b6 == null) {
                return;
            }
            abstractC4847b6.notifyItemChanged(i);
            return;
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC81019Hwb(this, i));
    }

    public final void LIZIZ(int i, boolean z) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LJIIJJI, false, 63).isSupported) {
            return;
        }
        C5074d c5074d = (C5074d) IQV.LIZ(ChatMatchWidget.LJI, C5074d.class);
        if (c5074d != null) {
            c5074d.LIZ(z);
        } else {
            C116971W2r.LIZJ(new DialogC77870Gmu(this.LJJJJ, this.LJJJJI, i + 1, false));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4848n
    public final void LIZ(int i, int i2) {
        LinkPlayerInfo linkPlayerInfo;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LJIIJJI, false, 69).isSupported) {
            return;
        }
        if (this.LJJIJL) {
            C4374l c4374l = this.LJIIZILJ;
            if (c4374l == null) {
                return;
            }
            c4374l.LIZ(i2, i);
            return;
        }
        RecyclerView recyclerView = this.LJIILJJIL;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(i) : null;
        if (!(findViewHolderForAdapterPosition instanceof C80668Hqw)) {
            return;
        }
        C80668Hqw c80668Hqw = (C80668Hqw) findViewHolderForAdapterPosition;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i2)}, c80668Hqw, C80668Hqw.f7329LJ, false, 28).isSupported) {
            return;
        }
        LinkPlayerInfo linkPlayerInfo2 = c80668Hqw.LJIJI;
        if (linkPlayerInfo2 == null || linkPlayerInfo2.LJIIL != 0) {
            c80668Hqw.LJIIL();
        } else if (i2 > 0 && (linkPlayerInfo = c80668Hqw.LJIJI) != null && linkPlayerInfo.LJIIL == 0) {
            c80668Hqw.LJIIJJI();
        } else if (PatchProxy.proxy(new Object[0], c80668Hqw, C80668Hqw.f7329LJ, false, 25).isSupported) {
        } else {
            LinkPlayerInfo linkPlayerInfo3 = c80668Hqw.LJIJI;
            if (linkPlayerInfo3 != null && linkPlayerInfo3.LIZIZ()) {
                IOU iou = c80668Hqw.LJIJJ;
                if (iou == null) {
                    return;
                }
                iou.LIZ();
                return;
            }
            HSImageView hSImageView = c80668Hqw.LJI;
            if (hSImageView != null) {
                hSImageView.setController(null);
            }
            HSImageView hSImageView2 = c80668Hqw.LJI;
            if (hSImageView2 == null) {
                return;
            }
            hSImageView2.setVisibility(4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d2, code lost:
        if (r0.LIZJ() != false) goto L38;
     */
    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4848n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo r12) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.videotalk.p391ui.C4966r.LIZ(com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo):void");
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4848n
    public final void LIZIZ(LinkPlayerInfo linkPlayerInfo) {
        C5923dp LIZ;
        C2WC<Integer> LLFFF;
        Integer LIZ2;
        int intValue;
        if (PatchProxy.proxy(new Object[]{linkPlayerInfo}, this, LJIIJJI, false, 73).isSupported) {
            return;
        }
        AbstractC4767ah LIZ3 = AbstractC4767ah.LIZIZ.LIZ();
        if (LIZ3 != null && !LIZ3.LJIIIZ()) {
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_LINK_GUEST_CLEAN_SCREEN_OPTIMIZE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue() && (LIZ = C5923dp.LJIIJ.LIZ(this.LJJJJI, 0L)) != null && (LLFFF = LIZ.LLFFF()) != null && (LIZ2 = LLFFF.LIZ()) != null && ((intValue = LIZ2.intValue()) == 2 || intValue == 3)) {
                ALogger.m15795w(this.LJJIJLIJ, "rejected guest rank click for new clean mode");
                return;
            }
        }
        if (this.LJJJ.getOwner() == null || linkPlayerInfo == null || linkPlayerInfo.LIZ() == null) {
            return;
        }
        C78613Gyt.LIZ(C78613Gyt.LIZIZ, this.LJJJJ, linkPlayerInfo, this.LJJJ, false, 8, (Object) null);
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4848n
    public final void LIZ(User user, boolean z) {
        if (PatchProxy.proxy(new Object[]{user, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LJIIJJI, false, 75).isSupported) {
            return;
        }
        C106862S5w.LIZ(user);
        if (z) {
            this.LJJJJI.put("cmd_video_talk_invite", user);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(user.getId()));
        ((KDS) ((LinkAnchorApi) C88306Kqq.LIZ().LIZ(LinkAnchorApi.class)).inviteFriends(this.LJJJ.getId(), new JSONArray((Collection) arrayList).toString(), 1, 0L).m149as(C148062fT6.LIZ(this.LJJJJIZL))).LIZ(new C78136GrC(this, user), AnonymousClass189.LIZ);
    }

    public void LIZ(String[] strArr, boolean[] zArr) {
        if (PatchProxy.proxy(new Object[]{strArr, zArr}, this, LJIIJJI, false, 78).isSupported) {
            return;
        }
        if (strArr != null) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (zArr != null) {
                    this.LJJIZ.put(strArr[i], Boolean.valueOf(zArr[i]));
                }
            }
        }
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        if (abstractC4847b == null) {
            return;
        }
        abstractC4847b.LIZ(this.LJJIZ);
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m
    public final void LIZ(C79400HRq c79400HRq) {
        boolean z;
        HashMap hashMap;
        AbstractC78986HBs<LinkPlayerInfo> LJIIIIZZ;
        String str;
        User LIZ;
        if (!PatchProxy.proxy(new Object[]{c79400HRq}, this, LJIIJJI, false, 79).isSupported && c79400HRq != null && !Lists.isEmpty(c79400HRq.LJI)) {
            this.LJIL.clear();
            this.LJJ.clear();
            HashMap hashMap2 = new HashMap();
            int size = c79400HRq.LJI.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = "";
            }
            boolean[] zArr = new boolean[c79400HRq.LJI.size()];
            int size2 = c79400HRq.LJI.size();
            int i2 = 0;
            while (i2 < size2) {
                C9627at c9627at = c79400HRq.LJI.get(i2);
                Intrinsics.checkNotNullExpressionValue(c9627at, "");
                String LIZJ = c9627at.LIZJ();
                LIZJ.toString();
                strArr[i2] = LIZJ;
                zArr[i2] = c9627at.LIZ();
                HashMap<String, Integer> hashMap3 = this.LJIL;
                String LIZJ2 = c9627at.LIZJ();
                Intrinsics.checkNotNullExpressionValue(LIZJ2, "");
                hashMap3.put(LIZJ2, Integer.valueOf(c9627at.LIZIZ == 0 ? 2 : c9627at.LIZIZ));
                HashMap<String, Integer> hashMap4 = this.LJJ;
                String LIZJ3 = c9627at.LIZJ();
                Intrinsics.checkNotNullExpressionValue(LIZJ3, "");
                hashMap4.put(LIZJ3, Integer.valueOf(c9627at.LJIILJJIL));
                AbstractC4767ah LIZ2 = AbstractC4767ah.LIZIZ.LIZ();
                if (LIZ2 == null || (LJIIIIZZ = LIZ2.LJIIIIZZ()) == null) {
                    hashMap = hashMap2;
                } else {
                    String LIZJ4 = c9627at.LIZJ();
                    Intrinsics.checkNotNullExpressionValue(LIZJ4, "");
                    StringBuilder sb = new StringBuilder();
                    hashMap = hashMap2;
                    LinkPlayerInfo LIZIZ = LJIIIIZZ.LIZIZ(0L, c9627at.LIZJ());
                    if (LIZIZ == null || (LIZ = LIZIZ.LIZ()) == null || (str = LIZ.getIdStr()) == null) {
                        str = "";
                    }
                    sb.append(str);
                    sb.append(c9627at.LIZIZ);
                    sb.append(c9627at.LJIILJJIL);
                    hashMap.put(LIZJ4, sb.toString());
                }
                i2++;
                hashMap2 = hashMap;
            }
            LIZ(strArr, zArr);
            if (!C3801313v.LIZ(hashMap2, this.LJIIJ)) {
                this.LJIIJ.clear();
                this.LJIIJ.putAll(hashMap2);
                z = true;
            } else {
                z = false;
            }
            C4A3.LJFF.LIZ().LIZIZ(true, this.LJJJ.getRoomId());
            if (!z || !this.LJJIIJZLJL) {
                return;
            }
            LJIJJLI().LIZ(this.LJJIL);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m
    public final void LIZ(String str, View view) {
        RecyclerView.ViewHolder viewHolder;
        MethodCollector.m14708i(2054);
        if (PatchProxy.proxy(new Object[]{str, view}, this, LJIIJJI, false, 86).isSupported) {
            MethodCollector.m14707o(2054);
            return;
        }
        this.LJJJJJ.ai_().put(str, view);
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.VIDEO_CAMERA_AGORA_OPT_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            HashMap<String, Boolean> ah_ = this.LJJJJJ.ah_();
            Intrinsics.checkNotNullExpressionValue(ah_, "");
            ah_.put(str, Boolean.FALSE);
        } else if (!this.LJJJJJ.ah_().containsKey(str)) {
            HashMap<String, Boolean> ah_2 = this.LJJJJJ.ah_();
            Intrinsics.checkNotNullExpressionValue(ah_2, "");
            ah_2.put(str, Boolean.FALSE);
        }
        String str2 = this.LJJIJLIJ;
        StringBuilder sb = new StringBuilder("on first remote video frame id ");
        sb.append(str);
        sb.append(" anchor ");
        C79007HCn LJII = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        sb.append(LJII.LJIIIIZZ());
        ALogger.m15801d(str2, sb.toString());
        Object obj = null;
        if (LJI(str)) {
            if (C79242HLo.LJIIIZ()) {
                LIZJ(str, true);
                MethodCollector.m14707o(2054);
                return;
            }
            if (view instanceof SurfaceView) {
                SurfaceView surfaceView = (SurfaceView) view;
                surfaceView.setZOrderMediaOverlay(false);
                this.LJIIL = surfaceView;
            }
            if (view != null) {
                view.setLayoutParams(LIZIZ(view));
            }
            FrameLayout frameLayout = this.LIZ;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            if (view != null) {
                obj = view.getParent();
            }
            if (obj instanceof ViewGroup) {
                ((ViewGroup) obj).removeView(view);
            }
            FrameLayout frameLayout2 = this.LIZ;
            if (frameLayout2 != null) {
                frameLayout2.addView(view);
            }
            FrameLayout frameLayout3 = this.LIZ;
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(0);
            }
            LJJJJZ();
            MethodCollector.m14707o(2054);
            return;
        }
        if (view instanceof SurfaceView) {
            ((SurfaceView) view).setZOrderMediaOverlay(true);
        }
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        Integer valueOf = abstractC4847b != null ? Integer.valueOf(abstractC4847b.LIZIZ(0L, str)) : null;
        RecyclerView recyclerView = this.LJIILJJIL;
        if (recyclerView != null) {
            viewHolder = recyclerView.findViewHolderForAdapterPosition(valueOf != null ? valueOf.intValue() : -1);
        } else {
            viewHolder = null;
        }
        if (this.LJJIJL) {
            if (viewHolder instanceof C80819HtN) {
                ALogger.m15801d(this.LJJIJLIJ, "on media type changed");
                if (valueOf == null) {
                    MethodCollector.m14707o(2054);
                    return;
                }
                int intValue = valueOf.intValue();
                C4374l c4374l = this.LJIIZILJ;
                if (c4374l == null) {
                    MethodCollector.m14707o(2054);
                    return;
                }
                c4374l.LIZIZ(1, intValue);
            } else {
                String str3 = this.LJJIJLIJ;
                StringBuilder sb2 = new StringBuilder("invoke online list changed size ");
                List<LinkPlayerInfo> list = this.LJJIL;
                if (list != null) {
                    obj = Integer.valueOf(list.size());
                }
                sb2.append(obj);
                ALogger.m15801d(str3, sb2.toString());
                LJIJJLI().LIZ(this.LJJIL);
                MethodCollector.m14707o(2054);
                return;
            }
        } else if (viewHolder instanceof C80668Hqw) {
            ALogger.m15801d(this.LJJIJLIJ, "on media type changed");
            ((C80668Hqw) viewHolder).LIZIZ(1);
            MethodCollector.m14707o(2054);
            return;
        } else {
            String str4 = this.LJJIJLIJ;
            StringBuilder sb3 = new StringBuilder("invoke online list changed size ");
            List<LinkPlayerInfo> list2 = this.LJJIL;
            if (list2 != null) {
                obj = Integer.valueOf(list2.size());
            }
            sb3.append(obj);
            ALogger.m15801d(str4, sb3.toString());
            LJIJJLI().LIZ(this.LJJIL);
        }
        MethodCollector.m14707o(2054);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cf, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() != false) goto L57;
     */
    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.videotalk.p391ui.C4966r.LIZ(java.lang.String):void");
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m
    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LJIIJJI, false, 100).isSupported) {
            return;
        }
        if (!this.LJIIIZ.containsKey(str)) {
            this.LJIIIZ.put(str, Boolean.TRUE);
        }
        if (!C4378a.LJJIJIL.LIZJ() || !C4378a.LJJIJIL.LIZLLL()) {
            return;
        }
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        LIZIZ(abstractC4847b != null ? abstractC4847b.LIZ() : null);
        LIZJ(this.LJJIIZI);
        LIZLLL(str, false);
        AbstractC4847b abstractC4847b2 = this.LJIILLIIL;
        if (abstractC4847b2 == null) {
            return;
        }
        abstractC4847b2.notifyDataSetChanged();
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m
    public final void LIZIZ(String str, boolean z) {
        RecyclerView.ViewHolder viewHolder;
        int i = 2;
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LJIIJJI, false, 103).isSupported) {
            return;
        }
        ALogger.m15801d(this.LJJIJLIJ, "remote mute change id " + str + " mute = " + z);
        HashMap<String, Boolean> ah_ = this.LJJJJJ.ah_();
        Intrinsics.checkNotNullExpressionValue(ah_, "");
        ah_.put(str, Boolean.valueOf(z));
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        Integer num = null;
        Integer valueOf = abstractC4847b != null ? Integer.valueOf(abstractC4847b.LIZIZ(0L, str)) : null;
        RecyclerView recyclerView = this.LJIILJJIL;
        if (recyclerView != null) {
            viewHolder = recyclerView.findViewHolderForAdapterPosition(valueOf != null ? valueOf.intValue() : -1);
        } else {
            viewHolder = null;
        }
        if (this.LJJIJL) {
            if (viewHolder instanceof C80819HtN) {
                ALogger.m15801d(this.LJJIJLIJ, "on media type changed mute = " + z);
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    C4374l c4374l = this.LJIIZILJ;
                    if (c4374l == null) {
                        return;
                    }
                    if (!z) {
                        i = 1;
                    }
                    c4374l.LIZIZ(i, intValue);
                    return;
                }
                return;
            }
            String str2 = this.LJJIJLIJ;
            StringBuilder sb = new StringBuilder("invoke online list changed size ");
            List<LinkPlayerInfo> list = this.LJJIL;
            if (list != null) {
                num = Integer.valueOf(list.size());
            }
            sb.append(num);
            ALogger.m15801d(str2, sb.toString());
            C80647Hqb LJIJJLI = LJIJJLI();
            if (LJIJJLI == null) {
                return;
            }
            LJIJJLI.LIZ(this.LJJIL);
        } else if (viewHolder instanceof C80668Hqw) {
            ALogger.m15801d(this.LJJIJLIJ, "on media type changed mute = " + z);
            C80668Hqw c80668Hqw = (C80668Hqw) viewHolder;
            if (!z) {
                i = 1;
            }
            c80668Hqw.LIZIZ(i);
        } else {
            String str3 = this.LJJIJLIJ;
            StringBuilder sb2 = new StringBuilder("invoke online list changed size ");
            List<LinkPlayerInfo> list2 = this.LJJIL;
            if (list2 != null) {
                num = Integer.valueOf(list2.size());
            }
            sb2.append(num);
            ALogger.m15801d(str3, sb2.toString());
            C80647Hqb LJIJJLI2 = LJIJJLI();
            if (LJIJJLI2 == null) {
                return;
            }
            LJIJJLI2.LIZ(this.LJJIL);
        }
    }

    public boolean LIZJ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LJIIJJI, false, 104);
        return proxy.isSupported ? ((Boolean) proxy.result).booleanValue() : Intrinsics.areEqual(this.LJJJJJ.ah_().get(str), Boolean.FALSE) && LJFF(str);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.emoji.c$b
    public final EPointF LIZ(int i, int i2, EPointF ePointF, EPointF ePointF2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), ePointF, ePointF2}, this, LJIIJJI, false, 116);
        if (proxy.isSupported) {
            return (EPointF) proxy.result;
        }
        C106862S5w.LIZ(ePointF, ePointF2);
        if (i == 0) {
            EPointF ePointF3 = new EPointF();
            ePointF3.x = ePointF2.x - LK5.LIZJ(30.0f);
            ePointF3.y = ePointF2.y - LK5.LIZJ(30.0f);
            return ePointF3;
        } else if (i2 == 0) {
            EPointF ePointF4 = new EPointF();
            ePointF4.x = ePointF2.x - LK5.LIZJ(30.0f);
            ePointF4.y = ePointF2.y - LK5.LIZJ(30.0f);
            return ePointF4;
        } else {
            EPointF ePointF5 = new EPointF();
            ePointF5.x = (ePointF2.x + ePointF.x) / 2.0f;
            ePointF5.y = (ePointF2.y + ePointF.y) / 2.0f;
            return ePointF5;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.emoji.c$b
    public final boolean LIZ(long j, int i) {
        List<LinkPlayerInfo> LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i)}, this, LJIIJJI, false, 120);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (i == 0) {
            return false;
        }
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        Object obj = null;
        if (abstractC4847b != null && (LIZ = abstractC4847b.LIZ()) != null) {
            Iterator<T> it = LIZ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                User LIZ2 = ((LinkPlayerInfo) next).LIZ();
                if (LIZ2 != null && LIZ2.getId() == j) {
                    obj = next;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
            if (linkPlayerInfo != null && linkPlayerInfo.LJIIJJI == i) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.emoji.c$b
    public final boolean LIZ(int i, long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), new Long(j)}, this, LJIIJJI, false, 121);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C4377t c4377t = this.LJJIII;
        if (c4377t == null) {
            return false;
        }
        return c4377t.LIZ(Long.valueOf(j));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0073, code lost:
        if (r11 == null) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void LIZ(com.bytedance.android.livesdk.chatroom.model.interact.C6166j r15) {
        /*
            r14 = this;
            r7 = 1
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r6 = 0
            r2[r6] = r15
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.videotalk.p391ui.C4966r.LJIIJJI
            r0 = 123(0x7b, float:1.72E-43)
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r14, r1, r6, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L13
            return
        L13:
            p003X.C106862S5w.LIZ(r15)
            com.bytedance.android.live.liveinteract.videotalk.adapter.b r0 = r14.LJIILLIIL
            if (r0 == 0) goto L35
            int r5 = r0.getItemCount()
            java.util.List<com.bytedance.android.livesdk.chatroom.model.interact.j$a> r4 = r15.LJFF
            boolean r0 = r14.LJJIJL
            if (r0 == 0) goto L36
            com.bytedance.android.live.liveinteract.videotalk.adapter.b r0 = r14.LJIILLIIL
            if (r0 == 0) goto La7
            java.util.List r1 = r0.LIZ()
            if (r1 == 0) goto La7
            com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.l r0 = r14.LJIIZILJ
            if (r0 == 0) goto La7
            r0.LIZ(r1, r15)
        L35:
            return
        L36:
            r8 = 0
        L37:
            if (r8 >= r5) goto L35
            androidx.recyclerview.widget.RecyclerView r0 = r14.LJIILJJIL
            r11 = 0
            if (r0 == 0) goto La5
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r0.findViewHolderForLayoutPosition(r8)
        L42:
            boolean r0 = r3 instanceof p003X.C80668Hqw
            if (r0 == 0) goto L84
            if (r4 == 0) goto L75
            java.util.Iterator r13 = r4.iterator()
        L4c:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r12 = r13.next()
            r1 = r12
            com.bytedance.android.livesdk.chatroom.model.interact.j$a r1 = (com.bytedance.android.livesdk.chatroom.model.interact.C6166j.C6167a) r1
            r0 = r3
            X.Hqw r0 = (p003X.C80668Hqw) r0
            com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo r0 = r0.LJIJI
            if (r0 == 0) goto L4c
            com.bytedance.android.live.base.model.user.User r0 = r0.LIZ()
            if (r0 == 0) goto L4c
            long r9 = r0.getId()
            long r0 = r1.LIZIZ
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 != 0) goto L4c
            r11 = r12
        L71:
            com.bytedance.android.livesdk.chatroom.model.interact.j$a r11 = (com.bytedance.android.livesdk.chatroom.model.interact.C6166j.C6167a) r11
            if (r11 != 0) goto L7a
        L75:
            com.bytedance.android.livesdk.chatroom.model.interact.j$a r11 = new com.bytedance.android.livesdk.chatroom.model.interact.j$a
            r11.<init>()
        L7a:
            X.Hqw r3 = (p003X.C80668Hqw) r3
            java.lang.String r0 = "adjust_window"
            r3.LIZ(r11, r0, r7)
        L81:
            int r8 = r8 + 1
            goto L37
        L84:
            boolean r0 = r3 instanceof p003X.C80681Hr9
            if (r0 == 0) goto L81
            X.Hr9 r3 = (p003X.C80681Hr9) r3
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r2[r6] = r0
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = p003X.C80681Hr9.LIZJ
            r0 = 11
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r3, r1, r6, r0)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto L81
            r3.LIZ(r7)
            r3.LIZIZ(r8)
            goto L81
        La5:
            r3 = r11
            goto L42
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.videotalk.p391ui.C4966r.LIZ(com.bytedance.android.livesdk.chatroom.model.interact.j):void");
    }

    public void LIZIZ(C6166j c6166j) {
        List<C6166j.C6167a> list;
        Object obj;
        User LIZ;
        List<LinkPlayerInfo> LIZ2;
        C4374l c4374l;
        if (PatchProxy.proxy(new Object[]{c6166j}, this, LJIIJJI, false, 124).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6166j);
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        if (abstractC4847b != null) {
            int itemCount = abstractC4847b.getItemCount();
            if (this.LJJIJL) {
                AbstractC4847b abstractC4847b2 = this.LJIILLIIL;
                if (abstractC4847b2 == null || (LIZ2 = abstractC4847b2.LIZ()) == null || (c4374l = this.LJIIZILJ) == null) {
                    return;
                }
                c4374l.LIZIZ(LIZ2, c6166j);
                return;
            }
            for (int i = 0; i < itemCount; i++) {
                RecyclerView recyclerView = this.LJIILJJIL;
                RecyclerView.ViewHolder findViewHolderForLayoutPosition = recyclerView != null ? recyclerView.findViewHolderForLayoutPosition(i) : null;
                if (findViewHolderForLayoutPosition instanceof C80668Hqw) {
                    C80668Hqw c80668Hqw = (C80668Hqw) findViewHolderForLayoutPosition;
                    if (!PatchProxy.proxy(new Object[]{c6166j}, c80668Hqw, C80668Hqw.f7329LJ, false, 38).isSupported) {
                        C106862S5w.LIZ(c6166j);
                        if (!c80668Hqw.LJIILJJIL() && (list = c6166j.LJFF) != null) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    long j = ((C6166j.C6167a) obj).LIZIZ;
                                    LinkPlayerInfo linkPlayerInfo = c80668Hqw.LJIJI;
                                    if (linkPlayerInfo != null && (LIZ = linkPlayerInfo.LIZ()) != null && j == LIZ.getId()) {
                                        break;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            C6166j.C6167a c6167a = (C6166j.C6167a) obj;
                            if (c6167a != null) {
                                if (AbstractC4936a.LIZ.LIZ(c80668Hqw.LJIJI)) {
                                    AbstractC4936a LIZ3 = AbstractC4936a.LIZ.LIZ();
                                    if (LIZ3 != null) {
                                        C80945HvP.LIZ(LIZ3, C4939e.LJIIIZ.LIZ(c6167a), false, 2, (Object) null);
                                    }
                                } else {
                                    c80668Hqw.LJIIL.LIZIZ(c6167a);
                                }
                                if (!PatchProxy.proxy(new Object[]{c6167a}, c80668Hqw, C80668Hqw.f7329LJ, false, 41).isSupported) {
                                    if (C80302Hl2.LIZLLL() || C80302Hl2.LIZIZ()) {
                                        if (c6167a.LJIILIIL && c6167a.LJIIJJI) {
                                            if (!PatchProxy.proxy(new Object[]{c6167a}, c80668Hqw, C80668Hqw.f7329LJ, false, 42).isSupported) {
                                                c80668Hqw.LJII.LIZ();
                                                if (C80668Hqw.LIZ(c80668Hqw.LJIJI)) {
                                                    Uri LIZIZ = C80312HlC.LIZIZ.LIZIZ(c6167a.LJIIL);
                                                    C4377t c4377t = c80668Hqw.LJIJJLI.LJIILL;
                                                    if (c4377t != null) {
                                                        c4377t.LIZIZ(new C80900Hug(c6167a.LIZIZ, 1, c6167a.LJIIL, LIZIZ, new C4843x241de2a0(c80668Hqw)));
                                                    }
                                                    c6167a.LJIILIIL = false;
                                                    c80668Hqw.LJIILIIL = true;
                                                }
                                            }
                                        } else if (c6167a.LJIILL && c6167a.LJIILJJIL) {
                                            if (!PatchProxy.proxy(new Object[]{c6167a}, c80668Hqw, C80668Hqw.f7329LJ, false, 43).isSupported) {
                                                c80668Hqw.LJII.LIZ();
                                                if (C80668Hqw.LIZ(c80668Hqw.LJIJI)) {
                                                    Uri LIZJ = C80312HlC.LIZIZ.LIZJ();
                                                    C4377t c4377t2 = c80668Hqw.LJIJJLI.LJIILL;
                                                    if (c4377t2 != null) {
                                                        c4377t2.LIZIZ(new C80900Hug(c6167a.LIZIZ, 2, c6167a.LJIIL, LIZJ, new C4844x18c43493(c80668Hqw)));
                                                    }
                                                    c6167a.LJIILL = false;
                                                    c80668Hqw.LJIILIIL = true;
                                                }
                                            }
                                        } else if (!c80668Hqw.LJIILIIL) {
                                            c80668Hqw.LJII.LIZ(c6167a);
                                        }
                                    } else {
                                        c80668Hqw.LJII.LIZ(c6167a);
                                    }
                                }
                                if (!PatchProxy.proxy(new Object[]{c6167a}, c80668Hqw, C80668Hqw.f7329LJ, false, 40).isSupported) {
                                    if ((C80302Hl2.LIZ() || C80302Hl2.LIZJ()) && c6167a.LJIILLIIL) {
                                        c80668Hqw.LJIIL.LIZLLL(c6167a);
                                    }
                                    c80668Hqw.LJIIL.LIZJ(c6167a);
                                }
                                if (!PatchProxy.proxy(new Object[]{c6167a}, c80668Hqw, C80668Hqw.f7329LJ, false, 39).isSupported) {
                                    if (c80668Hqw.LJIIIIZZ.LIZ()) {
                                        if (!c6167a.LJIIJJI && !c6167a.LJIILJJIL) {
                                            c80668Hqw.LJIIIIZZ.setController(null);
                                            c80668Hqw.LJIIIIZZ.setVisibility(8);
                                        }
                                    }
                                    c80668Hqw.LJIIL.LJFF();
                                }
                                c80668Hqw.LJIJ = c6167a;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LIZ(C6166j c6166j, boolean z) {
        User LIZ;
        User LIZ2;
        List<LinkPlayerInfo> LIZ3;
        C4374l c4374l;
        if (PatchProxy.proxy(new Object[]{c6166j, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LJIIJJI, false, C1399n.f22430f).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6166j);
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        if (abstractC4847b != null) {
            int itemCount = abstractC4847b.getItemCount();
            if (this.LJJIJL) {
                AbstractC4847b abstractC4847b2 = this.LJIILLIIL;
                if (abstractC4847b2 == null || (LIZ3 = abstractC4847b2.LIZ()) == null || (c4374l = this.LJIIZILJ) == null) {
                    return;
                }
                c4374l.LIZ(LIZ3, c6166j, z);
                return;
            }
            for (int i = 0; i < itemCount; i++) {
                RecyclerView recyclerView = this.LJIILJJIL;
                Long l = null;
                RecyclerView.ViewHolder findViewHolderForLayoutPosition = recyclerView != null ? recyclerView.findViewHolderForLayoutPosition(i) : null;
                if (findViewHolderForLayoutPosition instanceof C80668Hqw) {
                    C80668Hqw c80668Hqw = (C80668Hqw) findViewHolderForLayoutPosition;
                    if (!PatchProxy.proxy(new Object[]{Byte.valueOf((byte) z)}, c80668Hqw, C80668Hqw.f7329LJ, false, 46).isSupported && !c80668Hqw.LJIILJJIL()) {
                        C6166j.C6167a c6167a = c80668Hqw.LJIJ;
                        if (c6167a != null && c6167a.LJIILJJIL) {
                            StringBuilder sb = new StringBuilder("showRankLastAnimation of ");
                            LinkPlayerInfo linkPlayerInfo = c80668Hqw.LJIJI;
                            if (linkPlayerInfo != null && (LIZ2 = linkPlayerInfo.LIZ()) != null) {
                                l = Long.valueOf(LIZ2.getId());
                            }
                            sb.append(l);
                            sb.append(LoggerUtil.BLANK_TAG);
                            sb.append(c80668Hqw.LJIJ);
                            ALogger.m15797i("GuestBattleV", sb.toString());
                            if (C80302Hl2.LIZ()) {
                                c80668Hqw.LJIIL.LIZLLL();
                            }
                            c80668Hqw.LJIIL.LIZJ(c6167a);
                        } else if (c80668Hqw.LJIIL.LJIIIIZZ()) {
                            if (c6167a == null || c6167a.LIZ()) {
                                c80668Hqw.LJIIL.LIZJ();
                            } else if (c6167a.LJIIJJI) {
                                if (z != 0) {
                                    c80668Hqw.LJIIL.LIZJ();
                                }
                                StringBuilder sb2 = new StringBuilder();
                                LinkPlayerInfo linkPlayerInfo2 = c80668Hqw.LJIJI;
                                if (linkPlayerInfo2 != null && (LIZ = linkPlayerInfo2.LIZ()) != null) {
                                    l = Long.valueOf(LIZ.getId());
                                }
                                sb2.append(l);
                                sb2.append(LoggerUtil.BLANK_TAG);
                                sb2.append(z != 0 ? "during transition" : "");
                                sb2.append(" change from last to crown ");
                                sb2.append(c80668Hqw.LJIJ);
                                ALogger.m15800e("GuestBattleV", sb2.toString());
                            }
                        }
                        c80668Hqw.LJIIL.LJFF();
                    }
                }
            }
        }
    }

    public void LIZLLL(C6166j c6166j) {
        List<C6166j.C6167a> list;
        User LIZ;
        List<LinkPlayerInfo> LIZ2;
        C4374l c4374l;
        if (PatchProxy.proxy(new Object[]{c6166j}, this, LJIIJJI, false, 127).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6166j);
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        if (abstractC4847b != null) {
            int itemCount = abstractC4847b.getItemCount();
            if (this.LJJIJL) {
                AbstractC4847b abstractC4847b2 = this.LJIILLIIL;
                if (abstractC4847b2 == null || (LIZ2 = abstractC4847b2.LIZ()) == null || (c4374l = this.LJIIZILJ) == null) {
                    return;
                }
                c4374l.LIZLLL(LIZ2, c6166j);
                return;
            }
            for (int i = 0; i < itemCount; i++) {
                RecyclerView recyclerView = this.LJIILJJIL;
                Object obj = null;
                RecyclerView.ViewHolder findViewHolderForLayoutPosition = recyclerView != null ? recyclerView.findViewHolderForLayoutPosition(i) : null;
                if (findViewHolderForLayoutPosition instanceof C80668Hqw) {
                    C80668Hqw c80668Hqw = (C80668Hqw) findViewHolderForLayoutPosition;
                    if (!PatchProxy.proxy(new Object[]{c6166j}, c80668Hqw, C80668Hqw.f7329LJ, false, 45).isSupported) {
                        C106862S5w.LIZ(c6166j);
                        if (!c80668Hqw.LJIILJJIL() && (list = c6166j.LJFF) != null) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Object next = it.next();
                                long j = ((C6166j.C6167a) next).LIZIZ;
                                LinkPlayerInfo linkPlayerInfo = c80668Hqw.LJIJI;
                                if (linkPlayerInfo != null && (LIZ = linkPlayerInfo.LIZ()) != null && j == LIZ.getId()) {
                                    obj = next;
                                    break;
                                }
                            }
                            C6166j.C6167a c6167a = (C6166j.C6167a) obj;
                            if (c6167a != null && !c6167a.LJIIJJI && c80668Hqw.LJIIL.LJII()) {
                                c80668Hqw.LJIIL.LIZJ();
                            }
                        }
                    }
                }
            }
        }
    }

    public void LIZ(C4939e c4939e) {
        if (PatchProxy.proxy(new Object[]{c4939e}, this, LJIIJJI, false, 133).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4939e);
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        if (abstractC4847b != null) {
            int LIZ = abstractC4847b.LIZ(c4939e.LIZIZ);
            if (this.LJJIJL) {
                C4374l c4374l = this.LJIIZILJ;
                if (c4374l == null) {
                    return;
                }
                c4374l.LIZ(c4939e, LIZ);
                return;
            }
            RecyclerView recyclerView = this.LJIILJJIL;
            RecyclerView.ViewHolder findViewHolderForLayoutPosition = recyclerView != null ? recyclerView.findViewHolderForLayoutPosition(LIZ) : null;
            if (!(findViewHolderForLayoutPosition instanceof C80668Hqw)) {
                findViewHolderForLayoutPosition = null;
            }
            C80668Hqw c80668Hqw = (C80668Hqw) findViewHolderForLayoutPosition;
            if (c80668Hqw != null && !PatchProxy.proxy(new Object[]{c4939e}, c80668Hqw, C80668Hqw.f7329LJ, false, 10).isSupported) {
                C106862S5w.LIZ(c4939e);
                int i = c4939e.LJII;
                if (i == 0) {
                    c80668Hqw.LJIIJJI.LIZ(c4939e);
                } else if (i != 1) {
                } else {
                    c80668Hqw.LJIIL.LIZ(c4939e);
                }
            }
        }
    }

    public void LIZ(C78616Gyw c78616Gyw) {
        if (PatchProxy.proxy(new Object[]{c78616Gyw}, this, LJIIJJI, false, 136).isSupported) {
            return;
        }
        C106862S5w.LIZ(c78616Gyw);
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        int LIZ = abstractC4847b != null ? abstractC4847b.LIZ(c78616Gyw.LIZJ) : -1;
        C4374l c4374l = this.LJIIZILJ;
        if (c4374l == null) {
            return;
        }
        c4374l.LIZ(c78616Gyw, LIZ);
    }

    public void LIZ(C440683by c440683by) {
        if (PatchProxy.proxy(new Object[]{c440683by}, this, LJIIJJI, false, 137).isSupported) {
            return;
        }
        C106862S5w.LIZ(c440683by);
        List<Long> list = c440683by.LIZ;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                long longValue = list.get(i).longValue();
                AbstractC4847b abstractC4847b = this.LJIILLIIL;
                if (abstractC4847b != null) {
                    int LIZ = abstractC4847b.LIZ(longValue);
                    if (this.LJJIJL) {
                        C4374l c4374l = this.LJIIZILJ;
                        if (c4374l != null) {
                            c4374l.m15746LJ(LIZ);
                        }
                    } else {
                        RecyclerView recyclerView = this.LJIILJJIL;
                        RecyclerView.ViewHolder findViewHolderForLayoutPosition = recyclerView != null ? recyclerView.findViewHolderForLayoutPosition(LIZ) : null;
                        if (!(findViewHolderForLayoutPosition instanceof C80668Hqw)) {
                            findViewHolderForLayoutPosition = null;
                        }
                        C80668Hqw c80668Hqw = (C80668Hqw) findViewHolderForLayoutPosition;
                        if (c80668Hqw != null) {
                            c80668Hqw.LJI();
                        }
                    }
                }
            }
        }
    }

    public final boolean LIZ(List<? extends LinkPlayerInfo> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, LJIIJJI, false, 12);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (list != null) {
            for (LinkPlayerInfo linkPlayerInfo : list) {
                if (linkPlayerInfo.LJJJJIZL == LinkmicPositionItem.LinkmicPositionStatus.BIDPAID.ordinal()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void LIZIZ(List<? extends LinkPlayerInfo> list) {
        if (!PatchProxy.proxy(new Object[]{list}, this, LJIIJJI, false, 13).isSupported && list != null) {
            for (LinkPlayerInfo linkPlayerInfo : list) {
                if (linkPlayerInfo.LJJJJIZL == LinkmicPositionItem.LinkmicPositionStatus.BIDPAID.ordinal()) {
                    linkPlayerInfo.LJJJJIZL = LinkmicPositionItem.LinkmicPositionStatus.NORMAL.ordinal();
                }
            }
        }
    }

    public final void LIZJ(List<? extends LinkmicPositionItem> list) {
        if (!PatchProxy.proxy(new Object[]{list}, this, LJIIJJI, false, 14).isSupported && list != null) {
            for (LinkmicPositionItem linkmicPositionItem : list) {
                if (linkmicPositionItem.LIZJ == LinkmicPositionItem.LinkmicPositionStatus.BIDPAID.ordinal()) {
                    linkmicPositionItem.LIZJ = LinkmicPositionItem.LinkmicPositionStatus.NORMAL.ordinal();
                }
            }
        }
    }

    public final boolean LIZLLL(List<? extends LinkmicPositionItem> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, LJIIJJI, false, 20);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (list != null) {
            for (LinkmicPositionItem linkmicPositionItem : list) {
                if (linkmicPositionItem.LIZJ == LinkmicPositionItem.LinkmicPositionStatus.BIDPAID.ordinal()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m
    public final boolean LJIIL() {
        C80318HlI c80318HlI = this.LJIJJLI;
        if (c80318HlI != null && c80318HlI.f7278LJ) {
            return true;
        }
        return false;
    }

    private void LJJJJJL() {
        if (PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 36).isSupported) {
            return;
        }
        this.LJJJIL.post(new RunnableC80813HtH(this));
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m
    public final void LIZJ() {
        if (!PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 77).isSupported && !this.LJJJI) {
            LJJJJJL();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m
    public final void LJIIJ() {
        if (PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 106).isSupported) {
            return;
        }
        LJJJJL();
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m
    public final void LJIILLIIL() {
        C149592frr c149592frr;
        if (!PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 49).isSupported && (c149592frr = this.LJJIIZ) != null) {
            c149592frr.LIZLLL();
        }
    }

    public void LJIJ() {
        C4374l c4374l;
        if (!PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 135).isSupported && (c4374l = this.LJIIZILJ) != null) {
            c4374l.LIZIZ();
        }
    }

    public void LJJIZ() {
        ClipImageView clipImageView;
        if (!PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 48).isSupported && (clipImageView = this.LJJI) != null) {
            clipImageView.setActualImageResource(2130858088);
        }
    }

    public C4377t LJJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 54);
        if (proxy.isSupported) {
            return (C4377t) proxy.result;
        }
        return new C4377t(8);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    /* renamed from: getLifecycle */
    public Lifecycle mo29786getLifecycle() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 109);
        if (proxy.isSupported) {
            return (Lifecycle) proxy.result;
        }
        Lifecycle mo29786getLifecycle = this.LJJJJIZL.mo29786getLifecycle();
        Intrinsics.checkNotNullExpressionValue(mo29786getLifecycle, "");
        return mo29786getLifecycle;
    }

    private final AbstractC81935IRd LJJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 5);
        if (proxy.isSupported) {
            return (AbstractC81935IRd) proxy.result;
        }
        if (this.LJJJI) {
            return ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).voiceLiveThemeManager();
        }
        IService service = ServiceManager.getService(ILiveSDKService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        return ((ILiveSDKService) service).getAudienceThemeManager();
    }

    private int LJJJJJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 19);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        for (LinkmicPositionItem linkmicPositionItem : this.LJJIIZI) {
            if (linkmicPositionItem.LIZJ == LinkmicPositionItem.LinkmicPositionStatus.BIDPAID.ordinal()) {
                return linkmicPositionItem.LIZIZ;
            }
        }
        return -1;
    }

    private final void LJJJJLL() {
        MethodCollector.m14708i(2053);
        if (PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 84).isSupported) {
            MethodCollector.m14707o(2053);
        } else if (!C79242HLo.LJIIIZ()) {
            MethodCollector.m14707o(2053);
        } else if (this.LJJJI) {
            MethodCollector.m14707o(2053);
        } else {
            FrameLayout frameLayout = this.LJIILIIL;
            if (frameLayout != null) {
                frameLayout.removeView(this.LJJJJJ.LJJIJ());
                MethodCollector.m14707o(2053);
                return;
            }
            MethodCollector.m14707o(2053);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m
    public final void LJIIIZ() {
        MethodCollector.m14708i(2056);
        if (PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 102).isSupported) {
            MethodCollector.m14707o(2056);
            return;
        }
        FrameLayout frameLayout = this.LIZ;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        FrameLayout frameLayout2 = this.LIZ;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        if (abstractC4847b != null) {
            abstractC4847b.LIZIZ();
        }
        LJJJJLL();
        MethodCollector.m14707o(2056);
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m
    public final void LJIILJJIL() {
        if (PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 30).isSupported) {
            return;
        }
        this.LJIJ = true;
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        if (abstractC4847b != null) {
            abstractC4847b.LIZJ();
        }
        LJJIIJZLJL().LIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m
    public final void LJIILL() {
        if (PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 31).isSupported) {
            return;
        }
        this.LJIJ = false;
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        if (abstractC4847b != null) {
            abstractC4847b.LIZLLL();
        }
        LJJIIJZLJL().LIZIZ();
    }

    public boolean LJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 32);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C79046HEa LIZ = C79046HEa.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        if (LIZ.LIZJ()) {
            return false;
        }
        return true;
    }

    public boolean LJJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 65);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.TALK_ROOM_ENABLE_CHANGE_POSITION;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (!settingKey.getValue().booleanValue() || this.LJIJJ) {
            return false;
        }
        return true;
    }

    public final int LJJIJ() {
        C2WC<Integer> LIZLLL;
        Integer LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 10);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C4287a LIZ2 = C4287a.LIZJ.LIZ();
        if (LIZ2 == null || (LIZLLL = LIZ2.LIZLLL()) == null || (LIZ = LIZLLL.LIZ()) == null) {
            return 0;
        }
        return LIZ.intValue();
    }

    public final C4378a LJJIJIIJI() {
        AbstractC413392Xt<C4378a> LIZIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 17);
        if (proxy.isSupported) {
            return (C4378a) proxy.result;
        }
        C4287a LIZ = C4287a.LIZJ.LIZ();
        if (LIZ != null && (LIZIZ = LIZ.LIZIZ()) != null) {
            return LIZIZ.LIZIZ();
        }
        return null;
    }

    public final float LJJIJIL() {
        NextLiveData<C6062s> nextLiveData;
        C6062s value;
        Long l;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 21);
        if (proxy.isSupported) {
            return ((Float) proxy.result).floatValue();
        }
        C4378a LJJIJIIJI = LJJIJIIJI();
        if (LJJIJIIJI != null && (nextLiveData = LJJIJIIJI.LJIJ) != null && (value = nextLiveData.getValue()) != null && (l = value.LIZIZ) != null) {
            return (float) l.longValue();
        }
        return 0.0f;
    }

    public void LJJJI() {
        ConstraintLayout constraintLayout;
        View findViewById;
        if (!PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 52).isSupported && (constraintLayout = this.LJJJIL) != null && (findViewById = constraintLayout.findViewById(2131191540)) != null) {
            findViewById.setBackgroundResource(2130855347);
        }
    }

    public final boolean LJJJJI() {
        List<LinkPlayerInfo> LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJJI, false, BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        if (abstractC4847b == null || (LIZ = abstractC4847b.LIZ()) == null) {
            return false;
        }
        Iterator<T> it = LIZ.iterator();
        while (it.hasNext()) {
            if (((LinkPlayerInfo) it.next()).LJJIJLIJ > 0) {
                return true;
            }
        }
        return false;
    }

    private int LJJJJIZL() {
        NextLiveData<List<LinkmicPositionItem>> nextLiveData;
        List<LinkmicPositionItem> value;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 16);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C4378a LJJIJIIJI = LJJIJIIJI();
        if (LJJIJIIJI != null && (nextLiveData = LJJIJIIJI.LJIJJ) != null && (value = nextLiveData.getValue()) != null) {
            for (LinkmicPositionItem linkmicPositionItem : value) {
                if (linkmicPositionItem.LIZJ == LinkmicPositionItem.LinkmicPositionStatus.BIDPAID.ordinal()) {
                    return linkmicPositionItem.LIZIZ;
                }
            }
            return -1;
        }
        return -1;
    }

    private final void LJJJJL() {
        MethodCollector.m14708i(2052);
        if (PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 82).isSupported) {
            MethodCollector.m14707o(2052);
        } else if (!C79242HLo.LJIIIZ()) {
            MethodCollector.m14707o(2052);
        } else if (this.LJJJI) {
            MethodCollector.m14707o(2052);
        } else {
            SurfaceView LJJIJ = this.LJJJJJ.LJJIJ();
            FrameLayout frameLayout = this.LJIILIIL;
            if (frameLayout != null && frameLayout.indexOfChild(LJJIJ) == -1) {
                frameLayout.addView(LJJIJ);
            }
            LJJJJLI();
            MethodCollector.m14707o(2052);
        }
    }

    private final void LJJJJLI() {
        LiveCore LJJIJIL;
        ILayerControl layerControl;
        if (PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 83).isSupported) {
            return;
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_CORE_SINGLE_VIEW_MODE_TEST_COLOR_SWITCH;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue() && (LJJIJIL = this.LJJJJJ.LJJIJIL()) != null && (layerControl = LJJIJIL.getLayerControl()) != null) {
            VideoMixer videoMixer = ((ILayerControlExt) layerControl).getVideoMixer();
            videoMixer.setEnable(true);
            TEBundle tEBundle = new TEBundle();
            videoMixer.getParameter(tEBundle);
            tEBundle.setInt("vmixer_bg_color", 2003199);
            videoMixer.setParameter(tEBundle);
            tEBundle.release();
        }
    }

    private final void LJJJJZ() {
        MethodCollector.m14708i(2055);
        int i = 0;
        if (PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 90).isSupported) {
            MethodCollector.m14707o(2055);
            return;
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = new HSImageView(this.LJJJJ);
        }
        HSImageView hSImageView = this.LIZLLL;
        if (hSImageView != null) {
            hSImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayout = this.LIZ;
            if (frameLayout != null) {
                frameLayout.addView(hSImageView);
            }
            M0Q.LIZ(this.LIZLLL, this.LJJJJZI);
            if (!this.LJJJJLI) {
                i = 8;
            }
            hSImageView.setVisibility(i);
            MethodCollector.m14707o(2055);
            return;
        }
        MethodCollector.m14707o(2055);
    }

    public void LJIIJJI() {
        int LIZIZ;
        RecyclerView.ViewHolder viewHolder;
        if (PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 108).isSupported) {
            return;
        }
        for (String str : this.LJJJJJ.ai_().keySet()) {
            AbstractC4847b abstractC4847b = this.LJIILLIIL;
            if (abstractC4847b != null && (LIZIZ = abstractC4847b.LIZIZ(0L, str)) >= 0) {
                if (this.LJJIJL) {
                    C4374l c4374l = this.LJIIZILJ;
                    if (c4374l != null) {
                        c4374l.LIZJ(LIZIZ);
                    }
                } else {
                    RecyclerView recyclerView = this.LJIILJJIL;
                    if (recyclerView != null) {
                        viewHolder = recyclerView.findViewHolderForAdapterPosition(LIZIZ);
                    } else {
                        viewHolder = null;
                    }
                    if (viewHolder instanceof C80668Hqw) {
                        ((C80668Hqw) viewHolder).LJIILIIL();
                    }
                }
            }
        }
        this.LJJJJJ.ai_().clear();
        this.LJJJJJ.ah_().clear();
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m
    public final void LJIILIIL() {
        if (PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 87).isSupported) {
            return;
        }
        if (!this.LJJJI && C79046HEa.LIZ().LIZLLL) {
            return;
        }
        SettingKey<Integer> settingKey = LiveConfigSettingKeys.LIVE_INVITE_GUIDE_ANIM_REPEAT_COUNT;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        ((AbstractC81278I1w) Observable.timer(settingKey.getValue().intValue(), TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).m151as(C148062fT6.LIZ(this.LJJJJIZL))).LIZ(new C80655Hqj(this));
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m
    public final void LJIJI() {
        C4378a LJJIJIIJI;
        if (!PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 55).isSupported && !PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 25).isSupported) {
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_VIDEO_TALK_ROOM_REMOVE_OBSERVER;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue() && (LJJIJIIJI = LJJIJIIJI()) != null) {
                LJJIJIIJI.LJIJJ.removeObserver(this.LJJLIIIIJ);
                Observer<Integer> observer = this.LJJLIIIJ.get();
                if (observer != null) {
                    LJJIJIIJI.LJIILLIIL.removeObserver(observer);
                }
                LJJIJIIJI.LJIJJLI.removeObserver(this.LJJLI);
                LJJIJIIJI.LJIIZILJ.removeObserver(this.LJJL);
                LJJIJIIJI.LJIJ.removeObserver(this.LJJLIIIJILLIZJL);
            }
        }
    }

    public final C4806x LJJIIZ() {
        AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs;
        AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 4);
        if (proxy.isSupported) {
            return (C4806x) proxy.result;
        }
        if (this.LJJJI) {
            AbstractC4766ag LIZ = AbstractC4766ag.LIZ.LIZ();
            if (LIZ != null) {
                abstractC78986HBs2 = LIZ.LIZLLL();
            } else {
                abstractC78986HBs2 = null;
            }
            if (!(abstractC78986HBs2 instanceof C4806x)) {
                abstractC78986HBs2 = null;
            }
            return (C4806x) abstractC78986HBs2;
        }
        AbstractC4767ah LIZ2 = AbstractC4767ah.LIZIZ.LIZ();
        if (LIZ2 != null) {
            abstractC78986HBs = LIZ2.LJIIIIZZ();
        } else {
            abstractC78986HBs = null;
        }
        if (!(abstractC78986HBs instanceof C4806x)) {
            abstractC78986HBs = null;
        }
        return (C4806x) abstractC78986HBs;
    }

    public final boolean LJJIIZI() {
        List<LinkPlayerInfo> LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 8);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        if (abstractC4847b == null || (LIZ = abstractC4847b.LIZ()) == null) {
            return false;
        }
        for (LinkPlayerInfo linkPlayerInfo : LIZ) {
            Boolean bool = linkPlayerInfo.LJJIZ;
            Intrinsics.checkNotNullExpressionValue(bool, "");
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int LJJIJIIJIL() {
        NextLiveData<List<LinkmicPositionItem>> nextLiveData;
        C4378a LJJIJIIJI;
        NextLiveData<List<LinkmicPositionItem>> nextLiveData2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 18);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (LJJJJJ() != -1 && LJJJJIZL() != -1) {
            C4378a LJJIJIIJI2 = LJJIJIIJI();
            if (LJJIJIIJI2 != null && (nextLiveData = LJJIJIIJI2.LJIJJ) != null && nextLiveData.getValue() != null && (LJJIJIIJI = LJJIJIIJI()) != null && (nextLiveData2 = LJJIJIIJI.LJIJJ) != null) {
                nextLiveData2.setValue(null);
            }
            return LJJJJJ();
        } else if (LJJJJJ() != -1) {
            return LJJJJJ();
        } else {
            if (LJJJJIZL() == -1) {
                return -1;
            }
            return LJJJJIZL();
        }
    }

    public final boolean LJJIJL() {
        AbstractC4289e LIZIZ;
        AbstractC4289e LIZIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 23);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC4289e LIZIZ3 = C4287a.LIZJ.LIZIZ();
        if ((LIZIZ3 == null || !LIZIZ3.LIZIZ()) && (((LIZIZ = C4287a.LIZJ.LIZIZ()) == null || !LIZIZ.LIZLLL()) && ((LIZIZ2 = C4287a.LIZJ.LIZIZ()) == null || !LIZIZ2.LIZJ()))) {
            return false;
        }
        return true;
    }

    public final void LJJIL() {
        if (PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 41).isSupported) {
            return;
        }
        if (C79242HLo.LJIIIZ()) {
            AbstractC4964m.AbstractC4965a abstractC4965a = this.LJJJJJ;
            C79007HCn LJII = C79007HCn.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII, "");
            if (abstractC4965a.LJI(LJII.LIZJ) != null) {
                C79007HCn LJII2 = C79007HCn.LJII();
                Intrinsics.checkNotNullExpressionValue(LJII2, "");
                LIZ(LJII2.LIZJ, (View) null);
                return;
            }
            return;
        }
        HashMap<String, View> ai_ = this.LJJJJJ.ai_();
        C79007HCn LJII3 = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII3, "");
        View view = ai_.get(LJII3.LIZJ);
        if (!(view instanceof SurfaceView)) {
            view = null;
        }
        SurfaceView surfaceView = (SurfaceView) view;
        if (surfaceView != null) {
            C79007HCn LJII4 = C79007HCn.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII4, "");
            LIZ(LJII4.LIZJ, surfaceView);
        }
    }

    /* renamed from: LJ */
    public void mo15639LJ() {
        int i;
        RecyclerView.ViewHolder viewHolder;
        AbstractC4936a LIZ;
        List<LinkPlayerInfo> LIZ2;
        C4374l c4374l;
        if (PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 130).isSupported) {
            return;
        }
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        if (abstractC4847b != null) {
            i = abstractC4847b.getItemCount();
        } else {
            i = 9;
        }
        if (this.LJJIJL) {
            AbstractC4847b abstractC4847b2 = this.LJIILLIIL;
            if (abstractC4847b2 != null && (LIZ2 = abstractC4847b2.LIZ()) != null && (c4374l = this.LJIIZILJ) != null) {
                c4374l.LIZLLL(LIZ2);
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            RecyclerView recyclerView = this.LJIILJJIL;
            if (recyclerView != null) {
                viewHolder = recyclerView.findViewHolderForLayoutPosition(i2);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof C80668Hqw) {
                C80668Hqw c80668Hqw = (C80668Hqw) viewHolder;
                if (!PatchProxy.proxy(new Object[0], c80668Hqw, C80668Hqw.f7329LJ, false, 49).isSupported) {
                    if (AbstractC4936a.LIZ.LIZ(c80668Hqw.LJIJI) && (LIZ = AbstractC4936a.LIZ.LIZ()) != null) {
                        LIZ.LIZIZ();
                    }
                    c80668Hqw.LJIIJJI.setVisibility(0);
                    c80668Hqw.LJIIJJI.setAlpha(1.0f);
                    c80668Hqw.LJIIL.LJI();
                    c80668Hqw.LJIIIIZZ.setVisibility(8);
                    c80668Hqw.LJII.LIZ();
                    c80668Hqw.LJIJ = null;
                }
            } else if (viewHolder instanceof C80681Hr9) {
                C80681Hr9 c80681Hr9 = (C80681Hr9) viewHolder;
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i2)}, c80681Hr9, C80681Hr9.LIZJ, false, 13).isSupported) {
                    c80681Hr9.LIZJ(i2);
                }
            }
        }
    }

    public void LJI() {
        AbstractC78986HBs<LinkPlayerInfo> LJIIIIZZ;
        RecyclerView recyclerView;
        ViewTreeObserver viewTreeObserver;
        VoiceLiveTheme voiceLiveTheme;
        Dialog dialog;
        DialogFragment dialogFragment;
        AbstractC78986HBs<LinkPlayerInfo> LIZLLL;
        if (PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 56).isSupported) {
            return;
        }
        this.LJJJJI.put("feed_live_seat_list_model", new ArrayList());
        this.LJJJJI.put("cmd_video_talkroom_state_change", new C6008ch(1));
        this.LJJJJI.put("cmd_interact_player_view_change", new C4274a(false, 0));
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_VIDEO_TALK_FLOAT_LAYOUT_MIC_ALIGNMENT_OPT;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            this.LJJJJI.put("cmd_interact_player_view_height_change", 0);
        }
        this.LJJJIL.setVisibility(8);
        if (this.LJJJI) {
            AbstractC4766ag LIZ = AbstractC4766ag.LIZ.LIZ();
            if (LIZ != null && (LIZLLL = LIZ.LIZLLL()) != null) {
                LIZLLL.LIZIZ(LJIJJLI());
            }
        } else {
            AbstractC4767ah LIZ2 = AbstractC4767ah.LIZIZ.LIZ();
            if (LIZ2 != null && (LJIIIIZZ = LIZ2.LJIIIIZZ()) != null) {
                LJIIIIZZ.LIZIZ(LJIJJLI());
            }
        }
        this.LJJJJI.removeObserver("data_big_party_support_send_gift_to_linker", this.LJJJLZIJ);
        IMessageManager iMessageManager = this.LJII;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.LJIJI.dispose();
        DialogFragment dialogFragment2 = this.LJI;
        if (dialogFragment2 != null && (dialog = dialogFragment2.getDialog()) != null && dialog.isShowing() && (dialogFragment = this.LJI) != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
        this.LJI = null;
        RecyclerView recyclerView2 = this.LJIILJJIL;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(null);
        }
        C80318HlI c80318HlI = this.LJIJJLI;
        if (c80318HlI != null) {
            c80318HlI.LIZLLL();
        }
        this.LJIIIIZZ.LIZIZ();
        C81178HzA c81178HzA = this.LJJII;
        if (c81178HzA != null) {
            c81178HzA.LIZ();
        }
        this.LJJII = null;
        C4377t c4377t = this.LJJIII;
        if (c4377t != null) {
            c4377t.LIZJ();
        }
        AbstractC81935IRd LJJIIJ = LJJIIJ();
        if (LJJIIJ != null) {
            LJJIIJ.LIZ(this.LJJLIIIJJIZ, LJJJ());
        }
        long j = 0;
        if (this.LJJJJZ > 0) {
            boolean z = this.LJJJI;
            AbstractC81935IRd LJJIIJ2 = LJJIIJ();
            if (LJJIIJ2 != null) {
                voiceLiveTheme = LJJIIJ2.LIZ(LJJJ());
            } else {
                voiceLiveTheme = null;
            }
            int LJJJ = LJJJ();
            if (this.LJJJJZ > 0) {
                j = SystemClock.elapsedRealtime() - this.LJJJJZ;
            }
            C78828H5q.LIZ(z, voiceLiveTheme, LJJJ, j);
        }
        SettingKey<Boolean> settingKey2 = LiveSettingKeys.LIVE_VIDEO_TALK_FLOAT_LAYOUT_THEME_CLIP_OPT;
        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
        Boolean value2 = settingKey2.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "");
        if (value2.booleanValue() && (recyclerView = this.LJIILJJIL) != null && (viewTreeObserver = recyclerView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.LJJIJIIJIL);
        }
        LJJJJLL();
        AbstractC4936a LIZ3 = AbstractC4936a.LIZ.LIZ();
        if (LIZ3 != null) {
            C80945HvP.LIZ(LIZ3, (AbstractC4936a.AbstractC4937a) null, false, 2, (Object) null);
        }
        this.LJJIIJ.m15749LJ();
        RecyclerView recyclerView3 = this.LJIILJJIL;
        if (recyclerView3 != null) {
            recyclerView3.removeAllViews();
        }
    }

    public void LIZIZ() {
        AbstractC4847b abstractC4847b;
        RecyclerView.ViewHolder viewHolder;
        String str;
        List<LinkPlayerInfo> LIZ;
        C4374l c4374l;
        if (!PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 128).isSupported && (abstractC4847b = this.LJIILLIIL) != null) {
            int itemCount = abstractC4847b.getItemCount();
            if (this.LJJIJL) {
                AbstractC4847b abstractC4847b2 = this.LJIILLIIL;
                if (abstractC4847b2 != null && (LIZ = abstractC4847b2.LIZ()) != null && (c4374l = this.LJIIZILJ) != null) {
                    c4374l.LIZJ(LIZ);
                    return;
                }
                return;
            }
            for (int i = 0; i < itemCount; i++) {
                RecyclerView recyclerView = this.LJIILJJIL;
                if (recyclerView != null) {
                    viewHolder = recyclerView.findViewHolderForLayoutPosition(i);
                } else {
                    viewHolder = null;
                }
                if (viewHolder instanceof C80668Hqw) {
                    C80668Hqw c80668Hqw = (C80668Hqw) viewHolder;
                    if (!PatchProxy.proxy(new Object[0], c80668Hqw, C80668Hqw.f7329LJ, false, 47).isSupported && C80302Hl2.LIZ()) {
                        C6166j.C6167a c6167a = c80668Hqw.LJIJ;
                        if (c6167a != null && c6167a.LJIIJJI) {
                            str = C6840aw.m15457LJ();
                        } else {
                            C6166j.C6167a c6167a2 = c80668Hqw.LJIJ;
                            if (c6167a2 == null || !c6167a2.LJIILJJIL) {
                                str = "";
                            } else {
                                str = C6840aw.LJFF();
                            }
                        }
                        if (!c80668Hqw.LJIILJJIL() && str != null && str.length() != 0) {
                            AbstractDraweeController mo27965build = Fresco.newDraweeControllerBuilder().mo27963setUri(str).setAutoPlayAnimations(true).setControllerListener(new C80854Htw(c80668Hqw)).mo27965build();
                            Intrinsics.checkNotNullExpressionValue(mo27965build, "");
                            c80668Hqw.LJIIIIZZ.setController(mo27965build);
                            c80668Hqw.LJIIIIZZ.setVisibility(0);
                        }
                    }
                }
            }
        }
    }

    public void LJJIII() {
        AbstractC4289e LIZIZ;
        List<LinkmicPositionItem> mo15707LJ;
        ViewGroup.LayoutParams layoutParams;
        boolean z;
        boolean z2;
        boolean z3;
        int LIZIZ2;
        View findViewById;
        List<LinkPlayerInfo> list;
        List<LinkPlayerInfo> list2;
        AbstractC4847b abstractC4847b;
        if (PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 38).isSupported) {
            return;
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = this.LJJJIL.getHeight();
        StreamUrlExtra streamUrlExtraSafely = this.LJJJ.getStreamUrlExtraSafely();
        Intrinsics.checkNotNullExpressionValue(streamUrlExtraSafely, "");
        int LIZIZ3 = streamUrlExtraSafely.LIZIZ();
        StreamUrlExtra streamUrlExtraSafely2 = this.LJJJ.getStreamUrlExtraSafely();
        Intrinsics.checkNotNullExpressionValue(streamUrlExtraSafely2, "");
        int LIZ = streamUrlExtraSafely2.LIZ();
        String str = this.LJJIJLIJ;
        ALogger.m15797i(str, "streamWidth:" + LIZIZ3 + ", streamHeight:" + LIZ);
        this.LJJIFFI = new C4300c(intRef.element, LIZIZ3, LIZ, this.LJJJI);
        C4300c c4300c = this.LJJIFFI;
        if (c4300c != null) {
            int LIZ2 = c4300c.LIZ();
            c4300c.LIZIZ();
            RecyclerView recyclerView = this.LJIILJJIL;
            if (recyclerView != null && (layoutParams = recyclerView.getLayoutParams()) != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.height = c4300c.LIZJ();
                layoutParams2.width = LIZ2;
                layoutParams2.rightMargin = c4300c.LIZLLL();
                layoutParams2.bottomMargin = c4300c.m15774LJ();
                RecyclerView recyclerView2 = this.LJIILJJIL;
                if (recyclerView2 != null) {
                    recyclerView2.setLayoutParams(layoutParams2);
                }
                LIZ(layoutParams2);
                this.LJJJJI.put("cmd_interact_player_view_change", new C4274a(true, layoutParams2.width + layoutParams2.rightMargin + LK1.LIZLLL(8)));
                SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_VIDEO_TALK_FLOAT_LAYOUT_MIC_ALIGNMENT_OPT;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (value.booleanValue()) {
                    this.LJJJJI.put("cmd_interact_player_view_height_change", Integer.valueOf(intRef.element));
                }
                ArrayList arrayList = new ArrayList(6);
                int i = 0;
                do {
                    LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
                    linkPlayerInfo.LJIILIIL = null;
                    arrayList.add(linkPlayerInfo);
                    i++;
                } while (i <= 5);
                if (LJJIJLIJ() != 13) {
                    z = true;
                } else {
                    z = false;
                }
                C4806x LJJIIZ = LJJIIZ();
                if (LJJIIZ != null) {
                    z2 = LJJIIZ.LIZIZ(LJJIFFI(), arrayList, z, this.LJIL, this.LJJ);
                } else {
                    z2 = false;
                }
                C4806x LJJIIZ2 = LJJIIZ();
                if (LJJIIZ2 != null) {
                    z3 = LJJIIZ2.LIZIZ(this.LJJJ.getRoomId(), arrayList, z, this.LJJJ.ownerUserId, false, this.LJIL, this.LJJ, "start");
                } else {
                    z3 = false;
                }
                if (z2 || z3) {
                    C4A3.LJFF.LIZ().LIZ(true, this.LJJJ.getRoomId());
                }
                if (intRef.element > 0) {
                    LIZIZ2 = intRef.element;
                } else {
                    LIZIZ2 = LK5.LIZIZ();
                }
                Path path = new Path();
                path.addRect(0.0f, (LIZIZ2 - Integer.valueOf(layoutParams2.bottomMargin).intValue()) - Integer.valueOf(layoutParams2.height).intValue(), LK5.LIZJ(), LIZIZ2 - layoutParams2.bottomMargin, Path.Direction.CW);
                ClipImageView clipImageView = this.LJJI;
                if (clipImageView != null) {
                    clipImageView.setMClipPath(path);
                }
                C4377t c4377t = this.LJJIII;
                if (c4377t != null) {
                    HashMap<String, View> ai_ = this.LJJJJJ.ai_();
                    Intrinsics.checkNotNullExpressionValue(ai_, "");
                    this.LJIILLIIL = LIZ(arrayList, this, ai_, this.LJJJI, c4300c, c4377t);
                    AbstractC4847b abstractC4847b2 = this.LJIILLIIL;
                    if (abstractC4847b2 != null) {
                        abstractC4847b2.LIZIZ(C78538Gxg.LIZ(this.LJJJI));
                    }
                    if (this.LJIJ && (abstractC4847b = this.LJIILLIIL) != null) {
                        abstractC4847b.LIZJ();
                    }
                    if (C4378a.LJJIJIL.LIZJ() && C4378a.LJJIJIL.LIZLLL()) {
                        AbstractC4847b abstractC4847b3 = this.LJIILLIIL;
                        if (abstractC4847b3 != null) {
                            list = abstractC4847b3.LIZ();
                        } else {
                            list = null;
                        }
                        if (LIZ(list)) {
                            AbstractC4847b abstractC4847b4 = this.LJIILLIIL;
                            if (abstractC4847b4 != null) {
                                list2 = abstractC4847b4.LIZ();
                            } else {
                                list2 = null;
                            }
                            LIZIZ(list2);
                            AbstractC4847b abstractC4847b5 = this.LJIILLIIL;
                            if (abstractC4847b5 != null) {
                                abstractC4847b5.LIZ(new C80971Hvp());
                            }
                        }
                    }
                }
                RecyclerView recyclerView3 = this.LJIILJJIL;
                if (recyclerView3 != null && recyclerView3.getItemDecorationCount() == 0) {
                    RecyclerView recyclerView4 = this.LJIILJJIL;
                    if (recyclerView4 != null) {
                        recyclerView4.addItemDecoration(this.LJJJJLL);
                    }
                } else {
                    RecyclerView recyclerView5 = this.LJIILJJIL;
                    if (recyclerView5 != null && recyclerView5.getItemDecorationCount() > 0) {
                        RecyclerView recyclerView6 = this.LJIILJJIL;
                        if (recyclerView6 != null) {
                            recyclerView6.removeItemDecorationAt(0);
                        }
                        RecyclerView recyclerView7 = this.LJIILJJIL;
                        if (recyclerView7 != null) {
                            recyclerView7.addItemDecoration(this.LJJJJLL);
                        }
                    }
                }
                RecyclerView recyclerView8 = this.LJIILJJIL;
                if (recyclerView8 != null) {
                    recyclerView8.setAdapter(this.LJIILLIIL);
                }
                RecyclerView recyclerView9 = this.LJIILJJIL;
                if (recyclerView9 != null) {
                    recyclerView9.setItemAnimator(null);
                }
                RecyclerView recyclerView10 = this.LJIILJJIL;
                if (recyclerView10 != null) {
                    final Context context = this.LJJJJ;
                    recyclerView10.setLayoutManager(new LinearLayoutManager(context, 1, false, this, intRef) { // from class: com.bytedance.android.live.liveinteract.videotalk.ui.VideoCameraRoomWindowManagerV2$adjustWindowUI$$inlined$let$lambda$1
                        static {
                            Covode.recordClassIndex(30455);
                        }

                        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                        public final boolean canScrollVertically() {
                            return false;
                        }
                    });
                }
                LIZIZ(layoutParams2);
                ConstraintLayout constraintLayout = this.LJJJIL;
                if (constraintLayout != null && (findViewById = constraintLayout.findViewById(2131191540)) != null) {
                    findViewById.setVisibility(0);
                }
                LJJJI();
                LJJIL();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
            }
        }
        LJIJJLI().LIZ(this.LJJJJJ.LJI());
        if (this.LJJIIZI.isEmpty()) {
            AbstractC78986HBs<LinkPlayerInfo> LIZIZ4 = HKN.LIZIZ();
            if (LIZIZ4 != null && (mo15707LJ = LIZIZ4.mo15707LJ()) != null) {
                this.LJJIIZI.addAll(mo15707LJ);
            }
            if (LIZLLL(this.LJJIIZI) && (LIZIZ = C4287a.LIZJ.LIZIZ()) != null && !LIZIZ.LIZIZ()) {
                LIZJ(this.LJJIIZI);
            }
        }
        LJIJJLI().LIZIZ(this.LJJIIZI);
        this.LJJJJJ.LJJIJIIJIL();
        if (C79242HLo.LIZ(this.LJJJI)) {
            LJJIZ();
            if (!PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 50).isSupported) {
                AbstractC81935IRd LJJIIJ = LJJIIJ();
                if (LJJIIJ != null) {
                    LJJIIJ.LIZ(this.LJJLIIIJJIZ, LJJJ());
                }
                AbstractC81935IRd LJJIIJ2 = LJJIIJ();
                if (LJJIIJ2 != null) {
                    LJJIIJ2.LIZ(this, this.LJJLIIIJJIZ, LJJJ());
                }
            }
        }
    }

    public void LIZLLL() {
        AbstractC78986HBs<LinkPlayerInfo> LJIIIIZZ;
        AbstractC426192th<C8059n> ktvComponentSingerChangedEvent;
        Disposable subscribe;
        C4377t c4377t;
        AbstractC78986HBs<LinkPlayerInfo> LIZLLL;
        RecyclerView recyclerView;
        ViewTreeObserver viewTreeObserver;
        if (PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 27).isSupported) {
            return;
        }
        this.LJIILJJIL = (RecyclerView) this.LJJJIL.findViewById(2131188597);
        this.LJIIZILJ = new C4374l(this.LJIILJJIL, this.LJJJJIZL);
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_VIDEO_TALK_FLOAT_LAYOUT_THEME_CLIP_OPT;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue() && (recyclerView = this.LJIILJJIL) != null && (viewTreeObserver = recyclerView.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.LJJIJIIJIL);
        }
        this.LJIILIIL = (FrameLayout) this.LJJJIL.findViewById(2131189989);
        this.LIZ = (FrameLayout) this.LJJJIL.findViewById(2131166390);
        this.LIZIZ = this.LJJJIL.findViewById(2131166437);
        this.LIZJ = (HSImageView) this.LJJJIL.findViewById(2131166436);
        this.f26459LJ = (SeatAnimationView) this.LJJJIL.findViewById(2131166456);
        this.LJIILL = (PositionNameTv) this.LJJJIL.findViewById(2131194969);
        this.LJJI = (ClipImageView) this.LJJJIL.findViewById(2131196812);
        this.LJJIII = LJJJIL();
        LJJJJJL();
        if (this.LJJJI) {
            AbstractC4766ag LIZ = AbstractC4766ag.LIZ.LIZ();
            if (LIZ != null && (LIZLLL = LIZ.LIZLLL()) != null) {
                LIZLLL.LIZ(LJIJJLI());
            }
        } else {
            AbstractC4767ah LIZ2 = AbstractC4767ah.LIZIZ.LIZ();
            if (LIZ2 != null && (LJIIIIZZ = LIZ2.LJIIIIZZ()) != null) {
                LJIIIIZZ.LIZ(LJIJJLI());
            }
        }
        SeatAnimationView seatAnimationView = this.f26459LJ;
        if (seatAnimationView != null) {
            SeatAnimationView.LIZ(seatAnimationView, LJJIJLIJ(), false, true, null, 10, null);
        }
        SeatAnimationView seatAnimationView2 = this.f26459LJ;
        if (seatAnimationView2 != null) {
            seatAnimationView2.setEmojiCallback(new C80863Hu5(this));
        }
        SeatAnimationView seatAnimationView3 = this.f26459LJ;
        if (seatAnimationView3 != null && (c4377t = this.LJJIII) != null) {
            c4377t.LIZ(this.LJJJ.ownerUserId, seatAnimationView3);
        }
        this.LJII = (IMessageManager) this.LJJJJI.get("data_message_manager", (String) null);
        IMessageManager iMessageManager = this.LJII;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(MessageType.LINK_MIC_DYNAMIC_EMOJI_MESSAGE.LIZ(), this);
        }
        IMessageManager iMessageManager2 = this.LJII;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(MessageType.LINK_MIC_FRIEND_ONLINE_MESSAGE.LIZ(), this);
        }
        IMessageManager iMessageManager3 = this.LJII;
        if (iMessageManager3 != null) {
            iMessageManager3.addMessageListener(MessageType.LINK_MIC_GUIDE_MESSAGE.LIZ(), this);
        }
        this.LJIJI.add(C87010KQi.LIZ().LIZ(C5986ap.class).subscribe(new C80995HwD(this)));
        AbstractC5436a abstractC5436a = this.LJJJJJL;
        if (abstractC5436a != null && abstractC5436a.LJIILL() != null) {
            SettingKey<Boolean> settingKey2 = LiveConfigSettingKeys.VIDEO_TALK_AUDIO_STREAM_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            Boolean value2 = settingKey2.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            if (value2.booleanValue() && this.LJJJI) {
                LiveCore LJIILL = this.LJJJJJL.LJIILL();
                Intrinsics.checkNotNullExpressionValue(LJIILL, "");
                this.LJJII = new C81178HzA(LJIILL, LJJIFFI());
            }
        }
        if (C79242HLo.LJIIIZ() && !this.LJJJI) {
            C79046HEa LIZ3 = C79046HEa.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
            if (LIZ3.LIZJ()) {
                LJJJJL();
            }
        }
        IKtvService iKtvService = (IKtvService) ServiceManager.getService(IKtvService.class);
        if (iKtvService != null && (ktvComponentSingerChangedEvent = iKtvService.ktvComponentSingerChangedEvent()) != null && (subscribe = ktvComponentSingerChangedEvent.LIZIZ().subscribe(new C80991Hw9(this))) != null) {
            QB4.LIZ(subscribe, this.LJIJI);
        }
        AbstractC4936a LIZ4 = AbstractC4936a.LIZ.LIZ();
        if (LIZ4 != null) {
            C80945HvP.LIZ(LIZ4, (AbstractC4936a.AbstractC4937a) this, false, 2, (Object) null);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4848n
    public final void LIZ(C8851ep c8851ep) {
        if (PatchProxy.proxy(new Object[]{c8851ep}, this, LJIIJJI, false, 74).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8851ep);
        this.LJJJJI.put("cmd_show_dynamic_emoji_in_comment", c8851ep);
    }

    private boolean LIZLLL(LinkPlayerInfo linkPlayerInfo) {
        User LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{linkPlayerInfo}, this, LJIIJJI, false, 72);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (linkPlayerInfo != null && (LIZ = linkPlayerInfo.LIZ()) != null && LIZ.getId() == ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ()) {
            return true;
        }
        return false;
    }

    public boolean LJI(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LJIIJJI, false, 80);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C79007HCn LJII = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        return TextUtils.equals(str, LJII.LJIIIIZZ());
    }

    private final void LIZJ(LinkPlayerInfo linkPlayerInfo) {
        User LIZ;
        String str;
        boolean z = true;
        if (!PatchProxy.proxy(new Object[]{linkPlayerInfo}, this, LJIIJJI, false, 71).isSupported && linkPlayerInfo != null && (LIZ = linkPlayerInfo.LIZ()) != null) {
            if (LIZ.getId() != this.LJJJ.ownerUserId) {
                z = false;
            }
            if (LIZLLL(linkPlayerInfo)) {
                str = "oneself";
            } else if (z) {
                str = "anchor";
            } else {
                str = "audience";
            }
            long id = LIZ.getId();
            Long LJIIL = linkPlayerInfo.LJIIL();
            Intrinsics.checkNotNullExpressionValue(LJIIL, "");
            C78828H5q.LIZ(id, str, LJIIL.longValue());
        }
    }

    private final void LIZLLL(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LJIIJJI, false, 59).isSupported) {
            return;
        }
        if (C77919Gnh.LIZ(this.LJJJ)) {
            C116971W2r.LIZJ(new DialogC77887GnB(this.LJJJJ, this.LJJJJI, new C81052Hx8(this, i)));
        } else if (C77917Gnf.LIZ(this.LJJJ)) {
            AbstractC4767ah LIZ = AbstractC4767ah.LIZIZ.LIZ();
            if (LIZ != null) {
                LIZ.LIZ((C9605p) null);
            }
        } else if (C77919Gnh.LIZ()) {
            LIZ(this, i, false, 2, null);
        } else {
            C116971W2r.LIZJ(new DialogC77870Gmu(this.LJJJJ, this.LJJJJI, i + 1, false));
        }
    }

    /* renamed from: LJ */
    private final void m15679LJ(int i) {
        C4378a LJJIJIIJI;
        List<Pair<String, Boolean>> list;
        C4378a LJJIJIIJI2;
        List<Pair<String, Boolean>> list2;
        String str;
        List<LinkPlayerInfo> LIZ;
        LinkPlayerInfo linkPlayerInfo;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LJIIJJI, false, 62).isSupported && (LJJIJIIJI = LJJIJIIJI()) != null && (list = LJJIJIIJI.f26297LJ) != null) {
            Iterator<T> it = list.iterator();
            Pair pair = null;
            while (it.hasNext()) {
                Pair pair2 = (Pair) it.next();
                Object first = pair2.getFirst();
                AbstractC4847b abstractC4847b = this.LJIILLIIL;
                if (abstractC4847b != null && (LIZ = abstractC4847b.LIZ()) != null && (linkPlayerInfo = LIZ.get(i)) != null) {
                    str = linkPlayerInfo.LIZLLL();
                } else {
                    str = null;
                }
                if (Intrinsics.areEqual(first, str) && ((Boolean) pair2.getSecond()).booleanValue()) {
                    pair = pair2;
                }
            }
            if (pair != null && (LJJIJIIJI2 = LJJIJIIJI()) != null && (list2 = LJJIJIIJI2.f26297LJ) != null) {
                list2.remove(pair);
            }
        }
    }

    private final EPointF LJFF(int i) {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        EPointF LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LJIIJJI, false, 113);
        if (proxy.isSupported) {
            return (EPointF) proxy.result;
        }
        if (i == 0) {
            return LIZ(this.LIZ, new Point(0, -LK5.LIZ(80.0f)));
        }
        RecyclerView recyclerView = this.LJIILJJIL;
        if (recyclerView != null && (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i - 1)) != null) {
            View view = findViewHolderForAdapterPosition.itemView;
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{this, view, null, 2, null}, null, LJIIJJI, true, 112);
            if (proxy2.isSupported) {
                LIZ = (EPointF) proxy2.result;
            } else {
                LIZ = LIZ(view, (Point) null);
            }
            if (LIZ != null) {
                return LIZ;
            }
        }
        return new EPointF();
    }

    private final boolean LJII(String str) {
        List<Pair<String, Boolean>> list;
        C4378a LJJIJIIJI;
        List<Pair<String, Boolean>> list2;
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LJIIJJI, false, 98);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (str != null && !Intrinsics.areEqual(str, "0") && !Intrinsics.areEqual(str, "")) {
            Pair pair = null;
            C4378a LJJIJIIJI2 = LJJIJIIJI();
            if (LJJIJIIJI2 != null && (list = LJJIJIIJI2.f26297LJ) != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    Pair pair2 = (Pair) it.next();
                    if (Intrinsics.areEqual(pair2.getFirst(), str)) {
                        z = ((Boolean) pair2.getSecond()).booleanValue();
                        pair = pair2;
                    }
                }
                if (!z && pair != null && (LJJIJIIJI = LJJIJIIJI()) != null && (list2 = LJJIJIIJI.f26297LJ) != null) {
                    list2.remove(pair);
                }
            }
        }
        return z;
    }

    public PointF LIZIZ(long j) {
        int LIZ;
        PointF LJFF;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LJIIJJI, false, 131);
        if (proxy.isSupported) {
            return (PointF) proxy.result;
        }
        RecyclerView recyclerView = this.LJIILJJIL;
        if (recyclerView == null) {
            return null;
        }
        int[] iArr = new int[2];
        this.LJJJIL.getLocationOnScreen(iArr);
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        if (abstractC4847b != null && (LIZ = abstractC4847b.LIZ(j)) >= 0) {
            if (this.LJJIJL) {
                C4374l c4374l = this.LJIIZILJ;
                if (c4374l == null || (LJFF = c4374l.LJFF(LIZ)) == null) {
                    return null;
                }
                PointF pointF = new PointF();
                pointF.x = LJFF.x;
                pointF.y = LJFF.y - iArr[1];
                return pointF;
            }
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(LIZ);
            if (findViewHolderForAdapterPosition instanceof C80668Hqw) {
                PointF LJIILL = ((C80668Hqw) findViewHolderForAdapterPosition).LJIILL();
                PointF pointF2 = new PointF();
                pointF2.x = LJIILL.x;
                pointF2.y = LJIILL.y - iArr[1];
                return pointF2;
            }
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4848n
    /* renamed from: d_ */
    public final void mo15675d_(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LJIIJJI, false, 58).isSupported) {
            return;
        }
        C79046HEa LIZ = C79046HEa.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        Integer num = (Integer) LIZ.LJJIIZI;
        if (num == null) {
            return;
        }
        if (num.intValue() == 0) {
            AbstractC4767ah LIZ2 = AbstractC4767ah.LIZIZ.LIZ();
            if (LIZ2 != null) {
                C78352Gug.LIZ(LIZ2, i + 1, C78832H5u.LIZIZ, "video_pre_link_stub_click", null, null, 24, null);
            }
        } else if (num.intValue() == 1) {
            LIZLLL(i);
        }
    }

    public final void onEvent(C5986ap c5986ap) {
        if (PatchProxy.proxy(new Object[]{c5986ap}, this, LJIIJJI, false, 91).isSupported) {
            return;
        }
        int i = c5986ap.LIZ;
        if (i != 30) {
            if (i == 31 && !PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 93).isSupported) {
                this.LJJJJLI = false;
                HSImageView hSImageView = this.LIZLLL;
                if (hSImageView != null) {
                    hSImageView.setVisibility(8);
                }
            }
        } else if (!PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 92).isSupported) {
            this.LJJJJLI = true;
            HSImageView hSImageView2 = this.LIZLLL;
            if (hSImageView2 != null) {
                hSImageView2.setVisibility(0);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.emoji.c$b
    public final int LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LJIIJJI, false, 117);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return LK5.LIZLLL(2131429577);
    }

    public int LIZIZ(C4939e c4939e) {
        RecyclerView.ViewHolder viewHolder;
        Integer LIZIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4939e}, this, LJIIJJI, false, 134);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C106862S5w.LIZ(c4939e);
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        if (abstractC4847b == null) {
            return -1;
        }
        int LIZ = abstractC4847b.LIZ(c4939e.LIZIZ);
        if (this.LJJIJL) {
            C4374l c4374l = this.LJIIZILJ;
            if (c4374l == null || (LIZIZ = c4374l.LIZIZ(c4939e, LIZ)) == null) {
                return -1;
            }
            return LIZIZ.intValue();
        }
        RecyclerView recyclerView = this.LJIILJJIL;
        if (recyclerView != null) {
            viewHolder = recyclerView.findViewHolderForLayoutPosition(LIZ);
        } else {
            viewHolder = null;
        }
        if (!(viewHolder instanceof C80668Hqw)) {
            viewHolder = null;
        }
        C80668Hqw c80668Hqw = (C80668Hqw) viewHolder;
        if (c80668Hqw == null) {
            return -1;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c4939e}, c80668Hqw, C80668Hqw.f7329LJ, false, 11);
        if (proxy2.isSupported) {
            return ((Integer) proxy2.result).intValue();
        }
        C106862S5w.LIZ(c4939e);
        int i = c4939e.LJII;
        if (i != 0) {
            if (i != 1) {
                return -1;
            }
            return c80668Hqw.LJIIL.getState();
        }
        return c80668Hqw.LJIIJJI.getState();
    }

    public final void LIZJ(int i) {
        C4287a LIZ;
        C2WC<Integer> LIZLLL;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LJIIJJI, false, 11).isSupported && (LIZ = C4287a.LIZJ.LIZ()) != null && (LIZLLL = LIZ.LIZLLL()) != null) {
            LIZLLL.LIZ(Integer.valueOf(i));
        }
    }

    public boolean LJFF(String str) {
        List<LinkPlayerInfo> LIZ;
        Object obj;
        Integer valueOf;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LJIIJJI, false, 107);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        SettingKey<C6924de> settingKey = LiveConfigSettingKeys.LIVE_LINK_CAMERA_BACKUP_SWITCH;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (!settingKey.getValue().LIZ() && !((IKtvService) ServiceManager.getService(IKtvService.class)).currentIsMultipleKtvMode()) {
            return true;
        }
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        if (abstractC4847b != null && (LIZ = abstractC4847b.LIZ()) != null) {
            Iterator<T> it = LIZ.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((LinkPlayerInfo) obj).LIZLLL(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
            if (linkPlayerInfo != null && (valueOf = Integer.valueOf(linkPlayerInfo.m15703LJ())) != null && (valueOf.intValue() == 1 || valueOf.intValue() == 3)) {
                return true;
            }
        }
        return false;
    }

    public int LIZ(long j) {
        Integer valueOf;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LJIIJJI, false, 119);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (j == this.LJJJ.ownerUserId) {
            return 0;
        }
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        if (abstractC4847b != null && (valueOf = Integer.valueOf(abstractC4847b.LIZ(j))) != null && valueOf.intValue() >= 0) {
            return valueOf.intValue() + 1;
        }
        return -1;
    }

    public FrameLayout.LayoutParams LIZIZ(View view) {
        Object obj;
        int LIZIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, this, LJIIJJI, false, 85);
        if (proxy.isSupported) {
            return (FrameLayout.LayoutParams) proxy.result;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (view != null) {
            obj = view.getTag();
        } else {
            obj = null;
        }
        if (!(obj instanceof Pair)) {
            obj = null;
        }
        Pair pair = (Pair) obj;
        if (pair != null && this.LIZ != null && ((Number) pair.getFirst()).intValue() > 0 && ((Number) pair.getSecond()).intValue() > 0) {
            C4300c c4300c = this.LJJIFFI;
            if (c4300c != null) {
                LIZIZ = c4300c.LIZJ();
            } else {
                LIZIZ = LK5.LIZIZ() - LK1.LIZLLL(160);
            }
            layoutParams = new FrameLayout.LayoutParams((LIZIZ * 9) / 16, LIZIZ);
        }
        layoutParams.gravity = 8388613;
        return layoutParams;
    }

    public final void LIZJ(long j) {
        Object obj;
        int i;
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LJIIJJI, false, 66).isSupported || !LJJII()) {
            return;
        }
        this.LJIJJ = true;
        long currentTimeMillis = System.currentTimeMillis();
        this.LJIJI.add(((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).updateLinkerPosition(this.LJJJ.getId(), this.LJJJ.getId(), j, 8L).subscribeOn(Schedulers.m138io()).flatMap(C79268HMo.LIZIZ).observeOn(AndroidSchedulers.mainThread()).subscribe(new C79197HJv(this, j, currentTimeMillis), new C78140GrG(this, j, currentTimeMillis)));
        AbstractC4767ah LIZ = AbstractC4767ah.LIZIZ.LIZ();
        if (LIZ != null) {
            ArrayList<LinkPlayerInfo> LJI = ((AbstractC4964m.AbstractC4965a) LIZ).LJI();
            Intrinsics.checkNotNullExpressionValue(LJI, "");
            Iterator<T> it = LJI.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
                    Intrinsics.checkNotNullExpressionValue(linkPlayerInfo, "");
                    User LIZ2 = linkPlayerInfo.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                    if (LIZ2.getId() == ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) obj;
            if (linkPlayerInfo2 != null) {
                i = linkPlayerInfo2.LJIIJJI;
            } else {
                i = -1;
            }
            C78828H5q.LIZ(i, (int) j, (Integer) null, (Integer) null, 12, (Object) null);
        }
    }

    /* renamed from: LJ */
    public void mo15638LJ(C6166j c6166j) {
        RecyclerView.ViewHolder viewHolder;
        Object obj;
        AbstractC4936a LIZ;
        User LIZ2;
        List<LinkPlayerInfo> LIZ3;
        C4374l c4374l;
        if (PatchProxy.proxy(new Object[]{c6166j}, this, LJIIJJI, false, 129).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6166j);
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        if (abstractC4847b != null) {
            int itemCount = abstractC4847b.getItemCount();
            if (this.LJJIJL) {
                AbstractC4847b abstractC4847b2 = this.LJIILLIIL;
                if (abstractC4847b2 != null && (LIZ3 = abstractC4847b2.LIZ()) != null && (c4374l = this.LJIIZILJ) != null) {
                    c4374l.m15745LJ(LIZ3, c6166j);
                    return;
                }
                return;
            }
            for (int i = 0; i < itemCount; i++) {
                RecyclerView recyclerView = this.LJIILJJIL;
                if (recyclerView != null) {
                    viewHolder = recyclerView.findViewHolderForLayoutPosition(i);
                } else {
                    viewHolder = null;
                }
                if (viewHolder instanceof C80668Hqw) {
                    C80668Hqw c80668Hqw = (C80668Hqw) viewHolder;
                    if (!PatchProxy.proxy(new Object[]{c6166j}, c80668Hqw, C80668Hqw.f7329LJ, false, 48).isSupported) {
                        C106862S5w.LIZ(c6166j);
                        if (!c80668Hqw.LJIILJJIL()) {
                            List<C6166j.C6167a> list = c6166j.LJFF;
                            Intrinsics.checkNotNullExpressionValue(list, "");
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    long j = ((C6166j.C6167a) obj).LIZIZ;
                                    LinkPlayerInfo linkPlayerInfo = c80668Hqw.LJIJI;
                                    if (linkPlayerInfo != null && (LIZ2 = linkPlayerInfo.LIZ()) != null && j == LIZ2.getId()) {
                                        break;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            C6166j.C6167a c6167a = (C6166j.C6167a) obj;
                            if (c6167a != null) {
                                if (c80668Hqw.LJIIIIZZ.LIZ()) {
                                    c80668Hqw.LJIIIIZZ.setController(null);
                                    c80668Hqw.LJIIIIZZ.setVisibility(8);
                                    c80668Hqw.LJIIL.LJFF();
                                } else if (!UIUtils.isViewVisible(c80668Hqw.LJIIL)) {
                                    C80668Hqw.LIZ(c80668Hqw, c6167a, "refresh_result", false, 4, null);
                                } else if (UIUtils.isViewVisible(c80668Hqw.LJIIL)) {
                                    c80668Hqw.LJIIJJI.setVisibility(8);
                                }
                                if (AbstractC4936a.LIZ.LIZ(c80668Hqw.LJIJI)) {
                                    AbstractC4936a LIZ4 = AbstractC4936a.LIZ.LIZ();
                                    if (LIZ4 != null) {
                                        C4939e LIZ5 = C4939e.LJIIIZ.LIZ(c6167a);
                                        LIZ5.LIZLLL = 0L;
                                        C80945HvP.LIZ(LIZ4, LIZ5, false, 2, (Object) null);
                                    }
                                    if (!C4891b.LIZJ.LIZJ() && (LIZ = AbstractC4936a.LIZ.LIZ()) != null) {
                                        LIZ.LIZIZ();
                                    }
                                } else {
                                    c80668Hqw.LJIIL.LIZIZ(c6167a);
                                }
                                c80668Hqw.LJIIL.LIZJ(c6167a);
                                if (!c80668Hqw.LJIILIIL) {
                                    c80668Hqw.LJII.LIZ(c6167a);
                                }
                                c80668Hqw.LJIJ = c6167a;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
        if (r8.LIZ(r4, r0) == true) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMessage(com.p1594ss.ugc.live.sdk.message.data.IMessage r10) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.videotalk.p391ui.C4966r.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    public void LIZJ(C6166j c6166j) {
        RecyclerView.ViewHolder viewHolder;
        List<C6166j.C6167a> list;
        User LIZ;
        List<LinkPlayerInfo> LIZ2;
        C4374l c4374l;
        if (PatchProxy.proxy(new Object[]{c6166j}, this, LJIIJJI, false, 126).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6166j);
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        if (abstractC4847b != null) {
            int itemCount = abstractC4847b.getItemCount();
            if (this.LJJIJL) {
                AbstractC4847b abstractC4847b2 = this.LJIILLIIL;
                if (abstractC4847b2 != null && (LIZ2 = abstractC4847b2.LIZ()) != null && (c4374l = this.LJIIZILJ) != null) {
                    c4374l.LIZJ(LIZ2, c6166j);
                    return;
                }
                return;
            }
            for (int i = 0; i < itemCount; i++) {
                RecyclerView recyclerView = this.LJIILJJIL;
                Object obj = null;
                if (recyclerView != null) {
                    viewHolder = recyclerView.findViewHolderForLayoutPosition(i);
                } else {
                    viewHolder = null;
                }
                if (viewHolder instanceof C80668Hqw) {
                    C80668Hqw c80668Hqw = (C80668Hqw) viewHolder;
                    if (!PatchProxy.proxy(new Object[]{c6166j}, c80668Hqw, C80668Hqw.f7329LJ, false, 44).isSupported) {
                        C106862S5w.LIZ(c6166j);
                        if (!c80668Hqw.LJIILJJIL() && (list = c6166j.LJFF) != null) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Object next = it.next();
                                long j = ((C6166j.C6167a) next).LIZIZ;
                                LinkPlayerInfo linkPlayerInfo = c80668Hqw.LJIJI;
                                if (linkPlayerInfo != null && (LIZ = linkPlayerInfo.LIZ()) != null && j == LIZ.getId()) {
                                    obj = next;
                                    break;
                                }
                            }
                            C6166j.C6167a c6167a = (C6166j.C6167a) obj;
                            if (c6167a != null && c6167a.LJIIJJI) {
                                c80668Hqw.LJIIL.LIZJ(c6167a);
                                c80668Hqw.LJIIL.LJFF();
                            }
                        }
                    }
                }
            }
        }
    }

    public int LIZLLL(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LJIIJJI, false, 105);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC4847b abstractC4847b = this.LJIILLIIL;
        if (abstractC4847b != null) {
            return abstractC4847b.LIZIZ(0L, str);
        }
        return -1;
    }

    /* renamed from: LJ */
    public final void m15676LJ(List<LinkPlayerInfo> list) {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        C80736Hs2 c80736Hs2;
        if (PatchProxy.proxy(new Object[]{list}, this, LJIIJJI, false, 35).isSupported) {
            return;
        }
        if (this.LJJIJL) {
            C4374l c4374l = this.LJIIZILJ;
            if (c4374l != null) {
                c4374l.LIZ(list);
                return;
            }
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RecyclerView recyclerView = this.LJIILJJIL;
            if (recyclerView != null && (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i)) != null && (findViewHolderForAdapterPosition instanceof C80681Hr9) && list.get(i).LIZ() != null) {
                C80681Hr9 c80681Hr9 = (C80681Hr9) findViewHolderForAdapterPosition;
                if (!PatchProxy.proxy(new Object[0], c80681Hr9, C80681Hr9.LIZJ, false, 9).isSupported) {
                    if (c80681Hr9.LJIIIZ.LJJII) {
                        c80681Hr9.LJIIIZ.LIZLLL();
                        c80681Hr9.LJIIIZ.mo21249LJ();
                    }
                    C80736Hs2 c80736Hs22 = c80681Hr9.LJIIL;
                    if (c80736Hs22 != null && c80736Hs22.LIZIZ() && (c80736Hs2 = c80681Hr9.LJIIL) != null) {
                        c80736Hs2.LIZJ();
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.emoji.c$b
    public final EPointF LIZIZ(int i, int i2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LJIIJJI, false, 114);
        if (proxy.isSupported) {
            return (EPointF) proxy.result;
        }
        return LJFF(i);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.emoji.c$b
    public final EPointF LIZJ(int i, int i2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LJIIJJI, false, 115);
        if (proxy.isSupported) {
            return (EPointF) proxy.result;
        }
        return LJFF(i2);
    }

    private final EPointF LIZ(View view, Point point) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, point}, this, LJIIJJI, false, 111);
        if (proxy.isSupported) {
            return (EPointF) proxy.result;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        if (view != null && view.getGlobalVisibleRect(rect) && this.LJJJJL.getGlobalVisibleRect(rect2)) {
            rect.offset(-rect2.left, -rect2.top);
        }
        EPointF ePointF = new EPointF();
        ePointF.x = rect.centerX();
        ePointF.y = rect.centerY();
        if (point != null) {
            ePointF.x += point.x;
            ePointF.y += point.y;
        }
        return ePointF;
    }

    private final void LIZLLL(String str, boolean z) {
        AbstractC4847b abstractC4847b;
        List<LinkPlayerInfo> LIZ;
        if (!PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LJIIJJI, false, 97).isSupported && (abstractC4847b = this.LJIILLIIL) != null && (LIZ = abstractC4847b.LIZ()) != null) {
            for (LinkPlayerInfo linkPlayerInfo : LIZ) {
                if (Intrinsics.areEqual(linkPlayerInfo.LIZLLL(), str) && linkPlayerInfo.LJJIJLIJ > 0) {
                    linkPlayerInfo.LJJIZ = Boolean.valueOf(z);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.emoji.c$b
    public final int LIZLLL(int i, int i2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LJIIJJI, false, 118);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return LK5.LIZLLL(2131429576);
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.battle.j$a
    public final PointF LIZ(PointF pointF, PointF pointF2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pointF, pointF2}, this, LJIIJJI, false, 132);
        if (proxy.isSupported) {
            return (PointF) proxy.result;
        }
        C106862S5w.LIZ(pointF, pointF2);
        PointF pointF3 = new PointF();
        pointF3.x = ((pointF.x + pointF2.x) / 2.0f) - LK5.LIZ(50.0f);
        pointF3.y = (pointF.y + pointF2.y) / 2.0f;
        return pointF3;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.emoji.c$b
    public final void LIZIZ(int i, long j) {
        C4377t c4377t;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), new Long(j)}, this, LJIIJJI, false, OpenAuthTask.f22015g).isSupported && (c4377t = this.LJJIII) != null) {
            c4377t.LIZ(j);
        }
    }

    public void LIZJ(String str, boolean z) {
        ILayerControl layerControl;
        ILayerControl layerControl2;
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LJIIJJI, false, 81).isSupported) {
            return;
        }
        ILayerControl.ILayer iLayer = null;
        if (TextUtils.equals(str, C79007HCn.LJII().LIZLLL)) {
            LiveCore LJJIJIL = this.LJJJJJ.LJJIJIL();
            if (LJJIJIL != null && (layerControl2 = LJJIJIL.getLayerControl()) != null) {
                iLayer = layerControl2.getLocalOriginLayer();
            }
        } else {
            LiveCore LJJIJIL2 = this.LJJJJJ.LJJIJIL();
            if (LJJIJIL2 != null && (layerControl = LJJIJIL2.getLayerControl()) != null) {
                iLayer = layerControl.getLayer(str);
            }
        }
        RecyclerView recyclerView = this.LJIILJJIL;
        if (recyclerView != null) {
            recyclerView.post(new RunnableC80871HuD(this, iLayer, str, z));
        }
    }

    public static /* synthetic */ void LIZ(C4966r c4966r, int i, boolean z, int i2, Object obj) {
        if (PatchProxy.proxy(new Object[]{c4966r, Integer.valueOf(i), (byte) 0, 2, null}, null, LJIIJJI, true, 64).isSupported) {
            return;
        }
        c4966r.LIZIZ(i, false);
    }

    public AbstractC4847b LIZ(List<LinkPlayerInfo> list, C4966r c4966r, Map<String, ? extends View> map, boolean z, C4300c c4300c, C4377t c4377t) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, c4966r, map, Byte.valueOf(z ? (byte) 1 : (byte) 0), c4300c, c4377t}, this, LJIIJJI, false, 53);
        if (proxy.isSupported) {
            return (AbstractC4847b) proxy.result;
        }
        C106862S5w.LIZ(list, c4966r, map, c4300c, c4377t);
        if (this.LJJIJL) {
            HashMap<String, View> ai_ = this.LJJJJJ.ai_();
            Intrinsics.checkNotNullExpressionValue(ai_, "");
            return new C80686HrE(list, this, ai_, z, c4300c, 0, c4377t, this.LJIIZILJ, this.LJJIIJ, 32);
        }
        HashMap<String, View> ai_2 = this.LJJJJJ.ai_();
        Intrinsics.checkNotNullExpressionValue(ai_2, "");
        return new C4849s(list, this, ai_2, z, c4300c, 0, c4377t, this.LJJIIJ, 32);
    }

    public C4966r(Room room, boolean z, ConstraintLayout constraintLayout, Context context, DataCenter dataCenter, LifecycleOwner lifecycleOwner, AbstractC4964m.AbstractC4965a abstractC4965a, AbstractC5436a abstractC5436a, View view) {
        C4378a LJJIJIIJI;
        C106862S5w.LIZ(room, constraintLayout, context, dataCenter, lifecycleOwner, abstractC4965a, view);
        this.LJJJ = room;
        this.LJJJI = z;
        this.LJJJIL = constraintLayout;
        this.LJJJJ = context;
        this.LJJJJI = dataCenter;
        this.LJJJJIZL = lifecycleOwner;
        this.LJJJJJ = abstractC4965a;
        this.LJJJJJL = abstractC5436a;
        this.LJJJJL = view;
        this.LJIIIIZZ = new C149557frI(this.LJJJJ, this.LJJJI, this.LJJJJJL);
        this.LJJIIJ = new C4369e(Long.valueOf(this.LJJJ.getId()), Long.valueOf(this.LJJJ.ownerUserId), 0, 4);
        this.LJJJLL = new GestureDetector(this.LJJJJ, new C79234HLg(this));
        HSImageView hSImageView = (HSImageView) this.LJJJJL.findViewById(2131184921);
        HSImageView hSImageView2 = (HSImageView) this.LJJJJL.findViewById(2131189353);
        HSImageView hSImageView3 = (HSImageView) this.LJJJJL.findViewById(2131187290);
        Intrinsics.checkNotNullExpressionValue(hSImageView, "");
        Intrinsics.checkNotNullExpressionValue(hSImageView2, "");
        Intrinsics.checkNotNullExpressionValue(hSImageView3, "");
        this.LJJIIZ = new C149592frr(this, hSImageView, hSImageView2, hSImageView3, (HSImageView) this.LJJJJL.findViewById(2131189352), (HSImageView) this.LJJJJL.findViewById(2131187289));
        this.LJJJJI.observe("data_big_party_support_send_gift_to_linker", this.LJJJLZIJ).observe("cmd_show_anchor_pause_tip_view", this.LJJJLZIJ);
        if (!PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 24).isSupported) {
            Context context2 = this.LJJJJ;
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) (!(context2 instanceof LifecycleOwner) ? null : context2);
            if (lifecycleOwner2 != null && (LJJIJIIJI = LJJIJIIJI()) != null) {
                LJJIJIIJI.LJIJJ.observe(lifecycleOwner2, this.LJJLIIIIJ);
                Observer<Integer> observer = this.LJJLIIIJ.get();
                if (observer != null) {
                    LJJIJIIJI.LJIILLIIL.observe(lifecycleOwner2, observer);
                }
                LJJIJIIJI.LJIJJLI.observe(lifecycleOwner2, this.LJJLI);
                LJJIJIIJI.LJIIZILJ.observe(lifecycleOwner2, this.LJJL);
                LJJIJIIJI.LJIJ.observe(lifecycleOwner2, this.LJJLIIIJILLIZJL);
            }
        }
        this.LJJLIIIJJI = 3;
        this.LJJLIIIJJIZ = new C80967Hvl(this);
        this.LJJLIIIJL = true;
        this.LJJIZ = new HashMap<>(9);
    }
}
