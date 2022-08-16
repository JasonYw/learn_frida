package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.model.AudioInteractMode;
import com.bytedance.android.live.broadcast.viewmodel.C3258d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.functions.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C91513M3n;

/* loaded from: classes5.dex */
public final class StartLiveWidget$initStartLiveViewModel$3 extends Lambda implements Function1<C3258d, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ StartLiveWidget this$0;

    static {
        Covode.recordClassIndex(18816);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveWidget$initStartLiveViewModel$3(StartLiveWidget startLiveWidget) {
        super(1);
        this.this$0 = startLiveWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3258d c3258d) {
        C3258d c3258d2 = c3258d;
        if (!PatchProxy.proxy(new Object[]{c3258d2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c3258d2);
            this.this$0.LJJ = c3258d2;
            C91513M3n.LIZIZ(c3258d2.LIZIZ).subscribe(new Consumer<AudioInteractMode>() { // from class: com.bytedance.android.live.broadcast.widget.StartLiveWidget$initStartLiveViewModel$3.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(18817);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(AudioInteractMode audioInteractMode) {
                    if (!PatchProxy.proxy(new Object[]{audioInteractMode}, this, LIZ, false, 1).isSupported) {
                        StartLiveWidget$initStartLiveViewModel$3.this.this$0.LIZ(StartLiveWidget$initStartLiveViewModel$3.this.this$0.LJIIJJI().LIZ().LIZ());
                    }
                }
            });
        }
        return Unit.INSTANCE;
    }
}
