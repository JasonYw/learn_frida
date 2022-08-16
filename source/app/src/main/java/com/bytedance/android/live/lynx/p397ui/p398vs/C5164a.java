package com.bytedance.android.live.lynx.p397ui.p398vs;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.depend.model.live.episode.Episode;
import com.bytedance.android.livesdkapi.depend.model.live.episode.EpisodePaidInfo;
import com.bytedance.android.livesdkapi.depend.model.live.episode.EpisodeVideo;
import com.bytedance.android.livesdkapi.depend.model.live.episode.EpisodeVideoModelContainer;
import com.bytedance.android.livesdkapi.depend.model.live.episode.VSWatermark;
import com.bytedance.android.livesdkapi.vsplayer.IVsVideoService;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.lynx.react.bridge.JavaOnlyMap;
import com.p1594ss.android.videoshop.entity.PlayEntity;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC100948PpG;
import p003X.AbstractC123315Yg9;
import p003X.AbstractC95272Nfu;
import p003X.AbstractC95493NjT;
import p003X.AnonymousClass424;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C123308Yg2;
import p003X.C123313Yg7;
import p003X.KM9;
import p003X.LK1;
import p003X.RunnableC123309Yg3;
import p003X.RunnableC123314Yg8;

/* renamed from: com.bytedance.android.live.lynx.ui.vs.a */
/* loaded from: classes15.dex */
public final class C5164a extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public FrameLayout LIZIZ;
    public boolean LIZJ;
    public long LIZLLL;

    /* renamed from: LJ */
    public boolean f26516LJ;
    public Episode LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public HashMap<String, String> LJIIIZ;
    public AbstractC95493NjT LJIIJ;
    public AbstractC95272Nfu LJIIJJI;
    public TextView LJIIL;
    public boolean LJIILIIL;
    public final C123313Yg7 LJIILJJIL;
    public final C123308Yg2 LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;
    public RelativeLayout LJIJ;
    public AbstractC123315Yg9 LJIJI;
    public String LJIJJ;
    public Long LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public String LJJI;
    public boolean LJJIFFI;
    public boolean LJJII;
    public boolean LJJIII;
    public List<String> LJJIIJ;
    public Function2<? super String, ? super Map<String, ? extends Object>, Unit> LJJIIJZLJL;
    public View LJJIIZ;

    static {
        Covode.recordClassIndex(32405);
    }

    private final void LJIIJJI() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 39).isSupported && !this.LJII) {
            LIZLLL();
        }
    }

    private final void LJIIL() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 40).isSupported && !this.LJJIFFI) {
            LJI();
        }
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        TextView textView = this.LJIIL;
        if (textView != null) {
            textView.setText("已购买");
        }
        LJIILIIL();
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        m15631LJ();
    }

    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 38).isSupported) {
            return;
        }
        LJIIJJI();
        LJIIL();
    }

    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 41).isSupported) {
            return;
        }
        LJIIIZ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        this.LJJIFFI = false;
        this.LJJIII = true;
    }

    private final void LJIIIIZZ() {
        MethodCollector.m14708i(2133);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 32).isSupported) {
            MethodCollector.m14707o(2133);
            return;
        }
        RelativeLayout relativeLayout = this.LJIJ;
        if (relativeLayout == null) {
            MethodCollector.m14707o(2133);
            return;
        }
        ViewParent parent = relativeLayout.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            viewGroup.removeView(this.LJIJ);
        }
        this.LJIJ = null;
        MethodCollector.m14707o(2133);
    }

    private final void LJIIIZ() {
        MethodCollector.m14708i(2134);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 35).isSupported) {
            MethodCollector.m14707o(2134);
            return;
        }
        if (!this.f26516LJ) {
            LIZLLL();
        }
        AbstractC95272Nfu abstractC95272Nfu = this.LJIIJJI;
        if (abstractC95272Nfu != null) {
            abstractC95272Nfu.LIZLLL();
        }
        this.LJII = false;
        this.LJJII = true;
        LJIIIIZZ();
        FrameLayout frameLayout = this.LIZIZ;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        frameLayout.removeAllViews();
        MethodCollector.m14707o(2134);
    }

    private final void LJIILIIL() {
        AbstractC95493NjT abstractC95493NjT;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 48).isSupported && (abstractC95493NjT = this.LJIIJ) != null && this.LJIILIIL) {
            LK1.LIZ(abstractC95493NjT.LIZ());
            FrameLayout frameLayout = this.LIZIZ;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            frameLayout.post(new RunnableC123309Yg3(abstractC95493NjT, this));
            this.LJIILIIL = false;
            this.LJIIJ = null;
        }
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 26).isSupported) {
            return;
        }
        LIZ(this, "pause", null, 2, null);
        this.LJII = false;
        AbstractC95272Nfu abstractC95272Nfu = this.LJIIJJI;
        if (abstractC95272Nfu != null) {
            abstractC95272Nfu.LIZJ();
        }
        setKeepScreenOn(false);
    }

    /* renamed from: LJ */
    public final void m15631LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 30).isSupported || !this.LJJIFFI || this.LJII || this.LJIILIIL) {
            return;
        }
        this.LJII = true;
        LJII();
        setKeepScreenOn(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        this.LJJIFFI = true;
        LIZJ();
        post(new RunnableC123314Yg8(this));
    }

    private final synchronized long LJIIJ() {
        long j;
        MethodCollector.m14708i(2135);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 37);
        if (proxy.isSupported) {
            long longValue = ((Long) proxy.result).longValue();
            MethodCollector.m14707o(2135);
            return longValue;
        }
        Long l = this.LJIJJLI;
        if (l != null) {
            this.LJIJJLI = null;
            long longValue2 = l.longValue();
            MethodCollector.m14707o(2135);
            return longValue2;
        } else if (this.f26516LJ) {
            this.f26516LJ = false;
            AbstractC100948PpG abstractC100948PpG = (AbstractC100948PpG) ServiceManager.getService(AbstractC100948PpG.class);
            Episode episode = this.LJFF;
            if (episode != null) {
                j = episode.getId();
            } else {
                j = 0;
            }
            long LIZ2 = abstractC100948PpG.LIZ(j);
            MethodCollector.m14707o(2135);
            return LIZ2;
        } else {
            long j2 = this.LIZLLL;
            MethodCollector.m14707o(2135);
            return j2;
        }
    }

    public final void LIZJ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported && this.LJJII) {
            if (!TextUtils.isEmpty(this.LJJI)) {
                AbstractC95272Nfu abstractC95272Nfu = this.LJIIJJI;
                if (abstractC95272Nfu != null) {
                    String str = this.LJJI;
                    Intrinsics.checkNotNull(str);
                    abstractC95272Nfu.LIZ(str, 2130854252, ImageView.ScaleType.CENTER_CROP);
                }
                this.LJJII = false;
                return;
            }
            Episode episode = this.LJFF;
            if (episode != null) {
                AbstractC95272Nfu abstractC95272Nfu2 = this.LJIIJJI;
                if (abstractC95272Nfu2 != null) {
                    Intrinsics.checkNotNull(episode);
                    abstractC95272Nfu2.LIZ(episode, 2130854252, ImageView.ScaleType.CENTER_CROP);
                }
                this.LJJII = false;
            }
        }
    }

    private final void LJII() {
        VSWatermark vSWatermark;
        Context context;
        EpisodeVideo episodeVideo;
        EpisodeVideoModelContainer episodeVideoModelContainer;
        String str;
        AbstractC95272Nfu abstractC95272Nfu;
        long j;
        EpisodePaidInfo episodePaidInfo;
        String str2;
        MethodCollector.m14708i(2132);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 31).isSupported) {
            MethodCollector.m14707o(2132);
            return;
        }
        Episode episode = this.LJFF;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (episode != null && (episodeVideo = episode.video) != null && (episodeVideoModelContainer = episodeVideo.playInfo) != null && (str = episodeVideoModelContainer.json) != null && (abstractC95272Nfu = this.LJIIJJI) != null) {
            abstractC95272Nfu.mo23169LJ();
            if (!abstractC95272Nfu.LIZIZ()) {
                abstractC95272Nfu.LIZ(this.LJIILLIIL, this.LJIIZILJ);
                this.LIZLLL = LJIIJ();
                long j2 = this.LIZLLL;
                Episode episode2 = this.LJFF;
                if (episode2 != null && (str2 = episode2.idStr) != null) {
                    j = Long.parseLong(str2);
                } else {
                    j = 0;
                }
                Episode episode3 = this.LJFF;
                if (episode3 != null) {
                    episodePaidInfo = episode3.paidInfo;
                } else {
                    episodePaidInfo = null;
                }
                abstractC95272Nfu.LIZ(str, j2, j, (PlayEntity) null, episodePaidInfo);
                abstractC95272Nfu.LIZLLL(this.LJIL);
                abstractC95272Nfu.LIZJ(this.LJJ);
            }
        }
        Episode episode4 = this.LJFF;
        if (episode4 != null && (vSWatermark = episode4.vsWatermark) != null) {
            LJIIIIZZ();
            FrameLayout frameLayout = this.LIZIZ;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            this.LJIJ = new RelativeLayout(frameLayout.getContext());
            FrameLayout frameLayout2 = this.LIZIZ;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = layoutParams;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
            if (marginLayoutParams2 == null) {
                MethodCollector.m14707o(2132);
                return;
            }
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(marginLayoutParams2);
            layoutParams2.width = marginLayoutParams2.width;
            layoutParams2.height = marginLayoutParams2.height;
            layoutParams2.topMargin = marginLayoutParams2.topMargin;
            RelativeLayout relativeLayout = this.LJIJ;
            if (relativeLayout != null) {
                relativeLayout.setLayoutParams(layoutParams2);
            }
            FrameLayout frameLayout3 = this.LIZIZ;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (frameLayout3.getChildCount() > 0) {
                FrameLayout frameLayout4 = this.LIZIZ;
                if (frameLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                frameLayout4.addView(this.LJIJ, 1);
            } else {
                FrameLayout frameLayout5 = this.LIZIZ;
                if (frameLayout5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                frameLayout5.addView(this.LJIJ);
            }
            FrameLayout frameLayout6 = this.LIZIZ;
            if (frameLayout6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            int width = frameLayout6.getWidth();
            RelativeLayout relativeLayout2 = this.LJIJ;
            if (relativeLayout2 != null && (context = relativeLayout2.getContext()) != null) {
                this.LJIJI = ((IVsVideoService) ServiceManager.getService(IVsVideoService.class)).getVSWatermarkView(context, vSWatermark, false, width);
                RelativeLayout relativeLayout3 = this.LJIJ;
                if (relativeLayout3 != null) {
                    AbstractC123315Yg9 abstractC123315Yg9 = this.LJIJI;
                    if (abstractC123315Yg9 != null) {
                        relativeLayout3.addView((View) abstractC123315Yg9);
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.View");
                        MethodCollector.m14707o(2132);
                        throw nullPointerException;
                    }
                }
                AbstractC123315Yg9 abstractC123315Yg92 = this.LJIJI;
                if (abstractC123315Yg92 != null) {
                    abstractC123315Yg92.LIZ();
                }
                RelativeLayout relativeLayout4 = this.LJIJ;
                if (relativeLayout4 != null) {
                    LK1.LIZJ(relativeLayout4);
                } else {
                    MethodCollector.m14707o(2132);
                    return;
                }
            } else {
                MethodCollector.m14707o(2132);
                return;
            }
        }
        MethodCollector.m14707o(2132);
    }

    public final void setEventChangeListener(Function2<? super String, ? super Map<String, ? extends Object>, Unit> function2) {
        this.LJJIIJZLJL = function2;
    }

    public final void setPoster(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJJI = str;
    }

    public final void setStartPosition(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 13).isSupported) {
            return;
        }
        this.LJIJJLI = Long.valueOf(j);
    }

    private final boolean LIZIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 45);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!TextUtils.equals(this.LJIJJ, str)) {
            return true;
        }
        return false;
    }

    public final void setAutoPlay(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        this.LIZJ = z;
        if (this.LIZJ) {
            LIZIZ();
        }
    }

    public final void setMuted(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 11).isSupported) {
            return;
        }
        this.LJIL = z;
        AbstractC95272Nfu abstractC95272Nfu = this.LJIIJJI;
        if (abstractC95272Nfu != null) {
            abstractC95272Nfu.LIZLLL(z);
        }
    }

    public final void setObjectFit(String str) {
        boolean z = true;
        int i = 0;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (str.hashCode() != 3143043 || !str.equals("fill")) {
            z = false;
        }
        AbstractC95272Nfu abstractC95272Nfu = this.LJIIJJI;
        if (abstractC95272Nfu != null) {
            AnonymousClass424 anonymousClass424 = new AnonymousClass424();
            if (z) {
                i = 2;
            }
            anonymousClass424.LIZJ = i;
            abstractC95272Nfu.LIZ(anonymousClass424);
        }
    }

    public final void setRepeat(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 12).isSupported) {
            return;
        }
        this.LJJ = z;
        AbstractC95272Nfu abstractC95272Nfu = this.LJIIJJI;
        if (abstractC95272Nfu != null) {
            abstractC95272Nfu.LIZJ(z);
        }
    }

    private final boolean LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 44);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return this.LJJIIJ.contains(str);
    }

    public final void setLogExtra(HashMap<String, Object> hashMap) {
        if (PatchProxy.proxy(new Object[]{hashMap}, this, LIZ, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(hashMap);
        HashMap<String, String> hashMap2 = new HashMap<>();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            if (entry.getValue() != null) {
                if (entry.getValue() instanceof JavaOnlyMap) {
                    String key = entry.getKey();
                    String json = GsonProtectorUtils.toJson(KM9.LIZ(), entry.getValue());
                    Intrinsics.checkNotNullExpressionValue(json, "");
                    hashMap2.put(key, json);
                } else {
                    hashMap2.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
        }
        this.LJIIIZ = hashMap2;
    }

    public final void setEpisode(Episode episode) {
        Boolean bool;
        EpisodePaidInfo episodePaidInfo;
        MethodCollector.m14708i(2131);
        if (PatchProxy.proxy(new Object[]{episode}, this, LIZ, false, 5).isSupported) {
            MethodCollector.m14707o(2131);
            return;
        }
        C106862S5w.LIZ(episode);
        this.LJFF = episode;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            Episode episode2 = this.LJFF;
            TextView textView = null;
            if (episode2 != null && episode2.paidInfo != null) {
                Episode episode3 = this.LJFF;
                if (episode3 != null && (episodePaidInfo = episode3.paidInfo) != null) {
                    bool = episodePaidInfo.isPaidEpisode();
                } else {
                    bool = null;
                }
                if (!Intrinsics.areEqual(bool, Boolean.FALSE)) {
                    if (this.LJJIIZ == null) {
                        this.LJJIIZ = C116971W2r.LIZ(LayoutInflater.from(getContext()), 2131694978, (ViewGroup) null, false);
                        FrameLayout frameLayout = this.LIZIZ;
                        if (frameLayout == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        }
                        frameLayout.addView(this.LJJIIZ);
                    }
                    View view = this.LJJIIZ;
                    if (view != null) {
                        textView = (TextView) view.findViewById(2131181456);
                    }
                    this.LJIIL = textView;
                }
            }
            MethodCollector.m14707o(2131);
            return;
        }
        MethodCollector.m14707o(2131);
    }

    public final void LIZ(boolean z) {
        if (!PatchProxy.proxy(new Object[]{(byte) 1}, this, LIZ, false, 21).isSupported && this.LJJIII) {
            this.LJJIII = false;
            AbstractC95272Nfu abstractC95272Nfu = this.LJIIJJI;
            if (abstractC95272Nfu != null) {
                abstractC95272Nfu.LIZ(true);
            }
        }
    }

    public final void LIZ(String str, Map<String, ? extends Object> map) {
        if (PatchProxy.proxy(new Object[]{str, map}, this, LIZ, false, 42).isSupported) {
            return;
        }
        if (LIZIZ(str) || LIZ(str)) {
            this.LJIJJ = str;
            Function2<? super String, ? super Map<String, ? extends Object>, Unit> function2 = this.LJJIIJZLJL;
            if (function2 != null) {
                function2.invoke(str, map);
            }
        }
    }

    public final void LIZ(Map<String, ? extends Object> map, Bundle bundle) {
        String key;
        String json;
        if (!PatchProxy.proxy(new Object[]{map, bundle}, this, LIZ, false, 46).isSupported && map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof Map) {
                    key = entry.getKey();
                    json = GsonProtectorUtils.toJson(KM9.LIZ(), entry.getValue());
                } else if (value instanceof Collection) {
                    key = entry.getKey();
                    json = GsonProtectorUtils.toJson(KM9.LIZ(), entry.getValue());
                } else if (value instanceof Short) {
                    String key2 = entry.getKey();
                    Object value2 = entry.getValue();
                    if (value2 != null) {
                        bundle.putShort(key2, ((Short) value2).shortValue());
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Short");
                    }
                } else if (value instanceof Integer) {
                    String key3 = entry.getKey();
                    Object value3 = entry.getValue();
                    if (value3 != null) {
                        bundle.putInt(key3, ((Integer) value3).intValue());
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    }
                } else if (value instanceof Long) {
                    String key4 = entry.getKey();
                    Object value4 = entry.getValue();
                    if (value4 != null) {
                        bundle.putLong(key4, ((Long) value4).longValue());
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                    }
                } else if (value instanceof Boolean) {
                    String key5 = entry.getKey();
                    Object value5 = entry.getValue();
                    if (value5 != null) {
                        bundle.putBoolean(key5, ((Boolean) value5).booleanValue());
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                } else if (value instanceof Float) {
                    String key6 = entry.getKey();
                    Object value6 = entry.getValue();
                    if (value6 != null) {
                        bundle.putFloat(key6, ((Float) value6).floatValue());
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                    }
                } else if (value instanceof Double) {
                    String key7 = entry.getKey();
                    Object value7 = entry.getValue();
                    if (value7 != null) {
                        bundle.putDouble(key7, ((Double) value7).doubleValue());
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Double");
                    }
                } else {
                    key = entry.getKey();
                    Object value8 = entry.getValue();
                    if (value8 == null || (json = value8.toString()) == null) {
                        json = "";
                    }
                }
                bundle.putString(key, json);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5164a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(2136);
        this.LJIILLIIL = "vs_long_video";
        this.LJIIZILJ = "vs_video_center";
        this.LJJ = true;
        this.LJJII = true;
        this.LJJIII = true;
        this.LJI = true;
        this.LJJIIJ = CollectionsKt__CollectionsJVMKt.listOf("timeupdate");
        this.LJIILJJIL = new C123313Yg7(this);
        this.LJIILL = new C123308Yg2(this);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
                this.LIZIZ = new FrameLayout(getContext());
                FrameLayout frameLayout = this.LIZIZ;
                if (frameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                addView(frameLayout);
            }
            IVsVideoService iVsVideoService = (IVsVideoService) ServiceManager.getService(IVsVideoService.class);
            FrameLayout frameLayout2 = this.LIZIZ;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            this.LJIIJJI = iVsVideoService.getVSVideoPlayerHelper(frameLayout2);
            AnonymousClass424 anonymousClass424 = new AnonymousClass424();
            anonymousClass424.LIZJ = 2;
            AbstractC95272Nfu abstractC95272Nfu = this.LJIIJJI;
            if (abstractC95272Nfu != null) {
                abstractC95272Nfu.LIZ(anonymousClass424);
            }
            this.LJII = false;
            AbstractC95272Nfu abstractC95272Nfu2 = this.LJIIJJI;
            if (abstractC95272Nfu2 != null) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                abstractC95272Nfu2.LIZ(context2, this.LJIILJJIL);
            }
            AbstractC95272Nfu abstractC95272Nfu3 = this.LJIIJJI;
            if (abstractC95272Nfu3 != null) {
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                abstractC95272Nfu3.LIZ(context3, this.LJIILL);
                MethodCollector.m14707o(2136);
                return;
            }
        }
        MethodCollector.m14707o(2136);
    }

    public /* synthetic */ C5164a(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, null, 0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        LIZJ();
    }

    public static /* synthetic */ void LIZ(C5164a c5164a, String str, Map map, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{c5164a, str, null, 2, null}, null, LIZ, true, 43).isSupported) {
            return;
        }
        c5164a.LIZ(str, new HashMap());
    }
}
