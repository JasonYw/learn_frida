package com.bytedance.android.live.broadcast.category.viewmodel;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class LiveGameCategoryWidget$mCategoryViewModel$2 extends Lambda implements Function0<C2970a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LiveGameCategoryWidget this$0;

    static {
        Covode.recordClassIndex(15149);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveGameCategoryWidget$mCategoryViewModel$2(LiveGameCategoryWidget liveGameCategoryWidget) {
        super(0);
        this.this$0 = liveGameCategoryWidget;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.bytedance.android.live.broadcast.category.viewmodel.a, androidx.lifecycle.ViewModel] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.android.live.broadcast.category.viewmodel.a, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2970a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Context context = this.this$0.context;
        if (context != null) {
            return ViewModelProviders.m21142of((FragmentActivity) context).get(C2970a.class);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}