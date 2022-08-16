package com.bytedance.android.live.broadcastgame.channel.sender;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class Anchor2AudienceImSender$sendMessage$1$1 extends Lambda implements Function1<String, Unit> {
    public static final Anchor2AudienceImSender$sendMessage$1$1 INSTANCE = new Anchor2AudienceImSender$sendMessage$1$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19559);
    }

    public Anchor2AudienceImSender$sendMessage$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str);
        }
        return Unit.INSTANCE;
    }
}
