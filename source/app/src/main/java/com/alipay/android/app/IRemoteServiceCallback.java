package com.alipay.android.app;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* loaded from: classes2.dex */
public interface IRemoteServiceCallback extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class Stub extends Binder implements IRemoteServiceCallback {
        static {
            Covode.recordClassIndex(4605);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.alipay.android.app.IRemoteServiceCallback$Stub$a */
        /* loaded from: classes2.dex */
        public static class C1140a implements IRemoteServiceCallback {

            /* renamed from: a */
            public IBinder f21854a;

            static {
                Covode.recordClassIndex(4606);
            }

            /* renamed from: d */
            public String m19670d() {
                return "com.alipay.android.app.IRemoteServiceCallback";
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21854a;
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public int getVersion() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IRemoteServiceCallback");
                    this.f21854a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public boolean isHideLoadingScreen() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IRemoteServiceCallback");
                    boolean z = false;
                    this.f21854a.transact(3, obtain, obtain2, 0);
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

            public C1140a(IBinder iBinder) {
                this.f21854a = iBinder;
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public void payEnd(boolean z, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IRemoteServiceCallback");
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeString(str);
                    this.f21854a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public void r03(String str, String str2, Map map) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IRemoteServiceCallback");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeMap(map);
                    this.f21854a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public void startActivity(String str, String str2, int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IRemoteServiceCallback");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    if (bundle == null) {
                        obtain.writeInt(0);
                    } else {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    this.f21854a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.alipay.android.app.IRemoteServiceCallback");
        }

        public static IRemoteServiceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.alipay.android.app.IRemoteServiceCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IRemoteServiceCallback)) {
                return (IRemoteServiceCallback) queryLocalInterface;
            }
            return new C1140a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Bundle bundle;
            boolean z;
            if (i != 1598968902) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    return super.onTransact(i, parcel, parcel2, i2);
                                }
                                parcel.enforceInterface("com.alipay.android.app.IRemoteServiceCallback");
                                r03(parcel.readString(), parcel.readString(), parcel.readHashMap(getClass().getClassLoader()));
                                return true;
                            }
                            parcel.enforceInterface("com.alipay.android.app.IRemoteServiceCallback");
                            int version = getVersion();
                            parcel2.writeNoException();
                            parcel2.writeInt(version);
                            return true;
                        }
                        parcel.enforceInterface("com.alipay.android.app.IRemoteServiceCallback");
                        boolean isHideLoadingScreen = isHideLoadingScreen();
                        parcel2.writeNoException();
                        parcel2.writeInt(isHideLoadingScreen ? 1 : 0);
                        return true;
                    }
                    parcel.enforceInterface("com.alipay.android.app.IRemoteServiceCallback");
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    payEnd(z, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                }
                parcel.enforceInterface("com.alipay.android.app.IRemoteServiceCallback");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                startActivity(readString, readString2, readInt, bundle);
                parcel2.writeNoException();
                return true;
            }
            parcel2.writeString("com.alipay.android.app.IRemoteServiceCallback");
            return true;
        }
    }

    static {
        Covode.recordClassIndex(4604);
    }

    int getVersion();

    boolean isHideLoadingScreen();

    void payEnd(boolean z, String str);

    void r03(String str, String str2, Map map);

    void startActivity(String str, String str2, int i, Bundle bundle);
}
