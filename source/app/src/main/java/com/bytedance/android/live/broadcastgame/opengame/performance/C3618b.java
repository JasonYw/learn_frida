package com.bytedance.android.live.broadcastgame.opengame.performance;

import com.bytedance.android.live.broadcastgame.opengame.network.C3599x;
import com.bytedance.android.live.broadcastgame.opengame.network.OpenGameApi;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.livesdk.utils.AbstractC9293ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.C16H;
import p003X.C2KD;
import p003X.C77053GZj;
import p003X.C87387Kc1;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.performance.b */
/* loaded from: classes5.dex */
public final class C3618b implements AbstractC9293ao {
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ = "";
    public String LIZJ = "";
    public String LIZLLL = "";

    /* renamed from: LJ */
    public volatile JSONArray f26080LJ = new JSONArray();
    public final long LJFF;
    public final /* synthetic */ AbstractC9293ao LJI;

    static {
        Covode.recordClassIndex(20818);
    }

    @Override // com.bytedance.android.livesdk.utils.AbstractC9293ao
    public final void LIZ(Disposable disposable) {
        if (PatchProxy.proxy(new Object[]{disposable}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(disposable);
        this.LJI.LIZ(disposable);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        if (this.LIZIZ.length() != 0 && this.LIZJ.length() != 0) {
            Disposable subscribe = ((OpenGameApi) C3599x.LIZJ.LIZ().LIZ(OpenGameApi.class)).submitPerfTestTask(this.LIZIZ, this.LJFF, this.LIZJ).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(C77053GZj.LIZ, C2KD.LIZIZ);
            Intrinsics.checkNotNullExpressionValue(subscribe, "");
            LIZ(subscribe);
            return;
        }
        ALogger.m15801d("OpenPlatformPerfReporter", C0002O.m25083C("appId: ", this.LIZIZ, " or taskId: ", this.LIZJ, " is empty!!"));
    }

    public final void LIZ(JSONObject jSONObject) {
        MethodCollector.m14708i(1468);
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 2).isSupported) {
            MethodCollector.m14707o(1468);
            return;
        }
        C106862S5w.LIZ(jSONObject);
        if (this.LIZIZ.length() != 0 && this.LIZJ.length() != 0) {
            synchronized (this) {
                try {
                    this.f26080LJ.put(0, jSONObject);
                } catch (Throwable th) {
                    MethodCollector.m14707o(1468);
                    throw th;
                }
            }
            String str = this.LIZIZ;
            long j = this.LJFF;
            String str2 = this.LIZJ;
            String jSONArray = this.f26080LJ.toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray, "");
            Disposable subscribe = ((OpenGameApi) C3599x.LIZJ.LIZ().LIZ(OpenGameApi.class)).uploadPerfTestData(str, j, str2, jSONArray).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C87387Kc1(this), C16H.LIZIZ);
            Intrinsics.checkNotNullExpressionValue(subscribe, "");
            LIZ(subscribe);
            MethodCollector.m14707o(1468);
            return;
        }
        ALogger.m15801d("OpenPlatformPerfReporter", C0002O.m25083C("appId: ", this.LIZIZ, " or taskId: ", this.LIZJ, " is empty!!"));
        MethodCollector.m14707o(1468);
    }

    public C3618b(AbstractC9293ao abstractC9293ao, long j) {
        C106862S5w.LIZ(abstractC9293ao);
        this.LJI = abstractC9293ao;
        this.LJFF = j;
    }
}
