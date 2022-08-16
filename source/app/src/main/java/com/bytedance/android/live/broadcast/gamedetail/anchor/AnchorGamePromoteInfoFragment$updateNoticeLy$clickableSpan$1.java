package com.bytedance.android.live.broadcast.gamedetail.anchor;

import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C414642b4;
import p003X.C89002L4y;

/* loaded from: classes5.dex */
public final class AnchorGamePromoteInfoFragment$updateNoticeLy$clickableSpan$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3036d $gameDetail;
    public final /* synthetic */ C89002L4y this$0;

    static {
        Covode.recordClassIndex(16035);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorGamePromoteInfoFragment$updateNoticeLy$clickableSpan$1(C89002L4y c89002L4y, C3036d c3036d) {
        super(0);
        this.this$0 = c89002L4y;
        this.$gameDetail = c3036d;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        String str;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C3037j c3037j = this.$gameDetail.LJJI;
            if (c3037j != null) {
                str = c3037j.LIZIZ;
            } else {
                str = null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", "anchor_detail");
            ((IRoomService) ServiceManager.getService(IRoomService.class)).actionHandler().handle(this.this$0.getContext(), C414642b4.LIZIZ(str, hashMap));
        }
        return Unit.INSTANCE;
    }
}
