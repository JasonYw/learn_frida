package com.benchmark.collection;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C108898SuC;

/* loaded from: classes10.dex */
public final class CollectionSettings {
    public boolean LIZ;
    public int LIZIZ;
    public REPORT_MODE LIZJ;
    public boolean LIZLLL;

    static {
        Covode.recordClassIndex(9649);
    }

    /* loaded from: classes10.dex */
    public enum REPORT_MODE {
        APPLOG,
        FAAS_API;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static REPORT_MODE[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (REPORT_MODE[]) proxy.result;
            }
            return (REPORT_MODE[]) values().clone();
        }

        static {
            Covode.recordClassIndex(9650);
        }

        public static REPORT_MODE valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (REPORT_MODE) proxy.result;
            }
            return (REPORT_MODE) Enum.valueOf(REPORT_MODE.class, str);
        }
    }

    public CollectionSettings(C108898SuC c108898SuC) {
        this.LIZ = c108898SuC.LIZIZ;
        this.LIZIZ = c108898SuC.LIZJ;
        this.LIZJ = c108898SuC.LIZLLL;
        this.LIZLLL = c108898SuC.f12298LJ;
    }
}
