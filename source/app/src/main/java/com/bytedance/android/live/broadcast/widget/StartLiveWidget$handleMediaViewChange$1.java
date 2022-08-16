package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes5.dex */
public final class StartLiveWidget$handleMediaViewChange$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Ref.BooleanRef $isCoverValid;
    public final /* synthetic */ Ref.BooleanRef $isTitleValid;
    public final /* synthetic */ StartLiveWidget this$0;

    static {
        Covode.recordClassIndex(18809);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveWidget$handleMediaViewChange$1(StartLiveWidget startLiveWidget, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2) {
        super(0);
        this.this$0 = startLiveWidget;
        this.$isTitleValid = booleanRef;
        this.$isCoverValid = booleanRef2;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        LIZ();
        return Unit.INSTANCE;
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        if (this.$isTitleValid.element && this.$isCoverValid.element) {
            View view = this.this$0.contentView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            TextView textView = (TextView) view.findViewById(2131168471);
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setAlpha(1.0f);
            return;
        }
        View view2 = this.this$0.contentView;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        TextView textView2 = (TextView) view2.findViewById(2131168471);
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setAlpha(0.34f);
    }
}
