package com.bytedance.android.live.broadcast.gamedetail.anchor;

import com.bytedance.android.live.browser.jsbridge.event.C3952am;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.business.IHostBusiness;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C88929L2d;
import p003X.L6L;

/* loaded from: classes5.dex */
public final class AnchorGamePromoteDetailDialog$initJsb$5 extends Lambda implements Function1<C3952am, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C88929L2d this$0;

    static {
        Covode.recordClassIndex(16028);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorGamePromoteDetailDialog$initJsb$5(C88929L2d c88929L2d) {
        super(1);
        this.this$0 = c88929L2d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3952am c3952am) {
        Object obj;
        Object obj2;
        C3952am c3952am2 = c3952am;
        if (!PatchProxy.proxy(new Object[]{c3952am2}, this, changeQuickRedirect, false, 1).isSupported) {
            if (!this.this$0.isResumed()) {
                L6L.LIZIZ.LIZJ("AnchorGameDetailDialogFragment", "dialog not resume, open shoot schema return");
            } else {
                Map<String, Object> map = c3952am2.LIZJ;
                if (map != null) {
                    obj = map.get("scheme");
                } else {
                    obj = null;
                }
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str = (String) obj;
                if (str == null) {
                    str = "";
                }
                Map<String, Object> map2 = c3952am2.LIZJ;
                if (map2 != null) {
                    obj2 = map2.get("clear_top_page");
                } else {
                    obj2 = null;
                }
                if (!(obj2 instanceof Integer)) {
                    obj2 = null;
                }
                Integer num = (Integer) obj2;
                ((IRoomService) ServiceManager.getService(IRoomService.class)).actionHandler().handle(this.this$0.getContext(), str);
                if (num != null && num.intValue() == 1) {
                    ((IHostBusiness) ServiceManager.getService(IHostBusiness.class)).setVideoReshootClearListener(this.this$0.getContext(), this.this$0);
                } else {
                    L6L.LIZIZ.LIZIZ("AnchorGameDetailDialogFragment", "open shoot schema not clear top page");
                }
            }
        }
        return Unit.INSTANCE;
    }
}
