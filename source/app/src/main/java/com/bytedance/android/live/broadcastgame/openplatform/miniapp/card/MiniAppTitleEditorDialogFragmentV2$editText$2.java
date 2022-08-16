package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87871Kjp;

/* loaded from: classes5.dex */
public final class MiniAppTitleEditorDialogFragmentV2$editText$2 extends Lambda implements Function0<EditText> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87871Kjp this$0;

    static {
        Covode.recordClassIndex(21590);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppTitleEditorDialogFragmentV2$editText$2(C87871Kjp c87871Kjp) {
        super(0);
        this.this$0 = c87871Kjp;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, android.widget.EditText] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, android.widget.EditText] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ EditText mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.getDialog().findViewById(2131192310);
    }
}
