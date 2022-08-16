package com.bytedance.android.live.liveinteract.voicechat;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.HEE;

/* loaded from: classes3.dex */
public final class VoiceChatMuteManager$listCallback$1$onOnlineListChanged$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ HEE this$0;

    static {
        Covode.recordClassIndex(30829);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceChatMuteManager$listCallback$1$onOnlineListChanged$1(HEE hee) {
        super(0);
        this.this$0 = hee;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            int LJFF = this.this$0.LIZIZ.LJFF();
            String str = this.this$0.LIZIZ.LIZLLL;
            ALogger.m15795w(str, "onlineListChange, tryCheckSelfMuteButListUnSilence silence=" + LJFF);
            if (LJFF == 0) {
                this.this$0.LIZIZ.LJII();
            }
        }
        return Unit.INSTANCE;
    }
}
