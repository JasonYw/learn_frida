package com.bytedance.android.live.browser.jsbridge.p310g;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import com.bytedance.ies.web.jsbridge2.C13052h;
import com.google.gson.annotations.SerializedName;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.disposables.Disposable;
import java.io.File;
import org.json.JSONObject;
import p003X.C116971W2r;
import p003X.C134529bwK;
import p003X.C440943cO;
import p003X.C88457KtH;
import p003X.C88459KtJ;
import p003X.C88460KtK;
import p003X.C91211Lwb;
import p003X.LK5;
import p003X.S5C;

/* renamed from: com.bytedance.android.live.browser.jsbridge.g.s */
/* loaded from: classes5.dex */
public final class C3987s extends AbstractC13049f<JSONObject, C3988a> {
    public static ChangeQuickRedirect LIZ;
    public Disposable LIZIZ;
    public Fragment LIZJ;
    public ProgressDialog LIZLLL;

    /* renamed from: LJ */
    public C13052h f26148LJ;
    public TokenCert LJFF = TokenCert.with("bpea-live_uploadVideo_jsb_upload_video_method");

    static {
        Covode.recordClassIndex(22396);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        ProgressDialog progressDialog = this.LIZLLL;
        if (progressDialog != null) {
            C116971W2r.LIZ(progressDialog);
            this.LIZLLL = null;
        }
        finishWithFailure();
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public final void onTerminate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        Disposable disposable = this.LIZIZ;
        if (disposable != null) {
            disposable.dispose();
        }
        this.LIZJ = null;
        this.f26148LJ = null;
    }

    public C3987s(Fragment fragment) {
        this.LIZJ = fragment;
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public final /* synthetic */ void invoke(JSONObject jSONObject, C13052h c13052h) {
        JSONObject jSONObject2 = jSONObject;
        if (!PatchProxy.proxy(new Object[]{jSONObject2, c13052h}, this, LIZ, false, 1).isSupported) {
            this.f26148LJ = c13052h;
            int optInt = jSONObject2.optInt("action_type", 0);
            String optString = jSONObject2.optString("token", "");
            if (optString != null && !optString.isEmpty()) {
                this.LJFF = TokenCert.with(optString);
            }
            if (optInt == 0) {
                C134529bwK.LIZ((Activity) c13052h.LIZIZ).LIZ(new C88459KtJ(this, jSONObject2, c13052h), this.LJFF, "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE");
            } else if (optInt == 1) {
                C134529bwK.LIZ((Activity) c13052h.LIZIZ).LIZ(new C88460KtK(this, c13052h), this.LJFF, "android.permission.READ_EXTERNAL_STORAGE");
            }
        }
    }

    /* renamed from: com.bytedance.android.live.browser.jsbridge.g.s$a */
    /* loaded from: classes5.dex */
    public static final class C3988a {
        @SerializedName(C2521l.LJIIJ)
        public int LIZ;
        @SerializedName("uri")
        public String LIZIZ;
        @SerializedName(PushConstants.WEB_URL)
        public String LIZJ;

        static {
            Covode.recordClassIndex(22401);
        }

        public C3988a(int i, String str, String str2) {
            this.LIZ = i;
            this.LIZIZ = str;
            this.LIZJ = str2;
        }

        public /* synthetic */ C3988a(int i, String str, String str2, byte b) {
            this(1, str, str2);
        }
    }

    public final void LIZ(int i, int i2, Intent intent) {
        String path;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, LIZ, false, 3).isSupported) {
            return;
        }
        if (9001 == i || 9002 == i) {
            if (-1 == i2) {
                if (intent != null && intent.getData() != null) {
                    Fragment fragment = this.LIZJ;
                    if (fragment == null) {
                        return;
                    }
                    FragmentActivity activity = fragment.getActivity();
                    if (activity == null) {
                        LIZ();
                        return;
                    }
                    Uri data = intent.getData();
                    if (TextUtils.equals("content", data.getScheme())) {
                        path = S5C.LIZ(this.LIZJ.getActivity(), data);
                    } else {
                        path = intent.getData().getPath();
                    }
                    if (TextUtils.isEmpty(path)) {
                        JSONObject jSONObject = new JSONObject();
                        C440943cO.LIZ(jSONObject, "error_msg", "file name is empty");
                        C91211Lwb.LIZ("ttlive_upload_video_error", 3, jSONObject);
                        LIZ();
                        return;
                    }
                    File file = new File(path);
                    if (!file.exists()) {
                        JSONObject jSONObject2 = new JSONObject();
                        C440943cO.LIZ(jSONObject2, "error_msg", "file not exist");
                        C91211Lwb.LIZ("ttlive_upload_video_error", 5, jSONObject2);
                        LIZ();
                        return;
                    }
                    this.LIZLLL = ProgressDialog.show(activity, LK5.LIZ(2131588470), LK5.LIZ(2131588469), true, false);
                    if (!file.exists()) {
                        JSONObject jSONObject3 = new JSONObject();
                        C440943cO.LIZ(jSONObject3, "error_msg", "file not exist");
                        C91211Lwb.LIZ("ttlive_upload_video_error", 7, jSONObject3);
                        LIZ();
                        return;
                    }
                    C134529bwK.LIZ(this.LIZJ.getActivity()).LIZ(new C88457KtH(this, file), this.LJFF, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
                    return;
                }
            } else if (-1 != i2) {
                JSONObject jSONObject4 = new JSONObject();
                C440943cO.LIZ(jSONObject4, "error_msg", "resultCode error: " + i2);
                C91211Lwb.LIZ("ttlive_upload_video_error", 1, jSONObject4);
            }
            LIZ();
        }
    }
}
