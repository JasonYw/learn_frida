package com.byted.mgl.service.api.privacy.permission;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes15.dex */
public final class PermitResult {
    public final boolean neverAsk;
    public final String permission;
    public final Type resultType;

    /* loaded from: classes15.dex */
    public enum Type {
        GRANTED,
        DENIED,
        NOT_FOUND;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(9812);
        }

        public static Type valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (Type) (proxy.isSupported ? proxy.result : Enum.valueOf(Type.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (Type[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(9811);
    }

    public PermitResult(String str, Type type, boolean z) {
        C106862S5w.LIZ(str, type);
        this.permission = str;
        this.resultType = type;
        this.neverAsk = z;
    }
}
