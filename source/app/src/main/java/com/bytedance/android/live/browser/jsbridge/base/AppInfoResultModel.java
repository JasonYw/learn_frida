package com.bytedance.android.live.browser.jsbridge.base;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C37J;
import p003X.C64859BiX;

/* loaded from: classes5.dex */
public final class AppInfoResultModel implements C37J {
    @SerializedName(C2521l.LJIIJ)
    public Code LIZ;
    @SerializedName(C64859BiX.LIZIZ)
    public String LIZIZ;
    @SerializedName("appName")
    public String LIZJ;
    @SerializedName("appVersion")
    public String LIZLLL;
    @SerializedName("device_id")

    /* renamed from: LJ */
    public String f26123LJ;
    @SerializedName("netType")
    public String LJFF;
    @SerializedName("user_id")
    public String LJI;
    @SerializedName("sec_user_id")
    public String LJII;
    @SerializedName("orientation")
    public String LJIIIIZZ;
    @SerializedName("screenHeight")
    public Number LJIIIZ;
    @SerializedName("screenWidth")
    public Number LJIIJ;
    @SerializedName("ac")
    public String LJIIJJI;
    @SerializedName("version_code")
    public String LJIIL;
    @SerializedName("versionCode")
    public String LJIILIIL;
    @SerializedName("idfa")
    public String LJIILJJIL;
    @SerializedName("updateVersionCode")
    public String LJIILL;
    @SerializedName("webcast_sdk_version")
    public String LJIILLIIL;
    @SerializedName("start_time")
    public Number LJIIZILJ;

    static {
        Covode.recordClassIndex(22059);
    }

    /* loaded from: classes5.dex */
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
            Covode.recordClassIndex(22060);
        }

        Code(int i) {
            this.value = i;
        }
    }
}
