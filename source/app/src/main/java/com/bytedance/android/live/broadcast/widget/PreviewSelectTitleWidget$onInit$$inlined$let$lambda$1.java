package com.bytedance.android.live.broadcast.widget;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.core.widget.LiveEditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C2WC;
import p003X.C439913aj;

/* loaded from: classes5.dex */
public final class PreviewSelectTitleWidget$onInit$$inlined$let$lambda$1 extends Lambda implements Function1<RoomCreateInfo, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewSelectTitleWidget this$0;

    static {
        Covode.recordClassIndex(18659);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewSelectTitleWidget$onInit$$inlined$let$lambda$1(PreviewSelectTitleWidget previewSelectTitleWidget) {
        super(1);
        this.this$0 = previewSelectTitleWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(RoomCreateInfo roomCreateInfo) {
        C2WC<Integer> LIZIZ;
        RoomCreateInfo roomCreateInfo2 = roomCreateInfo;
        if (!PatchProxy.proxy(new Object[]{roomCreateInfo2}, this, changeQuickRedirect, false, 1).isSupported && roomCreateInfo2 != null && !TextUtils.isEmpty(roomCreateInfo2.f25775LJ)) {
            View view = this.this$0.contentView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            LiveEditText liveEditText = (LiveEditText) view.findViewById(2131193092);
            Intrinsics.checkNotNullExpressionValue(liveEditText, "");
            liveEditText.setHint("");
            View view2 = this.this$0.contentView;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            ((LiveEditText) view2.findViewById(2131193092)).setText(roomCreateInfo2.f25775LJ);
            View view3 = this.this$0.contentView;
            Intrinsics.checkNotNullExpressionValue(view3, "");
            AppCompatEditText appCompatEditText = (AppCompatEditText) view3.findViewById(2131193092);
            Intrinsics.checkNotNullExpressionValue(appCompatEditText, "");
            if (!TextUtils.isEmpty(appCompatEditText.mo25203getText())) {
                View view4 = this.this$0.contentView;
                Intrinsics.checkNotNullExpressionValue(view4, "");
                View view5 = this.this$0.contentView;
                Intrinsics.checkNotNullExpressionValue(view5, "");
                AppCompatEditText appCompatEditText2 = (AppCompatEditText) view5.findViewById(2131193092);
                Intrinsics.checkNotNullExpressionValue(appCompatEditText2, "");
                Editable mo25203getText = appCompatEditText2.mo25203getText();
                Intrinsics.checkNotNull(mo25203getText);
                ((LiveEditText) view4.findViewById(2131193092)).setSelection(mo25203getText.length());
            }
            PreviewSelectTitleWidget previewSelectTitleWidget = this.this$0;
            String str = roomCreateInfo2.f25775LJ;
            if (str == null) {
                str = "";
            }
            previewSelectTitleWidget.LJIIIZ = str;
            this.this$0.m15863LJ().LJII().LIZ(this.this$0.LJIIIZ);
            C439913aj LIZLLL = this.this$0.LIZLLL();
            if (LIZLLL != null && (LIZIZ = LIZLLL.LIZIZ()) != null) {
                LIZIZ.LIZ(0);
            }
        }
        return Unit.INSTANCE;
    }
}
