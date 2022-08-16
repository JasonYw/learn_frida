package com.android.ttcjpaysdk.base.p132h5.jsb;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sdk.bridge.model.IBridgeContext;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C116971W2r;
import p003X.C137422ch0;
import p003X.C7D7;
import p003X.VZQ;

/* renamed from: com.android.ttcjpaysdk.base.h5.jsb.JSBMediaUtil$uploadMedia$1 */
/* loaded from: classes17.dex */
public final class JSBMediaUtil$uploadMedia$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ IBridgeContext $bridgeContext;
    public final /* synthetic */ int $compressLimit;
    public final /* synthetic */ String $filePath;
    public final /* synthetic */ String $header;
    public final /* synthetic */ String $params;
    public final /* synthetic */ String $publicKey;
    public final /* synthetic */ String $url;

    static {
        Covode.recordClassIndex(6142);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JSBMediaUtil$uploadMedia$1(String str, IBridgeContext iBridgeContext, int i, String str2, String str3, String str4, String str5) {
        super(0);
        this.$filePath = str;
        this.$bridgeContext = iBridgeContext;
        this.$compressLimit = i;
        this.$publicKey = str2;
        this.$header = str3;
        this.$params = str4;
        this.$url = str5;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            new Thread(new RunnableC21391()).start();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.android.ttcjpaysdk.base.h5.jsb.JSBMediaUtil$uploadMedia$1$1 */
    /* loaded from: classes17.dex */
    public static final class RunnableC21391 implements Runnable {
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(6143);
        }

        public RunnableC21391() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            String LIZIZ;
            if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                return;
            }
            VZQ vzq = VZQ.LIZIZ;
            String str = JSBMediaUtil$uploadMedia$1.this.$filePath;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, vzq, VZQ.LIZ, false, 5);
            if (proxy.isSupported) {
                LIZIZ = (String) proxy.result;
            } else {
                byte[] LIZ2 = vzq.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                LIZIZ = vzq.LIZIZ(LIZ2, str);
            }
            Lazy lazy = LazyKt__LazyJVMKt.lazy(new JSBMediaUtil$uploadMedia$1$1$file$2(LIZIZ));
            if (((File) lazy.mo27335getValue()).exists() && ((File) lazy.mo27335getValue()).length() != 0) {
                Bitmap LJFF = C116971W2r.LJFF(LIZIZ);
                if (LJFF != null) {
                    final byte[] LIZ3 = C7D7.LIZ(C7D7.LIZIZ, LJFF, JSBMediaUtil$uploadMedia$1.this.$compressLimit, 0, 4, null);
                    LJFF.recycle();
                    if (LIZ3 != null) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.android.ttcjpaysdk.base.h5.jsb.JSBMediaUtil.uploadMedia.1.1.1
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(6144);
                            }

                            /* JADX WARN: Removed duplicated region for block: B:23:0x00ee  */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final void run() {
                                /*
                                    Method dump skipped, instructions count: 302
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.base.p132h5.jsb.JSBMediaUtil$uploadMedia$1.RunnableC21391.RunnableC21401.run():void");
                            }
                        });
                        return;
                    }
                }
                C137422ch0.LIZIZ.LIZ(JSBMediaUtil$uploadMedia$1.this.$bridgeContext, 1, "unsupported file");
                return;
            }
            C137422ch0.LIZIZ.LIZ(JSBMediaUtil$uploadMedia$1.this.$bridgeContext, 1, "file not exist");
        }
    }
}
