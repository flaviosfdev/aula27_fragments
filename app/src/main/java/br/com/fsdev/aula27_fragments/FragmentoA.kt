package br.com.fsdev.aula27_fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import java.lang.RuntimeException

class FragmentoA : Fragment() {

    private lateinit var edtNome: EditText
    private lateinit var edtCargo: EditText
    private lateinit var edtEmail: EditText
    private lateinit var edtTelefone: EditText
    private lateinit var btnCadastrar: Button
    private lateinit var dados: ArrayList<String>

    private var listener: FragmentoA.IFragmentAListener? = null

    interface IFragmentAListener {
        fun enviarDadosA(dados: ArrayList<String>)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is IFragmentAListener) {
            listener = context
        } else {
            throw RuntimeException("Lascou-se no A")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_fragmento_a, container, false)

        edtNome = view.findViewById(R.id.edt_nome_frag_a)
        edtCargo = view.findViewById(R.id.edt_cargo_frag_a)
        edtEmail = view.findViewById(R.id.edt_email_frag_a)
        edtTelefone = view.findViewById(R.id.edt_telefone_frag_a)
        btnCadastrar = view.findViewById(R.id.btn_cadastrar_frag_a)

        dados = arrayListOf(
            edtNome.text.toString(),
            edtCargo.text.toString(),
            edtEmail.text.toString(),
            edtTelefone.text.toString()
        )

        btnCadastrar.setOnClickListener {
            //listener?.enviarDados(dados)
        }

        return view
    }


    override fun onDetach() {
        super.onDetach()
        listener = null
    }
}