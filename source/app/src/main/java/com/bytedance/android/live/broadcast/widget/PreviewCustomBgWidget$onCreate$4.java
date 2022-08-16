package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.model.AudioInteractMode;
import com.bytedance.android.live.broadcast.viewmodel.C3258d;
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
import p003X.IS5;

/* loaded from: classes3.dex */
public final class PreviewCustomBgWidget$onCreate$4 extends Lambda implements Function1<C3258d, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewCustomBgWidget this$0;

    static {
        Covode.recordClassIndex(18492);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewCustomBgWidget$onCreate$4(PreviewCustomBgWidget previewCustomBgWidget) {
        super(1);
        this.this$0 = previewCustomBgWidget;
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCustomBgWidget$onCreate$4$1 */
    /* loaded from: classes3.dex */
    public static final class C32901<T> implements Consumer<AudioInteractMode> {
        public static ChangeQuickRedirect LIZ;
        public static final C32901 LIZIZ = new C32901();

        static {
            Covode.recordClassIndex(18493);
        }

        @Override // io.reactivex.functions.Consumer
        public final /* synthetic */ void accept(AudioInteractMode audioInteractMode) {
            AudioInteractMode audioInteractMode2 = audioInteractMode;
            if (!PatchProxy.proxy(new Object[]{audioInteractMode2}, this, LIZ, false, 1).isSupported) {
                IS5 is5 = IS5.LIZIZ;
                Intrinsics.checkNotNullExpressionValue(audioInteractMode2, "");
                is5.LIZ(audioInteractMode2);
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3258d c3258d) {
        C3258d c3258d2 = c3258d;
        if (!PatchProxy.proxy(new Object[]{c3258d2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c3258d2);
            PreviewCustomBgWidget previewCustomBgWidget = this.this$0;
            Disposable subscribe = c3258d2.LIZIZ.subscribe(C32901.LIZIZ);
            Intrinsics.checkNotNullExpressionValue(subscribe, "");
            previewCustomBgWidget.LIZ(subscribe);
        }
        return Unit.INSTANCE;
    }
}
