package com.bytedance.alliance.base.component;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.alliance.bean.PassData;
import com.bytedance.alliance.bean.WakeUpLog;
import com.bytedance.alliance.bean.WakeupComponentType;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONObject;
import p003X.C76658GKe;
import p003X.G1U;
import p003X.GKZ;

/* loaded from: classes2.dex */
public class BaseReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect LIZ;
    public long LIZIZ = -1;

    static {
        Covode.recordClassIndex(9911);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle bundle;
        if (PatchProxy.proxy(new Object[]{context, intent}, this, LIZ, false, 1).isSupported) {
            return;
        }
        GKZ.LIZ().LIZ(context);
        this.LIZIZ = System.currentTimeMillis();
        boolean andSet = C76658GKe.LIZIZ.getAndSet(false);
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        if (bundle == null) {
            G1U.LIZIZ("BDAlliance", "receiver onReceive bundle is null");
            return;
        }
        String string = bundle.getString("md5");
        if (string != null && string.equals(DigestUtils.md5Hex("com.bytedance.push.alliance"))) {
            PassData passData = new PassData();
            passData.LIZIZ = bundle.getString("wakeup_device_id");
            passData.LIZJ = bundle.getString("wakeup_aid");
            passData.LIZLLL = bundle.getString("session_id");
            passData.f25590LJ = bundle.getString("alliance_sdk_version_code");
            passData.LJFF = bundle.getString("alliance_sdk_version_name");
            passData.LJI = bundle.getString("use_compose_data");
            passData.LJII = bundle.getString("compose_data_sign");
            passData.LJIIIIZZ = bundle.getString("compose_data");
            passData.LJIIIZ = bundle.getString("source_app_package");
            passData.LJIIJ = bundle.getString("source_app_name");
            passData.LJIIJJI = TextUtils.equals(bundle.getString("need_improve_process_adj"), "1");
            boolean z = !TextUtils.equals(bundle.getString("isolation"), "1");
            WakeUpLog wakeUpLog = new WakeUpLog();
            wakeUpLog.LIZJ = passData.LJIIIZ;
            wakeUpLog.LIZLLL = passData.LJIIJ;
            wakeUpLog.LIZIZ = "send_receiver";
            wakeUpLog.f25591LJ = passData.LIZLLL;
            wakeUpLog.LJFF = getClass().getName();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("extra_on_receive_timestamp", this.LIZIZ);
                jSONObject.put("initiative_alliance_sdk_version_name", passData.LJFF);
                jSONObject.put("initiative_alliance_sdk_version_code", passData.f25590LJ);
            } catch (Throwable unused) {
            }
            GKZ.LIZ().mo23834LJ().LIZ(context.getApplicationContext(), passData, wakeUpLog, andSet, jSONObject, z, WakeupComponentType.RECEIVER);
            return;
        }
        G1U.LIZIZ("BDAlliance", "receiver onReceive md5 check not pass");
    }
}
