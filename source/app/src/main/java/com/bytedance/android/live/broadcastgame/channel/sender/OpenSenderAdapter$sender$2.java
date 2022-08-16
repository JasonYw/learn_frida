package com.bytedance.android.live.broadcastgame.channel.sender;

import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3345i;
import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3346k;
import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3347l;
import com.bytedance.android.live.broadcastgame.channel.GameChannelApi;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C87184KXa;
import p003X.C87188KXe;
import p003X.C87189KXf;
import p003X.C87190KXg;
import p003X.C87191KXh;
import p003X.C88306Kqq;
import p003X.KXY;

/* loaded from: classes5.dex */
public final class OpenSenderAdapter$sender$2 extends Lambda implements Function0<C3443f> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87190KXg this$0;

    static {
        Covode.recordClassIndex(19565);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenSenderAdapter$sender$2(C87190KXg c87190KXg) {
        super(0);
        this.this$0 = c87190KXg;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.broadcastgame.channel.sender.f, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3443f mo30099invoke() {
        List arrayList;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C87190KXg c87190KXg = this.this$0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c87190KXg, C87190KXg.LIZIZ, false, 7);
        if (proxy2.isSupported) {
            arrayList = (List) proxy2.result;
        } else {
            arrayList = new ArrayList();
            GameChannelApi gameChannelApi = (GameChannelApi) C88306Kqq.LIZ().LIZ(GameChannelApi.class);
            if (c87190KXg.LIZJ) {
                AbstractC3345i abstractC3345i = c87190KXg.LIZLLL;
                AbstractC3346k abstractC3346k = c87190KXg.f8526LJ;
                AbstractC3347l abstractC3347l = c87190KXg.LJFF;
                Intrinsics.checkNotNullExpressionValue(gameChannelApi, "");
                arrayList.add(new KXY(abstractC3345i, abstractC3346k, abstractC3347l, gameChannelApi));
                arrayList.add(new C87189KXf(c87190KXg.LIZLLL, c87190KXg.f8526LJ, c87190KXg.LJFF, gameChannelApi, c87190KXg.LJI));
                C87188KXe c87188KXe = new C87188KXe(c87190KXg.LIZLLL, c87190KXg.f8526LJ, c87190KXg.LJFF, gameChannelApi, c87190KXg.LJI);
                c87190KXg.LIZ().add(c87188KXe);
                arrayList.add(c87188KXe);
                arrayList.add(new C87191KXh(c87190KXg.LIZLLL, c87190KXg.f8526LJ, c87190KXg.LJI));
            } else {
                AbstractC3345i abstractC3345i2 = c87190KXg.LIZLLL;
                Intrinsics.checkNotNullExpressionValue(gameChannelApi, "");
                arrayList.add(new C87184KXa(abstractC3345i2, gameChannelApi));
            }
        }
        return new C3443f(arrayList);
    }
}
