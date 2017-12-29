package kr.hs.emirim.bbong0722.librarim;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;

/**
 * Created by Yoosieun on 2017-11-09.
 */

public class Settingsfragment extends PreferenceFragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings_screen);
    }
}
