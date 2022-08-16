package com.bytedance.android.annie.param;

import com.bytedance.covode.number.Covode;
import com.bytedance.forest.chain.fetchers.BuiltinFetcher;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.umeng.analytics.pro.C33764r;
import com.umeng.message.common.C34000b;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C64859BiX;

/* renamed from: com.bytedance.android.annie.param.i */
/* loaded from: classes8.dex */
public final class C2613i {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("channel")
    public String LIZIZ;
    @SerializedName(C64859BiX.LIZIZ)
    public String LIZJ;
    @SerializedName("app_name")
    public String LIZLLL;
    @SerializedName("appTheme")

    /* renamed from: LJ */
    public String f25621LJ;
    @SerializedName("version_code")
    public String LJFF;
    @SerializedName("update_version_code")
    public String LJI;
    @SerializedName("webcast_sdk_version")
    public String LJII;
    @SerializedName("isTeenMode")
    public int LJIIIIZZ;
    @SerializedName("location")
    public String LJIIIZ;
    @SerializedName("containerID")
    public String LJIIJ;
    @SerializedName("initTimestamp")
    public String LJIIJJI;
    @SerializedName(BuiltinFetcher.BUILTIN_DIR)
    public int LJIIL;
    @SerializedName("lynx_version")
    public String LJIILIIL;
    @SerializedName("user_id")
    public String LJIILJJIL;
    @SerializedName("sec_user_id")
    public String LJIILL;
    @SerializedName("anchor_id")
    public String LJIILLIIL;
    @SerializedName("sec_anchor_id")
    public String LJIIZILJ;
    @SerializedName("room_id")
    public String LJIJ;
    @SerializedName("settings")
    public JsonObject LJIJI;
    @SerializedName("queryItems")
    public JsonObject LJIJJ;
    @SerializedName("inject_json")
    public Map<String, ? extends Object> LJIJJLI;
    @SerializedName("openudid")
    public String LJIL;
    @SerializedName("device_id")
    public String LJJ;
    @SerializedName("device_platform")
    public final String LJJI;
    @SerializedName("orientation")
    public int LJJIFFI;
    @SerializedName("screenWidth")
    public float LJJII;
    @SerializedName("screenHeight")
    public float LJJIII;
    @SerializedName("realScreenHeight")
    public float LJJIIJ;
    @SerializedName("screenWidthPx")
    public int LJJIIJZLJL;
    @SerializedName("screenHeightPx")
    public int LJJIIZ;
    @SerializedName("status_bar_height")
    public float LJJIIZI;
    @SerializedName("bottom_bar_height")
    public int LJJIJ;
    @SerializedName("is_notch")
    public int LJJIJIIJI;
    @SerializedName("perf")
    public int LJJIJIIJIL;
    @SerializedName("is_pad")
    public int LJJIJIL;
    @SerializedName("os")
    public final String LJJIJL;
    @SerializedName("os_version")
    public String LJJIJLIJ;
    @SerializedName("ac")
    public String LJJIL;
    @SerializedName("current_network_quality_info")
    public String LJJIZ;
    @SerializedName("webcast_locale")
    public String LJJJ;
    @SerializedName("webcast_gps_access")
    public String LJJJI;
    @SerializedName("language")
    public String LJJJIL;
    @SerializedName("webcast_language")
    public String LJJJJ;
    @SerializedName("device_type")
    public String LJJJJI;
    @SerializedName("systemFontScale")
    public float LJJJJIZL;
    @SerializedName("device_brand")
    public String LJJJJJ;
    @SerializedName("iid")
    public String LJJJJJL;
    @SerializedName("minor_status")
    public String LJJJJL;
    @SerializedName("os_api")
    public String LJJJJLI;
    @SerializedName("fake_region")
    public String LJJJJLL;
    @SerializedName("host_abi")
    public String LJJJJZ;
    @SerializedName("cpu_support64")
    public String LJJJJZI;
    @SerializedName("resolution")
    public String LJJJLIIL;
    @SerializedName("ts")
    public String LJJJLL;
    @SerializedName("manifest_version_code")
    public String LJJJLZIJ;
    @SerializedName("oaid")
    public String LJJJZ;
    @SerializedName("cdid")
    public String LJJL;
    @SerializedName("app_type")
    public String LJJLI;
    @SerializedName("dpi")
    public String LJJLIIIIJ;
    @SerializedName("effect_channel")
    public String LJJLIIIJ;
    @SerializedName("version_name")
    public String LJJLIIIJILLIZJL;
    @SerializedName("address_book_access")
    public String LJJLIIIJJI;
    @SerializedName("_rticket")
    public String LJJLIIIJJIZ;
    @SerializedName("is_android_pad")
    public String LJJLIIIJL;
    @SerializedName("webcast_version")
    public int LJJLIIIJLJLI;
    @SerializedName("pad_opt_type")
    public int LJJLIIIJLLLLLLLZ;
    @SerializedName("container_name")
    public String LJJLIIJ;
    @SerializedName("device_score")
    public String LJJLIL;
    public transient Map<String, ? extends Object> LJJLJ;
    public transient Map<String, ? extends Object> LJJLJLI;
    public transient boolean LJJLL;

    static {
        Covode.recordClassIndex(10904);
    }

    public C2613i() {
        this(null, null, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null, false, -1, -1, 127, null);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 53);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.f25621LJ, this.LJFF, this.LJI, this.LJII, Integer.valueOf(this.LJIIIIZZ), this.LJIIIZ, this.LJIIJ, this.LJIIJJI, Integer.valueOf(this.LJIIL), this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, this.LJIJJ, this.LJIJJLI, this.LJIL, this.LJJ, this.LJJI, Integer.valueOf(this.LJJIFFI), Float.valueOf(this.LJJII), Float.valueOf(this.LJJIII), Float.valueOf(this.LJJIIJ), Integer.valueOf(this.LJJIIJZLJL), Integer.valueOf(this.LJJIIZ), Float.valueOf(this.LJJIIZI), Integer.valueOf(this.LJJIJ), Integer.valueOf(this.LJJIJIIJI), Integer.valueOf(this.LJJIJIIJIL), Integer.valueOf(this.LJJIJIL), this.LJJIJL, this.LJJIJLIJ, this.LJJIL, this.LJJIZ, this.LJJJ, this.LJJJI, this.LJJJIL, this.LJJJJ, this.LJJJJI, Float.valueOf(this.LJJJJIZL), this.LJJJJJ, this.LJJJJJL, this.LJJJJL, this.LJJJJLI, this.LJJJJLL, this.LJJJJZ, this.LJJJJZI, this.LJJJLIIL, this.LJJJLL, this.LJJJLZIJ, this.LJJJZ, this.LJJL, this.LJJLI, this.LJJLIIIIJ, this.LJJLIIIJ, this.LJJLIIIJILLIZJL, this.LJJLIIIJJI, this.LJJLIIIJJIZ, this.LJJLIIIJL, Integer.valueOf(this.LJJLIIIJLJLI), Integer.valueOf(this.LJJLIIIJLLLLLLLZ), this.LJJLIIJ, this.LJJLIL, this.LJJLJ, this.LJJLJLI, Boolean.valueOf(this.LJJLL)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 54);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2613i) {
            return C106862S5w.LIZ(((C2613i) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 55);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 56);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("GlobalPropsParams:%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", LIZ());
    }

    public C2613i(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, String str9, String str10, int i2, String str11, String str12, String str13, String str14, String str15, String str16, JsonObject jsonObject, JsonObject jsonObject2, Map<String, ? extends Object> map, String str17, String str18, String str19, int i3, float f, float f2, float f3, int i4, int i5, float f4, int i6, int i7, int i8, int i9, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, float f5, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, int i10, int i11, String str48, String str49, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(jsonObject2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(str43, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str48, "");
        Intrinsics.checkNotNullParameter(str49, "");
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.f25621LJ = str4;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = str7;
        this.LJIIIIZZ = i;
        this.LJIIIZ = str8;
        this.LJIIJ = str9;
        this.LJIIJJI = str10;
        this.LJIIL = i2;
        this.LJIILIIL = str11;
        this.LJIILJJIL = str12;
        this.LJIILL = str13;
        this.LJIILLIIL = str14;
        this.LJIIZILJ = str15;
        this.LJIJ = str16;
        this.LJIJI = jsonObject;
        this.LJIJJ = jsonObject2;
        this.LJIJJLI = map;
        this.LJIL = str17;
        this.LJJ = str18;
        this.LJJI = str19;
        this.LJJIFFI = i3;
        this.LJJII = f;
        this.LJJIII = f2;
        this.LJJIIJ = f3;
        this.LJJIIJZLJL = i4;
        this.LJJIIZ = i5;
        this.LJJIIZI = f4;
        this.LJJIJ = i6;
        this.LJJIJIIJI = i7;
        this.LJJIJIIJIL = i8;
        this.LJJIJIL = i9;
        this.LJJIJL = str20;
        this.LJJIJLIJ = str21;
        this.LJJIL = str22;
        this.LJJIZ = str23;
        this.LJJJ = str24;
        this.LJJJI = str25;
        this.LJJJIL = str26;
        this.LJJJJ = str27;
        this.LJJJJI = str28;
        this.LJJJJIZL = f5;
        this.LJJJJJ = str29;
        this.LJJJJJL = str30;
        this.LJJJJL = str31;
        this.LJJJJLI = str32;
        this.LJJJJLL = str33;
        this.LJJJJZ = str34;
        this.LJJJJZI = str35;
        this.LJJJLIIL = str36;
        this.LJJJLL = str37;
        this.LJJJLZIJ = str38;
        this.LJJJZ = str39;
        this.LJJL = str40;
        this.LJJLI = str41;
        this.LJJLIIIIJ = str42;
        this.LJJLIIIJ = str43;
        this.LJJLIIIJILLIZJL = str44;
        this.LJJLIIIJJI = str45;
        this.LJJLIIIJJIZ = str46;
        this.LJJLIIIJL = str47;
        this.LJJLIIIJLJLI = i10;
        this.LJJLIIIJLLLLLLLZ = i11;
        this.LJJLIIJ = str48;
        this.LJJLIL = str49;
        this.LJJLJ = map2;
        this.LJJLJLI = map3;
        this.LJJLL = z;
    }

    public /* synthetic */ C2613i(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, String str9, String str10, int i2, String str11, String str12, String str13, String str14, String str15, String str16, JsonObject jsonObject, JsonObject jsonObject2, Map map, String str17, String str18, String str19, int i3, float f, float f2, float f3, int i4, int i5, float f4, int i6, int i7, int i8, int i9, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, float f5, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, int i10, int i11, String str48, String str49, Map map2, Map map3, boolean z, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this("", "", "", "", "", "", "", -1, "", C33764r.f42396f, "", 0, "", "0", "0", "0", "0", "0", new JsonObject(), new JsonObject(), new HashMap(), "0", "0", "android", 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, C34000b.f43053g, "", "", "{}", "", "", "", "", "", 1.0f, "", "", "0", "", "", "", "", "", "", "", "", "", "", "0", "", "", "", "", "", 0, 0, "annie", "0", null, null, false);
    }

    public final void LIZ(JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{jsonObject}, this, LIZ, false, 18).isSupported) {
            return;
        }
        C106862S5w.LIZ(jsonObject);
        this.LJIJJ = jsonObject;
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJIIJ = str;
    }

    public final void LIZJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJIIJJI = str;
    }

    public final void LIZLLL(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJIILIIL = str;
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJIIIZ = str;
    }
}
