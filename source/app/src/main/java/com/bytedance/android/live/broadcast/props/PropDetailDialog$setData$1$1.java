package com.bytedance.android.live.broadcast.props;

import android.widget.TextView;
import com.bytedance.android.live.broadcast.props.p278a.C3221f;
import com.bytedance.android.live.broadcast.props.p278a.C3223h;
import com.bytedance.android.live.broadcast.props.p278a.C3229n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C89181LBv;
import p003X.DialogC89180LBu;
import p003X.LC7;
import p003X.LCG;
import p003X.LK1;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class PropDetailDialog$setData$1$1 extends Lambda implements Function1<C3229n, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LC7 this$0;

    static {
        Covode.recordClassIndex(17585);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropDetailDialog$setData$1$1(LC7 lc7) {
        super(1);
        this.this$0 = lc7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3229n c3229n) {
        Boolean bool;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        Long l7;
        long j;
        Long l8;
        long j2;
        Long l9;
        Long l10;
        long j3;
        C3229n c3229n2 = c3229n;
        if (!PatchProxy.proxy(new Object[]{c3229n2}, this, changeQuickRedirect, false, 1).isSupported) {
            if (c3229n2 != null) {
                bool = c3229n2.f25935LJ;
            } else {
                bool = null;
            }
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                this.this$0.LIZIZ.LJIIJ = "1";
                C89181LBv c89181LBv = C89181LBv.LIZIZ;
                C3223h c3223h = this.this$0.LIZJ;
                Object obj = this.this$0.LIZIZ.LJIIL.get("prop_enter_from");
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str = (String) obj;
                Object obj2 = this.this$0.LIZIZ.LJIIL.get("promote_scene");
                if (!(obj2 instanceof Integer)) {
                    obj2 = null;
                }
                c89181LBv.LIZ(c3223h, str, (Integer) obj2, c3229n2.LIZ);
                TextView textView = this.this$0.LIZIZ.LJIIIZ;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = (TextView) this.this$0.LIZIZ.findViewById(2131193856);
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                TextView textView3 = (TextView) this.this$0.LIZIZ.findViewById(2131194990);
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                TextView textView4 = (TextView) this.this$0.LIZIZ.findViewById(2131194991);
                if (textView4 != null) {
                    textView4.setVisibility(0);
                }
                TextView textView5 = this.this$0.LIZIZ.LJIIIZ;
                if (textView5 != null) {
                    textView5.setText(LCG.LIZIZ.LIZ(c3229n2.LIZIZ));
                }
                TextView textView6 = (TextView) this.this$0.LIZIZ.findViewById(2131194845);
                if (textView6 != null) {
                    LCG lcg = LCG.LIZIZ;
                    C3221f c3221f = this.this$0.LIZJ.f25934LJ;
                    if (c3221f != null && (l10 = c3221f.LJI) != null) {
                        long longValue = l10.longValue();
                        Long l11 = c3229n2.LIZIZ;
                        if (l11 != null) {
                            j3 = l11.longValue();
                        } else {
                            j3 = 0;
                        }
                        l9 = Long.valueOf(longValue - j3);
                    } else {
                        l9 = null;
                    }
                    textView6.setText(lcg.LIZ(l9));
                }
                DialogC89180LBu.LIZ(this.this$0.LIZIZ).LIZ(c3229n2.LIZ, c3229n2.LIZIZ);
                TextView textView7 = (TextView) this.this$0.LIZIZ.findViewById(2131194847);
                if (textView7 != null) {
                    Object[] objArr = new Object[1];
                    LCG lcg2 = LCG.LIZIZ;
                    C3221f c3221f2 = this.this$0.LIZJ.f25934LJ;
                    if (c3221f2 != null && (l7 = c3221f2.LJII) != null) {
                        long longValue2 = l7.longValue();
                        C3221f c3221f3 = this.this$0.LIZJ.f25934LJ;
                        if (c3221f3 != null && (l8 = c3221f3.LJI) != null) {
                            long longValue3 = l8.longValue();
                            Long l12 = c3229n2.LIZIZ;
                            if (l12 != null) {
                                j2 = l12.longValue();
                            } else {
                                j2 = 0;
                            }
                            j = longValue3 - j2;
                        } else {
                            j = 0;
                        }
                        l6 = Long.valueOf(longValue2 - j);
                    } else {
                        l6 = null;
                    }
                    objArr[0] = lcg2.LIZ(l6);
                    textView7.setText(LK5.LIZ(2131583706, objArr));
                }
            } else {
                this.this$0.LIZIZ.LJIIJ = "0";
                C89181LBv c89181LBv2 = C89181LBv.LIZIZ;
                C3223h c3223h2 = this.this$0.LIZJ;
                Object obj3 = this.this$0.LIZIZ.LJIIL.get("prop_enter_from");
                if (!(obj3 instanceof String)) {
                    obj3 = null;
                }
                String str2 = (String) obj3;
                Object obj4 = this.this$0.LIZIZ.LJIIL.get("promote_scene");
                if (!(obj4 instanceof Integer)) {
                    obj4 = null;
                }
                c89181LBv2.LIZ(c3223h2, str2, (Integer) obj4, "");
                long j4 = 0;
                Long l13 = null;
                DialogC89180LBu.LIZ(this.this$0.LIZIZ).LIZ((String) null, (Long) 0L);
                TextView textView8 = this.this$0.LIZIZ.LJIIIZ;
                if (textView8 != null) {
                    textView8.setText("");
                }
                TextView textView9 = this.this$0.LIZIZ.LJIIIZ;
                if (textView9 != null) {
                    textView9.setVisibility(8);
                }
                TextView textView10 = (TextView) this.this$0.LIZIZ.findViewById(2131194990);
                if (textView10 != null) {
                    textView10.setVisibility(8);
                }
                TextView textView11 = (TextView) this.this$0.LIZIZ.findViewById(2131194991);
                if (textView11 != null) {
                    textView11.setVisibility(8);
                }
                TextView textView12 = (TextView) this.this$0.LIZIZ.findViewById(2131194845);
                if (textView12 != null) {
                    LCG lcg3 = LCG.LIZIZ;
                    C3221f c3221f4 = this.this$0.LIZJ.f25934LJ;
                    if (c3221f4 != null) {
                        l5 = c3221f4.LJI;
                    } else {
                        l5 = null;
                    }
                    textView12.setText(lcg3.LIZ(l5));
                }
                LCG lcg4 = LCG.LIZIZ;
                C3221f c3221f5 = this.this$0.LIZJ.f25934LJ;
                if (c3221f5 != null) {
                    l = c3221f5.LJI;
                } else {
                    l = null;
                }
                C3221f c3221f6 = this.this$0.LIZJ.f25934LJ;
                if (c3221f6 != null) {
                    l2 = c3221f6.LJII;
                } else {
                    l2 = null;
                }
                if (lcg4.LIZ(l, l2)) {
                    TextView textView13 = (TextView) this.this$0.LIZIZ.findViewById(2131194847);
                    if (textView13 != null) {
                        Object[] objArr2 = new Object[1];
                        LCG lcg5 = LCG.LIZIZ;
                        C3221f c3221f7 = this.this$0.LIZJ.f25934LJ;
                        if (c3221f7 != null && (l3 = c3221f7.LJII) != null) {
                            long longValue4 = l3.longValue();
                            C3221f c3221f8 = this.this$0.LIZJ.f25934LJ;
                            if (c3221f8 != null && (l4 = c3221f8.LJI) != null) {
                                j4 = l4.longValue();
                            }
                            l13 = Long.valueOf(longValue4 - j4);
                        }
                        objArr2[0] = lcg5.LIZ(l13);
                        textView13.setText(LK5.LIZ(2131583706, objArr2));
                    }
                } else {
                    TextView textView14 = (TextView) this.this$0.LIZIZ.findViewById(2131194847);
                    if (textView14 != null) {
                        LK1.LIZ(textView14);
                    }
                    TextView textView15 = (TextView) this.this$0.LIZIZ.findViewById(2131194848);
                    if (textView15 != null) {
                        LK1.LIZ(textView15);
                    }
                }
                TextView textView16 = (TextView) this.this$0.LIZIZ.findViewById(2131193856);
                if (textView16 != null) {
                    textView16.setVisibility(0);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
