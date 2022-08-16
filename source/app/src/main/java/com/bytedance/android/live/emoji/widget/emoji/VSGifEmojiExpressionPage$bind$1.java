package com.bytedance.android.live.emoji.widget.emoji;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.emoji.api.p332a.AbstractC4230a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C77332GeE;
import p003X.C81918IQm;
import p003X.C91132LvK;
import p003X.C91136LvO;
import p003X.C91137LvP;

/* loaded from: classes5.dex */
public final class VSGifEmojiExpressionPage$bind$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C77332GeE $expressionContext;
    public final /* synthetic */ C91136LvO this$0;

    static {
        Covode.recordClassIndex(24918);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VSGifEmojiExpressionPage$bind$1(C91136LvO c91136LvO, C77332GeE c77332GeE) {
        super(0);
        this.this$0 = c91136LvO;
        this.$expressionContext = c77332GeE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        int i;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            View LIZ = this.this$0.LIZ();
            if (!(LIZ instanceof C91137LvP)) {
                LIZ = null;
            }
            final C91137LvP c91137LvP = (C91137LvP) LIZ;
            if (c91137LvP != null) {
                AbstractC4230a LIZ2 = this.$expressionContext.LIZ().LIZ();
                if (LIZ2 != null) {
                    c91137LvP.setOnEmojiSelectListener(LIZ2);
                }
                boolean z = this.this$0.LIZIZ;
                if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, c91137LvP, C91137LvP.LIZ, false, 1).isSupported) {
                    c91137LvP.LIZIZ = z;
                    if (c91137LvP.LIZIZ) {
                        i = 3;
                    } else {
                        i = 6;
                    }
                    c91137LvP.LIZJ = i;
                    c91137LvP.f9102LJ = (RecyclerView) c91137LvP.findViewById(2131193209);
                    c91137LvP.LJFF = c91137LvP.findViewById(2131193207);
                    c91137LvP.LJI = (ImageView) c91137LvP.findViewById(2131193206);
                    if (!PatchProxy.proxy(new Object[0], c91137LvP, C91137LvP.LIZ, false, 2).isSupported) {
                        C91132LvK c91132LvK = c91137LvP.LIZLLL;
                        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], c91132LvK, C91132LvK.LIZ, false, 2);
                        if (!proxy.isSupported ? !(!c91132LvK.LJII || C91132LvK.LIZ(c91132LvK.LJIIL)) : ((Boolean) proxy.result).booleanValue()) {
                            if (c91137LvP.LJFF != null) {
                                c91137LvP.LJFF.setVisibility(0);
                                if (!c91137LvP.LIZIZ && c91137LvP.LJFF.getLayoutParams() != null) {
                                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) c91137LvP.LJFF.getLayoutParams();
                                    layoutParams.width = (int) C81918IQm.LIZ(c91137LvP.LJIIIIZZ, 122.0f);
                                    layoutParams.height = (int) C81918IQm.LIZ(c91137LvP.LJIIIIZZ, 72.0f);
                                    layoutParams.rightToRight = 2131193210;
                                    layoutParams.bottomToBottom = 2131193210;
                                    c91137LvP.LJFF.setLayoutParams(layoutParams);
                                }
                            }
                            if (c91137LvP.LJI != null) {
                                c91137LvP.LJI.setVisibility(0);
                                c91137LvP.LJI.setOnClickListener(new View.OnClickListener(c91137LvP) { // from class: X.LvR
                                    public static ChangeQuickRedirect LIZ;
                                    public final C91137LvP LIZIZ;

                                    static {
                                        Covode.recordClassIndex(24945);
                                    }

                                    {
                                        this.LIZIZ = c91137LvP;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                                            return;
                                        }
                                        C91137LvP c91137LvP2 = this.LIZIZ;
                                        if (PatchProxy.proxy(new Object[]{view}, c91137LvP2, C91137LvP.LIZ, false, 5).isSupported || c91137LvP2.LJII == null) {
                                            return;
                                        }
                                        c91137LvP2.LJII.LIZ();
                                    }
                                });
                                if (!c91137LvP.LIZIZ && c91137LvP.LJI.getLayoutParams() != null) {
                                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) c91137LvP.LJI.getLayoutParams();
                                    layoutParams2.width = (int) C81918IQm.LIZ(c91137LvP.LJIIIIZZ, 60.0f);
                                    layoutParams2.height = (int) C81918IQm.LIZ(c91137LvP.LJIIIIZZ, 26.0f);
                                    layoutParams2.rightMargin = (int) C81918IQm.LIZ(c91137LvP.LJIIIIZZ, 21.0f);
                                    layoutParams2.bottomMargin = (int) C81918IQm.LIZ(c91137LvP.LJIIIIZZ, 11.0f);
                                    layoutParams2.rightToRight = 2131193210;
                                    layoutParams2.bottomToBottom = 2131193210;
                                    c91137LvP.LJI.setLayoutParams(layoutParams2);
                                }
                            }
                        } else {
                            if (c91137LvP.LJFF != null) {
                                c91137LvP.LJFF.setVisibility(8);
                            }
                            if (c91137LvP.LJI != null) {
                                c91137LvP.LJI.setVisibility(8);
                            }
                        }
                    }
                    c91137LvP.LIZ();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
