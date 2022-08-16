package com.bytedance.android.live.liveinteract.voicechat.p395wm;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C80576HpS;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.wm.VoiceChatLayoutManager$1 */
/* loaded from: classes3.dex */
public final class VoiceChatLayoutManager$1 extends Lambda implements Function1<User, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80576HpS this$0;

    static {
        Covode.recordClassIndex(31876);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceChatLayoutManager$1(C80576HpS c80576HpS) {
        super(1);
        this.this$0 = c80576HpS;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(User user) {
        User user2 = user;
        if (!PatchProxy.proxy(new Object[]{user2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(user2);
            this.this$0.LIZ(user2);
        }
        return Unit.INSTANCE;
    }
}
