package com.alipay.sdk.p082m.p116q0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.sdk.m.q0.a */
/* loaded from: classes2.dex */
public interface AbstractC1367a extends IInterface {

    /* renamed from: com.alipay.sdk.m.q0.a$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC1368a extends Binder implements AbstractC1367a {

        /* renamed from: f */
        public static final int f22342f = 5;

        /* renamed from: g */
        public static final int f22343g = 6;

        static {
            Covode.recordClassIndex(4868);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.alipay.sdk.m.q0.a$a$a */
        /* loaded from: classes2.dex */
        public static class C1369a implements AbstractC1367a {

            /* renamed from: a */
            public IBinder f22344a;

            static {
                Covode.recordClassIndex(4869);
            }

            /* renamed from: d */
            public String m18965d() {
                return "com.zui.deviceidservice.IDeviceidInterface";
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22344a;
            }

            @Override // com.alipay.sdk.p082m.p116q0.AbstractC1367a
            /* renamed from: a */
            public String mo18971a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    this.f22344a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.sdk.p082m.p116q0.AbstractC1367a
            /* renamed from: b */
            public String mo18969b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    this.f22344a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.sdk.p082m.p116q0.AbstractC1367a
            /* renamed from: c */
            public boolean mo18967c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    boolean z = false;
                    this.f22344a.transact(3, obtain, obtain2, 0);
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

            public C1369a(IBinder iBinder) {
                this.f22344a = iBinder;
            }

            @Override // com.alipay.sdk.p082m.p116q0.AbstractC1367a
            /* renamed from: a */
            public String mo18970a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    obtain.writeString(str);
                    this.f22344a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.sdk.p082m.p116q0.AbstractC1367a
            /* renamed from: b */
            public String mo18968b(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    obtain.writeString(str);
                    this.f22344a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.sdk.p082m.p116q0.AbstractC1367a
            /* renamed from: c */
            public boolean mo18966c(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    obtain.writeString(str);
                    boolean z = false;
                    this.f22344a.transact(6, obtain, obtain2, 0);
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
        }

        public AbstractBinderC1368a() {
            attachInterface(this, "com.zui.deviceidservice.IDeviceidInterface");
        }

        /* renamed from: a */
        public static AbstractC1367a m18972a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.zui.deviceidservice.IDeviceidInterface");
            if (queryLocalInterface != null && (queryLocalInterface instanceof AbstractC1367a)) {
                return (AbstractC1367a) queryLocalInterface;
            }
            return new C1369a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                        String mo18971a = mo18971a();
                        parcel2.writeNoException();
                        parcel2.writeString(mo18971a);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                        String mo18969b = mo18969b();
                        parcel2.writeNoException();
                        parcel2.writeString(mo18969b);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                        boolean mo18967c = mo18967c();
                        parcel2.writeNoException();
                        parcel2.writeInt(mo18967c ? 1 : 0);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                        String mo18968b = mo18968b(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(mo18968b);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                        String mo18970a = mo18970a(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(mo18970a);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                        boolean mo18966c = mo18966c(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(mo18966c ? 1 : 0);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.zui.deviceidservice.IDeviceidInterface");
            return true;
        }
    }

    static {
        Covode.recordClassIndex(4867);
    }

    /* renamed from: a */
    String mo18971a();

    /* renamed from: a */
    String mo18970a(String str);

    /* renamed from: b */
    String mo18969b();

    /* renamed from: b */
    String mo18968b(String str);

    /* renamed from: c */
    boolean mo18967c();

    /* renamed from: c */
    boolean mo18966c(String str);
}
