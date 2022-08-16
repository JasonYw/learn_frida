package android.p006ss.com.vboost.utils;

import android.p006ss.com.vboost.VoRomUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import p002O.C0002O;
import p003X.C116971W2r;
import p003X.C144239eTJ;

/* renamed from: android.ss.com.vboost.utils.RomUtils */
/* loaded from: classes18.dex */
public final class RomUtils {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(114);
    }

    /* renamed from: android.ss.com.vboost.utils.RomUtils$ROM_TYPE */
    /* loaded from: classes19.dex */
    public enum ROM_TYPE {
        UNKNOWN(LoggerUtil.UNKNOWN, 0),
        SS("ss", 1),
        CHRY("chry", 2),
        XM("xm", 3),
        OP("op", 4),
        VO("vo", 5),
        MZ("mz", 6);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public int index;
        public String name;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ROM_TYPE[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (ROM_TYPE[]) proxy.result;
            }
            return (ROM_TYPE[]) values().clone();
        }

        static {
            Covode.recordClassIndex(115);
        }

        public static ROM_TYPE valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (ROM_TYPE) proxy.result;
            }
            return (ROM_TYPE) Enum.valueOf(ROM_TYPE.class, str);
        }

        ROM_TYPE(String str, int i) {
            this.name = str;
            this.index = i;
        }
    }

    public static boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return VoRomUtils.isVoRom();
    }

    public static String LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, LIZ, true, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        try {
            Class LIZ2 = C116971W2r.LIZ("android.os.SystemProperties");
            return (String) LIZ2.getMethod("get", String.class).invoke(LIZ2, str);
        } catch (Exception unused) {
            C144239eTJ.LIZLLL("RomUtils", C0002O.m25086C("Failed to read system property ", str));
            return null;
        }
    }
}
