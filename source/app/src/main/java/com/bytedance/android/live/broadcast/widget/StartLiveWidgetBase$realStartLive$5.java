package com.bytedance.android.live.broadcast.widget;

import android.content.Intent;
import com.bytedance.android.live.broadcast.api.model.PreviewSourceParam;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C87308Kak;

/* loaded from: classes5.dex */
public final class StartLiveWidgetBase$realStartLive$5 extends Lambda implements Function1<PreviewSourceParam, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Intent $intent;
    public final /* synthetic */ StartLiveWidgetBase this$0;

    static {
        Covode.recordClassIndex(18839);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveWidgetBase$realStartLive$5(StartLiveWidgetBase startLiveWidgetBase, Intent intent) {
        super(1);
        this.this$0 = startLiveWidgetBase;
        this.$intent = intent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(PreviewSourceParam previewSourceParam) {
        PreviewSourceParam previewSourceParam2 = previewSourceParam;
        if (!PatchProxy.proxy(new Object[]{previewSourceParam2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(previewSourceParam2);
            if (StringsKt__StringsJVMKt.equals$default(previewSourceParam2.enableShowChatTip, "1", false, 2, null)) {
                C87308Kak<String> c87308Kak = AbstractC80293Hkt.LJJIJLIJ;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                c87308Kak.LIZ("1");
            }
            this.this$0.LIZ(new JSONObject(), this.$intent);
        }
        return Unit.INSTANCE;
    }
}
