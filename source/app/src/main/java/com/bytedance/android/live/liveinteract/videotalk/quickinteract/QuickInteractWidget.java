package com.bytedance.android.live.liveinteract.videotalk.quickinteract;

import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.plantform.api.LinkApi;
import com.bytedance.android.live.liveinteract.videotalk.quickinteract.AbstractC4936a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.AbstractC413392Xt;
import p003X.AbstractC4569445g;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C414642b4;
import p003X.C423702pg;
import p003X.C440683by;
import p003X.C77903GnR;
import p003X.C78662Gzg;
import p003X.C78663Gzh;
import p003X.C78664Gzi;
import p003X.C79242HLo;
import p003X.C88306Kqq;
import p003X.IQV;
import p003X.IQX;
import p003X.QB4;

/* loaded from: classes3.dex */
public final class QuickInteractWidget extends RoomWidget implements AbstractC4936a, AbstractC4569445g, OnMessageListener {
    public static ChangeQuickRedirect LIZIZ;

    /* renamed from: LJ */
    public static long f26448LJ = -1;
    public AbstractC4936a.AbstractC4937a LIZLLL;
    public final LinkedList<C4939e> LIZJ = new LinkedList<>();
    public CompositeDisposable LJFF = new CompositeDisposable();

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 20).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    static {
        Covode.recordClassIndex(30330);
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.quickinteract.AbstractC4936a
    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 9).isSupported) {
            return;
        }
        LJFF();
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.quickinteract.AbstractC4936a
    public final boolean LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 16);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return this.LIZJ.isEmpty();
    }

    public final boolean LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C423702pg.LIZIZ(this.dataCenter, false, 1, null);
    }

    /* renamed from: LJ */
    public final void m15683LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 18).isSupported) {
            return;
        }
        LIZIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.quickinteract.AbstractC4936a
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 17).isSupported) {
            return;
        }
        C4939e c4939e = (C4939e) CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) this.LIZJ);
        this.LIZJ.clear();
        if (c4939e != null) {
            c4939e.LIZLLL = 0L;
            AbstractC4936a.AbstractC4937a abstractC4937a = this.LIZLLL;
            if (abstractC4937a != null) {
                abstractC4937a.LIZ(c4939e);
            }
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        AbstractC413392Xt<IMessageManager> LJIILLIIL;
        IMessageManager LIZIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 4).isSupported) {
            return;
        }
        super.onDestroy();
        LIZIZ();
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJIILLIIL = LJJJI.LJIILLIIL()) != null && (LIZIZ2 = LJIILLIIL.LIZIZ()) != null) {
            LIZIZ2.removeMessageListener(this);
        }
        this.LJFF.clear();
    }

    private final void LJFF() {
        AbstractC4936a.AbstractC4937a abstractC4937a;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 7).isSupported || this.LIZJ.isEmpty()) {
            return;
        }
        C4939e c4939e = (C4939e) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) this.LIZJ);
        if (c4939e != null && ((abstractC4937a = this.LIZLLL) == null || abstractC4937a.LIZIZ(c4939e) != 0)) {
            return;
        }
        C4939e removeFirst = this.LIZJ.removeFirst();
        AbstractC4936a.AbstractC4937a abstractC4937a2 = this.LIZLLL;
        if (abstractC4937a2 != null) {
            Intrinsics.checkNotNullExpressionValue(removeFirst, "");
            abstractC4937a2.LIZ(removeFirst);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        AbstractC413392Xt<IMessageManager> LJIILLIIL;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 2).isSupported) {
            return;
        }
        super.onCreate();
        Pair LIZ = IQV.LIZ((Function0) QuickInteractWidget$onCreate$pair$1.INSTANCE);
        ((C4938c) LIZ.getFirst()).LIZ().LIZIZ(this);
        IQX.LIZ((C13491f) LIZ.getFirst(), "quick_interact_service");
        this.LJFF.add((Disposable) LIZ.getSecond());
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJIILLIIL = LJJJI.LJIILLIIL()) != null) {
            LJIILLIIL.LIZ(new QuickInteractWidget$onCreate$1(this));
        }
        LIZIZ();
    }

    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        AbstractC4936a.AbstractC4937a abstractC4937a;
        if (!PatchProxy.proxy(new Object[]{iMessage}, this, LIZIZ, false, 3).isSupported && (iMessage instanceof C440683by) && (abstractC4937a = this.LIZLLL) != null) {
            abstractC4937a.LIZ((C440683by) iMessage);
        }
    }

    private final void LIZIZ(C4939e c4939e) {
        if (PatchProxy.proxy(new Object[]{c4939e}, this, LIZIZ, false, 6).isSupported) {
            return;
        }
        C4939e c4939e2 = (C4939e) CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) this.LIZJ);
        if (c4939e2 != null && !c4939e2.LIZ()) {
            this.LIZJ.removeLast();
        }
        int size = this.LIZJ.size();
        SettingKey<Integer> settingKey = LiveConfigSettingKeys.LIVE_QUICK_INTERACT_MAX_QUEUE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Integer value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (size > value.intValue()) {
            this.LIZJ.removeFirst();
        }
        this.LIZJ.addLast(c4939e);
        LJFF();
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.quickinteract.AbstractC4936a
    public final void LIZ(C4939e c4939e) {
        if (PatchProxy.proxy(new Object[]{c4939e}, this, LIZIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4939e);
        LJFF();
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.quickinteract.AbstractC4936a
    public final void LIZ(String str) {
        long j;
        C2WC<Room> LIZ;
        Room LIZ2;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        SettingKey<String> settingKey = LiveConfigSettingKeys.LIVE_LYNX_QUICK_INTERACT_LIST_URL;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        String value = settingKey.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ3 != null && (LIZ = LIZ3.LIZ()) != null && (LIZ2 = LIZ.LIZ()) != null) {
            j = LIZ2.getId();
        } else {
            j = 0;
        }
        linkedHashMap.put("room_id", String.valueOf(j));
        linkedHashMap.put("emoji_id", str);
        ((ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class)).handle(this.context, C414642b4.LIZIZ(value, linkedHashMap));
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.quickinteract.AbstractC4936a
    public final void LIZ(AbstractC4936a.AbstractC4937a abstractC4937a, boolean z) {
        if (PatchProxy.proxy(new Object[]{abstractC4937a, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 19).isSupported) {
            return;
        }
        LIZIZ();
        this.LIZLLL = abstractC4937a;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.quickinteract.AbstractC4936a
    public final void LIZ(C4939e c4939e, boolean z) {
        if (PatchProxy.proxy(new Object[]{c4939e, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4939e);
        if (!z) {
            LIZIZ(c4939e);
            return;
        }
        C4939e c4939e2 = (C4939e) CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) this.LIZJ);
        if (c4939e2 != null && TextUtils.equals(c4939e2.LIZJ, c4939e.LIZJ)) {
            ALogger.m15800e("quick_interact_service", C0002O.m25084C("drop task for equal, task: ", c4939e.LIZJ, "  last: ", c4939e2.LIZJ));
        } else {
            LIZIZ(c4939e);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.quickinteract.AbstractC4936a
    public final void LIZ(C4939e c4939e, String str, Function1<? super Integer, Unit> function1) {
        long j;
        C2WC<Room> LIZ;
        Room LIZ2;
        if (PatchProxy.proxy(new Object[]{c4939e, str, function1}, this, LIZIZ, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4939e, str, function1);
        if (f26448LJ == -1) {
            long currentTimeMillis = System.currentTimeMillis();
            LinkApi linkApi = (LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class);
            C5923dp LJJJI = LJJJI();
            if (LJJJI != null && (LIZ = LJJJI.LIZ()) != null && (LIZ2 = LIZ.LIZ()) != null) {
                j = LIZ2.getId();
            } else {
                j = 0;
            }
            QB4.LIZ(linkApi.getTalkRoomEmojiList(j, C79242HLo.LJIIJ(), 1, 4).compose(C100839PnV.LIZJ()).subscribe(new C78662Gzg(this, currentTimeMillis, c4939e, str, function1), new C77903GnR<>(currentTimeMillis, function1)), this.LJFF);
            return;
        }
        LIZ(c4939e.f26449LJ, f26448LJ, str, function1);
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.quickinteract.AbstractC4936a
    public final void LIZ(long j, long j2, String str, Function1<? super Integer, Unit> function1) {
        long j3;
        C2WC<Room> LIZ;
        Room LIZ2;
        if (PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), str, function1}, this, LIZIZ, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, function1);
        long currentTimeMillis = System.currentTimeMillis();
        LinkApi linkApi = (LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class);
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LIZ = LJJJI.LIZ()) != null && (LIZ2 = LIZ.LIZ()) != null) {
            j3 = LIZ2.getId();
        } else {
            j3 = 0;
        }
        QB4.LIZ(linkApi.sendTalkRoomInteractEmoji(j3, j2, C79242HLo.LJIIJ(), 1, j).compose(C100839PnV.LIZJ()).subscribe(new C78664Gzi(this, j2, currentTimeMillis, str, j, function1), new C78663Gzh<>(this, j2, currentTimeMillis, function1)), this.LJFF);
    }
}
