package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.config.C6936ds;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.C9558q;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.HTD;
import p003X.HYB;
import p003X.LK5;
import p003X.M0Q;

/* loaded from: classes3.dex */
public final class PkGradeChangeResultView extends ConstraintLayout {
    public static ChangeQuickRedirect LIZ;
    public HashMap LIZIZ;

    static {
        Covode.recordClassIndex(25620);
    }

    public PkGradeChangeResultView(Context context) {
        this(context, null, 0, 6, null);
    }

    public PkGradeChangeResultView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = new HashMap();
        }
        View view = (View) this.LIZIZ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LIZIZ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LIZ(C9558q c9558q) {
        String str;
        String str2;
        Map<Long, C6936ds> value;
        String str3;
        String str4;
        String str5;
        if (PatchProxy.proxy(new Object[]{c9558q}, this, LIZ, false, 1).isSupported) {
            return;
        }
        if (c9558q == null) {
            setVisibility(8);
            return;
        }
        long LIZLLL = HTD.LIZIZ.LIZLLL();
        if (LIZLLL == 3) {
            if (c9558q.LIZ >= 0) {
                TextView textView = (TextView) LIZ(2131194260);
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setText(LK5.LIZ(2131587298, Long.valueOf(c9558q.LIZ)));
            } else {
                TextView textView2 = (TextView) LIZ(2131194260);
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setText(LK5.LIZ(2131587297, Long.valueOf(c9558q.LIZ)));
            }
        } else if (LIZLLL == 4) {
            if (c9558q.LIZIZ >= 0) {
                TextView textView3 = (TextView) LIZ(2131194260);
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                textView3.setText(LK5.LIZ(2131587300, Long.valueOf(c9558q.LIZIZ)));
            } else {
                TextView textView4 = (TextView) LIZ(2131194260);
                Intrinsics.checkNotNullExpressionValue(textView4, "");
                textView4.setText(LK5.LIZ(2131587299, Long.valueOf(c9558q.LIZIZ)));
            }
        }
        ImageView imageView = (ImageView) LIZ(2131179584);
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(0);
        String str6 = null;
        if (c9558q.LIZIZ > 0) {
            SettingKey<Map<Long, C6936ds>> settingKey = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Map<Long, C6936ds> value2 = settingKey.getValue();
            if (value2 != null && !value2.isEmpty()) {
                SettingKey<Map<Long, C6936ds>> settingKey2 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                C6936ds c6936ds = settingKey2.getValue().get(Long.valueOf(LIZLLL));
                if (c6936ds != null) {
                    str4 = c6936ds.LJJJJLI;
                } else {
                    str4 = null;
                }
                if (str4 != null && str4.length() != 0) {
                    HSImageView hSImageView = (HSImageView) LIZ(2131178617);
                    SettingKey<Map<Long, C6936ds>> settingKey3 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                    Intrinsics.checkNotNullExpressionValue(settingKey3, "");
                    C6936ds c6936ds2 = settingKey3.getValue().get(Long.valueOf(LIZLLL));
                    if (c6936ds2 != null) {
                        str5 = c6936ds2.LJJJJLI;
                    } else {
                        str5 = null;
                    }
                    M0Q.LIZ(hSImageView, str5);
                    SettingKey<Map<Long, C6936ds>> settingKey4 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                    Intrinsics.checkNotNullExpressionValue(settingKey4, "");
                    value = settingKey4.getValue();
                    if (value == null && !value.isEmpty()) {
                        SettingKey<Map<Long, C6936ds>> settingKey5 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                        Intrinsics.checkNotNullExpressionValue(settingKey5, "");
                        C6936ds c6936ds3 = settingKey5.getValue().get(Long.valueOf(LIZLLL));
                        if (c6936ds3 != null) {
                            str3 = c6936ds3.LJJJJLL;
                        } else {
                            str3 = null;
                        }
                        if (str3 != null && str3.length() != 0) {
                            HSImageView hSImageView2 = (HSImageView) LIZ(2131178536);
                            SettingKey<Map<Long, C6936ds>> settingKey6 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                            Intrinsics.checkNotNullExpressionValue(settingKey6, "");
                            C6936ds c6936ds4 = settingKey6.getValue().get(Long.valueOf(LIZLLL));
                            if (c6936ds4 != null) {
                                str6 = c6936ds4.LJJJJLL;
                            }
                            M0Q.LIZ(hSImageView2, str6);
                            return;
                        }
                        return;
                    }
                }
            }
            ((SimpleDraweeView) LIZ(2131178617)).setImageResource(2130857651);
            SettingKey<Map<Long, C6936ds>> settingKey42 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
            Intrinsics.checkNotNullExpressionValue(settingKey42, "");
            value = settingKey42.getValue();
            if (value == null) {
            }
        } else if (c9558q.LIZIZ < 0) {
            SettingKey<Map<Long, C6936ds>> settingKey7 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
            Intrinsics.checkNotNullExpressionValue(settingKey7, "");
            Map<Long, C6936ds> value3 = settingKey7.getValue();
            if (value3 != null && !value3.isEmpty()) {
                SettingKey<Map<Long, C6936ds>> settingKey8 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                Intrinsics.checkNotNullExpressionValue(settingKey8, "");
                C6936ds c6936ds5 = settingKey8.getValue().get(Long.valueOf(LIZLLL));
                if (c6936ds5 != null) {
                    str2 = c6936ds5.LJJJJZI;
                } else {
                    str2 = null;
                }
                if (str2 != null && str2.length() != 0) {
                    HSImageView hSImageView3 = (HSImageView) LIZ(2131178617);
                    SettingKey<Map<Long, C6936ds>> settingKey9 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                    Intrinsics.checkNotNullExpressionValue(settingKey9, "");
                    C6936ds c6936ds6 = settingKey9.getValue().get(Long.valueOf(LIZLLL));
                    if (c6936ds6 != null) {
                        str6 = c6936ds6.LJJJJZI;
                    }
                    M0Q.LIZ(hSImageView3, str6);
                    return;
                }
            }
            ((SimpleDraweeView) LIZ(2131178617)).setImageResource(2130857648);
        } else {
            SettingKey<Map<Long, C6936ds>> settingKey10 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
            Intrinsics.checkNotNullExpressionValue(settingKey10, "");
            Map<Long, C6936ds> value4 = settingKey10.getValue();
            if (value4 != null && !value4.isEmpty()) {
                SettingKey<Map<Long, C6936ds>> settingKey11 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                Intrinsics.checkNotNullExpressionValue(settingKey11, "");
                C6936ds c6936ds7 = settingKey11.getValue().get(Long.valueOf(LIZLLL));
                if (c6936ds7 != null) {
                    str = c6936ds7.LJJJJZ;
                } else {
                    str = null;
                }
                if (str != null && str.length() != 0) {
                    HSImageView hSImageView4 = (HSImageView) LIZ(2131178617);
                    SettingKey<Map<Long, C6936ds>> settingKey12 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                    Intrinsics.checkNotNullExpressionValue(settingKey12, "");
                    C6936ds c6936ds8 = settingKey12.getValue().get(Long.valueOf(LIZLLL));
                    if (c6936ds8 != null) {
                        str6 = c6936ds8.LJJJJZ;
                    }
                    M0Q.LIZ(hSImageView4, str6);
                    return;
                }
            }
            ((SimpleDraweeView) LIZ(2131178617)).setImageResource(2130857649);
        }
    }

    public final void LIZ(String str, LinkCrossRoomDataHolder.PkResult pkResult) {
        String str2;
        String str3;
        String str4;
        if (PatchProxy.proxy(new Object[]{str, pkResult}, this, LIZ, false, 2).isSupported) {
            return;
        }
        if (str == null) {
            setVisibility(8);
            return;
        }
        TextView textView = (TextView) LIZ(2131194260);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setText(str);
        ImageView imageView = (ImageView) LIZ(2131179584);
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
        ((TextView) LIZ(2131194260)).setPadding(LK5.LIZ(6.0f), 0, LK5.LIZ(6.0f), 0);
        String str5 = null;
        if (pkResult != null) {
            int i = HYB.LIZ[pkResult.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    ((TextView) LIZ(2131194260)).setTextColor(CastProtectorUtils.parseColor("#FFFFFF"));
                    SettingKey<Map<Long, C6936ds>> settingKey = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                    Intrinsics.checkNotNullExpressionValue(settingKey, "");
                    Map<Long, C6936ds> value = settingKey.getValue();
                    if (value != null && !value.isEmpty()) {
                        SettingKey<Map<Long, C6936ds>> settingKey2 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                        C6936ds c6936ds = settingKey2.getValue().get(5L);
                        if (c6936ds != null) {
                            str4 = c6936ds.LJJJJLI;
                        } else {
                            str4 = null;
                        }
                        if (str4 != null && str4.length() != 0) {
                            HSImageView hSImageView = (HSImageView) LIZ(2131178617);
                            SettingKey<Map<Long, C6936ds>> settingKey3 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                            Intrinsics.checkNotNullExpressionValue(settingKey3, "");
                            C6936ds c6936ds2 = settingKey3.getValue().get(5L);
                            if (c6936ds2 != null) {
                                str5 = c6936ds2.LJJJJLI;
                            }
                            M0Q.LIZ(hSImageView, str5);
                            return;
                        }
                    }
                    ((SimpleDraweeView) LIZ(2131178617)).setImageResource(2130857652);
                    return;
                }
            } else {
                ((TextView) LIZ(2131194260)).setTextColor(CastProtectorUtils.parseColor("#362A80"));
                SettingKey<Map<Long, C6936ds>> settingKey4 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                Intrinsics.checkNotNullExpressionValue(settingKey4, "");
                Map<Long, C6936ds> value2 = settingKey4.getValue();
                if (value2 != null && !value2.isEmpty()) {
                    SettingKey<Map<Long, C6936ds>> settingKey5 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                    Intrinsics.checkNotNullExpressionValue(settingKey5, "");
                    C6936ds c6936ds3 = settingKey5.getValue().get(5L);
                    if (c6936ds3 != null) {
                        str3 = c6936ds3.LJJJJZ;
                    } else {
                        str3 = null;
                    }
                    if (str3 != null && str3.length() != 0) {
                        HSImageView hSImageView2 = (HSImageView) LIZ(2131178617);
                        SettingKey<Map<Long, C6936ds>> settingKey6 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                        Intrinsics.checkNotNullExpressionValue(settingKey6, "");
                        C6936ds c6936ds4 = settingKey6.getValue().get(5L);
                        if (c6936ds4 != null) {
                            str5 = c6936ds4.LJJJJZ;
                        }
                        M0Q.LIZ(hSImageView2, str5);
                        return;
                    }
                }
                ((SimpleDraweeView) LIZ(2131178617)).setImageResource(2130857649);
                return;
            }
        }
        ((TextView) LIZ(2131194260)).setTextColor(CastProtectorUtils.parseColor("#33409F"));
        SettingKey<Map<Long, C6936ds>> settingKey7 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
        Intrinsics.checkNotNullExpressionValue(settingKey7, "");
        Map<Long, C6936ds> value3 = settingKey7.getValue();
        if (value3 != null && !value3.isEmpty()) {
            SettingKey<Map<Long, C6936ds>> settingKey8 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
            Intrinsics.checkNotNullExpressionValue(settingKey8, "");
            C6936ds c6936ds5 = settingKey8.getValue().get(5L);
            if (c6936ds5 != null) {
                str2 = c6936ds5.LJJJJZI;
            } else {
                str2 = null;
            }
            if (str2 != null && str2.length() != 0) {
                HSImageView hSImageView3 = (HSImageView) LIZ(2131178617);
                SettingKey<Map<Long, C6936ds>> settingKey9 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                Intrinsics.checkNotNullExpressionValue(settingKey9, "");
                C6936ds c6936ds6 = settingKey9.getValue().get(5L);
                if (c6936ds6 != null) {
                    str5 = c6936ds6.LJJJJZI;
                }
                M0Q.LIZ(hSImageView3, str5);
                return;
            }
        }
        ((SimpleDraweeView) LIZ(2131178617)).setImageResource(2130857648);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkGradeChangeResultView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1731);
        LayoutInflater.from(context).inflate(2131699542, this);
        MethodCollector.m14707o(1731);
    }

    public /* synthetic */ PkGradeChangeResultView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
