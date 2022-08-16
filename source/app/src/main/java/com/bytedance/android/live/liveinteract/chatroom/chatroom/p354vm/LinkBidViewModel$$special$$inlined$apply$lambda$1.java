package com.bytedance.android.live.liveinteract.chatroom.chatroom.p354vm;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.vm.LinkBidViewModel$$special$$inlined$apply$lambda$1 */
/* loaded from: classes22.dex */
public final class LinkBidViewModel$$special$$inlined$apply$lambda$1 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C4378a this$0;

    static {
        Covode.recordClassIndex(26454);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkBidViewModel$$special$$inlined$apply$lambda$1(C4378a c4378a) {
        super(1);
        this.this$0 = c4378a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str);
            NextLiveData<Pair<String, String>> nextLiveData = this.this$0.LJIILL;
            Pair<String, String> value = this.this$0.LJIILL.getValue();
            if (value == null) {
                value = new Pair<>("00", "00");
            }
            nextLiveData.setValue(new Pair<>(str, value.getSecond()));
        }
        return Unit.INSTANCE;
    }
}
