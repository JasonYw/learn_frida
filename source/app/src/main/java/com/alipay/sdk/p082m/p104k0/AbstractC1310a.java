package com.alipay.sdk.p082m.p104k0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.sdk.m.k0.a */
/* loaded from: classes2.dex */
public interface AbstractC1310a extends IInterface {

    /* renamed from: com.alipay.sdk.m.k0.a$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC1311a extends Binder implements AbstractC1310a {
        static {
            Covode.recordClassIndex(4811);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.alipay.sdk.m.k0.a$a$a */
        /* loaded from: classes2.dex */
        public static class C1312a implements AbstractC1310a {

            /* renamed from: a */
            public IBinder f22200a;

            static {
                Covode.recordClassIndex(4812);
            }

            /* renamed from: d */
            public String m19171d() {
                return "com.samsung.android.deviceidservice.IDeviceIdService";
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22200a;
            }

            @Override // com.alipay.sdk.p082m.p104k0.AbstractC1310a
            /* renamed from: a */
            public String mo19174a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    this.f22200a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C1312a(IBinder iBinder) {
                this.f22200a = iBinder;
            }

            @Override // com.alipay.sdk.p082m.p104k0.AbstractC1310a
            /* renamed from: b */
            public String mo19172b(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    obtain.writeString(str);
                    this.f22200a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.sdk.p082m.p104k0.AbstractC1310a
            /* renamed from: a */
            public String mo19173a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    obtain.writeString(str);
                    this.f22200a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC1311a() {
            attachInterface(this, "com.samsung.android.deviceidservice.IDeviceIdService");
        }

        /* renamed from: a */
        public static AbstractC1310a m19175a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.samsung.android.deviceidservice.IDeviceIdService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof AbstractC1310a)) {
                return (AbstractC1310a) queryLocalInterface;
            }
            return new C1312a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 1598968902) {
                            return super.onTransact(i, parcel, parcel2, i2);
                        }
                        parcel2.writeString("com.samsung.android.deviceidservice.IDeviceIdService");
                        return true;
                    }
                    parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
                    String mo19173a = mo19173a(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(mo19173a);
                    return true;
                }
                parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
                String mo19172b = mo19172b(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(mo19172b);
                return true;
            }
            parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
            String mo19174a = mo19174a();
            parcel2.writeNoException();
            parcel2.writeString(mo19174a);
            return true;
        }
    }

    static {
        Covode.recordClassIndex(4810);
    }

    /* renamed from: a */
    String mo19174a();

    /* renamed from: a */
    String mo19173a(String str);

    /* renamed from: b */
    String mo19172b(String str);
}
