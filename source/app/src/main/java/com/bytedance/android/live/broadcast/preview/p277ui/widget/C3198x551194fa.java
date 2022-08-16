package com.bytedance.android.live.broadcast.preview.p277ui.widget;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C88440Kt0;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.widget.StartLiveVisibilityServiceWidget$updateStartLiveVisibilityToRemote$1 */
/* loaded from: classes3.dex */
public final class C3198x551194fa extends Lambda implements Function1<C5176i<Object>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ int $visibilityRange;
    public final /* synthetic */ StartLiveVisibilityServiceWidget this$0;

    static {
        Covode.recordClassIndex(17448);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3198x551194fa(StartLiveVisibilityServiceWidget startLiveVisibilityServiceWidget, int i) {
        super(1);
        this.this$0 = startLiveVisibilityServiceWidget;
        this.$visibilityRange = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C5176i<Object> c5176i) {
        C5176i<Object> c5176i2;
        int i;
        String str;
        if (!PatchProxy.proxy(new Object[]{c5176i}, this, changeQuickRedirect, false, 1).isSupported) {
            StartLiveVisibilityServiceWidget startLiveVisibilityServiceWidget = this.this$0;
            int i2 = this.$visibilityRange;
            if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i2)}, startLiveVisibilityServiceWidget, StartLiveVisibilityServiceWidget.LIZ, false, 11).isSupported) {
                if (!startLiveVisibilityServiceWidget.LIZLLL) {
                    ALogger.m15795w(startLiveVisibilityServiceWidget.LIZ(), "has not show setting entrance,skip show toast");
                } else {
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        if (i2 == 5) {
                                            i = 2131587887;
                                        }
                                    } else {
                                        i = 2131587886;
                                    }
                                } else {
                                    i = 2131587885;
                                }
                            } else {
                                i = 2131587883;
                            }
                        } else {
                            SettingKey<Integer> settingKey = LiveSettingKeys.LIVE_ENABLE_START_LIVE_VISIBILITY_SCOPE;
                            Intrinsics.checkNotNullExpressionValue(settingKey, "");
                            Integer value = settingKey.getValue();
                            if (value != null && value.intValue() == 4) {
                                i = 2131587882;
                            } else {
                                i = 2131587881;
                            }
                        }
                    } else {
                        i = 2131587884;
                    }
                    String LIZ = LK5.LIZ(i);
                    Intrinsics.checkNotNullExpressionValue(LIZ, "");
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i2), LIZ}, startLiveVisibilityServiceWidget, StartLiveVisibilityServiceWidget.LIZ, false, 12);
                    if (proxy.isSupported) {
                        str = (String) proxy.result;
                    } else if (5 == i2 && startLiveVisibilityServiceWidget.LIZIZ().LJJJI().LIZ().longValue() <= 0) {
                        str = LIZ + "，当前会员人数为0";
                    } else {
                        str = LIZ;
                    }
                    C88440Kt0.LIZ(str);
                    ALogger.m15801d(startLiveVisibilityServiceWidget.LIZ(), "show toast:" + LIZ);
                }
            }
            ALogger.m15801d(this.this$0.LIZ(), "updateStartLiveVisibilityToRemote resp status:" + c5176i2.LIZIZ);
        }
        return Unit.INSTANCE;
    }
}
