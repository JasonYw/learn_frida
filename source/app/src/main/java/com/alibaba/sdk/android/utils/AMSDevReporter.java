package com.alibaba.sdk.android.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import p002O.C0002O;
import p003X.C116971W2r;

/* loaded from: classes13.dex */
public class AMSDevReporter {

    /* renamed from: a */
    public static Context f21700a;

    /* renamed from: a */
    public static final ExecutorService f21702a = C116971W2r.LIZ(new ThreadFactoryC1107a());

    /* renamed from: a */
    public static ConcurrentHashMap<AMSSdkTypeEnum, AMSReportStatusEnum> f21701a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static boolean f21703a = false;
    public static String TAG = "AMSDevReporter";

    /* loaded from: classes13.dex */
    public enum AMSSdkExtInfoKeyEnum {
        AMS_EXTINFO_KEY_VERSION("SdkVersion"),
        AMS_EXTINFO_KEY_PACKAGE("PackageName");
        
        public String description;

        @Override // java.lang.Enum
        public final String toString() {
            return this.description;
        }

        static {
            Covode.recordClassIndex(4519);
        }

        AMSSdkExtInfoKeyEnum(String str) {
            this.description = str;
        }
    }

    /* loaded from: classes13.dex */
    public enum AMSSdkTypeEnum {
        AMS_MAN("MAN"),
        AMS_HTTPDNS("HTTPDNS"),
        AMS_MPUSH("MPUSH"),
        AMS_MAC("MAC"),
        AMS_API("API"),
        AMS_HOTFIX("HOTFIX"),
        AMS_FEEDBACK("FEEDBACK"),
        AMS_IM("IM");
        
        public String description;

        @Override // java.lang.Enum
        public final String toString() {
            return this.description;
        }

        static {
            Covode.recordClassIndex(4520);
        }

        AMSSdkTypeEnum(String str) {
            this.description = str;
        }
    }

    /* loaded from: classes13.dex */
    public enum AMSReportStatusEnum {
        UNREPORTED,
        REPORTED;

        static {
            Covode.recordClassIndex(4518);
        }
    }

    static {
        Covode.recordClassIndex(4516);
        for (AMSSdkTypeEnum aMSSdkTypeEnum : AMSSdkTypeEnum.values()) {
            f21701a.put(aMSSdkTypeEnum, AMSReportStatusEnum.UNREPORTED);
        }
    }

    public static void setLogEnabled(boolean z) {
        C1118d.setLogEnabled(z);
    }

    public static AMSReportStatusEnum getReportStatus(AMSSdkTypeEnum aMSSdkTypeEnum) {
        return f21701a.get(aMSSdkTypeEnum);
    }

    public static void asyncReport(Context context, AMSSdkTypeEnum aMSSdkTypeEnum) {
        asyncReport(context, aMSSdkTypeEnum, null);
    }

    /* renamed from: a */
    public static void m19802a(AMSSdkTypeEnum aMSSdkTypeEnum, Map<String, Object> map) {
        String aMSSdkTypeEnum2 = aMSSdkTypeEnum.toString();
        if (f21701a.get(aMSSdkTypeEnum) != AMSReportStatusEnum.UNREPORTED) {
            C1118d.m19775b(TAG, C0002O.m25085C("[", aMSSdkTypeEnum2, "] already reported, return."));
            return;
        }
        int i = 0;
        int i2 = 5;
        while (true) {
            i++;
            C1118d.m19775b(TAG, C0002O.m25083C("Report [", aMSSdkTypeEnum2, "], times: [", Integer.valueOf(i), "]."));
            if (!m19801a(aMSSdkTypeEnum, map)) {
                if (i <= 10) {
                    C1118d.m19775b(TAG, C0002O.m25083C("Report [", aMSSdkTypeEnum2, "] failed, wait for [", Integer.valueOf(i2), "] seconds."));
                    C1119e.m19773a(i2);
                    i2 *= 2;
                    if (i2 >= 60) {
                        i2 = 60;
                    }
                } else {
                    C1118d.m19774c(TAG, C0002O.m25085C("Report [", aMSSdkTypeEnum2, "] stat failed, exceed max retry times, return."));
                    f21701a.put(aMSSdkTypeEnum, AMSReportStatusEnum.UNREPORTED);
                    f21703a = true;
                    break;
                }
            } else {
                C1118d.m19775b(TAG, C0002O.m25085C("Report [", aMSSdkTypeEnum2, "] stat success."));
                f21701a.put(aMSSdkTypeEnum, AMSReportStatusEnum.REPORTED);
                break;
            }
        }
        if (f21703a) {
            C1118d.m19774c(TAG, C0002O.m25085C("Report [", aMSSdkTypeEnum2, "] failed, clear remain report in queue."));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x019b, code lost:
        if (r5 == null) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m19801a(com.alibaba.sdk.android.utils.AMSDevReporter.AMSSdkTypeEnum r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.utils.AMSDevReporter.m19801a(com.alibaba.sdk.android.utils.AMSDevReporter$AMSSdkTypeEnum, java.util.Map):boolean");
    }

    public static void asyncReport(Context context, final AMSSdkTypeEnum aMSSdkTypeEnum, final Map<String, Object> map) {
        if (context == null) {
            C1118d.m19774c(TAG, "Context is null, return.");
            return;
        }
        f21700a = context;
        C1118d.m19775b(TAG, C0002O.m25085C("Add [", aMSSdkTypeEnum.toString(), "] to report queue."));
        f21703a = false;
        f21702a.execute(new Runnable() { // from class: com.alibaba.sdk.android.utils.AMSDevReporter.1
            static {
                Covode.recordClassIndex(4517);
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (AMSDevReporter.f21703a) {
                    C1118d.m19774c(AMSDevReporter.TAG, "Unable to execute remain task in queue, return.");
                    return;
                }
                C1118d.m19775b(AMSDevReporter.TAG, C0002O.m25085C("Get [", AMSSdkTypeEnum.this.toString(), "] from report queue."));
                AMSDevReporter.m19802a(AMSSdkTypeEnum.this, (Map<String, Object>) map);
            }
        });
    }

    /* renamed from: a */
    public static String m19803a(AMSSdkTypeEnum aMSSdkTypeEnum, String str, Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        sb.append(aMSSdkTypeEnum);
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        sb.append(str);
        if (map != null) {
            String str2 = (String) map.get(AMSSdkExtInfoKeyEnum.AMS_EXTINFO_KEY_VERSION.toString());
            if (!C1119e.m19771a(str2)) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                sb.append(str2);
            }
            String str3 = (String) map.get(AMSSdkExtInfoKeyEnum.AMS_EXTINFO_KEY_PACKAGE.toString());
            if (!C1119e.m19771a(str3)) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                sb.append(str3);
            }
        }
        return sb.toString();
    }
}
