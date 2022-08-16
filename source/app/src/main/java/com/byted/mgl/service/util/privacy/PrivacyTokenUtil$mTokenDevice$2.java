package com.byted.mgl.service.util.privacy;

import com.byted.mgl.service.api.host.IMglHostAppService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.minigame.bdpbase.manager.BdpManager;
import com.bytedance.minigame.bdpbase.service.IBdpService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes26.dex */
public final class PrivacyTokenUtil$mTokenDevice$2 extends Lambda implements Function0<String> {
    public static final PrivacyTokenUtil$mTokenDevice$2 INSTANCE = new PrivacyTokenUtil$mTokenDevice$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(9828);
    }

    public PrivacyTokenUtil$mTokenDevice$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: collision with other method in class */
    public final String mo30099invoke() {
        String optString;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        IBdpService service = BdpManager.getInst().getService(IMglHostAppService.class);
        Intrinsics.checkExpressionValueIsNotNull(service, "");
        JSONObject specialConfig = ((IMglHostAppService) service).getSpecialConfig();
        if (specialConfig == null || (optString = specialConfig.optString("host.privacy.token.device")) == null) {
            return "";
        }
        return optString;
    }
}
