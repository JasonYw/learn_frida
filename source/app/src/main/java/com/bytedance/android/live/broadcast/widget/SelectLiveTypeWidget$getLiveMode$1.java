package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.api.model.PreviewSourceParam;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class SelectLiveTypeWidget$getLiveMode$1 extends Lambda implements Function1<PreviewSourceParam, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Ref.ObjectRef $liveMode;

    static {
        Covode.recordClassIndex(18786);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectLiveTypeWidget$getLiveMode$1(Ref.ObjectRef objectRef) {
        super(1);
        this.$liveMode = objectRef;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, com.bytedance.android.livesdkapi.depend.model.live.LiveMode] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(PreviewSourceParam previewSourceParam) {
        PreviewSourceParam previewSourceParam2 = previewSourceParam;
        if (!PatchProxy.proxy(new Object[]{previewSourceParam2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(previewSourceParam2);
            this.$liveMode.element = LiveMode.createBySchemeLiveScene(previewSourceParam2.liveScene);
        }
        return Unit.INSTANCE;
    }
}
