package com.bytedance.android.live.broadcast.bgbroadcast.game.mirror.params;

import com.bytedance.android.livesdk.config.C6927di;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.TFG;

/* loaded from: classes5.dex */
public final class BitrateGenerator$defaultConfig$2 extends Lambda implements Function0<ArrayList<C6927di>> {
    public static final BitrateGenerator$defaultConfig$2 INSTANCE = new BitrateGenerator$defaultConfig$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14798);
    }

    public BitrateGenerator$defaultConfig$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList<com.bytedance.android.livesdk.config.di>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ArrayList<C6927di> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ArrayList<C6927di> arrayList = new ArrayList<>();
        arrayList.add(new C6927di(3840, 2160, 60, 24000, 18000, 4000, 2.0f));
        arrayList.add(new C6927di(3840, 2160, 30, 16000, 12000, PushConstants.WORK_RECEIVER_EVENT_CORE_ERROR, 2.0f));
        arrayList.add(new C6927di(2560, 1440, 60, 16000, 12000, PushConstants.WORK_RECEIVER_EVENT_CORE_ERROR, 2.0f));
        arrayList.add(new C6927di(2560, 1440, 30, 12000, 8000, 2400, 2.0f));
        arrayList.add(new C6927di(1920, 1080, 60, 12000, 8000, 2400, 2.0f));
        arrayList.add(new C6927di(1920, 1080, 30, 8000, 6000, Constants.ASSEMBLE_PUSH_RETRY_INTERVAL, 2.0f));
        arrayList.add(new C6927di(1280, 720, 60, 8000, 6000, Constants.ASSEMBLE_PUSH_RETRY_INTERVAL, 2.0f));
        arrayList.add(new C6927di(1280, 720, 30, 6000, 4000, 1600, 2.0f));
        arrayList.add(new C6927di(1200, 688, 60, 7000, TFG.LIZIZ, 1600, 2.0f));
        arrayList.add(new C6927di(1200, 688, 30, TFG.LIZIZ, PushConstants.WORK_RECEIVER_EVENT_CORE_ERROR, 1200, 2.0f));
        arrayList.add(new C6927di(960, 540, 60, TFG.LIZIZ, PushConstants.WORK_RECEIVER_EVENT_CORE_ERROR, 1600, 2.0f));
        arrayList.add(new C6927di(960, 540, 30, 3300, Constants.ASSEMBLE_PUSH_RETRY_INTERVAL, 800, 2.0f));
        return arrayList;
    }
}
