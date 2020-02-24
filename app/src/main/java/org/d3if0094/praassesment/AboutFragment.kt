package org.d3if0094.praassesment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.d3if0094.praassesment.databinding.FragmentAboutBinding
import org.d3if0094.praassesment.databinding.FragmentPersegiPanjangBinding


class AboutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentAboutBinding>(
            inflater,R.layout.fragment_about,container,false)
        return binding.root
    }
}
