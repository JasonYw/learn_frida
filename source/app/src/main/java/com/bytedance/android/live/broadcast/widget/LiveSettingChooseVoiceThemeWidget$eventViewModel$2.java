package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.broadcast.preview.C3181o;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class LiveSettingChooseVoiceThemeWidget$eventViewModel$2 extends Lambda implements Function0<C3181o> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LiveSettingChooseVoiceThemeWidget this$0;

    static {
        Covode.recordClassIndex(18355);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveSettingChooseVoiceThemeWidget$eventViewModel$2(LiveSettingChooseVoiceThemeWidget liveSettingChooseVoiceThemeWidget) {
        super(0);
        this.this$0 = liveSettingChooseVoiceThemeWidget;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.bytedance.android.live.broadcast.preview.o, androidx.lifecycle.ViewModel] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.android.live.broadcast.preview.o, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3181o mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Context context = this.this$0.context;
        if (context != null) {
            return ViewModelProviders.m21142of((FragmentActivity) context).get(C3181o.class);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}
