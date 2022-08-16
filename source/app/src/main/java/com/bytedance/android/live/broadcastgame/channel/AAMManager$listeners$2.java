package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.android.live.broadcastgame.channel.AAMManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes23.dex */
public final class AAMManager$listeners$2 extends Lambda implements Function0<List<AAMManager.AbstractC3405a>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AAMManager this$0;

    static {
        Covode.recordClassIndex(19317);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AAMManager$listeners$2(AAMManager aAMManager) {
        super(0);
        this.this$0 = aAMManager;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<com.bytedance.android.live.broadcastgame.channel.AAMManager$a>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ List<AAMManager.AbstractC3405a> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AAMManager.AbstractC3405a() { // from class: com.bytedance.android.live.broadcastgame.channel.AAMManager$listeners$2.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(19318);
            }

            @Override // com.bytedance.android.live.broadcastgame.channel.AAMManager.AbstractC3405a
            public final void LIZIZ() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
                    return;
                }
                AAMManager$listeners$2.this.this$0.LIZIZ = AAMManager.Status.START;
            }

            @Override // com.bytedance.android.live.broadcastgame.channel.AAMManager.AbstractC3405a
            public final void LIZJ() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
                    return;
                }
                AAMManager$listeners$2.this.this$0.LIZIZ = AAMManager.Status.STOP;
            }

            @Override // com.bytedance.android.live.broadcastgame.channel.AAMManager.AbstractC3405a
            public final void LIZLLL() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    return;
                }
                AAMManager$listeners$2.this.this$0.LIZIZ = AAMManager.Status.ENTRANCE;
            }
        });
        return arrayList;
    }
}
