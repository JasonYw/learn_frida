package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes26.dex */
public final class LocalBroadcastManager {
    public static LocalBroadcastManager mInstance;
    public static final Object mLock;
    public final Context mAppContext;
    public final Handler mHandler;
    public final HashMap<BroadcastReceiver, ArrayList<C0334b>> mReceivers = new HashMap<>();
    public final HashMap<String, ArrayList<C0334b>> mActions = new HashMap<>();
    public final ArrayList<C0333a> mPendingBroadcasts = new ArrayList<>();

    private static void clinit$r$fake() {
        Covode.recordClassIndex(1445);
        mLock = new Object();
    }

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(1445);
        mLock = new Object();
    }

    /* renamed from: androidx.localbroadcastmanager.content.LocalBroadcastManager$b */
    /* loaded from: classes26.dex */
    public static final class C0334b {
        public final IntentFilter LIZ;
        public final BroadcastReceiver LIZIZ;
        public boolean LIZJ;
        public boolean LIZLLL;

        static {
            if (ReDexClinitStringAb.abTest >= 5) {
                Covode.recordClassIndex(1448);
            } else {
                Covode.recordClassIndex(1448);
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.LIZIZ);
            sb.append(" filter=");
            sb.append(this.LIZ);
            if (this.LIZLLL) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }

        public C0334b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.LIZ = intentFilter;
            this.LIZIZ = broadcastReceiver;
        }
    }

    public final void executePendingBroadcasts() {
        C0333a[] c0333aArr;
        while (true) {
            synchronized (this.mReceivers) {
                int size = this.mPendingBroadcasts.size();
                if (size > 0) {
                    c0333aArr = new C0333a[size];
                    this.mPendingBroadcasts.toArray(c0333aArr);
                    this.mPendingBroadcasts.clear();
                } else {
                    return;
                }
            }
            for (C0333a c0333a : c0333aArr) {
                int size2 = c0333a.LIZIZ.size();
                for (int i = 0; i < size2; i++) {
                    C0334b c0334b = c0333a.LIZIZ.get(i);
                    if (!c0334b.LIZLLL) {
                        c0334b.LIZIZ.onReceive(this.mAppContext, c0333a.LIZ);
                    }
                }
            }
        }
    }

    public final void sendBroadcastSync(Intent intent) {
        if (sendBroadcast(intent)) {
            executePendingBroadcasts();
        }
    }

    public static LocalBroadcastManager getInstance(Context context) {
        LocalBroadcastManager localBroadcastManager;
        synchronized (mLock) {
            if (mInstance == null) {
                mInstance = new LocalBroadcastManager(context.getApplicationContext());
            }
            localBroadcastManager = mInstance;
        }
        return localBroadcastManager;
    }

    public LocalBroadcastManager(Context context) {
        this.mAppContext = context;
        this.mHandler = new Handler(context.getMainLooper()) { // from class: androidx.localbroadcastmanager.content.LocalBroadcastManager.1
            static {
                if (ReDexClinitStringAb.abTest >= 5) {
                    Covode.recordClassIndex(1446);
                } else {
                    Covode.recordClassIndex(1446);
                }
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    LocalBroadcastManager.this.executePendingBroadcasts();
                }
            }
        };
    }

    public final void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        synchronized (this.mReceivers) {
            ArrayList<C0334b> remove = this.mReceivers.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                C0334b c0334b = remove.get(size);
                c0334b.LIZLLL = true;
                for (int i = 0; i < c0334b.LIZ.countActions(); i++) {
                    String action = c0334b.LIZ.getAction(i);
                    ArrayList<C0334b> arrayList = this.mActions.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            C0334b c0334b2 = arrayList.get(size2);
                            if (c0334b2.LIZIZ == broadcastReceiver) {
                                c0334b2.LIZLLL = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.mActions.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final boolean sendBroadcast(Intent intent) {
        String str;
        String str2;
        synchronized (this.mReceivers) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.mAppContext.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            int flags = intent.getFlags() & 8;
            ArrayList<C0334b> arrayList = this.mActions.get(intent.getAction());
            if (arrayList != null) {
                ArrayList arrayList2 = null;
                int i = 0;
                while (i < arrayList.size()) {
                    C0334b c0334b = arrayList.get(i);
                    if (!c0334b.LIZJ) {
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        if (c0334b.LIZ.match(str, str2, scheme, data, categories, "LocalBroadcastManager") >= 0) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(c0334b);
                            c0334b.LIZJ = true;
                        }
                    } else {
                        str = action;
                        str2 = resolveTypeIfNeeded;
                    }
                    i++;
                    action = str;
                    resolveTypeIfNeeded = str2;
                }
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        ((C0334b) arrayList2.get(i2)).LIZJ = false;
                    }
                    this.mPendingBroadcasts.add(new C0333a(intent, arrayList2));
                    if (!this.mHandler.hasMessages(1)) {
                        this.mHandler.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: androidx.localbroadcastmanager.content.LocalBroadcastManager$a */
    /* loaded from: classes26.dex */
    public static final class C0333a {
        public final Intent LIZ;
        public final ArrayList<C0334b> LIZIZ;

        static {
            Covode.recordClassIndex(1447);
        }

        public C0333a(Intent intent, ArrayList<C0334b> arrayList) {
            this.LIZ = intent;
            this.LIZIZ = arrayList;
        }
    }

    public final void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.mReceivers) {
            C0334b c0334b = new C0334b(intentFilter, broadcastReceiver);
            ArrayList<C0334b> arrayList = this.mReceivers.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.mReceivers.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c0334b);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<C0334b> arrayList2 = this.mActions.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.mActions.put(action, arrayList2);
                }
                arrayList2.add(c0334b);
            }
        }
    }
}
