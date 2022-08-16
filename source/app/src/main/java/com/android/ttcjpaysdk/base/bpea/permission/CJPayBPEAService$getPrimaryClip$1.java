package com.android.ttcjpaysdk.base.bpea.permission;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.entry.api.clipboard.ClipboardEntry;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class CJPayBPEAService$getPrimaryClip$1 extends Lambda implements Function0<ClipData> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ClipboardManager $clip;

    static {
        Covode.recordClassIndex(5989);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayBPEAService$getPrimaryClip$1(ClipboardManager clipboardManager) {
        super(0);
        this.$clip = clipboardManager;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.content.ClipData, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ClipData mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ClipboardManager clipboardManager = this.$clip;
        if (clipboardManager != null) {
            return ClipboardEntry.Companion.getPrimaryClip(clipboardManager, TokenCert.Companion.with("bpea-cjpay_android_edit_text_clipboard"));
        }
        return null;
    }
}
