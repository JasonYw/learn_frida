package com.bytedance.android.live.liveinteract.voicechat.view;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p353ui.SeatAnimationView;
import com.bytedance.android.live.liveinteract.linkroomfight.core.C4492d;
import com.bytedance.android.live.liveinteract.multianchor.model.MicDress;
import com.bytedance.android.live.liveinteract.plantform.model.C4816k;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.videotalk.battle.C4891b;
import com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleSeatEffectView;
import com.bytedance.android.live.liveinteract.videotalk.battle.j$a;
import com.bytedance.android.live.liveinteract.videotalk.quickinteract.AbstractC4936a;
import com.bytedance.android.live.liveinteract.videotalk.quickinteract.C4939e;
import com.bytedance.android.live.liveinteract.videotalk.quickinteract.interactView.GuestBattleQuickInteractView;
import com.bytedance.android.live.liveinteract.videotalk.quickinteract.interactView.LinkMicQuickInteractView;
import com.bytedance.android.live.liveinteract.view.PositionNameTv;
import com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e;
import com.bytedance.android.live.liveinteract.voicechat.fight.C5056a;
import com.bytedance.android.live.liveinteract.voicechat.p395wm.AbstractC5143z;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.model.interact.C6166j;
import com.bytedance.android.livesdk.common.AnchorPauseTipsView;
import com.bytedance.android.livesdk.config.C6840aw;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.message.model.LinkMicGuideMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.audio.VoiceLiveTheme;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC78986HBs;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2WC;
import p003X.C3Q0;
import p003X.C414192aL;
import p003X.C4574547f;
import p003X.C472014lP;
import p003X.C78307Gtx;
import p003X.C78571GyD;
import p003X.C78636GzG;
import p003X.C78828H5q;
import p003X.C79191HJp;
import p003X.C79242HLo;
import p003X.C80302Hl2;
import p003X.C80312HlC;
import p003X.C80581HpX;
import p003X.C80582HpY;
import p003X.C80864Hu6;
import p003X.C80900Hug;
import p003X.C80945HvP;
import p003X.C87308Kak;
import p003X.HKN;
import p003X.IOU;
import p003X.LK1;
import p003X.LK5;
import p003X.M0Q;
import p003X.RunnableC80591Hph;

/* loaded from: classes3.dex */
public final class VoiceChatRoomAnchorView extends FrameLayout implements View.OnClickListener, j$a {
    public static ChangeQuickRedirect LIZ;
    public final HSImageView LIZIZ;
    public final HSImageView LIZJ;
    public final TextView LIZLLL;

    /* renamed from: LJ */
    public final LinkMicQuickInteractView f26503LJ;
    public final AnchorPauseTipsView LJFF;
    public final PositionNameTv LJI;
    public LinearLayout LJII;
    public TextView LJIIIIZZ;
    public LinearLayout LJIIIZ;
    public TextView LJIIJ;
    public LottieAnimationView LJIIJJI;
    public TextView LJIIL;
    public DataCenter LJIILIIL;
    public Room LJIILJJIL;
    public boolean LJIILL;
    public GuestBattleQuickInteractView LJIILLIIL;
    public GuestBattleSeatEffectView LJIIZILJ;
    public HSImageView LJIJ;
    public boolean LJIJI;
    public AnimatorSet LJIJJ;
    public boolean LJIJJLI;
    public LinkPlayerInfo LJIL;
    public final String LJJ;
    public final SeatAnimationView LJJI;
    public HSImageView LJJIFFI;
    public HSImageView LJJII;
    public AbstractC5137a LJJIII;
    public C6166j.C6167a LJJIIJ;
    public int LJJIIJZLJL;
    public boolean LJJIIZ;
    public VoiceLiveTheme LJJIIZI;
    public IOU LJJIJ;
    public final C80581HpX LJJIJIIJI;
    public C79191HJp<LinkPlayerInfo> LJJIJIIJIL;
    public Function1<? super User, Unit> LJJIJIL;
    public boolean LJJIJL;

    static {
        Covode.recordClassIndex(31851);
    }

    public VoiceChatRoomAnchorView(Context context) {
        this(context, null, 0, 6, null);
    }

    public VoiceChatRoomAnchorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final int getResourceLayout() {
        return 2131700319;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.battle.j$a
    public final PointF LIZIZ(long j) {
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.battle.j$a
    public final boolean LJFF() {
        return true;
    }

    public final void LJII() {
        this.LJJIJL = false;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.battle.j$a
    public final void LJIJJ() {
        boolean z = PatchProxy.proxy(new Object[0], this, LIZ, false, 57).isSupported;
    }

    public final void setLinkMicSeatCallback(AbstractC5143z abstractC5143z) {
        if (PatchProxy.proxy(new Object[]{abstractC5143z}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC5143z);
    }

    public final Function1<User, Unit> getGuestBattleClickCallback() {
        return this.LJJIJIL;
    }

    public final C6166j.C6167a getMBattleResult() {
        return this.LJJIIJ;
    }

    public final SeatAnimationView getSeatAnimView() {
        return this.LJJI;
    }

    public final void LIZ(Room room) {
        VoiceLiveTheme voiceLiveTheme;
        if (PatchProxy.proxy(new Object[]{room}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(room);
        this.LJIILJJIL = room;
        SettingKey<Boolean> settingKey = LiveSettingKeys.ENABLE_BITMAP_CROP;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            int LIZ2 = LK5.LIZ(60.0f);
            User owner = room.getOwner();
            if (owner != null) {
                M0Q.LIZIZ(this.LIZJ, owner.getAvatarMedium(), LIZ2, LIZ2);
            }
        } else {
            User owner2 = room.getOwner();
            if (owner2 != null) {
                M0Q.LIZIZ((ImageView) this.LIZJ, owner2.getAvatarMedium());
            }
        }
        TextView textView = this.LIZLLL;
        User owner3 = room.getOwner();
        textView.setText(owner3 != null ? owner3.getNickName() : null);
        LK1.LIZ((View) this.f26503LJ);
        this.LJJI.setEmojiCallback(new C80864Hu6(this));
        SettingKey<Integer> settingKey2 = LiveSettingKeys.LINK_ANIM_VOLUME_OPT;
        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
        if (settingKey2.getValue().intValue() > 0 && (voiceLiveTheme = this.LJJIIZI) != null && voiceLiveTheme.LIZ()) {
            UIUtils.updateLayout(this.LIZIZ, LK1.LIZLLL(80), LK1.LIZLLL(80));
        } else {
            UIUtils.updateLayout(this.LIZIZ, LK1.LIZLLL(90), LK1.LIZLLL(90));
        }
        LIZ();
    }

    public final void LIZ(String str, long j, C4816k c4816k) {
        C4816k c4816k2 = c4816k;
        String str2 = str;
        if (PatchProxy.proxy(new Object[]{str2, new Long(j), c4816k2}, this, LIZ, false, 10).isSupported) {
            return;
        }
        if (this.LJFF.getVisibility() == 0) {
            LK1.LIZ((View) this.f26503LJ);
        }
        if (C4891b.LIZJ.m23816LJ()) {
            LK1.LIZ((View) this.f26503LJ);
        }
        if (AbstractC4936a.LIZ.LIZ(getAnchorInfo())) {
            if (C4891b.LIZJ.m23816LJ() || C4492d.LIZLLL.LIZJ()) {
                this.f26503LJ.LIZ(str2);
                return;
            }
            AbstractC4936a LIZ2 = AbstractC4936a.LIZ.LIZ();
            if (LIZ2 == null) {
                return;
            }
            long LIZ3 = C79242HLo.LIZ();
            if (str2 == null) {
                str2 = "";
            }
            if (c4816k2 == null) {
                c4816k2 = new C4816k();
            }
            C80945HvP.LIZ(LIZ2, new C4939e(LIZ3, str2, 0, c4816k2), false, 2, (Object) null);
            return;
        }
        this.f26503LJ.LIZ(str2);
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 15).isSupported) {
            return;
        }
        this.LJJIIZ = z;
        if (z) {
            Drawable LIZJ = LK5.LIZJ(2130857187);
            LIZJ.setBounds(0, 0, LK1.LIZLLL(15), LK1.LIZLLL(15));
            this.LIZLLL.setCompoundDrawables(LIZJ, null, null, null);
            LJIIIIZZ();
            return;
        }
        this.LIZLLL.setCompoundDrawables(null, null, null, null);
    }

    public final void LIZ(LinkMicGuideMessage.C8701a c8701a) {
        int i = 0;
        if (PatchProxy.proxy(new Object[]{c8701a}, this, LIZ, false, 24).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8701a);
        if (c8701a.LIZ != null && c8701a.LIZ.size() >= 3) {
            do {
                LinkMicGuideMessage.C8702b c8702b = c8701a.LIZ.get(i);
                if (i == 0) {
                    if (TextUtils.isEmpty(c8702b.LIZ)) {
                        this.LJIIIZ.setVisibility(4);
                    } else {
                        this.LJIIJ.setText(c8702b.LIZ);
                        if (c8702b.LIZIZ == null) {
                            this.LJJII.setVisibility(8);
                        } else {
                            SettingKey<Boolean> settingKey = LiveSettingKeys.ENABLE_BITMAP_CROP;
                            Intrinsics.checkNotNullExpressionValue(settingKey, "");
                            Boolean value = settingKey.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "");
                            if (value.booleanValue()) {
                                int LIZ2 = LK5.LIZ(14.0f);
                                M0Q.LIZ((ImageView) this.LJJII, c8702b.LIZIZ, LIZ2, LIZ2);
                            } else {
                                M0Q.LIZ((ImageView) this.LJJII, c8702b.LIZIZ);
                            }
                        }
                    }
                } else if (i == 1) {
                    if (TextUtils.isEmpty(c8702b.LIZ)) {
                        this.LJII.setVisibility(4);
                    } else {
                        this.LJIIIIZZ.setText(c8702b.LIZ);
                        if (c8702b.LIZIZ == null) {
                            this.LJJIFFI.setVisibility(8);
                        } else {
                            SettingKey<Boolean> settingKey2 = LiveSettingKeys.ENABLE_BITMAP_CROP;
                            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                            Boolean value2 = settingKey2.getValue();
                            Intrinsics.checkNotNullExpressionValue(value2, "");
                            if (value2.booleanValue()) {
                                int LIZ3 = LK5.LIZ(14.0f);
                                M0Q.LIZ((ImageView) this.LJJIFFI, c8702b.LIZIZ, LIZ3, LIZ3);
                            } else {
                                M0Q.LIZ((ImageView) this.LJJIFFI, c8702b.LIZIZ);
                            }
                        }
                    }
                } else if (TextUtils.isEmpty(c8702b.LIZ)) {
                    this.LJIIL.setVisibility(8);
                } else {
                    this.LJIIL.setText(c8702b.LIZ);
                }
                i++;
            } while (i <= 2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 37).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        this.LJI.LIZ();
    }

    private final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        LinkPlayerInfo anchorInfo = getAnchorInfo();
        if (anchorInfo != null && anchorInfo.LIZIZ()) {
            LIZ();
            return;
        }
        this.LIZIZ.setController(null);
        this.LIZIZ.setVisibility(4);
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 26).isSupported) {
            return;
        }
        AnimatorSet animatorSet = this.LJIJJ;
        if (animatorSet != null && animatorSet.isRunning()) {
            animatorSet.cancel();
        }
        this.LJII.setVisibility(8);
        this.LJIIIZ.setVisibility(8);
        this.LJIIL.setVisibility(8);
        this.LJIIJJI.cancelAnimation();
        this.LJIIJJI.setVisibility(8);
    }

    public final void LJI() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 39).isSupported) {
            return;
        }
        LIZ();
        LinkPlayerInfo anchorInfo = getAnchorInfo();
        if (anchorInfo != null) {
            str = anchorInfo.LIZJ;
        } else {
            str = null;
        }
        LIZ(str);
    }

    public final boolean getAnchorEnable() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 40);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f7136dE;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Boolean LIZ2 = c87308Kak.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        if (!LIZ2.booleanValue() || !C78636GzG.LIZIZ.LIZIZ()) {
            return false;
        }
        return true;
    }

    public final LinkPlayerInfo getAnchorInfo() {
        LinkPlayerInfo linkPlayerInfo;
        long j;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (LinkPlayerInfo) proxy.result;
        }
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        AbstractC78986HBs<LinkPlayerInfo> linkUserInfoCenter = ((IInteractService) service).getLinkUserInfoCenter();
        if (linkUserInfoCenter != null) {
            Room room = this.LJIILJJIL;
            if (room != null) {
                j = room.ownerUserId;
            } else {
                j = 0;
            }
            linkPlayerInfo = linkUserInfoCenter.LIZ(j, "");
        } else {
            linkPlayerInfo = null;
        }
        this.LJIL = linkPlayerInfo;
        return this.LJIL;
    }

    public final PointF getAvatarCenterPoint() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 28);
        if (proxy.isSupported) {
            return (PointF) proxy.result;
        }
        return new PointF((this.LIZJ.getRight() + this.LIZJ.getLeft()) / 2, (this.LIZJ.getBottom() + this.LIZJ.getTop()) / 2);
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.battle.j$a
    /* renamed from: LJ */
    public final void mo15639LJ() {
        AbstractC4936a LIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 54).isSupported) {
            return;
        }
        if (AbstractC4936a.LIZ.LIZ(getAnchorInfo()) && (LIZ2 = AbstractC4936a.LIZ.LIZ()) != null) {
            LIZ2.LIZIZ();
        }
        this.f26503LJ.setVisibility(0);
        this.f26503LJ.setAlpha(1.0f);
        this.LJIILLIIL.LJI();
        this.LJIJ.setVisibility(8);
        this.LJIIZILJ.LIZ();
        this.LJJIIJ = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 36).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        AbstractC78986HBs<LinkPlayerInfo> linkUserInfoCenter = ((IInteractService) service).getLinkUserInfoCenter();
        if (linkUserInfoCenter != null) {
            linkUserInfoCenter.LIZIZ(this.LJJIJIIJI);
        }
        IService service2 = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service2, "");
        AbstractC78986HBs<LinkPlayerInfo> linkUserInfoCenter2 = ((IInteractService) service2).getLinkUserInfoCenter();
        if (linkUserInfoCenter2 != null) {
            linkUserInfoCenter2.LIZIZ(this.LJJIJIIJIL);
        }
        this.LJI.LIZIZ();
    }

    private final void LJIIIZ() {
        VoiceLiveTheme voiceLiveTheme;
        LinkPlayerInfo anchorInfo;
        LinkPlayerInfo anchorInfo2;
        long j;
        String str;
        MicDress micDress;
        MicDress.VoiceWave voiceWave;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            return;
        }
        SettingKey<Integer> settingKey = LiveSettingKeys.LINK_ANIM_VOLUME_OPT;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (settingKey.getValue().intValue() > 0 && (((voiceLiveTheme = this.LJJIIZI) != null && voiceLiveTheme.LIZ()) || ((anchorInfo = getAnchorInfo()) != null && anchorInfo.LIZIZ()))) {
            if (!this.LJJIJL && (anchorInfo2 = getAnchorInfo()) != null && anchorInfo2.LIZIZ()) {
                C78307Gtx c78307Gtx = C78307Gtx.LIZIZ;
                Room room = this.LJIILJJIL;
                if (room != null) {
                    j = room.ownerUserId;
                } else {
                    j = 0;
                }
                LinkPlayerInfo anchorInfo3 = getAnchorInfo();
                if (anchorInfo3 == null || (micDress = anchorInfo3.LJJIJL) == null || (voiceWave = micDress.LIZIZ) == null || (str = voiceWave.LIZIZ) == null) {
                    str = "";
                }
                c78307Gtx.LIZ(j, str);
                this.LJJIJL = true;
            }
            IOU iou = this.LJJIJ;
            if (iou != null) {
                iou.LIZ();
                return;
            }
            return;
        }
        this.LIZIZ.setController(null);
        this.LIZIZ.setVisibility(4);
    }

    public final void LIZ() {
        Animatable animatable;
        LinkPlayerInfo anchorInfo;
        MicDress micDress;
        MicDress.VoiceWave voiceWave;
        ImageModel imageModel;
        List<String> urls;
        String str;
        long j;
        String str2;
        MicDress micDress2;
        MicDress.VoiceWave voiceWave2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        LinkPlayerInfo anchorInfo2 = getAnchorInfo();
        if (anchorInfo2 != null && anchorInfo2.LIZIZ()) {
            LinkPlayerInfo anchorInfo3 = getAnchorInfo();
            if (anchorInfo3 != null && anchorInfo3.LIZIZ() && !this.LJJIJL) {
                if (C79242HLo.LJJI() && !C78571GyD.LIZ(this.LJIILJJIL)) {
                    C78307Gtx c78307Gtx = C78307Gtx.LIZIZ;
                    Room room = this.LJIILJJIL;
                    if (room != null) {
                        j = room.ownerUserId;
                    } else {
                        j = 0;
                    }
                    LinkPlayerInfo anchorInfo4 = getAnchorInfo();
                    if (anchorInfo4 == null || (micDress2 = anchorInfo4.LJJIJL) == null || (voiceWave2 = micDress2.LIZIZ) == null || (str2 = voiceWave2.LIZIZ) == null) {
                        str2 = "";
                    }
                    c78307Gtx.LIZ(j, str2);
                    this.LJJIJL = true;
                } else {
                    return;
                }
            }
            HSImageView hSImageView = this.LIZJ;
            if (hSImageView != null) {
                hSImageView.post(new RunnableC80591Hph(this));
            }
            this.LIZIZ.setVisibility(0);
            if (this.LIZIZ.getController() == null && (anchorInfo = getAnchorInfo()) != null && (micDress = anchorInfo.LJJIJL) != null && (voiceWave = micDress.LIZIZ) != null && (imageModel = voiceWave.LIZLLL) != null && (urls = imageModel.getUrls()) != null && (str = (String) CollectionsKt___CollectionsKt.getOrNull(urls, 0)) != null) {
                AbstractDraweeController mo27965build = Fresco.newDraweeControllerBuilder().mo27962setUri(Uri.parse(str)).mo27967setOldController(this.LIZIZ.getController()).setAutoPlayAnimations(false).mo27965build();
                Intrinsics.checkNotNullExpressionValue(mo27965build, "");
                this.LIZIZ.setController(mo27965build);
            }
            DraweeController controller = this.LIZIZ.getController();
            if (controller != null) {
                animatable = controller.getAnimatable();
            } else {
                animatable = null;
            }
            if (!(animatable instanceof AnimatedDrawable2)) {
                animatable = null;
            }
            AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
            if (animatedDrawable2 != null) {
                animatedDrawable2.stop();
                animatedDrawable2.jumpToFrame(1);
                return;
            }
            return;
        }
        this.LIZIZ.setController(null);
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.battle.j$a
    public final void LIZIZ() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 52).isSupported || !C80302Hl2.LIZ()) {
            return;
        }
        C6166j.C6167a c6167a = this.LJJIIJ;
        if (c6167a != null && c6167a.LJIIJJI) {
            str = C6840aw.m15457LJ();
        } else {
            C6166j.C6167a c6167a2 = this.LJJIIJ;
            if (c6167a2 == null || !c6167a2.LJIILJJIL) {
                str = "";
            } else {
                str = C6840aw.LJFF();
            }
        }
        if (getAnchorEnable() && str != null && str.length() != 0) {
            AbstractDraweeController mo27965build = Fresco.newDraweeControllerBuilder().mo27963setUri(str).setAutoPlayAnimations(true).setControllerListener(new C80582HpY(this)).mo27965build();
            Intrinsics.checkNotNullExpressionValue(mo27965build, "");
            this.LJIJ.setController(mo27965build);
            this.LJIJ.setVisibility(0);
        }
    }

    public final void LIZLLL() {
        LinkPlayerInfo anchorInfo;
        Animatable animatable;
        LinkPlayerInfo anchorInfo2;
        MicDress micDress;
        MicDress.VoiceWave voiceWave;
        ImageModel imageModel;
        List<String> urls;
        String str;
        int i;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 30).isSupported) {
            return;
        }
        if (C78636GzG.LIZIZ.LIZIZ()) {
            LIZJ(true);
            this.f26503LJ.setVisibility(0);
        } else {
            this.f26503LJ.setVisibility(8);
        }
        if (this.LJI.getVisibility() == 0) {
            this.LJIJJLI = true;
        }
        this.LJI.setVisibility(8);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 31).isSupported) {
            C3Q0.m24913LJ(this.LIZLLL, LK5.LIZ(4.0f));
            if (C5056a.LIZJ.LIZLLL()) {
                i = 2131429519;
            } else {
                i = 2131429517;
            }
            int LIZLLL = LK5.LIZLLL(i);
            UIUtils.updateLayout(this.LIZJ, LIZLLL, LIZLLL);
            int i2 = (int) (LIZLLL / 0.75d);
            UIUtils.updateLayout(this.LIZIZ, i2, i2);
            UIUtils.updateLayout(this, -3, LK5.LIZLLL(2131429582));
            C472014lP.LIZ(this.LJFF, LIZLLL / 2);
        }
        LIZJ();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported && (anchorInfo = getAnchorInfo()) != null && anchorInfo.LIZIZ()) {
            this.LIZIZ.setVisibility(0);
            if (this.LIZIZ.getController() == null && (anchorInfo2 = getAnchorInfo()) != null && (micDress = anchorInfo2.LJJIJL) != null && (voiceWave = micDress.LIZIZ) != null && (imageModel = voiceWave.LIZLLL) != null && (urls = imageModel.getUrls()) != null && (str = (String) CollectionsKt___CollectionsKt.getOrNull(urls, 0)) != null) {
                AbstractDraweeController mo27965build = Fresco.newDraweeControllerBuilder().mo27962setUri(Uri.parse(str)).mo27967setOldController(this.LIZIZ.getController()).setAutoPlayAnimations(false).mo27965build();
                Intrinsics.checkNotNullExpressionValue(mo27965build, "");
                this.LIZIZ.setController(mo27965build);
            }
            DraweeController controller = this.LIZIZ.getController();
            if (controller != null) {
                animatable = controller.getAnimatable();
            } else {
                animatable = null;
            }
            if (!(animatable instanceof AnimatedDrawable2)) {
                animatable = null;
            }
            AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
            if (animatedDrawable2 != null) {
                animatedDrawable2.stop();
                animatedDrawable2.jumpToFrame(1);
            }
        }
    }

    public final void setGuestBattleClickCallback(Function1<? super User, Unit> function1) {
        this.LJJIJIL = function1;
    }

    public final void setMBattleResult(C6166j.C6167a c6167a) {
        this.LJJIIJ = c6167a;
    }

    public final void LIZ(VoiceLiveTheme voiceLiveTheme) {
        if (PatchProxy.proxy(new Object[]{voiceLiveTheme}, this, LIZ, false, 17).isSupported) {
            return;
        }
        C106862S5w.LIZ(voiceLiveTheme);
        this.LJJIIZI = voiceLiveTheme;
        LJIIIZ();
    }

    public final void setGuestBattleCallback(Function1<? super User, Unit> function1) {
        if (PatchProxy.proxy(new Object[]{function1}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(function1);
        this.LJJIJIL = function1;
    }

    public final void setOnAnchorViewClickListener(AbstractC5137a abstractC5137a) {
        if (PatchProxy.proxy(new Object[]{abstractC5137a}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC5137a);
        this.LJJIII = abstractC5137a;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.view.VoiceChatRoomAnchorView$1 */
    /* loaded from: classes3.dex */
    public static final class C51341 extends Lambda implements Function1<View, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(31852);
        }

        public C51341() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(View view) {
            User LIZ;
            Function1<User, Unit> guestBattleClickCallback;
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(view);
                LinkPlayerInfo anchorInfo = VoiceChatRoomAnchorView.this.getAnchorInfo();
                if (anchorInfo != null && (LIZ = anchorInfo.LIZ()) != null && (guestBattleClickCallback = VoiceChatRoomAnchorView.this.getGuestBattleClickCallback()) != null) {
                    guestBattleClickCallback.invoke(LIZ);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void setDataCenter(DataCenter dataCenter) {
        if (PatchProxy.proxy(new Object[]{dataCenter}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(dataCenter);
        this.LJIILIIL = dataCenter;
        Object obj = dataCenter.get("data_is_anchor", (String) Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        this.LJIILL = ((Boolean) obj).booleanValue();
    }

    private void LIZ(String str) {
        LinkPlayerInfo anchorInfo;
        AbstractC4936a LIZ2;
        String str2 = str;
        if (PatchProxy.proxy(new Object[]{str2}, this, LIZ, false, 9).isSupported) {
            return;
        }
        String str3 = "0";
        if (AbstractC4936a.LIZ.LIZ(getAnchorInfo()) && (LIZ2 = AbstractC4936a.LIZ.LIZ()) != null && !LIZ2.LIZJ() && !C4492d.LIZLLL.LIZJ()) {
            AbstractC4936a LIZ3 = AbstractC4936a.LIZ.LIZ();
            if (LIZ3 != null) {
                long LIZ4 = C79242HLo.LIZ();
                if (str2 != null) {
                    str3 = str2;
                }
                C80945HvP.LIZ(LIZ3, new C4939e(LIZ4, str3, 0L, 0L, null, null, 0, false, 252), false, 2, (Object) null);
                return;
            }
            return;
        }
        LinkMicQuickInteractView linkMicQuickInteractView = this.f26503LJ;
        if (str2 == null && ((anchorInfo = getAnchorInfo()) == null || (str2 = anchorInfo.LIZJ) == null)) {
            str2 = str3;
        }
        linkMicQuickInteractView.LIZJ(str2);
    }

    private final void LIZIZ(int i) {
        ImageModel imageModel;
        LinkPlayerInfo anchorInfo;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 18).isSupported) {
            return;
        }
        VoiceLiveTheme voiceLiveTheme = this.LJJIIZI;
        if (voiceLiveTheme != null) {
            imageModel = voiceLiveTheme.LJII;
        } else {
            imageModel = null;
        }
        if (VoiceLiveTheme.LIZ(imageModel) || ((anchorInfo = getAnchorInfo()) != null && anchorInfo.LIZIZ())) {
            LIZJ(i);
            return;
        }
        SettingKey<String> settingKey = LiveSettingKeys.LIVE_AUDIO_LIVE_WEBP;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        String value = settingKey.getValue();
        if (TextUtils.isEmpty(value)) {
            ALogger.m15800e(this.LJJ, "radio effect is null");
            return;
        }
        AbstractDraweeController mo27965build = Fresco.newDraweeControllerBuilder().mo27962setUri(Uri.parse(value)).mo27967setOldController(this.LIZIZ.getController()).setAutoPlayAnimations(true).mo27965build();
        Intrinsics.checkNotNullExpressionValue(mo27965build, "");
        this.LIZIZ.setController(mo27965build);
        this.LIZIZ.setVisibility(0);
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.battle.j$a
    public final void LIZJ(C6166j c6166j) {
        List<C6166j.C6167a> list;
        Object obj;
        User LIZ2;
        if (PatchProxy.proxy(new Object[]{c6166j}, this, LIZ, false, 50).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6166j);
        if (getAnchorEnable() && (list = c6166j.LJFF) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    long j = ((C6166j.C6167a) obj).LIZIZ;
                    LinkPlayerInfo anchorInfo = getAnchorInfo();
                    if (anchorInfo != null && (LIZ2 = anchorInfo.LIZ()) != null && j == LIZ2.getId()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C6166j.C6167a c6167a = (C6166j.C6167a) obj;
            if (c6167a != null && c6167a.LJIIJJI) {
                this.LJIILLIIL.LIZJ(c6167a);
                this.LJIILLIIL.LJFF();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.battle.j$a
    public final void LIZLLL(C6166j c6166j) {
        List<C6166j.C6167a> list;
        Object obj;
        User LIZ2;
        if (PatchProxy.proxy(new Object[]{c6166j}, this, LIZ, false, 51).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6166j);
        if (getAnchorEnable() && (list = c6166j.LJFF) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    long j = ((C6166j.C6167a) obj).LIZIZ;
                    LinkPlayerInfo anchorInfo = getAnchorInfo();
                    if (anchorInfo != null && (LIZ2 = anchorInfo.LIZ()) != null && j == LIZ2.getId()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C6166j.C6167a c6167a = (C6166j.C6167a) obj;
            if (c6167a != null && !c6167a.LJIIJJI && this.LJIILLIIL.LJII()) {
                this.LJIILLIIL.LIZJ();
            }
        }
    }

    public final void LIZJ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 29).isSupported) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f26503LJ.getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.LayoutParams)) {
            layoutParams = null;
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            if (z) {
                layoutParams2.bottomToTop = 2131172565;
                layoutParams2.topToBottom = -1;
            } else {
                layoutParams2.bottomToTop = -1;
                layoutParams2.topToBottom = 2131172565;
            }
            this.f26503LJ.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.battle.j$a
    /* renamed from: LJ */
    public final void mo15638LJ(C6166j c6166j) {
        List<C6166j.C6167a> list;
        Object obj;
        AbstractC4936a LIZ2;
        User LIZ3;
        if (PatchProxy.proxy(new Object[]{c6166j}, this, LIZ, false, 53).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6166j);
        if (getAnchorEnable() && (list = c6166j.LJFF) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    long j = ((C6166j.C6167a) obj).LIZIZ;
                    LinkPlayerInfo anchorInfo = getAnchorInfo();
                    if (anchorInfo != null && (LIZ3 = anchorInfo.LIZ()) != null && j == LIZ3.getId()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C6166j.C6167a c6167a = (C6166j.C6167a) obj;
            if (c6167a != null) {
                if (this.LJIJ.LIZ()) {
                    this.LJIJ.setController(null);
                    this.LJIJ.setVisibility(8);
                    this.LJIILLIIL.LJFF();
                } else if (!UIUtils.isViewVisible(this.LJIILLIIL)) {
                    LIZ(c6166j);
                    return;
                } else if (UIUtils.isViewVisible(this.f26503LJ)) {
                    this.f26503LJ.setVisibility(8);
                }
                if (AbstractC4936a.LIZ.LIZ(getAnchorInfo())) {
                    AbstractC4936a LIZ4 = AbstractC4936a.LIZ.LIZ();
                    if (LIZ4 != null) {
                        C4939e LIZ5 = C4939e.LJIIIZ.LIZ(c6167a);
                        LIZ5.LIZLLL = 0L;
                        C80945HvP.LIZ(LIZ4, LIZ5, false, 2, (Object) null);
                    }
                    if (!C4891b.LIZJ.LIZJ() && (LIZ2 = AbstractC4936a.LIZ.LIZ()) != null) {
                        LIZ2.LIZIZ();
                    }
                } else {
                    this.LJIILLIIL.LIZIZ(c6167a);
                }
                this.LJIILLIIL.LIZJ(c6167a);
                this.LJIIZILJ.setVisibility(0);
                if (!this.LJIJI) {
                    this.LJIIZILJ.LIZ(c6167a);
                }
                this.LJJIIJ = c6167a;
            }
        }
    }

    private final void LIZJ(int i) {
        VoiceLiveTheme voiceLiveTheme;
        LinkPlayerInfo anchorInfo;
        Integer num;
        ImageModel imageModel;
        IOU iou;
        MicDress micDress;
        MicDress.VoiceWave voiceWave;
        int i2;
        User owner;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 19).isSupported) {
            return;
        }
        SettingKey<Integer> settingKey = LiveSettingKeys.LINK_ANIM_VOLUME_OPT;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Integer value = settingKey.getValue();
        ImageModel imageModel2 = null;
        if (value.intValue() > 0 && (((voiceLiveTheme = this.LJJIIZI) != null && voiceLiveTheme.LIZ()) || ((anchorInfo = getAnchorInfo()) != null && anchorInfo.LIZIZ()))) {
            Room room = this.LJIILJJIL;
            if (room != null && (owner = room.getOwner()) != null) {
                num = Integer.valueOf(owner.getGender());
            } else {
                num = null;
            }
            VoiceLiveTheme voiceLiveTheme2 = this.LJJIIZI;
            if (voiceLiveTheme2 != null) {
                int intValue = value.intValue();
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                imageModel = voiceLiveTheme2.LIZ(intValue, i, i2);
            } else {
                imageModel = null;
            }
            LinkPlayerInfo anchorInfo2 = getAnchorInfo();
            if (anchorInfo2 != null && anchorInfo2.LIZIZ()) {
                int height = (int) (this.LIZJ.getHeight() / 0.75d);
                UIUtils.updateLayout(this.LIZIZ, height, height);
                LinkPlayerInfo anchorInfo3 = getAnchorInfo();
                if (anchorInfo3 != null && (micDress = anchorInfo3.LJJIJL) != null && (voiceWave = micDress.LIZIZ) != null) {
                    imageModel2 = voiceWave.LIZ(i);
                }
                this.LIZIZ.setVisibility(0);
                IOU iou2 = this.LJJIJ;
                if (iou2 != null) {
                    iou2.LIZIZ(imageModel2);
                    return;
                }
                return;
            }
            if (value.intValue() > 0) {
                UIUtils.updateLayout(this.LIZIZ, LK1.LIZLLL(90), LK1.LIZLLL(90));
            } else {
                UIUtils.updateLayout(this.LIZIZ, LK1.LIZLLL(80), LK1.LIZLLL(80));
            }
            if (imageModel != null && (iou = this.LJJIJ) != null) {
                iou.LIZ(imageModel);
            }
        } else {
            HSImageView hSImageView = this.LIZIZ;
            PipelineDraweeControllerBuilder newDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
            VoiceLiveTheme voiceLiveTheme3 = this.LJJIIZI;
            if (voiceLiveTheme3 != null) {
                imageModel2 = voiceLiveTheme3.LJII;
            }
            hSImageView.setController(newDraweeControllerBuilder.setFirstAvailableImageRequests(M0Q.LIZJ(imageModel2)).mo27967setOldController(this.LIZIZ.getController()).setAutoPlayAnimations(true).mo27965build());
        }
        this.LIZIZ.setVisibility(0);
    }

    public final void LIZ(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 16).isSupported && this.LJJIIJZLJL != i) {
            this.LJJIIJZLJL = i;
            if (this.LJJIIZ) {
                LJIIIIZZ();
            } else if (this.LJJIIJZLJL > 0) {
                LIZIZ(i);
            } else {
                LJIIIZ();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.battle.j$a
    public final void LIZIZ(C6166j c6166j) {
        Object obj;
        User LIZ2;
        if (PatchProxy.proxy(new Object[]{c6166j}, this, LIZ, false, 43).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6166j);
        List<C6166j.C6167a> list = c6166j.LJFF;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    long j = ((C6166j.C6167a) obj).LIZIZ;
                    LinkPlayerInfo anchorInfo = getAnchorInfo();
                    if (anchorInfo != null && (LIZ2 = anchorInfo.LIZ()) != null && j == LIZ2.getId()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C6166j.C6167a c6167a = (C6166j.C6167a) obj;
            if (c6167a != null) {
                if (AbstractC4936a.LIZ.LIZ(getAnchorInfo())) {
                    AbstractC4936a LIZ3 = AbstractC4936a.LIZ.LIZ();
                    if (LIZ3 != null) {
                        C80945HvP.LIZ(LIZ3, C4939e.LJIIIZ.LIZ(c6167a), false, 2, (Object) null);
                    }
                } else {
                    this.LJIILLIIL.LIZIZ(c6167a);
                }
                if (!PatchProxy.proxy(new Object[]{c6167a}, this, LIZ, false, 46).isSupported) {
                    if (!C80302Hl2.LIZLLL() && !C80302Hl2.LIZIZ()) {
                        this.LJIIZILJ.LIZ(c6167a);
                    } else if (c6167a.LJIILIIL && c6167a.LJIIJJI) {
                        if (!PatchProxy.proxy(new Object[]{c6167a}, this, LIZ, false, 47).isSupported) {
                            this.LJIIZILJ.LIZ();
                            this.LJJI.LIZ(new C80900Hug(c6167a.LIZIZ, 1, c6167a.LJIIL, C80312HlC.LIZIZ.LIZIZ(c6167a.LJIIL), new VoiceChatRoomAnchorView$playSeatCrownAnim$1(this)));
                            c6167a.LJIILIIL = false;
                            this.LJIJI = true;
                        }
                    } else if (c6167a.LJIILL && c6167a.LJIILJJIL) {
                        if (!PatchProxy.proxy(new Object[]{c6167a}, this, LIZ, false, 48).isSupported) {
                            this.LJIIZILJ.LIZ();
                            this.LJJI.LIZ(new C80900Hug(c6167a.LIZIZ, 2, c6167a.LJIIL, C80312HlC.LIZIZ.LIZJ(), new VoiceChatRoomAnchorView$playSeatPoopAnim$1(this)));
                            c6167a.LJIILL = false;
                            this.LJIJI = true;
                        }
                    } else if (!this.LJIJI) {
                        this.LJIIZILJ.LIZ(c6167a);
                    }
                }
                if (!PatchProxy.proxy(new Object[]{c6167a}, this, LIZ, false, 45).isSupported) {
                    if ((C80302Hl2.LIZ() || C80302Hl2.LIZJ()) && c6167a.LJIILLIIL) {
                        this.LJIILLIIL.LIZLLL(c6167a);
                    }
                    this.LJIILLIIL.LIZJ(c6167a);
                }
                if (!PatchProxy.proxy(new Object[]{c6167a}, this, LIZ, false, 44).isSupported) {
                    if (this.LJIJ.LIZ()) {
                        if (!c6167a.LJIIJJI && !c6167a.LJIILJJIL) {
                            this.LJIJ.setController(null);
                            this.LJIJ.setVisibility(8);
                        }
                    }
                    this.LJIILLIIL.LJFF();
                }
                this.LJJIIJ = c6167a;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Room room;
        User owner;
        AbstractC5137a abstractC5137a;
        String str;
        DataCenter dataCenter;
        C5923dp LIZ2;
        C2WC<Integer> LLFFF;
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 33).isSupported) {
            return;
        }
        AbstractC5015e LIZ3 = AbstractC5015e.LIZIZ.LIZ();
        if (LIZ3 != null && !LIZ3.LJIIJ() && (LIZ2 = C5923dp.LJIIJ.LIZ(this.LJIILIIL, 0L)) != null && (LLFFF = LIZ2.LLFFF()) != null && LLFFF.LIZ().intValue() == 2) {
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_LINK_GUEST_CLEAN_SCREEN_OPTIMIZE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                ALogger.m15795w(this.LJJ, "rejected anchor view click for pure clean mode");
                return;
            }
        }
        if (view != null) {
            int id = view.getId();
            if (id == 2131192784) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 34).isSupported && (dataCenter = this.LJIILIIL) != null) {
                    dataCenter.put("cmd_open_interact_manage_dialog_by_anchor", Boolean.TRUE);
                }
                Room room2 = this.LJIILJJIL;
                Intrinsics.checkNotNull(room2);
                User owner2 = room2.getOwner();
                if (!PatchProxy.proxy(new Object[]{owner2}, this, LIZ, false, 35).isSupported && owner2 != null) {
                    if (((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ() == owner2.getId()) {
                        str = "oneself";
                    } else {
                        str = "anchor";
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("user_id", String.valueOf(owner2.getId()));
                    hashMap.put("user_type", str);
                    hashMap.put("user_cnt", String.valueOf(C79242HLo.LJFF()));
                    C78828H5q.LIZ(hashMap);
                    C4574547f.LIZ().LIZ("livesdk_seat_head_click", hashMap, C8668v.class, Room.class);
                }
            } else if (id == 2131176413 && (room = this.LJIILJJIL) != null && (owner = room.getOwner()) != null && (abstractC5137a = this.LJJIII) != null) {
                abstractC5137a.LIZ(owner);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (r4 == null) goto L67;
     */
    @Override // com.bytedance.android.live.liveinteract.videotalk.battle.j$a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(com.bytedance.android.livesdk.chatroom.model.interact.C6166j r11) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.voicechat.view.VoiceChatRoomAnchorView.LIZ(com.bytedance.android.livesdk.chatroom.model.interact.j):void");
    }

    public final void LIZIZ(boolean z) {
        CharSequence charSequence;
        boolean z2;
        Boolean bool;
        User owner;
        boolean LJFF;
        int i = 0;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 27).isSupported) {
            return;
        }
        if (z) {
            this.LIZLLL.setText(LK5.LIZ(2131584955));
            LK1.LIZJ(this.LJFF);
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
            if (proxy.isSupported) {
                LJFF = ((Boolean) proxy.result).booleanValue();
            } else {
                LJFF = C5056a.LIZJ.LJFF();
            }
            if (!LJFF) {
                C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f7136dE;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                if (Intrinsics.areEqual(c87308Kak.LIZ(), Boolean.FALSE)) {
                    LK1.LIZ((View) this.f26503LJ);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = this.LIZLLL;
        Room room = this.LJIILJJIL;
        if (room != null && (owner = room.getOwner()) != null) {
            charSequence = owner.getNickName();
        } else {
            charSequence = null;
        }
        textView.setText(charSequence);
        LK1.LIZ((View) this.LJFF);
        DataCenter dataCenter = this.LJIILIIL;
        if (dataCenter != null && (bool = (Boolean) dataCenter.get("data_audio_chat_support_send_gift_to_linker", (String) Boolean.FALSE)) != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = false;
        }
        if (!C4891b.LIZJ.m23816LJ()) {
            LinkMicQuickInteractView linkMicQuickInteractView = this.f26503LJ;
            if (!z2) {
                i = 8;
            }
            linkMicQuickInteractView.setVisibility(i);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.battle.j$a
    public final PointF LIZ(PointF pointF, PointF pointF2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pointF, pointF2}, this, LIZ, false, 56);
        if (proxy.isSupported) {
            return (PointF) proxy.result;
        }
        C106862S5w.LIZ(pointF, pointF2);
        return new PointF();
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.battle.j$a
    public final void LIZ(C6166j c6166j, boolean z) {
        String str;
        User LIZ2;
        User LIZ3;
        if (PatchProxy.proxy(new Object[]{c6166j, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 49).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6166j);
        if (!getAnchorEnable()) {
            return;
        }
        C6166j.C6167a c6167a = this.LJJIIJ;
        Long l = null;
        if (c6167a != null && c6167a.LJIILJJIL) {
            StringBuilder sb = new StringBuilder("showRankLastAnimation of ");
            LinkPlayerInfo anchorInfo = getAnchorInfo();
            if (anchorInfo != null && (LIZ3 = anchorInfo.LIZ()) != null) {
                l = Long.valueOf(LIZ3.getId());
            }
            sb.append(l);
            sb.append(LoggerUtil.BLANK_TAG);
            sb.append(this.LJJIIJ);
            ALogger.m15797i("GuestBattleV", sb.toString());
            if (C80302Hl2.LIZ()) {
                this.LJIILLIIL.LIZLLL();
            }
            this.LJIILLIIL.LIZJ(c6167a);
        } else if (this.LJIILLIIL.LJIIIIZZ()) {
            if (c6167a != null && !c6167a.LIZ()) {
                if (c6167a.LJIIJJI) {
                    if (z) {
                        this.LJIILLIIL.LIZJ();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    LinkPlayerInfo anchorInfo2 = getAnchorInfo();
                    if (anchorInfo2 != null && (LIZ2 = anchorInfo2.LIZ()) != null) {
                        l = Long.valueOf(LIZ2.getId());
                    }
                    sb2.append(l);
                    sb2.append(LoggerUtil.BLANK_TAG);
                    if (z) {
                        str = "during transition";
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    sb2.append(" change from last to crown ");
                    sb2.append(this.LJJIIJ);
                    ALogger.m15800e("GuestBattleV", sb2.toString());
                }
            } else {
                this.LJIILLIIL.LIZJ();
            }
        }
        this.LJIILLIIL.LJFF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceChatRoomAnchorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(2102);
        this.LJJ = VoiceChatRoomAnchorView.class.getSimpleName();
        this.LJJIJIIJI = new C80581HpX(this);
        C116971W2r.LIZ(LayoutInflater.from(context), getResourceLayout(), (ViewGroup) this, true);
        Intrinsics.checkNotNullExpressionValue(findViewById(2131166408), "");
        View findViewById = findViewById(2131187057);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZIZ = (HSImageView) findViewById;
        View findViewById2 = findViewById(2131192784);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZJ = (HSImageView) findViewById2;
        View findViewById3 = findViewById(2131189091);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LJJI = (SeatAnimationView) findViewById3;
        View findViewById4 = findViewById(2131172565);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.LIZLLL = (TextView) findViewById4;
        View findViewById5 = findViewById(2131176413);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.f26503LJ = (LinkMicQuickInteractView) findViewById5;
        View findViewById6 = findViewById(2131184932);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.LJFF = (AnchorPauseTipsView) findViewById6;
        View findViewById7 = findViewById(2131194969);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "");
        this.LJI = (PositionNameTv) findViewById7;
        View findViewById8 = findViewById(2131192900);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "");
        this.LJIILLIIL = (GuestBattleQuickInteractView) findViewById8;
        String str = null;
        this.LJIILLIIL.setOnClickListener(C414192aL.LIZ(0L, new C51341(), 1, null));
        View findViewById9 = findViewById(2131192902);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "");
        this.LJIIZILJ = (GuestBattleSeatEffectView) findViewById9;
        View findViewById10 = findViewById(2131176388);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "");
        this.LJIJ = (HSImageView) findViewById10;
        View findViewById11 = findViewById(2131176430);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "");
        this.LJII = (LinearLayout) findViewById11;
        View findViewById12 = findViewById(2131176429);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "");
        this.LJJIFFI = (HSImageView) findViewById12;
        View findViewById13 = findViewById(2131176431);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "");
        this.LJIIIIZZ = (TextView) findViewById13;
        View findViewById14 = findViewById(2131176433);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "");
        this.LJIIIZ = (LinearLayout) findViewById14;
        View findViewById15 = findViewById(2131176432);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "");
        this.LJJII = (HSImageView) findViewById15;
        View findViewById16 = findViewById(2131176434);
        Intrinsics.checkNotNullExpressionValue(findViewById16, "");
        this.LJIIJ = (TextView) findViewById16;
        View findViewById17 = findViewById(2131176428);
        Intrinsics.checkNotNullExpressionValue(findViewById17, "");
        this.LJIIL = (TextView) findViewById17;
        View findViewById18 = findViewById(2131176439);
        Intrinsics.checkNotNullExpressionValue(findViewById18, "");
        this.LJIIJJI = (LottieAnimationView) findViewById18;
        this.LIZJ.setOnClickListener(this);
        this.f26503LJ.setOnClickListener(this);
        this.LJJIJ = new IOU(this.LIZIZ);
        this.LJJIJIIJIL = new C79191HJp<LinkPlayerInfo>() { // from class: com.bytedance.android.live.liveinteract.voicechat.view.VoiceChatRoomAnchorView.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(31853);
            }

            @Override // p003X.C79191HJp, p003X.AbstractC79253HLz
            /* renamed from: a_ */
            public final void mo15637a_(LinkPlayerInfo linkPlayerInfo) {
                if (PatchProxy.proxy(new Object[]{linkPlayerInfo}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                C106862S5w.LIZ(linkPlayerInfo);
                if (linkPlayerInfo.LJIIJJI == 0) {
                    VoiceChatRoomAnchorView.this.LJIL = linkPlayerInfo;
                    if (!linkPlayerInfo.LIZJ() && linkPlayerInfo.LIZIZ()) {
                        HSImageView hSImageView = VoiceChatRoomAnchorView.this.LIZIZ;
                        if (hSImageView != null) {
                            hSImageView.setController(null);
                        }
                        VoiceChatRoomAnchorView.this.LIZ();
                    } else if (!linkPlayerInfo.LIZJ() && !linkPlayerInfo.LIZIZ()) {
                        HSImageView hSImageView2 = VoiceChatRoomAnchorView.this.LIZIZ;
                        if (hSImageView2 != null) {
                            hSImageView2.setController(null);
                        }
                        HSImageView hSImageView3 = VoiceChatRoomAnchorView.this.LIZIZ;
                        if (hSImageView3 != null) {
                            hSImageView3.setVisibility(4);
                        }
                    }
                }
            }
        };
        AnchorPauseTipsView anchorPauseTipsView = this.LJFF;
        anchorPauseTipsView.LIZ();
        AnchorPauseTipsView.LIZ(anchorPauseTipsView, 2130857151, 14.0f, false, 4, null);
        C472014lP.LIZ(anchorPauseTipsView, this.LIZJ.getLayoutParams().width / 2);
        LinkPlayerInfo anchorInfo = getAnchorInfo();
        LIZ(anchorInfo != null ? anchorInfo.LIZJ : str);
        AbstractC78986HBs<LinkPlayerInfo> LIZ2 = HKN.LIZ();
        if (LIZ2 != null) {
            C79191HJp<LinkPlayerInfo> c79191HJp = this.LJJIJIIJIL;
            if (c79191HJp != null) {
                LIZ2.LIZ(c79191HJp);
                MethodCollector.m14707o(2102);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.plantform.base.ILinkUserInfoCenter.BaseCallback<com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo>");
            MethodCollector.m14707o(2102);
            throw nullPointerException;
        }
        MethodCollector.m14707o(2102);
    }

    public /* synthetic */ VoiceChatRoomAnchorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
