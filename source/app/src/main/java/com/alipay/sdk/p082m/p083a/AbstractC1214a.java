package com.alipay.sdk.p082m.p083a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bridge.p1355js.delegate.JsBridgeDelegate;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.a.a */
/* loaded from: classes2.dex */
public interface AbstractC1214a extends IInterface {

    /* renamed from: com.alipay.sdk.m.a.a$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC1215a extends Binder implements AbstractC1214a {
        static {
            Covode.recordClassIndex(4715);
        }

        /* renamed from: com.alipay.sdk.m.a.a$a$a */
        /* loaded from: classes2.dex */
        public static class C1216a implements AbstractC1214a {

            /* renamed from: a */
            public IBinder f22052a;

            static {
                Covode.recordClassIndex(4716);
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22052a;
            }

            public C1216a(IBinder iBinder) {
                this.f22052a = iBinder;
            }

            /* renamed from: a */
            public String m19428a(String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f22052a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC1214a m19429a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            if (queryLocalInterface != null && (queryLocalInterface instanceof AbstractC1214a)) {
                return (AbstractC1214a) queryLocalInterface;
            }
            return new C1216a(iBinder);
        }
    }

    /* renamed from: com.alipay.sdk.m.a.a$b */
    /* loaded from: classes2.dex */
    public class C1217b {

        /* renamed from: a */
        public static boolean f22053a;

        /* renamed from: b */
        public static boolean f22054b;

        static {
            Covode.recordClassIndex(4717);
        }
    }

    static {
        Covode.recordClassIndex(4714);
    }

    /* renamed from: com.alipay.sdk.m.a.a$c */
    /* loaded from: classes2.dex */
    public class C1218c {

        /* renamed from: a */
        public AbstractC1214a f22055a = null;

        /* renamed from: b */
        public String f22056b = null;

        /* renamed from: c */
        public String f22057c = null;

        /* renamed from: d */
        public final Object f22058d = new Object();

        /* renamed from: e */
        public ServiceConnection f22059e = new ServiceConnectionC1219a();

        static {
            Covode.recordClassIndex(4718);
        }

        /* renamed from: com.alipay.sdk.m.a.a$c$b */
        /* loaded from: classes2.dex */
        public static class C1220b {

            /* renamed from: a */
            public static final C1218c f22061a = new C1218c(null);

            static {
                Covode.recordClassIndex(4720);
            }
        }

        /* renamed from: com.alipay.sdk.m.a.a$c$a */
        /* loaded from: classes2.dex */
        public class ServiceConnectionC1219a implements ServiceConnection {
            static {
                Covode.recordClassIndex(4719);
            }

            public ServiceConnectionC1219a() {
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                C1218c.this.f22055a = null;
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                C1218c.this.f22055a = AbstractBinderC1215a.m19429a(iBinder);
                synchronized (C1218c.this.f22058d) {
                    C1218c.this.f22058d.notify();
                }
            }
        }

        public /* synthetic */ C1218c(ServiceConnectionC1219a serviceConnectionC1219a) {
        }

        /* renamed from: a */
        public boolean m19427a(Context context) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
                if (Build.VERSION.SDK_INT >= 28) {
                    if (packageInfo == null || packageInfo.getLongVersionCode() < 1) {
                        return false;
                    }
                    return true;
                } else if (packageInfo == null || packageInfo.versionCode <= 0) {
                    return false;
                } else {
                    return true;
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: a */
        public synchronized String m19426a(Context context, String str) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                if (this.f22055a == null) {
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
                    intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
                    if (C116971W2r.LIZ(context, intent, this.f22059e, 1)) {
                        synchronized (this.f22058d) {
                            try {
                                this.f22058d.wait(JsBridgeDelegate.GET_URL_OUT_TIME);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    if (this.f22055a == null) {
                        return "";
                    }
                    try {
                        return m19425b(context, str);
                    } catch (RemoteException e2) {
                        e2.printStackTrace();
                        return "";
                    }
                }
                try {
                    return m19425b(context, str);
                } catch (RemoteException e3) {
                    e3.printStackTrace();
                    return "";
                }
            }
            throw new IllegalStateException("Cannot run on MainThread");
        }

        /* renamed from: b */
        public final String m19425b(Context context, String str) {
            Signature[] signatureArr;
            if (TextUtils.isEmpty(this.f22056b)) {
                this.f22056b = context.getPackageName();
            }
            if (TextUtils.isEmpty(this.f22057c)) {
                String str2 = null;
                try {
                    signatureArr = context.getPackageManager().getPackageInfo(this.f22056b, 64).signatures;
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                    signatureArr = null;
                }
                if (signatureArr != null && signatureArr.length > 0) {
                    byte[] byteArray = signatureArr[0].toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                        if (messageDigest != null) {
                            byte[] digest = messageDigest.digest(byteArray);
                            StringBuilder sb = new StringBuilder();
                            for (byte b : digest) {
                                sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
                            }
                            str2 = sb.toString();
                        }
                    } catch (NoSuchAlgorithmException e2) {
                        e2.printStackTrace();
                    }
                }
                this.f22057c = str2;
            }
            String m19428a = ((AbstractBinderC1215a.C1216a) this.f22055a).m19428a(this.f22056b, this.f22057c, str);
            if (TextUtils.isEmpty(m19428a)) {
                return "";
            }
            return m19428a;
        }
    }
}
