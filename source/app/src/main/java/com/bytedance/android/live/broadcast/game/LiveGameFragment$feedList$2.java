package com.bytedance.android.live.broadcast.game;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C100639PkH;

/* loaded from: classes8.dex */
public final class LiveGameFragment$feedList$2 extends Lambda implements Function0<RecyclerView> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C100639PkH this$0;

    static {
        Covode.recordClassIndex(15969);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveGameFragment$feedList$2(C100639PkH c100639PkH) {
        super(0);
        this.this$0 = c100639PkH;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.View, androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, androidx.recyclerview.widget.RecyclerView] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ RecyclerView mo30099invoke() {
        View view;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C100639PkH c100639PkH = this.this$0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c100639PkH}, null, C100639PkH.LIZ, true, 29);
        if (proxy2.isSupported) {
            view = (View) proxy2.result;
        } else {
            view = c100639PkH.LIZIZ;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
        }
        return view.findViewById(2131175921);
    }
}
