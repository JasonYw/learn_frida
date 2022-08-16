package anet.channel.appmonitor;

import android.text.TextUtils;
import anet.channel.statist.AlarmObject;
import anet.channel.statist.CountObject;
import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import anet.channel.statist.StatObject;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p002O.C0002O;
import p003X.C116971W2r;
import p003X.GRT;

/* renamed from: anet.channel.appmonitor.a */
/* loaded from: classes13.dex */
public class C0464a implements IAppMonitor {

    /* renamed from: a */
    public static boolean f20410a;

    /* renamed from: b */
    public static Map<Class<?>, List<Field>> f20411b = new ConcurrentHashMap();

    /* renamed from: c */
    public static Map<Class<?>, List<Field>> f20412c = new ConcurrentHashMap();

    /* renamed from: d */
    public static Map<Field, String> f20413d = new ConcurrentHashMap();

    /* renamed from: e */
    public static Random f20414e = new Random();

    /* renamed from: f */
    public static Set<Class<?>> f20415f = Collections.newSetFromMap(new ConcurrentHashMap());

    @Override // anet.channel.appmonitor.IAppMonitor
    public void register() {
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    public void register(Class<?> cls) {
    }

    public C0464a() {
        try {
            C116971W2r.LIZ("com.alibaba.mtl.appmonitor.AppMonitor");
            f20410a = true;
        } catch (Exception unused) {
            f20410a = false;
        }
    }

    static {
        Covode.recordClassIndex(2155);
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    public void commitAlarm(AlarmObject alarmObject) {
        if (f20410a && alarmObject != null && !TextUtils.isEmpty(alarmObject.module) && !TextUtils.isEmpty(alarmObject.modulePoint)) {
            if (ALog.isPrintLog(1)) {
                ALog.m20788d("awcn.DefaultAppMonitor", "commit alarm: " + alarmObject, null, new Object[0]);
            }
            if (!alarmObject.isSuccess) {
                AppMonitor.Alarm.commitFail(alarmObject.module, alarmObject.modulePoint, StringUtils.stringNull2Empty(alarmObject.arg), StringUtils.stringNull2Empty(alarmObject.errorCode), StringUtils.stringNull2Empty(alarmObject.errorMsg));
            } else {
                AppMonitor.Alarm.commitSuccess(alarmObject.module, alarmObject.modulePoint, StringUtils.stringNull2Empty(alarmObject.arg));
            }
        }
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    public void commitCount(CountObject countObject) {
        if (f20410a && countObject != null && !TextUtils.isEmpty(countObject.module) && !TextUtils.isEmpty(countObject.modulePoint)) {
            if (ALog.isPrintLog(2)) {
                ALog.m20785i("awcn.DefaultAppMonitor", "commit count: " + countObject, null, new Object[0]);
            }
            AppMonitor.Counter.commit(countObject.module, countObject.modulePoint, StringUtils.stringNull2Empty(countObject.arg), countObject.value);
        }
    }

    /* renamed from: a */
    public synchronized void m21054a(Class<?> cls) {
        String name;
        String name2;
        MethodCollector.m14708i(26);
        if (cls != null && f20410a) {
            try {
                if (f20415f.contains(cls)) {
                    MethodCollector.m14707o(26);
                    return;
                }
                Monitor monitor = (Monitor) cls.getAnnotation(Monitor.class);
                if (monitor == null) {
                    MethodCollector.m14707o(26);
                    return;
                }
                Field[] fields = cls.getFields();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                DimensionSet create = DimensionSet.create();
                MeasureSet create2 = MeasureSet.create();
                for (Field field : fields) {
                    Dimension dimension = (Dimension) field.getAnnotation(Dimension.class);
                    if (dimension != null) {
                        field.setAccessible(true);
                        arrayList.add(field);
                        if (dimension.name().equals("")) {
                            name2 = field.getName();
                        } else {
                            name2 = dimension.name();
                        }
                        f20413d.put(field, name2);
                        create.addDimension(name2);
                    } else {
                        Measure measure = (Measure) field.getAnnotation(Measure.class);
                        if (measure != null) {
                            field.setAccessible(true);
                            arrayList2.add(field);
                            if (measure.name().equals("")) {
                                name = field.getName();
                            } else {
                                name = measure.name();
                            }
                            f20413d.put(field, name);
                            if (measure.max() != Double.MAX_VALUE) {
                                create2.addMeasure(new com.alibaba.mtl.appmonitor.model.Measure(name, Double.valueOf(measure.constantValue()), Double.valueOf(measure.min()), Double.valueOf(measure.max())));
                            } else {
                                create2.addMeasure(name);
                            }
                        }
                    }
                }
                f20411b.put(cls, arrayList);
                f20412c.put(cls, arrayList2);
                com.alibaba.mtl.appmonitor.AppMonitor.register(monitor.module(), monitor.monitorPoint(), create2, create);
                f20415f.add(cls);
                MethodCollector.m14707o(26);
                return;
            } catch (Exception e) {
                ALog.m20787e("awcn.DefaultAppMonitor", "register fail", null, e, new Object[0]);
                MethodCollector.m14707o(26);
                return;
            }
        }
        MethodCollector.m14707o(26);
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    public void commitStat(StatObject statObject) {
        HashMap hashMap;
        String obj;
        int i;
        if (f20410a && statObject != null) {
            Class<?> cls = statObject.getClass();
            Monitor monitor = (Monitor) cls.getAnnotation(Monitor.class);
            if (monitor == null) {
                return;
            }
            if (!f20415f.contains(cls)) {
                m21054a(cls);
            }
            if (!statObject.beforeCommit()) {
                return;
            }
            if (monitor.monitorPoint().equals("network") && (i = GRT.LJIIJJI) <= 10000 && i >= 0 && i != 10000 && f20414e.nextInt(10000) >= i) {
                return;
            }
            try {
                DimensionValueSet create = DimensionValueSet.create();
                MeasureValueSet create2 = MeasureValueSet.create();
                List<Field> list = f20411b.get(cls);
                if (ALog.isPrintLog(1)) {
                    hashMap = new HashMap();
                } else {
                    hashMap = null;
                }
                if (list != null) {
                    for (Field field : list) {
                        Object obj2 = field.get(statObject);
                        String str = f20413d.get(field);
                        if (obj2 == null) {
                            obj = "";
                        } else {
                            obj = obj2.toString();
                        }
                        create.setValue(str, obj);
                    }
                    for (Field field2 : f20412c.get(cls)) {
                        Double valueOf = Double.valueOf(field2.getDouble(statObject));
                        create2.setValue(f20413d.get(field2), valueOf.doubleValue());
                        if (hashMap != null) {
                            hashMap.put(f20413d.get(field2), valueOf);
                        }
                    }
                }
                AppMonitor.Stat.commit(monitor.module(), monitor.monitorPoint(), create, create2);
                if (ALog.isPrintLog(1)) {
                    ALog.m20788d("awcn.DefaultAppMonitor", C0002O.m25086C("commit stat: ", monitor.monitorPoint()), null, "\nDimensions", create.getMap().toString(), "\nMeasures", hashMap.toString());
                }
            } catch (Throwable th) {
                ALog.m20787e("awcn.DefaultAppMonitor", "commit monitor point failed", null, th, new Object[0]);
            }
        }
    }
}
