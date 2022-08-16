package com.bytedance.android.live.broadcastgame.channel.sender;

import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3341h;
import com.bytedance.android.live.broadcastgame.api.channel.ChannelType;
import com.bytedance.android.live.broadcastgame.channel.p288a.C3423b;
import com.bytedance.android.live.broadcastgame.channel.p288a.C3424c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C87206KXw;

/* renamed from: com.bytedance.android.live.broadcastgame.channel.sender.f */
/* loaded from: classes5.dex */
public final class C3443f implements AbstractC3341h {
    public static ChangeQuickRedirect LIZ;
    public final List<AbstractC3341h> LIZIZ;

    static {
        Covode.recordClassIndex(19589);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3341h
    public final List<ChannelType> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChannelType.SEI);
        arrayList.add(ChannelType.SEI_BEAT);
        arrayList.add(ChannelType.LOOP_SEI);
        arrayList.add(ChannelType.IM);
        arrayList.add(ChannelType.IM_V2);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3443f(List<? extends AbstractC3341h> list) {
        C106862S5w.LIZ(list);
        this.LIZIZ = list;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3341h
    public final Observable<AbstractC3341h.AbstractC3343b> LIZ(AbstractC3341h.AbstractC3342a abstractC3342a) {
        ChannelType channelType;
        Object obj;
        Observable<AbstractC3341h.AbstractC3343b> LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC3342a}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        C106862S5w.LIZ(abstractC3342a);
        if (abstractC3342a instanceof C3424c) {
            channelType = ChannelType.IM;
        } else if (abstractC3342a instanceof C3423b) {
            channelType = ((C3423b) abstractC3342a).LIZJ;
        } else if (abstractC3342a instanceof C87206KXw) {
            channelType = ChannelType.SEI_BEAT;
        } else {
            channelType = ChannelType.NONE;
        }
        Iterator<T> it = this.LIZIZ.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((AbstractC3341h) obj).LIZ().contains(channelType)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        AbstractC3341h abstractC3341h = (AbstractC3341h) obj;
        if (abstractC3341h == null || (LIZ2 = abstractC3341h.LIZ(abstractC3342a)) == null) {
            Observable<AbstractC3341h.AbstractC3343b> error = Observable.error(new Throwable("not sender handle " + abstractC3342a));
            Intrinsics.checkNotNullExpressionValue(error, "");
            return error;
        }
        return LIZ2;
    }
}
