package com.zmei.a33lessons

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.zmei.a33lessons.databinding.FragmentBlank2Binding

class BlankFragment2 : Fragment() {

    private val dataModel:DataModel by activityViewModels()
    lateinit var binding: FragmentBlank2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlank2Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        dataModel.messageForFrag2.observe(activity as LifecycleOwner,{
            binding.tvMessage2.text = it
        })
        binding.buttonSendMessageFrag2.setOnClickListener {
            dataModel.messageForFrag1.value = "Hello from fragment 2"
        }
        binding.buttonMessageActivity2.setOnClickListener {
            dataModel.messageForActivity.value = "Hello activity from fragment 2"
        }
    }
    companion object {

        @JvmStatic
        fun newInstance() = BlankFragment2()
    }
}