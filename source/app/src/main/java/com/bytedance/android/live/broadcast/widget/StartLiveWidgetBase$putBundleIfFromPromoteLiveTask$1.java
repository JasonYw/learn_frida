package com.bytedance.android.live.broadcast.widget;

import android.content.Intent;
import com.bytedance.android.live.broadcast.api.model.C2919v;
import com.bytedance.android.live.broadcast.api.model.C2920w;
import com.bytedance.android.live.broadcast.api.model.PreviewSourceParam;
import com.bytedance.android.livehostapi.business.depend.hashtag.LiveHashTag;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class StartLiveWidgetBase$putBundleIfFromPromoteLiveTask$1 extends Lambda implements Function1<PreviewSourceParam, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Intent $intent;
    public final /* synthetic */ LiveHashTag $liveHashTag;

    static {
        Covode.recordClassIndex(18837);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveWidgetBase$putBundleIfFromPromoteLiveTask$1(Intent intent, LiveHashTag liveHashTag) {
        super(1);
        this.$intent = intent;
        this.$liveHashTag = liveHashTag;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(PreviewSourceParam previewSourceParam) {
        Object obj;
        PreviewSourceParam previewSourceParam2 = previewSourceParam;
        if (!PatchProxy.proxy(new Object[]{previewSourceParam2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(previewSourceParam2);
            C2919v LIZ = previewSourceParam2.LIZ();
            if (LIZ != null) {
                C2920w c2920w = LIZ.LIZIZ.get("commerce");
                if (c2920w == null || (obj = c2920w.LIZ(PushConstants.TASK_ID, String.class, "")) == null) {
                    obj = "";
                }
                String str = (String) obj;
                if (str != null && str.length() > 0) {
                    this.$intent.putExtra("from_promote_live", true);
                    Intent intent = this.$intent;
                    str.toString();
                    intent.putExtra("data_commerce_task_id", str);
                    this.$liveHashTag.taskId = str;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
