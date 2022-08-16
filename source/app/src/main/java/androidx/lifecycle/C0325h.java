package androidx.lifecycle;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.C106862S5w;

/* renamed from: androidx.lifecycle.h */
/* loaded from: classes.dex */
public final class C0325h {
    public static final /* synthetic */ KProperty[] LIZ;
    public final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(JediViewHolderProxyViewModelStore$viewModels$2.INSTANCE);

    static {
        Covode.recordClassIndex(1407);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(C0325h.class), "viewModels", "getViewModels()Ljava/util/HashMap;");
        Reflection.property1(propertyReference1Impl);
        LIZ = new KProperty[]{propertyReference1Impl};
    }

    public final HashMap<String, ViewModel> LIZ() {
        return (HashMap) this.LIZIZ.mo27335getValue();
    }

    public final void LIZIZ() {
        Collection<ViewModel> values = LIZ().values();
        Intrinsics.checkExpressionValueIsNotNull(values, "");
        for (ViewModel viewModel : values) {
            viewModel.onCleared();
        }
        LIZ().clear();
    }

    public final void LIZ(String str, ViewModel viewModel) {
        C106862S5w.LIZ(str, viewModel);
        ViewModel put = LIZ().put(str, viewModel);
        if (put != null) {
            put.onCleared();
        }
    }
}
