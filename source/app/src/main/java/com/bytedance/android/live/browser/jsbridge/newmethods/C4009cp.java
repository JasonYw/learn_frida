package com.bytedance.android.live.browser.jsbridge.newmethods;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.business.IHostOCRApiProxy;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import com.bytedance.ies.web.jsbridge2.C13052h;
import com.google.gson.annotations.SerializedName;
import com.p1594ss.ttm.player.MediaPlayer;
import java.io.File;
import org.json.JSONObject;
import p003X.C88582KvI;
import p003X.C88899L0z;

/* renamed from: com.bytedance.android.live.browser.jsbridge.newmethods.cp */
/* loaded from: classes5.dex */
public final class C4009cp extends AbstractC13049f<C4010a, JSONObject> {
    public static ChangeQuickRedirect LIZ;
    public Fragment LIZIZ;
    public IHostOCRApiProxy LIZJ;
    public C4010a LIZLLL;

    /* renamed from: LJ */
    public TokenCert f26156LJ = TokenCert.with("bpea-live_ocrTakePhoto_jsb_ocr_take_photo_method");

    /* renamed from: com.bytedance.android.live.browser.jsbridge.newmethods.cp$a */
    /* loaded from: classes5.dex */
    public static final class C4010a {
        @SerializedName("action_type")
        public int LIZ;
        @SerializedName("type")
        public String LIZIZ;
        @SerializedName("max_side")
        public int LIZJ;
        @SerializedName("compress")
        public int LIZLLL;
        @SerializedName("token")

        /* renamed from: LJ */
        public String f26157LJ;

        static {
            Covode.recordClassIndex(22752);
        }
    }

    static {
        Covode.recordClassIndex(22751);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public final void onTerminate() {
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LIZIZ = null;
    }

    public C4009cp(Fragment fragment) {
        this.LIZIZ = fragment;
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public final /* synthetic */ void invoke(C4010a c4010a, C13052h c13052h) {
        C4010a c4010a2 = c4010a;
        if (!PatchProxy.proxy(new Object[]{c4010a2, c13052h}, this, LIZ, false, 1).isSupported) {
            this.LIZJ = (IHostOCRApiProxy) ServiceManager.getService(IHostOCRApiProxy.class);
            if (this.LIZJ == null) {
                finishWithResult(C88899L0z.LIZ(-1000, "ocr service proxy is unavaliable"));
                return;
            }
            this.LIZLLL = c4010a2;
            FragmentActivity activity = this.LIZIZ.getActivity();
            int i = c4010a2.LIZ;
            if (i != 0) {
                if (i != 1) {
                    finishWithResult(C88899L0z.LIZ(-1000, "input param error"));
                    return;
                }
                if (this.LIZLLL.f26157LJ != null && !this.LIZLLL.f26157LJ.isEmpty()) {
                    this.f26156LJ = TokenCert.with(this.LIZLLL.f26157LJ);
                }
                C88582KvI.LIZ(activity, this.LIZIZ, 512, this.f26156LJ);
                return;
            }
            Intent takeOCRPhotoIntent = this.LIZJ.getTakeOCRPhotoIntent(activity, c4010a2.LIZIZ);
            if (takeOCRPhotoIntent == null) {
                finishWithResult(C88899L0z.LIZ(-1000, "ocr plugin not ready"));
            }
            this.LIZIZ.startActivityForResult(takeOCRPhotoIntent, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME);
        }
    }

    public final void LIZ(int i, int i2, Intent intent) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, LIZ, false, 2).isSupported) {
            return;
        }
        IHostOCRApiProxy iHostOCRApiProxy = this.LIZJ;
        if (iHostOCRApiProxy != null && this.LIZLLL != null) {
            if (i == 511) {
                if (i2 == -1) {
                    finishWithResult(iHostOCRApiProxy.convertOCRData(this.LIZIZ.getContext(), 0, this.LIZLLL.LIZIZ, this.LIZLLL.LIZJ, this.LIZLLL.LIZLLL));
                    return;
                } else {
                    finishWithResult(C88899L0z.LIZ(1, ""));
                    return;
                }
            } else if (i == 512) {
                if (i2 == -1 && intent != null && intent.getData() != null) {
                    FragmentActivity activity = this.LIZIZ.getActivity();
                    if (activity == null) {
                        finishWithResult(C88899L0z.LIZ(-1000, "ocr service proxy is unavaliable"));
                        return;
                    }
                    Uri data = intent.getData();
                    String LIZ2 = C88582KvI.LIZ(activity, data);
                    if (StringUtils.isEmpty(LIZ2)) {
                        UIUtils.displayToastWithIcon(activity, 2130855561, 2131586875);
                        finishWithResult(C88899L0z.LIZ(-1000, "ocr service proxy is unavaliable"));
                        return;
                    } else if (!new File(LIZ2).exists()) {
                        UIUtils.displayToastWithIcon(activity, 2130855561, 2131586875);
                        finishWithResult(C88899L0z.LIZ(-1000, "ocr service proxy is unavaliable"));
                        return;
                    } else {
                        if ("file".equals(data.getScheme())) {
                            data = C88582KvI.LIZ(activity, LIZ2);
                        }
                        this.LIZJ.keepUriPhoto(this.LIZIZ.getContext(), this.LIZLLL.LIZIZ, data);
                        finishWithResult(this.LIZJ.convertOCRData(this.LIZIZ.getContext(), 0, this.LIZLLL.LIZIZ, this.LIZLLL.LIZJ, this.LIZLLL.LIZLLL));
                        return;
                    }
                }
                finishWithResult(C88899L0z.LIZ(1, "action canceled"));
                return;
            } else {
                return;
            }
        }
        finishWithResult(C88899L0z.LIZ(-1000, "ocr service proxy is unavaliable"));
    }
}
