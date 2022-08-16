package anet.channel.util;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: anet.channel.util.i */
/* loaded from: classes2.dex */
public class C0596i {

    /* renamed from: a */
    public static AtomicInteger f20844a = new AtomicInteger();

    static {
        Covode.recordClassIndex(2380);
    }

    /* renamed from: a */
    public static String m20754a(String str) {
        if (f20844a.get() == Integer.MAX_VALUE) {
            f20844a.set(0);
        }
        if (!TextUtils.isEmpty(str)) {
            return StringUtils.concatString(str, ".AWCN", String.valueOf(f20844a.incrementAndGet()));
        }
        return StringUtils.concatString("AWCN", String.valueOf(f20844a.incrementAndGet()));
    }
}
