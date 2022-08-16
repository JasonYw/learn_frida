package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.content.Context;
import com.bytedance.android.live.broadcast.gamedetail.anchor.C3036d;
import com.bytedance.android.live.broadcast.gamedetail.anchor.C3037j;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class AnchorGamePromoteInfoWidget$updateNoticeLy$clickableSpan$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3036d $gameDetail;
    public final /* synthetic */ AnchorGamePromoteInfoWidget this$0;

    static {
        Covode.recordClassIndex(16309);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorGamePromoteInfoWidget$updateNoticeLy$clickableSpan$1(AnchorGamePromoteInfoWidget anchorGamePromoteInfoWidget, C3036d c3036d) {
        super(0);
        this.this$0 = anchorGamePromoteInfoWidget;
        this.$gameDetail = c3036d;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        String str;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            ILiveActionHandler actionHandler = ((IRoomService) ServiceManager.getService(IRoomService.class)).actionHandler();
            Context context = this.this$0.context;
            C3037j c3037j = this.$gameDetail.LJJI;
            if (c3037j == null || (str = c3037j.LIZIZ) == null) {
                str = "";
            }
            actionHandler.handle(context, str);
        }
        return Unit.INSTANCE;
    }
}
