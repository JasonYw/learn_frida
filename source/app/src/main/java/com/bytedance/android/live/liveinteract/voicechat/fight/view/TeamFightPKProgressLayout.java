package com.bytedance.android.live.liveinteract.voicechat.fight.view;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.widget.widget.NoPaddingTextView;
import com.bytedance.android.livesdk.chatroom.model.interact.C6156ao;
import com.bytedance.android.livesdk.chatroom.model.interact.C6158ap;
import com.bytedance.android.livesdk.chatroom.model.interact.C6174n;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.model.C9069m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C3Q0;
import p003X.C78612Gys;
import p003X.C79242HLo;
import p003X.C81978ISu;
import p003X.H5W;
import p003X.H9V;
import p003X.LK1;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class TeamFightPKProgressLayout extends FrameLayout implements H5W {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public final Typeface LIZJ;
    public final int LIZLLL;

    /* renamed from: LJ */
    public final int f26486LJ;
    public AnimationState LJFF;
    public boolean LJI;
    public final C9069m LJII;
    public final NoPaddingTextView LJIIIIZZ;
    public final HSImageView LJIIIZ;
    public final NoPaddingTextView LJIIJ;
    public final HSImageView LJIIJJI;
    public final NoPaddingTextView LJIIL;
    public final TeamFightProgressBar LJIILIIL;
    public final HSImageView LJIILJJIL;
    public final HSImageView LJIILL;
    public final HSImageView LJIILLIIL;
    public final HSImageView LJIIZILJ;

    /* loaded from: classes3.dex */
    public enum AnimationState {
        MIDDLE,
        WEAK,
        STRONG;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(31394);
        }

        public static AnimationState valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (AnimationState) (proxy.isSupported ? proxy.result : Enum.valueOf(AnimationState.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static AnimationState[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (AnimationState[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(31393);
    }

    public final boolean getMIsAnchor() {
        return this.LIZIZ;
    }

    public final void LIZ(C6174n c6174n, boolean z) {
        boolean z2 = false;
        if (PatchProxy.proxy(new Object[]{c6174n, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6174n);
        C6158ap LIZLLL = C78612Gys.LIZLLL(c6174n);
        C6158ap m23794LJ = C78612Gys.m23794LJ(c6174n);
        boolean LIZ2 = LIZ(c6174n);
        if (LIZ2) {
            setRelativeScore(LIZJ(c6174n, z));
            if (!z) {
                if (LIZ(LIZLLL, m23794LJ)) {
                    C3Q0.LIZLLL(this.LJIIL, (getTotalWidth() - C78612Gys.LIZ(this.LJIIL)) - LK5.LIZLLL(2131429522));
                } else {
                    C3Q0.LIZLLL(this.LJIIL, LK5.LIZLLL(2131429522));
                }
            }
        } else {
            this.LJI = false;
        }
        StringBuilder sb = new StringBuilder("setTeamFightInfo red=");
        Object obj = null;
        sb.append(LIZLLL != null ? Long.valueOf(LIZLLL.LIZLLL) : null);
        sb.append(" blue=");
        if (m23794LJ != null) {
            obj = Long.valueOf(m23794LJ.LIZLLL);
        }
        sb.append(obj);
        sb.append(" useRelativeScore=");
        sb.append(LIZ2);
        sb.append(" isPunish=");
        sb.append(z);
        ALogger.m15795w("TeamFightPKProgressLayout", sb.toString());
        if (LIZLLL != null) {
            int i = (int) LIZLLL.LIZLLL;
            String str = LIZLLL.LJFF;
            Intrinsics.checkNotNullExpressionValue(str, "");
            LIZ(i, str, c6174n.f26902LJ == 3);
        }
        if (m23794LJ != null) {
            int i2 = (int) m23794LJ.LIZLLL;
            String str2 = m23794LJ.LJFF;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            if (c6174n.f26902LJ == 3) {
                z2 = true;
            }
            LIZIZ(i2, str2, z2);
        }
        if (z) {
            LIZIZ(c6174n, LIZ2);
        }
        if (c6174n.f26902LJ != 3) {
            return;
        }
        setScoreType(c6174n.LJIILL);
    }

    @Override // p003X.H5W
    public final void LIZ(float f) {
        CharSequence text;
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, LIZ, false, 19).isSupported) {
            return;
        }
        int i = this.LJIILIIL.LJII;
        float totalWidth = (f * (getTotalWidth() - (i * 2))) + i;
        HSImageView hSImageView = this.LJIILL;
        int i2 = this.LIZLLL;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Float.valueOf(totalWidth), Integer.valueOf(i2)}, this, LIZ, false, 20);
        C3Q0.LIZLLL(hSImageView, proxy.isSupported ? ((Integer) proxy.result).intValue() : (int) ((totalWidth - i2) + LK5.LIZ(8.5f)));
        if (!this.LIZIZ && this.LJI && (text = this.LJIIL.getText()) != null && text.length() > 0) {
            this.LJIIIIZZ.setVisibility(8);
            this.LJIIJ.setVisibility(8);
            this.LJIIL.setVisibility(0);
            return;
        }
        this.LJIIIIZZ.setVisibility(0);
        this.LJIIJ.setVisibility(0);
        this.LJIIL.setVisibility(8);
    }

    private final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        C81978ISu.LIZ(this.LJIILL, this.LJII.LIZIZ);
        this.LJFF = AnimationState.WEAK;
    }

    private final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        C81978ISu.LIZ(this.LJIILL, this.LJII.LIZIZ);
        this.LJFF = AnimationState.STRONG;
    }

    public final int getLeftValue() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 17);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return this.LJIILIIL.getLeftValue();
    }

    public final int getRightValue() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 18);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return this.LJIILIIL.getRightValue();
    }

    private final int getTotalWidth() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (getWidth() > 0) {
            return getWidth();
        }
        return LK5.LIZJ();
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        this.LJIILJJIL.setVisibility(0);
        this.LJIILL.setVisibility(8);
        this.LJIIL.setVisibility(8);
        this.LJI = false;
        this.LJFF = AnimationState.MIDDLE;
        this.LJIIIIZZ.setVisibility(0);
        C3Q0.LIZLLL(this.LJIIIIZZ, LK5.LIZLLL(2131429522));
        this.LJIIIIZZ.setText("0");
        this.LJIIJ.setVisibility(0);
        C3Q0.LJFF(this.LJIIJ, LK5.LIZLLL(2131429522));
        this.LJIIJ.setText("0");
        this.LJIILJJIL.setVisibility(0);
        C81978ISu.LIZ(this.LJIILJJIL, this.LJII.LIZ);
        this.LJIILIIL.LIZ();
        this.LJIIIZ.setVisibility(8);
        this.LJIIJJI.setVisibility(8);
    }

    public final void setMIsAnchor(boolean z) {
        this.LIZIZ = z;
    }

    private final void setRelativeScore(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 11).isSupported) {
            return;
        }
        this.LJI = true;
        this.LJIIL.setText(str);
    }

    public final void setProgressClickListener(H9V h9v) {
        if (PatchProxy.proxy(new Object[]{h9v}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(h9v);
        this.LJIILIIL.setProgressBarClickListener(h9v);
    }

    private final void setScoreType(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        int LIZLLL = LK1.LIZLLL(14);
        int LIZLLL2 = LK1.LIZLLL(14);
        if (i != 0) {
            if (i == 1) {
                this.LJIILLIIL.setImageResource(2130858065);
                this.LJIIZILJ.setImageResource(2130858061);
                this.LJIILLIIL.setVisibility(0);
                this.LJIIZILJ.setVisibility(0);
                LIZLLL = LK1.LIZLLL(16);
                LIZLLL2 = LK1.LIZLLL(16);
            }
        } else {
            this.LJIILLIIL.setImageResource(2130858063);
            this.LJIIZILJ.setImageResource(2130858059);
            this.LJIILLIIL.setVisibility(0);
            this.LJIIZILJ.setVisibility(0);
            LIZLLL = LK1.LIZLLL(16);
            LIZLLL2 = LK1.LIZLLL(16);
        }
        ViewGroup.LayoutParams layoutParams = this.LJIIIIZZ.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            int i2 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginStart(LIZLLL);
            layoutParams2.leftMargin = LIZLLL;
            this.LJIIIIZZ.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = this.LJIIJ.getLayoutParams();
            if (layoutParams3 != null) {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                int i3 = Build.VERSION.SDK_INT;
                layoutParams4.setMarginEnd(LIZLLL2);
                layoutParams4.rightMargin = LIZLLL2;
                this.LJIIJ.setLayoutParams(layoutParams4);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    private final boolean LIZ(C6174n c6174n) {
        C6156ao.C6157a c6157a;
        C6156ao.C6157a c6157a2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c6174n}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (c6174n.f26902LJ == 3 || this.LIZIZ || !c6174n.LIZLLL()) {
            return false;
        }
        long LIZ2 = C79242HLo.LIZ();
        C6158ap LIZLLL = C78612Gys.LIZLLL(c6174n);
        if (LIZLLL != null && (c6157a2 = LIZLLL.LJI) != null && c6157a2.LIZ(LIZ2) && LIZLLL.LJII) {
            return false;
        }
        C6158ap m23794LJ = C78612Gys.m23794LJ(c6174n);
        if (m23794LJ == null || (c6157a = m23794LJ.LJI) == null || !c6157a.LIZ(LIZ2) || !m23794LJ.LJII) {
            return true;
        }
        return false;
    }

    public static boolean LIZ(C6158ap c6158ap, C6158ap c6158ap2) {
        if (c6158ap != null && c6158ap2 != null && c6158ap.LIZLLL < c6158ap2.LIZLLL) {
            return true;
        }
        return false;
    }

    private final void LIZ(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 14).isSupported) {
            return;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        this.LJIILJJIL.setVisibility(8);
        this.LJIILL.setVisibility(0);
        if (i / (i + i2) > 0.65f) {
            if (this.LJFF != AnimationState.STRONG) {
                LIZJ();
            }
        } else if (this.LJFF != AnimationState.WEAK) {
            LIZIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String LIZJ(com.bytedance.android.livesdk.chatroom.model.interact.C6174n r8, boolean r9) {
        /*
            r7 = this;
            r0 = 2
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r2 = 0
            r3[r2] = r8
            java.lang.Byte r1 = java.lang.Byte.valueOf(r9)
            r0 = 1
            r3[r0] = r1
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.voicechat.fight.view.TeamFightPKProgressLayout.LIZ
            r0 = 10
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r3, r7, r1, r2, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r1.result
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L1e:
            com.bytedance.android.livesdk.chatroom.model.interact.ap r6 = p003X.C78612Gys.LIZLLL(r8)
            com.bytedance.android.livesdk.chatroom.model.interact.ap r5 = p003X.C78612Gys.m23794LJ(r8)
            r0 = 0
            if (r9 == 0) goto L51
            java.lang.Long r0 = r8.LJIIJJI
            if (r0 == 0) goto L4c
            long r3 = r0.longValue()
            r1 = 2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L4c
            if (r5 == 0) goto L3d
            java.lang.String r0 = r5.LJFF
        L3b:
            if (r0 != 0) goto L4b
        L3d:
            com.bytedance.android.live.liveinteract.widget.widget.NoPaddingTextView r0 = r7.LJIIL
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L4b
            java.lang.String r0 = ""
        L4b:
            return r0
        L4c:
            if (r6 == 0) goto L3d
            java.lang.String r0 = r6.LJFF
            goto L3b
        L51:
            boolean r0 = LIZ(r6, r5)
            if (r0 == 0) goto L5c
            if (r5 == 0) goto L3d
            java.lang.String r0 = r5.LJFF
            goto L3b
        L5c:
            if (r6 == 0) goto L3d
            java.lang.String r0 = r6.LJFF
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.voicechat.fight.view.TeamFightPKProgressLayout.LIZJ(com.bytedance.android.livesdk.chatroom.model.interact.n, boolean):java.lang.String");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamFightPKProgressLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(2080);
        this.LIZLLL = LK5.LIZLLL(2131429520);
        this.f26486LJ = LK5.LIZLLL(2131429524);
        this.LJFF = AnimationState.MIDDLE;
        SettingKey<C9069m> settingKey = LiveSettingKeys.LIVE_PK_SIMPLE_ATMOSPHERE_ANIMATION_URLS;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        C9069m value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        this.LJII = value;
        LayoutInflater.from(context).inflate(2131700248, this);
        View findViewById = findViewById(2131180729);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LJIIIIZZ = (NoPaddingTextView) findViewById;
        View findViewById2 = findViewById(2131180693);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LJIIIZ = (HSImageView) findViewById2;
        View findViewById3 = findViewById(2131165275);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LJIIJ = (NoPaddingTextView) findViewById3;
        View findViewById4 = findViewById(2131187987);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.LJIIJJI = (HSImageView) findViewById4;
        View findViewById5 = findViewById(2131195232);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.LJIIL = (NoPaddingTextView) findViewById5;
        View findViewById6 = findViewById(2131185194);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.LJIILIIL = (TeamFightProgressBar) findViewById6;
        View findViewById7 = findViewById(2131183085);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "");
        this.LJIILJJIL = (HSImageView) findViewById7;
        View findViewById8 = findViewById(2131185195);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "");
        this.LJIILL = (HSImageView) findViewById8;
        View findViewById9 = findViewById(2131180696);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "");
        this.LJIILLIIL = (HSImageView) findViewById9;
        View findViewById10 = findViewById(2131187990);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "");
        this.LJIIZILJ = (HSImageView) findViewById10;
        C3Q0.LJI(this.LJIIIIZZ, LK5.LIZ(0.5f));
        C3Q0.LJI(this.LJIIJ, LK5.LIZ(0.5f));
        this.LJIILIIL.setOnProgressChangeListener(this);
        TeamFightProgressBar teamFightProgressBar = this.LJIILIIL;
        int LIZIZ = LK5.LIZIZ(2131629097);
        int LIZIZ2 = LK5.LIZIZ(2131629097);
        int LIZIZ3 = LK5.LIZIZ(2131629098);
        int LIZIZ4 = LK5.LIZIZ(2131629098);
        teamFightProgressBar.LIZLLL = LIZIZ;
        teamFightProgressBar.f26487LJ = LIZIZ2;
        teamFightProgressBar.LJFF = LIZIZ3;
        teamFightProgressBar.LJI = LIZIZ4;
        this.LJIILJJIL.setVisibility(0);
        C81978ISu.LIZ(this.LJIILJJIL, this.LJII.LIZ);
        Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/clarity_mono_bold.otf");
        Intrinsics.checkNotNullExpressionValue(createFromAsset, "");
        this.LIZJ = createFromAsset;
        this.LJIIIIZZ.setTypeface(this.LIZJ);
        this.LJIIJ.setTypeface(this.LIZJ);
        this.LJIIL.setTypeface(this.LIZJ);
        this.LJIIL.setVisibility(8);
        this.LJIIIZ.setVisibility(8);
        this.LJIIJJI.setVisibility(8);
        MethodCollector.m14707o(2080);
    }

    private final void LIZ(boolean z, String str) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str}, this, LIZ, false, 22).isSupported) {
            return;
        }
        if (z) {
            this.LJIIIIZZ.setText(str);
            this.LJIIIIZZ.setVisibility(0);
            return;
        }
        this.LJIIJ.setText(str);
        this.LJIIJ.setVisibility(0);
    }

    private final void LIZIZ(C6174n c6174n, boolean z) {
        String str;
        long j;
        String str2;
        int i;
        int LIZ2;
        int LIZ3;
        int LIZ4;
        if (PatchProxy.proxy(new Object[]{c6174n, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C78612Gys.LIZLLL(c6174n);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c6174n}, this, LIZ, false, 3);
        long j2 = -1;
        if (proxy.isSupported) {
            str = (String) proxy.result;
        } else {
            str = this.LJII.LJI;
            if (c6174n.LJFF()) {
                Long l = c6174n.LJIIJJI;
                if (l != null) {
                    if (l.longValue() == 1) {
                        str = this.LJII.f27975LJ;
                    } else if (l.longValue() == 2) {
                        str = this.LJII.LJFF;
                    }
                }
                str = this.LJII.LJI;
            } else if (c6174n.LJI()) {
                C6158ap m23794LJ = C78612Gys.m23794LJ(c6174n);
                if (m23794LJ != null) {
                    j = m23794LJ.LIZIZ;
                } else {
                    j = -1;
                }
                Long l2 = c6174n.LJIIJJI;
                long LIZIZ = C78612Gys.LIZIZ();
                if (l2 != null) {
                    if (l2.longValue() == LIZIZ) {
                        str = this.LJII.f27975LJ;
                    } else if (l2.longValue() == j) {
                        str = this.LJII.LJFF;
                    }
                }
                str = this.LJII.LJI;
            }
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c6174n}, this, LIZ, false, 4);
        if (proxy2.isSupported) {
            str2 = (String) proxy2.result;
        } else {
            str2 = this.LJII.LJI;
            if (c6174n.LJFF()) {
                Long l3 = c6174n.LJIIJJI;
                if (l3 != null) {
                    if (l3.longValue() == 1) {
                        str2 = this.LJII.LJFF;
                    } else if (l3.longValue() == 2) {
                        str2 = this.LJII.f27975LJ;
                    }
                }
                str2 = this.LJII.LJI;
            } else if (c6174n.LJI()) {
                C6158ap m23794LJ2 = C78612Gys.m23794LJ(c6174n);
                if (m23794LJ2 != null) {
                    j2 = m23794LJ2.LIZIZ;
                }
                Long l4 = c6174n.LJIIJJI;
                long LIZIZ2 = C78612Gys.LIZIZ();
                if (l4 != null) {
                    if (l4.longValue() == LIZIZ2) {
                        str2 = this.LJII.LJFF;
                    } else if (l4.longValue() == j2) {
                        str2 = this.LJII.f27975LJ;
                    }
                }
                str2 = this.LJII.LJI;
            }
        }
        this.LJIIIZ.setVisibility(0);
        this.LJIIJJI.setVisibility(0);
        C81978ISu.LIZ(this.LJIIIZ, str);
        C81978ISu.LIZ(this.LJIIJJI, str2);
        if (z) {
            this.LJIILIIL.LIZ(this.f26486LJ);
            this.LJIIL.setVisibility(0);
            NoPaddingTextView noPaddingTextView = this.LJIIL;
            Long l5 = c6174n.LJIIJJI;
            if (l5 != null && l5.longValue() == 2) {
                LIZ4 = ((getTotalWidth() - C78612Gys.LIZ(this.LJIIL)) - this.f26486LJ) - LK5.LIZ(2.0f);
            } else {
                LIZ4 = this.f26486LJ + LK5.LIZ(2.0f);
            }
            C3Q0.LIZLLL(noPaddingTextView, LIZ4);
            this.LJIIIIZZ.setVisibility(8);
            this.LJIIJ.setVisibility(8);
            return;
        }
        Long l6 = c6174n.LJIIJJI;
        if (l6 != null) {
            if (l6.longValue() == 1) {
                LIZ2 = this.f26486LJ + C78612Gys.LIZ(this.LJIIJ);
                LIZ3 = LK5.LIZ(9.0f);
            } else if (l6.longValue() == 2) {
                LIZ2 = this.f26486LJ + C78612Gys.LIZ(this.LJIIIIZZ);
                LIZ3 = LK5.LIZ(9.0f);
            }
            i = LIZ2 + LIZ3;
            this.LJIILIIL.LIZ(i);
            C3Q0.LIZLLL(this.LJIIIIZZ, this.f26486LJ);
            C3Q0.LJFF(this.LJIIJ, this.f26486LJ);
            this.LJIIIIZZ.setVisibility(0);
            this.LJIIJ.setVisibility(0);
            this.LJIIL.setVisibility(8);
        }
        i = this.f26486LJ;
        this.LJIILIIL.LIZ(i);
        C3Q0.LIZLLL(this.LJIIIIZZ, this.f26486LJ);
        C3Q0.LJFF(this.LJIIJ, this.f26486LJ);
        this.LJIIIIZZ.setVisibility(0);
        this.LJIIJ.setVisibility(0);
        this.LJIIL.setVisibility(8);
    }

    private void LIZ(int i, String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        LIZ(i, this.LJIILIIL.getRightValue());
        if (z) {
            LIZ(true, str);
        } else {
            LIZ(true, String.valueOf(i));
        }
        this.LJIILIIL.setLeftValue(i);
    }

    private void LIZIZ(int i, String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        LIZ(this.LJIILIIL.getLeftValue(), i);
        if (z) {
            LIZ(false, str);
        } else {
            LIZ(false, String.valueOf(i));
        }
        this.LJIILIIL.setRightValue(i);
    }

    public /* synthetic */ TeamFightPKProgressLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public static /* synthetic */ void LIZ(TeamFightPKProgressLayout teamFightPKProgressLayout, C6174n c6174n, boolean z, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{teamFightPKProgressLayout, c6174n, (byte) 0, 2, null}, null, LIZ, true, 7).isSupported) {
            return;
        }
        teamFightPKProgressLayout.LIZ(c6174n, false);
    }
}
