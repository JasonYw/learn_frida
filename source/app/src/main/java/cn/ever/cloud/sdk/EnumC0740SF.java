package cn.ever.cloud.sdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: cn.ever.cloud.sdk.SF */
/* loaded from: classes23.dex */
public enum EnumC0740SF implements AbstractC0758b {
    DOU_YIN { // from class: cn.ever.cloud.sdk.SF.DOU_YIN
        @Override // cn.ever.cloud.sdk.AbstractC0758b
        public final SourceFrom LIZ() {
            return SourceFrom.DOUYIN;
        }
    };
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3297);
    }

    public static EnumC0740SF valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (EnumC0740SF) (proxy.isSupported ? proxy.result : Enum.valueOf(EnumC0740SF.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EnumC0740SF[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (EnumC0740SF[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    /* synthetic */ EnumC0740SF(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
