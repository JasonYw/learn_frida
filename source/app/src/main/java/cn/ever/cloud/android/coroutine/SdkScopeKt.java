package cn.ever.cloud.android.coroutine;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes23.dex */
public final class SdkScopeKt {
    public static final CoroutineExceptionHandler sdkCoroutineExceptionHandler = new SdkScopeKt$$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key);

    public static final CoroutineExceptionHandler getSdkCoroutineExceptionHandler() {
        return sdkCoroutineExceptionHandler;
    }

    static {
        Covode.recordClassIndex(2843);
    }
}
