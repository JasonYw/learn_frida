package anet.channel.util;

import com.bytedance.covode.number.Covode;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class HMacUtil {
    static {
        Covode.recordClassIndex(2365);
    }

    public static byte[] hmacSha1(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "HmacSHA256");
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(secretKeySpec);
            return mac.doFinal(bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String hmacSha1Hex(byte[] bArr, byte[] bArr2) {
        String str = "";
        try {
            str = StringUtils.bytesToHexString(hmacSha1(bArr, bArr2));
            return str;
        } catch (Throwable th) {
            ALog.m20786e("awcn.HMacUtil", "hmacSha1Hex", null, "result", str, th);
            return str;
        }
    }
}
