package com.bytedance.android.live.broadcast.gamedetailv2.template;

import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.comment.data.C2988e;
import com.bytedance.android.live.broadcast.gamedetailv2.data.C3119b;
import com.bytedance.android.live.broadcast.view.GamePromoteCommonRatingBar;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.config.C6835ar;
import com.bytedance.android.livesdk.config.C6837at;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.widget.FlowLayout;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.AnonymousClass479;
import p003X.C106862S5w;
import p003X.C479894y7;
import p003X.C88999L4v;
import p003X.C89045L6p;
import p003X.IQV;
import p003X.L46;
import p003X.L7T;
import p003X.LHU;
import p003X.LK1;
import p003X.LK5;
import p003X.M0Q;
import p003X.View$OnClickListenerC88989L4l;

/* loaded from: classes5.dex */
public final class f$a extends L7T<C3119b> {
    public static ChangeQuickRedirect LIZ;
    public final boolean LIZLLL = !AnonymousClass479.LIZJ();

    /* renamed from: LJ */
    public final View f25893LJ;
    public final ConstraintLayout LJFF;
    public final HSImageView LJI;
    public final TextView LJII;
    public final FlowLayout LJIIIIZZ;
    public final TextView LJIIIZ;
    public final View LJIIJ;
    public final C89045L6p LJIIJJI;

    static {
        Covode.recordClassIndex(16714);
    }

    @Override // p003X.L7T
    public final void LIZ() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f$a(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View findViewById = view.findViewById(2131196398);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.f25893LJ = findViewById;
        View findViewById2 = view.findViewById(2131170263);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LJFF = (ConstraintLayout) findViewById2;
        View findViewById3 = view.findViewById(2131179014);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LJI = (HSImageView) findViewById3;
        View findViewById4 = view.findViewById(2131194202);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.LJII = (TextView) findViewById4;
        View findViewById5 = view.findViewById(2131175205);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.LJIIIIZZ = (FlowLayout) findViewById5;
        View findViewById6 = view.findViewById(2131194203);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.LJIIIZ = (TextView) findViewById6;
        View findViewById7 = view.findViewById(2131196400);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "");
        this.LJIIJ = findViewById7;
        C13491f LIZ2 = IQV.LIZ(C89045L6p.class);
        this.LJIIJJI = (C89045L6p) (!(LIZ2 instanceof C89045L6p) ? null : LIZ2);
    }

    @Override // p003X.L7T
    public final /* synthetic */ void LIZ(C3119b c3119b) {
        Long l;
        Long l2;
        C2988e c2988e;
        String valueOf;
        String LIZ2;
        String str;
        String str2;
        List<String> list;
        String str3;
        String str4;
        Long l3;
        Long l4;
        MethodCollector.m14708i(1288);
        C3119b c3119b2 = c3119b;
        if (!PatchProxy.proxy(new Object[]{c3119b2}, this, LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(c3119b2);
            if (C88999L4v.LIZIZ.LIZ()) {
                this.LJIIJ.setVisibility(8);
                ViewGroup.LayoutParams layoutParams = this.LJI.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    layoutParams2.topMargin = LK5.LIZ(28.0f);
                    this.LJI.setLayoutParams(layoutParams2);
                    this.LJFF.setBackgroundColor(LK5.LIZIZ(2131623937));
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
                    MethodCollector.m14707o(1288);
                    throw nullPointerException;
                }
            }
            if (!this.LIZLLL) {
                this.LJIIJ.setVisibility(8);
            } else if (!C88999L4v.LIZIZ.LIZ()) {
                this.LJIIJ.setVisibility(0);
            }
            Long l5 = null;
            if (C88999L4v.LIZIZ.LIZ()) {
                SettingKey<C6835ar> settingKey = LiveSettingKeys.LIVE_GAME_PROMOTE_DETAIL_VIDEO_SCENE_CONFIG;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                if (settingKey.getValue().LIZ) {
                    C3243u c3243u = c3119b2.LIZIZ;
                    if (c3243u != null && (l3 = c3243u.LJJIIJZLJL) != null && l3.longValue() > 10000) {
                        this.LJIIIZ.setVisibility(0);
                        TextView textView = this.LJIIIZ;
                        String LIZ3 = LK5.LIZ(2131583395);
                        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                        Object[] objArr = new Object[1];
                        LHU lhu = LHU.LIZIZ;
                        C3243u c3243u2 = c3119b2.LIZIZ;
                        if (c3243u2 != null) {
                            l4 = c3243u2.LJJIIJZLJL;
                        } else {
                            l4 = null;
                        }
                        objArr[0] = lhu.LIZ(l4);
                        String format = String.format(LIZ3, Arrays.copyOf(objArr, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "");
                        textView.setText(format);
                    } else {
                        this.LJIIIZ.setVisibility(8);
                    }
                } else {
                    this.LJIIIZ.setVisibility(8);
                }
            } else {
                SettingKey<Integer> settingKey2 = LiveSettingKeys.LIVE_GAME_PROMOTE_DETAIL_STYLE_CONFIG;
                Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                Integer value = settingKey2.getValue();
                if (value != null && (value.intValue() == 1 || value.intValue() == 2)) {
                    this.LJIIIZ.setVisibility(8);
                } else {
                    C3243u c3243u3 = c3119b2.LIZIZ;
                    if (c3243u3 != null && (l = c3243u3.LJJIIJZLJL) != null && l.longValue() > 10000) {
                        this.LJIIIZ.setVisibility(0);
                        TextView textView2 = this.LJIIIZ;
                        String LIZ4 = LK5.LIZ(2131583395);
                        Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                        Object[] objArr2 = new Object[1];
                        LHU lhu2 = LHU.LIZIZ;
                        C3243u c3243u4 = c3119b2.LIZIZ;
                        if (c3243u4 != null) {
                            l2 = c3243u4.LJJIIJZLJL;
                        } else {
                            l2 = null;
                        }
                        objArr2[0] = lhu2.LIZ(l2);
                        String format2 = String.format(LIZ4, Arrays.copyOf(objArr2, 1));
                        Intrinsics.checkNotNullExpressionValue(format2, "");
                        textView2.setText(format2);
                    } else {
                        this.LJIIIZ.setVisibility(8);
                    }
                }
            }
            C3243u c3243u5 = c3119b2.LIZIZ;
            if (c3243u5 != null && (str4 = c3243u5.LJFF) != null && (!StringsKt__StringsJVMKt.isBlank(str4))) {
                ImageModel imageModel = new ImageModel();
                imageModel.setUrls(CollectionsKt__CollectionsKt.arrayListOf(str4));
                M0Q.LIZ(this.LJI, imageModel);
            }
            C3243u c3243u6 = c3119b2.LIZIZ;
            if (c3243u6 != null && (str3 = c3243u6.LIZLLL) != null && (!StringsKt__StringsJVMKt.isBlank(str3))) {
                this.LJII.setText(str3);
            }
            this.LJIIIIZZ.removeAllViews();
            SettingKey<C6837at> settingKey3 = LiveSettingKeys.LIVE_GAME_SECURITY_SIGN_PROGRESS_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey3, "");
            if (settingKey3.getValue().LIZIZ == 1) {
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "");
                TextView textView3 = new TextView(new ContextThemeWrapper(view.getContext(), 2131494878));
                textView3.setText(LK5.LIZ(2131583398));
                Drawable LIZJ = LK5.LIZJ(2130857037);
                Intrinsics.checkNotNullExpressionValue(LIZJ, "");
                LIZJ.setBounds(0, 0, LIZJ.getMinimumWidth(), LIZJ.getMinimumHeight());
                textView3.setCompoundDrawables(LIZJ, null, null, null);
                textView3.setCompoundDrawablePadding(LK5.LIZ(2.0f));
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.rightMargin = LK5.LIZ(5.0f);
                this.LJIIIIZZ.addView(textView3, marginLayoutParams);
            }
            C3243u c3243u7 = c3119b2.LIZIZ;
            if (c3243u7 != null && (list = c3243u7.LJIIIIZZ) != null) {
                for (String str5 : list) {
                    View view2 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    TextView textView4 = new TextView(new ContextThemeWrapper(view2.getContext(), 2131494880));
                    textView4.setText(str5);
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
                    marginLayoutParams2.rightMargin = LK5.LIZ(5.0f);
                    this.LJIIIIZZ.addView(textView4, marginLayoutParams2);
                }
            }
            C3243u c3243u8 = c3119b2.LIZIZ;
            if (c3243u8 != null) {
                l5 = c3243u8.LJJIIJ;
            }
            if (l5 != null && l5.longValue() == 1) {
                View findViewById = this.itemView.findViewById(2131170264);
                Intrinsics.checkNotNullExpressionValue(findViewById, "");
                LK1.LIZ(findViewById);
                MethodCollector.m14707o(1288);
                return;
            } else if (!PatchProxy.proxy(new Object[]{c3119b2}, this, LIZ, false, 2).isSupported) {
                SettingKey<Boolean> settingKey4 = LiveSettingKeys.LIVE_GAME_PROMOTE_COMMENT_ENABLED;
                Intrinsics.checkNotNullExpressionValue(settingKey4, "");
                if (!settingKey4.getValue().booleanValue()) {
                    View findViewById2 = this.itemView.findViewById(2131170264);
                    Intrinsics.checkNotNullExpressionValue(findViewById2, "");
                    LK1.LIZ(findViewById2);
                    MethodCollector.m14707o(1288);
                    return;
                } else if (c3119b2.LJII == null || ((c2988e = c3119b2.LJII) != null && c2988e.LIZLLL == 1)) {
                    View findViewById3 = this.itemView.findViewById(2131170264);
                    Intrinsics.checkNotNullExpressionValue(findViewById3, "");
                    LK1.LIZ(findViewById3);
                    MethodCollector.m14707o(1288);
                    return;
                } else {
                    C2988e c2988e2 = c3119b2.LJII;
                    if (c2988e2 != null) {
                        this.itemView.findViewById(2131170264).setOnClickListener(View$OnClickListenerC88989L4l.LIZIZ);
                        TextView textView5 = (TextView) this.itemView.findViewById(2131195230);
                        View view3 = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view3, "");
                        textView5.setTypeface(C479894y7.LIZ(view3.getContext()));
                        if (c2988e2.f25810LJ == 1) {
                            valueOf = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
                        } else {
                            valueOf = String.valueOf(LHU.LIZIZ.LIZ(c2988e2.LIZ, 1));
                        }
                        textView5.setText(valueOf);
                        GamePromoteCommonRatingBar gamePromoteCommonRatingBar = (GamePromoteCommonRatingBar) this.itemView.findViewById(2131187139);
                        if (c2988e2.f25810LJ == 1) {
                            gamePromoteCommonRatingBar.setProgress(0);
                        } else {
                            gamePromoteCommonRatingBar.setProgress((int) (c2988e2.LIZ * 10.0d));
                        }
                        TextView textView6 = (TextView) this.itemView.findViewById(2131193760);
                        if (c2988e2.f25810LJ == 1) {
                            LIZ2 = LK5.LIZ(2131583632);
                        } else {
                            LIZ2 = LK5.LIZ(2131583530, LHU.LIZIZ.LIZ(Long.valueOf(c2988e2.LIZIZ)));
                        }
                        textView6.setText(LIZ2);
                        L46 l46 = L46.LIZIZ;
                        C89045L6p c89045L6p = this.LJIIJJI;
                        if (c89045L6p == null || (str = c89045L6p.LJIIIIZZ) == null) {
                            str = "";
                        }
                        String valueOf2 = String.valueOf(c2988e2.LIZ);
                        C89045L6p c89045L6p2 = this.LJIIJJI;
                        if (c89045L6p2 == null || (str2 = c89045L6p2.LJII) == null) {
                            str2 = "";
                        }
                        if (!PatchProxy.proxy(new Object[]{str, valueOf2, str2}, l46, L46.LIZ, false, 1).isSupported) {
                            C106862S5w.LIZ(str, valueOf2, str2);
                            l46.LIZ("livesdk_game_promote_user_promote_detail_game_rating_show", MapsKt__MapsKt.mutableMapOf(TuplesKt.m137to("game_ad_type", str), TuplesKt.m137to("game_rating", valueOf2), TuplesKt.m137to("enter_from", str2)), Room.class, C8668v.class);
                        }
                        MethodCollector.m14707o(1288);
                        return;
                    }
                }
            }
        }
        MethodCollector.m14707o(1288);
    }

    @Override // p003X.L7T
    public final /* synthetic */ void LIZ(boolean z, C3119b c3119b) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c3119b}, this, LIZ, false, 4).isSupported) {
            C106862S5w.LIZ(c3119b);
        }
    }
}
