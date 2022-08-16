package anet.channel.p026e;

import android.content.SharedPreferences;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.C0568l;
import anet.channel.strategy.IStrategyListener;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.e.c */
/* loaded from: classes2.dex */
public final class C0497c implements IStrategyListener {
    static {
        Covode.recordClassIndex(2191);
    }

    @Override // anet.channel.strategy.IStrategyListener
    public final void onStrategyUpdated(C0568l.C0572d c0572d) {
        String str;
        String str2;
        if (c0572d != null && c0572d.f20794b != null) {
            for (int i = 0; i < c0572d.f20794b.length; i++) {
                String str3 = c0572d.f20794b[i].f20779a;
                C0568l.C0569a[] c0569aArr = c0572d.f20794b[i].f20786h;
                if (c0569aArr != null && c0569aArr.length > 0) {
                    for (C0568l.C0569a c0569a : c0569aArr) {
                        String str4 = c0569a.f20772b;
                        if ("http3".equals(str4) || "http3plain".equals(str4)) {
                            str = C0493a.f20480b;
                            if (!str3.equals(str)) {
                                String unused = C0493a.f20480b = str3;
                                SharedPreferences.Editor edit = C0493a.f20484f.edit();
                                str2 = C0493a.f20480b;
                                edit.putString("http3_detector_host", str2);
                                edit.apply();
                            }
                            C0493a.m21011a(NetworkStatusHelper.getStatus());
                            return;
                        }
                    }
                    continue;
                }
            }
        }
    }
}
