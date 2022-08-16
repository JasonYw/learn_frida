package com.bytedance.android.live.effect.api;

import android.content.Context;
import android.os.Build;
import com.bef.effectsdk.BuildConfig;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.IHostContext;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.p1594ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.p1594ss.android.ugc.effectmanager.EffectConfiguration;
import com.p1594ss.android.ugc.effectmanager.EffectManager;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC86605KAt;
import p003X.C116971W2r;
import p003X.C85506Jmm;
import p003X.C88745Kxv;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class LiveEffectContext$effectManager$2 extends Lambda implements Function0<EffectManager> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C4173o this$0;

    static {
        Covode.recordClassIndex(24292);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveEffectContext$effectManager$2(C4173o c4173o) {
        super(0);
        this.this$0 = c4173o;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [com.ss.android.ugc.effectmanager.EffectManager, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [com.ss.android.ugc.effectmanager.EffectManager, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ EffectManager mo30099invoke() {
        String channel;
        AbstractC86605KAt abstractC86605KAt;
        DownloadableModelConfig LIZLLL;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C4173o c4173o = this.this$0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c4173o, C4173o.LIZ, false, 14);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        IService service = ServiceManager.getService(IHostContext.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        EffectManager effectManager = ((IHostContext) service).getEffectManager();
        if (effectManager == null) {
            if (!DownloadableModelSupport.isInitialized() && (abstractC86605KAt = c4173o.LIZIZ) != null && (LIZLLL = abstractC86605KAt.LIZLLL()) != null) {
                DownloadableModelSupport.initialize(LIZLLL);
            }
            Context LJIIJ = LK5.LJIIJ();
            Intrinsics.checkNotNullExpressionValue(LJIIJ, "");
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_EFFECT_ENABLE_ONLINE_RESOURCES;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                channel = C4173o.LJII;
            } else {
                IService service2 = ServiceManager.getService(IHostContext.class);
                Intrinsics.checkNotNullExpressionValue(service2, "");
                channel = ((IHostContext) service2).getChannel();
            }
            EffectConfiguration.Builder accessKey = new EffectConfiguration.Builder().accessKey(C4173o.LJIIIIZZ);
            IService service3 = ServiceManager.getService(IHostContext.class);
            Intrinsics.checkNotNullExpressionValue(service3, "");
            EffectConfiguration.Builder context = accessKey.appVersion(((IHostContext) service3).getVersionName()).sdkVersion(BuildConfig.VERSION_NAME).platform(C4173o.LJFF).channel(channel).deviceType(Build.MODEL).retryCount(C4173o.LJI).effectDir(new File(C116971W2r.LIZJ(LJIIJ), C4173o.f26212LJ)).JsonConverter(new C85506Jmm()).effectNetWorker(new C88745Kxv()).hosts(C4173o.LJIIIZ).context(LJIIJ);
            if (DownloadableModelSupport.isInitialized()) {
                DownloadableModelSupport downloadableModelSupport = DownloadableModelSupport.getInstance();
                Intrinsics.checkNotNullExpressionValue(downloadableModelSupport, "");
                context.effectFetcher(downloadableModelSupport.getEffectFetcher());
            }
            EffectManager effectManager2 = new EffectManager();
            effectManager2.init(context.build());
            return effectManager2;
        }
        return effectManager;
    }
}
