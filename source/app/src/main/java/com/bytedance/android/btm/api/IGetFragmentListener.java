package com.bytedance.android.btm.api;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.covode.number.Covode;

/* loaded from: classes18.dex */
public interface IGetFragmentListener {
    static {
        Covode.recordClassIndex(11287);
    }

    Fragment getFragment(FragmentManager fragmentManager, int i);
}
