package com.bytedance.android.live.broadcastgame.channel;

import android.util.LongSparseArray;
import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b;
import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3334d;
import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3335e;
import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3341h;
import com.bytedance.android.live.broadcastgame.api.channel.C3336f;
import com.bytedance.android.live.broadcastgame.api.channel.IAnchorAudienceMsgService;
import com.bytedance.android.live.broadcastgame.api.interactgame.JsFuncInjector;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.depend.AbstractC5826c;
import com.bytedance.android.livesdk.C8030j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import io.reactivex.Observable;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C77347GeT;
import p003X.KW1;
import p003X.KW2;
import p003X.KWE;
import p003X.KX1;
import p003X.KX2;
import p003X.KX3;
import p003X.KX7;
import p003X.KX8;
import p003X.KX9;
import p003X.KXA;
import p003X.KXB;
import p003X.KXC;
import p003X.KXS;
import p003X.KY0;

/* loaded from: classes5.dex */
public class AnchorAudienceMsgService implements IAnchorAudienceMsgService {
    public static final KXC Companion = new KXC((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public AbstractC3332b channel;
    public AbstractC3334d msgPool;
    public LongSparseArray<AbstractC3332b> channelCache = new LongSparseArray<>();
    public LongSparseArray<AbstractC3334d> msgPoolCache = new LongSparseArray<>();
    public final Lazy appMonitorListener$delegate = C77347GeT.LIZ(new AnchorAudienceMsgService$appMonitorListener$2(this));

    static {
        Covode.recordClassIndex(19339);
    }

    private final AbstractC5826c.C5827a getAppMonitorListener() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        return (AbstractC5826c.C5827a) (proxy.isSupported ? proxy.result : this.appMonitorListener$delegate.mo27335getValue());
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b
    public synchronized void release() {
        MethodCollector.m14708i(1401);
        MethodCollector.m14707o(1401);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3334d
    public void clearMsgPool() {
        AbstractC3334d abstractC3334d;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13).isSupported && (abstractC3334d = this.msgPool) != null) {
            abstractC3334d.clearMsgPool();
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b
    public void clearSeiMessage() {
        AbstractC3332b abstractC3332b;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7).isSupported && (abstractC3332b = this.channel) != null) {
            abstractC3332b.clearSeiMessage();
        }
    }

    public final AbstractC5826c.C5827a initAppMonitorListener() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20);
        if (proxy.isSupported) {
            return (AbstractC5826c.C5827a) proxy.result;
        }
        return new KWE();
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b
    public void onPause() {
        AbstractC3332b abstractC3332b;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10).isSupported && (abstractC3332b = this.channel) != null) {
            abstractC3332b.onPause();
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b
    public void onResume() {
        AbstractC3332b abstractC3332b;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11).isSupported && (abstractC3332b = this.channel) != null) {
            abstractC3332b.onResume();
        }
    }

    public AnchorAudienceMsgService() {
        ServiceManager.registerService(IAnchorAudienceMsgService.class, this);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3334d
    public void addMsg2Pool(C3336f c3336f) {
        if (PatchProxy.proxy(new Object[]{c3336f}, this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(c3336f);
        AbstractC3334d abstractC3334d = this.msgPool;
        if (abstractC3334d != null) {
            abstractC3334d.addMsg2Pool(c3336f);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3334d
    public void addMsgCallback(AbstractC3335e abstractC3335e) {
        if (PatchProxy.proxy(new Object[]{abstractC3335e}, this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC3335e);
        AbstractC3334d abstractC3334d = this.msgPool;
        if (abstractC3334d != null) {
            abstractC3334d.addMsgCallback(abstractC3335e);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b
    public void onSeiUpdate(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        AbstractC3332b abstractC3332b = this.channel;
        if (abstractC3332b != null) {
            abstractC3332b.onSeiUpdate(str);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b
    public void registerMessage(AbstractC3335e abstractC3335e) {
        if (PatchProxy.proxy(new Object[]{abstractC3335e}, this, changeQuickRedirect, false, 18).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC3335e);
        AbstractC3332b abstractC3332b = this.channel;
        if (abstractC3332b != null) {
            abstractC3332b.registerMessage(abstractC3335e);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b
    public void setCurrentPlayId(long j) {
        AbstractC3332b abstractC3332b;
        if (!PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 9).isSupported && (abstractC3332b = this.channel) != null) {
            abstractC3332b.setCurrentPlayId(j);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b
    public void setGameExtra(C3383p c3383p) {
        if (PatchProxy.proxy(new Object[]{c3383p}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(c3383p);
        AbstractC3332b abstractC3332b = this.channel;
        if (abstractC3332b != null) {
            abstractC3332b.setGameExtra(c3383p);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b
    public void unregisterMessage(AbstractC3335e abstractC3335e) {
        if (PatchProxy.proxy(new Object[]{abstractC3335e}, this, changeQuickRedirect, false, 19).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC3335e);
        AbstractC3332b abstractC3332b = this.channel;
        if (abstractC3332b != null) {
            abstractC3332b.unregisterMessage(abstractC3335e);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b
    public Observable<AbstractC3341h.AbstractC3343b> sendMessage(AbstractC3341h.AbstractC3342a abstractC3342a) {
        Observable<AbstractC3341h.AbstractC3343b> sendMessage;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC3342a}, this, changeQuickRedirect, false, 17);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        C106862S5w.LIZ(abstractC3342a);
        AbstractC3332b abstractC3332b = this.channel;
        if (abstractC3332b == null || (sendMessage = abstractC3332b.sendMessage(abstractC3342a)) == null) {
            Observable<AbstractC3341h.AbstractC3343b> error = Observable.error(new Throwable("channel is null"));
            Intrinsics.checkNotNullExpressionValue(error, "");
            return error;
        }
        return sendMessage;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.IAnchorAudienceMsgService
    public synchronized void release(long j) {
        MethodCollector.m14708i(1400);
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 15).isSupported) {
            MethodCollector.m14707o(1400);
            return;
        }
        AbstractC3332b abstractC3332b = this.channelCache.get(j);
        if (abstractC3332b != null) {
            abstractC3332b.release();
            this.channelCache.remove(j);
            C8030j.LIZLLL.LIZ().LIZIZ(getAppMonitorListener());
        }
        if (this.channelCache.size() == 0) {
            this.channel = null;
        }
        AbstractC3334d abstractC3334d = this.msgPoolCache.get(j);
        if (abstractC3334d != null) {
            abstractC3334d.clearMsgPool();
            this.msgPoolCache.remove(j);
            MethodCollector.m14707o(1400);
            return;
        }
        MethodCollector.m14707o(1400);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b
    public void sendHeartBeat(int i, long j) {
        AbstractC3332b abstractC3332b;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), new Long(j)}, this, changeQuickRedirect, false, 8).isSupported && (abstractC3332b = this.channel) != null) {
            abstractC3332b.sendHeartBeat(i, j);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b
    public void enterRoom(DataCenter dataCenter, Room room, AbstractC5436a abstractC5436a) {
        if (PatchProxy.proxy(new Object[]{dataCenter, room, abstractC5436a}, this, changeQuickRedirect, false, 16).isSupported) {
            return;
        }
        C106862S5w.LIZ(dataCenter, room);
        AbstractC3332b abstractC3332b = this.channel;
        if (abstractC3332b != null) {
            abstractC3332b.enterRoom(dataCenter, room, abstractC5436a);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.IAnchorAudienceMsgService
    /* renamed from: createAnchorAudienceMsgChannel */
    public synchronized AbstractC3332b mo25451createAnchorAudienceMsgChannel(DataCenter dataCenter, AbstractC5436a abstractC5436a, boolean z, Room room) {
        MethodCollector.m14708i(1399);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dataCenter, abstractC5436a, Byte.valueOf(z ? (byte) 1 : (byte) 0), room}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            AbstractC3332b abstractC3332b = (AbstractC3332b) proxy.result;
            MethodCollector.m14707o(1399);
            return abstractC3332b;
        }
        C106862S5w.LIZ(dataCenter, room);
        this.channel = this.channelCache.get(room.getId());
        this.msgPool = this.msgPoolCache.get(room.getId());
        if (this.channel == null) {
            this.channel = new KY0(dataCenter, abstractC5436a, z, room);
            this.channelCache.put(room.getId(), this.channel);
        }
        if (this.msgPool == null) {
            this.msgPool = new KX1();
            this.msgPoolCache.put(room.getId(), this.msgPool);
        }
        enterRoom(dataCenter, room, abstractC5436a);
        C8030j.LIZLLL.LIZ().LIZ(getAppMonitorListener());
        AbstractC3332b abstractC3332b2 = this.channel;
        Intrinsics.checkNotNull(abstractC3332b2);
        MethodCollector.m14707o(1399);
        return abstractC3332b2;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.IAnchorAudienceMsgService
    public void sendMsgToAnchor(String str, String str2, long j, String str3, JsFuncInjector.Type type, AbstractC3332b.AbstractC3333b abstractC3333b) {
        String str4 = str2;
        if (PatchProxy.proxy(new Object[]{str, str4, new Long(j), str3, type, abstractC3333b}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (str4 == null) {
            str4 = "{}";
        }
        Observable.just(new C3336f(str, 0L, str4, 0, false, 26)).map(KX2.LIZIZ).map(new KXS(j, str3)).flatMap(new KX7(this)).compose(C100839PnV.LIZJ()).subscribe(new KXA(abstractC3333b), new KW1(abstractC3333b));
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.IAnchorAudienceMsgService
    public void sendMsgToAudience(String str, String str2, long j, int i, long j2, String str3, JsFuncInjector.Type type, AbstractC3332b.AbstractC3333b abstractC3333b, int i2) {
        String str4 = str2;
        if (PatchProxy.proxy(new Object[]{str, str4, new Long(j), Integer.valueOf(i), new Long(j2), str3, type, abstractC3333b, Integer.valueOf(i2)}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (str4 == null) {
            str4 = "{}";
        }
        Observable.just(new C3336f(str, j, str4, i2, false, 16)).map(KX3.LIZIZ).map(new KX9(j2, j, str3)).flatMap(new KX8(this)).compose(C100839PnV.LIZJ()).subscribe(new KXB(abstractC3333b), new KW2(abstractC3333b));
    }
}
