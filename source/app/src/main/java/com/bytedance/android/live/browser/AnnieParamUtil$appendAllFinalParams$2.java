package com.bytedance.android.live.browser;

import android.app.Application;
import com.bytedance.android.annie.param.C2613i;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.common.applog.AppLog;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C74672FcQ;
import p003X.C99783PRp;
import p003X.FXA;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class AnnieParamUtil$appendAllFinalParams$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2613i $param;

    static {
        Covode.recordClassIndex(21866);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnieParamUtil$appendAllFinalParams$2(C2613i c2613i) {
        super(0);
        this.$param = c2613i;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            Application application = C99783PRp.LJIIJ.LIZ().LIZIZ;
            C2613i c2613i = this.$param;
            String serverDeviceId = AppLog.getServerDeviceId();
            Intrinsics.checkNotNullExpressionValue(serverDeviceId, "");
            if (!PatchProxy.proxy(new Object[]{serverDeviceId}, c2613i, C2613i.LIZ, false, 21).isSupported) {
                C106862S5w.LIZ(serverDeviceId);
                c2613i.LJJ = serverDeviceId;
            }
            this.$param.LJJIIZI = LK5.LJFF(LK5.m23418LJ());
            if (application != null) {
                this.$param.LJJIJIL = C74672FcQ.LIZ(application) ? 1 : 0;
                this.$param.LJJIJIIJI = FXA.LIZ(application) ? 1 : 0;
            }
            C2613i c2613i2 = this.$param;
            Locale locale = Locale.CHINA;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String language = locale.getLanguage();
            Intrinsics.checkNotNullExpressionValue(language, "");
            if (!PatchProxy.proxy(new Object[]{language}, c2613i2, C2613i.LIZ, false, 28).isSupported) {
                C106862S5w.LIZ(language);
                c2613i2.LJJJJ = language;
            }
            C2613i c2613i3 = this.$param;
            SettingKey<Integer> settingKey = LiveSettingKeys.LIVE_MODEL_RATE_AUDIENCE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Integer value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            c2613i3.LJJIJIIJIL = value.intValue();
            this.$param.LJJJJIZL = LK5.LJIIIIZZ();
            try {
                C2613i c2613i4 = this.$param;
                SettingKey<Float> settingKey2 = LiveConfigSettingKeys.LIVE_AUDIENCE_DEVICE_OVERALL_SCORE;
                Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                String format = String.format("%.2f", Arrays.copyOf(new Object[]{settingKey2.getValue()}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "");
                if (!PatchProxy.proxy(new Object[]{format}, c2613i4, C2613i.LIZ, false, 50).isSupported) {
                    C106862S5w.LIZ(format);
                    c2613i4.LJJLIL = format;
                }
                Result.m30308constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.m30308constructorimpl(ResultKt.createFailure(th));
            }
        }
        return Unit.INSTANCE;
    }
}
