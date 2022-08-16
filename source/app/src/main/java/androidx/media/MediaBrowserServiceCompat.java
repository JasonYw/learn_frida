package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.p007v4.media.MediaBrowserCompat;
import android.support.p007v4.media.session.MediaSessionCompat;
import android.support.p007v4.p008os.ResultReceiver;
import android.util.Log;
import android.util.Pair;
import androidx.collection.ArrayMap;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.compliance.business.ComplianceBusinessServiceImpl;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p002O.C0002O;
import p003X.AbstractC144079eQj;
import p003X.AbstractC144112eRG;
import p003X.C116971W2r;
import p003X.C140181dPd;
import p003X.C140192dPo;
import p003X.C144090eQu;
import p003X.C144091eQv;
import p003X.C144097eR1;
import p003X.C144117eRL;
import p003X.C144118eRM;
import p003X.C144153eRv;
import p003X.HandlerC144105eR9;
import p003X.RunnableC144114eRI;

/* loaded from: classes19.dex */
public abstract class MediaBrowserServiceCompat extends Service {
    public static final boolean DEBUG = Log.isLoggable("MBServiceCompat", 3);
    public C0339a mCurConnection;
    public AbstractC144112eRG mImpl;
    public MediaSessionCompat.Token mSession;
    public final ArrayMap<IBinder, C0339a> mConnections = new ArrayMap<>();
    public final HandlerC144105eR9 mHandler = new HandlerC144105eR9(this);

    /* renamed from: androidx_media_MediaBrowserServiceCompat_android_content_pm_PackageManager_getPackagesForUid */
    public static String[] m21134xd9e76261(PackageManager packageManager, int i) {
        ActionInvokeEntrance.setEventUuid(101310);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(packageManager, new Object[]{Integer.valueOf(i)}, 101310, "java.lang.String[]", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String[]) actionIntercept.second;
        }
        String[] LIZJ = C116971W2r.LIZJ(packageManager, i);
        ActionInvokeEntrance.actionInvoke(LIZJ, packageManager, new Object[]{Integer.valueOf(i)}, 101310, "androidx_media_MediaBrowserServiceCompat_android_content_pm_PackageManager_getPackagesForUid(Landroid/content/pm/PackageManager;I)[Ljava/lang/String;");
        return LIZJ;
    }

    /* renamed from: androidx_media_MediaBrowserServiceCompat__attachBaseContext$___twin___ */
    public void m21136x112bd845(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: androidx_media_MediaBrowserServiceCompat__onStartCommand$___twin___ */
    public int m21135xdd3f76f2(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        m21133x2069d505(this, context);
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract BrowserRoot onGetRoot(String str, int i, Bundle bundle);

    public abstract void onLoadChildren(String str, Result<List<MediaBrowserCompat.MediaItem>> result);

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return m21132x744a5f52(this, intent, i, i2);
    }

    public void onSubscribe(String str, Bundle bundle) {
    }

    public void onUnsubscribe(String str) {
    }

    /* loaded from: classes19.dex */
    public static final class BrowserRoot {
        public static final String EXTRA_SUGGESTION_KEYWORDS = "android.service.media.extra.SUGGESTION_KEYWORDS";
        public final Bundle mExtras;
        public final String mRootId;

        static {
            Covode.recordClassIndex(1458);
        }

        public final Bundle getExtras() {
            return this.mExtras;
        }

        public final String getRootId() {
            return this.mRootId;
        }

        public BrowserRoot(String str, Bundle bundle) {
            if (str != null) {
                this.mRootId = str;
                this.mExtras = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.");
        }
    }

    /* loaded from: classes19.dex */
    public static class Result<T> {
        public final Object mDebug;
        public boolean mDetachCalled;
        public int mFlags;
        public boolean mSendErrorCalled;
        public boolean mSendProgressUpdateCalled;
        public boolean mSendResultCalled;

        static {
            Covode.recordClassIndex(1459);
        }

        public void onResultSent(T t) {
        }

        public int getFlags() {
            return this.mFlags;
        }

        public boolean isDone() {
            if (!this.mDetachCalled && !this.mSendResultCalled && !this.mSendErrorCalled) {
                return false;
            }
            return true;
        }

        public void detach() {
            if (!this.mDetachCalled) {
                if (!this.mSendResultCalled) {
                    if (!this.mSendErrorCalled) {
                        this.mDetachCalled = true;
                        return;
                    }
                    throw new IllegalStateException("detach() called when sendError() had already been called for: " + this.mDebug);
                }
                throw new IllegalStateException("detach() called when sendResult() had already been called for: " + this.mDebug);
            }
            throw new IllegalStateException("detach() called when detach() had already been called for: " + this.mDebug);
        }

        public void setFlags(int i) {
            this.mFlags = i;
        }

        public Result(Object obj) {
            this.mDebug = obj;
        }

        public void onErrorSent(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.mDebug);
        }

        public void onProgressUpdateSent(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an interim update for " + this.mDebug);
        }

        private void checkExtraFields(Bundle bundle) {
            if (bundle != null && bundle.containsKey("android.media.browse.extra.DOWNLOAD_PROGRESS")) {
                float f = bundle.getFloat("android.media.browse.extra.DOWNLOAD_PROGRESS");
                if (f >= -1.0E-5f && f <= 1.00001f) {
                    return;
                }
                throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].");
            }
        }

        public void sendError(Bundle bundle) {
            if (!this.mSendResultCalled && !this.mSendErrorCalled) {
                this.mSendErrorCalled = true;
                onErrorSent(bundle);
                return;
            }
            throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.mDebug);
        }

        public void sendProgressUpdate(Bundle bundle) {
            if (!this.mSendResultCalled && !this.mSendErrorCalled) {
                checkExtraFields(bundle);
                this.mSendProgressUpdateCalled = true;
                onProgressUpdateSent(bundle);
                return;
            }
            throw new IllegalStateException("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: " + this.mDebug);
        }

        public void sendResult(T t) {
            if (!this.mSendResultCalled && !this.mSendErrorCalled) {
                this.mSendResultCalled = true;
                onResultSent(t);
                return;
            }
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.mDebug);
        }
    }

    public MediaSessionCompat.Token getSessionToken() {
        return this.mSession;
    }

    public final Bundle getBrowserRootHints() {
        return this.mImpl.LIZIZ();
    }

    public final C144153eRv getCurrentBrowserInfo() {
        return this.mImpl.LIZJ();
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$a */
    /* loaded from: classes19.dex */
    public class C0339a implements IBinder.DeathRecipient {
        public final String LIZ;
        public final C144153eRv LIZIZ;
        public final Bundle LIZJ;
        public final AbstractC144079eQj LIZLLL;

        /* renamed from: LJ */
        public final HashMap<String, List<androidx.core.util.Pair<IBinder, Bundle>>> f20268LJ = new HashMap<>();
        public BrowserRoot LJFF;

        static {
            Covode.recordClassIndex(1460);
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            MediaBrowserServiceCompat.this.mHandler.post(new RunnableC144114eRI(this));
        }

        public C0339a(String str, int i, int i2, Bundle bundle, AbstractC144079eQj abstractC144079eQj) {
            this.LIZ = str;
            this.LIZIZ = new C144153eRv(str, i, i2);
            this.LIZJ = bundle;
            this.LIZLLL = abstractC144079eQj;
        }
    }

    static {
        Covode.recordClassIndex(1453);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 28) {
            this.mImpl = new C144117eRL(this);
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.mImpl = new C144090eQu(this);
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.mImpl = new C144091eQv(this);
        } else {
            int i = Build.VERSION.SDK_INT;
            this.mImpl = new C144097eR1(this);
        }
        this.mImpl.LIZ();
    }

    public void attachToBaseContext(Context context) {
        attachBaseContext(context);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mImpl.LIZ(intent);
    }

    public void notifyChildrenChanged(String str) {
        if (str != null) {
            this.mImpl.LIZ(str, null);
            return;
        }
        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }

    public void setSessionToken(MediaSessionCompat.Token token) {
        if (token != null) {
            if (this.mSession == null) {
                this.mSession = token;
                this.mImpl.LIZ(token);
                return;
            }
            throw new IllegalStateException("The session token has already been set.");
        }
        throw new IllegalArgumentException("Session token may not be null.");
    }

    public void onLoadItem(String str, Result<MediaBrowserCompat.MediaItem> result) {
        result.setFlags(2);
        result.sendResult(null);
    }

    /* renamed from: androidx_media_MediaBrowserServiceCompat_com_ss_android_ugc_aweme_lancet_JatoBoostLancet_serviceAttachBaseContext */
    public static void m21133x2069d505(MediaBrowserServiceCompat mediaBrowserServiceCompat, Context context) {
        if (!AppMonitor.INSTANCE.isAppBackground() && C140192dPo.LIZ("serviceAttachBaseContext")) {
            C140181dPd.LIZLLL();
        }
        mediaBrowserServiceCompat.m21136x112bd845(context);
    }

    public boolean isValidPackage(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : m21134xd9e76261(getPackageManager(), i)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public List<MediaBrowserCompat.MediaItem> applyOptions(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i == -1) {
            if (i2 == -1) {
                return list;
            }
        } else {
            int i3 = i2 * i;
            int i4 = i3 + i2;
            if (i >= 0 && i2 > 0 && i3 < list.size()) {
                if (i4 > list.size()) {
                    i4 = list.size();
                }
                return list.subList(i3, i4);
            }
        }
        return Collections.emptyList();
    }

    public void notifyChildrenChanged(String str, Bundle bundle) {
        if (str != null) {
            if (bundle != null) {
                this.mImpl.LIZ(str, bundle);
                return;
            }
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }

    public void onCustomAction(String str, Bundle bundle, Result<Bundle> result) {
        result.sendError(null);
    }

    public void onLoadChildren(String str, Result<List<MediaBrowserCompat.MediaItem>> result, Bundle bundle) {
        result.setFlags(1);
        onLoadChildren(str, result);
    }

    public void onSearch(String str, Bundle bundle, Result<List<MediaBrowserCompat.MediaItem>> result) {
        result.setFlags(4);
        result.sendResult(null);
    }

    public void performLoadItem(String str, C0339a c0339a, final ResultReceiver resultReceiver) {
        Result<MediaBrowserCompat.MediaItem> result = new Result<MediaBrowserCompat.MediaItem>(this, str) { // from class: androidx.media.MediaBrowserServiceCompat.2
            static {
                Covode.recordClassIndex(1455);
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public final /* synthetic */ void onResultSent(MediaBrowserCompat.MediaItem mediaItem) {
                MediaBrowserCompat.MediaItem mediaItem2 = mediaItem;
                if ((getFlags() & 2) != 0) {
                    resultReceiver.LIZIZ(-1, null);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", mediaItem2);
                resultReceiver.LIZIZ(0, bundle);
            }
        };
        this.mCurConnection = c0339a;
        onLoadItem(str, result);
        this.mCurConnection = null;
        if (result.isDone()) {
            return;
        }
        throw new IllegalStateException(C0002O.m25086C("onLoadItem must call detach() or sendResult() before returning for id=", str));
    }

    public void notifyChildrenChanged(C144153eRv c144153eRv, String str, Bundle bundle) {
        if (c144153eRv != null) {
            if (str != null) {
                if (bundle != null) {
                    this.mImpl.LIZ(c144153eRv, str, bundle);
                    return;
                }
                throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
            }
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
    }

    public boolean removeSubscription(String str, C0339a c0339a, IBinder iBinder) {
        boolean z = true;
        boolean z2 = false;
        try {
            if (iBinder == null) {
                if (c0339a.f20268LJ.remove(str) == null) {
                    z = false;
                }
                return z;
            }
            List<androidx.core.util.Pair<IBinder, Bundle>> list = c0339a.f20268LJ.get(str);
            if (list != null) {
                Iterator<androidx.core.util.Pair<IBinder, Bundle>> it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == it.next().first) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    c0339a.f20268LJ.remove(str);
                }
            }
            return z2;
        } finally {
            this.mCurConnection = c0339a;
            onUnsubscribe(str);
            this.mCurConnection = null;
        }
    }

    public void performSearch(String str, Bundle bundle, C0339a c0339a, final ResultReceiver resultReceiver) {
        Result<List<MediaBrowserCompat.MediaItem>> result = new Result<List<MediaBrowserCompat.MediaItem>>(this, str) { // from class: androidx.media.MediaBrowserServiceCompat.3
            static {
                Covode.recordClassIndex(1456);
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public final /* synthetic */ void onResultSent(List<MediaBrowserCompat.MediaItem> list) {
                List<MediaBrowserCompat.MediaItem> list2 = list;
                if ((getFlags() & 4) == 0 && list2 != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelableArray("search_results", (Parcelable[]) list2.toArray(new MediaBrowserCompat.MediaItem[0]));
                    resultReceiver.LIZIZ(0, bundle2);
                    return;
                }
                resultReceiver.LIZIZ(-1, null);
            }
        };
        this.mCurConnection = c0339a;
        onSearch(str, bundle, result);
        this.mCurConnection = null;
        if (result.isDone()) {
            return;
        }
        throw new IllegalStateException(C0002O.m25086C("onSearch must call detach() or sendResult() before returning for query=", str));
    }

    /* renamed from: androidx_media_MediaBrowserServiceCompat_com_ss_android_ugc_aweme_lancet_KeepAliveLancet_onStartCommand */
    public static int m21132x744a5f52(MediaBrowserServiceCompat mediaBrowserServiceCompat, Intent intent, int i, int i2) {
        int m21135xdd3f76f2 = mediaBrowserServiceCompat.m21135xdd3f76f2(intent, i, i2);
        new StringBuilder();
        ALog.m8953i("KeepAliveLancet", C0002O.m25086C(mediaBrowserServiceCompat.getClass().getName(), "： hook Service.onStartCommand"));
        if (ComplianceBusinessServiceImpl.LIZ(false).isNeedHookService(mediaBrowserServiceCompat.getClass().getName())) {
            ALog.m8953i("KeepAliveLancet", "return START_NOT_STICKY");
            return 2;
        }
        return m21135xdd3f76f2;
    }

    public void performCustomAction(String str, Bundle bundle, C0339a c0339a, final ResultReceiver resultReceiver) {
        Result<Bundle> result = new Result<Bundle>(this, str) { // from class: androidx.media.MediaBrowserServiceCompat.4
            static {
                Covode.recordClassIndex(1457);
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public final void onErrorSent(Bundle bundle2) {
                resultReceiver.LIZIZ(-1, bundle2);
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public final void onProgressUpdateSent(Bundle bundle2) {
                resultReceiver.LIZIZ(1, bundle2);
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public final /* synthetic */ void onResultSent(Bundle bundle2) {
                resultReceiver.LIZIZ(0, bundle2);
            }
        };
        this.mCurConnection = c0339a;
        onCustomAction(str, bundle, result);
        this.mCurConnection = null;
        if (result.isDone()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }

    public void performLoadChildren(final String str, final C0339a c0339a, final Bundle bundle, final Bundle bundle2) {
        Result<List<MediaBrowserCompat.MediaItem>> result = new Result<List<MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media.MediaBrowserServiceCompat.1
            static {
                Covode.recordClassIndex(1454);
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public final /* synthetic */ void onResultSent(List<MediaBrowserCompat.MediaItem> list) {
                List<MediaBrowserCompat.MediaItem> list2 = list;
                if (MediaBrowserServiceCompat.this.mConnections.get(c0339a.LIZLLL.LIZ()) == c0339a) {
                    if ((getFlags() & 1) != 0) {
                        list2 = MediaBrowserServiceCompat.this.applyOptions(list2, bundle);
                    }
                    try {
                        c0339a.LIZLLL.LIZ(str, list2, bundle, bundle2);
                    } catch (RemoteException unused) {
                    }
                }
            }
        };
        this.mCurConnection = c0339a;
        if (bundle == null) {
            onLoadChildren(str, result);
        } else {
            onLoadChildren(str, result, bundle);
        }
        this.mCurConnection = null;
        if (result.isDone()) {
            return;
        }
        throw new IllegalStateException(C0002O.m25084C("onLoadChildren must call detach() or sendResult() before returning for package=", c0339a.LIZ, " id=", str));
    }

    public void addSubscription(String str, C0339a c0339a, IBinder iBinder, Bundle bundle) {
        List<androidx.core.util.Pair<IBinder, Bundle>> list = c0339a.f20268LJ.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (androidx.core.util.Pair<IBinder, Bundle> pair : list) {
            if (iBinder == pair.first && C144118eRM.LIZ(bundle, pair.second)) {
                return;
            }
        }
        list.add(new androidx.core.util.Pair<>(iBinder, bundle));
        c0339a.f20268LJ.put(str, list);
        performLoadChildren(str, c0339a, bundle, null);
        this.mCurConnection = c0339a;
        onSubscribe(str, bundle);
        this.mCurConnection = null;
    }
}
