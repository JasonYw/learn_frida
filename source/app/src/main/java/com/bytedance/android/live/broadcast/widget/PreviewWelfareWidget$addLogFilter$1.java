package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C34H;

/* loaded from: classes12.dex */
public final class PreviewWelfareWidget$addLogFilter$1 extends Lambda implements Function1<LiveMode, Unit> {
    public static final PreviewWelfareWidget$addLogFilter$1 INSTANCE = new PreviewWelfareWidget$addLogFilter$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(18761);
    }

    public PreviewWelfareWidget$addLogFilter$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(LiveMode liveMode) {
        LiveMode liveMode2 = liveMode;
        if (!PatchProxy.proxy(new Object[]{liveMode2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(liveMode2);
            C34H.LIZIZ.LIZ(liveMode2);
        }
        return Unit.INSTANCE;
    }
}
