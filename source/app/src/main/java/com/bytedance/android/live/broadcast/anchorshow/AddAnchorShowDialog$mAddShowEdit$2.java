package com.bytedance.android.live.broadcast.anchorshow;

import android.view.View;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C89433LLn;

/* loaded from: classes5.dex */
public final class AddAnchorShowDialog$mAddShowEdit$2 extends Lambda implements Function0<EditText> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C89433LLn this$0;

    static {
        Covode.recordClassIndex(14350);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddAnchorShowDialog$mAddShowEdit$2(C89433LLn c89433LLn) {
        super(0);
        this.this$0 = c89433LLn;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View, android.widget.EditText] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, android.widget.EditText] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ EditText mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        View view = this.this$0.LIZLLL;
        if (view != null) {
            return view.findViewById(2131166129);
        }
        return null;
    }
}
