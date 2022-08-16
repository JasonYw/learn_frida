package com.alipay.sdk.p082m.p087c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.alipay.sdk.p082m.p085b.AbstractC1226b;
import com.alipay.sdk.p082m.p104k0.AbstractC1310a;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.c.g */
/* loaded from: classes2.dex */
public class C1243g implements AbstractC1226b {

    /* renamed from: com.alipay.sdk.m.c.g$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C1244a {
        static {
            Covode.recordClassIndex(4744);
        }
    }

    static {
        Covode.recordClassIndex(4743);
    }

    /* renamed from: com.alipay.sdk.m.c.g$b */
    /* loaded from: classes2.dex */
    public static final class ServiceConnectionC1245b implements ServiceConnection {

        /* renamed from: a */
        public boolean f22083a;

        /* renamed from: b */
        public final LinkedBlockingQueue<IBinder> f22084b;

        static {
            Covode.recordClassIndex(4745);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        public ServiceConnectionC1245b() {
            this.f22083a = false;
            this.f22084b = new LinkedBlockingQueue<>();
        }

        /* renamed from: a */
        public final IBinder m19339a() {
            if (!this.f22083a) {
                this.f22083a = true;
                return this.f22084b.poll(5L, TimeUnit.SECONDS);
            }
            throw new IllegalStateException();
        }

        public /* synthetic */ ServiceConnectionC1245b(C1244a c1244a) {
            this();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f22084b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // com.alipay.sdk.p082m.p085b.AbstractC1226b
    /* renamed from: a */
    public String mo19338a(Context context) {
        ServiceConnectionC1245b serviceConnectionC1245b = new ServiceConnectionC1245b(null);
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        if (C116971W2r.LIZ(context, intent, serviceConnectionC1245b, 1)) {
            try {
                return AbstractC1310a.AbstractBinderC1311a.m19175a(serviceConnectionC1245b.m19339a()).mo19174a();
            } catch (Exception unused) {
            } finally {
                context.unbindService(serviceConnectionC1245b);
            }
        }
        return null;
    }
}
