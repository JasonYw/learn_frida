package com.alipay.sdk.p082m.p087c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.alipay.sdk.p082m.p085b.AbstractC1226b;
import com.bytedance.covode.number.Covode;
import com.huawei.hms.api.HuaweiApiAvailability;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.c.b */
/* loaded from: classes2.dex */
public class C1235b implements AbstractC1226b {

    /* renamed from: com.alipay.sdk.m.c.b$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C1236a {
        static {
            Covode.recordClassIndex(4736);
        }
    }

    static {
        Covode.recordClassIndex(4735);
    }

    /* renamed from: com.alipay.sdk.m.c.b$c */
    /* loaded from: classes2.dex */
    public static final class C1238c implements IInterface {

        /* renamed from: a */
        public IBinder f22078a;

        static {
            Covode.recordClassIndex(4738);
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f22078a;
        }

        /* renamed from: d */
        public final String m19341d() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                this.f22078a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: e */
        public final boolean m19340e() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                boolean z = false;
                this.f22078a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    z = true;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public C1238c(IBinder iBinder) {
            this.f22078a = iBinder;
        }
    }

    /* renamed from: com.alipay.sdk.m.c.b$b */
    /* loaded from: classes2.dex */
    public static final class ServiceConnectionC1237b implements ServiceConnection {

        /* renamed from: a */
        public boolean f22076a;

        /* renamed from: b */
        public final LinkedBlockingQueue<IBinder> f22077b;

        static {
            Covode.recordClassIndex(4737);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        public ServiceConnectionC1237b() {
            this.f22076a = false;
            this.f22077b = new LinkedBlockingQueue<>();
        }

        /* renamed from: a */
        public final IBinder m19342a() {
            if (!this.f22076a) {
                this.f22076a = true;
                return this.f22077b.poll(5L, TimeUnit.SECONDS);
            }
            throw new IllegalStateException();
        }

        public /* synthetic */ ServiceConnectionC1237b(C1236a c1236a) {
            this();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f22077b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // com.alipay.sdk.p082m.p085b.AbstractC1226b
    /* renamed from: a */
    public String mo19338a(Context context) {
        ServiceConnectionC1237b serviceConnectionC1237b = new ServiceConnectionC1237b(null);
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage(HuaweiApiAvailability.SERVICES_PACKAGE);
        if (C116971W2r.LIZ(context, intent, serviceConnectionC1237b, 1)) {
            try {
                return new C1238c(serviceConnectionC1237b.m19342a()).m19341d();
            } catch (Exception unused) {
            } finally {
                context.unbindService(serviceConnectionC1237b);
            }
        }
        return null;
    }
}
