package anet.channel;

import anet.channel.session.TnetSpdySession;
import com.bytedance.covode.number.Covode;

/* loaded from: classes20.dex */
public interface DataFrameCb {
    static {
        Covode.recordClassIndex(2130);
    }

    void onDataReceive(TnetSpdySession tnetSpdySession, byte[] bArr, int i, int i2);

    void onException(int i, int i2, boolean z, String str);
}
