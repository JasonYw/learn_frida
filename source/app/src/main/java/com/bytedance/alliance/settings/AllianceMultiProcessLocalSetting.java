package com.bytedance.alliance.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.ILocalSettings;
import com.bytedance.push.settings.annotation.Settings;

@Settings(storageKey = "multi_process_alliance_sp_local", supportMultiProcess = true)
/* loaded from: classes2.dex */
public interface AllianceMultiProcessLocalSetting extends ILocalSettings {
    static {
        Covode.recordClassIndex(10006);
    }

    String LIZ();

    void LIZ(String str);

    void LIZ(boolean z);

    String LIZIZ();

    void LIZIZ(String str);

    void LIZIZ(boolean z);

    boolean LIZJ();

    boolean LIZLLL();
}
