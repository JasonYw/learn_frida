package com.bytedance.android.live.browser.jsbridge.state;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes.dex */
public final class StateObserver$Companion$getValuesFromStates$1$2 extends Lambda implements Function1<String, Boolean> {
    public static final StateObserver$Companion$getValuesFromStates$1$2 INSTANCE = new StateObserver$Companion$getValuesFromStates$1$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(22986);
    }

    public StateObserver$Companion$getValuesFromStates$1$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(String str) {
        String str2 = str;
        boolean z = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            z = ((Boolean) proxy.result).booleanValue();
        } else {
            Intrinsics.checkNotNullExpressionValue(str2, "");
            if (StringsKt__StringsJVMKt.isBlank(str2)) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
