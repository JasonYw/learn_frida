package com.bytedance.accountseal;

import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes26.dex */
public final class AccountSealConfig$innerLooper$2 extends Lambda implements Function0<Looper> {
    public static final AccountSealConfig$innerLooper$2 INSTANCE = new AccountSealConfig$innerLooper$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(9841);
    }

    public AccountSealConfig$innerLooper$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.Looper, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Looper mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        HandlerThread handlerThread = new HandlerThread("AccountSealThread");
        handlerThread.start();
        return handlerThread.getLooper();
    }
}
