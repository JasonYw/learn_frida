package anet.channel.appmonitor;

import anet.channel.statist.AlarmObject;
import anet.channel.statist.CountObject;
import anet.channel.statist.StatObject;
import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public class AppMonitor {
    public static volatile IAppMonitor appMonitor = new C0463a(null);
    public static volatile IAppMonitor apmMonitor = null;

    public static IAppMonitor getInstance() {
        return appMonitor;
    }

    static {
        Covode.recordClassIndex(2152);
    }

    public static void setApmMonitor(IAppMonitor iAppMonitor) {
        apmMonitor = iAppMonitor;
    }

    /* renamed from: anet.channel.appmonitor.AppMonitor$a */
    /* loaded from: classes2.dex */
    public static class C0463a implements IAppMonitor {

        /* renamed from: a */
        public IAppMonitor f20409a;

        static {
            Covode.recordClassIndex(2153);
        }

        @Override // anet.channel.appmonitor.IAppMonitor
        public void register() {
        }

        @Override // anet.channel.appmonitor.IAppMonitor
        public void register(Class<?> cls) {
        }

        public C0463a(IAppMonitor iAppMonitor) {
            this.f20409a = iAppMonitor;
        }

        @Override // anet.channel.appmonitor.IAppMonitor
        public void commitAlarm(AlarmObject alarmObject) {
            IAppMonitor iAppMonitor = this.f20409a;
            if (iAppMonitor != null) {
                iAppMonitor.commitAlarm(alarmObject);
            }
        }

        @Override // anet.channel.appmonitor.IAppMonitor
        public void commitCount(CountObject countObject) {
            IAppMonitor iAppMonitor = this.f20409a;
            if (iAppMonitor != null) {
                iAppMonitor.commitCount(countObject);
            }
        }

        @Override // anet.channel.appmonitor.IAppMonitor
        public void commitStat(StatObject statObject) {
            if (AppMonitor.apmMonitor != null) {
                AppMonitor.apmMonitor.commitStat(statObject);
            }
            IAppMonitor iAppMonitor = this.f20409a;
            if (iAppMonitor != null) {
                iAppMonitor.commitStat(statObject);
            }
        }
    }

    public static void setInstance(IAppMonitor iAppMonitor) {
        appMonitor = new C0463a(iAppMonitor);
    }
}
