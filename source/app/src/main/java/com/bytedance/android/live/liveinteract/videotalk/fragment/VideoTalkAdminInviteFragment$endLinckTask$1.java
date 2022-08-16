package com.bytedance.android.live.liveinteract.videotalk.fragment;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C78023GpN;

/* loaded from: classes3.dex */
public final class VideoTalkAdminInviteFragment$endLinckTask$1 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C78023GpN this$0;

    static {
        Covode.recordClassIndex(30262);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTalkAdminInviteFragment$endLinckTask$1(C78023GpN c78023GpN) {
        super(1);
        this.this$0 = c78023GpN;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str);
            this.this$0.LJIIL();
            ALogger.m15797i("VideoTalkAdminInviteFragment", "on call back：");
        }
        return Unit.INSTANCE;
    }
}
