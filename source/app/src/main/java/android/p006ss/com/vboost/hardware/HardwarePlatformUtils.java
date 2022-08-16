package android.p006ss.com.vboost.hardware;

import android.p006ss.com.vboost.utils.RomUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.io.RandomAccessFile;
import p003X.C144239eTJ;

/* renamed from: android.ss.com.vboost.hardware.HardwarePlatformUtils */
/* loaded from: classes18.dex */
public class HardwarePlatformUtils {
    public static ChangeQuickRedirect LIZ;
    public static final String LIZIZ = HardwarePlatformUtils.class.getSimpleName();
    public static PLATFORM_TYPE LIZJ = PLATFORM_TYPE.UNINITED;

    /* renamed from: android.ss.com.vboost.hardware.HardwarePlatformUtils$PLATFORM_TYPE */
    /* loaded from: classes18.dex */
    public enum PLATFORM_TYPE {
        UNINITED,
        QCOM,
        MTK,
        CHRY,
        SAMSUNG,
        UNKNOWN;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static PLATFORM_TYPE[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (PLATFORM_TYPE[]) proxy.result;
            }
            return (PLATFORM_TYPE[]) values().clone();
        }

        static {
            Covode.recordClassIndex(51);
        }

        public static PLATFORM_TYPE valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (PLATFORM_TYPE) proxy.result;
            }
            return (PLATFORM_TYPE) Enum.valueOf(PLATFORM_TYPE.class, str);
        }
    }

    static {
        Covode.recordClassIndex(50);
    }

    public static int LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/possible", "r");
            String readLine = randomAccessFile.readLine();
            randomAccessFile.close();
            if (readLine != null) {
                String[] split = readLine.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                if (split.length == 2) {
                    availableProcessors = Integer.parseInt(split[1]) + 1;
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        if (availableProcessors <= 0) {
            return 8;
        }
        return availableProcessors;
    }

    public static PLATFORM_TYPE LIZ() {
        PLATFORM_TYPE platform_type;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 1);
        if (proxy.isSupported) {
            return (PLATFORM_TYPE) proxy.result;
        }
        if (LIZJ != PLATFORM_TYPE.UNINITED) {
            return LIZJ;
        }
        String LIZ2 = RomUtils.LIZ("ro.hardware");
        if (LIZ2 == null) {
            platform_type = PLATFORM_TYPE.UNKNOWN;
        } else if (!LIZ2.startsWith("qcom") && !LIZ2.startsWith("msm") && !LIZ2.startsWith("qsc") && !LIZ2.startsWith("sdm")) {
            if (LIZ2.startsWith("mt")) {
                platform_type = PLATFORM_TYPE.MTK;
            } else if (!LIZ2.startsWith("kirin") && !LIZ2.startsWith("hi")) {
                String LIZ3 = RomUtils.LIZ("ro.hardware.egl");
                if (LIZ3 != null && LIZ3.toLowerCase().equals("adreno")) {
                    platform_type = PLATFORM_TYPE.QCOM;
                } else {
                    C144239eTJ.LIZJ(LIZIZ, "Unknown hardware platform!");
                    platform_type = PLATFORM_TYPE.UNKNOWN;
                }
            } else {
                platform_type = PLATFORM_TYPE.CHRY;
            }
        } else {
            platform_type = PLATFORM_TYPE.QCOM;
        }
        LIZJ = platform_type;
        String str = LIZIZ;
        C144239eTJ.LIZ(str, "hardware platform type: " + platform_type);
        return platform_type;
    }

    public static int LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, null, LIZ, true, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return LIZ("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_max_freq");
    }

    public static int LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, LIZ, true, 6);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int i = -1;
        if (str != null) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
                String readLine = randomAccessFile.readLine();
                randomAccessFile.close();
                i = Integer.parseInt(readLine);
                return i;
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return i;
    }
}
