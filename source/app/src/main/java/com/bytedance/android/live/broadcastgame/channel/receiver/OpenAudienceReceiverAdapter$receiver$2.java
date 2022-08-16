package com.bytedance.android.live.broadcastgame.channel.receiver;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87182KWy;
import p003X.C87194KXk;
import p003X.C87195KXl;
import p003X.C87202KXs;
import p003X.C87207KXx;
import p003X.KXI;
import p003X.KXJ;

/* loaded from: classes5.dex */
public final class OpenAudienceReceiverAdapter$receiver$2 extends Lambda implements Function0<C3436d> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87207KXx this$0;

    static {
        Covode.recordClassIndex(19530);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenAudienceReceiverAdapter$receiver$2(C87207KXx c87207KXx) {
        super(0);
        this.this$0 = c87207KXx;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.bytedance.android.live.broadcastgame.channel.receiver.d, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3436d mo30099invoke() {
        List arrayList;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C87207KXx c87207KXx = this.this$0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c87207KXx}, c87207KXx, C87207KXx.LIZ, false, 5);
        if (proxy2.isSupported) {
            arrayList = (List) proxy2.result;
        } else {
            arrayList = new ArrayList();
            IMessageManager iMessageManager = c87207KXx.LJFF;
            if (iMessageManager != null) {
                arrayList.add(new C87182KWy(iMessageManager, c87207KXx));
            }
            if (!c87207KXx.LIZLLL) {
                C87195KXl c87195KXl = new C87195KXl(c87207KXx);
                c87207KXx.LJII.invoke(c87195KXl);
                arrayList.add(c87195KXl);
                C87194KXk c87194KXk = new C87194KXk(c87207KXx);
                c87207KXx.LJII.invoke(c87194KXk);
                arrayList.add(c87194KXk);
                arrayList.add(new KXJ(c87207KXx.f8528LJ, c87195KXl, new C87202KXs(c87207KXx, c87207KXx)));
                KXI kxi = new KXI(c87207KXx.f8528LJ, c87207KXx, c87207KXx.LJI);
                c87207KXx.LIZJ = kxi;
                arrayList.add(kxi);
            }
        }
        return new C3436d(arrayList);
    }
}
