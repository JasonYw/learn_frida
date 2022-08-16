package cn.ever.cloud.android.monitor;

import android.content.Context;
import cn.ever.cloud.utils.DebugUtil;
import cn.ever.cloud.utils.LogHelper;
import cn.ever.cloud.utils.base.AppInfo;
import cn.ever.cloud.utils.monitor.SimpleMonitor;
import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitor;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC521626jE;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class SdkMonitor extends SimpleMonitor {
    public static final Companion Companion = new Companion((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final Context appContext;
    public final AbstractC521626jE eventDepend;

    static {
        Covode.recordClassIndex(2884);
    }

    /* loaded from: classes23.dex */
    public static final class Companion {

        /* loaded from: classes23.dex */
        public static final class MonitorUrl {
            public static final C35363Companion Companion = new C35363Companion(null);
            public final List<String> configUrl;
            public final List<String> reportUrl;

            static {
                Covode.recordClassIndex(2886);
            }

            /* renamed from: cn.ever.cloud.android.monitor.SdkMonitor$Companion$MonitorUrl$Companion  reason: collision with other inner class name */
            /* loaded from: classes23.dex */
            public static final class C35363Companion {
                public static ChangeQuickRedirect changeQuickRedirect;

                static {
                    Covode.recordClassIndex(2887);
                }

                public C35363Companion() {
                }

                private final MonitorUrl ofOversea() {
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
                    if (proxy.isSupported) {
                        return (MonitorUrl) proxy.result;
                    }
                    throw new IllegalStateException("unsupported oversea config!");
                }

                private final MonitorUrl ofDomestic() {
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
                    if (proxy.isSupported) {
                        return (MonitorUrl) proxy.result;
                    }
                    return new MonitorUrl(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"https://mon.snssdk.com/monitor/appmonitor/v2/settings", "https://monsetting.toutiao.com/monitor/appmonitor/v2/settings"}), CollectionsKt__CollectionsJVMKt.listOf("https://mon.snssdk.com/monitor/collect/"), null);
                }

                public /* synthetic */ C35363Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                /* renamed from: of */
                public final MonitorUrl m20563of(boolean z) {
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1);
                    if (proxy.isSupported) {
                        return (MonitorUrl) proxy.result;
                    }
                    if (z) {
                        return ofOversea();
                    }
                    return ofDomestic();
                }
            }

            public final List<String> getConfigUrl() {
                return this.configUrl;
            }

            public final List<String> getReportUrl() {
                return this.reportUrl;
            }

            public MonitorUrl(List<String> list, List<String> list2) {
                this.configUrl = list;
                this.reportUrl = list2;
            }

            public /* synthetic */ MonitorUrl(List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, list2);
            }
        }

        static {
            Covode.recordClassIndex(2885);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(byte b) {
            this();
        }
    }

    private final void setupSdkMonitor() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_id", AppInfo.INSTANCE.getDid());
            jSONObject.put("channel", AppInfo.INSTANCE.getSf());
            jSONObject.put("app_version", AppInfo.INSTANCE.getSdkVersion());
            jSONObject.put("update_version_code", 4060290);
            jSONObject.put(Constants.PACKAGE_NAME, this.appContext.getPackageName());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Companion.MonitorUrl m20563of = Companion.MonitorUrl.Companion.m20563of(false);
        SDKMonitorUtils.setConfigUrl("2345", m20563of.getConfigUrl());
        SDKMonitorUtils.setDefaultReportUrl("2345", m20563of.getReportUrl());
        SDKMonitorUtils.initMonitor(this.appContext, "2345", jSONObject, new SDKMonitor.IGetExtendParams() { // from class: cn.ever.cloud.android.monitor.SdkMonitor$setupSdkMonitor$1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(2888);
            }

            @Override // com.bytedance.framwork.core.sdkmonitor.SDKMonitor.IGetExtendParams
            public final String getSessionId() {
                return null;
            }

            @Override // com.bytedance.framwork.core.sdkmonitor.SDKMonitor.IGetExtendParams
            public final Map<String, String> getCommonParams() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return (Map) proxy.result;
                }
                if (r1) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("oversea", "1");
                    return hashMap;
                }
                return null;
            }
        });
    }

    @Override // cn.ever.cloud.utils.monitor.SimpleMonitor, cn.ever.cloud.utils.monitor.AbstractC0764a
    public final void onEvent(String str, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{str, jSONObject}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, jSONObject);
        this.eventDepend.onAppLopEventV3(str, jSONObject);
    }

    public SdkMonitor(Context context, AbstractC521626jE abstractC521626jE) {
        C106862S5w.LIZ(context, abstractC521626jE);
        this.appContext = context;
        this.eventDepend = abstractC521626jE;
        try {
            setupSdkMonitor();
        } catch (Throwable th) {
            LogHelper.INSTANCE.m20554e("EC_SdkMonitor", String.valueOf(th.getMessage()));
            DebugUtil.INSTANCE.debug();
        }
    }

    @Override // cn.ever.cloud.utils.monitor.SimpleMonitor, cn.ever.cloud.utils.monitor.AbstractC0764a
    public final void onSendMonitor(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (PatchProxy.proxy(new Object[]{str, jSONObject, jSONObject2}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, jSONObject);
        SDKMonitorUtils.getInstance("2345").monitorDuration(str, jSONObject, jSONObject2);
    }
}
