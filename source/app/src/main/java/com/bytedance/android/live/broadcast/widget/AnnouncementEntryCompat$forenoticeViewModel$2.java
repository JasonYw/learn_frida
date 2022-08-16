package com.bytedance.android.live.broadcast.widget;

import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.broadcast.viewmodel.C3255a;
import com.bytedance.android.livesdk.C9078n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class AnnouncementEntryCompat$forenoticeViewModel$2 extends Lambda implements Function0<C3255a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C9078n $dialogFragment;

    static {
        Covode.recordClassIndex(18300);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnouncementEntryCompat$forenoticeViewModel$2(C9078n c9078n) {
        super(0);
        this.$dialogFragment = c9078n;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.lifecycle.ViewModel, com.bytedance.android.live.broadcast.viewmodel.a] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.bytedance.android.live.broadcast.viewmodel.a] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3255a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return ViewModelProviders.m21144of(this.$dialogFragment).get(C3255a.class);
    }
}
