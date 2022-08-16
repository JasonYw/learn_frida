package com.android.ttcjpaysdk.integrated.counter.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class AccountInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String account;
    public String account_name;
    public String account_type;

    static {
        Covode.recordClassIndex(7559);
    }
}
