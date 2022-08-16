package com.android.ttcjpaysdk.base.p132h5.jsb;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sdk.bridge.model.IBridgeContext;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.android.ttcjpaysdk.base.h5.jsb.JSBMediaUtil$sendChooseMediaResult$1 */
/* loaded from: classes17.dex */
public final class JSBMediaUtil$sendChooseMediaResult$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ IBridgeContext $bridgeContext;
    public final /* synthetic */ File $file;
    public final /* synthetic */ String $path;

    static {
        Covode.recordClassIndex(6140);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JSBMediaUtil$sendChooseMediaResult$1(String str, File file, IBridgeContext iBridgeContext) {
        super(0);
        this.$path = str;
        this.$file = file;
        this.$bridgeContext = iBridgeContext;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            new Thread(new Runnable() { // from class: com.android.ttcjpaysdk.base.h5.jsb.JSBMediaUtil$sendChooseMediaResult$1.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(6141);
                }

                /* JADX WARN: Code restructure failed: missing block: B:29:0x002f, code lost:
                    if (r6 != null) goto L11;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        r12 = this;
                        r2 = 0
                        java.lang.Object[] r3 = new java.lang.Object[r2]
                        com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.android.ttcjpaysdk.base.p132h5.jsb.JSBMediaUtil$sendChooseMediaResult$1.RunnableC21381.LIZ
                        r0 = 1
                        com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r3, r12, r1, r2, r0)
                        boolean r1 = r1.isSupported
                        if (r1 == 0) goto Lf
                        return
                    Lf:
                        com.android.ttcjpaysdk.base.h5.jsb.JSBMediaUtil$sendChooseMediaResult$1 r1 = com.android.ttcjpaysdk.base.p132h5.jsb.JSBMediaUtil$sendChooseMediaResult$1.this
                        java.lang.String r1 = r1.$path
                        android.graphics.Bitmap r6 = p003X.C116971W2r.LJFF(r1)
                        r4 = 2
                        java.lang.String r3 = ""
                        if (r6 == 0) goto L2e
                        X.7D7 r5 = p003X.C7D7.LIZIZ
                        r7 = 0
                        r8 = 0
                        r9 = 6
                        r10 = 0
                        byte[] r1 = p003X.C7D7.LIZ(r5, r6, r7, r8, r9, r10)
                        if (r1 == 0) goto L2e
                        java.lang.String r8 = android.util.Base64.encodeToString(r1, r4)
                        if (r8 != 0) goto L31
                    L2e:
                        r8 = r3
                        if (r6 == 0) goto L34
                    L31:
                        r6.recycle()
                    L34:
                        org.json.JSONObject r5 = new org.json.JSONObject
                        r5.<init>()
                        r1 = 4
                        kotlin.Pair[] r7 = new kotlin.Pair[r1]     // Catch: org.json.JSONException -> Lb2
                        java.lang.String r6 = "media_type"
                        java.lang.String r1 = "image"
                        kotlin.Pair r1 = kotlin.TuplesKt.m137to(r6, r1)     // Catch: org.json.JSONException -> Lb2
                        r7[r2] = r1     // Catch: org.json.JSONException -> Lb2
                        java.lang.String r6 = "size"
                        com.android.ttcjpaysdk.base.h5.jsb.JSBMediaUtil$sendChooseMediaResult$1 r1 = com.android.ttcjpaysdk.base.p132h5.jsb.JSBMediaUtil$sendChooseMediaResult$1.this     // Catch: org.json.JSONException -> Lb2
                        java.io.File r1 = r1.$file     // Catch: org.json.JSONException -> Lb2
                        long r9 = r1.length()     // Catch: org.json.JSONException -> Lb2
                        java.lang.Long r1 = java.lang.Long.valueOf(r9)     // Catch: org.json.JSONException -> Lb2
                        kotlin.Pair r1 = kotlin.TuplesKt.m137to(r6, r1)     // Catch: org.json.JSONException -> Lb2
                        r7[r0] = r1     // Catch: org.json.JSONException -> Lb2
                        java.lang.String r10 = "file_path"
                        X.VZQ r11 = p003X.VZQ.LIZIZ     // Catch: org.json.JSONException -> Lb2
                        com.android.ttcjpaysdk.base.h5.jsb.JSBMediaUtil$sendChooseMediaResult$1 r1 = com.android.ttcjpaysdk.base.p132h5.jsb.JSBMediaUtil$sendChooseMediaResult$1.this     // Catch: org.json.JSONException -> Lb2
                        java.lang.String r9 = r1.$path     // Catch: org.json.JSONException -> Lb2
                        java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: org.json.JSONException -> Lb2
                        r1[r2] = r9     // Catch: org.json.JSONException -> Lb2
                        com.bytedance.hotfix.base.ChangeQuickRedirect r0 = p003X.VZQ.LIZ     // Catch: org.json.JSONException -> Lb2
                        r6 = 3
                        com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r1, r11, r0, r2, r6)     // Catch: org.json.JSONException -> Lb2
                        boolean r0 = r1.isSupported     // Catch: org.json.JSONException -> Lb2
                        if (r0 == 0) goto La3
                        java.lang.Object r0 = r1.result     // Catch: org.json.JSONException -> Lb2
                    L73:
                        kotlin.Pair r0 = kotlin.TuplesKt.m137to(r10, r0)     // Catch: org.json.JSONException -> Lb2
                        r7[r4] = r0     // Catch: org.json.JSONException -> Lb2
                        java.lang.String r0 = "meta_file"
                        kotlin.Pair r0 = kotlin.TuplesKt.m137to(r0, r8)     // Catch: org.json.JSONException -> Lb2
                        r7[r6] = r0     // Catch: org.json.JSONException -> Lb2
                        java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.listOf(r7)     // Catch: org.json.JSONException -> Lb2
                        java.util.Iterator r4 = r0.iterator()     // Catch: org.json.JSONException -> Lb2
                    L89:
                        boolean r0 = r4.hasNext()     // Catch: org.json.JSONException -> Lb2
                        if (r0 == 0) goto Lb6
                        java.lang.Object r0 = r4.next()     // Catch: org.json.JSONException -> Lb2
                        kotlin.Pair r0 = (kotlin.Pair) r0     // Catch: org.json.JSONException -> Lb2
                        java.lang.Object r1 = r0.component1()     // Catch: org.json.JSONException -> Lb2
                        java.lang.String r1 = (java.lang.String) r1     // Catch: org.json.JSONException -> Lb2
                        java.lang.Object r0 = r0.component2()     // Catch: org.json.JSONException -> Lb2
                        r5.put(r1, r0)     // Catch: org.json.JSONException -> Lb2
                        goto L89
                    La3:
                        p003X.C106862S5w.LIZ(r9)     // Catch: org.json.JSONException -> Lb2
                        byte[] r0 = r11.LIZ()     // Catch: org.json.JSONException -> Lb2
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)     // Catch: org.json.JSONException -> Lb2
                        java.lang.String r0 = r11.LIZ(r0, r9)     // Catch: org.json.JSONException -> Lb2
                        goto L73
                    Lb2:
                        r0 = move-exception
                        r0.printStackTrace()
                    Lb6:
                        com.android.ttcjpaysdk.base.h5.jsb.JSBMediaUtil$sendChooseMediaResult$1 r0 = com.android.ttcjpaysdk.base.p132h5.jsb.JSBMediaUtil$sendChooseMediaResult$1.this
                        com.bytedance.sdk.bridge.model.IBridgeContext r1 = r0.$bridgeContext
                        com.bytedance.sdk.bridge.model.BridgeResult$Companion r0 = com.bytedance.sdk.bridge.model.BridgeResult.Companion
                        com.bytedance.sdk.bridge.model.BridgeResult r0 = r0.createSuccessResult(r5, r3)
                        r0.setCode(r2)
                        r1.callback(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.base.p132h5.jsb.JSBMediaUtil$sendChooseMediaResult$1.RunnableC21381.run():void");
                }
            }).start();
        }
        return Unit.INSTANCE;
    }
}
