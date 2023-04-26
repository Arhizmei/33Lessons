package com.zmei.a33lessons

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.zmei.a33lessons.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
private val dataModel:DataModel by activityViewModels()
    lateinit var binding: FragmentBlankBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        dataModel.messageForFrag1.observe(activity as LifecycleOwner,{
            binding.textFrag1.text = it })
        binding.buttonSendMessageFrag1.setOnClickListener {
            dataModel.messageForFrag2.value = "Hello from fragment 1"
        }
        binding.buttonMessageActivity1.setOnClickListener {
            dataModel.messageForActivity.value = "Hello activity from fragment 1"
        }
    }
    companion object {

        @JvmStatic
        fun newInstance() = BlankFragment()


    }
}