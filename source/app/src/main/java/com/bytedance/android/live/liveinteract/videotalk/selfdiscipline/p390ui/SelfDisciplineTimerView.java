package com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.p390ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.C4949a;
import com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.p390ui.SelfDisciplineTimerView;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.C6987fp;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler;
import com.bytedance.android.livesdk.utils.C9303cy;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C109391T5d;
import p003X.C414192aL;
import p003X.C448113nx;
import p003X.C79242HLo;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.ui.SelfDisciplineTimerView */
/* loaded from: classes12.dex */
public final class SelfDisciplineTimerView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public final ConcurrentHashMap<Long, Long> LIZIZ;
    public LinkPlayerInfo LIZJ;
    public Disposable LIZLLL;

    /* renamed from: LJ */
    public HashMap f26455LJ;

    static {
        Covode.recordClassIndex(30426);
    }

    public SelfDisciplineTimerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SelfDisciplineTimerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{2131195514}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.f26455LJ == null) {
            this.f26455LJ = new HashMap();
        }
        View view = (View) this.f26455LJ.get(2131195514);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(2131195514);
        this.f26455LJ.put(2131195514, findViewById);
        return findViewById;
    }

    public final ConcurrentHashMap<Long, Long> getMDurationHolder() {
        return this.LIZIZ;
    }

    public final LinkPlayerInfo getMPlayerInfo() {
        return this.LIZJ;
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        LIZIZ();
    }

    private final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        Disposable disposable = this.LIZLLL;
        if (disposable != null) {
            disposable.dispose();
        }
        this.LIZJ = null;
        TextView textView = (TextView) LIZ(2131195514);
        if (textView != null) {
            textView.setText(LIZ(0L));
        }
        TextView textView2 = (TextView) LIZ(2131195514);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        Disposable disposable = this.LIZLLL;
        if (disposable != null) {
            disposable.dispose();
        }
        TextView textView = (TextView) LIZ(2131195514);
        if (textView != null) {
            textView.setText(LIZ(0L));
        }
        TextView textView2 = (TextView) LIZ(2131195514);
        if (textView2 != null) {
            textView2.setVisibility(4);
        }
    }

    public final void setMPlayerInfo(LinkPlayerInfo linkPlayerInfo) {
        this.LIZJ = linkPlayerInfo;
    }

    private final String LIZIZ(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (j == 0) {
            return "00";
        }
        if (1 <= j && 9 >= j) {
            return "0" + j;
        }
        return String.valueOf(j);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.ui.SelfDisciplineTimerView$1 */
    /* loaded from: classes12.dex */
    public static final class C49521 extends Lambda implements Function1<View, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(30427);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49521(Context context) {
            super(1);
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(view);
                LinkPlayerInfo mPlayerInfo = SelfDisciplineTimerView.this.getMPlayerInfo();
                if (mPlayerInfo != null) {
                    C448113nx c448113nx = C448113nx.LIZIZ;
                    Context context = this.$context;
                    User LIZ = mPlayerInfo.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ, "");
                    long id = LIZ.getId();
                    if (!PatchProxy.proxy(new Object[]{context, new Long(id)}, c448113nx, C448113nx.LIZ, false, 2).isSupported) {
                        C106862S5w.LIZ(context);
                        SettingKey<C6987fp> settingKey = LiveConfigSettingKeys.LIVE_SELF_DISCIPLINE_LYNX;
                        Intrinsics.checkNotNullExpressionValue(settingKey, "");
                        String str = settingKey.getValue().LIZIZ;
                        if (str == null) {
                            str = "";
                        }
                        C9303cy c9303cy = new C9303cy(str);
                        SettingKey<C6987fp> settingKey2 = LiveConfigSettingKeys.LIVE_SELF_DISCIPLINE_LYNX;
                        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                        String str2 = settingKey2.getValue().LIZJ;
                        if (str2 == null) {
                            str2 = "";
                        }
                        c9303cy.LIZ(PushConstants.WEB_URL, str2);
                        if (C79242HLo.LIZ() == id) {
                            c9303cy.LIZ(C109391T5d.LJFF, "480");
                        } else {
                            c9303cy.LIZ(C109391T5d.LJFF, "420");
                        }
                        c9303cy.LIZJ(PushConstants.WEB_URL).LIZ("to_user_id", String.valueOf(id));
                        ((ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class)).handle(context, c9303cy.LIZ());
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final String LIZ(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        long hours = TimeUnit.SECONDS.toHours(j);
        return LIZIZ(hours) + LoggerUtil.TWO_POINT_TAG + LIZIZ(TimeUnit.SECONDS.toMinutes(j) % 60) + LoggerUtil.TWO_POINT_TAG + LIZIZ(j % 60);
    }

    public final void LIZ(LinkPlayerInfo linkPlayerInfo) {
        if (PatchProxy.proxy(new Object[]{linkPlayerInfo}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkPlayerInfo);
        this.LIZJ = linkPlayerInfo;
        User LIZ2 = linkPlayerInfo.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        final long id = LIZ2.getId();
        LIZ(id, linkPlayerInfo.LJJIL);
        TextView textView = (TextView) LIZ(2131195514);
        if (textView == null || textView.getVisibility() != 0) {
            TextView textView2 = (TextView) LIZ(2131195514);
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = (TextView) LIZ(2131195514);
            if (textView3 != null) {
                textView3.setText(LIZ(0L));
            }
        }
        Disposable disposable = this.LIZLLL;
        if (disposable != null) {
            disposable.dispose();
        }
        this.LIZLLL = Observable.interval(0L, 1L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() { // from class: X.3ny
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(30428);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(Long l) {
                long j;
                if (!PatchProxy.proxy(new Object[]{l}, this, LIZ, false, 1).isSupported) {
                    Long l2 = SelfDisciplineTimerView.this.getMDurationHolder().get(Long.valueOf(id));
                    if (l2 == null) {
                        LinkPlayerInfo mPlayerInfo = SelfDisciplineTimerView.this.getMPlayerInfo();
                        if (mPlayerInfo != null) {
                            j = mPlayerInfo.LJJIL;
                        } else {
                            j = 0;
                        }
                        l2 = Long.valueOf(j);
                    }
                    Intrinsics.checkNotNullExpressionValue(l2, "");
                    long longValue = l2.longValue();
                    TextView textView4 = (TextView) SelfDisciplineTimerView.this.LIZ(2131195514);
                    if (textView4 != null) {
                        textView4.setText(SelfDisciplineTimerView.this.LIZ(longValue));
                    }
                    SelfDisciplineTimerView.this.getMDurationHolder().put(Long.valueOf(id), Long.valueOf(longValue + 1));
                }
            }
        });
    }

    private final void LIZ(long j, long j2) {
        if (PatchProxy.proxy(new Object[]{new Long(j), new Long(j2)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        if (this.LIZIZ.containsKey(Long.valueOf(j))) {
            Long l = this.LIZIZ.get(Long.valueOf(j));
            if (l != null && j2 > l.longValue()) {
                this.LIZIZ.put(Long.valueOf(j), Long.valueOf(j2));
                return;
            }
            return;
        }
        this.LIZIZ.put(Long.valueOf(j), Long.valueOf(j2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfDisciplineTimerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ConcurrentHashMap<Long, Long> concurrentHashMap;
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(2027);
        C4949a LIZIZ = C4949a.f26454LJ.LIZIZ();
        this.LIZIZ = (LIZIZ == null || (concurrentHashMap = LIZIZ.m15680LJ()) == null) ? new ConcurrentHashMap<>() : concurrentHashMap;
        LayoutInflater.from(context).inflate(2131700219, this);
        TextView textView = (TextView) LIZ(2131195514);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        setOnClickListener(C414192aL.LIZ(0L, new C49521(context), 1, null));
        MethodCollector.m14707o(2027);
    }

    public /* synthetic */ SelfDisciplineTimerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
