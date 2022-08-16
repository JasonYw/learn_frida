package cn.ever.cloud.utils.monitor;

import android.os.Build;
import cn.ever.cloud.utils.DebugUtil;
import cn.ever.cloud.utils.LogHelper;
import cn.ever.cloud.utils.base.AppInfo;
import cn.ever.cloud.utils.convert.GsonAdapter;
import cn.ever.cloud.utils.monitor.ModuleConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class MonitorHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final MonitorHelper INSTANCE = new MonitorHelper();
    public static final ArrayList<AbstractC0764a> monitorDelegateList = new ArrayList<>();

    static {
        Covode.recordClassIndex(3495);
    }

    public final void clearMonitorDelegate() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        monitorDelegateList.clear();
    }

    private final String upper1stChar(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (str != null && str.length() != 0) {
            new StringBuilder();
            String substring = str.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(substring, "");
            String upperCase = substring.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            String substring2 = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring2, "");
            return C0002O.m25086C(upperCase, substring2);
        }
        return str;
    }

    private final Object wrapJsonObjectIfNecessary(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return proxy.result;
        }
        int i = Build.VERSION.SDK_INT;
        Object wrap = JSONObject.wrap(obj);
        if (obj != null && wrap == null) {
            try {
                return GsonAdapter.toJson$default(GsonAdapter.INSTANCE, obj, false, 2, null);
            } catch (Throwable unused) {
                return wrap;
            }
        }
        return wrap;
    }

    public final void addMonitorDelegate(AbstractC0764a abstractC0764a) {
        if (PatchProxy.proxy(new Object[]{abstractC0764a}, this, changeQuickRedirect, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC0764a);
        if (!monitorDelegateList.contains(abstractC0764a)) {
            monitorDelegateList.add(abstractC0764a);
        }
    }

    public final void ensureNotNull(Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        if (monitorDelegateList.isEmpty()) {
            LogHelper.INSTANCE.m20551w("MonitorHelper", "monitor delegate list is empty!");
        }
        Iterator<AbstractC0764a> it = monitorDelegateList.iterator();
        while (it.hasNext()) {
            it.next().ensureNotNull(obj);
        }
    }

    public final void ensureNotReachHere(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        if (monitorDelegateList.isEmpty()) {
            LogHelper.INSTANCE.m20551w("MonitorHelper", "monitor delegate list is empty!");
        }
        Iterator<AbstractC0764a> it = monitorDelegateList.iterator();
        while (it.hasNext()) {
            it.next().ensureNotReachHere(str);
        }
    }

    private final void logAnalyticEvent(String str, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{str, jSONObject}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        if (monitorDelegateList.isEmpty()) {
            LogHelper.INSTANCE.m20551w("MonitorHelper", "monitor delegate list is empty!");
        }
        Iterator<AbstractC0764a> it = monitorDelegateList.iterator();
        while (it.hasNext()) {
            it.next().onEvent(str, jSONObject);
        }
    }

    private final void logAndMonitor(String str, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{str, jSONObject}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        printEvent(str, jSONObject);
        logAnalyticEvent(str, jSONObject);
        logMonitorEvent(str, jSONObject, null);
    }

    private final void printEvent(String str, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{str, jSONObject}, this, changeQuickRedirect, false, 10).isSupported || jSONObject == null) {
            return;
        }
        try {
            jSONObject.getString("module");
            jSONObject.getString("event_name");
            LogHelper logHelper = LogHelper.INSTANCE;
            logHelper.m20555d("MonitorHelper", str + ": " + jSONObject);
        } catch (JSONException e) {
            if (DebugUtil.INSTANCE.debug()) {
                e.printStackTrace();
            }
        }
    }

    public final void logEvent(ModuleConfig moduleConfig, String str, Object... objArr) {
        if (PatchProxy.proxy(new Object[]{moduleConfig, str, objArr}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(moduleConfig, str, objArr);
        logEvent(moduleConfig, str, true, Arrays.copyOf(objArr, objArr.length));
    }

    private final void logMonitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (PatchProxy.proxy(new Object[]{str, jSONObject, jSONObject2}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        if (monitorDelegateList.isEmpty()) {
            LogHelper.INSTANCE.m20551w("MonitorHelper", "monitor delegate list is empty!");
        }
        Iterator<AbstractC0764a> it = monitorDelegateList.iterator();
        while (it.hasNext()) {
            it.next().onSendMonitor(str, jSONObject, jSONObject2);
        }
    }

    private final JSONObject createJsonObject(ModuleConfig moduleConfig, String str, Object[] objArr) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{moduleConfig, str, objArr}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        ModuleConfig.EventEntry eventEntry = moduleConfig.getEntry().get(str);
        if (eventEntry != null) {
            String[] args = eventEntry.getArgs();
            String[] strArr = (String[]) Arrays.copyOf(args, args.length);
            int checkArgs = checkArgs(moduleConfig, str, strArr, objArr);
            HashMap hashMap = new HashMap();
            for (int i = 0; i < checkArgs; i++) {
                hashMap.put(strArr[i], wrapJsonObjectIfNecessary(objArr[i]));
            }
            JSONObject jSONObject = new JSONObject(hashMap);
            try {
                jSONObject.put("module", moduleConfig.getName());
                jSONObject.put("uid", String.valueOf(AppInfo.INSTANCE.getUid()));
                jSONObject.put("did", AppInfo.INSTANCE.getDid());
                jSONObject.put("event_name", str);
                jSONObject.put("source_from", AppInfo.INSTANCE.getSf());
                jSONObject.put("timestamp", System.currentTimeMillis());
                jSONObject.put("sdk_version", AppInfo.INSTANCE.getSdkVersion());
                return jSONObject;
            } catch (JSONException e) {
                LogHelper logHelper = LogHelper.INSTANCE;
                String message = e.getMessage();
                Intrinsics.checkNotNull(message);
                logHelper.m20554e("MonitorHelper", message);
                return jSONObject;
            }
        }
        new StringBuilder();
        throw new NullPointerException(C0002O.m25084C(moduleConfig.getName(), ".", str, " doesn't registered."));
    }

    private final int checkArgs(ModuleConfig moduleConfig, String str, String[] strArr, Object[] objArr) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{moduleConfig, str, strArr, objArr}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int length = strArr.length;
        int length2 = objArr.length;
        if (length == length2) {
            return length;
        }
        throw new IllegalStateException(moduleConfig.getName() + "." + str + " arguments are not compared to values, values is " + length2 + " and args is " + length);
    }

    private final void logEvent(ModuleConfig moduleConfig, String str, boolean z, Object... objArr) {
        if (PatchProxy.proxy(new Object[]{moduleConfig, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), objArr}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        try {
            JSONObject createJsonObject = createJsonObject(moduleConfig, str, Arrays.copyOf(objArr, objArr.length));
            if (!z && !moduleConfig.isForSdk()) {
                new StringBuilder();
                String m25085C = C0002O.m25085C(moduleConfig.getName(), "_", str);
                printEvent(m25085C, createJsonObject);
                if (moduleConfig instanceof AnalyticModule) {
                    logAnalyticEvent(m25085C, createJsonObject);
                    return;
                } else if (moduleConfig instanceof MonitorModule) {
                    logMonitorEvent(m25085C, createJsonObject, null);
                    return;
                } else {
                    return;
                }
            }
            new StringBuilder();
            String m25085C2 = C0002O.m25085C(moduleConfig.getName(), "_", str);
            if (moduleConfig.isForSdk()) {
                m25085C2 = C0002O.m25086C("ec_", upper1stChar(m25085C2));
            }
            logAndMonitor(m25085C2, createJsonObject);
        } catch (Throwable th) {
            LogHelper logHelper = LogHelper.INSTANCE;
            String message = th.getMessage();
            Intrinsics.checkNotNull(message);
            logHelper.m20554e("MonitorHelper", message);
            DebugUtil.INSTANCE.debug();
        }
    }
}
