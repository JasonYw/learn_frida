package com.bytedance.android.live.browser.jsbridge.newmethods;

import com.bytedance.android.live.browser.jsbridge.newmethods.GetDiscussionsResultModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.web.jsbridge2.C13052h;
import p003X.C106862S5w;
import p003X.LP8;

/* renamed from: com.bytedance.android.live.browser.jsbridge.newmethods.bv */
/* loaded from: classes5.dex */
public final class C4005bv extends LP8<C4006bw, GetDiscussionsResultModel> {
    public static ChangeQuickRedirect LIZ;
    public final DataCenter LIZIZ;

    static {
        Covode.recordClassIndex(22717);
    }

    public C4005bv(DataCenter dataCenter) {
        C106862S5w.LIZ(dataCenter);
        this.LIZIZ = dataCenter;
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public final /* synthetic */ void invoke(Object obj, C13052h c13052h) {
        if (!PatchProxy.proxy(new Object[]{obj, c13052h}, this, LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(obj, c13052h);
            if (this.LIZIZ.get("data_vs_room_topic_info_str") != null) {
                GetDiscussionsResultModel getDiscussionsResultModel = new GetDiscussionsResultModel();
                getDiscussionsResultModel.LIZ = GetDiscussionsResultModel.Code.Success;
                getDiscussionsResultModel.LIZIZ = (String) this.LIZIZ.get("data_vs_room_topic_info_str");
                finishWithResult(getDiscussionsResultModel);
                return;
            }
            finishWithFailure();
        }
    }
}
