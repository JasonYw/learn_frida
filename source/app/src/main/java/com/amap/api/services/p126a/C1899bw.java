package com.amap.api.services.p126a;

import androidx.core.view.MotionEventCompat;
import com.amap.api.services.p126a.C1889bo;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.services.a.bw */
/* loaded from: classes19.dex */
public class C1899bw {

    /* renamed from: b */
    public static String f24545b;

    /* renamed from: c */
    public static String f24546c;

    /* renamed from: d */
    public static byte[] f24547d;

    /* renamed from: e */
    public static boolean f24548e;

    /* renamed from: f */
    public static boolean f24549f;

    /* renamed from: a */
    public static String f24544a = "CUlNBL0VDQi9QS0NTMVBhZGRpbmc";

    /* renamed from: g */
    public static String f24550g = "ADgAIwBbAA8AagAIAHIAEwCFAD8AxABDAQcAIQEoADgBYAA8AZwAnwI7APADKwAHAzIADAM+AA9LWVc1a2NtOXBaQzV2Y3k1VFpYSjJhV05sVFdGdVlXZGxjZ1FaMlYwVTJWeWRtbGpaUUljR2h2Ym1VVWFYQm9iMjVsYzNWaWFXNW1id01ZMjl0TG1GdVpISnZhV1F1YVc1MFpYSnVZV3d1ZEdWc1pYQm9iMjU1TGtsVVpXeGxjR2h2Ym5ra1UzUjFZZ1FZMjl0TG1GdVpISnZhV1F1YVc1MFpYSnVZV3d1ZEdWc1pYQm9iMjU1TGtsUWFHOXVaVk4xWWtsdVptOGtVM1IxWWdHVkZKQlRsTkJRMVJKVDA1ZloyVjBSR1YyYVdObFNXUT1FWTI5dExtRnVaSEp2YVdRdWFXNTBaWEp1WVd3dWRHVnNaWEJvYjI1NUxrbFVaV3hsY0dodmJua0lZMjl0TG1GdVpISnZhV1F1YVc1MFpYSnVZV3d1ZEdWc1pYQm9iMjU1TGtsUWFHOXVaVk4xWWtsdVptOEVJbXRsZVNJNklpVnpJaXdpY0d4aGRHWnZjbTBpT2lKaGJtUnliMmxrSWl3aVpHbDFJam9pSlhNaUxDSndhMmNpT2lJbGN5SXNJbTF2WkdWc0lqb2lKWE1pTENKaGNIQnVZVzFsSWpvaUpYTWlMQ0poY0hCMlpYSnphVzl1SWpvaUpYTWlMQ0p6ZVhOMlpYSnphVzl1SWpvaUpYTWlMQUdJbXRsZVNJNklpVnpJaXdpY0d4aGRHWnZjbTBpT2lKaGJtUnliMmxrSWl3aVpHbDFJam9pSlhNaUxDSnRZV01pT2lJbGN5SXNJblJwWkNJNklpVnpJaXdpZFcxcFpIUWlPaUlsY3lJc0ltMWhiblZtWVdOMGRYSmxJam9pSlhNaUxDSmtaWFpwWTJVaU9pSWxjeUlzSW5OcGJTSTZJaVZ6SWl3aWNHdG5Jam9pSlhNaUxDSnRiMlJsYkNJNklpVnpJaXdpWVhCd2RtVnljMmx2YmlJNklpVnpJaXdpWVhCd2JtRnRaU0k2SWlWeklnPUlZV2xrUFFNZkhObGNtbGhiRDBRWVc1a2NtOXBaRjlwWkE=";

    static {
        Covode.recordClassIndex(5510);
        f24545b = "9aj&#k81";
        f24546c = "IaHR0cDovL2xvZ3MuYW1hcC5jb20vd3MvbG9nL3VwbG9hZD9wcm9kdWN0PSVzJnR5cGU9JXMmcGxhdGZvcm09JXMmY2hhbm5lbD0lcyZzaWduPSVz";
        f24545b = "9aj&#k81";
        f24546c = "IaHR0cDovL2xvZ3MuYW1hcC5jb20vd3MvbG9nL3VwbG9hZD9wcm9kdWN0PSVzJnR5cGU9JXMmcGxhdGZvcm09JXMmY2hhbm5lbD0lcyZzaWduPSVz";
    }

    /* renamed from: a */
    public static C1889bo m16763a() {
        try {
            C1889bo.C1891a c1891a = new C1889bo.C1891a("aiu", "1.0.0", "aiu");
            c1891a.m16803a(new String[0]);
            return c1891a.m16807a();
        } catch (C1863be e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m16762a(int i) {
        if (f24547d == null) {
            f24547d = C1882bk.m16860b(f24550g);
        }
        byte[] bArr = new byte[4];
        System.arraycopy(f24547d, i * 4, bArr, 0, 4);
        int i2 = ((bArr[0] & 255) * 256) + (bArr[1] & 255);
        int i3 = ((bArr[2] & MotionEventCompat.ACTION_MASK) * 256) + (bArr[3] & MotionEventCompat.ACTION_MASK);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(f24547d, i2, bArr2, 0, i3);
        return bArr2;
    }
}
