package br.com.fsdev.aula27_fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), FragmentoA.IFragmentAListener,
    FragmentoB.IFragmentBListener {

    private lateinit var fragmentoA: FragmentoA
    private lateinit var fragmentoB: FragmentoB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentoA = FragmentoA()
        fragmentoB = FragmentoB()

        supportFragmentManager.beginTransaction()
            .add(R.id.container_a, fragmentoA)
            .add(R.id.container_b, fragmentoB)
            .commit()

    }



    override fun enviarDadosA(dados: ArrayList<String>) {
    }

    override fun enviarDadosB(dados: ArrayList<String>) {
    }

}