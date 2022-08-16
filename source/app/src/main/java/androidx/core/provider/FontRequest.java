package androidx.core.provider;

import android.util.Base64;
import com.alipay.sdk.p082m.p121u.C1394i;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import p002O.C0002O;
import p003X.C109592TCw;

/* loaded from: classes17.dex */
public final class FontRequest {
    public final List<List<byte[]>> mCertificates;
    public final int mCertificatesArray;
    public final String mIdentifier;
    public final String mProviderAuthority;
    public final String mProviderPackage;
    public final String mQuery;

    static {
        Covode.recordClassIndex(1016);
    }

    public final List<List<byte[]>> getCertificates() {
        return this.mCertificates;
    }

    public final int getCertificatesArrayResId() {
        return this.mCertificatesArray;
    }

    public final String getIdentifier() {
        return this.mIdentifier;
    }

    public final String getProviderAuthority() {
        return this.mProviderAuthority;
    }

    public final String getProviderPackage() {
        return this.mProviderPackage;
    }

    public final String getQuery() {
        return this.mQuery;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.mProviderAuthority + ", mProviderPackage: " + this.mProviderPackage + ", mQuery: " + this.mQuery + ", mCertificates:");
        for (int i = 0; i < this.mCertificates.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.mCertificates.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append(C1394i.f22426f);
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.mCertificatesArray);
        return sb.toString();
    }

    public FontRequest(String str, String str2, String str3, int i) {
        boolean z;
        C109592TCw.LIZ(str);
        this.mProviderAuthority = str;
        C109592TCw.LIZ(str2);
        this.mProviderPackage = str2;
        C109592TCw.LIZ(str3);
        this.mQuery = str3;
        this.mCertificates = null;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        C109592TCw.LIZ(z);
        this.mCertificatesArray = i;
        this.mIdentifier = C0002O.m25083C(this.mProviderAuthority, Constants.ACCEPT_TIME_SEPARATOR_SERVER, this.mProviderPackage, Constants.ACCEPT_TIME_SEPARATOR_SERVER, this.mQuery);
    }

    public FontRequest(String str, String str2, String str3, List<List<byte[]>> list) {
        C109592TCw.LIZ(str);
        this.mProviderAuthority = str;
        C109592TCw.LIZ(str2);
        this.mProviderPackage = str2;
        C109592TCw.LIZ(str3);
        this.mQuery = str3;
        C109592TCw.LIZ(list);
        this.mCertificates = list;
        this.mCertificatesArray = 0;
        this.mIdentifier = C0002O.m25083C(this.mProviderAuthority, Constants.ACCEPT_TIME_SEPARATOR_SERVER, this.mProviderPackage, Constants.ACCEPT_TIME_SEPARATOR_SERVER, this.mQuery);
    }
}
