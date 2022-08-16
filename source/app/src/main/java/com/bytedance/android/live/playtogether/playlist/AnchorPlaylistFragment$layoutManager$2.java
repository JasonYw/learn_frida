package com.bytedance.android.live.playtogether.playlist;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.LVN;

/* loaded from: classes5.dex */
public final class AnchorPlaylistFragment$layoutManager$2 extends Lambda implements Function0<LinearLayoutManager> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LVN this$0;

    static {
        Covode.recordClassIndex(33030);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorPlaylistFragment$layoutManager$2(LVN lvn) {
        super(0);
        this.this$0 = lvn;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, androidx.recyclerview.widget.LinearLayoutManager] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ LinearLayoutManager mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new LinearLayoutManager(this.this$0.getContext(), 1, false);
    }
}
