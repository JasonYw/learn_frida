package com.bytedance.android.live.liveinteract.chatroom.chatroom.list;

import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C78174Gro;

/* loaded from: classes3.dex */
public final class BaseTalkApplyListFragmentV2$onViewCreated$3 extends Lambda implements Function1<LinkPlayerInfo, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C78174Gro this$0;

    static {
        Covode.recordClassIndex(26147);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTalkApplyListFragmentV2$onViewCreated$3(C78174Gro c78174Gro) {
        super(1);
        this.this$0 = c78174Gro;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(LinkPlayerInfo linkPlayerInfo) {
        LinkPlayerInfo linkPlayerInfo2 = linkPlayerInfo;
        if (!PatchProxy.proxy(new Object[]{linkPlayerInfo2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(linkPlayerInfo2);
            this.this$0.LIZ(linkPlayerInfo2);
        }
        return Unit.INSTANCE;
    }
}
