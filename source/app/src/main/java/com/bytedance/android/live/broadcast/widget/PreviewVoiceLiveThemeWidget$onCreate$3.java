package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.model.AudioInteractMode;
import com.bytedance.android.live.broadcast.viewmodel.C3258d;
import com.bytedance.android.livesdkapi.depend.model.live.audio.VoiceLiveTheme;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC81935IRd;
import p003X.C106862S5w;
import p003X.C81951IRt;

/* loaded from: classes3.dex */
public final class PreviewVoiceLiveThemeWidget$onCreate$3 extends Lambda implements Function1<C3258d, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewVoiceLiveThemeWidget this$0;

    static {
        Covode.recordClassIndex(18757);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewVoiceLiveThemeWidget$onCreate$3(PreviewVoiceLiveThemeWidget previewVoiceLiveThemeWidget) {
        super(1);
        this.this$0 = previewVoiceLiveThemeWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3258d c3258d) {
        C3258d c3258d2 = c3258d;
        if (!PatchProxy.proxy(new Object[]{c3258d2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c3258d2);
            PreviewVoiceLiveThemeWidget previewVoiceLiveThemeWidget = this.this$0;
            Disposable subscribe = c3258d2.LIZIZ.subscribe(new Consumer<AudioInteractMode>() { // from class: com.bytedance.android.live.broadcast.widget.PreviewVoiceLiveThemeWidget$onCreate$3.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(18758);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(AudioInteractMode audioInteractMode) {
                    VoiceLiveTheme LIZ2;
                    boolean z = true;
                    if (!PatchProxy.proxy(new Object[]{audioInteractMode}, this, LIZ, false, 1).isSupported) {
                        if (audioInteractMode != AudioInteractMode.Radio) {
                            z = false;
                        }
                        C81951IRt.LIZ(z);
                        PreviewVoiceLiveThemeWidget previewVoiceLiveThemeWidget2 = PreviewVoiceLiveThemeWidget$onCreate$3.this.this$0;
                        if (!PatchProxy.proxy(new Object[0], previewVoiceLiveThemeWidget2, PreviewVoiceLiveThemeWidget.LIZ, false, 4).isSupported) {
                            int LIZJ = previewVoiceLiveThemeWidget2.LIZJ();
                            previewVoiceLiveThemeWidget2.LIZ(LIZJ);
                            AbstractC81935IRd abstractC81935IRd = previewVoiceLiveThemeWidget2.f26002LJ;
                            if (abstractC81935IRd != null && (LIZ2 = abstractC81935IRd.LIZ(LIZJ)) != null) {
                                previewVoiceLiveThemeWidget2.LIZ(LIZ2, LIZJ);
                            }
                        }
                    }
                }
            });
            Intrinsics.checkNotNullExpressionValue(subscribe, "");
            previewVoiceLiveThemeWidget.LIZ(subscribe);
        }
        return Unit.INSTANCE;
    }
}
