package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.viewmodel.C3258d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C91301Ly3;
import p003X.C91513M3n;
import p003X.IQQ;
import p003X.IS0;

/* loaded from: classes3.dex */
public final class PreviewAudioRoomLayoutWidget$onCreate$1 extends Lambda implements Function1<C3258d, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewAudioRoomLayoutWidget this$0;

    static {
        Covode.recordClassIndex(18435);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewAudioRoomLayoutWidget$onCreate$1(PreviewAudioRoomLayoutWidget previewAudioRoomLayoutWidget) {
        super(1);
        this.this$0 = previewAudioRoomLayoutWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3258d c3258d) {
        C3258d c3258d2 = c3258d;
        if (!PatchProxy.proxy(new Object[]{c3258d2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c3258d2);
            PreviewAudioRoomLayoutWidget previewAudioRoomLayoutWidget = this.this$0;
            if (!PatchProxy.proxy(new Object[]{c3258d2}, previewAudioRoomLayoutWidget, PreviewAudioRoomLayoutWidget.LIZ, false, 6).isSupported && previewAudioRoomLayoutWidget.isViewValid()) {
                Disposable subscribe = C91301Ly3.LIZIZ(C91513M3n.LIZIZ(c3258d2.LIZIZ)).subscribe(new IQQ(previewAudioRoomLayoutWidget));
                Intrinsics.checkNotNullExpressionValue(subscribe, "");
                previewAudioRoomLayoutWidget.LIZ(subscribe);
                Disposable subscribe2 = previewAudioRoomLayoutWidget.LJIIJJI().LIZIZ().LIZIZ().subscribe(new IS0(previewAudioRoomLayoutWidget, c3258d2));
                Intrinsics.checkNotNullExpressionValue(subscribe2, "");
                previewAudioRoomLayoutWidget.LIZ(subscribe2);
            }
        }
        return Unit.INSTANCE;
    }
}
