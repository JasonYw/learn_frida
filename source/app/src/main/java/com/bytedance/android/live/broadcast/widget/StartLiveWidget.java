package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.model.CategoryNode;
import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.api.model.PermissionResult;
import com.bytedance.android.live.broadcast.api.model.PreviewSourceParam;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.model.AudioInteractMode;
import com.bytedance.android.live.broadcast.model.Challenge;
import com.bytedance.android.live.broadcast.monitor.BroadcastCreateRoomApiMonitor;
import com.bytedance.android.live.broadcast.preview.C3180k;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.viewmodel.C3258d;
import com.bytedance.android.live.broadcast.widget.StartLiveWidget;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.platform.depend.IPropertyCache;
import com.bytedance.android.livesdk.chatroom.model.C6127bf;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.log.model.C8670x;
import com.bytedance.android.livesdk.widget.v$a;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;
import p003X.AbstractC414762bG;
import p003X.AbstractC4569445g;
import p003X.AbstractC76988GWw;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C3VF;
import p003X.C413602Yo;
import p003X.C440943cO;
import p003X.C442853fT;
import p003X.C442873fV;
import p003X.C4574547f;
import p003X.C4CT;
import p003X.C519656g3;
import p003X.C76989GWx;
import p003X.C76990GWy;
import p003X.C77347GeT;
import p003X.C77755Gl3;
import p003X.C86665KDb;
import p003X.C86817KIx;
import p003X.C86825KJf;
import p003X.C86832KJm;
import p003X.C87308Kak;
import p003X.C91211Lwb;
import p003X.DialogInterface$OnClickListenerC425382sO;
import p003X.DialogInterface$OnClickListenerC86837KJr;
import p003X.K5Y;
import p003X.KCG;
import p003X.KCH;
import p003X.KCI;
import p003X.KCO;
import p003X.KCU;
import p003X.KJV;
import p003X.KK0;
import p003X.KK6;
import p003X.KKB;
import p003X.KQO;
import p003X.LLY;

/* loaded from: classes5.dex */
public final class StartLiveWidget extends StartLiveWidgetBase implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public final AbstractC76988GWw LIZIZ;
    public final Lazy LIZJ = C77347GeT.LIZ(StartLiveWidget$previewWidgetContext$2.INSTANCE);
    public final KJV LIZLLL;

    static {
        Covode.recordClassIndex(18800);
    }

    private final C3180k LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3180k) (proxy.isSupported ? proxy.result : this.LIZJ.mo27335getValue());
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "StartLiveWidget";
    }

    @Override // com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase
    public final void LIZJ() {
    }

    @Override // com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase
    public final String LJIIIZ() {
        return "live_take_page";
    }

    @Override // com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase, com.bytedance.android.live.broadcast.preview.base.AbsStartLiveWidget, com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 24).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LIZ(String str, Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{str, map}, this, LIZ, false, 19).isSupported) {
            return;
        }
        C4574547f LIZ2 = C4574547f.LIZ();
        C8668v c8668v = new C8668v();
        c8668v.LIZIZ("live");
        c8668v.LJFF("click");
        c8668v.LIZ("live_take_page");
        LIZ2.LIZ(str, map, c8668v);
    }

    /* renamed from: LJ */
    public final void m15857LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        View view = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        ((TextView) view.findViewById(2131168471)).setText(2131582563);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (KK6.LIZ()) {
            return 2131700859;
        }
        return 2131700858;
    }

    @Override // com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase, com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        LiveMode liveMode;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onCreate();
        View view = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        Disposable subscribe = C519656g3.LIZ(view.findViewById(2131168471)).throttleFirst(1000L, TimeUnit.MILLISECONDS).subscribe(new C76989GWx(this));
        Intrinsics.checkNotNullExpressionValue(subscribe, "");
        LIZ(subscribe);
        Disposable subscribe2 = LJIJ().LJIIIIZZ().LIZIZ().subscribe(new C76990GWy(this));
        if (subscribe2 != null) {
            LIZ(subscribe2);
        }
        LIZ(LJIIJJI().LIZ(new StartLiveWidget$onCreate$$inlined$let$lambda$1(this)));
        Disposable subscribe3 = LJIIZILJ().LJJJJL().LIZIZ().subscribe(new Consumer<Integer>() { // from class: X.2sN
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18814);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(Integer num) {
                Integer num2 = num;
                if (!PatchProxy.proxy(new Object[]{num2}, this, LIZ, false, 1).isSupported) {
                    if ((num2 == null || num2.intValue() != 0) && StartLiveWidget.this.LJIIJJI().LIZ().LIZ() == LiveMode.VIDEO) {
                        View view2 = StartLiveWidget.this.contentView;
                        Intrinsics.checkNotNullExpressionValue(view2, "");
                        TextView textView = (TextView) view2.findViewById(2131168471);
                        if (textView != null) {
                            textView.setText(2131582557);
                            return;
                        }
                        return;
                    }
                    View view3 = StartLiveWidget.this.contentView;
                    Intrinsics.checkNotNullExpressionValue(view3, "");
                    TextView textView2 = (TextView) view3.findViewById(2131168471);
                    if (textView2 != null) {
                        textView2.setText(2131582555);
                    }
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe3, "");
        LIZ(subscribe3);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = false;
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            booleanRef2.element = false;
            StartLiveWidget$handleMediaViewChange$1 startLiveWidget$handleMediaViewChange$1 = new StartLiveWidget$handleMediaViewChange$1(this, booleanRef, booleanRef2);
            StartLiveWidget$handleMediaViewChange$2 startLiveWidget$handleMediaViewChange$2 = new StartLiveWidget$handleMediaViewChange$2(booleanRef, startLiveWidget$handleMediaViewChange$1);
            StartLiveWidget$handleMediaViewChange$3 startLiveWidget$handleMediaViewChange$3 = new StartLiveWidget$handleMediaViewChange$3(booleanRef2, startLiveWidget$handleMediaViewChange$1);
            C2WC<LiveMode> c2wc = LJIIZILJ().LIZJ;
            if (c2wc != null) {
                liveMode = c2wc.LIZ();
            } else {
                liveMode = null;
            }
            if (liveMode == LiveMode.MEDIA) {
                View view2 = this.contentView;
                Intrinsics.checkNotNullExpressionValue(view2, "");
                TextView textView = (TextView) view2.findViewById(2131168471);
                if (textView != null) {
                    Context context = this.context;
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    textView.setText(context.getResources().getText(2131582556));
                }
                LIZ(C413602Yo.LIZ(LJIIZILJ().LJIIIIZZ(), new StartLiveWidget$handleMediaViewChange$4(startLiveWidget$handleMediaViewChange$3)));
                LIZ(C413602Yo.LIZ(LJIIZILJ().LJII(), new StartLiveWidget$handleMediaViewChange$5(startLiveWidget$handleMediaViewChange$2)));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x00a0, code lost:
        if (r4 != false) goto L139;
     */
    @Override // com.bytedance.android.live.broadcast.preview.base.AbsStartLiveWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.widget.StartLiveWidget.LIZIZ():void");
    }

    public final void LIZ(RoomCreateInfo roomCreateInfo) {
        float f;
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{roomCreateInfo}, this, LIZ, false, 14).isSupported) {
            return;
        }
        if (roomCreateInfo != null && !KKB.LIZJ(roomCreateInfo, LJIIJJI().LIZ().LIZ()) && (roomCreateInfo == null || !KKB.LIZLLL(roomCreateInfo, LJIIJJI().LIZ().LIZ()))) {
            z = false;
        }
        View view = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        TextView textView = (TextView) view.findViewById(2131168471);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setEnabled(z);
        View view2 = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        TextView textView2 = (TextView) view2.findViewById(2131168471);
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        textView2.setAlpha(f);
    }

    @Override // com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase
    public final void LIZ(C3199v c3199v) {
        if (PatchProxy.proxy(new Object[]{c3199v}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(c3199v);
        super.LIZ(c3199v);
        LIZ(C413602Yo.LIZ(c3199v.m15891LJ(), new StartLiveWidget$initStartLiveViewModel$1(this)));
        Disposable subscribe = c3199v.LJJIIZ().LIZIZ().subscribe(new C86832KJm(this));
        Intrinsics.checkNotNullExpressionValue(subscribe, "");
        LIZ(subscribe);
        c3199v.LJJI().LIZ(new StartLiveWidget$initStartLiveViewModel$3(this));
        LIZ(C413602Yo.LIZ(c3199v.LJJL(), new StartLiveWidget$initStartLiveViewModel$4(this)));
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        c3199v.LIZ(context, LJIJ());
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget
    public final void LIZ(LiveMode liveMode) {
        int i;
        int i2;
        AbstractC414762bG<AudioInteractMode> abstractC414762bG;
        AudioInteractMode LIZ2;
        if (PatchProxy.proxy(new Object[]{liveMode}, this, LIZ, false, 15).isSupported) {
            return;
        }
        LIZ(LJIIJJI().LIZIZ().LIZ());
        if (liveMode != null) {
            int i3 = C86825KJf.LIZJ[liveMode.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_SCREENSHOT_TITLE_HAND_TOUR;
                            Intrinsics.checkNotNullExpressionValue(settingKey, "");
                            Boolean value = settingKey.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "");
                            if (value.booleanValue()) {
                                View view = this.contentView;
                                Intrinsics.checkNotNullExpressionValue(view, "");
                                ((TextView) view.findViewById(2131168471)).setText(2131582559);
                            } else {
                                View view2 = this.contentView;
                                Intrinsics.checkNotNullExpressionValue(view2, "");
                                ((TextView) view2.findViewById(2131168471)).setText(2131582560);
                            }
                        }
                    } else {
                        View view3 = this.contentView;
                        Intrinsics.checkNotNullExpressionValue(view3, "");
                        TextView textView = (TextView) view3.findViewById(2131168471);
                        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
                        if (proxy.isSupported) {
                            i2 = ((Integer) proxy.result).intValue();
                        } else {
                            C3258d c3258d = this.LJJ;
                            if (c3258d != null && (abstractC414762bG = c3258d.LIZIZ) != null && (LIZ2 = abstractC414762bG.LIZ()) != null) {
                                int i4 = C86825KJf.LIZIZ[LIZ2.ordinal()];
                                if (i4 != 1) {
                                    if (i4 != 2) {
                                        if (i4 == 3) {
                                            i2 = 2131587821;
                                        }
                                    } else {
                                        i2 = 2131587812;
                                    }
                                } else {
                                    i2 = 2131587828;
                                }
                            }
                            i2 = 2131582558;
                        }
                        textView.setText(i2);
                    }
                } else {
                    m15857LJ();
                }
            } else {
                View view4 = this.contentView;
                Intrinsics.checkNotNullExpressionValue(view4, "");
                TextView textView2 = (TextView) view4.findViewById(2131168471);
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
                if (proxy2.isSupported) {
                    i = ((Integer) proxy2.result).intValue();
                } else if (LJIIZILJ().LJJJJL().LIZ().intValue() != 0) {
                    i = 2131582557;
                } else {
                    int i5 = C86825KJf.LIZ[LJIIZILJ().LJJL().LIZ().ordinal()];
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                i = 2131587853;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            i = 2131587854;
                        }
                    } else {
                        i = 2131582555;
                    }
                }
                textView2.setText(i);
            }
        }
        View view5 = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view5, "");
        View findViewById = view5.findViewById(2131168471);
        View view6 = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view6, "");
        TextView textView3 = (TextView) view6.findViewById(2131168471);
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        LLY.LIZ(findViewById, textView3.getText().toString());
    }

    public final void LIZ(Room room) {
        if (PatchProxy.proxy(new Object[]{room}, this, LIZ, false, 16).isSupported) {
            return;
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 18);
        if (proxy.isSupported) {
            if (((Boolean) proxy.result).booleanValue()) {
                return;
            }
        } else if (K5Y.LIZ()) {
            C4574547f.LIZ().LIZ("screenshot_back_dialog_show");
            v$a v_a = new v$a(getContext(), 4);
            v_a.LIZ(false);
            v_a.LIZIZ(false);
            Context context = getContext();
            Intrinsics.checkNotNull(context);
            v_a.LIZIZ(context.getString(2131586004));
            v_a.LIZIZ(0, 2131582651, new KCI(this)).LIZIZ(1, 2131582393, DialogInterface$OnClickListenerC425382sO.LIZIZ).LIZJ();
            KCO.LIZIZ("SCREEN_SHOT");
            return;
        }
        ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).startLiveManager().LIZIZ();
        if (Room.isValid(room)) {
            C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f7145dN;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            Boolean LIZ2 = c87308Kak.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            if (LIZ2.booleanValue()) {
                if (!PatchProxy.proxy(new Object[]{room}, this, LIZ, false, 17).isSupported) {
                    v$a v_a2 = new v$a(getContext(), 1);
                    v_a2.LIZ(false);
                    v_a2.LIZIZ(false);
                    Context context2 = getContext();
                    Intrinsics.checkNotNull(context2);
                    v_a2.LIZ(context2.getString(2131582668));
                    Context context3 = getContext();
                    Intrinsics.checkNotNull(context3);
                    v_a2.LIZIZ(context3.getString(2131582667));
                    v_a2.LIZIZ(2, 2131582666, new KCH(this, room)).LIZJ();
                    KCO.LIZIZ("MEDIA");
                    HashMap hashMap = new HashMap();
                    hashMap.put("live_type", "media");
                    LIZ("livesdk_anchor_liverejoin_show", hashMap);
                    return;
                }
                return;
            }
            v$a v_a3 = new v$a(getContext(), 4);
            v_a3.LIZ(false);
            Context context4 = getContext();
            Intrinsics.checkNotNull(context4);
            v_a3.LIZIZ(context4.getString(2131582665));
            v_a3.LIZIZ(0, 2131582664, new KCG(this, room)).LIZIZ(1, 2131582393, DialogInterface$OnClickListenerC86837KJr.LIZIZ).LIZJ();
            KCO.LIZIZ("VIDEO");
            LIZ(this, "restart_live_alert_show", (Map) null, 2, (Object) null);
        }
    }

    public StartLiveWidget(KJV kjv, AbstractC76988GWw abstractC76988GWw) {
        C106862S5w.LIZ(kjv, abstractC76988GWw);
        this.LIZLLL = kjv;
        this.LIZIZ = abstractC76988GWw;
    }

    public static /* synthetic */ void LIZ(StartLiveWidget startLiveWidget, String str, Map map, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{startLiveWidget, str, null, 2, null}, null, LIZ, true, 20).isSupported) {
            return;
        }
        startLiveWidget.LIZ(str, (Map<String, String>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase
    public final void LIZ(String str, Room room, LiveMode liveMode, Challenge challenge, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z;
        AudioInteractMode audioInteractMode;
        int i;
        int i2;
        IUser iUser;
        Integer num;
        byte b;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        AbstractC414762bG<AudioInteractMode> abstractC414762bG;
        C3VF user;
        IUser LIZ2;
        C3199v.C3200b LIZ3;
        String str14;
        String str15;
        String str16;
        CategoryNode LIZ4;
        String authTypeStr;
        if (PatchProxy.proxy(new Object[]{str, room, liveMode, challenge, str2}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, room, liveMode, str2);
        Game LIZ5 = LJIIZILJ().LJI().LIZ();
        C442853fT c442853fT = C442873fV.LIZ;
        Integer LIZ6 = LJIJI().LIZIZ().LIZ();
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{LIZ6}, c442853fT, C442853fT.LIZ, false, 2);
        if (proxy.isSupported) {
            str3 = (String) proxy.result;
        } else {
            if (LIZ6 != null) {
                if (LIZ6.intValue() == 0) {
                    str3 = "default";
                } else if (LIZ6.intValue() == 1) {
                    str3 = "writing";
                } else if (LIZ6.intValue() == 2) {
                    str3 = "none";
                }
            }
            str3 = "";
        }
        String LIZ7 = LJIIZILJ().LJII().LIZ();
        Boolean LIZ8 = LJIIZILJ().LJFF().LIZ();
        Sticker LIZ9 = LJIIJJI().LIZLLL().LIZ();
        if (LIZ9 != null) {
            str4 = LIZ9.getEffectId();
        } else {
            str4 = null;
        }
        HashMap<String, String> value = LJIIZILJ().LJJII().getValue();
        if (value != null) {
            str5 = value.get("video_id");
        } else {
            str5 = null;
        }
        String LIZ10 = LJIIZILJ().LJIIZILJ().LIZ();
        HashMap hashMap = new HashMap();
        String str17 = "1";
        if (this.LJIIZILJ) {
            str6 = "0";
        } else {
            str6 = str17;
        }
        hashMap.put("is_show", str6);
        if (LJIIZILJ().LJJJJI().LIZ().intValue() <= 0) {
            str7 = "0";
        } else {
            str7 = str17;
        }
        hashMap.put("is_life", str7);
        hashMap.put("goods_num", String.valueOf(LJIIZILJ().LJJJJI().LIZ().intValue()));
        hashMap.put("active_user_type", this.LJIJ);
        hashMap.put("show_active_user_ucnt", String.valueOf(this.LJIJI));
        hashMap.put("send_gift_type", String.valueOf(LJIIZILJ().LJJLI()));
        PermissionResult LIZ11 = LJIIJJI().LJI().LIZ();
        if (LIZ11 != null && (authTypeStr = LIZ11.getAuthTypeStr()) != null) {
            hashMap.put("account_type", authTypeStr);
        }
        if (liveMode == LiveMode.SCREEN_RECORD) {
            C2WC<CategoryNode> LJIILL = LJIIZILJ().LJIILL();
            if (LJIILL != null && (LIZ4 = LJIILL.LIZ()) != null) {
                str15 = LIZ4.title;
            } else {
                str15 = null;
            }
            hashMap.put("live_content", str15);
            C2WC<String> LJJIIZI = LJIIZILJ().LJJIIZI();
            if (LJJIIZI != null) {
                str16 = LJJIIZI.LIZ();
            } else {
                str16 = null;
            }
            hashMap.put("game_name", str16);
        }
        String LIZ12 = LJIIZILJ().LJJIJIL().LIZ();
        if (LIZ12 != null) {
            hashMap.put("user_type", LIZ12);
        }
        if (liveMode == LiveMode.SCREEN_RECORD && (LIZ3 = LJIIZILJ().LJJIJLIJ().LIZ()) != null) {
            if (LIZ3.LIZJ.isEmpty()) {
                str14 = "0";
            } else {
                str14 = str17;
            }
            hashMap.put("is_xingtu", str14);
        }
        int intValue = LJIIZILJ().LJJJJL().LIZ().intValue();
        hashMap.put("is_paidlive", String.valueOf(intValue));
        if (intValue != 0) {
            hashMap.put("ticket_id", String.valueOf(LJIIZILJ().LJJJJLL().LIZ().longValue()));
            hashMap.put("ticket_name", String.valueOf(LJIIZILJ().LJJJLZIJ().LIZ()));
        }
        PreviewSourceParam LIZIZ = LJIIZILJ().LJIJ().LIZIZ();
        if (LIZIZ != null && LIZIZ.LIZJ()) {
            hashMap.put("carry_ticket_type", "invited");
            hashMap.put("if_from_invited_page", str17);
        }
        IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
        if (iUserService != null && (user = iUserService.user()) != null && (LIZ2 = user.LIZ()) != null && LIZ2.getSecret() == 1) {
            z = true;
        } else {
            z = false;
        }
        String LIZ13 = LIZ();
        ALogger.m15801d(LIZ13, "loggerForRealStart isSecretUser:" + z);
        hashMap.put("visible_range", C77755Gl3.LIZIZ.LIZ(LJIIZILJ().LJJIZ().LIZ(), z));
        Long LIZ14 = LJIIZILJ().LJIJI().LIZ();
        Boolean LIZ15 = LJIIZILJ().LJIJJ().LIZ();
        C3258d LIZIZ2 = LJIIZILJ().LJJI().LIZIZ();
        if (LIZIZ2 != null && (abstractC414762bG = LIZIZ2.LIZIZ) != null) {
            audioInteractMode = abstractC414762bG.LIZ();
        } else {
            audioInteractMode = null;
        }
        KK0.LIZ(str, room, liveMode, LIZ5, str3, LIZ7, LIZ8, str4, str, challenge, str5, str2, LIZ10, hashMap, LIZ14, LIZ15, null, null, audioInteractMode, LJIIZILJ().LJJL().LIZ());
        String str18 = "voice_live";
        if (LJIIZILJ().LJII().LIZ() != null && !TextUtils.isEmpty(LJIIZILJ().LJII().LIZ())) {
            LiveMode LIZ16 = LJIIJJI().LIZ().LIZ();
            i = 0;
            i2 = 1;
            i2 = 1;
            iUser = null;
            if (!PatchProxy.proxy(new Object[]{room, LIZ16}, null, C86817KIx.LIZ, true, 2).isSupported) {
                HashMap hashMap2 = new HashMap();
                if (!room.isLiveTypeAudio()) {
                    str13 = "video_live";
                } else {
                    str13 = str18;
                }
                hashMap2.put("live_type", str13);
                hashMap2.put("streaming_type", LIZ16.logStreamingType);
                C4574547f LIZ17 = C4574547f.LIZ();
                C8668v c8668v = new C8668v();
                c8668v.LIZIZ("live_take");
                c8668v.LJFF("other");
                c8668v.LIZ("live_take_page");
                LIZ17.LIZ("pm_live_take_title_write", hashMap2, c8668v, new C8670x());
            }
        } else {
            i = 0;
            i2 = 1;
            iUser = null;
        }
        IPropertyCache LIZIZ3 = ((KQO) ServiceManager.getService(KQO.class)).LIZIZ();
        LiveMode LIZ18 = LJIIJJI().LIZ().LIZ();
        IUser LIZ19 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
        if (!(LIZ19 instanceof User)) {
            LIZ19 = iUser;
        }
        User user2 = (User) LIZ19;
        C6127bf LIZ20 = LJIIZILJ().LJIIJ().LIZ();
        if (LIZ20 != null) {
            num = Integer.valueOf(LIZ20.LIZ);
        } else {
            num = iUser;
        }
        int intValue2 = num.intValue();
        Object[] objArr = new Object[7];
        objArr[i] = LIZIZ3;
        objArr[i2] = iUser;
        objArr[2] = iUser;
        objArr[3] = room;
        objArr[4] = LIZ18;
        objArr[5] = user2;
        objArr[6] = Integer.valueOf(intValue2);
        if (!PatchProxy.proxy(objArr, iUser, KK0.LIZ, i2, 5).isSupported) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("event_page", "live_take_page");
            if (!room.isLiveTypeAudio()) {
                str18 = "video_live";
            }
            hashMap3.put("live_type", str18);
            hashMap3.put("streaming_type", LIZ18.logStreamingType);
            hashMap3.put("anchor_id", String.valueOf(user2.getId()));
            if (intValue2 == -1) {
                str17 = "0";
            }
            hashMap3.put("is_tag", str17);
            LiveMode liveMode2 = LiveMode.VIDEO;
            hashMap3.put("is_beauty", "0");
            String str19 = "0.0";
            if (LIZ18 != LiveMode.VIDEO) {
                str10 = "0";
            } else {
                str10 = str19;
            }
            hashMap3.put("beauty_white", str10);
            if (LIZ18 != LiveMode.VIDEO) {
                str11 = "0";
            } else {
                str11 = str19;
            }
            hashMap3.put("beauty_skin", str11);
            if (LIZ18 != LiveMode.VIDEO) {
                str12 = "0";
            } else {
                str12 = str19;
            }
            hashMap3.put("beauty_bigeye", str12);
            if (LIZ18 != LiveMode.VIDEO) {
                str19 = "0";
            }
            hashMap3.put("beauty_facethin", str19);
            C4574547f LIZ21 = C4574547f.LIZ();
            Object[] objArr2 = new Object[i2];
            C8668v c8668v2 = new C8668v();
            c8668v2.LIZIZ("live_take");
            c8668v2.LJFF("click");
            objArr2[i] = c8668v2;
            LIZ21.LIZ("pm_live_take_edit_features", hashMap3, objArr2);
        }
        LiveMode LIZ22 = LJIIJJI().LIZ().LIZ();
        Object[] objArr3 = new Object[i2];
        objArr3[i] = LIZ22;
        if (!PatchProxy.proxy(objArr3, iUser, KCU.LIZ, i2, 3).isSupported) {
            C106862S5w.LIZ(LIZ22);
            ALogger.m15801d("LiveBroadcastBaseMonitor", "monitor createRoomApiSuccess live mode:" + LIZ22.name());
            C86665KDb.LIZ("ttlive_create_room_api", null, LIZ22, null, 8, null).LIZ(i).LIZ().LIZ();
        }
        if (LJIIJJI().LIZ().LIZ() == LiveMode.AUDIO) {
            b = 1;
        } else {
            b = 0;
        }
        Object[] objArr4 = new Object[i2];
        objArr4[i] = Byte.valueOf(b);
        if (!PatchProxy.proxy(objArr4, iUser, BroadcastCreateRoomApiMonitor.LIZ, i2, 4).isSupported) {
            long LIZIZ4 = BroadcastCreateRoomApiMonitor.LIZIZ();
            C4CT LIZ23 = new C4CT().LIZ("duration", (float) LIZIZ4).LIZ("errorDomain", BroadcastCreateRoomApiMonitor.Domain.API.value);
            if (b != 0) {
                str8 = "audio";
            } else {
                str8 = "video";
            }
            LIZ23.LIZ("mediaType", str8).LIZ("hotsoon_live_start_live_failure_rate", i);
            Object[] objArr5 = new Object[2];
            objArr5[i] = new Long(LIZIZ4);
            objArr5[i2] = Byte.valueOf(b);
            if (!PatchProxy.proxy(objArr5, iUser, BroadcastCreateRoomApiMonitor.LIZ, i2, 8).isSupported) {
                JSONObject jSONObject = new JSONObject();
                if (b != 0) {
                    str9 = "audio";
                } else {
                    str9 = "video";
                }
                C440943cO.LIZ(jSONObject, "media_type", str9);
                C91211Lwb.LIZ("ttlive_create_room_all", i, LIZIZ4, jSONObject);
            }
        }
        ALogger.m15801d("LiveUxTracer", "on room change, realStartLive, before: " + System.currentTimeMillis());
    }
}
