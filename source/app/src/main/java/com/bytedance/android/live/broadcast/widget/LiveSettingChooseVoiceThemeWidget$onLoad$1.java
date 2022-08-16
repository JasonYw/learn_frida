package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import com.bytedance.android.live.broadcast.preview.C3181o;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.IS5;

/* loaded from: classes3.dex */
public final class LiveSettingChooseVoiceThemeWidget$onLoad$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LiveSettingChooseVoiceThemeWidget this$0;

    static {
        Covode.recordClassIndex(18356);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveSettingChooseVoiceThemeWidget$onLoad$1(LiveSettingChooseVoiceThemeWidget liveSettingChooseVoiceThemeWidget) {
        super(1);
        this.this$0 = liveSettingChooseVoiceThemeWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        Object mo27335getValue;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            LiveSettingChooseVoiceThemeWidget liveSettingChooseVoiceThemeWidget = this.this$0;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], liveSettingChooseVoiceThemeWidget, LiveSettingChooseVoiceThemeWidget.LIZ, false, 1);
            if (proxy.isSupported) {
                mo27335getValue = proxy.result;
            } else {
                mo27335getValue = liveSettingChooseVoiceThemeWidget.LIZJ.mo27335getValue();
            }
            ((C3181o) mo27335getValue).LJI().postValue(Boolean.TRUE);
            IS5.LIZIZ.LIZIZ(this.this$0.LIZIZ);
            this.this$0.LIZLLL.mo30099invoke();
        }
        return Unit.INSTANCE;
    }
}
