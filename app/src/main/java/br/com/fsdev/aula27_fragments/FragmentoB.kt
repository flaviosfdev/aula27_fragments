package br.com.fsdev.aula27_fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.lang.RuntimeException

class FragmentoB : Fragment() {

    private var listener: FragmentoB.IFragmentBListener? = null

    interface IFragmentBListener {
        fun enviarDadosB(dados: ArrayList<String>)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is FragmentoB.IFragmentBListener) {
            listener = context
        } else {
            throw RuntimeException("Lascou-se no B")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmento_b, container, false)
    }

    fun atualizaB() {

    }


    override fun onDetach() {
        super.onDetach()
        listener = null
    }

}