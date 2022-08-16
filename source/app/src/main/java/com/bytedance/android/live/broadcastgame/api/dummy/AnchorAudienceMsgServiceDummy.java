package com.bytedance.android.live.broadcastgame.api.dummy;

import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b;
import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3335e;
import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3341h;
import com.bytedance.android.live.broadcastgame.api.channel.C3336f;
import com.bytedance.android.live.broadcastgame.api.channel.IAnchorAudienceMsgService;
import com.bytedance.android.live.broadcastgame.api.interactgame.JsFuncInjector;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import io.reactivex.Observable;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class AnchorAudienceMsgServiceDummy implements IAnchorAudienceMsgService {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19085);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3334d
    public final void addMsg2Pool(C3336f c3336f) {
        if (PatchProxy.proxy(new Object[]{c3336f}, this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(c3336f);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3334d
    public final void addMsgCallback(AbstractC3335e abstractC3335e) {
        if (PatchProxy.proxy(new Object[]{abstractC3335e}, this, changeQuickRedirect, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC3335e);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3334d
    public final void clearMsgPool() {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b
    public final void clearSeiMessage() {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.IAnchorAudienceMsgService
    /* renamed from: createAnchorAudienceMsgChannel  reason: collision with other method in class */
    public final Void mo25451createAnchorAudienceMsgChannel(DataCenter dataCenter, AbstractC5436a abstractC5436a, boolean z, Room room) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dataCenter, abstractC5436a, Byte.valueOf(z ? (byte) 1 : (byte) 0), room}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Void) proxy.result;
        }
        C106862S5w.LIZ(dataCenter, room);
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b
    public final void enterRoom(DataCenter dataCenter, Room room, AbstractC5436a abstractC5436a) {
        if (PatchProxy.proxy(new Object[]{dataCenter, room, abstractC5436a}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(dataCenter, room);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b
    public final void onPause() {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b
    public final void onResume() {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b
    public final void onSeiUpdate(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b
    public final void registerMessage(AbstractC3335e abstractC3335e) {
        if (PatchProxy.proxy(new Object[]{abstractC3335e}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC3335e);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b
    public final void release() {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.IAnchorAudienceMsgService
    public final void release(long j) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b
    public final void sendHeartBeat(int i, long j) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.IAnchorAudienceMsgService
    public final void sendMsgToAnchor(String str, String str2, long j, String str3, JsFuncInjector.Type type, AbstractC3332b.AbstractC3333b abstractC3333b) {
        if (PatchProxy.proxy(new Object[]{str, str2, new Long(j), str3, type, abstractC3333b}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.IAnchorAudienceMsgService
    public final void sendMsgToAudience(String str, String str2, long j, int i, long j2, String str3, JsFuncInjector.Type type, AbstractC3332b.AbstractC3333b abstractC3333b, int i2) {
        if (PatchProxy.proxy(new Object[]{str, str2, new Long(j), Integer.valueOf(i), new Long(j2), str3, type, abstractC3333b, Integer.valueOf(i2)}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b
    public final void setCurrentPlayId(long j) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b
    public final void setGameExtra(C3383p c3383p) {
        if (PatchProxy.proxy(new Object[]{c3383p}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(c3383p);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b
    public final void unregisterMessage(AbstractC3335e abstractC3335e) {
        if (PatchProxy.proxy(new Object[]{abstractC3335e}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC3335e);
    }

    public AnchorAudienceMsgServiceDummy() {
        ServiceManager.registerService(IAnchorAudienceMsgService.class, this);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b
    public final Observable<AbstractC3341h.AbstractC3343b> sendMessage(AbstractC3341h.AbstractC3342a abstractC3342a) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC3342a}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        C106862S5w.LIZ(abstractC3342a);
        Observable<AbstractC3341h.AbstractC3343b> error = Observable.error(new Throwable("not impl"));
        Intrinsics.checkNotNullExpressionValue(error, "");
        return error;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.IAnchorAudienceMsgService
    /* renamed from: createAnchorAudienceMsgChannel */
    public final /* bridge */ /* synthetic */ AbstractC3332b mo25451createAnchorAudienceMsgChannel(DataCenter dataCenter, AbstractC5436a abstractC5436a, boolean z, Room room) {
        return (AbstractC3332b) mo25451createAnchorAudienceMsgChannel(dataCenter, abstractC5436a, z, room);
    }
}
