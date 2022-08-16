package com.bytedance.android.live.broadcastgame.channel.sender;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes23.dex */
public final class Anchor2AudienceBeatSender$jsonObject$2 extends Lambda implements Function0<JSONObject> {
    public static final Anchor2AudienceBeatSender$jsonObject$2 INSTANCE = new Anchor2AudienceBeatSender$jsonObject$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19558);
    }

    public Anchor2AudienceBeatSender$jsonObject$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [org.json.JSONObject, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ JSONObject mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new JSONObject();
    }
}
