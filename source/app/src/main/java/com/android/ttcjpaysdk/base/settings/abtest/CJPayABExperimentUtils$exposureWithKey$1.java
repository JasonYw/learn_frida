package com.android.ttcjpaysdk.base.settings.abtest;

import com.bytedance.covode.number.Covode;
import com.bytedance.dataplatform.config.ExperimentEntityUtiilKt;
import com.bytedance.dataplatform.config.Setting;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class CJPayABExperimentUtils$exposureWithKey$1 extends Lambda implements Function0<Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $key;

    static {
        Covode.recordClassIndex(6559);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayABExperimentUtils$exposureWithKey$1(String str) {
        super(0);
        this.$key = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Object obj = ExperimentEntityUtiilKt.setting(this.$key, Object.class, new Object(), Setting.INSTANCE.isSticky());
        if (obj == null) {
            Intrinsics.throwNpe();
        }
        return obj;
    }
}
