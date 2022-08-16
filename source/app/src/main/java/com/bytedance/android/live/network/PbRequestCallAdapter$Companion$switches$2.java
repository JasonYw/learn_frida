package com.bytedance.android.live.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C102305QQp;

/* loaded from: classes22.dex */
public final class PbRequestCallAdapter$Companion$switches$2 extends Lambda implements Function0<JSONObject> {
    public static final PbRequestCallAdapter$Companion$switches$2 INSTANCE = new PbRequestCallAdapter$Companion$switches$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32610);
    }

    public PbRequestCallAdapter$Companion$switches$2() {
        super(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: LIZ */
    public JSONObject mo30099invoke() {
        JSONObject createFailure;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        try {
            createFailure = new JSONObject(C102305QQp.LIZIZ.LIZIZ);
            Result.m30308constructorimpl(createFailure);
        } catch (Throwable th) {
            createFailure = ResultKt.createFailure(th);
            Result.m30308constructorimpl(createFailure);
        }
        JSONObject jSONObject = new JSONObject();
        if (Result.m30314isFailureimpl(createFailure)) {
            createFailure = jSONObject;
        }
        return (JSONObject) createFailure;
    }
}
