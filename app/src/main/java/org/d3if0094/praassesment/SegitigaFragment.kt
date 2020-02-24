package org.d3if0094.praassesment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*
import kotlinx.android.synthetic.main.fragment_segitiga.*
import org.d3if0094.praassesment.databinding.FragmentPersegiPanjangBinding
import org.d3if0094.praassesment.databinding.FragmentSegitigaBinding


class SegitigaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentSegitigaBinding>(
            inflater,R.layout.fragment_segitiga,container,false)

        binding.buttonHitungSeg.setOnClickListener{
            var alasSeg = editAlasSeg.text.toString().toInt()
            var tinggiSeg = editTinggiSeg.text.toString().toInt()
            var luasSeg = (alasSeg*tinggiSeg)*0.5
            var kelSeg = (tinggiSeg*tinggiSeg)-(alasSeg*alasSeg)+alasSeg+tinggiSeg
            textViewLuasSeg.text = luasSeg.toString()
            textViewKelSeg.text = kelSeg.toString()
        }
        return binding.root
        }


}
