package com.bytedance.android.live.broadcast.viewmodel;

import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.broadcast.model.AudioInteractMode;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.C6938du;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC414762bG;
import p003X.AbstractC80293Hkt;
import p003X.C87308Kak;
import p003X.C89718LWm;

/* renamed from: com.bytedance.android.live.broadcast.viewmodel.d */
/* loaded from: classes3.dex */
public final class C3258d extends ViewModel {
    public final List<AudioInteractMode> LIZ;
    public final AbstractC414762bG<AudioInteractMode> LIZIZ;

    static {
        Covode.recordClassIndex(18141);
    }

    public C3258d() {
        Object obj;
        SettingKey<C6938du> settingKey = LiveSettingKeys.LIVE_PREVIEW_AUDIO_INTERACT_SHORTCUT_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        List<C6938du.C6939a> LIZ = settingKey.getValue().LIZ();
        ArrayList arrayList = new ArrayList();
        for (C6938du.C6939a c6939a : LIZ) {
            AudioInteractMode LIZ2 = AudioInteractMode.Companion.LIZ(c6939a.LIZ);
            if (LIZ2 != null) {
                arrayList.add(LIZ2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((AudioInteractMode) obj2).f25910id == AudioInteractMode.KTV.f25910id) {
                SettingKey<Boolean> settingKey2 = LiveSettingKeys.LIVE_VOICE_CHAT_ROOM_SUPPORT_KTV_ROOM;
                Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                Boolean value = settingKey2.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (value.booleanValue()) {
                }
            }
            arrayList2.add(obj2);
        }
        ArrayList arrayList3 = arrayList2;
        this.LIZ = arrayList3.isEmpty() ? CollectionsKt__CollectionsJVMKt.listOf(AudioInteractMode.Radio) : arrayList3;
        C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.LJJLIL;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Integer LIZ3 = c87308Kak.LIZ();
        Iterator<T> it = this.LIZ.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                int i = ((AudioInteractMode) obj).f25910id;
                if (LIZ3 != null && i == LIZ3.intValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.LIZIZ = new C89718LWm(obj == null ? AudioInteractMode.Radio : obj, PreviewAudioInteractModeViewModel$4.INSTANCE);
    }
}
