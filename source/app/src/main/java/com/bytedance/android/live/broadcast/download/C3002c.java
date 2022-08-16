package com.bytedance.android.live.broadcast.download;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.C2844m;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.C6831an;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.L6L;

/* renamed from: com.bytedance.android.live.broadcast.download.c */
/* loaded from: classes5.dex */
public final class C3002c {
    public static ChangeQuickRedirect LIZ;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public List<String> LJIIJJI;
    public int LJIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public long LJJ;
    public double LJJIII;
    public int LJJIIJ;
    public long LJJIIZ;
    public boolean LJJIJIL;
    public int LJJIJL;
    public long LJJIJLIJ;
    public long LJJIL;
    public String LJJIZ;
    public long LJJJ;
    public long LJJJI;
    public long LJJJIL;
    public int LJJJJ;
    public long LJJJJI;
    public String LJJJJIZL;
    public C2844m LJJJJJ;
    public String LIZIZ = "";
    public String LIZJ = "";
    public String LIZLLL = "";

    /* renamed from: LJ */
    public String f25819LJ = "";
    public String LJFF = "";
    public String LJI = "";
    public String LJII = "";
    public String LJIIJ = "";
    public String LJIILIIL = "";
    public String LJIILLIIL = "";
    public Integer LJIIZILJ = 0;
    public String LJIJ = "";
    public String LJIJI = "";
    public String LJIJJ = "";
    public String LJIJJLI = "";
    public String LJIL = "";
    public String LJJI = "";
    public String LJJIFFI = "";
    public String LJJII = "";
    public String LJJIIJZLJL = "";
    public String LJJIIZI = "";
    public String LJJIJ = "";
    public String LJJIJIIJI = "";
    public String LJJIJIIJIL = "";

    static {
        Covode.recordClassIndex(15572);
    }

    public C3002c() {
        boolean z = false;
        SettingKey<C6831an> settingKey = LiveSettingKeys.LIVE_GAME_PROMOTE_NO_WIFI_DOWNLOAD_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        this.LJJIJIL = settingKey.getValue().LIZ == 1 ? true : z;
        this.LJJIZ = "0Kb/s";
        this.LJJJJ = -1;
        this.LJJJJIZL = "";
    }

    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (TextUtils.isEmpty(this.LJJIJ)) {
            return false;
        }
        try {
            if (new JSONObject(this.LJJIJ).optInt("gamecp_is_ad", 0) != 1) {
                return false;
            }
            return true;
        } catch (Exception e) {
            L6L.LIZIZ.LIZLLL("DownloadInfo", String.valueOf(e.getMessage()));
            return false;
        }
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJJI = str;
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJJIFFI = str;
    }

    public final void LIZJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJJII = str;
    }
}
