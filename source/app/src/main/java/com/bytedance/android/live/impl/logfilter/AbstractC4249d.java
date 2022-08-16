package com.bytedance.android.live.impl.logfilter;

import com.bytedance.android.live.feature.api.FeatureType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Deque;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.QMH;

/* renamed from: com.bytedance.android.live.impl.logfilter.d */
/* loaded from: classes8.dex */
public abstract class AbstractC4249d {
    public static ChangeQuickRedirect LJFF;

    static {
        Covode.recordClassIndex(25014);
    }

    public abstract <T> T LIZ(String str);

    public abstract void LIZ(String str, String str2);

    public final void LIZ(String str, Deque<Long> deque, long j) {
        if (PatchProxy.proxy(new Object[]{str, deque, new Long(j)}, this, LJFF, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, deque);
        deque.offerLast(Long.valueOf(j));
        while (deque.size() != 0) {
            Long peekFirst = deque.peekFirst();
            Intrinsics.checkNotNullExpressionValue(peekFirst, "");
            if (((float) (j - peekFirst.longValue())) <= QMH.LIZJ() * 60000.0f) {
                break;
            }
            deque.pollFirst();
        }
        QMH.LIZLLL.LIZ(str, Integer.valueOf(deque.size()), FeatureType.MONITOR);
    }

    public final void LIZ(String str, Deque<Long> deque, int i, long j) {
        if (PatchProxy.proxy(new Object[]{str, deque, Integer.valueOf(i), new Long(j)}, this, LJFF, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, deque);
        if (i != 0) {
            deque.pollLast();
            LIZ(str, deque, j);
        }
    }
}
