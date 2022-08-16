package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.gamedetail.anchor.C3036d;
import com.bytedance.android.live.broadcast.gamedetail.anchor.C3037j;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.AnchorGamePromoteInfoWidget;
import com.bytedance.android.live.broadcast.hybrid.uielement.GameDetailLynxCard;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12642p;
import com.bytedance.ies.sve_core.PureWidget;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C436843Py;
import p003X.C489195Vh;
import p003X.C89000L4w;
import p003X.L52;
import p003X.LK1;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class AnchorGamePromoteInfoWidget extends PureWidget<C3081a> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public View LIZIZ;
    public TextView LIZJ;
    public View LIZLLL;

    /* renamed from: LJ */
    public GameDetailLynxCard f25859LJ;
    public GameDetailLynxCard LJFF;
    public GameDetailLynxCard LJI;

    static {
        Covode.recordClassIndex(16306);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698313;
    }

    @Override // com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 8).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public AnchorGamePromoteInfoWidget() {
        super(null, 1);
    }

    @Override // com.bytedance.ies.sve_core.PureWidget
    /* renamed from: r_ */
    public final void mo14489r_() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.mo14489r_();
        GameDetailLynxCard gameDetailLynxCard = this.f25859LJ;
        if (gameDetailLynxCard != null) {
            gameDetailLynxCard.LIZ();
        }
        GameDetailLynxCard gameDetailLynxCard2 = this.LJFF;
        if (gameDetailLynxCard2 != null) {
            gameDetailLynxCard2.LIZ();
        }
        GameDetailLynxCard gameDetailLynxCard3 = this.LJI;
        if (gameDetailLynxCard3 != null) {
            gameDetailLynxCard3.LIZ();
        }
    }

    @Override // com.bytedance.ies.sve_core.PureWidget
    public final void LIZLLL() {
        View view;
        TextView textView;
        View view2;
        GameDetailLynxCard gameDetailLynxCard;
        GameDetailLynxCard gameDetailLynxCard2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.LIZLLL();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            View view3 = this.contentView;
            GameDetailLynxCard gameDetailLynxCard3 = null;
            if (view3 != null) {
                view = view3.findViewById(2131184378);
            } else {
                view = null;
            }
            this.LIZIZ = view;
            View view4 = this.contentView;
            if (view4 != null) {
                textView = (TextView) view4.findViewById(2131184379);
            } else {
                textView = null;
            }
            this.LIZJ = textView;
            View view5 = this.contentView;
            if (view5 != null) {
                view2 = view5.findViewById(2131184377);
            } else {
                view2 = null;
            }
            this.LIZLLL = view2;
            View view6 = this.LIZLLL;
            if (view6 != null) {
                view6.setOnClickListener(new L52(this));
            }
            View view7 = this.contentView;
            if (view7 != null) {
                gameDetailLynxCard = (GameDetailLynxCard) view7.findViewById(2131186704);
            } else {
                gameDetailLynxCard = null;
            }
            this.f25859LJ = gameDetailLynxCard;
            View view8 = this.contentView;
            if (view8 != null) {
                gameDetailLynxCard2 = (GameDetailLynxCard) view8.findViewById(2131186706);
            } else {
                gameDetailLynxCard2 = null;
            }
            this.LJFF = gameDetailLynxCard2;
            View view9 = this.contentView;
            if (view9 != null) {
                gameDetailLynxCard3 = (GameDetailLynxCard) view9.findViewById(2131186707);
            }
            this.LJI = gameDetailLynxCard3;
        }
    }

    @Override // p003X.LAL
    public final /* synthetic */ void LIZ(AbstractC12642p abstractC12642p) {
        String str;
        final String str2;
        C3081a c3081a = (C3081a) abstractC12642p;
        if (!PatchProxy.proxy(new Object[]{c3081a}, this, LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(c3081a);
            C3036d c3036d = c3081a.LIZIZ;
            if (c3036d != null) {
                if (!PatchProxy.proxy(new Object[]{c3036d}, this, LIZ, false, 7).isSupported) {
                    if (c3036d.LJJI != null) {
                        C3037j c3037j = c3036d.LJJI;
                        if (c3037j != null) {
                            str = c3037j.LIZ;
                        } else {
                            str = null;
                        }
                        if (str != null && str.length() != 0) {
                            C89000L4w.LIZIZ.LIZ(c3036d);
                            View view = this.LIZIZ;
                            if (view != null) {
                                LK1.LIZJ(view);
                            }
                            TextView textView = this.LIZJ;
                            if (textView != null) {
                                textView.setMovementMethod(LinkMovementMethod.getInstance());
                            }
                            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            C3037j c3037j2 = c3036d.LJJI;
                            if (c3037j2 == null || (str2 = c3037j2.LIZ) == null) {
                                str2 = "";
                            }
                            final String LIZ2 = LK5.LIZ(2131583740);
                            final int LIZIZ = LK5.LIZIZ(2131628627);
                            final C489195Vh c489195Vh = new C489195Vh(LIZIZ, new AnchorGamePromoteInfoWidget$updateNoticeLy$clickableSpan$1(this, c3036d));
                            TextView textView2 = this.LIZJ;
                            if (textView2 != null) {
                                textView2.post(new Runnable() { // from class: X.4wk
                                    public static ChangeQuickRedirect LIZ;

                                    static {
                                        Covode.recordClassIndex(16308);
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                            return;
                                        }
                                        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                                        C478634w5 c478634w5 = C478634w5.LIZIZ;
                                        TextView textView3 = AnchorGamePromoteInfoWidget.this.LIZJ;
                                        String str3 = str2;
                                        String str4 = LIZ2;
                                        Intrinsics.checkNotNullExpressionValue(str4, "");
                                        spannableStringBuilder2.append((CharSequence) c478634w5.LIZ(textView3, str3, str4));
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(LIZIZ), spannableStringBuilder.length() - LIZ2.length(), spannableStringBuilder.length(), 33);
                                        SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                                        spannableStringBuilder3.setSpan(c489195Vh, spannableStringBuilder3.length() - LIZ2.length(), spannableStringBuilder.length(), 33);
                                        TextView textView4 = AnchorGamePromoteInfoWidget.this.LIZJ;
                                        if (textView4 != null) {
                                            textView4.setText(spannableStringBuilder);
                                        }
                                    }
                                });
                            }
                        }
                    }
                    View view2 = this.LIZIZ;
                    if (view2 != null) {
                        LK1.LIZ(view2);
                    }
                }
                String LIZ3 = C436843Py.LIZ(c3036d);
                Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                if (!PatchProxy.proxy(new Object[]{c3036d, LIZ3}, this, LIZ, false, 6).isSupported) {
                    if (c3036d.LIZJ()) {
                        GameDetailLynxCard gameDetailLynxCard = this.LJFF;
                        if (gameDetailLynxCard != null) {
                            LK1.LIZ((View) gameDetailLynxCard);
                        }
                    } else {
                        GameDetailLynxCard gameDetailLynxCard2 = this.LJFF;
                        if (gameDetailLynxCard2 != null) {
                            LK1.LIZJ(gameDetailLynxCard2);
                        }
                        GameDetailLynxCard gameDetailLynxCard3 = this.LJFF;
                        if (gameDetailLynxCard3 != null) {
                            SettingKey<String> settingKey = LiveSettingKeys.LIVE_GAME_ANCHOR_PROMOTE_INCOME_SCHEMA;
                            Intrinsics.checkNotNullExpressionValue(settingKey, "");
                            String value = settingKey.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "");
                            gameDetailLynxCard3.LIZ(value, MapsKt__MapsJVMKt.mapOf(TuplesKt.m137to("gameDetailInfo", LIZ3)));
                        }
                    }
                }
                if (!PatchProxy.proxy(new Object[]{c3036d, LIZ3}, this, LIZ, false, 5).isSupported) {
                    if (!c3036d.LIZJ()) {
                        GameDetailLynxCard gameDetailLynxCard4 = this.f25859LJ;
                        if (gameDetailLynxCard4 != null) {
                            LK1.LIZ((View) gameDetailLynxCard4);
                        }
                        GameDetailLynxCard gameDetailLynxCard5 = this.LJI;
                        if (gameDetailLynxCard5 != null) {
                            LK1.LIZ((View) gameDetailLynxCard5);
                            return;
                        }
                        return;
                    }
                    GameDetailLynxCard gameDetailLynxCard6 = this.f25859LJ;
                    if (gameDetailLynxCard6 != null) {
                        LK1.LIZJ(gameDetailLynxCard6);
                    }
                    GameDetailLynxCard gameDetailLynxCard7 = this.f25859LJ;
                    if (gameDetailLynxCard7 != null) {
                        SettingKey<String> settingKey2 = LiveSettingKeys.LIVE_GAME_ANCHOR_PROMOTE_DATA_INFO_SCHEMA;
                        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                        String value2 = settingKey2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "");
                        gameDetailLynxCard7.LIZ(value2, MapsKt__MapsJVMKt.mapOf(TuplesKt.m137to("gameDetailInfo", LIZ3)));
                    }
                    if (TextUtils.isEmpty(c3036d.LJIL)) {
                        GameDetailLynxCard gameDetailLynxCard8 = this.LJI;
                        if (gameDetailLynxCard8 == null) {
                            return;
                        }
                        LK1.LIZ((View) gameDetailLynxCard8);
                        return;
                    }
                    GameDetailLynxCard gameDetailLynxCard9 = this.LJI;
                    if (gameDetailLynxCard9 != null) {
                        LK1.LIZJ(gameDetailLynxCard9);
                    }
                    GameDetailLynxCard gameDetailLynxCard10 = this.LJI;
                    if (gameDetailLynxCard10 == null) {
                        return;
                    }
                    SettingKey<String> settingKey3 = LiveSettingKeys.LIVE_GAME_ANCHOR_PROMOTE_TASK_PROGRESS_SCHEMA;
                    Intrinsics.checkNotNullExpressionValue(settingKey3, "");
                    String value3 = settingKey3.getValue();
                    Intrinsics.checkNotNullExpressionValue(value3, "");
                    gameDetailLynxCard10.LIZ(value3, MapsKt__MapsJVMKt.mapOf(TuplesKt.m137to("gameDetailInfo", LIZ3)));
                }
            }
        }
    }
}
