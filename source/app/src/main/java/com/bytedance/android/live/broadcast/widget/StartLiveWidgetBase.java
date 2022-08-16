package com.bytedance.android.live.broadcast.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.AbstractC2862ah;
import com.bytedance.android.live.broadcast.AbstractC2864aj;
import com.bytedance.android.live.broadcast.api.model.C2918r;
import com.bytedance.android.live.broadcast.api.model.PermissionResult;
import com.bytedance.android.live.broadcast.api.model.PreviewDataTransferHolder;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.model.C3157c;
import com.bytedance.android.live.broadcast.model.Challenge;
import com.bytedance.android.live.broadcast.monitor.BroadcastCreateRoomApiMonitor;
import com.bytedance.android.live.broadcast.preview.C3181o;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsStartLiveWidget;
import com.bytedance.android.live.broadcast.viewmodel.C3258d;
import com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.performance.TimeCostUtil;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.effect.view.EffectLivePreviewActivityProxy;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.business.IHostVerify;
import com.bytedance.android.livehostapi.business.depend.hashtag.LiveHashTag;
import com.bytedance.android.livehostapi.foundation.IHostContext;
import com.bytedance.android.livesdk.chatroom.event.C5986ap;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.log.model.C8670x;
import com.bytedance.android.livesdk.widget.v$a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.commonsdk.vchannel.C33968a;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC88358Krg;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C382711Dt;
import p003X.C439913aj;
import p003X.C4574547f;
import p003X.C77347GeT;
import p003X.C81925IQt;
import p003X.C86665KDb;
import p003X.C86804KIk;
import p003X.C86806KIm;
import p003X.C86807KIn;
import p003X.C86809KIp;
import p003X.C86812KIs;
import p003X.C86817KIx;
import p003X.C87010KQi;
import p003X.C87308Kak;
import p003X.C88469KtT;
import p003X.C91211Lwb;
import p003X.C91219Lwj;
import p003X.K3R;
import p003X.K5Y;
import p003X.K5Z;
import p003X.K8Q;
import p003X.KCN;
import p003X.KCO;
import p003X.KCU;
import p003X.KLB;
import p003X.LK5;

/* loaded from: classes5.dex */
public abstract class StartLiveWidgetBase extends AbsStartLiveWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LJIILIIL;
    public static final /* synthetic */ KProperty[] LJIILJJIL;
    public Intent LIZ;
    public EffectLivePreviewActivityProxy LJIILL;
    public C2918r LJIILLIIL;
    public int LJIJI;
    public long LJIJJ;
    public AbstractC2862ah LJIJJLI;
    public AbstractC2864aj LJIL;
    public C3258d LJJ;
    public boolean LJIIZILJ = true;
    public String LJIJ = "";
    public final Lazy LIZIZ = LIZ(C3199v.class);
    public final Lazy LIZJ = LIZ(C3181o.class);
    public final Lazy LIZLLL = LIZ(C439913aj.class);

    /* renamed from: LJ */
    public final Lazy f26003LJ = C77347GeT.LIZ(new StartLiveWidgetBase$progressDialog$2(this));

    static {
        Covode.recordClassIndex(18823);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(StartLiveWidgetBase.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(StartLiveWidgetBase.class, "startLiveEventViewModel", "getStartLiveEventViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveEventViewModel;", 0);
        Reflection.property1(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(StartLiveWidgetBase.class, "previewSelectTitleContext", "getPreviewSelectTitleContext()Lcom/bytedance/android/live/broadcast/viewmodel/PreviewSelectTitleContext;", 0);
        Reflection.property1(propertyReference1Impl3);
        LJIILJJIL = new KProperty[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3};
    }

    public abstract void LIZ(String str, Room room, LiveMode liveMode, Challenge challenge, String str2);

    public void LIZ(JSONObject jSONObject, Intent intent) {
        if (PatchProxy.proxy(new Object[]{jSONObject, intent}, this, LJIILIIL, false, 18).isSupported) {
            return;
        }
        C106862S5w.LIZ(jSONObject, intent);
    }

    public abstract void LIZJ();

    public AbstractC88358Krg LIZLLL() {
        return null;
    }

    public boolean LJI() {
        return true;
    }

    public abstract String LJIIIZ();

    public String LJIIJ() {
        return null;
    }

    public final C3199v LJIIZILJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILIIL, false, 2);
        return (C3199v) (proxy.isSupported ? proxy.result : LIZ(this.LIZIZ, this, LJIILJJIL[0]));
    }

    public final C3181o LJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILIIL, false, 3);
        return (C3181o) (proxy.isSupported ? proxy.result : LIZ(this.LIZJ, this, LJIILJJIL[1]));
    }

    public final C439913aj LJIJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILIIL, false, 4);
        return (C439913aj) (proxy.isSupported ? proxy.result : LIZ(this.LIZLLL, this, LJIILJJIL[2]));
    }

    public final Dialog LJIJJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILIIL, false, 5);
        return (Dialog) (proxy.isSupported ? proxy.result : this.f26003LJ.mo27335getValue());
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public String getSpm() {
        return "a100.a100.a146";
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsStartLiveWidget, com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJIILIIL, false, 43).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public void LIZ(C3199v c3199v) {
        if (PatchProxy.proxy(new Object[]{c3199v}, this, LJIILIIL, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(c3199v);
        Disposable subscribe = c3199v.LJJIII().LIZIZ().subscribe(new C86804KIk(this));
        Intrinsics.checkNotNullExpressionValue(subscribe, "");
        LIZ(subscribe);
        Disposable subscribe2 = c3199v.LJJIIJ().LIZIZ().subscribe(new C86809KIp(this));
        Intrinsics.checkNotNullExpressionValue(subscribe2, "");
        LIZ(subscribe2);
        Disposable subscribe3 = c3199v.LJJIIJZLJL().LIZIZ().subscribe(new C86807KIn(this));
        Intrinsics.checkNotNullExpressionValue(subscribe3, "");
        LIZ(subscribe3);
    }

    public final void LIZ(C5176i<C3157c> c5176i) {
        C3157c c3157c;
        C81925IQt c81925IQt;
        CharSequence charSequence;
        if (PatchProxy.proxy(new Object[]{c5176i}, this, LJIILIIL, false, 12).isSupported || c5176i == null || (c3157c = c5176i.LIZJ) == null || (c81925IQt = c3157c.LIZ) == null) {
            return;
        }
        IService service = ServiceManager.getService(IUserService.class);
        Intrinsics.checkNotNull(service);
        final IUser LIZ = ((IUserService) service).user().LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        if (c81925IQt.LIZLLL) {
            CharSequence LIZ2 = LK5.LIZ(2131585077);
            charSequence = LIZ2;
            if (LIZ2 == null) {
                return;
            }
        } else {
            long j = c81925IQt.LIZ - (c5176i.LIZLLL.now / 1000);
            C3157c c3157c2 = c5176i.LIZJ;
            Intrinsics.checkNotNullExpressionValue(c3157c2, "");
            C81925IQt c81925IQt2 = c3157c2.LIZ;
            Intrinsics.checkNotNullExpressionValue(c81925IQt2, "");
            int i = (int) ((j + c81925IQt2.LIZIZ) / 60);
            if (i < 60) {
                String LIZ3 = LK5.LIZ(2131886129, i, Integer.valueOf(i));
                Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) LIZ3, String.valueOf(i), 0, false, 6, (Object) null);
                SpannableString spannableString = new SpannableString(LIZ3);
                C116971W2r.LIZ(spannableString, new ForegroundColorSpan(CastProtectorUtils.parseColor("#ff2200")), indexOf$default, String.valueOf(i).length() + indexOf$default, 33);
                charSequence = spannableString;
            } else if (i < 1440) {
                int i2 = i / 60;
                int i3 = i % 60;
                String LIZ4 = LK5.LIZ(2131886128, 0, Integer.valueOf(i2), Integer.valueOf(i3));
                SpannableString spannableString2 = new SpannableString(LIZ4);
                Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                int indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) LIZ4, String.valueOf(i2), 0, false, 6, (Object) null);
                if (indexOf$default2 >= 0) {
                    C116971W2r.LIZ(spannableString2, new ForegroundColorSpan(CastProtectorUtils.parseColor("#ff2200")), indexOf$default2, String.valueOf(i2).length() + indexOf$default2, 33);
                }
                int lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) LIZ4, String.valueOf(i3), 0, false, 6, (Object) null);
                charSequence = spannableString2;
                if (lastIndexOf$default >= 0) {
                    C116971W2r.LIZ(spannableString2, new ForegroundColorSpan(CastProtectorUtils.parseColor("#ff2200")), lastIndexOf$default, String.valueOf(i3).length() + lastIndexOf$default, 33);
                    charSequence = spannableString2;
                }
            } else {
                int i4 = i / 1440;
                int i5 = (i % 1440) / 60;
                String LIZ5 = LK5.LIZ(2131886126, 0, Integer.valueOf(i4), Integer.valueOf(i5));
                SpannableString spannableString3 = new SpannableString(LIZ5);
                Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                int indexOf$default3 = StringsKt__StringsKt.indexOf$default((CharSequence) LIZ5, String.valueOf(i4), 0, false, 6, (Object) null);
                if (indexOf$default3 >= 0) {
                    C116971W2r.LIZ(spannableString3, new ForegroundColorSpan(CastProtectorUtils.parseColor("#ff2200")), indexOf$default3, String.valueOf(i4).length() + indexOf$default3, 33);
                }
                int lastIndexOf$default2 = StringsKt__StringsKt.lastIndexOf$default((CharSequence) LIZ5, String.valueOf(i5), 0, false, 6, (Object) null);
                charSequence = spannableString3;
                if (lastIndexOf$default2 >= 0) {
                    C116971W2r.LIZ(spannableString3, new ForegroundColorSpan(CastProtectorUtils.parseColor("#ff2200")), lastIndexOf$default2, String.valueOf(i5).length() + lastIndexOf$default2, 33);
                    charSequence = spannableString3;
                }
            }
        }
        SettingKey<String> settingKey = LiveConfigSettingKeys.LIVE_BLOCKED_DETAIL_URL;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        final String uri = Uri.parse(settingKey.getValue()).buildUpon().appendQueryParameter(C33968a.f42937f, String.valueOf(c81925IQt.f7563LJ)).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "");
        v$a v_a = new v$a(this.context, 5);
        v_a.LIZ(getContext().getResources().getString(2131587811));
        v_a.LIZIZ(charSequence);
        C116971W2r.LIZJ(v_a.LIZIZ(0, 2131585078, new DialogInterface.OnClickListener() { // from class: X.3V2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18829);
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i6) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i6)}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                Context context = StartLiveWidgetBase.this.context;
                Intrinsics.checkNotNullExpressionValue(context, "");
                AbstractC100890PoK buildFullScreenWebPage = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).buildFullScreenWebPage(context, uri);
                Context context2 = StartLiveWidgetBase.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                buildFullScreenWebPage.LIZ(context2.getResources().getString(2131582239));
                buildFullScreenWebPage.LIZ(true);
                buildFullScreenWebPage.LIZ();
                dialogInterface.dismiss();
            }
        }).LIZIZ(1, 2131582703, new DialogInterface.OnClickListener() { // from class: X.3AZ
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18830);
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i6) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i6)}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
                HashMap hashMap = new HashMap();
                hashMap.put("_param_live_platform", "live");
                String secUid = IUser.this.getSecUid();
                Intrinsics.checkNotNullExpressionValue(secUid, "");
                hashMap.put("anchor_id", secUid);
                hashMap.put("result", "confirm");
                C4574547f.LIZ().LIZ("livesdk_live_appeal_popup_click", hashMap, new Object[0]);
            }
        }).LIZLLL());
        if (PatchProxy.proxy(new Object[0], null, C86817KIx.LIZ, true, 1).isSupported) {
            return;
        }
        C4574547f LIZ6 = C4574547f.LIZ();
        C8668v c8668v = new C8668v();
        c8668v.LIZIZ("live_take");
        c8668v.LJFF("show");
        c8668v.LIZ("live_take_page");
        LIZ6.LIZ("pm_live_take_banpopup_show", c8668v, new C8670x());
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x010e, code lost:
        if (r1 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e7, code lost:
        if (r1 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(com.bytedance.android.livesdkapi.depend.model.live.Room r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase.LIZ(com.bytedance.android.livesdkapi.depend.model.live.Room, boolean):void");
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LJIILIIL, false, 8).isSupported) {
            return;
        }
        super.onDestroy();
        LJIIL().dispose();
    }

    private final void LJIJJLI() {
        boolean z = false;
        if (PatchProxy.proxy(new Object[0], this, LJIILIIL, false, 25).isSupported) {
            return;
        }
        C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.LLLLZI;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        if (LJIIJJI().LIZLLL().LIZ() != null) {
            z = true;
        }
        c87308Kak.LIZ(Boolean.valueOf(z));
    }

    private final boolean LJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILIIL, false, 32);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        int i = Build.VERSION.SDK_INT;
        return NotificationManagerCompat.from(this.context).areNotificationsEnabled();
    }

    public void LJII() {
        if (PatchProxy.proxy(new Object[0], this, LJIILIIL, false, 22).isSupported) {
            return;
        }
        Context context = this.context;
        if (context != null) {
            ((FragmentActivity) context).finish();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public String LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILIIL, false, 28);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        String string = context.getResources().getString(2131582805);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LJIILIIL, false, 6).isSupported) {
            return;
        }
        super.onCreate();
        K8Q.LIZ().LJIIIIZZ().LIZ(this);
        LIZ(LJIIZILJ());
        LJIJ().LIZJ().observe(this, new KCN(this));
    }

    /* renamed from: LJ */
    private void m15856LJ() {
        ArrayList<Integer> arrayList;
        KLB klb;
        if (PatchProxy.proxy(new Object[0], this, LJIILIIL, false, 19).isSupported) {
            return;
        }
        K3R.LIZIZ.LIZIZ();
        PreviewDataTransferHolder LIZ = K3R.LIZ();
        if (LIZ != null) {
            LIZ.previewSourceParam = LJIIZILJ().LJIJ().LIZIZ();
            RoomCreateInfo LIZ2 = LJIIJJI().LIZIZ().LIZ();
            if (LIZ2 == null || (klb = LIZ2.LJJJJJ) == null || (arrayList = klb.LIZJ) == null) {
                arrayList = new ArrayList<>();
            }
            LIZ.LIZ(arrayList);
            LIZ.ownerIdOfSellTicket = LJIIZILJ().LJJJJZI().LIZ().longValue();
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.String] */
    private final boolean LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILIIL, false, 20);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Object obj = null;
        objectRef.element = null;
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_PREVIEW_ENABLE_SOURCEPARAM_OPT;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            LJIIZILJ().LJIJ().LIZ(new StartLiveWidgetBase$isFromPromoteLiveTask$1(objectRef));
        } else {
            String LIZ = LJIIZILJ().LJIIZILJ().LIZ();
            if (LIZ != null && LIZ.length() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray(new JSONObject(LIZ).getString("payload")).getJSONArray(0);
                    if (jSONArray.length() > 2) {
                        Object obj2 = jSONArray.get(2);
                        if (obj2 instanceof String) {
                            obj = obj2;
                        }
                        objectRef.element = (String) obj;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        String str = (String) objectRef.element;
        if (str == null || str.length() <= 0) {
            return false;
        }
        return true;
    }

    public void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LJIILIIL, false, 41).isSupported) {
            return;
        }
        LJIIZILJ().LIZJ();
    }

    private final boolean LIZ(Room room) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{room}, this, LJIILIIL, false, 17);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return "2".equals(room.anchorAbMap.get("audience_linkmic_continue"));
    }

    private final void LIZJ(Room room) {
        if (PatchProxy.proxy(new Object[]{room}, this, LJIILIIL, false, 23).isSupported) {
            return;
        }
        IService service = ServiceManager.getService(IHostContext.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        if (!((IHostContext) service).isNeedProtectUnderage()) {
            return;
        }
        HashMap hashMap = new HashMap();
        IUser LIZ = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        hashMap.put("user_id", Long.valueOf(LIZ.getId()));
        hashMap.put("room_id", Long.valueOf(room.getId()));
        hashMap.put("anchor_id", Long.valueOf(room.ownerUserId));
        C91211Lwb.LIZ("ttlive_teen_open_live_room_success", 0, hashMap);
    }

    private final boolean LIZLLL(Room room) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{room}, this, LJIILIIL, false, 26);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        LiveMode LIZ = LJIIJJI().LIZ().LIZ();
        int i = C86806KIm.LIZIZ[LIZ.ordinal()];
        if (i != 1) {
            if ((i == 2 || i == 3) && room.getStreamType() != LIZ) {
                return false;
            }
        } else {
            C2918r c2918r = this.LJIILLIIL;
            if ((c2918r != null && c2918r.LIZ != 1) || room.getStreamType() != LIZ) {
                return false;
            }
        }
        return true;
    }

    public Bundle LIZIZ(String str) {
        String str2;
        String authTypeStr;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LJIILIIL, false, 37);
        if (proxy.isSupported) {
            return (Bundle) proxy.result;
        }
        Bundle bundle = new Bundle();
        if (LJIIJJI().LIZ().LIZ() == LiveMode.THIRD_PARTY) {
            str2 = "obs";
        } else {
            str2 = "show";
        }
        bundle.putString("live_type", str2);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("enter_from", str);
        }
        PermissionResult LIZ = LJIIJJI().LJI().LIZ();
        if (LIZ != null && (authTypeStr = LIZ.getAuthTypeStr()) != null) {
            bundle.putString("account_type", authTypeStr);
        }
        return bundle;
    }

    public final void LIZ(ApiServerException apiServerException) {
        String str;
        if (PatchProxy.proxy(new Object[]{apiServerException}, this, LJIILIIL, false, 29).isSupported) {
            return;
        }
        int i = 3;
        if (!CollectionsKt__CollectionsKt.listOf((Object[]) new LiveMode[]{LiveMode.AUDIO, LiveMode.SCREEN_RECORD, LiveMode.THIRD_PARTY}).contains(LJIIJJI().LIZ().LIZ())) {
            return;
        }
        SettingKey<String> settingKey = LiveConfigSettingKeys.APPLY_LIVE_PERMISSION_URL;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        String value = settingKey.getValue();
        if (value != null && value.length() != 0) {
            int i2 = C86806KIm.LIZJ[LJIIJJI().LIZ().LIZ().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        str = "error";
                    } else {
                        str = "audio_live";
                    }
                } else {
                    str = "pc_live";
                }
            } else {
                str = "screen_live";
            }
            switch (apiServerException.mErrorCode) {
                case 4003029:
                case 4003060:
                    i = 2;
                    break;
                case 4003031:
                case 4003061:
                    break;
                default:
                    i = -1;
                    break;
            }
            String uri = Uri.parse(Uri.parse(value).getQueryParameter(PushConstants.WEB_URL)).buildUpon().appendQueryParameter("scene", str).appendQueryParameter("apply_status", String.valueOf(i)).appendQueryParameter("enter_from", LJIIIZ()).build().toString();
            Uri parse = Uri.parse(value);
            Intrinsics.checkNotNullExpressionValue(parse, "");
            String uri2 = C382711Dt.LIZ(parse, PushConstants.WEB_URL, uri).toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "");
            ((IRoomService) ServiceManager.getService(IRoomService.class)).actionHandler().handle(this.context, uri2);
        }
    }

    public final void LIZIZ(Room room) {
        Long l;
        boolean z;
        long j;
        String str;
        String sb;
        boolean z2 = false;
        if (PatchProxy.proxy(new Object[]{room}, this, LJIILIIL, false, 11).isSupported) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("on room change, enter: ");
        sb2.append(System.currentTimeMillis());
        sb2.append(",this:[");
        sb2.append(hashCode());
        sb2.append("],roomId:");
        if (room == null) {
            l = "null";
        } else {
            l = Long.valueOf(room.getId());
        }
        sb2.append(l);
        ALogger.m15801d("LiveUxTracer", sb2.toString());
        String str2 = "true";
        if (!Room.isValid(room)) {
            KCO kco = KCO.LIZIZ;
            LiveMode LIZ = LJIIJJI().LIZ().LIZ();
            if (!PatchProxy.proxy(new Object[]{LIZ, room}, kco, KCO.LIZ, false, 3).isSupported) {
                C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.LJJIJIIJI;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                Boolean LIZ2 = c87308Kak.LIZ();
                C91219Lwj LIZ3 = C86665KDb.LIZ("ttlive_check_if_room_legal", "preview", LIZ, null);
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                if (!LIZ2.booleanValue()) {
                    str2 = "false";
                }
                C91219Lwj LIZIZ = LIZ3.LIZIZ(str2);
                if (room == null) {
                    sb = "room is null";
                } else {
                    StringBuilder sb3 = new StringBuilder("roomId: ");
                    sb3.append(room.getId());
                    sb3.append(", roomOwner: ");
                    User owner = room.getOwner();
                    if (owner == null) {
                        owner = "null";
                    }
                    sb3.append(owner);
                    sb = sb3.toString();
                }
                C91219Lwj LIZ4 = LIZIZ.LIZ("errMsg", (Object) sb);
                Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                C86665KDb.LIZ(LIZ4, 1).LIZ().LIZ();
            }
            Dialog LJIJJ = LJIJJ();
            Intrinsics.checkNotNullExpressionValue(LJIJJ, "");
            if (LJIJJ.isShowing()) {
                ALogger.m15800e(LIZ(), "dismiss dialog onRoomChange");
                C116971W2r.LIZ(LJIJJ());
            }
            IllegalStateException illegalStateException = new IllegalStateException("invalid room");
            C88469KtT.LIZ(this.context, illegalStateException, LJIIIIZZ());
            KCU.LIZ(LJIIJJI().LIZ().LIZ(), illegalStateException);
            if (LJIIJJI().LIZ().LIZ() == LiveMode.AUDIO) {
                z2 = true;
            }
            BroadcastCreateRoomApiMonitor.LIZ(illegalStateException, z2);
            TimeCostUtil.LIZ(TimeCostUtil.Tag.CreateLive);
            KCU.LIZ();
        } else {
            KCO kco2 = KCO.LIZIZ;
            LiveMode LIZ5 = LJIIJJI().LIZ().LIZ();
            Integer valueOf = Integer.valueOf(hashCode());
            if (!PatchProxy.proxy(new Object[]{LIZ5, room, valueOf}, kco2, KCO.LIZ, false, 1).isSupported) {
                C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.LJJIJIIJI;
                Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                Boolean LIZ6 = c87308Kak2.LIZ();
                C91219Lwj LIZ7 = C86665KDb.LIZ("ttlive_check_if_room_legal", "preview", LIZ5, null);
                Intrinsics.checkNotNullExpressionValue(LIZ6, "");
                if (!LIZ6.booleanValue()) {
                    str2 = "false";
                }
                C91219Lwj LIZIZ2 = LIZ7.LIZIZ(str2);
                if (room != null) {
                    str = room.getIdStr();
                } else {
                    str = null;
                }
                C91219Lwj LIZ8 = LIZIZ2.LIZ("room_id", (Object) String.valueOf(str)).LIZ("startLiveWidget", (Object) String.valueOf(valueOf));
                Intrinsics.checkNotNullExpressionValue(LIZ8, "");
                C86665KDb.LIZ(LIZ8, 0).LIZ().LIZ();
            }
            AbstractC2864aj abstractC2864aj = this.LJIL;
            if (abstractC2864aj != null) {
                abstractC2864aj.LIZ("live_take_detail");
            }
            ALogger.m15801d("LiveUxTracer", "on room change, #1: " + System.currentTimeMillis());
            AbstractC2864aj abstractC2864aj2 = this.LJIL;
            if (abstractC2864aj2 != null) {
                if (room != null) {
                    j = room.getId();
                } else {
                    j = 0;
                }
                abstractC2864aj2.LIZ(j);
            }
            ALogger.m15801d("LiveUxTracer", "on room change, #2: " + System.currentTimeMillis());
            EffectLivePreviewActivityProxy effectLivePreviewActivityProxy = this.LJIILL;
            if (effectLivePreviewActivityProxy != null) {
                if (LJIIJJI().LIZ().LIZ() == LiveMode.VIDEO) {
                    z = true;
                } else {
                    z = false;
                }
                effectLivePreviewActivityProxy.LIZ(z);
            }
            ALogger.m15801d("LiveUxTracer", "on room change, #3: " + System.currentTimeMillis());
            Intrinsics.checkNotNull(room);
            if (!PatchProxy.proxy(new Object[]{this, room, (byte) 0, 2, null}, null, LJIILIIL, true, 14).isSupported) {
                LIZ(room, false);
            }
        }
        ALogger.m15801d("LiveUxTracer", "on room change, leave: " + System.currentTimeMillis());
    }

    public void LIZIZ(ApiServerException apiServerException, String str) {
        if (PatchProxy.proxy(new Object[]{apiServerException, str}, this, LJIILIIL, false, 35).isSupported) {
            return;
        }
        C106862S5w.LIZ(apiServerException, str);
        IHostVerify iHostVerify = (IHostVerify) ServiceManager.getService(IHostVerify.class);
        Context context = this.context;
        if (context != null) {
            iHostVerify.verifyForStartLive((Activity) context, 109, apiServerException.mExtra, LIZIZ(str), (AbstractC88358Krg) null);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }

    private final void LIZ(Intent intent, LiveHashTag liveHashTag) {
        Object obj;
        if (PatchProxy.proxy(new Object[]{intent, liveHashTag}, this, LJIILIIL, false, 21).isSupported) {
            return;
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_PREVIEW_ENABLE_SOURCEPARAM_OPT;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            LJIIZILJ().LJIJ().LIZ(new StartLiveWidgetBase$putBundleIfFromPromoteLiveTask$1(intent, liveHashTag));
        } else {
            String LIZ = LJIIZILJ().LJIIZILJ().LIZ();
            if (LIZ != null && LIZ.length() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray(new JSONObject(LIZ).getString("payload")).getJSONArray(0);
                    if (jSONArray.length() > 2 && (obj = jSONArray.get(2)) != null) {
                        intent.putExtra("from_promote_live", true);
                        intent.putExtra("data_commerce_task_id", obj.toString());
                        liveHashTag.taskId = (String) obj;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        LJIIZILJ().LJIJ().LIZ(new StartLiveWidgetBase$putBundleIfFromPromoteLiveTask$3(liveHashTag));
    }

    public void LIZ(ApiServerException apiServerException, String str) {
        if (PatchProxy.proxy(new Object[]{apiServerException, str}, this, LJIILIIL, false, 33).isSupported) {
            return;
        }
        C106862S5w.LIZ(apiServerException, str);
        IHostVerify iHostVerify = (IHostVerify) ServiceManager.getService(IHostVerify.class);
        Context context = this.context;
        if (context != null) {
            iHostVerify.verifyForStartLive((Activity) context, 109, apiServerException.mExtra, LIZIZ(str), LIZLLL());
            if (!PatchProxy.proxy(new Object[]{apiServerException}, this, LJIILIIL, false, 42).isSupported) {
                C106862S5w.LIZ(apiServerException);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }

    public final void LIZ(Context context, Throwable th, String str) {
        if (PatchProxy.proxy(new Object[]{context, th, str}, this, LJIILIIL, false, 31).isSupported) {
            return;
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_ENABLE_BROADCAST_CUSTOM_TOAST;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue() && !LJIL()) {
            ALogger.m15800e("StartLiveWidget", "areNotificationsEnabled is false");
            C88469KtT.LIZ(context, str);
        } else if (context != null) {
            C88469KtT.LIZ((Activity) context, th, str);
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
        LIZJ();
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public void onActivityResult(int i, int i2, Intent intent) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, LJIILIIL, false, 9).isSupported) {
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 20001) {
            int i3 = Build.VERSION.SDK_INT;
            if (i2 == -1) {
                Context context = this.context;
                Intrinsics.checkNotNullExpressionValue(context, "");
                if (context.getApplicationContext().getSystemService("media_projection") != null) {
                    C87010KQi.LIZ().LIZ(new C5986ap(43));
                    K5Y.LJIJJLI.LIZ(true);
                    K5Z.LJIJI.LIZ(true);
                    AbstractC2862ah abstractC2862ah = this.LJIJJLI;
                    if (abstractC2862ah != null) {
                        abstractC2862ah.LIZ(intent);
                    }
                    this.LIZ = intent;
                    LJIIZILJ().LIZ();
                    return;
                }
            }
            K5Y.LJIJJLI.LIZ(false);
            K5Z.LJIJI.LIZ(false);
            C86812KIs.LIZ.LIZ(2131587838, this.context);
            Dialog LJIJJ = LJIJJ();
            Intrinsics.checkNotNullExpressionValue(LJIJJ, "");
            if (LJIJJ.isShowing()) {
                C116971W2r.LIZ(LJIJJ());
                return;
            }
            return;
        }
        IService service = ServiceManager.getService(IHostVerify.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        if (i2 == ((IHostVerify) service).getResultCode() && i == 10001) {
            LJIIZILJ().LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x04f4 A[Catch: all -> 0x057c, Exception -> 0x057f, TRY_ENTER, TryCatch #9 {Exception -> 0x057f, all -> 0x057c, blocks: (B:85:0x02e1, B:86:0x02f2, B:88:0x02f8, B:92:0x0315, B:95:0x035c, B:98:0x03b2, B:101:0x03bf, B:104:0x03c8, B:107:0x03e8, B:110:0x0400, B:113:0x044c, B:116:0x046a, B:119:0x0487, B:126:0x04b7, B:128:0x04cb, B:131:0x04f4, B:136:0x056e, B:165:0x0381, B:167:0x0392, B:168:0x039a), top: B:80:0x02c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x052a A[Catch: all -> 0x05be, Exception -> 0x05c0, TryCatch #10 {Exception -> 0x05c0, all -> 0x05be, blocks: (B:90:0x0303, B:93:0x0348, B:96:0x039d, B:99:0x03b4, B:102:0x03c4, B:105:0x03cf, B:108:0x03f0, B:111:0x0408, B:114:0x0450, B:117:0x0472, B:120:0x048d, B:129:0x04e1, B:132:0x04f8, B:134:0x052a, B:147:0x04d8, B:149:0x04dc, B:163:0x036d), top: B:89:0x0303 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05b0 A[Catch: Exception -> 0x05bc, all -> 0x0627, TRY_ENTER, TryCatch #4 {Exception -> 0x05bc, blocks: (B:144:0x05b0, B:145:0x05b5, B:150:0x05b6, B:151:0x05bb), top: B:122:0x04b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void LIZ(com.bytedance.android.livesdkapi.depend.model.live.Room r17, com.bytedance.android.live.broadcast.model.Challenge r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase.LIZ(com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.android.live.broadcast.model.Challenge, boolean):void");
    }
}
