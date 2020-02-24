package org.d3if0094.praassesment


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import org.d3if0094.praassesment.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentMenuBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_menu,container,false)
        binding.buttonPersegiPanj.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_menuFragment_to_persegiPanjangFragment)
        )
        binding.buttonSegitiga.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_menuFragment_to_segitigaFragment)
        )
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,
            view!!.findNavController())
                || super.onOptionsItemSelected(item)
    }
}
