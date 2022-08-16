package cn.ever.cloud.utils.error;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class ErrorCode$Companion$findByCode$index$1 extends Lambda implements Function1<ErrorCode, Integer> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ int $code;

    static {
        Covode.recordClassIndex(3455);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorCode$Companion$findByCode$index$1(int i) {
        super(1);
        this.$code = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Integer invoke(ErrorCode errorCode) {
        return Integer.valueOf(invoke2(errorCode));
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final int invoke2(ErrorCode errorCode) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{errorCode}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C106862S5w.LIZ(errorCode);
        return Intrinsics.compare(errorCode.getCode(), this.$code);
    }
}
