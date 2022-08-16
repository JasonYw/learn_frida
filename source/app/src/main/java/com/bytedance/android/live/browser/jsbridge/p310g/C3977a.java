package com.bytedance.android.live.browser.jsbridge.p310g;

import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.browser.api.UploadApi;
import com.bytedance.android.live.browser.jsbridge.base.C3900bz;
import com.bytedance.android.live.browser.jsbridge.base.CropAndUploadEmojiResultModel;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.room.c$b;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.audio.AbstractC9495c;
import com.bytedance.android.livesdkapi.depend.model.live.audio.ThemeShowArea;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.C13052h;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC81969ISl;
import p003X.AbstractC88535KuX;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C3VF;
import p003X.C88306Kqq;
import p003X.C88528KuQ;
import p003X.C88529KuR;

/* renamed from: com.bytedance.android.live.browser.jsbridge.g.a */
/* loaded from: classes5.dex */
public final class C3977a extends AbstractC88535KuX<C3900bz, CropAndUploadEmojiResultModel> implements c$b {
    public static ChangeQuickRedirect LIZ;
    public AbstractC81969ISl LIZIZ;
    public String LIZJ = "";
    public final long LIZLLL;

    /* renamed from: LJ */
    public final Fragment f26142LJ;

    static {
        Covode.recordClassIndex(22351);
    }

    @Override // com.bytedance.android.live.room.c$b
    public final void LIZ(String str, String str2, ThemeShowArea themeShowArea, AbstractC9495c abstractC9495c, int i) {
        if (PatchProxy.proxy(new Object[]{str, str2, themeShowArea, abstractC9495c, Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
    }

    @Override // com.bytedance.android.live.room.c$b
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        LIZ();
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        CropAndUploadEmojiResultModel cropAndUploadEmojiResultModel = new CropAndUploadEmojiResultModel();
        cropAndUploadEmojiResultModel.LIZ = CropAndUploadEmojiResultModel.Code.Success;
        cropAndUploadEmojiResultModel.LIZIZ = 0;
        finishWithResult(cropAndUploadEmojiResultModel);
    }

    public C3977a(Fragment fragment) {
        long j;
        C3VF user;
        C106862S5w.LIZ(fragment);
        this.f26142LJ = fragment;
        IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
        if (iUserService != null && (user = iUserService.user()) != null) {
            j = user.LIZIZ();
        } else {
            j = 0;
        }
        this.LIZLLL = j;
    }

    @Override // com.bytedance.android.live.room.c$b
    public final void LIZ(String str, int i) {
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        File file = new File(str);
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("file", new TypedFile("multipart/form-data", file));
        long uptimeMillis = SystemClock.uptimeMillis();
        int length = (int) (file.length() / 1024);
        ((UploadApi) C88306Kqq.LIZ().LIZ(UploadApi.class)).uploadSubscribeCustomEmoji(i, multipartTypedOutput).compose(C100839PnV.LIZJ()).subscribe(new C88528KuQ(this, uptimeMillis, length, i), new C88529KuR<>(this, length, file));
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public final /* synthetic */ void invoke(Object obj, C13052h c13052h) {
        C3900bz c3900bz = (C3900bz) obj;
        if (!PatchProxy.proxy(new Object[]{c3900bz, c13052h}, this, LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(c3900bz, c13052h);
            SettingKey<Integer> settingKey = LiveConfigSettingKeys.LIVE_UPLOAD_EMOJI_PICKED_MIN_WIDTH;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Integer value = settingKey.getValue();
            SettingKey<Integer> settingKey2 = LiveConfigSettingKeys.LIVE_UPLOAD_EMOJI_PICKED_MIN_HEIGHT;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            Integer value2 = settingKey2.getValue();
            Fragment fragment = this.f26142LJ;
            Intrinsics.checkNotNullExpressionValue(value, "");
            int intValue = value.intValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            this.LIZIZ = ((ILiveSDKService) ServiceManager.getService(ILiveSDKService.class)).createImagePicker(null, fragment, "upload_custom_emoji", intValue, value2.intValue(), value.intValue(), value2.intValue(), this, null, null);
            AbstractC81969ISl abstractC81969ISl = this.LIZIZ;
            if (abstractC81969ISl != null) {
                abstractC81969ISl.LIZ(c3900bz.LIZ);
            }
            String str = c3900bz.LIZ;
            if (str == null) {
                str = "";
            }
            this.LIZJ = str;
        }
    }
}
