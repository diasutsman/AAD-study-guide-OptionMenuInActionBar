package com.example.optionmenuinactionbar.ui.settings

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.example.optionmenuinactionbar.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}