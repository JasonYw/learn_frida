package com.bytedance.android.live.core.monitor;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.LiveInfraSettingKeys;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p002O.C0002O;
import p003X.RunnableC91288Lxq;

/* loaded from: classes5.dex */
public final class SafetyGuard {
    public static ChangeQuickRedirect LIZ;
    public static final String LIZIZ = "SafetyGuard";
    public static final String LIZJ = "ttlive_safety_guard_log_type";
    public static final String LIZLLL = "ttlive_";

    /* renamed from: LJ */
    public static final C4079a f26170LJ;

    /* renamed from: com.bytedance.android.live.core.monitor.SafetyGuard$a */
    /* loaded from: classes5.dex */
    public static final class C4079a {
        @SerializedName("enable")
        public boolean LIZ;
        @SerializedName("log_type_allowlist")
        public ArrayList<String> LIZIZ = new ArrayList<>();
        @SerializedName("message_allowlist")
        public ArrayList<String> LIZJ = new ArrayList<>();

        static {
            Covode.recordClassIndex(23490);
        }
    }

    static {
        Covode.recordClassIndex(23488);
        SettingKey<C4079a> settingKey = LiveInfraSettingKeys.LIVE_SAFETY_GUARD_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        f26170LJ = settingKey.getValue();
    }

    /* loaded from: classes5.dex */
    public static final class SafetyGuardCustomException extends RuntimeException {
        static {
            Covode.recordClassIndex(23489);
        }

        public SafetyGuardCustomException(String str, Throwable th) {
            super(str, th);
        }
    }

    @JvmStatic
    public static final void LIZ(Throwable th, String str) {
        if (PatchProxy.proxy(new Object[]{th, str}, null, LIZ, true, 2).isSupported) {
            return;
        }
        LIZ(null, th, str);
    }

    @JvmStatic
    public static final void LIZIZ(Throwable th, String str) {
        if (!PatchProxy.proxy(new Object[]{th, str}, null, LIZ, true, 9).isSupported && !PatchProxy.proxy(new Object[]{null, th, str}, null, LIZ, true, 12).isSupported) {
            LIZ(null, th, str);
            if (!CollectionsKt___CollectionsKt.contains(f26170LJ.LIZIZ, null) && !CollectionsKt___CollectionsKt.contains(f26170LJ.LIZJ, str)) {
                throw new SafetyGuardCustomException(str, th);
            }
        }
    }

    @JvmStatic
    public static final void LIZ(String str, Throwable th, String str2) {
        String m25086C;
        if (PatchProxy.proxy(new Object[]{str, th, str2}, null, LIZ, true, 5).isSupported) {
            return;
        }
        if (str != null && str.length() != 0) {
            if (!StringsKt__StringsJVMKt.startsWith$default(str, LIZLLL, false, 2, null)) {
                new StringBuilder();
                str = C0002O.m25086C(LIZLLL, str);
            }
        } else {
            str = LIZJ;
        }
        if (str2 == null) {
            m25086C = "[SafetyGuard]";
        } else {
            m25086C = C0002O.m25086C("[SafetyGuard] ", str2);
        }
        ALogger.m15799e(LIZIZ, m25086C, th);
        if (f26170LJ.LIZ) {
            ThreadPlus.submitRunnable(new RunnableC91288Lxq(str, th, m25086C));
        }
    }
}
