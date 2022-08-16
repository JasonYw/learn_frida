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
import p003X.AbstractC88716KxS;
import p003X.C106862S5w;

/* loaded from: classes7.dex */
public final class SaveDataURLMethod extends AbstractC13049f<C2587a, Object> {
    public static ChangeQuickRedirect LIZ;

    /* loaded from: classes7.dex */
    public static final class SaveDataURLResModel implements AbstractC88716KxS {
        @SerializedName(C2521l.LJIIJ)
        public Code LIZ;
        @SerializedName("msg")
        public String LIZIZ;
        @SerializedName("filePath")
        public String LIZJ;

        static {
            Covode.recordClassIndex(10526);
        }

        /* loaded from: classes7.dex */
        public enum Code implements AbstractC2591o {
            Success(1),
            Failed(0),
            f46554Failed_3(-3);
            
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
                Covode.recordClassIndex(10527);
            }

            Code(int i) {
                this.value = i;
            }
        }
    }

    /* renamed from: com.bytedance.android.annie.bridge.method.SaveDataURLMethod$a */
    /* loaded from: classes7.dex */
    public static final class C2587a {
        @SerializedName("filename")
        public String LIZ;
        @SerializedName("dataURL")
        public String LIZIZ;
        @SerializedName("extension")
        public String LIZJ;
        @SerializedName("saveToAlbum")
        public String LIZLLL;

        static {
            Covode.recordClassIndex(10528);
        }
    }

    static {
        Covode.recordClassIndex(10525);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public final void onTerminate() {
    }

    public SaveDataURLMethod(IHybridComponent iHybridComponent) {
        C106862S5w.LIZ(iHybridComponent);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void invoke(com.bytedance.android.annie.bridge.method.SaveDataURLMethod.C2587a r7, com.bytedance.ies.web.jsbridge2.C13052h r8) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.annie.bridge.method.SaveDataURLMethod.invoke(java.lang.Object, com.bytedance.ies.web.jsbridge2.h):void");
    }
}
