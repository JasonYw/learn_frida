package com.bytedance.alliance.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.push.settings.AbstractC13882b;
import com.bytedance.push.settings.IDataChangedListener;
import com.bytedance.push.settings.Migration;
import com.bytedance.push.settings.storage.AbstractC13886i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p003X.C74476FYg;
import p003X.GI9;
import p003X.GIC;

/* loaded from: classes2.dex */
public class AllianceOnlineSettings$$SettingImpl implements AllianceOnlineSettings {
    public static ChangeQuickRedirect LIZ;
    public AbstractC13886i LIZIZ;
    public final ArrayList<Migration> LIZJ = new ArrayList<>();
    public final AbstractC13882b LIZLLL = new AbstractC13882b(this) { // from class: com.bytedance.alliance.settings.AllianceOnlineSettings$$SettingImpl.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(10010);
        }

        @Override // com.bytedance.push.settings.AbstractC13882b
        public final <T> T create(Class<T> cls) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, this, LIZ, false, 1);
            if (proxy.isSupported) {
                return (T) proxy.result;
            }
            if (cls == GIC.class) {
                return (T) new GIC();
            }
            return null;
        }
    };

    static {
        Covode.recordClassIndex(10009);
    }

    @Override // com.bytedance.alliance.settings.AllianceOnlineSettings
    public final boolean LIZ() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("alliance_sdk_enable_wakeup")) {
            return this.LIZIZ.mo14285LJ("alliance_sdk_enable_wakeup");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("alliance_sdk_enable_wakeup") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                boolean LIZ3 = GI9.LIZ(next, "alliance_sdk_enable_wakeup");
                LIZ2.putBoolean("alliance_sdk_enable_wakeup", LIZ3);
                LIZ2.apply();
                return LIZ3;
            }
        }
        return false;
    }

    @Override // com.bytedance.alliance.settings.AllianceOnlineSettings
    public final String LIZIZ() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("alliance_sdk_enable_net_report_events")) {
            return this.LIZIZ.LIZ("alliance_sdk_enable_net_report_events");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("alliance_sdk_enable_net_report_events") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                String string = next.getString("alliance_sdk_enable_net_report_events");
                LIZ2.putString("alliance_sdk_enable_net_report_events", string);
                LIZ2.apply();
                return string;
            }
        }
        return "";
    }

    @Override // com.bytedance.alliance.settings.AllianceOnlineSettings
    public final int LIZJ() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("alliance_sdk_net_report_delay_in_second")) {
            return this.LIZIZ.LIZIZ("alliance_sdk_net_report_delay_in_second");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("alliance_sdk_net_report_delay_in_second") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                int i = next.getInt("alliance_sdk_net_report_delay_in_second");
                LIZ2.putInt("alliance_sdk_net_report_delay_in_second", i);
                LIZ2.apply();
                return i;
            }
        }
        return 10;
    }

    @Override // com.bytedance.alliance.settings.AllianceOnlineSettings
    public final int LIZLLL() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("alliance_sdk_net_report_interval_in_second")) {
            return this.LIZIZ.LIZIZ("alliance_sdk_net_report_interval_in_second");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("alliance_sdk_net_report_interval_in_second") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                int i = next.getInt("alliance_sdk_net_report_interval_in_second");
                LIZ2.putInt("alliance_sdk_net_report_interval_in_second", i);
                LIZ2.apply();
                return i;
            }
        }
        return 5;
    }

    @Override // com.bytedance.alliance.settings.AllianceOnlineSettings
    /* renamed from: LJ */
    public final int mo15995LJ() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("alliance_sdk_net_report_batch_num")) {
            return this.LIZIZ.LIZIZ("alliance_sdk_net_report_batch_num");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("alliance_sdk_net_report_batch_num") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                int i = next.getInt("alliance_sdk_net_report_batch_num");
                LIZ2.putInt("alliance_sdk_net_report_batch_num", i);
                LIZ2.apply();
                return i;
            }
        }
        return 20;
    }

    @Override // com.bytedance.alliance.settings.AllianceOnlineSettings
    public final boolean LJFF() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("alliance_sdk_enable_net_report")) {
            return this.LIZIZ.mo14285LJ("alliance_sdk_enable_net_report");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("alliance_sdk_enable_net_report") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                boolean LIZ3 = GI9.LIZ(next, "alliance_sdk_enable_net_report");
                LIZ2.putBoolean("alliance_sdk_enable_net_report", LIZ3);
                LIZ2.apply();
                return LIZ3;
            }
        }
        return true;
    }

    @Override // com.bytedance.alliance.settings.AllianceOnlineSettings
    public final boolean LJI() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("enable_check_config_every_time")) {
            return this.LIZIZ.mo14285LJ("enable_check_config_every_time");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("enable_check_config_every_time") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                boolean LIZ3 = GI9.LIZ(next, "enable_check_config_every_time");
                LIZ2.putBoolean("enable_check_config_every_time", LIZ3);
                LIZ2.apply();
                return LIZ3;
            }
        }
        return true;
    }

    @Override // com.bytedance.alliance.settings.AllianceOnlineSettings
    public final int LJII() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("max_num_wakeup")) {
            return this.LIZIZ.LIZIZ("max_num_wakeup");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("max_num_wakeup") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                int i = next.getInt("max_num_wakeup");
                LIZ2.putInt("max_num_wakeup", i);
                LIZ2.apply();
                return i;
            }
        }
        return 5;
    }

    @Override // com.bytedance.alliance.settings.AllianceOnlineSettings
    public final int LJIIIIZZ() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("max_num_collect_sdk_info")) {
            return this.LIZIZ.LIZIZ("max_num_collect_sdk_info");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("max_num_collect_sdk_info") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                int i = next.getInt("max_num_collect_sdk_info");
                LIZ2.putInt("max_num_collect_sdk_info", i);
                LIZ2.apply();
                return i;
            }
        }
        return 5;
    }

    @Override // com.bytedance.alliance.settings.AllianceOnlineSettings
    public final int LJIIIZ() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("flexible_wakeup_interval_in_second")) {
            return this.LIZIZ.LIZIZ("flexible_wakeup_interval_in_second");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("flexible_wakeup_interval_in_second") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                int i = next.getInt("flexible_wakeup_interval_in_second");
                LIZ2.putInt("flexible_wakeup_interval_in_second", i);
                LIZ2.apply();
                return i;
            }
        }
        return 5;
    }

    @Override // com.bytedance.alliance.settings.AllianceOnlineSettings
    public final boolean LJIIJ() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("enable_extra_real_success")) {
            return this.LIZIZ.mo14285LJ("enable_extra_real_success");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("enable_extra_real_success") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                boolean LIZ3 = GI9.LIZ(next, "enable_extra_real_success");
                LIZ2.putBoolean("enable_extra_real_success", LIZ3);
                LIZ2.apply();
                return LIZ3;
            }
        }
        return false;
    }

    @Override // com.bytedance.alliance.settings.AllianceOnlineSettings
    public final boolean LJIIJJI() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("need_collect_real_sdk_set")) {
            return this.LIZIZ.mo14285LJ("need_collect_real_sdk_set");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("need_collect_real_sdk_set") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                boolean LIZ3 = GI9.LIZ(next, "need_collect_real_sdk_set");
                LIZ2.putBoolean("need_collect_real_sdk_set", LIZ3);
                LIZ2.apply();
                return LIZ3;
            }
        }
        return true;
    }

    @Override // com.bytedance.alliance.settings.AllianceOnlineSettings
    public final boolean LJIIL() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 13);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("need_request_if_sdk_list_is_empty")) {
            return this.LIZIZ.mo14285LJ("need_request_if_sdk_list_is_empty");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("need_request_if_sdk_list_is_empty") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                boolean LIZ3 = GI9.LIZ(next, "need_request_if_sdk_list_is_empty");
                LIZ2.putBoolean("need_request_if_sdk_list_is_empty", LIZ3);
                LIZ2.apply();
                return LIZ3;
            }
        }
        return true;
    }

    @Override // com.bytedance.alliance.settings.AllianceOnlineSettings
    public final boolean LJIILIIL() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 14);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("enable_hook_resume_activity")) {
            return this.LIZIZ.mo14285LJ("enable_hook_resume_activity");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("enable_hook_resume_activity") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                boolean LIZ3 = GI9.LIZ(next, "enable_hook_resume_activity");
                LIZ2.putBoolean("enable_hook_resume_activity", LIZ3);
                LIZ2.apply();
                return LIZ3;
            }
        }
        return false;
    }

    @Override // com.bytedance.alliance.settings.AllianceOnlineSettings
    public final String LJIILJJIL() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 15);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("block_list_of_activity")) {
            return this.LIZIZ.LIZ("block_list_of_activity");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("block_list_of_activity") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                String string = next.getString("block_list_of_activity");
                LIZ2.putString("block_list_of_activity", string);
                LIZ2.apply();
                return string;
            }
        }
        return "";
    }

    @Override // com.bytedance.alliance.settings.AllianceOnlineSettings
    public final boolean LJIILL() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 17);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("enable_pass_through")) {
            return this.LIZIZ.mo14285LJ("enable_pass_through");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("enable_pass_through") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                boolean LIZ3 = GI9.LIZ(next, "enable_pass_through");
                LIZ2.putBoolean("enable_pass_through", LIZ3);
                LIZ2.apply();
                return LIZ3;
            }
        }
        return false;
    }

    @Override // com.bytedance.push.settings.ISettings
    public void unregisterValChanged(IDataChangedListener iDataChangedListener) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{iDataChangedListener}, this, LIZ, false, 21).isSupported && (abstractC13886i = this.LIZIZ) != null) {
            abstractC13886i.LIZ(iDataChangedListener);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AllianceOnlineSettings$$SettingImpl(AbstractC13886i abstractC13886i) {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.LIZIZ = abstractC13886i;
        this.LIZJ.add(C74476FYg.LIZ(GIC.class, this.LIZLLL));
    }

    @Override // com.bytedance.push.settings.ISettings
    public void updateSettings(Context context, JSONObject jSONObject) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{context, jSONObject}, this, LIZ, false, 19).isSupported && jSONObject != null && (abstractC13886i = this.LIZIZ) != null) {
            SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
            if (jSONObject.has("alliance_sdk_enable_wakeup")) {
                LIZ2.putBoolean("alliance_sdk_enable_wakeup", GI9.LIZ(jSONObject, "alliance_sdk_enable_wakeup"));
            }
            if (jSONObject.has("alliance_sdk_enable_net_report_events")) {
                LIZ2.putString("alliance_sdk_enable_net_report_events", jSONObject.optString("alliance_sdk_enable_net_report_events"));
            }
            if (jSONObject.has("alliance_sdk_net_report_delay_in_second")) {
                LIZ2.putInt("alliance_sdk_net_report_delay_in_second", jSONObject.optInt("alliance_sdk_net_report_delay_in_second"));
            }
            if (jSONObject.has("alliance_sdk_net_report_interval_in_second")) {
                LIZ2.putInt("alliance_sdk_net_report_interval_in_second", jSONObject.optInt("alliance_sdk_net_report_interval_in_second"));
            }
            if (jSONObject.has("alliance_sdk_net_report_batch_num")) {
                LIZ2.putInt("alliance_sdk_net_report_batch_num", jSONObject.optInt("alliance_sdk_net_report_batch_num"));
            }
            if (jSONObject.has("alliance_sdk_enable_net_report")) {
                LIZ2.putBoolean("alliance_sdk_enable_net_report", GI9.LIZ(jSONObject, "alliance_sdk_enable_net_report"));
            }
            if (jSONObject.has("enable_check_config_every_time")) {
                LIZ2.putBoolean("enable_check_config_every_time", GI9.LIZ(jSONObject, "enable_check_config_every_time"));
            }
            if (jSONObject.has("max_num_wakeup")) {
                LIZ2.putInt("max_num_wakeup", jSONObject.optInt("max_num_wakeup"));
            }
            if (jSONObject.has("max_num_collect_sdk_info")) {
                LIZ2.putInt("max_num_collect_sdk_info", jSONObject.optInt("max_num_collect_sdk_info"));
            }
            if (jSONObject.has("flexible_wakeup_interval_in_second")) {
                LIZ2.putInt("flexible_wakeup_interval_in_second", jSONObject.optInt("flexible_wakeup_interval_in_second"));
            }
            if (jSONObject.has("enable_extra_real_success")) {
                LIZ2.putBoolean("enable_extra_real_success", GI9.LIZ(jSONObject, "enable_extra_real_success"));
            }
            if (jSONObject.has("need_collect_real_sdk_set")) {
                LIZ2.putBoolean("need_collect_real_sdk_set", GI9.LIZ(jSONObject, "need_collect_real_sdk_set"));
            }
            if (jSONObject.has("need_request_if_sdk_list_is_empty")) {
                LIZ2.putBoolean("need_request_if_sdk_list_is_empty", GI9.LIZ(jSONObject, "need_request_if_sdk_list_is_empty"));
            }
            if (jSONObject.has("enable_hook_resume_activity")) {
                LIZ2.putBoolean("enable_hook_resume_activity", GI9.LIZ(jSONObject, "enable_hook_resume_activity"));
            }
            if (jSONObject.has("block_list_of_activity")) {
                LIZ2.putString("block_list_of_activity", jSONObject.optString("block_list_of_activity"));
            }
            if (jSONObject.has("enable_handle_foreground_service_crash")) {
                LIZ2.putBoolean("enable_handle_foreground_service_crash", GI9.LIZ(jSONObject, "enable_handle_foreground_service_crash"));
            }
            if (jSONObject.has("enable_pass_through")) {
                LIZ2.putBoolean("enable_pass_through", GI9.LIZ(jSONObject, "enable_pass_through"));
            }
            if (jSONObject.has("boot_time_precision")) {
                LIZ2.putString("boot_time_precision", jSONObject.optString("boot_time_precision"));
            }
            LIZ2.apply();
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public void registerValChanged(Context context, String str, String str2, IDataChangedListener iDataChangedListener) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{context, str, str2, iDataChangedListener}, this, LIZ, false, 20).isSupported && (abstractC13886i = this.LIZIZ) != null) {
            abstractC13886i.LIZ(context, str, str2, iDataChangedListener);
        }
    }
}
