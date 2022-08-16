package com.android.ttcjpaysdk.base.settings.abtest;

import com.bytedance.covode.number.Covode;
import com.bytedance.dataplatform.config.ExperimentKey;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C74882Ffo;

/* loaded from: classes2.dex */
public final class CJPayExperimentValue$value$1 extends Lambda implements Function0<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ boolean $isExposure;
    public final /* synthetic */ C74882Ffo this$0;

    static {
        Covode.recordClassIndex(6560);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayExperimentValue$value$1(C74882Ffo c74882Ffo, boolean z) {
        super(0);
        this.this$0 = c74882Ffo;
        this.$isExposure = z;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final T mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ExperimentKey experimentKey = new ExperimentKey(this.this$0.LIZIZ, this.this$0.LIZJ, this.this$0.LIZLLL);
        experimentKey.LIZIZ = false;
        return experimentKey.LIZ(this.$isExposure);
    }
}
