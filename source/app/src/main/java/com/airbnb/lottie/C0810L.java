package com.airbnb.lottie;

import androidx.core.p018os.TraceCompat;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;
import p002O.C0002O;

/* renamed from: com.airbnb.lottie.L */
/* loaded from: classes19.dex */
public class C0810L {
    public static boolean DBG;
    public static String[] sections;
    public static long[] startTimeNs;
    public static final Set<String> loggedMessages = new HashSet();
    public static boolean traceEnabled = false;
    public static int traceDepth = 0;
    public static int depthPastMaxDepth = 0;

    public static void debug(String str) {
    }

    static {
        Covode.recordClassIndex(3903);
    }

    public static void warn(String str) {
        if (loggedMessages.contains(str)) {
            return;
        }
        loggedMessages.add(str);
    }

    public static void setTraceEnabled(boolean z) {
        if (traceEnabled == z) {
            return;
        }
        traceEnabled = z;
        if (z) {
            sections = new String[20];
            startTimeNs = new long[20];
        }
    }

    public static void beginSection(String str) {
        if (!traceEnabled) {
            return;
        }
        int i = traceDepth;
        if (i == 20) {
            depthPastMaxDepth++;
            return;
        }
        sections[i] = str;
        startTimeNs[i] = System.nanoTime();
        TraceCompat.beginSection(str);
        traceDepth++;
    }

    public static float endSection(String str) {
        int i = depthPastMaxDepth;
        if (i > 0) {
            depthPastMaxDepth = i - 1;
            return 0.0f;
        } else if (!traceEnabled) {
            return 0.0f;
        } else {
            int i2 = traceDepth - 1;
            traceDepth = i2;
            if (i2 != -1) {
                if (str.equals(sections[traceDepth])) {
                    TraceCompat.endSection();
                    return ((float) (System.nanoTime() - startTimeNs[traceDepth])) / 1000000.0f;
                }
                throw new IllegalStateException(C0002O.m25083C("Unbalanced trace call ", str, ". Expected ", sections[traceDepth], "."));
            }
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
    }
}
