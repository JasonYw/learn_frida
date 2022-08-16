package com.bytedance.android.live.media.impl.widget;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class MediaAnchorInfoWidget$onLoad$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ MediaAnchorInfoWidget this$0;

    static {
        Covode.recordClassIndex(32465);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaAnchorInfoWidget$onLoad$1(MediaAnchorInfoWidget mediaAnchorInfoWidget) {
        super(1);
        this.this$0 = mediaAnchorInfoWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ();
        }
        return Unit.INSTANCE;
    }
}
