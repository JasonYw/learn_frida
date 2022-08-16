package com.bytedance.android.live.browser.jsbridge.event;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes12.dex */
public class RoomBannerBarEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String backgroundColor;
    public String color;
    public int fontSize = 9;
    public String title;
    public int visible;

    static {
        Covode.recordClassIndex(22278);
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public String getColor() {
        return this.color;
    }

    public int getFontSize() {
        return this.fontSize;
    }

    public String getTitle() {
        return this.title;
    }

    public int getVisible() {
        return this.visible;
    }

    public boolean isVisible() {
        if (this.visible == 1) {
            return true;
        }
        return false;
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "RoomBannerBarEvent{title='" + this.title + "', visible=" + this.visible + ", backgroundColor='" + this.backgroundColor + "', fontSize=" + this.fontSize + ", color='" + this.color + "'}";
    }

    public void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public void setFontSize(int i) {
        this.fontSize = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setVisible(int i) {
        this.visible = i;
    }
}
