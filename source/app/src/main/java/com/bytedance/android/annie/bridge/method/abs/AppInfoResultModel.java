package com.bytedance.android.annie.bridge.method.abs;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.AbstractC88716KxS;
import p003X.C64859BiX;

/* loaded from: classes5.dex */
public final class AppInfoResultModel implements AbstractC88716KxS {
    @SerializedName("container_version")
    public String LIZ;
    @SerializedName(C2521l.LJIIJ)
    public Code LIZIZ;
    @SerializedName(C64859BiX.LIZIZ)
    public String LIZJ;
    @SerializedName("appName")
    public String LIZLLL;
    @SerializedName("appVersion")

    /* renamed from: LJ */
    public String f25615LJ;
    @SerializedName("device_id")
    public String LJFF;
    @SerializedName("netType")
    public String LJI;
    @SerializedName("user_id")
    public String LJII;
    @SerializedName("sec_user_id")
    public String LJIIIIZZ;
    @SerializedName("orientation")
    public String LJIIIZ;
    @SerializedName("screenHeight")
    public Number LJIIJ;
    @SerializedName("screenWidth")
    public Number LJIIJJI;
    @SerializedName("ac")
    public String LJIIL;
    @SerializedName("version_code")
    public String LJIILIIL;
    @SerializedName("versionCode")
    public String LJIILJJIL;
    @SerializedName("idfa")
    public String LJIILL;
    @SerializedName("updateVersionCode")
    public String LJIILLIIL;
    @SerializedName("webcast_sdk_version")
    public String LJIIZILJ;
    @SerializedName("start_time")
    public Number LJIJ;

    static {
        Covode.recordClassIndex(10539);
    }

    /* loaded from: classes5.dex */
    public enum Code implements AbstractC2591o {
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

        @Override // com.bytedance.android.annie.bridge.method.abs.AbstractC2591o
        public final int LIZ() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(10540);
        }

        Code(int i) {
            this.value = i;
        }
    }
}
