package com.alipay.android.app;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.alipay.android.app.IRemoteServiceCallback;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* loaded from: classes2.dex */
public interface IAlixPay extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class Stub extends Binder implements IAlixPay {
        static {
            Covode.recordClassIndex(4602);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.alipay.android.app.IAlixPay$Stub$a */
        /* loaded from: classes2.dex */
        public static class C1139a implements IAlixPay {

            /* renamed from: a */
            public IBinder f21853a;

            static {
                Covode.recordClassIndex(4603);
            }

            /* renamed from: d */
            public String m19671d() {
                return "com.alipay.android.app.IAlixPay";
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21853a;
            }

            @Override // com.alipay.android.app.IAlixPay
            public void deployFastConnect() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    this.f21853a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IAlixPay
            public int getVersion() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    this.f21853a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IAlixPay
            public String test() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    this.f21853a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C1139a(IBinder iBinder) {
                this.f21853a = iBinder;
            }

            @Override // com.alipay.android.app.IAlixPay
            public String Pay(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    obtain.writeString(str);
                    this.f21853a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IAlixPay
            public boolean manager(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    obtain.writeString(str);
                    boolean z = false;
                    this.f21853a.transact(7, obtain, obtain2, 0);
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

            @Override // com.alipay.android.app.IAlixPay
            public String prePay(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    obtain.writeString(str);
                    this.f21853a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IAlixPay
            public void registerCallback(IRemoteServiceCallback iRemoteServiceCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    if (iRemoteServiceCallback == null) {
                        iBinder = null;
                    } else {
                        iBinder = iRemoteServiceCallback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f21853a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IAlixPay
            public void unregisterCallback(IRemoteServiceCallback iRemoteServiceCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    if (iRemoteServiceCallback == null) {
                        iBinder = null;
                    } else {
                        iBinder = iRemoteServiceCallback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f21853a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IAlixPay
            public String pay02(String str, Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    obtain.writeString(str);
                    obtain.writeMap(map);
                    this.f21853a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IAlixPay
            public void r03(String str, String str2, Map map) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeMap(map);
                    this.f21853a.transact(10, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IAlixPay
            public void registerCallback03(IRemoteServiceCallback iRemoteServiceCallback, String str, Map map) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    if (iRemoteServiceCallback == null) {
                        iBinder = null;
                    } else {
                        iBinder = iRemoteServiceCallback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    obtain.writeMap(map);
                    this.f21853a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.alipay.android.app.IAlixPay");
        }

        public static IAlixPay asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.alipay.android.app.IAlixPay");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IAlixPay)) {
                return (IAlixPay) queryLocalInterface;
            }
            return new C1139a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        String Pay = Pay(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(Pay);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        String test = test();
                        parcel2.writeNoException();
                        parcel2.writeString(test);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        registerCallback(IRemoteServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        unregisterCallback(IRemoteServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        String prePay = prePay(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(prePay);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        deployFastConnect();
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        boolean manager = manager(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(manager ? 1 : 0);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        int version = getVersion();
                        parcel2.writeNoException();
                        parcel2.writeInt(version);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        String pay02 = pay02(parcel.readString(), parcel.readHashMap(Stub.class.getClassLoader()));
                        parcel2.writeNoException();
                        parcel2.writeString(pay02);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        r03(parcel.readString(), parcel.readString(), parcel.readHashMap(Stub.class.getClassLoader()));
                        return true;
                    case 11:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        registerCallback03(IRemoteServiceCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readHashMap(Stub.class.getClassLoader()));
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.alipay.android.app.IAlixPay");
            return true;
        }
    }

    static {
        Covode.recordClassIndex(4601);
    }

    String Pay(String str);

    void deployFastConnect();

    int getVersion();

    boolean manager(String str);

    String pay02(String str, Map map);

    String prePay(String str);

    void r03(String str, String str2, Map map);

    void registerCallback(IRemoteServiceCallback iRemoteServiceCallback);

    void registerCallback03(IRemoteServiceCallback iRemoteServiceCallback, String str, Map map);

    String test();

    void unregisterCallback(IRemoteServiceCallback iRemoteServiceCallback);
}
