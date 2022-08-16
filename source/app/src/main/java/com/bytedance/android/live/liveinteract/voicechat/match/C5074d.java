package com.bytedance.android.live.liveinteract.voicechat.match;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.chatroom.model.C6192s;
import com.bytedance.android.livesdk.chatroom.model.C6193t;
import com.bytedance.android.livesdk.config.C6884cf;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.TTLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.service.ILiveService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.live.datacontext.C13491f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p003X.AbstractC100130Pc4;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C18G;
import p003X.C536537Hj;
import p003X.C76991GWz;
import p003X.C78829H5r;
import p003X.H7R;
import p003X.H7T;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.match.d */
/* loaded from: classes3.dex */
public final class C5074d extends C13491f {
    public static ChangeQuickRedirect LIZ;
    public final MutableLiveData<Boolean> LIZJ;
    public MutableLiveData<Boolean> LIZLLL;
    public final MutableLiveData<Boolean> LJFF;
    public final MutableLiveData<Integer> LJI;
    public MutableLiveData<Boolean> LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public long LJIIL;
    public Disposable LJIILIIL;
    public Disposable LJIILJJIL;
    public Disposable LJIILL;
    public Disposable LJIILLIIL;
    public boolean LJIIZILJ;
    public Disposable LJIJI;
    public final MutableLiveData<C6192s> LIZIZ = new MutableLiveData<>();

    /* renamed from: LJ */
    public MutableLiveData<Integer> f26493LJ = new MutableLiveData<>();
    public final long LJIJ = 3;
    public final long LJIIJ = 3;
    public boolean LJIIJJI = true;

    static {
        Covode.recordClassIndex(31547);
    }

    public final void LIZJ() {
        Disposable disposable;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported && (disposable = this.LJIILL) != null) {
            disposable.dispose();
        }
    }

    private void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported) {
            return;
        }
        this.LIZIZ.setValue(null);
        this.f26493LJ.setValue(null);
        this.LIZJ.setValue(Boolean.FALSE);
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            return;
        }
        this.LIZJ.setValue(Boolean.FALSE);
        Disposable disposable = this.LJIJI;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.LJIILIIL;
        if (disposable2 != null) {
            disposable2.dispose();
        }
    }

    /* renamed from: LJ */
    public final void m15644LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            return;
        }
        Disposable disposable = this.LJIILJJIL;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.LJIJI;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        Disposable disposable3 = this.LJIILIIL;
        if (disposable3 != null) {
            disposable3.dispose();
        }
        Disposable disposable4 = this.LJIILLIIL;
        if (disposable4 != null) {
            disposable4.dispose();
        }
        LJFF();
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        Disposable disposable = this.LJIILL;
        if (disposable != null) {
            disposable.dispose();
        }
        Ref.IntRef intRef = new Ref.IntRef();
        SettingKey<C6884cf> settingKey = LiveSettingKeys.LIVE_FAST_MATCH_SETTINGS;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        intRef.element = settingKey.getValue().LIZ;
        if (intRef.element <= 0) {
            return;
        }
        this.LJIILL = C536537Hj.LIZ(1L, 1L, TimeUnit.SECONDS).compose(C100839PnV.LIZJ()).subscribe(new H7R(this, intRef));
    }

    public final boolean LIZ() {
        String str;
        AbstractC100130Pc4 liveOntologyRecord;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 18);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        ILiveService liveService = TTLiveService.getLiveService();
        if (liveService != null && (liveOntologyRecord = liveService.getLiveOntologyRecord()) != null) {
            str = liveOntologyRecord.LIZIZ();
        } else {
            str = null;
        }
        return TextUtils.equals("homepage_fresh", str);
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LJIIIZ = z;
        this.LIZLLL.setValue(Boolean.TRUE);
    }

    public C5074d(DataCenter dataCenter) {
        C106862S5w.LIZ(dataCenter);
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(Boolean.FALSE);
        this.LIZJ = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(Boolean.FALSE);
        this.LIZLLL = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        mutableLiveData3.setValue(Boolean.FALSE);
        this.LJFF = mutableLiveData3;
        MutableLiveData<Integer> mutableLiveData4 = new MutableLiveData<>();
        mutableLiveData4.setValue(0);
        this.LJI = mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>();
        mutableLiveData5.setValue(Boolean.FALSE);
        this.LJII = mutableLiveData5;
    }

    public final void LIZIZ(C6192s c6192s) {
        long j;
        if (PatchProxy.proxy(new Object[]{c6192s}, this, LIZ, false, 19).isSupported) {
            return;
        }
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = c6192s.LJIIIZ;
        if (longRef.element > 0) {
            j = longRef.element;
        } else {
            j = this.LJIIJ;
        }
        longRef.element = j;
        this.f26493LJ.setValue(Integer.valueOf((int) longRef.element));
        if (this.LJIIZILJ) {
            return;
        }
        this.LJIILJJIL = C536537Hj.LIZ(0L, 1L, TimeUnit.SECONDS).take(longRef.element + 1).map(new Function<Long, Long>() { // from class: X.1ZD
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(31557);
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Long, java.lang.Object] */
            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Long apply(Long l) {
                long longValue = l.longValue();
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(longValue)}, this, LIZ, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                return Long.valueOf(Ref.LongRef.this.element - longValue);
            }
        }).compose(C100839PnV.LIZJ()).subscribe(new C76991GWz(this));
    }

    public final void LIZ(C6192s c6192s) {
        if (PatchProxy.proxy(new Object[]{c6192s}, this, LIZ, false, 17).isSupported) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<C6193t> list = c6192s.LJI;
        if (list != null) {
            for (C6193t c6193t : list) {
                String str = c6193t.LIZ;
                Intrinsics.checkNotNullExpressionValue(str, "");
                String str2 = c6193t.LIZIZ;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                linkedHashMap.put(str, str2);
            }
        }
        if (!PatchProxy.proxy(new Object[]{linkedHashMap}, C78829H5r.LJFF, C78829H5r.LIZ, false, 3).isSupported) {
            C106862S5w.LIZ(linkedHashMap);
            C78829H5r.LIZJ = linkedHashMap;
        }
    }

    public final void LIZ(Room room, int i) {
        if (PatchProxy.proxy(new Object[]{room, Integer.valueOf(i)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        m15644LJ();
        LIZ(room, true, i);
    }

    private void LIZ(Room room, boolean z, int i) {
        if (PatchProxy.proxy(new Object[]{room, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)}, this, LIZ, false, 10).isSupported) {
            return;
        }
        this.LJFF.setValue(Boolean.valueOf(z));
        this.LJI.setValue(Integer.valueOf(i));
        if (room != null) {
            this.LIZJ.setValue(Boolean.TRUE);
            Disposable disposable = this.LJIJI;
            if (disposable != null) {
                disposable.dispose();
            }
            this.LJIIJJI = true;
            this.LJIIL = System.currentTimeMillis();
            this.LJIJI = C536537Hj.LIZ(1L, this.LJIJ, TimeUnit.SECONDS).compose(C100839PnV.LIZJ()).subscribe(new H7T(room, this, i, z), C18G.LIZ);
        }
    }

    public static /* synthetic */ void LIZ(C5074d c5074d, boolean z, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{c5074d, (byte) 0, 1, null}, null, LIZ, true, 5).isSupported) {
            return;
        }
        c5074d.LIZ(false);
    }

    public static /* synthetic */ void LIZ(C5074d c5074d, Room room, boolean z, int i, int i2, Object obj) {
        if (PatchProxy.proxy(new Object[]{c5074d, room, (byte) 0, Integer.valueOf(i), Integer.valueOf(i2), null}, null, LIZ, true, 11).isSupported) {
            return;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        c5074d.LIZ(room, false, i);
    }
}
