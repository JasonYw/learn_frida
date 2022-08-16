package com.bytedance.android.live.broadcast.download;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.broadcast.api.gamepromote.C2888a;
import com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.utils.NetworkUtils;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.C6831an;
import com.bytedance.android.livesdk.config.C6837at;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.user.C9284h;
import com.bytedance.android.livesdk.utils.LiveNetworkBroadcastReceiver;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C440033av;
import p003X.C87010KQi;
import p003X.C89121L9n;
import p003X.C89235LDx;
import p003X.C89252LEo;
import p003X.IQV;
import p003X.LE1;
import p003X.LE4;
import p003X.LE7;
import p003X.LEB;
import p003X.LEZ;
import p003X.LF1;
import p003X.LFU;
import p003X.LGQ;
import p003X.LK5;

/* loaded from: classes5.dex */
public class DownloadView extends ConstraintLayout implements AbstractC2889a {
    public static ChangeQuickRedirect LIZ;
    public static final TokenCert LJJI = TokenCert.Companion.with("bpea-live_game_download_network");
    public boolean LIZIZ;
    public CompositeDisposable LIZJ;
    public NetworkUtils.NetworkType LIZLLL;

    /* renamed from: LJ */
    public C3002c f25815LJ;
    public Map<String, String> LJFF;
    public TextView LJI;
    public ProgressBar LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public String LJIIZILJ;
    public int LJIJ;
    public AbstractC2889a LJIJI;
    public LFU LJIJJ;
    public final C2888a LJIJJLI;
    public final LiveNetworkBroadcastReceiver LJIL;
    public final LiveNetworkBroadcastReceiver.AbstractC9289a LJJ;

    public DownloadView(Context context) {
        this(context, null, 0, 6, null);
    }

    public DownloadView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    public void LIZJ(int i) {
    }

    public int getLayoutId() {
        return 2131699339;
    }

    public final C2888a getDataContext() {
        return this.LJIJJLI;
    }

    public final ProgressBar getDownloadPb() {
        return this.LJII;
    }

    public final TextView getDownloadTv() {
        return this.LJI;
    }

    public final int getDownloadedText() {
        return this.LJIIL;
    }

    public final int getDownloadingBg() {
        return this.LJIIIIZZ;
    }

    public final int getErrorText() {
        return this.LJIILJJIL;
    }

    public final int getInstalledText() {
        return this.LJIILIIL;
    }

    public final C3002c getMDownloadInfo() {
        return this.f25815LJ;
    }

    public final LFU getMGetDownloadCountListener() {
        return this.LJIJJ;
    }

    public final AbstractC2889a getMListener() {
        return this.LJIJI;
    }

    public final int getPauseText() {
        return this.LJIIJJI;
    }

    public final String getProgressText() {
        return this.LJIIZILJ;
    }

    public final int getReadyBg() {
        return this.LJIIIZ;
    }

    public final int getReadyText() {
        return this.LJIIJ;
    }

    public final int getUpdateText() {
        return this.LJIILLIIL;
    }

    public final int getViewToken() {
        return this.LJIJ;
    }

    public final int getWaitWifiText() {
        return this.LJIILL;
    }

    static {
        Covode.recordClassIndex(15504);
    }

    private final void LJII() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        LJI();
        C3002c c3002c = this.f25815LJ;
        if (c3002c != null) {
            c3002c.LJJIJIL = false;
        }
        LIZ(getContext(), this.f25815LJ);
    }

    private final int getDetailPageCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 25);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C3002c c3002c = this.f25815LJ;
        if (c3002c != null && c3002c.LJIIIIZZ) {
            return 902;
        }
        SettingKey<Integer> settingKey = LiveSettingKeys.LIVE_GAME_PROMOTE_DETAIL_STYLE_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Integer value = settingKey.getValue();
        if (value != null && value.intValue() == 0) {
            return 302;
        }
        return 305;
    }

    @Override // com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    public void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        AbstractC2889a abstractC2889a = this.LJIJI;
        if (abstractC2889a != null) {
            abstractC2889a.LIZ();
        }
        setText(LK5.LIZ(this.LJIIJ));
        TextView textView = this.LJI;
        if (textView != null) {
            textView.setBackgroundResource(this.LJIIIZ);
        }
        ProgressBar progressBar = this.LJII;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    public void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            return;
        }
        AbstractC2889a abstractC2889a = this.LJIJI;
        if (abstractC2889a != null) {
            abstractC2889a.LIZLLL();
        }
        setText(LK5.LIZ(this.LJIILLIIL));
        TextView textView = this.LJI;
        if (textView != null) {
            textView.setBackgroundResource(this.LJIIIZ);
        }
        ProgressBar progressBar = this.LJII;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    /* renamed from: LJ */
    public void mo15904LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            return;
        }
        AbstractC2889a abstractC2889a = this.LJIJI;
        if (abstractC2889a != null) {
            abstractC2889a.mo15904LJ();
        }
        setText(LK5.LIZ(this.LJIIJ));
        TextView textView = this.LJI;
        if (textView != null) {
            textView.setBackgroundResource(this.LJIIIZ);
        }
        ProgressBar progressBar = this.LJII;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    public final void LJI() {
        C3002c c3002c;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported && LGQ.LIZJ()) {
            C3002c c3002c2 = this.f25815LJ;
            if ((c3002c2 != null && c3002c2.LJJIJL == 0) || ((c3002c = this.f25815LJ) != null && c3002c.LJJIJL == 2)) {
                LE1 le1 = LE1.LJII;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                le1.LIZJ(context, this.f25815LJ);
            }
        }
    }

    public final Integer getDownloadStatus() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 13);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        C3002c c3002c = this.f25815LJ;
        if (c3002c != null) {
            return Integer.valueOf(c3002c.LJJIJL);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 27).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        if (!this.LIZJ.isDisposed()) {
            this.LIZJ.dispose();
        }
        this.LJIL.LIZ();
        this.LJIL.LIZ(this.LJJ);
    }

    @Override // com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    public void LIZIZ() {
        String str;
        Set<String> set;
        Set<String> set2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        AbstractC2889a abstractC2889a = this.LJIJI;
        if (abstractC2889a != null) {
            abstractC2889a.LIZIZ();
        }
        setText(LK5.LIZ(this.LJIIL));
        ProgressBar progressBar = this.LJII;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        TextView textView = this.LJI;
        if (textView != null) {
            textView.setBackgroundResource(this.LJIIIZ);
        }
        C3002c c3002c = this.f25815LJ;
        if (c3002c != null && (str = c3002c.LJIIJ) != null && str.length() > 0) {
            C2888a c2888a = this.LJIJJLI;
            if (c2888a != null && (set2 = c2888a.LJFF) != null) {
                set2.remove(str);
            }
            C2888a c2888a2 = this.LJIJJLI;
            if (c2888a2 != null && (set = c2888a2.LJI) != null) {
                set.add(str);
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    public void LIZJ() {
        String str;
        C2888a c2888a;
        Set<String> set;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        AbstractC2889a abstractC2889a = this.LJIJI;
        if (abstractC2889a != null) {
            abstractC2889a.LIZJ();
        }
        setText(LK5.LIZ(this.LJIILIIL));
        ProgressBar progressBar = this.LJII;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        TextView textView = this.LJI;
        if (textView != null) {
            textView.setBackgroundResource(this.LJIIIZ);
        }
        C3002c c3002c = this.f25815LJ;
        if (c3002c != null && (str = c3002c.LJIIJ) != null && str.length() > 0 && (c2888a = this.LJIJJLI) != null && (set = c2888a.LJII) != null) {
            set.add(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0349  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LJFF() {
        /*
            Method dump skipped, instructions count: 1550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.download.DownloadView.LJFF():void");
    }

    public final void setDownloadInfo(C3002c c3002c) {
        this.f25815LJ = c3002c;
    }

    public final void setDownloadPb(ProgressBar progressBar) {
        this.LJII = progressBar;
    }

    public final void setDownloadTv(TextView textView) {
        this.LJI = textView;
    }

    public final void setDownloadedText(int i) {
        this.LJIIL = i;
    }

    public final void setDownloadingBg(int i) {
        this.LJIIIIZZ = i;
    }

    public final void setErrorText(int i) {
        this.LJIILJJIL = i;
    }

    public final void setExtraGameInfo(Map<String, String> map) {
        this.LJFF = map;
    }

    public final void setInstalledText(int i) {
        this.LJIILIIL = i;
    }

    public final void setMDownloadInfo(C3002c c3002c) {
        this.f25815LJ = c3002c;
    }

    public final void setMGetDownloadCountListener(LFU lfu) {
        this.LJIJJ = lfu;
    }

    public final void setMListener(AbstractC2889a abstractC2889a) {
        this.LJIJI = abstractC2889a;
    }

    public final void setPauseText(int i) {
        this.LJIIJJI = i;
    }

    public final void setReadyBg(int i) {
        this.LJIIIZ = i;
    }

    public final void setReadyText(int i) {
        this.LJIIJ = i;
    }

    public final void setUpdateText(int i) {
        this.LJIILLIIL = i;
    }

    public final void setWaitWifiText(int i) {
        this.LJIILL = i;
    }

    public final void setOnDownloadStateChangeListener(AbstractC2889a abstractC2889a) {
        if (PatchProxy.proxy(new Object[]{abstractC2889a}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC2889a);
        this.LJIJI = abstractC2889a;
    }

    public final void setOnGetDownloadCountListener(LFU lfu) {
        if (PatchProxy.proxy(new Object[]{lfu}, this, LIZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(lfu);
        this.LJIJJ = lfu;
    }

    public final void setProgressText(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJIIZILJ = str;
    }

    /* renamed from: com.bytedance.android.live.broadcast.download.DownloadView$1 */
    /* loaded from: classes5.dex */
    public static final class View$OnClickListenerC29971 implements View.OnClickListener {
        public static ChangeQuickRedirect LIZ;
        public final /* synthetic */ Context LIZJ;

        static {
            Covode.recordClassIndex(15505);
        }

        public View$OnClickListenerC29971(Context context) {
            this.LIZJ = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                return;
            }
            C3002c mDownloadInfo = DownloadView.this.getMDownloadInfo();
            if (mDownloadInfo == null || mDownloadInfo.LJJIJL != 6) {
                SettingKey<Integer> settingKey = LiveSettingKeys.LIVE_GAME_PROMOTE_DOWNLOAD_NEED_LOGIN;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Integer value = settingKey.getValue();
                if (value != null && value.intValue() == 1 && !((IUserService) ServiceManager.getService(IUserService.class)).user().LIZLLL()) {
                    DownloadView.this.LIZJ.add(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ(this.LIZJ, C9284h.LIZ().LIZ()).observeOn(AndroidSchedulers.mainThread()).subscribe(new LF1(this), C89252LEo.LIZIZ));
                    return;
                }
            }
            DownloadView.this.LJFF();
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    public void LIZ(int i) {
        double d;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 18).isSupported) {
            return;
        }
        AbstractC2889a abstractC2889a = this.LJIJI;
        if (abstractC2889a != null) {
            abstractC2889a.LIZ(i);
        }
        setText(LK5.LIZ(this.LJIIJJI));
        ProgressBar progressBar = this.LJII;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        SettingKey<C6837at> settingKey = LiveSettingKeys.LIVE_GAME_SECURITY_SIGN_PROGRESS_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (settingKey.getValue().LIZJ == 1) {
            if (i >= 0 && 50 >= i) {
                d = i * 1.5d;
            } else {
                d = (i * 0.5d) + 50.0d;
            }
            i = (int) d;
        }
        ProgressBar progressBar2 = this.LJII;
        if (progressBar2 != null) {
            progressBar2.setProgress(i);
        }
        TextView textView = this.LJI;
        if (textView != null) {
            textView.setBackgroundResource(this.LJIIIIZZ);
        }
    }

    private final void LIZ(boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C440033av c440033av = C440033av.LIZIZ;
        JSONObject jSONObject = new JSONObject();
        C3002c c3002c = this.f25815LJ;
        Double d = null;
        if (c3002c != null) {
            str = c3002c.LJJI;
        } else {
            str = null;
        }
        jSONObject.put("game_name", str);
        C3002c c3002c2 = this.f25815LJ;
        if (c3002c2 != null) {
            str2 = c3002c2.LJIIJ;
        } else {
            str2 = null;
        }
        jSONObject.put("game_id", str2);
        C3002c c3002c3 = this.f25815LJ;
        if (c3002c3 != null) {
            str3 = c3002c3.LJJII;
        } else {
            str3 = null;
        }
        jSONObject.put(PushConstants.WEB_URL, str3);
        C3002c c3002c4 = this.f25815LJ;
        if (c3002c4 != null) {
            str4 = c3002c4.LJJIJIIJI;
        } else {
            str4 = null;
        }
        jSONObject.put("task_group", str4);
        C440033av.LIZ(c440033av, 1020, jSONObject, null, 4, null);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LE7 le7 = new LE7(context, new LEB(this));
        if (z) {
            SettingKey<C6831an> settingKey = LiveSettingKeys.LIVE_GAME_PROMOTE_NO_WIFI_DOWNLOAD_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            String str5 = settingKey.getValue().LIZLLL;
            Object[] objArr = new Object[1];
            C3002c c3002c5 = this.f25815LJ;
            if (c3002c5 != null) {
                d = Double.valueOf(c3002c5.LJJIII);
            }
            objArr[0] = d;
            String format = String.format(str5, Arrays.copyOf(objArr, 1));
            Intrinsics.checkNotNullExpressionValue(format, "");
            SettingKey<C6831an> settingKey2 = LiveSettingKeys.LIVE_GAME_PROMOTE_NO_WIFI_DOWNLOAD_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            String str6 = settingKey2.getValue().f27203LJ;
            SettingKey<C6831an> settingKey3 = LiveSettingKeys.LIVE_GAME_PROMOTE_NO_WIFI_DOWNLOAD_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey3, "");
            String str7 = settingKey3.getValue().LJFF;
            le7.LIZ(format);
            le7.LIZIZ(str6);
            le7.LIZJ(str7);
            C116971W2r.LIZJ(le7);
            return;
        }
        C116971W2r.LIZJ(le7);
    }

    @Override // com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    public void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 19).isSupported) {
            return;
        }
        AbstractC2889a abstractC2889a = this.LJIJI;
        if (abstractC2889a != null) {
            abstractC2889a.LIZIZ(i);
        }
        if (i != 1013 && i != 1049) {
            if (i == 1006) {
                final Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C116971W2r.LIZJ(new Dialog(context) { // from class: X.2iD
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(15600);
                    }

                    @Override // android.app.Dialog
                    public final void onStart() {
                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
                            return;
                        }
                        super.onStart();
                        C420712kr.LIZ().LIZIZ();
                    }

                    @Override // android.app.Dialog
                    public final void onStop() {
                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
                            return;
                        }
                        super.onStop();
                        C420712kr.LIZ().LIZJ();
                    }

                    @Override // android.app.Dialog
                    public final void show() {
                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
                            return;
                        }
                        WindowManager.LayoutParams layoutParams = null;
                        if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 5).isSupported) {
                            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 4).isSupported) {
                                super.show();
                            }
                            C596569go.LIZ(this, null);
                        }
                        Window window = getWindow();
                        if (window != null && (layoutParams = window.getAttributes()) != null) {
                            layoutParams.width = LK5.LIZ(280.0f);
                        }
                        Window window2 = getWindow();
                        if (window2 != null) {
                            window2.setAttributes(layoutParams);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(context, 2131494964);
                        C106862S5w.LIZ(context);
                    }

                    @Override // android.app.Dialog
                    public final void onCreate(Bundle bundle) {
                        MethodCollector.m14708i(1241);
                        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 1).isSupported) {
                            MethodCollector.m14707o(1241);
                            return;
                        }
                        super.onCreate(bundle);
                        setContentView(LayoutInflater.from(getContext()).inflate(2131698662, (ViewGroup) null));
                        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
                            ((TextView) findViewById(2131172143)).setOnClickListener(new View.OnClickListener() { // from class: X.2iE
                                public static ChangeQuickRedirect LIZ;

                                static {
                                    Covode.recordClassIndex(15601);
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                                        return;
                                    }
                                    C116971W2r.LIZ(DialogC419072iD.this);
                                }
                            });
                        }
                        MethodCollector.m14707o(1241);
                    }
                });
            }
            setText(LK5.LIZ(this.LJIILJJIL));
            ProgressBar progressBar = this.LJII;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextView textView = this.LJI;
            if (textView != null) {
                textView.setBackgroundResource(this.LJIIIZ);
                return;
            }
            return;
        }
        setText(LK5.LIZ(this.LJIILL));
        ProgressBar progressBar2 = this.LJII;
        if (progressBar2 != null) {
            progressBar2.setVisibility(0);
        }
        TextView textView2 = this.LJI;
        if (textView2 != null) {
            textView2.setBackgroundResource(this.LJIIIIZZ);
        }
    }

    public final void setText(String str) {
        String str2;
        C3002c c3002c;
        String m25086C;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 14).isSupported) {
            return;
        }
        if (Intrinsics.areEqual(str, LK5.LIZ(this.LJIIJ))) {
            Map<String, String> map = this.LJFF;
            if (map != null) {
                str2 = map.get("show_package_size");
            } else {
                str2 = null;
            }
            if (Intrinsics.areEqual(str2, "true") && (c3002c = this.f25815LJ) != null) {
                double d = c3002c.LJJIII;
                if (d > 0.0d) {
                    TextView textView = this.LJI;
                    if (textView != null) {
                        new StringBuilder();
                        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Double.valueOf(d)}, this, LIZ, false, 15);
                        if (proxy.isSupported) {
                            m25086C = (String) proxy.result;
                        } else {
                            DecimalFormat decimalFormat = new DecimalFormat("0.00");
                            if (d > 1024.0d) {
                                new StringBuilder();
                                m25086C = C0002O.m25086C(decimalFormat.format(d / 1024.0d), "GB");
                            } else {
                                new StringBuilder();
                                m25086C = C0002O.m25086C(decimalFormat.format(d), "MB");
                            }
                        }
                        textView.setText(C0002O.m25085C(str, " | ", m25086C));
                        return;
                    }
                    return;
                }
            }
        }
        TextView textView2 = this.LJI;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void LIZIZ(boolean r13) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.download.DownloadView.LIZIZ(boolean):void");
    }

    @Override // com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    public void LIZ(C89121L9n c89121L9n) {
        String str;
        C2888a c2888a;
        Set<String> set;
        if (PatchProxy.proxy(new Object[]{c89121L9n}, this, LIZ, false, 17).isSupported) {
            return;
        }
        C106862S5w.LIZ(c89121L9n);
        NetworkUtils.NetworkType LIZJ = NetworkUtils.LIZJ(getContext(), LJJI);
        Intrinsics.checkNotNullExpressionValue(LIZJ, "");
        this.LIZLLL = LIZJ;
        AbstractC2889a abstractC2889a = this.LJIJI;
        if (abstractC2889a != null) {
            abstractC2889a.LIZ(c89121L9n);
        }
        C3002c c3002c = this.f25815LJ;
        if (c3002c != null && (str = c3002c.LJIIJ) != null && str.length() > 0 && (c2888a = this.LJIJJLI) != null && (set = c2888a.LJFF) != null && !set.contains(str)) {
            this.LJIJJLI.LJFF.add(str);
        }
        int i = c89121L9n.LIZIZ;
        SettingKey<C6837at> settingKey = LiveSettingKeys.LIVE_GAME_SECURITY_SIGN_PROGRESS_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (settingKey.getValue().LIZJ == 1) {
            i = c89121L9n.LIZLLL;
        }
        String format = String.format(this.LJIIZILJ, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "");
        setText(format);
        ProgressBar progressBar = this.LJII;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        ProgressBar progressBar2 = this.LJII;
        if (progressBar2 != null) {
            progressBar2.setProgress(i);
        }
        TextView textView = this.LJI;
        if (textView != null) {
            textView.setBackgroundResource(this.LJIIIIZZ);
        }
    }

    public final void LIZ(Context context, C3002c c3002c) {
        if (PatchProxy.proxy(new Object[]{context, c3002c}, this, LIZ, false, 10).isSupported) {
            return;
        }
        LE4.LIZIZ.LIZIZ(context, c3002c);
        C87010KQi.LIZ().LIZ(new C2998a(c3002c));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(java.lang.String r39, java.lang.Long r40) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.download.DownloadView.LIZ(java.lang.String, java.lang.Long):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1237);
        this.LJIIIIZZ = 2130858031;
        this.LJIIIZ = 2130855107;
        this.LJIIJ = 2131587249;
        this.LJIIJJI = 2131587248;
        this.LJIIL = 2131587246;
        this.LJIILIIL = 2131587247;
        this.LJIILJJIL = 2131587245;
        this.LJIILL = 2131587251;
        this.LJIILLIIL = 2131587250;
        this.LJIIZILJ = "%s%%";
        this.LIZJ = new CompositeDisposable();
        C13491f LIZ2 = IQV.LIZ(C2888a.class);
        this.LJIJJLI = (C2888a) (!(LIZ2 instanceof C2888a) ? null : LIZ2);
        this.LJIL = new LiveNetworkBroadcastReceiver();
        this.LIZLLL = NetworkUtils.NetworkType.NONE;
        this.LJJ = new LEZ(this, context);
        View.inflate(context, getLayoutId(), this);
        this.LJI = (TextView) findViewById(2131193964);
        this.LJII = (ProgressBar) findViewById(2131184983);
        this.LJIJ = C89235LDx.LIZIZ.LIZ();
        this.LJIL.LIZ(getContext(), LJJI);
        this.LJIL.LIZ(this.LJJ, LJJI);
        setOnClickListener(new View$OnClickListenerC29971(context));
        MethodCollector.m14707o(1237);
    }

    public /* synthetic */ DownloadView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
