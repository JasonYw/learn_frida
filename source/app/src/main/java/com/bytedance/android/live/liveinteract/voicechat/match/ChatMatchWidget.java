package com.bytedance.android.live.liveinteract.voicechat.match;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.tetris.widgets.LiveWidget;
import com.bytedance.android.live.liveinteract.api.chatroom.model.LinkApplyType;
import com.bytedance.android.live.liveinteract.api.chatroom.model.LinkMatchType;
import com.bytedance.android.live.liveinteract.api.fulllink.TalkRoomBusinessFullLinkMonitor;
import com.bytedance.android.live.liveinteract.plantform.api.LinkAudienceApi;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah;
import com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e;
import com.bytedance.android.live.liveinteract.voicechat.match.utils.ShakeUtils;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.config.C6885cg;
import com.bytedance.android.livesdk.config.C6991fu;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.log.p723a.AbstractC8644i;
import com.bytedance.android.livesdk.message.model.LinkMicGuideMessage;
import com.bytedance.android.livesdkapi.TTLiveService;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C9605p;
import com.bytedance.android.livesdkapi.service.ILiveService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.live.datacontext.C13491f;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.disposables.Disposable;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import p002O.C0002O;
import p003X.AbstractC100130Pc4;
import p003X.AbstractC4569445g;
import p003X.AbstractC77692Gk2;
import p003X.AbstractC80293Hkt;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C439993ar;
import p003X.C4574547f;
import p003X.C77627Giz;
import p003X.C77630Gj2;
import p003X.C78829H5r;
import p003X.C78832H5u;
import p003X.C78864H7a;
import p003X.C78865H7b;
import p003X.C78866H7c;
import p003X.C78868H7e;
import p003X.C79242HLo;
import p003X.C81173Hz5;
import p003X.C87308Kak;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.GXV;
import p003X.H61;
import p003X.H7Z;
import p003X.IQV;
import p003X.IQX;

/* loaded from: classes3.dex */
public final class ChatMatchWidget extends LiveWidget implements AbstractC4569445g, OnMessageListener {
    public static ChangeQuickRedirect LIZ;
    public static boolean LJII;
    public C78866H7c LIZIZ;
    public IMessageManager LIZJ;
    public AbstractC77692Gk2 LIZLLL;

    /* renamed from: LJ */
    public boolean f26492LJ;
    public C5074d LJIIIZ;
    public Disposable LJIIJ;
    public ShakeUtils LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public String LJIILJJIL;
    public static final C78865H7b LJIIIIZZ = new C78865H7b((byte) 0);
    public static String LJFF = "pop_panel";
    public static final String LJI = "ChatMatchWidget";

    public ChatMatchWidget() {
        this(false, 1);
    }

    public static final boolean LIZLLL() {
        return LJII;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 17).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    static {
        Covode.recordClassIndex(31465);
    }

    public final void LIZ() {
        C78866H7c c78866H7c;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported && (c78866H7c = this.LIZIZ) != null && c78866H7c.LJIILIIL()) {
            c78866H7c.dismiss();
        }
    }

    /* renamed from: LJ */
    private final boolean m15645LJ() {
        String str;
        AbstractC100130Pc4 liveOntologyRecord;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 13);
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

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        C5074d c5074d = this.LJIIIZ;
        if (c5074d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c5074d.m15644LJ();
        C78866H7c c78866H7c = this.LIZIZ;
        if (c78866H7c != null && c78866H7c.LJIILIIL()) {
            c78866H7c.dismiss();
        }
    }

    public final void LIZJ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported && !TextUtils.isEmpty(this.LJIILJJIL)) {
            C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f7075bx;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            Boolean LIZ2 = c87308Kak.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            if (LIZ2.booleanValue()) {
                C88440Kt0.LIZ(2131587687);
                C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.f7075bx;
                Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                c87308Kak2.LIZ(Boolean.FALSE);
            }
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onPause();
        ShakeUtils shakeUtils = this.LJIIJJI;
        if (shakeUtils != null) {
            shakeUtils.LIZJ();
        }
        C5074d c5074d = this.LJIIIZ;
        if (c5074d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (Intrinsics.areEqual(c5074d.LIZJ.getValue(), Boolean.TRUE)) {
            this.LJIIL = true;
        }
        LIZIZ();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onResume();
        ShakeUtils shakeUtils = this.LJIIJJI;
        if (shakeUtils != null) {
            shakeUtils.LIZIZ();
        }
        if (this.LJIIL) {
            this.LJIIL = false;
            C88440Kt0.LIZ(2131583156);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final void onStop() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onStop();
        C78866H7c c78866H7c = this.LIZIZ;
        if (c78866H7c != null && c78866H7c.LJIILIIL()) {
            c78866H7c.dismiss();
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        ALogger.m15801d(LJI, "onDestroy");
        super.onDestroy();
        C5074d c5074d = this.LJIIIZ;
        if (c5074d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            c5074d.m15644LJ();
        }
        Disposable disposable = this.LJIIJ;
        if (disposable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            disposable.dispose();
        }
        C78866H7c c78866H7c = this.LIZIZ;
        if (c78866H7c != null && c78866H7c.LJIILIIL()) {
            c78866H7c.dismiss();
        }
        IMessageManager iMessageManager = this.LIZJ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        ShakeUtils shakeUtils = this.LJIIJJI;
        if (shakeUtils != null) {
            shakeUtils.LIZ();
        }
        ShakeUtils shakeUtils2 = this.LJIIJJI;
        if (shakeUtils2 != null) {
            shakeUtils2.LIZLLL();
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        long j;
        C2WC<Room> LIZ2;
        LinkApplyType linkApplyType;
        LinkApplyType linkApplyType2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        ALogger.m15801d(LJI, "onCreate");
        super.onCreate();
        Pair LIZ3 = IQV.LIZ((Function0) new ChatMatchWidget$onCreate$pair$1(this));
        this.LJIIIZ = (C5074d) LIZ3.getFirst();
        this.LJIIJ = (Disposable) LIZ3.getSecond();
        IQX.LIZ((C13491f) LIZ3.getFirst(), LJI);
        Object obj = this.dataCenter.get("data_is_anchor", (String) Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        this.LJIILIIL = ((Boolean) obj).booleanValue();
        C5074d c5074d = this.LJIIIZ;
        if (c5074d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c5074d.LJIIZILJ = this.LJIILIIL;
        C5074d c5074d2 = this.LJIIIZ;
        if (c5074d2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            MutableLiveData<Boolean> mutableLiveData = c5074d2.LIZLLL;
            if (mutableLiveData != null) {
                mutableLiveData.observeForever(new C78868H7e(this));
            }
        }
        Room room = null;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            AbstractC8644i LIZ4 = C4574547f.LIZ().LIZ(C8668v.class);
            if (!(LIZ4 instanceof C81173Hz5)) {
                LIZ4 = null;
            }
            C81173Hz5 c81173Hz5 = (C81173Hz5) LIZ4;
            if (c81173Hz5 != null) {
                C5074d c5074d3 = this.LJIIIZ;
                if (c5074d3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                if (!c5074d3.LJIIIIZZ && !TextUtils.equals("draw", c81173Hz5.LIZ().get("action_type")) && (Intrinsics.areEqual(c81173Hz5.f7395LJ, "match") || Intrinsics.areEqual(c81173Hz5.f7395LJ, "shake"))) {
                    C5074d c5074d4 = this.LJIIIZ;
                    if (c5074d4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    c5074d4.LJIIIIZZ = true;
                    if (C79242HLo.LJIILLIIL()) {
                        AbstractC4767ah LIZ5 = AbstractC4767ah.LIZIZ.LIZ();
                        if (LIZ5 != null) {
                            int i = C78832H5u.LJFF;
                            if (m15645LJ()) {
                                linkApplyType2 = LinkApplyType.CITY;
                            } else {
                                linkApplyType2 = LinkApplyType.MATCH;
                            }
                            H61 h61 = LinkMatchType.Companion;
                            String str = c81173Hz5.LJFF;
                            Intrinsics.checkNotNullExpressionValue(str, "");
                            LIZ5.LIZ(-1, i, linkApplyType2, h61.LIZ(str), C0002O.m25086C("chat_match_auto_apply__", c81173Hz5.f7395LJ));
                        }
                    } else {
                        AbstractC5015e LIZ6 = AbstractC5015e.LIZIZ.LIZ();
                        if (LIZ6 != null) {
                            String valueOf = String.valueOf(C78832H5u.LJFF);
                            if (m15645LJ()) {
                                linkApplyType = LinkApplyType.CITY;
                            } else {
                                linkApplyType = LinkApplyType.MATCH;
                            }
                            int i2 = linkApplyType.value;
                            H61 h612 = LinkMatchType.Companion;
                            String str2 = c81173Hz5.LJFF;
                            Intrinsics.checkNotNullExpressionValue(str2, "");
                            LIZ6.LIZ(-1, valueOf, i2, h612.LIZ(str2), C0002O.m25086C("chat_match_auto_apply__", c81173Hz5.f7395LJ), "");
                        }
                    }
                }
            }
        }
        this.LIZLLL = new C77627Giz();
        this.LIZJ = (IMessageManager) this.dataCenter.get("data_message_manager");
        IMessageManager iMessageManager = this.LIZJ;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(MessageType.LINK_MIC_GUIDE_MESSAGE.LIZ(), this);
        }
        if (!this.LJIILIIL) {
            SettingKey<C6885cg> settingKey = LiveSettingKeys.FASTMATCH_OPTIMIZE_V2_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            if (settingKey.getValue().LIZJ() && this.f26492LJ) {
                Context context = this.context;
                SettingKey<C6991fu> settingKey2 = LiveSettingKeys.LIVE_SHAKE_MATCH_CONFIG;
                Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                this.LJIIJJI = new ShakeUtils(context, settingKey2.getValue().LIZ);
                ShakeUtils shakeUtils = this.LJIIJJI;
                if (shakeUtils != null) {
                    shakeUtils.LIZIZ = new H7Z(this);
                }
            }
        }
        AbstractC8644i LIZ7 = C4574547f.LIZ().LIZ(C8668v.class);
        if (LIZ7 != null && (LIZ7 instanceof C81173Hz5)) {
            C81173Hz5 c81173Hz52 = (C81173Hz5) LIZ7;
            String str3 = c81173Hz52.LJFF;
            if (str3 != null && str3.length() != 0) {
                String str4 = c81173Hz52.LJFF;
                Intrinsics.checkNotNullExpressionValue(str4, "");
                this.LJIILJJIL = str4;
            } else if (!PatchProxy.proxy(new Object[0], C78829H5r.LJFF, C78829H5r.LIZ, false, 2).isSupported) {
                C78829H5r.LIZIZ.clear();
                C78829H5r.LIZJ.clear();
                C78829H5r.LIZLLL = 0;
                C78829H5r.f6580LJ = 0;
            }
            C78829H5r.LIZIZ = C78829H5r.LIZJ;
            C78829H5r.LIZLLL = C78829H5r.f6580LJ;
        }
        if (this.f26492LJ) {
            C5074d c5074d5 = this.LJIIIZ;
            if (c5074d5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (!PatchProxy.proxy(new Object[0], c5074d5, C5074d.LIZ, false, 7).isSupported) {
                JSONArray jSONArray = new JSONArray();
                C5923dp LIZ8 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                if (LIZ8 != null && (LIZ2 = LIZ8.LIZ()) != null) {
                    room = LIZ2.LIZ();
                }
                LinkAudienceApi linkAudienceApi = (LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class);
                String jSONArray2 = jSONArray.toString();
                if (room != null) {
                    j = room.getId();
                } else {
                    j = 0;
                }
                c5074d5.LJIILLIIL = linkAudienceApi.getAudienceSettings(jSONArray2, j).compose(C100839PnV.LIZJ()).subscribe(C77630Gj2.LIZIZ, GXV.LIZIZ);
            }
        }
    }

    public ChatMatchWidget(boolean z) {
        this.f26492LJ = z;
        this.LJIILJJIL = "";
    }

    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Boolean value;
        if (!PatchProxy.proxy(new Object[]{iMessage}, this, LIZ, false, 12).isSupported && iMessage != null && (iMessage instanceof LinkMicGuideMessage)) {
            LinkMicGuideMessage linkMicGuideMessage = (LinkMicGuideMessage) iMessage;
            if (linkMicGuideMessage.LIZJ == 2) {
                C5074d c5074d = this.LJIIIZ;
                if (c5074d == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    MutableLiveData<Boolean> mutableLiveData = c5074d.LIZJ;
                    if (mutableLiveData != null) {
                        value = mutableLiveData.getValue();
                        if (!(!Intrinsics.areEqual(value, Boolean.TRUE)) && C79242HLo.LJIIJ() != 13) {
                            LIZ(this, linkMicGuideMessage, null, true, false, "pop_guide", null, 40, null);
                            return;
                        }
                    }
                }
                value = null;
                if (!(!Intrinsics.areEqual(value, Boolean.TRUE))) {
                }
            }
        }
    }

    public /* synthetic */ ChatMatchWidget(boolean z, int i) {
        this(true);
    }

    public final void LIZ(LinkMicGuideMessage linkMicGuideMessage, C9605p c9605p, boolean z, boolean z2, String str, Boolean bool) {
        Room room;
        LinkMicGuideMessage.C8705e c8705e;
        boolean z3 = true;
        if (PatchProxy.proxy(new Object[]{linkMicGuideMessage, c9605p, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str, bool}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        ALogger.m15801d(LJI, "showMatchDialog " + this.isViewValid + LoggerUtil.BLANK_TAG + this.isDestroyed + " : " + this);
        C78866H7c c78866H7c = this.LIZIZ;
        if (c78866H7c != null && c78866H7c.LJIILIIL()) {
            c78866H7c.LIZ(c9605p);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LJIIIIZZ.LIZ(Boolean.valueOf(this.LJIILIIL));
        }
        TalkRoomBusinessFullLinkMonitor.LIZIZ.LIZIZ(LJFF);
        DataCenter dataCenter = this.dataCenter;
        FragmentManager fragmentManager = null;
        if (dataCenter != null) {
            room = (Room) dataCenter.get("data_room", (String) new Room());
        } else {
            room = null;
        }
        C78864H7a c78864H7a = C78866H7c.LJIJI;
        DataCenter dataCenter2 = this.dataCenter;
        if (linkMicGuideMessage != null) {
            c8705e = linkMicGuideMessage.LIZLLL;
        } else {
            c8705e = null;
        }
        if (!z2) {
            C5074d c5074d = this.LJIIIZ;
            if (c5074d == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (!c5074d.LJIIIZ) {
                z3 = false;
            }
        }
        C5074d c5074d2 = this.LJIIIZ;
        if (c5074d2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        this.LIZIZ = c78864H7a.LIZ(room, dataCenter2, c8705e, c9605p, z3, c5074d2, bool);
        C78866H7c c78866H7c2 = this.LIZIZ;
        if (c78866H7c2 != null) {
            FragmentActivity LIZIZ = C439993ar.LIZIZ(getContext());
            if (LIZIZ != null) {
                fragmentManager = LIZIZ.getSupportFragmentManager();
            }
            c78866H7c2.show(fragmentManager, "ChatMatchWidget");
        }
        if (!z2) {
            C5074d c5074d3 = this.LJIIIZ;
            if (c5074d3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (!c5074d3.LJIIIZ) {
                if (TextUtils.equals("pop_guide", LJFF)) {
                    C5074d c5074d4 = this.LJIIIZ;
                    if (c5074d4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    c5074d4.LIZIZ();
                    return;
                }
                return;
            }
        }
        C78866H7c c78866H7c3 = this.LIZIZ;
        if (c78866H7c3 != null) {
            c78866H7c3.LIZLLL();
        }
    }

    public static /* synthetic */ void LIZ(ChatMatchWidget chatMatchWidget, LinkMicGuideMessage linkMicGuideMessage, C9605p c9605p, boolean z, boolean z2, String str, Boolean bool, int i, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        byte b3 = z2 ? (byte) 1 : (byte) 0;
        byte b4 = z2 ? (byte) 1 : (byte) 0;
        if (PatchProxy.proxy(new Object[]{chatMatchWidget, linkMicGuideMessage, c9605p, Byte.valueOf(b), Byte.valueOf(b3), str, bool, Integer.valueOf(i), null}, null, LIZ, true, 7).isSupported) {
            return;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            str = "";
        }
        if ((i & 32) != 0) {
            bool = Boolean.FALSE;
        }
        chatMatchWidget.LIZ(linkMicGuideMessage, c9605p, z, z2, str, bool);
    }
}
