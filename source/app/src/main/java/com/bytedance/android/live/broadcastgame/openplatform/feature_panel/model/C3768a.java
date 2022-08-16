package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.model;

import com.bef.effectsdk.EffectSDKUtils;
import com.bytedance.android.live.broadcastgame.api.model.C3372ac;
import com.bytedance.android.live.broadcastgame.api.model.C3382n;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.utility.SharedPrefHelper;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC100834PnQ;
import p003X.AbstractC88161KoV;
import p003X.C106862S5w;
import p003X.C87911KkT;
import p003X.C88222KpU;
import p003X.C88226KpY;
import p003X.C88243Kpp;
import p003X.C88306Kqq;
import p003X.KM9;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.model.a */
/* loaded from: classes5.dex */
public final class C3768a implements AbstractC88161KoV {
    public static ChangeQuickRedirect LIZ;
    public SharedPrefHelper LIZIZ;
    public LinkedList<String> LIZJ;
    public String LIZLLL = "opensearch:" + ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ();

    static {
        Covode.recordClassIndex(21361);
    }

    @Override // p003X.AbstractC88161KoV
    public final LinkedList<String> LIZIZ() {
        return this.LIZJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x009e, code lost:
        if (0 == 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            r4 = 1493(0x5d5, float:2.092E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m14708i(r4)
            r0 = 2
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r2 = 0
            r3[r2] = r12
            r0 = 1
            r3[r0] = r13
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcastgame.openplatform.feature_panel.model.C3768a.LIZ
            r0 = 8
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r11, r1, r2, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L1e
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r4)
            return
        L1e:
            r3 = 0
            X.KkT r1 = p003X.C87911KkT.LIZIZ
            java.lang.String r0 = "OpenFeaturePanelModel"
            r1.LIZ(r13, r0)
            java.io.File r1 = new java.io.File     // Catch: java.io.IOException -> L68 java.io.FileNotFoundException -> L79 java.lang.Throwable -> L9d
            r1.<init>(r13)     // Catch: java.io.IOException -> L68 java.io.FileNotFoundException -> L79 java.lang.Throwable -> L9d
            boolean r0 = r1.exists()     // Catch: java.io.IOException -> L68 java.io.FileNotFoundException -> L79 java.lang.Throwable -> L9d
            if (r0 != 0) goto L3b
            java.io.File r0 = r1.getParentFile()     // Catch: java.io.IOException -> L68 java.io.FileNotFoundException -> L79 java.lang.Throwable -> L9d
            r0.mkdirs()     // Catch: java.io.IOException -> L68 java.io.FileNotFoundException -> L79 java.lang.Throwable -> L9d
            r1.createNewFile()     // Catch: java.io.IOException -> L68 java.io.FileNotFoundException -> L79 java.lang.Throwable -> L9d
        L3b:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L68 java.io.FileNotFoundException -> L79 java.lang.Throwable -> L9d
            r2.<init>(r1)     // Catch: java.io.IOException -> L68 java.io.FileNotFoundException -> L79 java.lang.Throwable -> L9d
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L62 java.io.FileNotFoundException -> L65
            if (r12 == 0) goto L54
            byte[] r1 = r12.getBytes(r0)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L62 java.io.FileNotFoundException -> L65
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L62 java.io.FileNotFoundException -> L65
            r2.write(r1)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L62 java.io.FileNotFoundException -> L65
            r2.close()     // Catch: java.io.IOException -> L8a
            goto L99
        L54:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L62 java.io.FileNotFoundException -> L65
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L62 java.io.FileNotFoundException -> L65
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r4)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L62 java.io.FileNotFoundException -> L65
            throw r1     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L62 java.io.FileNotFoundException -> L65
        L5f:
            r0 = move-exception
            r3 = r2
            goto La0
        L62:
            r6 = move-exception
            r3 = r2
            goto L69
        L65:
            r6 = move-exception
            r3 = r2
            goto L7a
        L68:
            r6 = move-exception
        L69:
            X.KkT r5 = p003X.C87911KkT.LIZIZ     // Catch: java.lang.Throwable -> L9d
            java.lang.String r7 = "OpenFeaturePanelModel"
            r8 = 0
            r9 = 4
            r10 = 0
            p003X.C87911KkT.LIZ(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L9d
            if (r3 == 0) goto L99
            r3.close()     // Catch: java.io.IOException -> L8a
            goto L99
        L79:
            r6 = move-exception
        L7a:
            X.KkT r5 = p003X.C87911KkT.LIZIZ     // Catch: java.lang.Throwable -> L9d
            java.lang.String r7 = "OpenFeaturePanelModel"
            r8 = 0
            r9 = 4
            r10 = 0
            p003X.C87911KkT.LIZ(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L9d
            if (r3 == 0) goto L99
            r3.close()     // Catch: java.io.IOException -> L8a
            goto L99
        L8a:
            r6 = move-exception
            X.KkT r5 = p003X.C87911KkT.LIZIZ
            r8 = 0
            r9 = 4
            r10 = 0
            java.lang.String r7 = "OpenFeaturePanelModel"
            p003X.C87911KkT.LIZ(r5, r6, r7, r8, r9, r10)
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r4)
            return
        L99:
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r4)
            return
        L9d:
            r0 = move-exception
            if (r3 == 0) goto Laf
        La0:
            r3.close()     // Catch: java.io.IOException -> La4
            goto Laf
        La4:
            r6 = move-exception
            X.KkT r5 = p003X.C87911KkT.LIZIZ
            r8 = 0
            r9 = 4
            r10 = 0
            java.lang.String r7 = "OpenFeaturePanelModel"
            p003X.C87911KkT.LIZ(r5, r6, r7, r8, r9, r10)
        Laf:
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.model.C3768a.LIZ(java.lang.String, java.lang.String):void");
    }

    @Override // p003X.AbstractC88161KoV
    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LIZIZ.LIZIZ(this.LIZLLL, GsonProtectorUtils.toJson(KM9.LIZIZ(), this.LIZJ));
    }

    public C3768a() {
        LinkedList<String> linkedList;
        SharedPrefHelper LIZ2 = SharedPrefHelper.LIZ(LK5.LJIIJ());
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        this.LIZIZ = LIZ2;
        this.LIZJ = new LinkedList<>();
        try {
            Object fromJson = KM9.LIZIZ().fromJson(this.LIZIZ.LIZ(this.LIZLLL, ""), new C88243Kpp().getType());
            Intrinsics.checkNotNullExpressionValue(fromJson, "");
            linkedList = (LinkedList) fromJson;
        } catch (Exception e) {
            e.printStackTrace();
            linkedList = new LinkedList<>();
        }
        this.LIZJ = linkedList;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094 A[Catch: UnsupportedEncodingException -> 0x00a0, IOException -> 0x00a3, FileNotFoundException -> 0x00a6, all -> 0x00f4, LOOP:0: B:23:0x0086->B:29:0x0094, LOOP_END, TRY_LEAVE, TryCatch #6 {FileNotFoundException -> 0x00a6, UnsupportedEncodingException -> 0x00a0, IOException -> 0x00a3, all -> 0x00f4, blocks: (B:22:0x0076, B:24:0x0088, B:29:0x0094), top: B:21:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c A[EDGE_INSN: B:30:0x009c->B:31:0x009c ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String LIZIZ(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.model.C3768a.LIZIZ(java.lang.String):java.lang.String");
    }

    @Override // p003X.AbstractC88161KoV
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (this.LIZJ.contains(str)) {
            this.LIZJ.remove(str);
        }
        this.LIZJ.add(str);
        if (this.LIZJ.size() > 6) {
            LinkedList<String> linkedList = this.LIZJ;
            if (!(linkedList instanceof Queue)) {
                linkedList = null;
            }
            if (linkedList != null) {
                linkedList.poll();
            }
        }
    }

    @Override // p003X.AbstractC88161KoV
    public final Observable<C3382n> LIZ(long j, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        C106862S5w.LIZ(str);
        if (j == 1) {
            return null;
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_OPEN_FEATURE_LIST_LOCAL_CACHE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (Intrinsics.areEqual(settingKey.getValue(), Boolean.FALSE)) {
            C87911KkT.LIZIZ.LIZ("不加载缓存的本地列表数据", "OpenFeaturePanelModel");
            return null;
        }
        return Observable.create(new C88226KpY(this, str)).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread());
    }

    @Override // p003X.AbstractC88161KoV
    public final Observable<Unit> LIZ(C3382n c3382n, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3382n, str}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        C106862S5w.LIZ(c3382n, str);
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_OPEN_FEATURE_LIST_LOCAL_CACHE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (Intrinsics.areEqual(settingKey.getValue(), Boolean.FALSE)) {
            C87911KkT.LIZIZ.LIZ("Don't save data to local.", "OpenFeaturePanelModel");
            return null;
        }
        return Observable.create(new C88222KpU(this, c3382n, str)).subscribeOn(Schedulers.m138io());
    }

    @Override // p003X.AbstractC88161KoV
    public final Observable<AbstractC100834PnQ<C3372ac>> LIZ(long j, Long l, String str) {
        String str2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), l, str}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        C106862S5w.LIZ(str);
        OpenFeatureApi openFeatureApi = (OpenFeatureApi) C88306Kqq.LIZ().LIZ(OpenFeatureApi.class);
        if (j != 2) {
            str2 = "";
        } else {
            str2 = EffectSDKUtils.getSdkVersion();
        }
        Intrinsics.checkNotNullExpressionValue(str2, "");
        Observable<AbstractC100834PnQ<C3372ac>> observeOn = openFeatureApi.searchEntrance(j, l, str, str2).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread());
        Intrinsics.checkNotNullExpressionValue(observeOn, "");
        return observeOn;
    }

    @Override // p003X.AbstractC88161KoV
    public final Observable<AbstractC100834PnQ<C3382n>> LIZ(long j, long j2, String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), str, str2}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        C106862S5w.LIZ(str, str2);
        Observable<AbstractC100834PnQ<C3382n>> observeOn = ((OpenFeatureApi) C88306Kqq.LIZ().LIZ(OpenFeatureApi.class)).fetchFeatureList(j, j2, str, str2).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread());
        Intrinsics.checkNotNullExpressionValue(observeOn, "");
        return observeOn;
    }
}
