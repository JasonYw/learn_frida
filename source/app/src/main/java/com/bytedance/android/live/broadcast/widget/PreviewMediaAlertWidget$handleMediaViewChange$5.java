package com.bytedance.android.live.broadcast.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class PreviewMediaAlertWidget$handleMediaViewChange$5 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewMediaAlertWidget$handleMediaViewChange$2 $onTitleChange$2;

    static {
        Covode.recordClassIndex(18600);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewMediaAlertWidget$handleMediaViewChange$5(PreviewMediaAlertWidget$handleMediaViewChange$2 previewMediaAlertWidget$handleMediaViewChange$2) {
        super(1);
        this.$onTitleChange$2 = previewMediaAlertWidget$handleMediaViewChange$2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str2);
            this.$onTitleChange$2.LIZ(str2);
        }
        return Unit.INSTANCE;
    }
}
