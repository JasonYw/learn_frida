package cn.ever.cloud.utils.error;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes23.dex */
public final class ErrorCode$Companion$orderedCode$2 extends Lambda implements Function0<List<? extends ErrorCode>> {
    public static final ErrorCode$Companion$orderedCode$2 INSTANCE = new ErrorCode$Companion$orderedCode$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3456);
    }

    public ErrorCode$Companion$orderedCode$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: collision with other method in class */
    public final List<? extends ErrorCode> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        return CollectionsKt___CollectionsKt.sortedWith(ArraysKt___ArraysKt.toList(ErrorCode.valuesCustom()), new Comparator<T>() { // from class: cn.ever.cloud.utils.error.ErrorCode$Companion$orderedCode$2$$special$$inlined$sortedBy$1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(3457);
            }

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{t, t2}, this, changeQuickRedirect, false, 1);
                if (proxy2.isSupported) {
                    return ((Integer) proxy2.result).intValue();
                }
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((ErrorCode) t).getCode()), Integer.valueOf(((ErrorCode) t2).getCode()));
            }
        });
    }
}
