package org.d3if0094.praassesment


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*
import org.d3if0094.praassesment.databinding.FragmentPersegiPanjangBinding
import org.w3c.dom.Text


class PersegiPanjangFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentPersegiPanjangBinding>(
            inflater,R.layout.fragment_persegi_panjang,container,false)


        binding.buttonHitungPers.setOnClickListener {
            var panPers = editPanjPers.text.toString().toInt()
            var lebarPers = editLebarPers.text.toString().toInt()
            var luasPerPanj = panPers*lebarPers
            var kelPerPanj = (panPers+lebarPers)*2
            textViewLuasPers.text = luasPerPanj.toString()
            textViewKelPers.text = kelPerPanj.toString()
        }

        binding.buttonShare.setOnClickListener{

        }
        return binding.root
    }
}
