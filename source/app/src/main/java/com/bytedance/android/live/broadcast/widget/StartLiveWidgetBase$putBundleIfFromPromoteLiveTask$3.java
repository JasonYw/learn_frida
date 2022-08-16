package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.api.model.PreviewSourceParam;
import com.bytedance.android.livehostapi.business.depend.hashtag.LiveHashTag;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class StartLiveWidgetBase$putBundleIfFromPromoteLiveTask$3 extends Lambda implements Function1<PreviewSourceParam, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LiveHashTag $liveHashTag;

    static {
        Covode.recordClassIndex(18838);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveWidgetBase$putBundleIfFromPromoteLiveTask$3(LiveHashTag liveHashTag) {
        super(1);
        this.$liveHashTag = liveHashTag;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(PreviewSourceParam previewSourceParam) {
        boolean z;
        PreviewSourceParam previewSourceParam2 = previewSourceParam;
        boolean z2 = true;
        if (!PatchProxy.proxy(new Object[]{previewSourceParam2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(previewSourceParam2);
            this.$liveHashTag.taskStickerId = previewSourceParam2.stickerId;
            LiveHashTag liveHashTag = this.$liveHashTag;
            Boolean bool = previewSourceParam2.challengeTaskOptional;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = true;
            }
            liveHashTag.challengeTaskOptional = z;
            LiveHashTag liveHashTag2 = this.$liveHashTag;
            Boolean bool2 = previewSourceParam2.stickerTaskOptional;
            if (bool2 != null) {
                z2 = bool2.booleanValue();
            }
            liveHashTag2.stickerTaskOptional = z2;
        }
        return Unit.INSTANCE;
    }
}
