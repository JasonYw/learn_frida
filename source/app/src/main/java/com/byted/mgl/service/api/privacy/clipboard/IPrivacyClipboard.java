package com.byted.mgl.service.api.privacy.clipboard;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.bytedance.covode.number.Covode;

/* loaded from: classes15.dex */
public interface IPrivacyClipboard {
    static {
        Covode.recordClassIndex(9800);
    }

    ClipData getPrimaryClip(ClipboardManager clipboardManager, String str);

    void setPrimaryClip(ClipboardManager clipboardManager, ClipData clipData, String str);
}
