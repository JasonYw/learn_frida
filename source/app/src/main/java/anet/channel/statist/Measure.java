package anet.channel.statist;

import com.bytedance.covode.number.Covode;

/* loaded from: classes13.dex */
public @interface Measure {
    static {
        Covode.recordClassIndex(2269);
    }

    double constantValue() default 0.0d;

    double max() default Double.MAX_VALUE;

    double min() default 0.0d;

    String name() default "";
}
