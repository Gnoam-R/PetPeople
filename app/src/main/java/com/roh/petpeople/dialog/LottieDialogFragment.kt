package com.roh.petpeople.dialog

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import com.roh.petpeople.R

class LottieDialogFragment : DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // remove dialog title
        dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
        // dialog 배경 투명화
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        isCancelable = false
        return inflater.inflate(R.layout.fragment_lottie_dialog, container, false)
    }

    companion object {
        fun newInstance(
        ): LottieDialogFragment {
            return LottieDialogFragment()
        }
    }

    override fun show(manager: FragmentManager, tag: String?) {
        val ft = manager.beginTransaction()
        ft.add(this, tag)
        ft.commitAllowingStateLoss()
    }
}