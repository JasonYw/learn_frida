package com.bytedance.android.annie.api.bridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public final class ShareInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String description;
    public String image;
    public String title;
    public String url;

    static {
        Covode.recordClassIndex(10456);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public ShareInfo() {
        this.title = "";
        this.url = "";
        this.description = "";
        this.image = "";
    }

    public final void setDescription(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.description = str;
    }

    public final void setImage(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.image = str;
    }

    public final void setTitle(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.title = str;
    }

    public final void setUrl(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.url = str;
    }

    public ShareInfo(String str, String str2, String str3, String str4) {
        C106862S5w.LIZ(str, str2, str3, str4);
        this.title = "";
        this.url = "";
        this.description = "";
        this.image = "";
        this.title = str;
        this.description = str2;
        this.image = str3;
        this.url = str4;
    }
}
