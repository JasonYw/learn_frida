package anet.channel.appmonitor;

import anet.channel.statist.AlarmObject;
import anet.channel.statist.CountObject;
import anet.channel.statist.StatObject;
import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public interface IAppMonitor {
    static {
        Covode.recordClassIndex(2154);
    }

    void commitAlarm(AlarmObject alarmObject);

    void commitCount(CountObject countObject);

    void commitStat(StatObject statObject);

    void register();

    void register(Class<?> cls);
}
