package com.bytedance.android.live.liveinteract.doublepk.widget;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.doublepk.api.LinkDoublePkApi;
import com.bytedance.android.live.liveinteract.doublepk.core.AbstractC4404d;
import com.bytedance.android.live.liveinteract.doublepk.core.C4398a;
import com.bytedance.android.live.liveinteract.p382pk.AbstractC4725a;
import com.bytedance.android.live.liveinteract.plantform.api.LinkProfitApi;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.model.interact.C6174n;
import com.bytedance.android.livesdk.chatroom.p517u.AbstractC6302f;
import com.bytedance.android.livesdk.chatroom.p517u.C6305j;
import com.bytedance.android.livesdk.chatroom.p517u.C6307m;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.LinkerDetail;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC413392Xt;
import p003X.AbstractC426192th;
import p003X.AbstractC77591GiP;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C409882Kg;
import p003X.C423702pg;
import p003X.C436983Qm;
import p003X.C77245Gcp;
import p003X.C77246Gcq;
import p003X.C77247Gcr;
import p003X.C77274GdI;
import p003X.C77275GdJ;
import p003X.C77277GdL;
import p003X.C77510Gh6;
import p003X.C78441Gw7;
import p003X.C78442Gw8;
import p003X.C78445GwB;
import p003X.C78454GwK;
import p003X.C78571GyD;
import p003X.C78828H5q;
import p003X.C79242HLo;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.DialogC77499Ggv;
import p003X.DialogC77505Gh1;
import p003X.DialogC77508Gh4;
import p003X.IQV;
import p003X.IQX;
import p003X.LK5;
import p003X.QB4;

/* loaded from: classes3.dex */
public final class DoublePkBusinessWidget extends RoomWidget implements Observer<KVData>, AbstractC4725a, OnMessageListener, OnMessageListener {
    public static ChangeQuickRedirect LIZ;
    public CompositeDisposable LIZIZ = new CompositeDisposable();
    public Disposable LIZJ;
    public C6307m LIZLLL;

    /* renamed from: LJ */
    public boolean f26314LJ;
    public C6174n LJFF;
    public boolean LJI;
    public IMessageManager LJII;
    public DoublePkViewWidget LJIIIIZZ;
    public long LJIIIZ;
    public boolean LJIIJ;

    static {
        Covode.recordClassIndex(26839);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 24).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.p382pk.AbstractC4725a
    public final boolean LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 21);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C4398a.LIZJ.LIZJ();
    }

    public DoublePkBusinessWidget() {
        C6307m c6307m;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ;
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJJZZIII = LJJJI.LJJZZIII()) != null && (LIZIZ = LJJZZIII.LIZIZ()) != null) {
            c6307m = LIZIZ.LIZIZ();
        } else {
            c6307m = null;
        }
        this.LIZLLL = c6307m;
    }

    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C423702pg.LIZIZ(this.dataCenter, false, 1, null);
    }

    @Override // com.bytedance.android.live.liveinteract.p382pk.AbstractC4725a
    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[0], C78454GwK.LIZIZ, C78454GwK.LIZ, false, 12).isSupported) {
            C78828H5q.LIZ(9, "Link_panel", "link_function_panel");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.p382pk.AbstractC4725a
    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[0], C78454GwK.LIZIZ, C78454GwK.LIZ, false, 13).isSupported) {
            C78828H5q.LIZIZ(9, "Link_panel", "link_function_panel");
        }
    }

    public final long LJFF() {
        C2WC<Room> LIZ2;
        Room LIZ3;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 19);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        C5923dp LIZ4 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ4 != null && (LIZ2 = LIZ4.LIZ()) != null && (LIZ3 = LIZ2.LIZ()) != null) {
            return LIZ3.getRoomId();
        }
        return 0L;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            return;
        }
        super.onDestroy();
        this.LIZIZ.dispose();
        Disposable disposable = this.LIZJ;
        if (disposable != null) {
            disposable.dispose();
        }
        IMessageManager iMessageManager = this.LJII;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        LJII();
    }

    private final void LJII() {
        C2WC<Integer> LJFF;
        C2WD<Long> LJI;
        C2WD<String> m15740LJ;
        C2WD<AbstractC4404d> LIZLLL;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        C4398a LIZ2 = C4398a.LIZJ.LIZ();
        if (LIZ2 != null && (LIZLLL = LIZ2.LIZLLL()) != null) {
            LIZLLL.LIZ(null);
        }
        C4398a LIZ3 = C4398a.LIZJ.LIZ();
        if (LIZ3 != null && (m15740LJ = LIZ3.m15740LJ()) != null) {
            m15740LJ.LIZ(null);
        }
        C4398a LIZ4 = C4398a.LIZJ.LIZ();
        if (LIZ4 != null && (LJI = LIZ4.LJI()) != null) {
            LJI.LIZ(null);
        }
        C4398a LIZ5 = C4398a.LIZJ.LIZ();
        if (LIZ5 != null && (LJFF = LIZ5.LJFF()) != null) {
            LJFF.LIZ(0);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.p382pk.AbstractC4725a
    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        SettingKey<Integer[]> settingKey = LiveConfigSettingKeys.LINK_DOUBLE_PK_SUPPORT_SCENE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Integer[] value = settingKey.getValue();
        if (value == null) {
            return false;
        }
        if (LIZ()) {
            float LIZ2 = C436983Qm.LIZ(true);
            if (ArraysKt___ArraysKt.contains(value, Integer.valueOf(C79242HLo.LJIIJ()))) {
                if (LIZ2 > 0.0f) {
                    SettingKey<Float> settingKey2 = LiveConfigSettingKeys.LIVE_DOUBLE_PK_PERFORMANCE_LIMIT;
                    Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                    Float value2 = settingKey2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "");
                    if (LIZ2 >= value2.floatValue()) {
                    }
                }
                return true;
            }
            return false;
        }
        return ArraysKt___ArraysKt.contains(value, Integer.valueOf(C79242HLo.LJIIJ()));
    }

    /* renamed from: LJ */
    public final void m15739LJ() {
        AbstractC413392Xt<C6305j> LJJJJZ;
        C6305j LIZIZ;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        ALogger.m15801d("DoublePk_DoublePkBusinessWidget", "unloadPkViewWidget");
        if (this.LJIIIIZZ != null) {
            LJII();
            this.subWidgetManager.unload(this.LJIIIIZZ);
            this.LJIIIIZZ = null;
            C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
            if (LIZ2 != null && (LJJJJZ = LIZ2.LJJJJZ()) != null && (LIZIZ = LJJJJZ.LIZIZ()) != null) {
                LIZIZ.LIZ(18);
            }
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        C2WC<Room> LIZ2;
        Room LIZ3;
        LinkerDetail linkerDetail;
        List<Long> list;
        C2WC<Room> LIZ4;
        Room LIZ5;
        boolean z;
        ArrayList<Integer> arrayList;
        C2WD<ArrayList<Integer>> LLLIIII;
        C2WD<ArrayList<Integer>> LLLIIII2;
        C5923dp LJJJI;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ;
        Observable<C6307m> mo15536LJ;
        Disposable subscribe;
        AbstractC426192th<Boolean> LIZJ;
        Observable<Boolean> LIZIZ2;
        Disposable subscribe2;
        ArrayList arrayList2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onCreate();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            Pair LIZ6 = IQV.LIZ((Function0) DoublePkBusinessWidget$initDataContext$pair$1.INSTANCE);
            C4398a c4398a = (C4398a) LIZ6.getFirst();
            c4398a.LIZ().LIZIZ(this);
            IQX.LIZ(c4398a, AbstractC77591GiP.class);
            this.LIZIZ.add((Disposable) LIZ6.getSecond());
        }
        if (LIZ()) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
                ALogger.m15801d("DoublePk_DoublePkBusinessWidget", "fetchConfig");
                long currentTimeMillis = System.currentTimeMillis();
                this.LIZIZ.add(((LinkProfitApi) C88306Kqq.LIZ().LIZ(LinkProfitApi.class)).fetchTeamFightConfig(3).compose(C100839PnV.LIZJ()).subscribe(new C77275GdJ(currentTimeMillis), new C77245Gcp<>(currentTimeMillis)));
            }
        } else {
            C5923dp LIZ7 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
            if (LIZ7 != null && (LIZ2 = LIZ7.LIZ()) != null && (LIZ3 = LIZ2.LIZ()) != null && (linkerDetail = LIZ3.linkerDetail) != null && (list = linkerDetail.LIZIZ) != null && list.contains(18L) && !PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
                ALogger.m15801d("DoublePk_DoublePkBusinessWidget", "fetchTeamFightInfo");
                long currentTimeMillis2 = System.currentTimeMillis();
                C5923dp LIZ8 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                if (LIZ8 != null && (LIZ4 = LIZ8.LIZ()) != null && (LIZ5 = LIZ4.LIZ()) != null) {
                    QB4.LIZ(((LinkDoublePkApi) C88306Kqq.LIZ().LIZ(LinkDoublePkApi.class)).getPlayModeInfo(LIZ5.getId()).compose(C100839PnV.LIZJ()).subscribe(new C78441Gw7(this, currentTimeMillis2), new C77246Gcq<>(this, currentTimeMillis2)), this.LIZIZ);
                }
            }
        }
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null && (arrayList2 = (ArrayList) dataCenter.get("data_online_changed_list", (String) new ArrayList())) != null && arrayList2.size() > 6) {
            z = false;
        } else {
            z = true;
        }
        this.LJIIJ = z;
        this.dataCenter.observe("data_online_changed_list", this);
        C4398a LIZ9 = C4398a.LIZJ.LIZ();
        if (LIZ9 != null && (LIZJ = LIZ9.LIZJ()) != null && (LIZIZ2 = LIZJ.LIZIZ()) != null && (subscribe2 = LIZIZ2.subscribe(new C77277GdL(this))) != null) {
            QB4.LIZ(subscribe2, this.LIZIZ);
        }
        this.LJII = (IMessageManager) this.dataCenter.get("data_message_manager");
        IMessageManager iMessageManager = this.LJII;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(MessageType.LINK_TEAM_FIGHT_MESSAGE.LIZ(), this);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported && (LJJJI = LJJJI()) != null && (LJJZZIII = LJJJI.LJJZZIII()) != null && (LIZIZ = LJJZZIII.LIZIZ()) != null && (mo15536LJ = LIZIZ.mo15536LJ()) != null && (subscribe = mo15536LJ.subscribe(new C78442Gw8(new DoublePkBusinessWidget$initSceneSwitchListener$1(this)))) != null) {
            QB4.LIZ(subscribe, this.LIZIZ);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported && LIZ()) {
            C5923dp LIZ10 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
            if (LIZ10 != null && (LLLIIII2 = LIZ10.LLLIIII()) != null) {
                arrayList = LLLIIII2.LIZ();
            } else {
                arrayList = null;
            }
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{arrayList}, null, C78571GyD.LIZ, true, 7);
            if (proxy.isSupported) {
                if (!((Boolean) proxy.result).booleanValue()) {
                    return;
                }
            } else if (arrayList == null || !arrayList.contains(18)) {
                return;
            }
            ALogger.m15801d("DoublePk_DoublePkBusinessWidget", "handleSchema");
            C5923dp LIZ11 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
            if (LIZ11 != null && (LLLIIII = LIZ11.LLLIIII()) != null) {
                LLLIIII.LIZ(null);
            }
            C77510Gh6.LIZ(this, 0, 0, 3, null);
        }
    }

    public static boolean LIZ(C6307m c6307m) {
        if (c6307m != null && c6307m.LIZIZ == 12 && c6307m.LIZLLL == 10) {
            return true;
        }
        return false;
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        String str;
        KVData kVData2 = kVData;
        boolean z = true;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZ, false, 23).isSupported) {
            if (kVData2 != null) {
                str = kVData2.getKey();
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str, "data_online_changed_list")) {
                List list = (List) kVData2.getData();
                if (list == null) {
                    list = new ArrayList();
                }
                if (list.size() > 6) {
                    z = false;
                }
                this.LJIIJ = z;
            }
        }
    }

    public final void LIZ(C6174n c6174n) {
        AbstractC413392Xt<C6305j> LJJJJZ;
        C6305j LIZIZ;
        if (PatchProxy.proxy(new Object[]{c6174n}, this, LIZ, false, 15).isSupported) {
            return;
        }
        ALogger.m15801d("DoublePk_DoublePkBusinessWidget", "loadPkViewWidget");
        if (this.LJIIIIZZ != null) {
            ALogger.m15801d("DoublePk_DoublePkBusinessWidget", "PkWidget is loaded");
            return;
        }
        if (LIZ()) {
            C78445GwB.LIZIZ.LIZ();
        }
        enableSubWidgetManager();
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        this.LJIIIIZZ = new DoublePkViewWidget(dataCenter, c6174n);
        this.subWidgetManager.load(2131172785, this.LJIIIIZZ);
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ2 != null && (LJJJJZ = LIZ2.LJJJJZ()) != null && (LIZIZ = LJJJJZ.LIZIZ()) != null) {
            LIZIZ.LIZIZ(18);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.p382pk.AbstractC4725a
    public final void LIZ(DataCenter dataCenter) {
        AbstractC4404d abstractC4404d;
        C2WD<AbstractC4404d> LIZLLL;
        C2WD<AbstractC4404d> LIZLLL2;
        if (PatchProxy.proxy(new Object[]{dataCenter}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(dataCenter);
        ALogger.m15801d("DoublePk_DoublePkBusinessWidget", "showDoublePkPanel");
        if (!this.LJIIJ) {
            ALogger.m15800e("DoublePk_DoublePkBusinessWidget", "showDoublePkPanel fail, linkmic count > 6");
            C88440Kt0.LIZ(LK5.LIZ(2131582957));
            return;
        }
        C4398a LIZ2 = C4398a.LIZJ.LIZ();
        AbstractC4404d abstractC4404d2 = null;
        if (LIZ2 != null && (LIZLLL2 = LIZ2.LIZLLL()) != null) {
            abstractC4404d = LIZLLL2.LIZ();
        } else {
            abstractC4404d = null;
        }
        if (abstractC4404d != null) {
            C4398a LIZ3 = C4398a.LIZJ.LIZ();
            if (LIZ3 != null && (LIZLLL = LIZ3.LIZLLL()) != null) {
                abstractC4404d2 = LIZLLL.LIZ();
            }
            if (!(abstractC4404d2 instanceof AbstractC4404d.C4407c) && !(abstractC4404d2 instanceof AbstractC4404d.C4405a)) {
                if (abstractC4404d2 instanceof AbstractC4404d.C4406b) {
                    ALogger.m15801d("DoublePk_DoublePkBusinessWidget", "show StopDoublePkSettingDialog");
                    Context context = this.context;
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    C116971W2r.LIZJ(new DialogC77508Gh4(context, dataCenter));
                    return;
                }
                return;
            }
            ALogger.m15801d("DoublePk_DoublePkBusinessWidget", "show DoublePkSettingDialog");
            Context context2 = this.context;
            Intrinsics.checkNotNullExpressionValue(context2, "");
            C116971W2r.LIZJ(new DialogC77505Gh1(context2, dataCenter));
            return;
        }
        ALogger.m15801d("DoublePk_DoublePkBusinessWidget", "show DoublePkSwitchDialog");
        Context context3 = this.context;
        Intrinsics.checkNotNullExpressionValue(context3, "");
        C116971W2r.LIZJ(new DialogC77499Ggv(context3, dataCenter));
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x022a, code lost:
        if (r0.intValue() == 1) goto L90;
     */
    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMessage(com.p1594ss.ugc.live.sdk.message.data.IMessage r17) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.doublepk.widget.DoublePkBusinessWidget.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    @Override // com.bytedance.android.live.liveinteract.p382pk.AbstractC4725a
    public final void LIZ(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 11).isSupported) {
            return;
        }
        ALogger.m15801d("DoublePk_DoublePkBusinessWidget", "openDoublePk");
        if (this.LJI) {
            ALogger.m15800e("DoublePk_DoublePkBusinessWidget", "openDoublePk fail, isTurningOn");
        } else if (!this.LJIIJ) {
            ALogger.m15800e("DoublePk_DoublePkBusinessWidget", "openDoublePk fail, linkmic count > 6");
            C88440Kt0.LIZ(LK5.LIZ(2131582957));
        } else {
            C78445GwB c78445GwB = C78445GwB.LIZIZ;
            if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, c78445GwB, C78445GwB.LIZ, false, 1).isSupported) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", i);
                jSONObject.put("score_type", i2);
                c78445GwB.LIZ(jSONObject);
                C78445GwB.LIZ(c78445GwB, "doublepk_play_mode_start", jSONObject, null, 4, null);
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.LJI = true;
            QB4.LIZ(((LinkDoublePkApi) C88306Kqq.LIZ().LIZ(LinkDoublePkApi.class)).createDoublePk(LJFF(), i, i2, true).compose(C100839PnV.LIZJ()).subscribe(new C77274GdI(this, i, i2, currentTimeMillis), new C77247Gcr<>(this, currentTimeMillis)), this.LIZIZ);
        }
    }
}
