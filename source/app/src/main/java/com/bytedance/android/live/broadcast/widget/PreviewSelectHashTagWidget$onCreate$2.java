package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.model.AudioInteractMode;
import com.bytedance.android.live.broadcast.viewmodel.C3258d;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C91513M3n;

/* loaded from: classes5.dex */
public final class PreviewSelectHashTagWidget$onCreate$2 extends Lambda implements Function1<C3258d, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewSelectHashTagWidget this$0;

    static {
        Covode.recordClassIndex(18647);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewSelectHashTagWidget$onCreate$2(PreviewSelectHashTagWidget previewSelectHashTagWidget) {
        super(1);
        this.this$0 = previewSelectHashTagWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3258d c3258d) {
        C3258d c3258d2 = c3258d;
        if (!PatchProxy.proxy(new Object[]{c3258d2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c3258d2);
            PreviewSelectHashTagWidget previewSelectHashTagWidget = this.this$0;
            Disposable subscribe = C91513M3n.LIZIZ(c3258d2.LIZIZ).subscribe(new Consumer<AudioInteractMode>() { // from class: com.bytedance.android.live.broadcast.widget.PreviewSelectHashTagWidget$onCreate$2.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(18648);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(AudioInteractMode audioInteractMode) {
                    C2WC<LiveMode> c2wc;
                    LiveMode LIZ2;
                    AudioInteractMode audioInteractMode2 = audioInteractMode;
                    if (!PatchProxy.proxy(new Object[]{audioInteractMode2}, this, LIZ, false, 1).isSupported && (c2wc = PreviewSelectHashTagWidget$onCreate$2.this.this$0.LIZJ().LIZJ) != null && (LIZ2 = c2wc.LIZ()) != null) {
                        PreviewSelectHashTagWidget previewSelectHashTagWidget2 = PreviewSelectHashTagWidget$onCreate$2.this.this$0;
                        Intrinsics.checkNotNullExpressionValue(audioInteractMode2, "");
                        previewSelectHashTagWidget2.LIZ(LIZ2, audioInteractMode2);
                    }
                }
            });
            Intrinsics.checkNotNullExpressionValue(subscribe, "");
            previewSelectHashTagWidget.LIZ(subscribe);
        }
        return Unit.INSTANCE;
    }
}
