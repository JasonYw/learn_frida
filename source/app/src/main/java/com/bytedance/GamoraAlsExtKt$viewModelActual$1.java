package com.bytedance;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.objectcontainer.AbstractC13802a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes24.dex */
public final class GamoraAlsExtKt$viewModelActual$1 extends Lambda implements Function0<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Class $clazz;
    public final /* synthetic */ AbstractC13802a $this_viewModelActual;

    static {
        Covode.recordClassIndex(9835);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamoraAlsExtKt$viewModelActual$1(AbstractC13802a abstractC13802a, Class cls) {
        super(0);
        this.$this_viewModelActual = abstractC13802a;
        this.$clazz = cls;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Object mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return ViewModelProviders.m21142of((FragmentActivity) this.$this_viewModelActual.LJIJJLI().LIZ(FragmentActivity.class)).get(this.$clazz);
    }
}
