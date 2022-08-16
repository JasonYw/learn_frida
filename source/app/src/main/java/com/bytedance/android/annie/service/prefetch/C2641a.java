package com.bytedance.android.annie.service.prefetch;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import java.io.InputStream;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Result;
import kotlin.ResultKt;
import p003X.C106862S5w;
import p003X.C75795FuX;
import p003X.C99783PRp;
import p003X.PLB;
import p003X.PLJ;

/* renamed from: com.bytedance.android.annie.service.prefetch.a */
/* loaded from: classes7.dex */
public final class C2641a implements PLB {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(AnnieGeckoResLoader$file$2.INSTANCE);
    public final C75795FuX LIZJ;

    static {
        Covode.recordClassIndex(11171);
    }

    public C2641a() {
        Object mo27335getValue;
        Application application = C99783PRp.LJIIJ.LIZ().LIZIZ;
        String LIZ2 = PLJ.LIZ(null, 1, null);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            mo27335getValue = proxy.result;
        } else {
            mo27335getValue = this.LIZIZ.mo27335getValue();
        }
        this.LIZJ = new C75795FuX(application, LIZ2, (File) mo27335getValue);
    }

    @Override // p003X.PLB
    public final InputStream LIZ(String str, String str2) {
        Object createFailure;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (InputStream) proxy.result;
        }
        C106862S5w.LIZ(str, str2);
        try {
            C75795FuX c75795FuX = this.LIZJ;
            createFailure = c75795FuX.LIZ(str2 + '/' + str);
            Result.m30308constructorimpl(createFailure);
        } catch (Throwable th) {
            createFailure = ResultKt.createFailure(th);
            Result.m30308constructorimpl(createFailure);
        }
        if (Result.m30314isFailureimpl(createFailure)) {
            createFailure = null;
        }
        return (InputStream) createFailure;
    }
}
