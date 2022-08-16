package com.alibaba.android.vlayout;

import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class Cantor {
    static {
        Covode.recordClassIndex(4327);
    }

    public static long getCantor(long j, long j2) {
        long j3 = j + j2;
        return ((j3 * (1 + j3)) / 2) + j2;
    }

    public static void reverseCantor(long j, long[] jArr) {
        if (jArr == null || jArr.length < 2) {
            jArr = new long[2];
        }
        long floor = (long) (Math.floor(Math.sqrt((8 * j) + 1) - 1.0d) / 2.0d);
        long j2 = j - (((floor * floor) + floor) / 2);
        jArr[0] = floor - j2;
        jArr[1] = j2;
    }
}
