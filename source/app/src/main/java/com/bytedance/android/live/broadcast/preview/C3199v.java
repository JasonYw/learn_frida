package com.bytedance.android.live.broadcast.preview;

import android.content.Context;
import android.os.Message;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.p249d.C2815b;
import com.bytedance.android.live.base.model.user.C2852e;
import com.bytedance.android.live.broadcast.AbstractC2929ar;
import com.bytedance.android.live.broadcast.BroadcastService;
import com.bytedance.android.live.broadcast.api.model.C2918r;
import com.bytedance.android.live.broadcast.api.model.C2921x;
import com.bytedance.android.live.broadcast.api.model.CategoryNode;
import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.api.model.PreviewSourceParam;
import com.bytedance.android.live.broadcast.model.C3157c;
import com.bytedance.android.live.broadcast.model.Challenge;
import com.bytedance.android.live.broadcast.model.VideoInteractMode;
import com.bytedance.android.live.broadcast.preview.base.AbstractC3177c;
import com.bytedance.android.live.broadcast.viewmodel.C3258d;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livehostapi.business.depend.hashtag.LiveCircleHashTag;
import com.bytedance.android.livehostapi.business.depend.hashtag.LiveHashTag;
import com.bytedance.android.livesdk.chatroom.model.C6127bf;
import com.bytedance.android.livesdk.config.C7008gl;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.model.XTCategory;
import com.bytedance.android.livesdkapi.AbstractC9586k;
import com.bytedance.android.livesdkapi.config.FastStartLiveConfig;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC413392Xt;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC86821KJb;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C81289I2h;
import p003X.C81909IQd;
import p003X.C86629KBr;
import p003X.C87308Kak;
import p003X.C95452Nio;
import p003X.HNU;
import p003X.KKI;

/* renamed from: com.bytedance.android.live.broadcast.preview.v */
/* loaded from: classes5.dex */
public final class C3199v extends AbstractC3177c implements AbstractC86821KJb {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;

    /* renamed from: LJ */
    public static final C86629KBr f25922LJ = new C86629KBr((byte) 0);
    public final C2WC<LiveMode> LIZJ;
    public final C81289I2h LIZLLL;
    public AbstractC86821KJb LJFF;
    public final C81289I2h LJI;
    public final C81289I2h LJII;
    public final C81289I2h LJIIJJI;
    public final C81289I2h LJIIL;
    public final C81289I2h LJIILIIL;
    public final C81289I2h LJIILJJIL;
    public final C81289I2h LJIILL;
    public final C81289I2h LJIILLIIL;
    public final C81289I2h LJIIZILJ;
    public final C81289I2h LJIJ;
    public final C81289I2h LJIJI;
    public final C81289I2h LJIJJ;
    public final C81289I2h LJIJJLI;
    public final C81289I2h LJIL;
    public final C81289I2h LJJ;
    public final C81289I2h LJJI;
    public final C81289I2h LJJIFFI;
    public final C81289I2h LJJII;
    public final C81289I2h LJJIII;
    public final C81289I2h LJJIIJ;
    public final C81289I2h LJJIIJZLJL;
    public final C81289I2h LJJIIZ;
    public final Lazy LJJIIZI;
    public final C81289I2h LJJIJ;
    public final C81289I2h LJJIJIIJI;
    public final C81289I2h LJJIJIIJIL;
    public final C81289I2h LJJIJIL;
    public final C81289I2h LJJIJL;
    public final C81289I2h LJJIJLIJ;
    public final C81289I2h LJJIL;
    public final C81289I2h LJJIZ;
    public final C81289I2h LJJJ;
    public final C81289I2h LJJJI;
    public final C81289I2h LJJJIL;
    public final C81289I2h LJJJJ;
    public final C81289I2h LJJJJI;
    public final C81289I2h LJJJJIZL;
    public final C81289I2h LJJJJJ;
    public final C81289I2h LJJJJJL;
    public final C81289I2h LJJJJL;
    public final C81289I2h LJJJJLI;
    public final C81289I2h LJJJJLL;
    public final C81289I2h LJJJJZ;
    public final C81289I2h LJJJJZI;
    public final C81289I2h LJJJLIIL;
    public final C81289I2h LJJJLL;
    public final C81289I2h LJJJLZIJ;
    public final C81289I2h LJJJZ;
    public final C81289I2h LJJL;
    public final C81289I2h LJJLI;
    public final C81289I2h LJJLIIIIJ;
    public final C81289I2h LJJLIIIJ;
    public final C81289I2h LJJLIIIJILLIZJL;
    public final C81289I2h LJJLIIIJJI;

    static {
        Covode.recordClassIndex(17449);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C3199v.class, "obsAuditStatusInfo", "getObsAuditStatusInfo()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(C3199v.class, "locationChoose", "getLocationChoose()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(C3199v.class, "currentGame", "getCurrentGame()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl3);
        PropertyReference1Impl propertyReference1Impl4 = new PropertyReference1Impl(C3199v.class, "title", "getTitle()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl4);
        PropertyReference1Impl propertyReference1Impl5 = new PropertyReference1Impl(C3199v.class, "cover", "getCover()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl5);
        PropertyReference1Impl propertyReference1Impl6 = new PropertyReference1Impl(C3199v.class, "coverStatus", "getCoverStatus()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl6);
        PropertyReference1Impl propertyReference1Impl7 = new PropertyReference1Impl(C3199v.class, "roomTag", "getRoomTag()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl7);
        PropertyReference1Impl propertyReference1Impl8 = new PropertyReference1Impl(C3199v.class, "xtCategory", "getXtCategory()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl8);
        PropertyReference1Impl propertyReference1Impl9 = new PropertyReference1Impl(C3199v.class, "dyCategory", "getDyCategory()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl9);
        PropertyReference1Impl propertyReference1Impl10 = new PropertyReference1Impl(C3199v.class, "poiInfo", "getPoiInfo()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl10);
        PropertyReference1Impl propertyReference1Impl11 = new PropertyReference1Impl(C3199v.class, "gameOrientation", "getGameOrientation()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl11);
        PropertyReference1Impl propertyReference1Impl12 = new PropertyReference1Impl(C3199v.class, "gameCategory", "getGameCategory()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl12);
        PropertyReference1Impl propertyReference1Impl13 = new PropertyReference1Impl(C3199v.class, "isCommodity", "isCommodity()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl13);
        PropertyReference1Impl propertyReference1Impl14 = new PropertyReference1Impl(C3199v.class, "verifyParams", "getVerifyParams()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl14);
        PropertyReference1Impl propertyReference1Impl15 = new PropertyReference1Impl(C3199v.class, "sourceParams", "getSourceParams()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl15);
        PropertyReference1Impl propertyReference1Impl16 = new PropertyReference1Impl(C3199v.class, "sourceParamsV2", "getSourceParamsV2()Lcom/bytedance/live/datacontext/IConstantNullable;", 0);
        Reflection.property1(propertyReference1Impl16);
        PropertyReference1Impl propertyReference1Impl17 = new PropertyReference1Impl(C3199v.class, "mAutoCover", "getMAutoCover()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl17);
        PropertyReference1Impl propertyReference1Impl18 = new PropertyReference1Impl(C3199v.class, "coverUpload", "getCoverUpload()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl18);
        PropertyReference1Impl propertyReference1Impl19 = new PropertyReference1Impl(C3199v.class, "challenge", "getChallenge()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl19);
        PropertyReference1Impl propertyReference1Impl20 = new PropertyReference1Impl(C3199v.class, "liveCircle", "getLiveCircle()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl20);
        PropertyReference1Impl propertyReference1Impl21 = new PropertyReference1Impl(C3199v.class, "gameChallenge", "getGameChallenge()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl21);
        PropertyReference1Impl propertyReference1Impl22 = new PropertyReference1Impl(C3199v.class, "audioInteractModeViewModel", "getAudioInteractModeViewModel()Lcom/bytedance/live/datacontext/IConstantNullable;", 0);
        Reflection.property1(propertyReference1Impl22);
        PropertyReference1Impl propertyReference1Impl23 = new PropertyReference1Impl(C3199v.class, "previewStreamInfo", "getPreviewStreamInfo()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl23);
        PropertyReference1Impl propertyReference1Impl24 = new PropertyReference1Impl(C3199v.class, "startLiveStatus", "getStartLiveStatus()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl24);
        PropertyReference1Impl propertyReference1Impl25 = new PropertyReference1Impl(C3199v.class, "room", "getRoom()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl25);
        PropertyReference1Impl propertyReference1Impl26 = new PropertyReference1Impl(C3199v.class, "banUserInfoResult", "getBanUserInfoResult()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl26);
        PropertyReference1Impl propertyReference1Impl27 = new PropertyReference1Impl(C3199v.class, "continueRoom", "getContinueRoom()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl27);
        PropertyReference1Impl propertyReference1Impl28 = new PropertyReference1Impl(C3199v.class, "customGameName", "getCustomGameName()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl28);
        PropertyReference1Impl propertyReference1Impl29 = new PropertyReference1Impl(C3199v.class, "linkMicScene", "getLinkMicScene()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl29);
        PropertyReference1Impl propertyReference1Impl30 = new PropertyReference1Impl(C3199v.class, "videoLinkMicScene", "getVideoLinkMicScene()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl30);
        PropertyReference1Impl propertyReference1Impl31 = new PropertyReference1Impl(C3199v.class, "playModes", "getPlayModes()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl31);
        PropertyReference1Impl propertyReference1Impl32 = new PropertyReference1Impl(C3199v.class, "userType", "getUserType()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl32);
        PropertyReference1Impl propertyReference1Impl33 = new PropertyReference1Impl(C3199v.class, "resolutionKey", "getResolutionKey()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl33);
        PropertyReference1Impl propertyReference1Impl34 = new PropertyReference1Impl(C3199v.class, "starGraphTaskArgs", "getStarGraphTaskArgs()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl34);
        PropertyReference1Impl propertyReference1Impl35 = new PropertyReference1Impl(C3199v.class, "propsActivityType", "getPropsActivityType()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl35);
        PropertyReference1Impl propertyReference1Impl36 = new PropertyReference1Impl(C3199v.class, "selectedStartLiveVisibility", "getSelectedStartLiveVisibility()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl36);
        PropertyReference1Impl propertyReference1Impl37 = new PropertyReference1Impl(C3199v.class, "hasVIP", "getHasVIP()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl37);
        PropertyReference1Impl propertyReference1Impl38 = new PropertyReference1Impl(C3199v.class, "vipCount", "getVipCount()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl38);
        PropertyReference1Impl propertyReference1Impl39 = new PropertyReference1Impl(C3199v.class, "welfareProjectId", "getWelfareProjectId()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl39);
        PropertyReference1Impl propertyReference1Impl40 = new PropertyReference1Impl(C3199v.class, "groupPurchasePermission", "getGroupPurchasePermission()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl40);
        PropertyReference1Impl propertyReference1Impl41 = new PropertyReference1Impl(C3199v.class, "groupPurchaseCount", "getGroupPurchaseCount()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl41);
        PropertyReference1Impl propertyReference1Impl42 = new PropertyReference1Impl(C3199v.class, "pcLivePermissionStatus", "getPcLivePermissionStatus()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl42);
        PropertyReference1Impl propertyReference1Impl43 = new PropertyReference1Impl(C3199v.class, "pcLivePermissionButtonText", "getPcLivePermissionButtonText()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl43);
        PropertyReference1Impl propertyReference1Impl44 = new PropertyReference1Impl(C3199v.class, "welfareProjectCardShowFrequency", "getWelfareProjectCardShowFrequency()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl44);
        PropertyReference1Impl propertyReference1Impl45 = new PropertyReference1Impl(C3199v.class, "paidLiveType", "getPaidLiveType()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl45);
        PropertyReference1Impl propertyReference1Impl46 = new PropertyReference1Impl(C3199v.class, "paidLiveStatus", "getPaidLiveStatus()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl46);
        PropertyReference1Impl propertyReference1Impl47 = new PropertyReference1Impl(C3199v.class, "ticketId", "getTicketId()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl47);
        PropertyReference1Impl propertyReference1Impl48 = new PropertyReference1Impl(C3199v.class, "paidLiveCreateRights", "getPaidLiveCreateRights()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl48);
        PropertyReference1Impl propertyReference1Impl49 = new PropertyReference1Impl(C3199v.class, "ownerIdOfSellTicket", "getOwnerIdOfSellTicket()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl49);
        PropertyReference1Impl propertyReference1Impl50 = new PropertyReference1Impl(C3199v.class, "ticketGenReplay", "getTicketGenReplay()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl50);
        PropertyReference1Impl propertyReference1Impl51 = new PropertyReference1Impl(C3199v.class, "paidLiveCover", "getPaidLiveCover()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl51);
        PropertyReference1Impl propertyReference1Impl52 = new PropertyReference1Impl(C3199v.class, "paidLiveTitle", "getPaidLiveTitle()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl52);
        PropertyReference1Impl propertyReference1Impl53 = new PropertyReference1Impl(C3199v.class, "desireId", "getDesireId()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl53);
        PropertyReference1Impl propertyReference1Impl54 = new PropertyReference1Impl(C3199v.class, "selectedVideoMode", "getSelectedVideoMode()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl54);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3, propertyReference1Impl4, propertyReference1Impl5, propertyReference1Impl6, propertyReference1Impl7, propertyReference1Impl8, propertyReference1Impl9, propertyReference1Impl10, propertyReference1Impl11, propertyReference1Impl12, propertyReference1Impl13, propertyReference1Impl14, propertyReference1Impl15, propertyReference1Impl16, propertyReference1Impl17, propertyReference1Impl18, propertyReference1Impl19, propertyReference1Impl20, propertyReference1Impl21, propertyReference1Impl22, propertyReference1Impl23, propertyReference1Impl24, propertyReference1Impl25, propertyReference1Impl26, propertyReference1Impl27, propertyReference1Impl28, propertyReference1Impl29, propertyReference1Impl30, propertyReference1Impl31, propertyReference1Impl32, propertyReference1Impl33, propertyReference1Impl34, propertyReference1Impl35, propertyReference1Impl36, propertyReference1Impl37, propertyReference1Impl38, propertyReference1Impl39, propertyReference1Impl40, propertyReference1Impl41, propertyReference1Impl42, propertyReference1Impl43, propertyReference1Impl44, propertyReference1Impl45, propertyReference1Impl46, propertyReference1Impl47, propertyReference1Impl48, propertyReference1Impl49, propertyReference1Impl50, propertyReference1Impl51, propertyReference1Impl52, propertyReference1Impl53, propertyReference1Impl54};
    }

    /* renamed from: LJ */
    public final C2WC<C2918r> m15891LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJI.LIZ(this, LIZIZ[0]));
    }

    public final C2WC<Boolean> LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJII.LIZ(this, LIZIZ[1]));
    }

    public final C2WC<Game> LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIJJI.LIZ(this, LIZIZ[2]));
    }

    public final C2WC<String> LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIL.LIZ(this, LIZIZ[3]));
    }

    public final C2WC<C2852e> LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIILIIL.LIZ(this, LIZIZ[4]));
    }

    public final C2WC<Integer> LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIILJJIL.LIZ(this, LIZIZ[5]));
    }

    public final C2WC<C6127bf> LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIILL.LIZ(this, LIZIZ[6]));
    }

    public final C2WC<XTCategory> LJIIJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIILLIIL.LIZ(this, LIZIZ[7]));
    }

    public final C2WC<CategoryNode> LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIZILJ.LIZ(this, LIZIZ[8]));
    }

    public final C2WC<C2815b> LJIILIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIJ.LIZ(this, LIZIZ[9]));
    }

    public final C2WC<Integer> LJIILJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIJI.LIZ(this, LIZIZ[10]));
    }

    public final C2WC<CategoryNode> LJIILL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 13);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIJJ.LIZ(this, LIZIZ[11]));
    }

    public final C2WC<HashMap<String, String>> LJIILLIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 15);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIJJLI.LIZ(this, LIZIZ[13]));
    }

    public final C2WC<String> LJIIZILJ() {
        return (C2WC) this.LJIL.LIZ(this, LIZIZ[14]);
    }

    public final AbstractC413392Xt<PreviewSourceParam> LJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        return (AbstractC413392Xt) (proxy.isSupported ? proxy.result : this.LJJ.LIZ(this, LIZIZ[15]));
    }

    public final C2WC<Long> LJIJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 17);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJI.LIZ(this, LIZIZ[16]));
    }

    public final C2WC<Boolean> LJIJJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 18);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJIFFI.LIZ(this, LIZIZ[17]));
    }

    public final C2WD<Challenge> LJIJJLI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 20);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJJII.LIZ(this, LIZIZ[18]));
    }

    public final C2WD<LiveCircleHashTag> LJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 21);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJJIII.LIZ(this, LIZIZ[19]));
    }

    public final C2WD<Challenge> LJJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 22);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJJIIJ.LIZ(this, LIZIZ[20]));
    }

    public final AbstractC413392Xt<C3258d> LJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 23);
        return (AbstractC413392Xt) (proxy.isSupported ? proxy.result : this.LJJIIJZLJL.LIZ(this, LIZIZ[21]));
    }

    public final C2WD<C2921x> LJJIFFI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 24);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJJIIZ.LIZ(this, LIZIZ[22]));
    }

    public final MutableLiveData<HashMap<String, String>> LJJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 25);
        return (MutableLiveData) (proxy.isSupported ? proxy.result : this.LJJIIZI.mo27335getValue());
    }

    public final C2WC<Message> LJJIII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 26);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJIJ.LIZ(this, LIZIZ[23]));
    }

    public final C2WC<Room> LJJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 27);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJIJIIJI.LIZ(this, LIZIZ[24]));
    }

    public final C2WC<C5176i<C3157c>> LJJIIJZLJL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 28);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJIJIIJIL.LIZ(this, LIZIZ[25]));
    }

    public final C2WC<Room> LJJIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 29);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJIJIL.LIZ(this, LIZIZ[26]));
    }

    public final C2WC<String> LJJIIZI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 30);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJIJL.LIZ(this, LIZIZ[27]));
    }

    public final C2WC<Integer> LJJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 31);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJIJLIJ.LIZ(this, LIZIZ[28]));
    }

    public final C2WC<Integer> LJJIJIIJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 32);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJIL.LIZ(this, LIZIZ[29]));
    }

    public final C2WD<ArrayList<Integer>> LJJIJIIJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 33);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJJIZ.LIZ(this, LIZIZ[30]));
    }

    public final C2WD<String> LJJIJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 34);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJJJ.LIZ(this, LIZIZ[31]));
    }

    public final C2WC<String> LJJIJL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 35);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJJI.LIZ(this, LIZIZ[32]));
    }

    public final C2WC<C3200b> LJJIJLIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 36);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJJIL.LIZ(this, LIZIZ[33]));
    }

    public final C2WC<Integer> LJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 37);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJJJ.LIZ(this, LIZIZ[34]));
    }

    public final C2WC<Integer> LJJIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 38);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJJJI.LIZ(this, LIZIZ[35]));
    }

    public final C2WC<Boolean> LJJJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 39);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJJJIZL.LIZ(this, LIZIZ[36]));
    }

    public final C2WC<Long> LJJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 40);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJJJJ.LIZ(this, LIZIZ[37]));
    }

    public final C2WC<Long> LJJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 41);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJJJJL.LIZ(this, LIZIZ[38]));
    }

    public final C2WC<String> LJJJJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 42);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJJJL.LIZ(this, LIZIZ[39]));
    }

    public final C2WC<Integer> LJJJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 43);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJJJLI.LIZ(this, LIZIZ[40]));
    }

    public final C2WC<Integer> LJJJJIZL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 44);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJJJLL.LIZ(this, LIZIZ[41]));
    }

    public final C2WC<String> LJJJJJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 45);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJJJZ.LIZ(this, LIZIZ[42]));
    }

    public final C2WC<Long> LJJJJJL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 46);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJJJZI.LIZ(this, LIZIZ[43]));
    }

    public final C2WC<Integer> LJJJJL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 47);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJJLIIL.LIZ(this, LIZIZ[44]));
    }

    public final C2WC<Integer> LJJJJLI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 48);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJJLL.LIZ(this, LIZIZ[45]));
    }

    public final C2WC<Long> LJJJJLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 49);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJJLZIJ.LIZ(this, LIZIZ[46]));
    }

    public final C2WC<ArrayList<Integer>> LJJJJZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 50);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJJZ.LIZ(this, LIZIZ[47]));
    }

    public final C2WC<Long> LJJJJZI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 51);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJL.LIZ(this, LIZIZ[48]));
    }

    public final C2WD<Boolean> LJJJLIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 52);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJJLI.LIZ(this, LIZIZ[49]));
    }

    public final C2WD<C2852e> LJJJLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 53);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJJLIIIIJ.LIZ(this, LIZIZ[50]));
    }

    public final C2WD<String> LJJJLZIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 54);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJJLIIIJ.LIZ(this, LIZIZ[51]));
    }

    public final C2WC<Long> LJJJZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 55);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJLIIIJILLIZJL.LIZ(this, LIZIZ[52]));
    }

    public final C2WC<VideoInteractMode> LJJL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 56);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJLIIIJJI.LIZ(this, LIZIZ[53]));
    }

    @Override // p003X.AbstractC86821KJb
    public final void LIZ() {
        AbstractC86821KJb abstractC86821KJb;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 60).isSupported && (abstractC86821KJb = this.LJFF) != null) {
            abstractC86821KJb.LIZ();
        }
    }

    @Override // p003X.AbstractC86821KJb
    public final void LIZIZ() {
        AbstractC86821KJb abstractC86821KJb;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 61).isSupported && (abstractC86821KJb = this.LJFF) != null) {
            abstractC86821KJb.LIZIZ();
        }
    }

    @Override // p003X.AbstractC86821KJb
    public final void LIZJ() {
        AbstractC86821KJb abstractC86821KJb;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 62).isSupported && (abstractC86821KJb = this.LJFF) != null) {
            abstractC86821KJb.LIZJ();
        }
    }

    @Override // p003X.AbstractC86821KJb
    public final void LIZLLL() {
        AbstractC86821KJb abstractC86821KJb;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 63).isSupported && (abstractC86821KJb = this.LJFF) != null) {
            abstractC86821KJb.LIZLLL();
        }
    }

    public final int LJJLI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 57);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.LLZL;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Integer LIZ2 = c87308Kak.LIZ();
        if (LIZ2 != null && LIZ2.intValue() == 2) {
            return 3;
        }
        if (LIZ2 != null && LIZ2.intValue() != 3 && LIZ2.intValue() == 1) {
            C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.LLZLI;
            Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
            Boolean LIZ3 = c87308Kak2.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
            if (!LIZ3.booleanValue()) {
                return 2;
            }
        }
        return 1;
    }

    public final Observable<String> LJJLIIIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 66);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        if (C95452Nio.m23163LJ().LJIJJ() == null) {
            return null;
        }
        KKI kki = new KKI();
        kki.LIZJ("");
        kki.LIZIZ(false);
        kki.LIZLLL("live_take");
        kki.LIZ((LiveHashTag) null);
        return C95452Nio.m23163LJ().LJIJJ().getRecommendHashTag(kki.LIZ());
    }

    public C3199v() {
        AbstractC86821KJb abstractC86821KJb;
        C2WC<LiveMode> c2wc;
        AbstractC2929ar broadcastStartLiveService = new BroadcastService().getBroadcastStartLiveService();
        if (broadcastStartLiveService != null) {
            abstractC86821KJb = broadcastStartLiveService.LIZ(this);
        } else {
            abstractC86821KJb = null;
        }
        this.LJFF = abstractC86821KJb;
        C3180k LIZ2 = C3180k.LIZLLL.LIZ();
        if (LIZ2 != null) {
            c2wc = LIZ2.LIZ();
        } else {
            c2wc = null;
        }
        this.LIZJ = c2wc;
        this.LJI = C81909IQd.LIZ(this, new C2918r(), null, 2, null);
        this.LJII = C81909IQd.LIZ(this, Boolean.FALSE, null, 2, null);
        this.LJIIJJI = C81909IQd.LIZ(this, new Game(), null, 2, null);
        this.LJIIL = C81909IQd.LIZ(this, "", null, 2, null);
        this.LJIILIIL = C81909IQd.LIZ(this, new C2852e(), null, 2, null);
        this.LJIILJJIL = C81909IQd.LIZ(this, 2, null, 2, null);
        this.LJIILL = C81909IQd.LIZ(this, new C6127bf(), null, 2, null);
        this.LJIILLIIL = C81909IQd.LIZ(this, new XTCategory(), null, 2, null);
        this.LJIIZILJ = C81909IQd.LIZ(this, new CategoryNode(), null, 2, null);
        this.LJIJ = C81909IQd.LIZ(this, new C2815b(), null, 2, null);
        this.LJIJI = C81909IQd.LIZ(this, 1, null, 2, null);
        this.LJIJJ = C81909IQd.LIZ(this, new CategoryNode(), null, 2, null);
        this.LIZLLL = C81909IQd.LIZ(this, Boolean.FALSE, null, 2, null);
        this.LJIJJLI = C81909IQd.LIZ(this, new HashMap(), null, 2, null);
        this.LJIL = C81909IQd.LIZ(this, new String(), null, 2, null);
        this.LJJ = HNU.LIZ(this, null, 1, null);
        this.LJJI = C81909IQd.LIZ(this, 0L, null, 2, null);
        this.LJJIFFI = C81909IQd.LIZ(this, Boolean.FALSE, null, 2, null);
        LazyKt__LazyJVMKt.lazy(StartLiveViewModel$autoParams$2.INSTANCE);
        this.LJJII = C81909IQd.LIZ(this, null, 1, null);
        this.LJJIII = C81909IQd.LIZ(this, null, 1, null);
        this.LJJIIJ = C81909IQd.LIZ(this, null, 1, null);
        this.LJJIIJZLJL = HNU.LIZ(this, null, 1, null);
        this.LJJIIZ = C81909IQd.LIZ(this, null, 1, null);
        this.LJJIIZI = LazyKt__LazyJVMKt.lazy(StartLiveViewModel$liveBroadcastParams$2.INSTANCE);
        this.LJJIJ = C81909IQd.LIZ(this, new Message(), null, 2, null);
        this.LJJIJIIJI = C81909IQd.LIZ(this, new Room(), null, 2, null);
        this.LJJIJIIJIL = C81909IQd.LIZ(this, new C5176i(), null, 2, null);
        this.LJJIJIL = C81909IQd.LIZ(this, new Room(), null, 2, null);
        this.LJJIJL = C81909IQd.LIZ(this, "", null, 2, null);
        this.LJJIJLIJ = C81909IQd.LIZ(this, 0, null, 2, null);
        this.LJJIL = C81909IQd.LIZ(this, 0, null, 2, null);
        this.LJJIZ = C81909IQd.LIZ(this, null, 1, null);
        this.LJJJ = C81909IQd.LIZ(this, null, 1, null);
        this.LJJJI = C81909IQd.LIZ(this, "", null, 2, null);
        this.LJJJIL = C81909IQd.LIZ(this, new C3200b(false, MapsKt__MapsKt.emptyMap()), null, 2, null);
        this.LJJJJ = C81909IQd.LIZ(this, 0, null, 2, null);
        this.LJJJJI = C81909IQd.LIZ(this, -1, null, 2, null);
        this.LJJJJIZL = C81909IQd.LIZ(this, Boolean.FALSE, null, 2, null);
        this.LJJJJJ = C81909IQd.LIZ(this, 0L, null, 2, null);
        this.LJJJJJL = C81909IQd.LIZ(this, 0L, null, 2, null);
        this.LJJJJL = C81909IQd.LIZ(this, "2", null, 2, null);
        this.LJJJJLI = C81909IQd.LIZ(this, 0, null, 2, null);
        this.LJJJJLL = C81909IQd.LIZ(this, 0, null, 2, null);
        this.LJJJJZ = C81909IQd.LIZ(this, "", null, 2, null);
        SettingKey<C7008gl> settingKey = LiveConfigSettingKeys.LIVE_WELFARE_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        this.LJJJJZI = C81909IQd.LIZ(this, Long.valueOf(settingKey.getValue().LIZLLL), null, 2, null);
        this.LJJJLIIL = C81909IQd.LIZ(this, 0, null, 2, null);
        this.LJJJLL = C81909IQd.LIZ(this, -1, null, 2, null);
        this.LJJJLZIJ = C81909IQd.LIZ(this, 0L, null, 2, null);
        this.LJJJZ = C81909IQd.LIZ(this, new ArrayList(), null, 2, null);
        this.LJJL = C81909IQd.LIZ(this, -1L, null, 2, null);
        this.LJJLI = C81909IQd.LIZ(this, null, 1, null);
        this.LJJLIIIIJ = C81909IQd.LIZ(this, null, 1, null);
        this.LJJLIIIJ = C81909IQd.LIZ(this, null, 1, null);
        this.LJJLIIIJILLIZJL = C81909IQd.LIZ(this, 0L, null, 2, null);
        this.LJJLIIIJJI = C81909IQd.LIZ(this, VideoInteractMode.NONE, null, 2, null);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.v$b */
    /* loaded from: classes3.dex */
    public static final class C3200b {
        public static ChangeQuickRedirect LIZ;
        public final boolean LIZIZ;
        public final Map<String, String> LIZJ;

        static {
            Covode.recordClassIndex(17451);
        }

        private Object[] LIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
            return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Boolean.valueOf(this.LIZIZ), this.LIZJ};
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof C3200b) {
                return C106862S5w.LIZ(((C3200b) obj).LIZ(), LIZ());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("StartLiveViewModel$StarGraphArgs:%s,%s", LIZ());
        }

        public C3200b(boolean z, Map<String, String> map) {
            C106862S5w.LIZ(map);
            this.LIZIZ = z;
            this.LIZJ = map;
        }
    }

    @Override // p003X.AbstractC86821KJb
    public final void LIZ(Context context, C3181o c3181o) {
        if (PatchProxy.proxy(new Object[]{context, c3181o}, this, LIZ, false, 58).isSupported) {
            return;
        }
        C106862S5w.LIZ(context, c3181o);
        AbstractC86821KJb abstractC86821KJb = this.LJFF;
        if (abstractC86821KJb != null) {
            abstractC86821KJb.LIZ(context, c3181o);
        }
    }

    @Override // p003X.AbstractC86821KJb
    public final void LIZ(Room room, AbstractC9586k.AbstractC9587a abstractC9587a) {
        if (PatchProxy.proxy(new Object[]{room, abstractC9587a}, this, LIZ, false, 65).isSupported) {
            return;
        }
        C106862S5w.LIZ(room);
        AbstractC86821KJb abstractC86821KJb = this.LJFF;
        if (abstractC86821KJb != null) {
            abstractC86821KJb.LIZ(room, abstractC9587a);
        }
    }

    @Override // p003X.AbstractC86821KJb
    public final void LIZ(HashMap<String, String> hashMap, AbstractC9586k.AbstractC9587a abstractC9587a) {
        if (PatchProxy.proxy(new Object[]{hashMap, abstractC9587a}, this, LIZ, false, 64).isSupported) {
            return;
        }
        C106862S5w.LIZ(hashMap, abstractC9587a);
        AbstractC86821KJb abstractC86821KJb = this.LJFF;
        if (abstractC86821KJb != null) {
            abstractC86821KJb.LIZ(hashMap, abstractC9587a);
        }
    }

    @Override // p003X.AbstractC86821KJb
    public final void LIZ(Context context, C3181o c3181o, ArrayList<AbstractC9586k> arrayList, FastStartLiveConfig fastStartLiveConfig) {
        if (PatchProxy.proxy(new Object[]{context, c3181o, arrayList, fastStartLiveConfig}, this, LIZ, false, 59).isSupported) {
            return;
        }
        C106862S5w.LIZ(context, c3181o);
        AbstractC86821KJb abstractC86821KJb = this.LJFF;
        if (abstractC86821KJb != null) {
            abstractC86821KJb.LIZ(context, c3181o, arrayList, fastStartLiveConfig);
        }
    }
}
