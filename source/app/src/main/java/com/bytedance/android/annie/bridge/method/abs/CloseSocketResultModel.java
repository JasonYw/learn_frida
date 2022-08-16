package com.bytedance.android.annie.bridge.method.abs;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.AbstractC88716KxS;

/* loaded from: classes5.dex */
public final class CloseSocketResultModel implements AbstractC88716KxS {
    @SerializedName(C2521l.LJIIJ)
    public Code LIZ;
    @SerializedName("msg")
    public String LIZIZ;

    static {
        Covode.recordClassIndex(10541);
    }

    /* loaded from: classes5.dex */
    public enum Code implements AbstractC2591o {
        Success(1),
        Failed(0),
        InvalidParam(-3),
        TargetNotFound(-9);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int value;

        public static Code valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (Code) (proxy.isSupported ? proxy.result : Enum.valueOf(Code.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Code[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (Code[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        @Override // com.bytedance.android.annie.bridge.method.abs.AbstractC2591o
        public final int LIZ() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(10542);
        }

        Code(int i) {
            this.value = i;
        }
    }
}
