package com.bytedance.android.live.broadcast.download;

import android.content.Context;
import com.bytedance.android.live.broadcast.api.gamepromote.C2888a;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.C6831an;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.disposables.CompositeDisposable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C440033av;
import p003X.C89250LEm;
import p003X.IQV;
import p003X.LE7;
import p003X.LEN;
import p003X.LFU;

/* renamed from: com.bytedance.android.live.broadcast.download.b */
/* loaded from: classes5.dex */
public final class C3001b {
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public LFU f25818LJ;
    public CompositeDisposable LJFF;
    public Map<String, String> LJI;
    public final C2888a LJII;
    public static final C89250LEm LJIIIZ = new C89250LEm((byte) 0);
    public static final Map<String, C3001b> LJIIIIZZ = new LinkedHashMap();

    static {
        Covode.recordClassIndex(15563);
    }

    public C3001b() {
        this.LIZIZ = "0";
        this.LIZJ = "0";
        this.LJFF = new CompositeDisposable();
        C13491f LIZ2 = IQV.LIZ(C2888a.class);
        this.LJII = (C2888a) (!(LIZ2 instanceof C2888a) ? null : LIZ2);
    }

    public /* synthetic */ C3001b(byte b) {
        this();
    }

    private void LIZ(C3002c c3002c, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{c3002c, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(c3002c);
        C440033av c440033av = C440033av.LIZIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("game_name", c3002c.LJJI);
        jSONObject.put("game_id", c3002c.LJIIJ);
        jSONObject.put(PushConstants.WEB_URL, c3002c.LJJII);
        jSONObject.put("task_group", c3002c.LJJIJIIJI);
        jSONObject.put("is_manual", this.LIZIZ);
        jSONObject.put("is_progress", this.LIZJ);
        jSONObject.put("page", c3002c.LIZIZ);
        if (i2 != -2) {
            jSONObject.put("error_code", i2);
        }
        if (i == 1001) {
            jSONObject.put("cur_status", c3002c.LJJIJL);
        }
        C440033av.LIZ(c440033av, i, jSONObject, null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(com.bytedance.android.live.broadcast.download.C3002c r41, java.lang.String r42, java.lang.Long r43) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.download.C3001b.LIZ(com.bytedance.android.live.broadcast.download.c, java.lang.String, java.lang.Long):void");
    }

    public final void LIZ(Context context, boolean z, C3002c c3002c, Function0<Unit> function0) {
        if (PatchProxy.proxy(new Object[]{context, Byte.valueOf(z ? (byte) 1 : (byte) 0), c3002c, function0}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C440033av c440033av = C440033av.LIZIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("game_name", c3002c.LJJI);
        jSONObject.put("game_id", c3002c.LJIIJ);
        jSONObject.put(PushConstants.WEB_URL, c3002c.LJJII);
        jSONObject.put("task_group", c3002c.LJJIJIIJI);
        C440033av.LIZ(c440033av, 1020, jSONObject, null, 4, null);
        LE7 le7 = new LE7(context, new LEN(c3002c, function0));
        if (z) {
            SettingKey<C6831an> settingKey = LiveSettingKeys.LIVE_GAME_PROMOTE_NO_WIFI_DOWNLOAD_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            String format = String.format(settingKey.getValue().LIZLLL, Arrays.copyOf(new Object[]{Double.valueOf(c3002c.LJJIII)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "");
            SettingKey<C6831an> settingKey2 = LiveSettingKeys.LIVE_GAME_PROMOTE_NO_WIFI_DOWNLOAD_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            String str = settingKey2.getValue().f27203LJ;
            SettingKey<C6831an> settingKey3 = LiveSettingKeys.LIVE_GAME_PROMOTE_NO_WIFI_DOWNLOAD_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey3, "");
            String str2 = settingKey3.getValue().LJFF;
            le7.LIZ(format);
            le7.LIZIZ(str);
            le7.LIZJ(str2);
            C116971W2r.LIZJ(le7);
            return;
        }
        C116971W2r.LIZJ(le7);
    }

    public static /* synthetic */ void LIZ(C3001b c3001b, C3002c c3002c, int i, int i2, int i3, Object obj) {
        if (PatchProxy.proxy(new Object[]{c3001b, c3002c, 1001, 0, 4, null}, null, LIZ, true, 8).isSupported) {
            return;
        }
        c3001b.LIZ(c3002c, 1001, -2);
    }
}
