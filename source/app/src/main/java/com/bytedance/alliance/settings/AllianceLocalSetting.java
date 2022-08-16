package com.bytedance.alliance.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.ILocalSettings;
import com.bytedance.push.settings.annotation.Settings;

@Settings(storageKey = "alliance_sp_local")
/* loaded from: classes2.dex */
public interface AllianceLocalSetting extends ILocalSettings {
    static {
        Covode.recordClassIndex(10003);
    }

    String LIZ();

    void LIZ(long j);

    void LIZ(String str);

    void LIZ(boolean z);

    long LIZIZ();

    void LIZIZ(long j);

    void LIZIZ(String str);

    void LIZIZ(boolean z);

    String LIZJ();

    void LIZJ(long j);

    void LIZJ(String str);

    void LIZJ(boolean z);

    long LIZLLL();

    void LIZLLL(long j);

    void LIZLLL(String str);

    /* renamed from: LJ */
    String mo15998LJ();

    /* renamed from: LJ */
    void mo15997LJ(long j);

    /* renamed from: LJ */
    void mo15996LJ(String str);

    long LJFF();

    void LJFF(String str);

    String LJI();

    void LJI(String str);

    boolean LJII();

    long LJIIIIZZ();

    long LJIIIZ();

    boolean LJIIJ();

    boolean LJIIJJI();

    String LJIIL();

    String LJIILIIL();
}
