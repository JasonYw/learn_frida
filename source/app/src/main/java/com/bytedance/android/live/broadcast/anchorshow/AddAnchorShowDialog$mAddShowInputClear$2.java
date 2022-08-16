package com.bytedance.android.live.broadcast.anchorshow;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C89433LLn;

/* loaded from: classes5.dex */
public final class AddAnchorShowDialog$mAddShowInputClear$2 extends Lambda implements Function0<ImageView> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C89433LLn this$0;

    static {
        Covode.recordClassIndex(14351);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddAnchorShowDialog$mAddShowInputClear$2(C89433LLn c89433LLn) {
        super(0);
        this.this$0 = c89433LLn;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.widget.ImageView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.widget.ImageView, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ImageView mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        View view = this.this$0.LIZLLL;
        if (view != null) {
            return view.findViewById(2131166132);
        }
        return null;
    }
}
