package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class PreviewAudioRoomLayoutWidget$getLayout$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewAudioRoomLayoutWidget this$0;

    static {
        Covode.recordClassIndex(18434);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewAudioRoomLayoutWidget$getLayout$1(PreviewAudioRoomLayoutWidget previewAudioRoomLayoutWidget) {
        super(1);
        this.this$0 = previewAudioRoomLayoutWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        View view2 = view;
        if (!PatchProxy.proxy(new Object[]{view2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view2);
            view2.findViewById(2131180077);
        }
        return Unit.INSTANCE;
    }
}