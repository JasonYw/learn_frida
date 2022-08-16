package com.bytedance.android.live.browser.jsbridge.base;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C147694fNA;
import p003X.C147695fNB;
import p003X.C147696fNC;
import p003X.C37J;

/* loaded from: classes20.dex */
public final class BaseInfoResultModel implements C37J {
    @SerializedName(C2521l.LJIIJ)
    public Code LIZ;
    @SerializedName("user_info")
    public C147695fNB LIZIZ;
    @SerializedName("room_info")
    public C147696fNC LIZJ;
    @SerializedName("anchor_info")
    public C147694fNA LIZLLL;
    @SerializedName("start_time")

    /* renamed from: LJ */
    public String f26124LJ;

    static {
        Covode.recordClassIndex(22061);
    }

    /* loaded from: classes8.dex */
    public enum Code implements AbstractC3909ci {
        Success(1),
        Failed(0);
        
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

        @Override // com.bytedance.android.live.browser.jsbridge.base.AbstractC3909ci
        public final int LIZ() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(22062);
        }

        Code(int i) {
            this.value = i;
        }
    }
}
