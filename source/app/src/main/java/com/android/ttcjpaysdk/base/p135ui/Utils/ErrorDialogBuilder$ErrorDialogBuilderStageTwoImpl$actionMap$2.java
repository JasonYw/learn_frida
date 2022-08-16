package com.android.ttcjpaysdk.base.p135ui.Utils;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.android.ttcjpaysdk.base.ui.Utils.ErrorDialogBuilder$ErrorDialogBuilderStageTwoImpl$actionMap$2 */
/* loaded from: classes.dex */
public final class ErrorDialogBuilder$ErrorDialogBuilderStageTwoImpl$actionMap$2 extends Lambda implements Function0<Map<Integer, Function1<? super View, ? extends Unit>>> {
    public static final ErrorDialogBuilder$ErrorDialogBuilderStageTwoImpl$actionMap$2 INSTANCE = new ErrorDialogBuilder$ErrorDialogBuilderStageTwoImpl$actionMap$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6606);
    }

    public ErrorDialogBuilder$ErrorDialogBuilderStageTwoImpl$actionMap$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map<java.lang.Integer, kotlin.jvm.functions.Function1<? super android.view.View, ? extends kotlin.Unit>>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Map<Integer, Function1<? super View, ? extends Unit>> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new LinkedHashMap();
    }
}
