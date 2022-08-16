package com.bytedance.android.live.permissioncheck.p407c;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import com.p1594ss.avframework.livestreamv2.core.LiveCore;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC413402Xu;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C78157GrX;
import p003X.C81289I2h;
import p003X.C81909IQd;
import p003X.HNU;

/* renamed from: com.bytedance.android.live.permissioncheck.c.b */
/* loaded from: classes3.dex */
public final class C5185b extends C13491f {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public static final C78157GrX LIZLLL = new C78157GrX((byte) 0);

    /* renamed from: LJ */
    public final C81289I2h f26531LJ = C81909IQd.LIZ(this, new C5184a(LiveMode.VIDEO, 0, 2), null, 2, null);
    public final C81289I2h LJFF = C81909IQd.LIZ(this, Boolean.FALSE, null, 2, null);
    public final C81289I2h LJI = C81909IQd.LIZ(this, new C5184a(Boolean.TRUE, 0, 2), null, 2, null);
    public final C81289I2h LJII = C81909IQd.LIZ(this, null, 1, null);
    public final C81289I2h LJIIIIZZ = HNU.LIZ(this, Boolean.FALSE, null, 2, null);
    public final C81289I2h LJIIIZ = C81909IQd.LIZ(this, new C5184a(Boolean.FALSE, 0, 2), null, 2, null);
    public final C81289I2h LJIIJ = C81909IQd.LIZ(this, new C5184a(Boolean.FALSE, 0, 2), null, 2, null);
    public final C81289I2h LJIIJJI = C81909IQd.LIZ(this, new C5184a(Boolean.FALSE, 0, 2), null, 2, null);
    public final C81289I2h LJIIL = C81909IQd.LIZ(this, new C5184a(Boolean.FALSE, 0, 2), null, 2, null);
    public final C81289I2h LJIILIIL = C81909IQd.LIZ(this, new C5184a(Boolean.FALSE, 0, 2), null, 2, null);
    public final C81289I2h LJIILJJIL = C81909IQd.LIZ(this, new C5184a(0, 0, 2), null, 2, null);
    public final C81289I2h LJIILL = C81909IQd.LIZ(this, new C5184a(Boolean.FALSE, 0, 2), null, 2, null);
    public final C81289I2h LJIILLIIL = C81909IQd.LIZ(this, new C5184a(Boolean.FALSE, 0, 2), null, 2, null);
    public final C81289I2h LJIIZILJ = C81909IQd.LIZ(this, new C5184a(Boolean.FALSE, 0, 2), null, 2, null);
    public final C81289I2h LJIJ = C81909IQd.LIZ(this, new C5184a(Boolean.FALSE, 0, 2), null, 2, null);
    public final C81289I2h LJIJI = C81909IQd.LIZ(this, new C5184a(Boolean.FALSE, 0, 2), null, 2, null);
    public final C81289I2h LJIJJ = C81909IQd.LIZ(this, new C5184a(Boolean.FALSE, 0, 2), null, 2, null);
    public final C81289I2h LJIJJLI = C81909IQd.LIZ(this, new C5184a(Boolean.FALSE, 0, 2), null, 2, null);
    public final C81289I2h LJIL = C81909IQd.LIZ(this, new C5184a(Boolean.FALSE, 0, 2), null, 2, null);
    public final C81289I2h LJJ = C81909IQd.LIZ(this, Boolean.FALSE, null, 2, null);
    public final C81289I2h LIZJ = C81909IQd.LIZ(this, new C5184a(Boolean.TRUE, 0, 2), null, 2, null);
    public final C81289I2h LJJI = C81909IQd.LIZ(this, new C5184a(Boolean.FALSE, 0, 2), null, 2, null);
    public final C81289I2h LJJIFFI = C81909IQd.LIZ(this, new C5184a(Boolean.FALSE, 0, 2), null, 2, null);
    public final C81289I2h LJJII = C81909IQd.LIZ(this, new C5184a(Boolean.FALSE, 0, 2), null, 2, null);

    static {
        Covode.recordClassIndex(32808);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C5185b.class, "liveMode", "getLiveMode()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(C5185b.class, "enterBackground", "getEnterBackground()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(C5185b.class, "isStartLiveFragmentShow", "isStartLiveFragmentShow()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl3);
        PropertyReference1Impl propertyReference1Impl4 = new PropertyReference1Impl(C5185b.class, "audioLiveScene", "getAudioLiveScene()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl4);
        PropertyReference1Impl propertyReference1Impl5 = new PropertyReference1Impl(C5185b.class, "liveSurfaceView", "getLiveSurfaceView()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl5);
        PropertyReference1Impl propertyReference1Impl6 = new PropertyReference1Impl(C5185b.class, "liveCore", "getLiveCore()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl6);
        PropertyReference1Impl propertyReference1Impl7 = new PropertyReference1Impl(C5185b.class, "isAnchor", "isAnchor()Lcom/bytedance/live/datacontext/IConstantNonNull;", 0);
        Reflection.property1(propertyReference1Impl7);
        PropertyReference1Impl propertyReference1Impl8 = new PropertyReference1Impl(C5185b.class, "isCloseLive", "isCloseLive()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl8);
        PropertyReference1Impl propertyReference1Impl9 = new PropertyReference1Impl(C5185b.class, "isSelfMute", "isSelfMute()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl9);
        PropertyReference1Impl propertyReference1Impl10 = new PropertyReference1Impl(C5185b.class, "isByMute", "isByMute()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl10);
        PropertyReference1Impl propertyReference1Impl11 = new PropertyReference1Impl(C5185b.class, "isByMutePassive", "isByMutePassive()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl11);
        PropertyReference1Impl propertyReference1Impl12 = new PropertyReference1Impl(C5185b.class, "isLivePause", "isLivePause()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl12);
        PropertyReference1Impl propertyReference1Impl13 = new PropertyReference1Impl(C5185b.class, "linkMode", "getLinkMode()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl13);
        PropertyReference1Impl propertyReference1Impl14 = new PropertyReference1Impl(C5185b.class, "isOpenNewPage", "isOpenNewPage()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl14);
        PropertyReference1Impl propertyReference1Impl15 = new PropertyReference1Impl(C5185b.class, "isByCloseCamera", "isByCloseCamera()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl15);
        PropertyReference1Impl propertyReference1Impl16 = new PropertyReference1Impl(C5185b.class, "isSelfCloseCamera", "isSelfCloseCamera()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl16);
        PropertyReference1Impl propertyReference1Impl17 = new PropertyReference1Impl(C5185b.class, "isCloseAvatar", "isCloseAvatar()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl17);
        PropertyReference1Impl propertyReference1Impl18 = new PropertyReference1Impl(C5185b.class, "isAnchorCloseVideoTalk", "isAnchorCloseVideoTalk()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl18);
        PropertyReference1Impl propertyReference1Impl19 = new PropertyReference1Impl(C5185b.class, "isPickImageWithGallery", "isPickImageWithGallery()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl19);
        PropertyReference1Impl propertyReference1Impl20 = new PropertyReference1Impl(C5185b.class, "isPickImageWithCamera", "isPickImageWithCamera()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl20);
        PropertyReference1Impl propertyReference1Impl21 = new PropertyReference1Impl(C5185b.class, "isInviteMore", "isInviteMore()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl21);
        PropertyReference1Impl propertyReference1Impl22 = new PropertyReference1Impl(C5185b.class, "isPhoneScreenLocked", "isPhoneScreenLocked()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl22);
        PropertyReference1Impl propertyReference1Impl23 = new PropertyReference1Impl(C5185b.class, "isAudioCommentRecording", "isAudioCommentRecording()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl23);
        PropertyReference1Impl propertyReference1Impl24 = new PropertyReference1Impl(C5185b.class, "isOnSinging", "isOnSinging()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl24);
        PropertyReference1Impl propertyReference1Impl25 = new PropertyReference1Impl(C5185b.class, "isVideoModeInVoiceKtv", "isVideoModeInVoiceKtv()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl25);
        PropertyReference1Impl propertyReference1Impl26 = new PropertyReference1Impl(C5185b.class, "isVideoModeInVideoKtv", "isVideoModeInVideoKtv()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl26);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3, propertyReference1Impl4, propertyReference1Impl5, propertyReference1Impl6, propertyReference1Impl7, propertyReference1Impl8, propertyReference1Impl9, propertyReference1Impl10, propertyReference1Impl11, propertyReference1Impl12, propertyReference1Impl13, propertyReference1Impl14, propertyReference1Impl15, propertyReference1Impl16, propertyReference1Impl17, propertyReference1Impl18, propertyReference1Impl19, propertyReference1Impl20, propertyReference1Impl21, propertyReference1Impl22, propertyReference1Impl23, propertyReference1Impl24, propertyReference1Impl25, propertyReference1Impl26};
    }

    public final C2WC<C5184a> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C2WC) (proxy.isSupported ? proxy.result : this.f26531LJ.LIZ(this, LIZIZ[0]));
    }

    public final C2WC<Boolean> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJFF.LIZ(this, LIZIZ[1]));
    }

    public final C2WC<C5184a> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJI.LIZ(this, LIZIZ[2]));
    }

    public final C2WD<LiveCore> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJII.LIZ(this, LIZIZ[5]));
    }

    /* renamed from: LJ */
    public final AbstractC413402Xu<Boolean> m15622LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return (AbstractC413402Xu) (proxy.isSupported ? proxy.result : this.LJIIIIZZ.LIZ(this, LIZIZ[6]));
    }

    public final C2WC<C5184a> LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIIZ.LIZ(this, LIZIZ[7]));
    }

    public final C2WC<C5184a> LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIJ.LIZ(this, LIZIZ[8]));
    }

    public final C2WC<C5184a> LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIJJI.LIZ(this, LIZIZ[9]));
    }

    public final C2WC<C5184a> LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIL.LIZ(this, LIZIZ[10]));
    }

    public final C2WC<C5184a> LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 13);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIILIIL.LIZ(this, LIZIZ[11]));
    }

    public final C2WC<C5184a> LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 14);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIILJJIL.LIZ(this, LIZIZ[12]));
    }

    public final C2WC<C5184a> LJIIJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 15);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIILL.LIZ(this, LIZIZ[13]));
    }

    public final C2WC<C5184a> LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIILLIIL.LIZ(this, LIZIZ[14]));
    }

    public final C2WC<C5184a> LJIILIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 17);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIZILJ.LIZ(this, LIZIZ[15]));
    }

    public final C2WC<C5184a> LJIILJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 18);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIJ.LIZ(this, LIZIZ[16]));
    }

    public final C2WC<C5184a> LJIILL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 20);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIJJ.LIZ(this, LIZIZ[18]));
    }

    public final C2WC<C5184a> LJIILLIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 21);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIJJLI.LIZ(this, LIZIZ[19]));
    }

    public final C2WC<C5184a> LJIIZILJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 22);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIL.LIZ(this, LIZIZ[20]));
    }

    public final C2WC<Boolean> LJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 23);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJ.LIZ(this, LIZIZ[21]));
    }

    public C5185b() {
        C81909IQd.LIZ(this, new C5184a(0, 0L, 2), null, 2, null);
        C81909IQd.LIZ(this, null, 1, null);
    }
}
