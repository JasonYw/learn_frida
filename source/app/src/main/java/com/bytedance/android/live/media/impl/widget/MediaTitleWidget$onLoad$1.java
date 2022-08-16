package com.bytedance.android.live.media.impl.widget;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes12.dex */
public final /* synthetic */ class MediaTitleWidget$onLoad$1 extends FunctionReferenceImpl implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32482);
    }

    public MediaTitleWidget$onLoad$1(MediaTitleWidget mediaTitleWidget) {
        super(1, mediaTitleWidget, MediaTitleWidget.class, "onClick", "onClick(Landroid/view/View;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        View view2 = view;
        if (!PatchProxy.proxy(new Object[]{view2}, this, changeQuickRedirect, false, 1).isSupported) {
            ((MediaTitleWidget) this.receiver).onClick(view2);
        }
        return Unit.INSTANCE;
    }
}
