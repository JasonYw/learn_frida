package androidx.core.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.compliance.business.ComplianceBusinessServiceImpl;
import java.util.ArrayList;
import java.util.HashMap;
import p002O.C0002O;
import p003X.AbstractC143718eKu;
import p003X.AbstractC143719eKv;
import p003X.AsyncTaskC143716eKs;
import p003X.C123241Yex;
import p003X.C140181dPd;
import p003X.C140192dPo;
import p003X.C143702eKe;
import p003X.job.JobServiceEngineC143715eKr;

/* loaded from: classes18.dex */
public abstract class JobIntentService extends Service {
    public static final Object LJI = new Object();
    public static final HashMap<ComponentName, AbstractC0238h> LJII = new HashMap<>();
    public AbstractC143718eKu LIZ;
    public AbstractC0238h LIZIZ;
    public AsyncTaskC143716eKs LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public boolean f20242LJ;
    public final ArrayList<C0237d> LJFF;

    public abstract void LIZ(Intent intent);

    /* renamed from: androidx.core.app.JobIntentService$d */
    /* loaded from: classes18.dex */
    public final class C0237d implements AbstractC143719eKv {
        public final Intent LIZ;
        public final int LIZIZ;

        static {
            Covode.recordClassIndex(889);
        }

        @Override // p003X.AbstractC143719eKv
        public final Intent LIZ() {
            return this.LIZ;
        }

        @Override // p003X.AbstractC143719eKv
        public final void LIZIZ() {
            JobIntentService.this.stopSelf(this.LIZIZ);
        }

        public C0237d(Intent intent, int i) {
            this.LIZ = intent;
            this.LIZIZ = i;
        }
    }

    static {
        Covode.recordClassIndex(885);
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.LJFF = null;
        } else {
            this.LJFF = new ArrayList<>();
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<C0237d> arrayList = this.LJFF;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f20242LJ = true;
                this.LIZIZ.LIZJ();
            }
        }
    }

    public AbstractC143719eKv LIZIZ() {
        AbstractC143718eKu abstractC143718eKu = this.LIZ;
        if (abstractC143718eKu != null) {
            return abstractC143718eKu.LIZIZ();
        }
        synchronized (this.LJFF) {
            if (this.LJFF.size() > 0) {
                return this.LJFF.remove(0);
            }
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.LIZ = new job.JobServiceEngineC143715eKr(this);
            this.LIZIZ = null;
            return;
        }
        this.LIZ = null;
        this.LIZIZ = LIZ((Context) this, new ComponentName(this, getClass()), false, 0);
    }

    public final void LIZ() {
        ArrayList<C0237d> arrayList = this.LJFF;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.LIZJ = null;
                if (this.LJFF != null && this.LJFF.size() > 0) {
                    LIZ(false);
                } else if (!this.f20242LJ) {
                    this.LIZIZ.LIZJ();
                }
            }
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$h */
    /* loaded from: classes15.dex */
    public static abstract class AbstractC0238h {
        public final ComponentName LIZJ;
        public boolean LIZLLL;

        /* renamed from: LJ */
        public int f20243LJ;

        static {
            Covode.recordClassIndex(894);
        }

        public void LIZ() {
        }

        public abstract void LIZ(Intent intent);

        public void LIZIZ() {
        }

        public void LIZJ() {
        }

        public AbstractC0238h(ComponentName componentName) {
            this.LIZJ = componentName;
        }

        public final void LIZ(int i) {
            if (!this.LIZLLL) {
                this.LIZLLL = true;
                this.f20243LJ = i;
            } else if (this.f20243LJ == i) {
            } else {
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.f20243LJ);
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        AbstractC143718eKu abstractC143718eKu = this.LIZ;
        if (abstractC143718eKu != null) {
            return abstractC143718eKu.LIZ();
        }
        return null;
    }

    public final void LIZ(boolean z) {
        if (this.LIZJ == null) {
            this.LIZJ = new AsyncTaskC143716eKs(this);
            AbstractC0238h abstractC0238h = this.LIZIZ;
            if (abstractC0238h != null && z) {
                abstractC0238h.LIZIZ();
            }
            this.LIZJ.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!AppMonitor.INSTANCE.isAppBackground() && C140192dPo.LIZ("serviceAttachBaseContext")) {
            C140181dPd.LIZLLL();
        }
        super.attachBaseContext(context);
    }

    private int LIZ(Intent intent, int i) {
        if (this.LJFF != null) {
            this.LIZIZ.LIZ();
            synchronized (this.LJFF) {
                ArrayList<C0237d> arrayList = this.LJFF;
                if (intent == null) {
                    intent = new Intent();
                }
                arrayList.add(new C0237d(intent, i));
                LIZ(true);
            }
            return 3;
        }
        return 2;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int LIZ = LIZ(intent, i2);
        new StringBuilder();
        ALog.m8953i("KeepAliveLancet", C0002O.m25086C(getClass().getName(), "： hook Service.onStartCommand"));
        if (ComplianceBusinessServiceImpl.LIZ(false).isNeedHookService(getClass().getName())) {
            ALog.m8953i("KeepAliveLancet", "return START_NOT_STICKY");
            return 2;
        }
        return LIZ;
    }

    public static AbstractC0238h LIZ(Context context, ComponentName componentName, boolean z, int i) {
        AbstractC0238h abstractC0238h = LJII.get(componentName);
        if (abstractC0238h == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (z) {
                    abstractC0238h = new C143702eKe(context, componentName, i);
                } else {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
            } else {
                abstractC0238h = new C123241Yex(context, componentName);
            }
            LJII.put(componentName, abstractC0238h);
        }
        return abstractC0238h;
    }

    public static void LIZ(Context context, Class<?> cls, int i, Intent intent) {
        ComponentName componentName = new ComponentName(context, cls);
        if (intent != null) {
            synchronized (LJI) {
                AbstractC0238h LIZ = LIZ(context, componentName, true, i);
                LIZ.LIZ(i);
                LIZ.LIZ(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }
}
