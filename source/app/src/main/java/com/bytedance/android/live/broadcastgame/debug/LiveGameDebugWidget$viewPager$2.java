package com.bytedance.android.live.broadcastgame.debug;

import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class LiveGameDebugWidget$viewPager$2 extends Lambda implements Function0<ViewPager> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LiveGameDebugWidget this$0;

    static {
        Covode.recordClassIndex(19706);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveGameDebugWidget$viewPager$2(LiveGameDebugWidget liveGameDebugWidget) {
        super(0);
        this.this$0 = liveGameDebugWidget;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, androidx.viewpager.widget.ViewPager] */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.viewpager.widget.ViewPager, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ViewPager mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.findViewById(2131192979);
    }
}
