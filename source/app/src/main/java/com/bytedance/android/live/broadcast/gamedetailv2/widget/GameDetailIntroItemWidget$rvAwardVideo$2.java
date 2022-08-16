package com.bytedance.android.live.broadcast.gamedetailv2.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class GameDetailIntroItemWidget$rvAwardVideo$2 extends Lambda implements Function0<RecyclerView> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameDetailIntroItemWidget this$0;

    static {
        Covode.recordClassIndex(16755);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailIntroItemWidget$rvAwardVideo$2(GameDetailIntroItemWidget gameDetailIntroItemWidget) {
        super(0);
        this.this$0 = gameDetailIntroItemWidget;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, androidx.recyclerview.widget.RecyclerView] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ RecyclerView mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.contentView.findViewById(2131188493);
    }
}
