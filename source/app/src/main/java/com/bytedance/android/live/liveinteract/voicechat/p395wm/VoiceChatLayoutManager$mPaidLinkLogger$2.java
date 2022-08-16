package com.bytedance.android.live.liveinteract.voicechat.p395wm;

import com.bytedance.android.live.liveinteract.api.data.C4284f;
import com.bytedance.android.live.liveinteract.voicechat.p392b.C4999a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C80576HpS;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.wm.VoiceChatLayoutManager$mPaidLinkLogger$2 */
/* loaded from: classes3.dex */
public final class VoiceChatLayoutManager$mPaidLinkLogger$2 extends Lambda implements Function0<C4999a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80576HpS this$0;

    static {
        Covode.recordClassIndex(31878);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceChatLayoutManager$mPaidLinkLogger$2(C80576HpS c80576HpS) {
        super(0);
        this.this$0 = c80576HpS;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.android.live.liveinteract.voicechat.b.a, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4999a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4999a(this.this$0.LIZJ, C4284f.LJIIIIZZ.LIZLLL().LIZLLL);
    }
}
