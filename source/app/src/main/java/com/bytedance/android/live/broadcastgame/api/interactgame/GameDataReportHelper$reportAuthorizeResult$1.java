package com.bytedance.android.live.broadcastgame.api.interactgame;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes26.dex */
public final class GameDataReportHelper$reportAuthorizeResult$1 extends Lambda implements Function1<String, String> {
    public static final GameDataReportHelper$reportAuthorizeResult$1 INSTANCE = new GameDataReportHelper$reportAuthorizeResult$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19094);
    }

    public GameDataReportHelper$reportAuthorizeResult$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: LIZ */
    public final String invoke(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C106862S5w.LIZ(str);
        int hashCode = str.hashCode();
        if (hashCode != -1738800519) {
            if (hashCode != -266960777) {
                if (hashCode == 3548 && str.equals("ok")) {
                    return "success";
                }
                return str;
            } else if (str.equals("userDeny")) {
                return "user_decline";
            } else {
                return str;
            }
        } else if (str.equals("sysDeny")) {
            return "system_decline";
        } else {
            return str;
        }
    }
}
