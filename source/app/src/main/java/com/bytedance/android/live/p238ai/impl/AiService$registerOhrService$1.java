package com.bytedance.android.live.p238ai.impl;

import android.content.SharedPreferences;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.p238ai.impl.p240b.AbstractC2791e;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.config.p558a.C6814e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.heytap.mcssdk.constant.C15151a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.C100019PaH;
import p003X.C100020PaI;
import p003X.C91478M2e;

/* renamed from: com.bytedance.android.live.ai.impl.AiService$registerOhrService$1 */
/* loaded from: classes8.dex */
public final class AiService$registerOhrService$1 extends Lambda implements Function0<Unit> {
    public static final AiService$registerOhrService$1 INSTANCE = new AiService$registerOhrService$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(13839);
    }

    public AiService$registerOhrService$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        String str;
        long parseLong;
        SettingKey<C6814e> settingKey;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor clear;
        SharedPreferences.Editor edit2;
        SharedPreferences.Editor clear2;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C100020PaI c100020PaI = C100020PaI.f10689LJ;
            if (!PatchProxy.proxy(new Object[0], c100020PaI, C100020PaI.LIZ, false, 7).isSupported) {
                if (!PatchProxy.proxy(new Object[0], c100020PaI, C100020PaI.LIZ, false, 3).isSupported) {
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[0], c100020PaI, C100020PaI.LIZ, false, 4);
                    if (proxy.isSupported) {
                        parseLong = ((Long) proxy.result).longValue();
                    } else {
                        SharedPreferences sharedPreferences = C100020PaI.LIZLLL;
                        if (sharedPreferences != null) {
                            str = sharedPreferences.getString("TIMELIST", "");
                        } else {
                            str = null;
                        }
                        if (str != null && !StringsKt__StringsJVMKt.isBlank(str)) {
                            int length = str.length();
                            int i = 0;
                            while (true) {
                                if (i < length) {
                                    if (str.charAt(i) == '$') {
                                        break;
                                    }
                                    i++;
                                } else {
                                    i = -1;
                                    break;
                                }
                            }
                            if (str != null) {
                                String substring = str.substring(0, i);
                                Intrinsics.checkNotNullExpressionValue(substring, "");
                                parseLong = Long.parseLong(substring);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                        }
                    }
                    if (parseLong != 0) {
                        Intrinsics.checkNotNullExpressionValue(LiveSettingKeys.LIVE_AI_OHR, "");
                        if (settingKey.getValue().LIZLLL * C15151a.f30809f < System.currentTimeMillis() - parseLong && !PatchProxy.proxy(new Object[0], c100020PaI, C100020PaI.LIZ, false, 6).isSupported) {
                            SharedPreferences sharedPreferences2 = C100020PaI.LIZJ;
                            if (sharedPreferences2 != null && (edit2 = sharedPreferences2.edit()) != null && (clear2 = edit2.clear()) != null) {
                                clear2.apply();
                            }
                            SharedPreferences sharedPreferences3 = C100020PaI.LIZLLL;
                            if (sharedPreferences3 != null && (edit = sharedPreferences3.edit()) != null && (clear = edit.clear()) != null) {
                                clear.apply();
                            }
                        }
                    }
                }
                c100020PaI.LJII();
                if (!PatchProxy.proxy(new Object[]{c100020PaI, 0, 0L, 3, null}, null, C100020PaI.LIZ, true, 9).isSupported) {
                    c100020PaI.LIZ(5, 2000L);
                }
            }
            C91478M2e.LIZJ.LIZ((AbstractC2791e) new C100019PaH());
        }
        return Unit.INSTANCE;
    }
}
