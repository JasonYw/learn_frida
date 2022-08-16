package com.bytedance.android.live.profit.lottery;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.View;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.profit.lottery.C5322ad;
import com.bytedance.android.livesdk.chatroom.indicator.shortterm.framework.C6039h;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.ShortTermIndicatorConfig;
import com.bytedance.android.livesdkapi.sti.framework.AbstractC9710i;
import com.bytedance.android.livesdkapi.sti.framework.IIconModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.view.DraweeView;
import com.p1594ss.android.ugc.aweme.lego.experiment.LegoCommitOptExperiment;
import io.reactivex.disposables.Disposable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import p003X.AbstractC102063QHh;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C448893pD;
import p003X.C448993pN;
import p003X.C449073pV;
import p003X.C449083pW;
import p003X.C4574547f;
import p003X.C462924Sg;
import p003X.LK1;
import p003X.P1W;
import p003X.QB4;
import p003X.QBE;
import p003X.QBJ;
import p003X.QBN;
import p003X.QBO;
import p003X.QBP;

/* renamed from: com.bytedance.android.live.profit.lottery.p */
/* loaded from: classes8.dex */
public final class C5337p extends AbstractC102063QHh<C5322ad.AbstractC5323a> {
    public static ChangeQuickRedirect LIZ;
    public static final QBO LIZJ = new QBO((byte) 0);
    public final QBJ<C5322ad.AbstractC5323a> LIZIZ = QBJ.LIZJ.LIZ(LotteryIconModel$stateBuffer$1.INSTANCE);
    public final C448893pD LIZLLL;

    static {
        Covode.recordClassIndex(33521);
    }

    @Override // p003X.AbstractC102060QHe
    public final void aq_() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZLLL.LJII().LIZ(new LotteryIconModel$onCreate$1(this));
    }

    @Override // com.bytedance.android.livesdkapi.sti.framework.IIconModel
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[0], null, C448993pN.LIZ, true, 7).isSupported) {
            C4574547f.LIZ().LIZ("click_lottery", null, Room.class, C8668v.class);
        }
        this.LIZLLL.LIZLLL().LIZ(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5337p(C448893pD c448893pD) {
        super(C449083pW.LIZ, ShortTermIndicatorConfig.ElementType.Lottery.typeId);
        C106862S5w.LIZ(c448893pD);
        this.LIZLLL = c448893pD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdkapi.sti.framework.IIconModel
    public final /* synthetic */ AbstractC9710i LIZ(Object obj) {
        C6039h c6039h;
        String str;
        View view;
        MethodCollector.m14708i(2181);
        C5322ad.AbstractC5323a abstractC5323a = (C5322ad.AbstractC5323a) obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC5323a}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            AbstractC9710i abstractC9710i = (AbstractC9710i) proxy.result;
            MethodCollector.m14707o(2181);
            return abstractC9710i;
        }
        C106862S5w.LIZ(abstractC5323a);
        String str2 = null;
        if (abstractC5323a instanceof C449073pV) {
            if (((C449073pV) abstractC5323a).LIZJ) {
                QBE qbe = new QBE(LIZ(), null, 0, 6);
                AbstractC9710i mo22923LJ = mo22923LJ();
                if (!(mo22923LJ instanceof QBP)) {
                    mo22923LJ = null;
                }
                QBP qbp = (QBP) mo22923LJ;
                if (qbp != null) {
                    str = qbp.getLabel();
                } else {
                    str = null;
                }
                HSImageView hSImageView = new HSImageView(qbe.getContext());
                Context context = qbe.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                GenericDraweeHierarchyBuilder newInstance = GenericDraweeHierarchyBuilder.newInstance(context.getResources());
                newInstance.setFadeDuration(0);
                AbstractC9710i mo22923LJ2 = mo22923LJ();
                if (mo22923LJ2 != null && (view = mo22923LJ2.getView()) != null) {
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredWidth > 0 && measuredHeight > 0) {
                        Bitmap LIZ2 = C116971W2r.LIZ(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(LIZ2);
                        if (qbp != null) {
                            qbp.setLabel(null);
                        }
                        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                        view.layout(0, 0, LIZ2.getWidth(), LIZ2.getHeight());
                        view.draw(canvas);
                        if (qbp != null) {
                            qbp.setLabel(str);
                        }
                        Context context2 = qbe.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        newInstance.setPlaceholderImage(new BitmapDrawable(context2.getResources(), LIZ2));
                        qbe.setBackgroundEnabled(false);
                    }
                }
                hSImageView.setHierarchy(newInstance.build());
                qbe.setContentView(hSImageView);
                AbstractC9710i mo22923LJ3 = mo22923LJ();
                if (!(mo22923LJ3 instanceof QBP)) {
                    mo22923LJ3 = null;
                }
                QBP qbp2 = (QBP) mo22923LJ3;
                if (qbp2 != null) {
                    str2 = qbp2.getLabel();
                }
                qbe.setLabel(str2);
                c6039h = qbe;
            } else {
                C6039h c6039h2 = new C6039h(LIZ(), null, 0, 6);
                c6039h2.setContentView(LIZ(2130857496, 35.0f, 40.0f));
                c6039h2.setContentRightMargin(LK1.LIZLLL(6));
                c6039h2.setContentTopMargin(LK1.LIZLLL(5));
                c6039h = c6039h2;
            }
            C6039h c6039h3 = c6039h;
            MethodCollector.m14707o(2181);
            return c6039h3;
        }
        MethodCollector.m14707o(2181);
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.sti.framework.IIconModel
    public final /* synthetic */ IIconModel.C9706b LIZ(Object obj, Object obj2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, obj2}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (IIconModel.C9706b) proxy.result;
        }
        C106862S5w.LIZ(obj);
        if (obj instanceof C449073pV) {
            return new IIconModel.C9706b(LIZ(2130857497, 88.0f, 96.0f), 0L, false, 6);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.sti.framework.IIconModel
    public final /* synthetic */ void LIZ(Object obj, Object obj2, AbstractC9710i abstractC9710i) {
        C5322ad.AbstractC5323a abstractC5323a = (C5322ad.AbstractC5323a) obj2;
        if (!PatchProxy.proxy(new Object[]{obj, abstractC5323a, abstractC9710i}, this, LIZ, false, 4).isSupported) {
            C106862S5w.LIZ(abstractC5323a);
            if (abstractC5323a instanceof C449073pV) {
                C449073pV c449073pV = (C449073pV) abstractC5323a;
                P1W.LIZ(this, c449073pV.LIZIZ.LIZLLL - System.currentTimeMillis(), null, null, null, 14, null);
                if (c449073pV.LIZJ && (abstractC9710i instanceof QBE)) {
                    View contentView = ((QBE) abstractC9710i).getContentView();
                    if (contentView instanceof HSImageView) {
                        DraweeView draweeView = (DraweeView) contentView;
                        draweeView.setController(Fresco.newDraweeControllerBuilder().mo27962setUri(Uri.parse(LIZJ.LIZ())).setControllerListener(C462924Sg.LIZ(new LotteryIconModel$applyState$1(abstractC9710i), new LotteryIconModel$applyState$2(this), false, true, 4, null)).mo27965build());
                        draweeView.getHierarchy();
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(abstractC9710i, "templateAlpha", 1.0f, 0.0f);
                    ofFloat.setStartDelay(LegoCommitOptExperiment.BOOT_FINISH_DELAY_TIME);
                    ofFloat.setDuration(400L);
                    ofFloat.start();
                    LIZIZ(QB4.LIZ(ofFloat));
                } else if (!c449073pV.LIZJ) {
                    long coerceAtLeast = RangesKt___RangesKt.coerceAtLeast((c449073pV.LIZIZ.LIZLLL - System.currentTimeMillis()) - LegoCommitOptExperiment.BOOT_FINISH_DELAY_TIME, 0L);
                    Disposable subscribe = QB4.LIZ(coerceAtLeast, coerceAtLeast).ignoreElements().subscribe(new QBN(this, abstractC5323a));
                    Intrinsics.checkNotNullExpressionValue(subscribe, "");
                    LIZIZ(subscribe);
                }
                if (!(obj instanceof C449073pV)) {
                    if (!PatchProxy.proxy(new Object[0], null, C448993pN.LIZ, true, 6).isSupported) {
                        C4574547f.LIZ().LIZ("lottery_show", null, Room.class, C8668v.class);
                    }
                    String LIZ2 = LIZJ.LIZ();
                    if (LIZ2.length() > 0 && LIZ2 != null) {
                        LIZJ.LIZIZ().LIZ(LIZ2);
                    }
                }
            }
        }
    }
}
