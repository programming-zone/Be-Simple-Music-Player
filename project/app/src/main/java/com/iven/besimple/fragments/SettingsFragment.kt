package com.iven.besimple.fragments

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.iven.besimple.R
import com.iven.besimple.databinding.FragmentSettingsBinding
import com.iven.besimple.ui.UIControlInterface

/**
 * A simple [Fragment] subclass.
 * Use the [SettingsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SettingsFragment : Fragment(R.layout.fragment_settings) {

    private lateinit var mSettingsFragmentBinding: FragmentSettingsBinding
    private lateinit var mUIControlInterface: UIControlInterface

    override fun onAttach(context: Context) {
        super.onAttach(context)
        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
            mUIControlInterface = activity as UIControlInterface
        } catch (e: ClassCastException) {
            e.printStackTrace()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mSettingsFragmentBinding = FragmentSettingsBinding.bind(view)

        mSettingsFragmentBinding.searchToolbar.setNavigationOnClickListener {
            mUIControlInterface.onCloseActivity()
        }

        childFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_layout, PreferencesFragment.newInstance())
            commit()
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment SettingsFragment.
         */
        @JvmStatic
        fun newInstance() = SettingsFragment()
    }
}
