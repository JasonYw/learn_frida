package anet.channel.security;

import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public interface ISecurityFactory {
    static {
        Covode.recordClassIndex(2243);
    }

    ISecurity createNonSecurity(String str);

    ISecurity createSecurity(String str);
}
