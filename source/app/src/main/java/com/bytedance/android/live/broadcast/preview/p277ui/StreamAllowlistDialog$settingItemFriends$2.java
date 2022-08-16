package com.bytedance.android.live.broadcast.preview.p277ui;

import android.view.View;
import com.bytedance.android.live.broadcast.preview.p277ui.common.StartLiveVisibilityItemView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C77749Gkx;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.StreamAllowlistDialog$settingItemFriends$2 */
/* loaded from: classes3.dex */
public final class StreamAllowlistDialog$settingItemFriends$2 extends Lambda implements Function0<StartLiveVisibilityItemView> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C77749Gkx this$0;

    static {
        Covode.recordClassIndex(17346);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamAllowlistDialog$settingItemFriends$2(C77749Gkx c77749Gkx) {
        super(0);
        this.this$0 = c77749Gkx;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.broadcast.preview.ui.common.StartLiveVisibilityItemView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.android.live.broadcast.preview.ui.common.StartLiveVisibilityItemView, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ StartLiveVisibilityItemView mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        View view = this.this$0.LIZIZ;
        if (view != null) {
            return view.findViewById(2131189447);
        }
        return null;
    }
}
