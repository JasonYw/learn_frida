package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.api.model.C2918r;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCompanionCertificationWidget$onCreate$$inlined$let$lambda$1 */
/* loaded from: classes5.dex */
public final class C3288x68c3d3b extends Lambda implements Function1<C2918r, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewCompanionCertificationWidget this$0;

    static {
        Covode.recordClassIndex(18457);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3288x68c3d3b(PreviewCompanionCertificationWidget previewCompanionCertificationWidget) {
        super(1);
        this.this$0 = previewCompanionCertificationWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C2918r c2918r) {
        C2918r c2918r2 = c2918r;
        if (!PatchProxy.proxy(new Object[]{c2918r2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c2918r2);
            this.this$0.LIZLLL = c2918r2.LIZ;
            PreviewCompanionCertificationWidget previewCompanionCertificationWidget = this.this$0;
            previewCompanionCertificationWidget.LIZ(previewCompanionCertificationWidget.LIZLLL);
        }
        return Unit.INSTANCE;
    }
}
