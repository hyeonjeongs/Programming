package com.example.navis

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navis.R

class LikeFragment : Fragment() {

    companion object{
        fun newInstance() : LikeFragment{
            return LikeFragment()
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? { //like_fragment xml파일이랑 연결
        val view = inflater.inflate(R.layout.fragment_like,container, false)
        return view
    }

}