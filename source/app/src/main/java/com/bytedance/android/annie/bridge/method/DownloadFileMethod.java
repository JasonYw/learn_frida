package com.bytedance.android.annie.bridge.method;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.annie.api.card.IHybridComponent;
import com.bytedance.android.annie.bridge.method.abs.AbstractC2591o;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import com.google.gson.annotations.SerializedName;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Map;
import p003X.AbstractC88716KxS;
import p003X.C106862S5w;

/* loaded from: classes7.dex */
public final class DownloadFileMethod extends AbstractC13049f<C2586a, Object> {
    public static ChangeQuickRedirect LIZ;
    public final IHybridComponent LIZIZ;

    /* loaded from: classes7.dex */
    public static final class DownloadFileResModel implements AbstractC88716KxS {
        @SerializedName(C2521l.LJIIJ)
        public Code LIZ;
        @SerializedName("msg")
        public String LIZIZ;
        @SerializedName("clientCode")
        public Integer LIZJ = 0;
        @SerializedName("httpCode")
        public Integer LIZLLL = 0;
        @SerializedName("header")

        /* renamed from: LJ */
        public Map<String, ? extends Object> f25613LJ;
        @SerializedName("response")
        public Map<String, ? extends Object> LJFF;
        @SerializedName("filePath")
        public String LJI;

        static {
            Covode.recordClassIndex(10514);
        }

        /* loaded from: classes7.dex */
        public enum Code implements AbstractC2591o {
            Success(1),
            Failed(0);
            
            public static ChangeQuickRedirect changeQuickRedirect;
            public final int value;

            public static Code valueOf(String str) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
                return (Code) (proxy.isSupported ? proxy.result : Enum.valueOf(Code.class, str));
            }

            /* renamed from: values  reason: to resolve conflict with enum method */
            public static Code[] valuesCustom() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
                return (Code[]) (proxy.isSupported ? proxy.result : values().clone());
            }

            @Override // com.bytedance.android.annie.bridge.method.abs.AbstractC2591o
            public final int LIZ() {
                return this.value;
            }

            static {
                Covode.recordClassIndex(10515);
            }

            Code(int i) {
                this.value = i;
            }
        }
    }

    /* renamed from: com.bytedance.android.annie.bridge.method.DownloadFileMethod$a */
    /* loaded from: classes7.dex */
    public static final class C2586a {
        @SerializedName(PushConstants.WEB_URL)
        public String LIZ;
        @SerializedName("extension")
        public String LIZIZ;
        @SerializedName("header")
        public Map<String, ? extends Object> LIZJ;
        @SerializedName("params")
        public Map<String, ? extends Object> LIZLLL;
        @SerializedName("needCommonParams")

        /* renamed from: LJ */
        public Boolean f25614LJ = Boolean.TRUE;
        @SerializedName("saveToAlbum")
        public String LJFF;

        static {
            Covode.recordClassIndex(10516);
        }
    }

    static {
        Covode.recordClassIndex(10513);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public final void onTerminate() {
    }

    public DownloadFileMethod(IHybridComponent iHybridComponent) {
        C106862S5w.LIZ(iHybridComponent);
        this.LIZIZ = iHybridComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void invoke(com.bytedance.android.annie.bridge.method.DownloadFileMethod.C2586a r8, com.bytedance.ies.web.jsbridge2.C13052h r9) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.annie.bridge.method.DownloadFileMethod.invoke(java.lang.Object, com.bytedance.ies.web.jsbridge2.h):void");
    }
}
