package com.bytedance.android.live.liveinteract.doublepk.widget;

import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.doublepk.core.AbstractC4399b;
import com.bytedance.android.live.liveinteract.doublepk.core.AbstractC4404d;
import com.bytedance.android.live.liveinteract.doublepk.core.C4398a;
import com.bytedance.android.live.liveinteract.doublepk.view.DoublePkTitleLayout;
import com.bytedance.android.live.liveinteract.voicechat.fight.view.TeamFightPKProgressLayout;
import com.bytedance.android.livesdk.chatroom.model.interact.C6174n;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.AbstractC78459GwP;
import p003X.C103397Qnf;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C423702pg;
import p003X.C77256Gd0;
import p003X.C78443Gw9;
import p003X.C78453GwJ;
import p003X.C78455GwL;
import p003X.C78456GwM;
import p003X.C78458GwO;
import p003X.C78464GwU;
import p003X.G22;
import p003X.LK1;
import p003X.LK5;
import p003X.RunnableC78740H2g;
import p003X.RunnableC78741H2h;
import p003X.View$OnClickListenerC77258Gd2;
import p003X.View$OnClickListenerC77259Gd3;
import p003X.View$OnClickListenerC77372Ges;
import p003X.View$OnClickListenerC77427Gfl;
import p003X.View$OnClickListenerC78449GwF;
import p003X.View$OnClickListenerC78450GwG;
import p003X.animation.Animation$AnimationListenerC76885GSx;
import p003X.animation.Animation$AnimationListenerC77257Gd1;

/* loaded from: classes3.dex */
public final class DoublePkViewWidget extends RoomWidget implements AbstractC78459GwP, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public C78453GwJ LIZIZ;
    public TeamFightPKProgressLayout LIZJ;
    public HSImageView LIZLLL;

    /* renamed from: LJ */
    public HSImageView f26315LJ;
    public TextView LJFF;
    public ConstraintLayout LJI;
    public ImageView LJII;
    public ImageView LJIIIIZZ;
    public final Room LJIIIZ;
    public final boolean LJIIJ;
    public final CompositeDisposable LJIIJJI = new CompositeDisposable();
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public long LJIILL;
    public C6174n LJIILLIIL;
    public DoublePkTitleLayout LJIIZILJ;
    public ImageView LJIJ;
    public ImageView LJIJI;
    public FrameLayout LJIJJ;
    public HSImageView LJIJJLI;
    public ConstraintLayout LJIL;
    public C78455GwL LJJ;

    static {
        Covode.recordClassIndex(26852);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699927;
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 11).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // p003X.AbstractC78459GwP
    public final void LIZ() {
        TextView textView;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        ALogger.m15801d("DoublePk_DoublePkViewWidget", "onPKPrepare");
        ConstraintLayout constraintLayout = this.LJI;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        TeamFightPKProgressLayout teamFightPKProgressLayout = this.LIZJ;
        if (teamFightPKProgressLayout != null) {
            teamFightPKProgressLayout.setVisibility(8);
        }
        TeamFightPKProgressLayout teamFightPKProgressLayout2 = this.LIZJ;
        if (teamFightPKProgressLayout2 != null) {
            teamFightPKProgressLayout2.LIZ();
        }
        if (this.LJIIJ && (textView = this.LJFF) != null) {
            textView.setVisibility(0);
        }
        DoublePkTitleLayout doublePkTitleLayout = this.LJIIZILJ;
        if (doublePkTitleLayout != null) {
            doublePkTitleLayout.setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (android.text.TextUtils.equals("chat_close_icon", r5) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
        r6 = com.bytedance.android.livesdkapi.depend.model.live.linker.FinishReason.LINKMIC_CLOSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0107, code lost:
        if (r0.LIZ().booleanValue() == true) goto L24;
     */
    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDestroy() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.doublepk.widget.DoublePkViewWidget.onDestroy():void");
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        C2WD<AbstractC4404d> LIZLLL;
        C2WC<Boolean> LJII;
        ViewGroup.LayoutParams layoutParams;
        float f;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        this.LIZJ = (TeamFightPKProgressLayout) findViewById(2131172786);
        this.LJFF = (TextView) findViewById(2131190452);
        this.LIZLLL = (HSImageView) findViewById(2131180715);
        this.f26315LJ = (HSImageView) findViewById(2131188013);
        this.LJIIZILJ = (DoublePkTitleLayout) findViewById(2131172795);
        findViewById(2131178862);
        this.LJI = (ConstraintLayout) findViewById(2131172799);
        this.LJIJJ = (FrameLayout) findViewById(2131197208);
        this.LJII = (ImageView) findViewById(2131172800);
        this.LJIIIIZZ = (ImageView) findViewById(2131172801);
        this.LJIJJLI = (HSImageView) findViewById(2131172789);
        this.LJIL = (ConstraintLayout) findViewById(2131196679);
        this.LJIJ = (ImageView) findViewById(2131172802);
        this.LJIJI = (ImageView) findViewById(2131172803);
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        this.LIZIZ = new C78453GwJ(dataCenter, this.LJIIIZ, this);
        TeamFightPKProgressLayout teamFightPKProgressLayout = this.LIZJ;
        if (teamFightPKProgressLayout != null) {
            teamFightPKProgressLayout.LIZIZ = this.LJIIJ;
        }
        ConstraintLayout constraintLayout = this.LJIL;
        if (constraintLayout != null && (layoutParams = constraintLayout.getLayoutParams()) != null) {
            int LIZLLL2 = LK1.LIZLLL(16);
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
            if (proxy.isSupported) {
                f = ((Float) proxy.result).floatValue();
            } else {
                int LIZJ = (int) (LK5.LIZJ() * 0.8888889f);
                if (G22.LIZLLL() && G22.LIZ() == 0) {
                    Object obj = this.dataCenter.get("fold_container_width", (String) 1354);
                    Intrinsics.checkNotNullExpressionValue(obj, "");
                    LIZJ = (int) (((Number) obj).intValue() * 0.8888889f);
                }
                f = (LIZJ * 3.0f) / 4.0f;
            }
            layoutParams.height = LIZLLL2 + ((int) f);
        }
        TeamFightPKProgressLayout teamFightPKProgressLayout2 = this.LIZJ;
        if (teamFightPKProgressLayout2 != null) {
            teamFightPKProgressLayout2.setProgressClickListener(this.LJJ);
        }
        C4398a LIZ2 = C4398a.LIZJ.LIZ();
        if (LIZ2 != null && (LJII = LIZ2.LJII()) != null) {
            LJII.LIZ(Boolean.TRUE);
        }
        C78453GwJ c78453GwJ = this.LIZIZ;
        if (c78453GwJ == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c78453GwJ.f6515LJ.observe(this, new C78443Gw9(this));
        C78453GwJ c78453GwJ2 = this.LIZIZ;
        if (c78453GwJ2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c78453GwJ2.LJFF.observe(this, new C77256Gd0(this));
        C4398a LIZ3 = C4398a.LIZJ.LIZ();
        if (LIZ3 != null && (LIZLLL = LIZ3.LIZLLL()) != null) {
            LIZLLL.LIZ(new AbstractC4404d.C4407c());
        }
        C6174n c6174n = this.LJIILLIIL;
        if (c6174n != null) {
            C78453GwJ c78453GwJ3 = this.LIZIZ;
            if (c78453GwJ3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (!PatchProxy.proxy(new Object[]{c6174n}, c78453GwJ3, C78453GwJ.LIZ, false, 7).isSupported) {
                C106862S5w.LIZ(c6174n);
                c78453GwJ3.LIZ(c6174n);
                int i = c6174n.LJFF;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 4) {
                            if (i == 5) {
                                C103397Qnf.LIZ(c78453GwJ3.LIZIZ, new AbstractC4399b.C4400a(c6174n), null, 2, null);
                            }
                        } else {
                            C103397Qnf.LIZ(c78453GwJ3.LIZIZ, new AbstractC4399b.C4401b(), null, 2, null);
                        }
                    } else {
                        c78453GwJ3.f6515LJ.setValue(Integer.valueOf(c6174n.LJIILL));
                        C103397Qnf.LIZ(c78453GwJ3.LIZIZ, new AbstractC4399b.C4402c(c6174n), null, 2, null);
                    }
                } else {
                    C103397Qnf.LIZ(c78453GwJ3.LIZIZ, new AbstractC4399b.C4401b(), null, 2, null);
                }
            }
        }
        C78453GwJ c78453GwJ4 = this.LIZIZ;
        if (c78453GwJ4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (c78453GwJ4.LIZ().size() < 2) {
            TextView textView = this.LJFF;
            if (textView != null) {
                textView.setAlpha(0.34f);
            }
        } else {
            TextView textView2 = this.LJFF;
            if (textView2 != null) {
                textView2.setAlpha(1.0f);
            }
        }
        FrameLayout frameLayout = this.LJIJJ;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(View$OnClickListenerC77427Gfl.LIZIZ);
        }
        FrameLayout frameLayout2 = this.LJIJJ;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        ImageView imageView = this.LJIJ;
        if (imageView != null) {
            imageView.setOnClickListener(View$OnClickListenerC77258Gd2.LIZIZ);
        }
        ImageView imageView2 = this.LJIJI;
        if (imageView2 != null) {
            imageView2.setOnClickListener(View$OnClickListenerC77259Gd3.LIZIZ);
        }
        ImageView imageView3 = this.LJII;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View$OnClickListenerC78450GwG(this));
        }
        ImageView imageView4 = this.LJIIIIZZ;
        if (imageView4 != null) {
            imageView4.setOnClickListener(new View$OnClickListenerC78449GwF(this));
        }
        TextView textView3 = this.LJFF;
        if (textView3 != null) {
            textView3.setOnClickListener(new View$OnClickListenerC77372Ges(this));
        }
        C78453GwJ c78453GwJ5 = this.LIZIZ;
        if (c78453GwJ5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c78453GwJ5.LIZLLL.observe(this, new C78456GwM(this));
        HSImageView hSImageView = this.LIZLLL;
        if (hSImageView != null) {
            hSImageView.post(new RunnableC78740H2g(this));
        }
        HSImageView hSImageView2 = this.f26315LJ;
        if (hSImageView2 != null) {
            hSImageView2.post(new RunnableC78741H2h(this));
        }
    }

    public static final /* synthetic */ C78453GwJ LIZ(DoublePkViewWidget doublePkViewWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{doublePkViewWidget}, null, LIZ, true, 10);
        if (proxy.isSupported) {
            return (C78453GwJ) proxy.result;
        }
        C78453GwJ c78453GwJ = doublePkViewWidget.LIZIZ;
        if (c78453GwJ == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c78453GwJ;
    }

    public final void LIZIZ(ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, LIZ, false, 9).isSupported) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setAnimationListener(new animation.Animation$AnimationListenerC76885GSx(imageView));
        if (imageView != null) {
            imageView.startAnimation(alphaAnimation);
        }
    }

    public final void LIZ(ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, LIZ, false, 8).isSupported) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setAnimationListener(new animation.Animation$AnimationListenerC77257Gd1(this, imageView));
        if (imageView != null) {
            imageView.startAnimation(alphaAnimation);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // p003X.AbstractC78459GwP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZIZ(com.bytedance.android.livesdk.chatroom.model.interact.C6174n r10) {
        /*
            r9 = this;
            r3 = 1
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r7 = 0
            r2[r7] = r10
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.doublepk.widget.DoublePkViewWidget.LIZ
            r0 = 6
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r9, r1, r7, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L12
            return
        L12:
            p003X.C106862S5w.LIZ(r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "onPKFinish："
            r1.<init>(r0)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "DoublePk_DoublePkViewWidget"
            com.bytedance.android.live.core.log.ALogger.m15801d(r0, r1)
            int r0 = r10.LJIILL
            r2 = 8
            if (r0 != r3) goto Lbf
            androidx.constraintlayout.widget.ConstraintLayout r1 = r9.LJI
            if (r1 == 0) goto L38
            r0 = 1051595899(0x3eae147b, float:0.34)
            r1.setAlpha(r0)
        L38:
            android.widget.FrameLayout r0 = r9.LJIJJ
            if (r0 == 0) goto L3f
            r0.setVisibility(r7)
        L3f:
            android.widget.TextView r0 = r9.LJFF
            if (r0 == 0) goto L46
            r0.setVisibility(r2)
        L46:
            com.bytedance.android.live.liveinteract.doublepk.view.DoublePkTitleLayout r0 = r9.LJIIZILJ
            if (r0 == 0) goto L4d
            r0.setVisibility(r7)
        L4d:
            com.bytedance.android.live.liveinteract.voicechat.fight.view.TeamFightPKProgressLayout r0 = r9.LIZJ
            r6 = 0
            r5 = 2
            if (r0 == 0) goto L56
            com.bytedance.android.live.liveinteract.voicechat.fight.view.TeamFightPKProgressLayout.LIZ(r0, r10, r7, r5, r6)
        L56:
            com.bytedance.android.live.liveinteract.voicechat.fight.view.TeamFightPKProgressLayout r0 = r9.LIZJ
            if (r0 == 0) goto L5d
            r0.setVisibility(r7)
        L5d:
            int r0 = r10.LJIILL
            if (r0 != 0) goto Lb6
            long r0 = r10.LJIILLIIL
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto Lb6
            com.bytedance.android.live.liveinteract.doublepk.view.DoublePkTitleLayout r3 = r9.LJIIZILJ
            if (r3 == 0) goto L75
            long r0 = r10.LIZIZ()
            int r2 = (int) r0
            r3.setFinisState(r2)
        L75:
            java.lang.Long r8 = r10.LJIIJJI
            if (r8 == 0) goto Lad
            long r3 = r8.longValue()
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L9a
            java.lang.String r1 = p003X.C78458GwO.LIZLLL()
            java.lang.String r2 = p003X.C78458GwO.LIZJ()
        L8b:
            com.bytedance.android.live.core.widget.HSImageView r0 = r9.LIZLLL
            if (r0 == 0) goto L92
            p003X.C78464GwU.LIZ(r0, r1, r7, r5, r6)
        L92:
            com.bytedance.android.live.core.widget.HSImageView r0 = r9.f26315LJ
            if (r0 == 0) goto L99
            p003X.C78464GwU.LIZ(r0, r2, r7, r5, r6)
        L99:
            return
        L9a:
            long r3 = r8.longValue()
            r1 = 2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lad
            java.lang.String r2 = p003X.C78458GwO.LIZLLL()
            java.lang.String r1 = p003X.C78458GwO.LIZJ()
            goto L8b
        Lad:
            java.lang.String r2 = p003X.C78458GwO.LIZIZ()
            java.lang.String r1 = p003X.C78458GwO.LIZIZ()
            goto L8b
        Lb6:
            com.bytedance.android.live.liveinteract.doublepk.view.DoublePkTitleLayout r1 = r9.LJIIZILJ
            if (r1 == 0) goto L75
            r0 = -1
            r1.setFinisState(r0)
            goto L75
        Lbf:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r9.LJI
            if (r0 == 0) goto L3f
            r0.setVisibility(r2)
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.doublepk.widget.DoublePkViewWidget.LIZIZ(com.bytedance.android.livesdk.chatroom.model.interact.n):void");
    }

    @Override // p003X.AbstractC78459GwP
    public final void LIZ(C6174n c6174n) {
        if (PatchProxy.proxy(new Object[]{c6174n}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6174n);
        this.LJIIL = false;
        this.LJIILIIL = false;
        this.LJIILJJIL = false;
        this.LJIILL = 0L;
        FrameLayout frameLayout = this.LJIJJ;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        ALogger.m15801d("DoublePk_DoublePkViewWidget", "onPKStart：" + c6174n);
        HSImageView hSImageView = this.LJIJJLI;
        if (hSImageView != null) {
            C78464GwU.LIZ(hSImageView, C78458GwO.LIZ, 0, 2, null);
        }
        ImageView imageView = this.LJII;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.LJIIIIZZ;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        TeamFightPKProgressLayout teamFightPKProgressLayout = this.LIZJ;
        if (teamFightPKProgressLayout != null) {
            TeamFightPKProgressLayout.LIZ(teamFightPKProgressLayout, c6174n, false, 2, null);
        }
        TeamFightPKProgressLayout teamFightPKProgressLayout2 = this.LIZJ;
        if (teamFightPKProgressLayout2 != null) {
            teamFightPKProgressLayout2.setVisibility(0);
        }
        TextView textView = this.LJFF;
        if (textView != null) {
            textView.setVisibility(8);
        }
        DoublePkTitleLayout doublePkTitleLayout = this.LJIIZILJ;
        if (doublePkTitleLayout != null) {
            doublePkTitleLayout.setVisibility(0);
        }
        if (c6174n.LJII <= 0) {
            DoublePkTitleLayout doublePkTitleLayout2 = this.LJIIZILJ;
            if (doublePkTitleLayout2 != null) {
                doublePkTitleLayout2.LIZ(-1);
                return;
            }
            return;
        }
        DoublePkTitleLayout doublePkTitleLayout3 = this.LJIIZILJ;
        if (doublePkTitleLayout3 != null) {
            doublePkTitleLayout3.LIZ((int) c6174n.LIZ());
        }
    }

    public DoublePkViewWidget(DataCenter dataCenter, C6174n c6174n) {
        C106862S5w.LIZ(dataCenter);
        this.LJIILLIIL = c6174n;
        this.LJIIIZ = C423702pg.LIZIZ(dataCenter);
        this.LJIIJ = C423702pg.LIZIZ(dataCenter, false, 1, null);
        this.LJJ = new C78455GwL(this, dataCenter);
    }
}
