package androidx.lifecycle;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes26.dex */
public class MethodCallsLogger {
    public Map<String, Integer> mCalledMethods = new HashMap();

    static {
        Covode.recordClassIndex(1372);
    }

    public boolean approveCall(String str, int i) {
        int i2;
        boolean z;
        Integer num = this.mCalledMethods.get(str);
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        if ((i2 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mCalledMethods.put(str, Integer.valueOf(i | i2));
        if (z) {
            return false;
        }
        return true;
    }
}
