package anet.channel.security;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* loaded from: classes20.dex */
public interface ISecurity {
    static {
        Covode.recordClassIndex(2242);
    }

    byte[] decrypt(Context context, String str, String str2, byte[] bArr);

    byte[] getBytes(Context context, String str);

    boolean isSecOff();

    boolean saveBytes(Context context, String str, byte[] bArr);

    String sign(Context context, String str, String str2, String str3);
}
