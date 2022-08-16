package com.android.ttcjpaysdk.bindcard.base.bean;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayProtocolGroupContentsBean;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class CJPayBusiAuthorizeInfo implements CJPayObject, Serializable {
    public boolean is_authed;
    public boolean is_conflict;
    public boolean is_need_authorize;
    public String conflict_action_url = "";
    public CJPayAuthInfo busi_auth_info = new CJPayAuthInfo();
    public CJPayBusiAuthorizeContent busi_authorize_content = new CJPayBusiAuthorizeContent();
    public CJPayProtocolGroupContentsBean protocol_group_contents = new CJPayProtocolGroupContentsBean();
    public String uidMobileMask = "";
    public int needIdentify = 1;
    public int hasPass = 0;
    public int showOneStep = 1;
    public int isOneStep = 0;
    public String authType = "";

    static {
        Covode.recordClassIndex(7021);
    }
}
