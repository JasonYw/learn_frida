package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.M0Q;

/* loaded from: classes5.dex */
public final class AudiencePlayGroupWidget$onUpdate$4 extends Lambda implements Function1<ImageModel, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AudiencePlayGroupWidget this$0;

    static {
        Covode.recordClassIndex(16364);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudiencePlayGroupWidget$onUpdate$4(AudiencePlayGroupWidget audiencePlayGroupWidget) {
        super(1);
        this.this$0 = audiencePlayGroupWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(ImageModel imageModel) {
        ImageModel imageModel2 = imageModel;
        if (!PatchProxy.proxy(new Object[]{imageModel2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(imageModel2);
            AudiencePlayGroupWidget audiencePlayGroupWidget = this.this$0;
            if (!PatchProxy.proxy(new Object[]{imageModel2}, audiencePlayGroupWidget, AudiencePlayGroupWidget.LIZ, false, 3).isSupported && imageModel2 != null) {
                M0Q.LIZIZ((ImageView) audiencePlayGroupWidget.LJFF, imageModel2);
            }
        }
        return Unit.INSTANCE;
    }
}
