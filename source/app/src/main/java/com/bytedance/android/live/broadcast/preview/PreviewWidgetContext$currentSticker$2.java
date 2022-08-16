package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C81908IQc;

/* loaded from: classes12.dex */
public final class PreviewWidgetContext$currentSticker$2 extends Lambda implements Function1<C81908IQc<Sticker>, Unit> {
    public static final PreviewWidgetContext$currentSticker$2 INSTANCE = new PreviewWidgetContext$currentSticker$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(17098);
    }

    public PreviewWidgetContext$currentSticker$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C81908IQc<Sticker> c81908IQc) {
        if (!PatchProxy.proxy(new Object[]{c81908IQc}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c81908IQc);
        }
        return Unit.INSTANCE;
    }
}
