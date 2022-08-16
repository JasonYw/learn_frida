package com.android.ttcjpaysdk.base.bpea.permission;

import android.content.ClipboardManager;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.entry.api.clipboard.ClipboardEntry;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class CJPayBPEAService$setClipboardText$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ClipboardManager $clip;
    public final /* synthetic */ CharSequence $text;

    static {
        Covode.recordClassIndex(5993);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayBPEAService$setClipboardText$2(ClipboardManager clipboardManager, CharSequence charSequence) {
        super(0);
        this.$clip = clipboardManager;
        this.$text = charSequence;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        ClipboardManager clipboardManager;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (clipboardManager = this.$clip) != null) {
            ClipboardEntry.Companion.setText(clipboardManager, this.$text, (Cert) TokenCert.Companion.with("bpea-cjpay_android_confirm_clipboard"));
        }
        return Unit.INSTANCE;
    }
}
