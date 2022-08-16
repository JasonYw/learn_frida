package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.utils;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes22.dex */
public final class FixedForAppBarLayoutManager extends LinearLayoutManager {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(26004);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final int findLastCompletelyVisibleItemPosition() {
        int i;
        View childAt;
        boolean z;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int childCount = getChildCount() - 1;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{Integer.valueOf(childCount), -1, (byte) 1}, this, LIZ, false, 2);
        if (proxy2.isSupported) {
            childAt = (View) proxy2.result;
        } else {
            if (-1 > childCount) {
                i = 1;
            } else {
                i = -1;
            }
            while (childCount != -1) {
                childAt = getChildAt(childCount);
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{childAt, (byte) 1}, this, LIZ, false, 3);
                if (proxy3.isSupported) {
                    z = ((Boolean) proxy3.result).booleanValue();
                } else {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    Rect rect = new Rect();
                    childAt.getGlobalVisibleRect(rect);
                    if (rect.bottom - rect.top == childAt.getHeight()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Rect rect2 = new Rect();
                    ((View) childAt.getParent()).getGlobalVisibleRect(rect2);
                    if (getOrientation() == 0) {
                        int i2 = iArr[0];
                        int width = iArr[0] + childAt.getWidth();
                        if (i2 >= rect2.left && width <= rect2.right) {
                        }
                        childCount += i;
                    } else {
                        int i3 = iArr[1];
                        int i4 = iArr[1];
                        childAt.getHeight();
                    }
                }
                if (!z) {
                    childCount += i;
                }
            }
            return -1;
        }
        if (childAt != null) {
            return getPosition(childAt);
        }
        return -1;
    }

    public FixedForAppBarLayoutManager(Context context) {
        super(context);
    }
}
