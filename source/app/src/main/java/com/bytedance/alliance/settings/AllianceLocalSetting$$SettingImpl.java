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
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.util.ArrayList;
import java.util.Iterator;
import p003X.C74476FYg;
import p003X.GI9;
import p003X.GIC;

/* loaded from: classes2.dex */
public class AllianceLocalSetting$$SettingImpl implements AllianceLocalSetting {
    public static ChangeQuickRedirect LIZ;
    public AbstractC13886i LIZIZ;
    public final ArrayList<Migration> LIZJ = new ArrayList<>();
    public final AbstractC13882b LIZLLL = new AbstractC13882b(this) { // from class: com.bytedance.alliance.settings.AllianceLocalSetting$$SettingImpl.1
        public static ChangeQuickRedirect LIZ;

        static {
            if (ReDexClinitStringAb.abTest >= 5) {
                Covode.recordClassIndex(10005);
            } else {
                Covode.recordClassIndex(10005);
            }
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
        Covode.recordClassIndex(10004);
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final String LIZ() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("self_partner_name")) {
            return this.LIZIZ.LIZ("self_partner_name");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("self_partner_name") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                String string = next.getString("self_partner_name");
                LIZ2.putString("self_partner_name", string);
                LIZ2.apply();
                return string;
            }
        }
        return "";
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final long LIZIZ() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("last_request_config_time_in_millisecond")) {
            return this.LIZIZ.LIZJ("last_request_config_time_in_millisecond");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("last_request_config_time_in_millisecond") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                long LIZ3 = next.LIZ("last_request_config_time_in_millisecond");
                LIZ2.putLong("last_request_config_time_in_millisecond", LIZ3);
                LIZ2.apply();
                return LIZ3;
            }
        }
        return 0L;
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final String LIZJ() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("wake_up_partners_v2")) {
            return this.LIZIZ.LIZ("wake_up_partners_v2");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("wake_up_partners_v2") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                String string = next.getString("wake_up_partners_v2");
                LIZ2.putString("wake_up_partners_v2", string);
                LIZ2.apply();
                return string;
            }
        }
        return "";
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final long LIZLLL() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("next_request_config_interval_in_second")) {
            return this.LIZIZ.LIZJ("next_request_config_interval_in_second");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("next_request_config_interval_in_second") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                long LIZ3 = next.LIZ("next_request_config_interval_in_second");
                LIZ2.putLong("next_request_config_interval_in_second", LIZ3);
                LIZ2.apply();
                return LIZ3;
            }
        }
        return 300L;
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    /* renamed from: LJ */
    public final String mo15998LJ() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("last_valid_request_result")) {
            return this.LIZIZ.LIZ("last_valid_request_result");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("last_valid_request_result") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                String string = next.getString("last_valid_request_result");
                LIZ2.putString("last_valid_request_result", string);
                LIZ2.apply();
                return string;
            }
        }
        return "";
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final long LJFF() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("conservative_wakeup_interval_in_second")) {
            return this.LIZIZ.LIZJ("conservative_wakeup_interval_in_second");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("conservative_wakeup_interval_in_second") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                long LIZ3 = next.LIZ("conservative_wakeup_interval_in_second");
                LIZ2.putLong("conservative_wakeup_interval_in_second", LIZ3);
                LIZ2.apply();
                return LIZ3;
            }
        }
        return 300L;
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final String LJI() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 27);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("wake_up_pair_aid_and_device_ids")) {
            return this.LIZIZ.LIZ("wake_up_pair_aid_and_device_ids");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("wake_up_pair_aid_and_device_ids") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                String string = next.getString("wake_up_pair_aid_and_device_ids");
                LIZ2.putString("wake_up_pair_aid_and_device_ids", string);
                LIZ2.apply();
                return string;
            }
        }
        return "";
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final boolean LJII() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 29);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("is_strategy_by_server")) {
            return this.LIZIZ.mo14285LJ("is_strategy_by_server");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("is_strategy_by_server") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                boolean LIZ3 = GI9.LIZ(next, "is_strategy_by_server");
                LIZ2.putBoolean("is_strategy_by_server", LIZ3);
                LIZ2.apply();
                return LIZ3;
            }
        }
        return false;
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final long LJIIIIZZ() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 31);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("last_request_compose_data_time_in_millisecond")) {
            return this.LIZIZ.LIZJ("last_request_compose_data_time_in_millisecond");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("last_request_compose_data_time_in_millisecond") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                long LIZ3 = next.LIZ("last_request_compose_data_time_in_millisecond");
                LIZ2.putLong("last_request_compose_data_time_in_millisecond", LIZ3);
                LIZ2.apply();
                return LIZ3;
            }
        }
        return 0L;
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final long LJIIIZ() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 33);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("next_request_compose_data_time_in_second")) {
            return this.LIZIZ.LIZJ("next_request_compose_data_time_in_second");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("next_request_compose_data_time_in_second") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                long LIZ3 = next.LIZ("next_request_compose_data_time_in_second");
                LIZ2.putLong("next_request_compose_data_time_in_second", LIZ3);
                LIZ2.apply();
                return LIZ3;
            }
        }
        return 5L;
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final boolean LJIIJ() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 35);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("enable_uri_config")) {
            return this.LIZIZ.mo14285LJ("enable_uri_config");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("enable_uri_config") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                boolean LIZ3 = GI9.LIZ(next, "enable_uri_config");
                LIZ2.putBoolean("enable_uri_config", LIZ3);
                LIZ2.apply();
                return LIZ3;
            }
        }
        return true;
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final boolean LJIIJJI() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 37);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("support_wakeup")) {
            return this.LIZIZ.mo14285LJ("support_wakeup");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("support_wakeup") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                boolean LIZ3 = GI9.LIZ(next, "support_wakeup");
                LIZ2.putBoolean("support_wakeup", LIZ3);
                LIZ2.apply();
                return LIZ3;
            }
        }
        return false;
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final String LJIIL() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 39);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("connect_sdk_list")) {
            return this.LIZIZ.LIZ("connect_sdk_list");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("connect_sdk_list") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                String string = next.getString("connect_sdk_list");
                LIZ2.putString("connect_sdk_list", string);
                LIZ2.apply();
                return string;
            }
        }
        return "";
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final String LJIILIIL() {
        AbstractC13886i abstractC13886i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 41);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        AbstractC13886i abstractC13886i2 = this.LIZIZ;
        if (abstractC13886i2 != null && abstractC13886i2.LJFF("ab_version")) {
            return this.LIZIZ.LIZ("ab_version");
        }
        Iterator<Migration> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Migration next = it.next();
            if (next.LIZIZ("ab_version") && (abstractC13886i = this.LIZIZ) != null) {
                SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
                String string = next.getString("ab_version");
                LIZ2.putString("ab_version", string);
                LIZ2.apply();
                return string;
            }
        }
        return "";
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void unregisterValChanged(IDataChangedListener iDataChangedListener) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{iDataChangedListener}, this, LIZ, false, 44).isSupported && (abstractC13886i = this.LIZIZ) != null) {
            abstractC13886i.LIZ(iDataChangedListener);
        }
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final void LIZ(long j) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 4).isSupported && (abstractC13886i = this.LIZIZ) != null) {
            SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
            LIZ2.putLong("last_request_config_time_in_millisecond", j);
            LIZ2.apply();
        }
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final void LIZIZ(long j) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 8).isSupported && (abstractC13886i = this.LIZIZ) != null) {
            SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
            LIZ2.putLong("next_request_config_interval_in_second", j);
            LIZ2.apply();
        }
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final void LIZJ(long j) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 12).isSupported && (abstractC13886i = this.LIZIZ) != null) {
            SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
            LIZ2.putLong("conservative_wakeup_interval_in_second", j);
            LIZ2.apply();
        }
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final void LIZLLL(long j) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 32).isSupported && (abstractC13886i = this.LIZIZ) != null) {
            SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
            LIZ2.putLong("last_request_compose_data_time_in_millisecond", j);
            LIZ2.apply();
        }
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    /* renamed from: LJ */
    public final void mo15997LJ(long j) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 34).isSupported && (abstractC13886i = this.LIZIZ) != null) {
            SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
            LIZ2.putLong("next_request_compose_data_time_in_second", j);
            LIZ2.apply();
        }
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final void LJFF(String str) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 40).isSupported && (abstractC13886i = this.LIZIZ) != null) {
            SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
            LIZ2.putString("connect_sdk_list", str);
            LIZ2.apply();
        }
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final void LJI(String str) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 42).isSupported && (abstractC13886i = this.LIZIZ) != null) {
            SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
            LIZ2.putString("ab_version", str);
            LIZ2.apply();
        }
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final void LIZ(String str) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2).isSupported && (abstractC13886i = this.LIZIZ) != null) {
            SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
            LIZ2.putString("self_partner_name", str);
            LIZ2.apply();
        }
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final void LIZIZ(String str) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 6).isSupported && (abstractC13886i = this.LIZIZ) != null) {
            SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
            LIZ2.putString("wake_up_partners_v2", str);
            LIZ2.apply();
        }
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final void LIZJ(String str) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 10).isSupported && (abstractC13886i = this.LIZIZ) != null) {
            SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
            LIZ2.putString("last_valid_request_result", str);
            LIZ2.apply();
        }
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final void LIZLLL(String str) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 14).isSupported && (abstractC13886i = this.LIZIZ) != null) {
            SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
            LIZ2.putString("blacklist", str);
            LIZ2.apply();
        }
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    /* renamed from: LJ */
    public final void mo15996LJ(String str) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 28).isSupported && (abstractC13886i = this.LIZIZ) != null) {
            SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
            LIZ2.putString("wake_up_pair_aid_and_device_ids", str);
            LIZ2.apply();
        }
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final void LIZ(boolean z) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 30).isSupported && (abstractC13886i = this.LIZIZ) != null) {
            SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
            LIZ2.putBoolean("is_strategy_by_server", z);
            LIZ2.apply();
        }
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final void LIZIZ(boolean z) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 36).isSupported && (abstractC13886i = this.LIZIZ) != null) {
            SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
            LIZ2.putBoolean("enable_uri_config", z);
            LIZ2.apply();
        }
    }

    @Override // com.bytedance.alliance.settings.AllianceLocalSetting
    public final void LIZJ(boolean z) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 38).isSupported && (abstractC13886i = this.LIZIZ) != null) {
            SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
            LIZ2.putBoolean("support_wakeup", z);
            LIZ2.apply();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AllianceLocalSetting$$SettingImpl(Context context, AbstractC13886i abstractC13886i) {
        this.LIZIZ = abstractC13886i;
        this.LIZJ.add(C74476FYg.LIZ(GIC.class, this.LIZLLL));
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void registerValChanged(Context context, String str, String str2, IDataChangedListener iDataChangedListener) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{context, str, str2, iDataChangedListener}, this, LIZ, false, 43).isSupported && (abstractC13886i = this.LIZIZ) != null) {
            abstractC13886i.LIZ(context, str, str2, iDataChangedListener);
        }
    }
}
